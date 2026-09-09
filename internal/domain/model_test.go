package domain
import "testing"
func TestOffsetIsRetained(t *testing.T) {
    if CorrectedSeconds(Reading{OffsetSeconds:-90}) != -90 { t.Fatal("offset lost") }
}
