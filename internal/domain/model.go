package domain
import "github.com/gin-gonic/gin"
type Reading struct { Camera, Timestamp string; OffsetSeconds int64 }
func NewRouter() *gin.Engine { return gin.New() }
func CorrectedSeconds(reading Reading) int64 { return reading.OffsetSeconds }
