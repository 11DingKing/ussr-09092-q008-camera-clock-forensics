package example.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

class MediaStampTest {
    @Test void keepsZoneDeclaration() {
        var stamp = new MediaStamp("demo", OffsetDateTime.parse("2026-09-06T22:34:00+08:00"), "相机声明");
        assertEquals("相机声明", stamp.zoneDeclaration());
    }
}
