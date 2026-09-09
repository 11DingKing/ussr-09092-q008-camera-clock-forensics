package example.rail;

import java.time.OffsetDateTime;

public record MediaStamp(String digest, OffsetDateTime deviceTime, String zoneDeclaration) {}
