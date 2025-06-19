package myiconpack

import android.content.res.Configuration
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import kotlinx.coroutines.delay
import kotlin.Unit
import kotlin.math.tan


public val Logofx: ImageVector
    get() {
        if (_logofx != null) {
            return _logofx!!
        }
        _logofx = Builder(
            name = "Logofx",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            // Part 1
            path(
                fill = SolidColor(Color(0xFF4285f4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(189.9f, 50.0f)
                lineTo(189.9f, 50.0f)
                arcTo(14.36f, 14.37f, 0.0f, false, true, 204.27f, 64.37f)
                lineTo(204.27f, 142.0f)
                arcTo(14.36f, 14.37f, 0.0f, false, true, 189.9f, 156.37f)
                lineTo(189.9f, 156.37f)
                arcTo(14.36f, 14.37f, 0.0f, false, true, 175.54f, 142.0f)
                lineTo(175.54f, 64.37f)
                arcTo(14.36f, 14.37f, 0.0f, false, true, 189.9f, 50.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4285f4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(345.92f, 142.83f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(22.92f, 22.92f, 0.0f, false, false, -45.76f, -1.73f)
                verticalLineToRelative(50.17f)
                lineTo(300.0f, 401.73f)
                horizontalLineToRelative(0.0f)
                lineToRelative(16.41f, 37.67f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 12.8f, 0.0f)
                lineToRelative(16.46f, -37.65f)
                horizontalLineToRelative(0.07f)
                lineToRelative(0.11f, -210.59f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-4.6f)
                lineToRelative(0.0f, -43.74f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3ddc84)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(448.73f, 216.22f)
                lineToRelative(-5.42f, -4.38f)
                arcToRelative(19.48f, 19.48f, 0.0f, false, false, -26.0f, 1.38f)
                horizontalLineToRelative(0.0f)
                arcToRelative(165.28f, 165.28f, 0.0f, false, true, -99.91f, 47.66f)
                arcTo(19.28f, 19.28f, 0.0f, false, false, 300.0f, 280.0f)
                verticalLineToRelative(7.25f)
                arcToRelative(19.29f, 19.29f, 0.0f, false, false, 21.25f, 19.17f)
                arcToRelative(210.21f, 210.21f, 0.0f, false, false, 69.27f, -19.25f)
                arcToRelative(212.0f, 212.0f, 0.0f, false, false, 59.05f, -41.65f)
                lineToRelative(0.83f, -0.83f)
                arcToRelative(19.24f, 19.24f, 0.0f, false, false, -1.66f, -28.46f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF073042)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(323.32f, 125.09f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-64.19f, 0.0f)
                horizontalLineTo(232.15f)
                lineToRelative(-32.1f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(-10.2f)
                verticalLineToRelative(35.48f)
                horizontalLineToRelative(68.33f)
                lineToRelative(64.58f, 0.0f)
                horizontalLineToRelative(0.37f)
                arcToRelative(17.74f, 17.74f, 0.0f, false, false, 0.15f, -35.48f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4285f4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(205.89f, 142.78f)
                lineToRelative(-31.79f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, 7.0f)
                lineToRelative(-0.16f, 253.86f)
                horizontalLineToRelative(0.0f)
                lineToRelative(16.41f, 37.67f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 12.8f, 0.0f)
                lineToRelative(16.46f, -37.65f)
                horizontalLineToRelative(0.07f)
                lineToRelative(0.16f, -253.86f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 205.89f, 142.78f)
                close()
            }

            path(
                fill = SolidColor(Color(0xFF073042)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(193.31f, 96.0f)
                arcTo(46.9f, 46.9f, 0.0f, true, true, 143.0f, 142.76f)
                arcTo(47.07f, 47.07f, 0.0f, false, true, 193.31f, 96.0f)
                close()
                moveTo(214.83f, 140.21f)
                arcToRelative(25.0f, 25.0f, 0.0f, true, false, -27.44f, 27.49f)
                arcTo(25.14f, 25.14f, 0.0f, false, false, 214.82f, 140.19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(189.9f, 117.72f)
                arcToRelative(25.0f, 25.0f, 0.0f, true, true, -25.0f, 25.0f)
                arcTo(25.08f, 25.08f, 0.0f, false, true, 189.9f, 117.72f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(323.14f, 135.0f)
                horizontalLineToRelative(-0.36f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.13f, 15.66f)
                horizontalLineToRelative(0.16f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.07f, -15.66f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4285f4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(284.06f, 278.4f)
                lineTo(284.06f, 290.66f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 267.32f, 307.4f)
                lineTo(197.16f, 307.4f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 180.42f, 290.66f)
                lineTo(180.42f, 278.4f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 197.16f, 261.66f)
                lineTo(267.32f, 261.66f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 284.06f, 278.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF32de84)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(123.95f, 257.75f)
                lineToRelative(-15.77f, -9.1f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, -2.52f, 0.67f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, false, 0.67f, 2.51f)
                lineToRelative(16.0f, 9.22f)
                arcToRelative(57.56f, 57.56f, 0.0f, false, false, 0.0f, 47.0f)
                lineToRelative(-16.0f, 9.22f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, false, 1.85f, 3.19f)
                lineToRelative(15.77f, -9.1f)
                arcToRelative(54.36f, 54.36f, 0.0f, false, false, 43.0f, 28.09f)
                lineTo(166.95f, 229.64f)
                arcToRelative(54.34f, 54.34f, 0.0f, false, false, -43.0f, 28.1f)
                close()
                moveTo(151.54f, 309.75f)
                arcToRelative(4.6f, 4.6f, 0.0f, true, true, -4.6f, -4.6f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 151.54f, 309.72f)
                close()
                moveTo(151.54f, 259.36f)
                arcToRelative(4.6f, 4.6f, 0.0f, true, true, -4.6f, -4.6f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 151.54f, 259.33f)
                close()
            }
        }.build()
        return _logofx!!
    }

private var _logofx: ImageVector? = null


private var _logofxPart1: ImageVector? = null

public val LogofxPart1: ImageVector
    get() {
        if (_logofxPart1 != null) {
            return _logofxPart1!!
        }
        _logofxPart1 = Builder(
            name = "LogofxPart1",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4285f4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(189.9f, 50.0f)
                lineTo(189.9f, 50.0f)
                arcTo(14.36f, 14.37f, 0.0f, false, true, 204.27f, 64.37f)
                lineTo(204.27f, 142.0f)
                arcTo(14.36f, 14.37f, 0.0f, false, true, 189.9f, 156.37f)
                lineTo(189.9f, 156.37f)
                arcTo(14.36f, 14.37f, 0.0f, false, true, 175.54f, 142.0f)
                lineTo(175.54f, 64.37f)
                arcTo(14.36f, 14.37f, 0.0f, false, true, 189.9f, 50.0f)
                close()
            }
        }.build()
        return _logofxPart1!!
    }

private var _logofxPart2: ImageVector? = null

public val LogofxPart2: ImageVector
    get() {
        if (_logofxPart2 != null) {
            return _logofxPart2!!
        }
        _logofxPart2 = Builder(
            name = "LogofxPart2",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4285f4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(345.92f, 142.83f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(22.92f, 22.92f, 0.0f, false, false, -45.76f, -1.73f)
                verticalLineToRelative(50.17f)
                lineTo(300.0f, 401.73f)
                horizontalLineToRelative(0.0f)
                lineToRelative(16.41f, 37.67f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 12.8f, 0.0f)
                lineToRelative(16.46f, -37.65f)
                horizontalLineToRelative(0.07f)
                lineToRelative(0.11f, -210.59f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-4.6f)
                lineToRelative(0.0f, -43.74f)
                close()
            }
        }.build()
        return _logofxPart2!!
    }

private var _logofxPart3: ImageVector? = null

public val LogofxPart3: ImageVector
    get() {
        if (_logofxPart3 != null) {
            return _logofxPart3!!
        }
        _logofxPart3 = Builder(
            name = "LogofxPart3",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3ddc84)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(448.73f, 216.22f)
                lineToRelative(-5.42f, -4.38f)
                arcToRelative(19.48f, 19.48f, 0.0f, false, false, -26.0f, 1.38f)
                horizontalLineToRelative(0.0f)
                arcToRelative(165.28f, 165.28f, 0.0f, false, true, -99.91f, 47.66f)
                arcTo(19.28f, 19.28f, 0.0f, false, false, 300.0f, 280.0f)
                verticalLineToRelative(7.25f)
                arcToRelative(19.29f, 19.29f, 0.0f, false, false, 21.25f, 19.17f)
                arcToRelative(210.21f, 210.21f, 0.0f, false, false, 69.27f, -19.25f)
                arcToRelative(212.0f, 212.0f, 0.0f, false, false, 59.05f, -41.65f)
                lineToRelative(0.83f, -0.83f)
                arcToRelative(19.24f, 19.24f, 0.0f, false, false, -1.66f, -28.46f)
                close()
            }
        }.build()
        return _logofxPart3!!
    }

private var _logofxPart4: ImageVector? = null

public val LogofxPart4: ImageVector
    get() {
        if (_logofxPart4 != null) {
            return _logofxPart4!!
        }
        _logofxPart4 = Builder(
            name = "LogofxPart4",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF073042)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(323.32f, 125.09f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-64.19f, 0.0f)
                horizontalLineTo(232.15f)
                lineToRelative(-32.1f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(-10.2f)
                verticalLineToRelative(35.48f)
                horizontalLineToRelative(68.33f)
                lineToRelative(64.58f, 0.0f)
                horizontalLineToRelative(0.37f)
                arcToRelative(17.74f, 17.74f, 0.0f, false, false, 0.15f, -35.48f)
                close()
            }
        }.build()
        return _logofxPart4!!
    }

private var _logofxPart5: ImageVector? = null

public val LogofxPart5: ImageVector
    get() {
        if (_logofxPart5 != null) {
            return _logofxPart5!!
        }
        _logofxPart5 = Builder(
            name = "LogofxPart5",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4285f4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(205.89f, 142.78f)
                lineToRelative(-31.79f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, 7.0f)
                lineToRelative(-0.16f, 253.86f)
                horizontalLineToRelative(0.0f)
                lineToRelative(16.41f, 37.67f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 12.8f, 0.0f)
                lineToRelative(16.46f, -37.65f)
                horizontalLineToRelative(0.07f)
                lineToRelative(0.16f, -253.86f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 205.89f, 142.78f)
                close()
            }
        }.build()
        return _logofxPart5!!
    }

private var _logofxPart6: ImageVector? = null

public val LogofxPart6: ImageVector
    get() {
        if (_logofxPart6 != null) {
            return _logofxPart6!!
        }
        _logofxPart6 = Builder(
            name = "LogofxPart6",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF073042)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(193.31f, 96.0f)
                arcTo(46.9f, 46.9f, 0.0f, true, true, 143.0f, 142.76f)
                arcTo(47.07f, 47.07f, 0.0f, false, true, 193.31f, 96.0f)
                close()
                moveTo(214.83f, 140.21f)
                arcToRelative(25.0f, 25.0f, 0.0f, true, false, -27.44f, 27.49f)
                arcTo(25.14f, 25.14f, 0.0f, false, false, 214.82f, 140.19f)
                close()
            }
        }.build()
        return _logofxPart6!!
    }

private var _logofxPart7: ImageVector? = null

public val LogofxPart7: ImageVector
    get() {
        if (_logofxPart7 != null) {
            return _logofxPart7!!
        }
        _logofxPart7 = Builder(
            name = "LogofxPart7",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(189.9f, 117.72f)
                arcToRelative(25.0f, 25.0f, 0.0f, true, true, -25.0f, 25.0f)
                arcTo(25.08f, 25.08f, 0.0f, false, true, 189.9f, 117.72f)
                close()
            }
        }.build()
        return _logofxPart7!!
    }

private var _logofxPart8: ImageVector? = null

public val LogofxPart8: ImageVector
    get() {
        if (_logofxPart8 != null) {
            return _logofxPart8!!
        }
        _logofxPart8 = Builder(
            name = "LogofxPart8",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(323.14f, 135.0f)
                horizontalLineToRelative(-0.36f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.13f, 15.66f)
                horizontalLineToRelative(0.16f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.07f, -15.66f)
                close()
            }
        }.build()
        return _logofxPart8!!
    }

private var _logofxPart9: ImageVector? = null

public val LogofxPart9: ImageVector
    get() {
        if (_logofxPart9 != null) {
            return _logofxPart9!!
        }
        _logofxPart9 = Builder(
            name = "LogofxPart9",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4285f4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(284.06f, 278.4f)
                lineTo(284.06f, 290.66f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 267.32f, 307.4f)
                lineTo(197.16f, 307.4f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 180.42f, 290.66f)
                lineTo(180.42f, 278.4f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 197.16f, 261.66f)
                lineTo(267.32f, 261.66f)
                arcTo(16.74f, 16.74f, 0.0f, false, true, 284.06f, 278.4f)
                close()
            }
        }.build()
        return _logofxPart9!!
    }

private var _logofxPart10: ImageVector? = null

public val LogofxPart10: ImageVector
    get() {
        if (_logofxPart10 != null) {
            return _logofxPart10!!
        }
        _logofxPart10 = Builder(
            name = "LogofxPart10",
            defaultWidth = 500.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 500.0f,
            viewportHeight = 500.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF32de84)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(123.95f, 257.75f)
                lineToRelative(-15.77f, -9.1f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, -2.52f, 0.67f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, false, 0.67f, 2.51f)
                lineToRelative(16.0f, 9.22f)
                arcToRelative(57.56f, 57.56f, 0.0f, false, false, 0.0f, 47.0f)
                lineToRelative(-16.0f, 9.22f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, false, 1.85f, 3.19f)
                lineToRelative(15.77f, -9.1f)
                arcToRelative(54.36f, 54.36f, 0.0f, false, false, 43.0f, 28.09f)
                lineTo(166.95f, 229.64f)
                arcToRelative(54.34f, 54.34f, 0.0f, false, false, -43.0f, 28.1f)
                close()
                moveTo(151.54f, 309.75f)
                arcToRelative(4.6f, 4.6f, 0.0f, true, true, -4.6f, -4.6f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 151.54f, 309.72f)
                close()
                moveTo(151.54f, 259.36f)
                arcToRelative(4.6f, 4.6f, 0.0f, true, true, -4.6f, -4.6f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 151.54f, 259.33f)
                close()
            }
        }.build()
        return _logofxPart10!!
    }


fun DrawScope.toCanvasX(vectorX: Float): Float {
    return (vectorX / 500f) * size.width
}

fun DrawScope.toCanvasY(vectorY: Float): Float {
    return (vectorY / 500f) * size.height
}


fun DrawScope.toCanvas(vectorPoint: Offset): Offset {
    val canvasX = toCanvasX(vectorPoint.x)
    val canvasY = toCanvasY(vectorPoint.y)
    return Offset(
        x = canvasX,
        y = canvasY
    )
}


fun Offset.distanceTo(other: Offset): Float {
    val dx = other.x - x
    val dy = other.y - y
    return kotlin.math.sqrt(dx * dx + dy * dy)
}

fun DrawScope.drawCenterLines() {
    val center = Offset(size.width / 2, size.height / 2)

    // Línea vertical
    drawLine(
        start = Offset(center.x, 0f),
        end = Offset(center.x, size.height),
        color = Color.Black,
        strokeWidth = 2f
    )

    // Línea horizontal
    drawLine(
        start = Offset(0f, center.y),
        end = Offset(size.width, center.y),
        color = Color.Black,
        strokeWidth = 2f
    )

    drawCircle(
        color = Color.Red,
        radius = 10f,
        center = center
    )
}

fun DrawScope.translateFromTo(
    from: Offset,
    to: Offset,
    block: DrawScope.() -> Unit
) {
    val delta = to - from
    translate(left = delta.x, top = delta.y) {
        block()
    }
}

fun DrawScope.translateFromTo(
    from: Offset,
    to: Offset,
    progress: Float = 1f,
    block: DrawScope.() -> Unit
) {
    val interpolated = Offset(
        x = lerp(from.x, to.x, progress),
        y = lerp(from.y, to.y, progress)
    )
    val delta = interpolated - from
    translate(left = delta.x, top = delta.y) {
        block()
    }
}

@Composable
fun LogoFxCanvas(modifier: Modifier = Modifier) {


    /*
    val infiniteTransition = rememberInfiniteTransition(label = "rotationTransition")
     val angle = infiniteTransition.animateFloat(
         initialValue = 0f,
         targetValue = 360f,
         animationSpec = infiniteRepeatable(
             animation = tween(durationMillis = 4000, easing = LinearEasing),
             repeatMode = RepeatMode.Restart
         ),
         label = "rotationAngle"
     )


     Canvas(modifier = modifier.size(256.dp)) {
         rotate(degrees = angle.value, pivot = center) {
             with(painter1) {
                 draw(size)
             }
         }
     }
     */
    val painter1 = rememberVectorPainter(image = LogofxPart1)
    val painter2 = rememberVectorPainter(image = LogofxPart2)
    val painter3 = rememberVectorPainter(image = LogofxPart3)
    val painter4 = rememberVectorPainter(image = LogofxPart4)
    val painter5 = rememberVectorPainter(image = LogofxPart5)
    val painterBigBlankContour = rememberVectorPainter(image = LogofxPart6)
    val painterBigBlank = rememberVectorPainter(image = LogofxPart7)
    val painterLittleBlank = rememberVectorPainter(image = LogofxPart8)
    val painter9 = rememberVectorPainter(image = LogofxPart9)
    val painterAndroidLogo = rememberVectorPainter(image = LogofxPart10)


    val animation1Scale = remember { Animatable(2.5f) }
    val animation2TranslateProgress = remember { Animatable(1f) }
    val animation3Alpha = remember { Animatable(0f) }
    val animation4TranslateProgress = remember { Animatable(0f) }


    // 25
    val animation5RotationDegreesLeft = remember { Animatable(0f) }
    val animation6Alpha = remember { Animatable(0f) }
    val animation7RotationDegreesRight = remember { Animatable(0f) }

    var centerCircleBig by remember { mutableStateOf(Offset.Zero) }


    LaunchedEffect(centerCircleBig) {
        if (centerCircleBig == Offset.Zero) return@LaunchedEffect

        delay(1000)
        animation1Scale.animateTo(1f, animationSpec = tween(1000))
        animation2TranslateProgress.animateTo(0f, animationSpec = tween(2000))
        animation3Alpha.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 1000)
        )
        animation4TranslateProgress.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 1000)
        )
        animation5RotationDegreesLeft.animateTo(
            targetValue = 25f,
            animationSpec = tween(durationMillis = 1000)
        )
        animation6Alpha.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 1000)
        )
        animation7RotationDegreesRight.animateTo(
            targetValue = 25f,
            animationSpec = tween(durationMillis = 1000)
        )
    }


    Canvas(modifier = Modifier.size(300.dp)) {

        val vectorY = 284.53f
        val vectorX = 190.0f

        val canvasX = toCanvasX(vectorX)
        val canvasY = toCanvasY(vectorY)
        val pointInitial = Offset(canvasX, canvasY)

        val vectorStartPoint = Offset(146.41f, 96.0f)
        val canvasStartPoint = toCanvas(vectorStartPoint)
        //drawCircle(color = Color.Green, radius = 10f, center = canvasStartPoint)

        val centerCircleLittle = toCanvas(Offset(323.04f, 142.83f))
        //val centerCircleBig = toCanvas(Offset(vectorX, 142.72f))
        centerCircleBig = toCanvas(Offset(vectorX, 142.72f))

        //drawCircle(color = Color.Red, radius = 10f, center = centerCircleBig)

        val angleRad = Math.toRadians(animation5RotationDegreesLeft.value.toDouble()).toFloat()
        val opus = tan(angleRad) * centerCircleBig.distanceTo(pointInitial)
        val pointFinal = Offset(pointInitial.x - opus, pointInitial.y)

        // Set Values

        val progress = animation2TranslateProgress.value


        //return@Canvas


        //return@Canvas

        //with(painterBigBlankContour) { draw(size) }
        //with(painterBigBlank) { draw(size) }

        //val intrinsicSize = painterBigBlankContour.intrinsicSize


        //with(painter2) { draw(size) }

        rotate(
            degrees = -animation7RotationDegreesRight.value,
            pivot = centerCircleLittle
        ) {
            with(painter2) { draw(size, animation6Alpha.value) }
        }
        with(painter3) { draw(size, animation6Alpha.value) }


        val offsetX = lerp(
            start = -toCanvasX(30f),
            stop = 0f,
            fraction = animation4TranslateProgress.value
        )

        translate(left = offsetX, top = 0f) {
            with(painter4) { draw(size, alpha = animation3Alpha.value) }

        }
        rotate(degrees = animation5RotationDegreesLeft.value, pivot = centerCircleBig) {
            with(painter5) {
                draw(size, alpha = animation3Alpha.value)
            }
        }
        translate(left = -pointInitial.distanceTo(pointFinal), top = 0f) {
            with(painter9) { draw(size, animation3Alpha.value) }
        }
        rotate(degrees = animation5RotationDegreesLeft.value, pivot = centerCircleBig) {
            with(painterAndroidLogo) { draw(size, animation3Alpha.value) }
        }

        with(painterLittleBlank) { draw(size, alpha = animation6Alpha.value) }


        //return@Canvas

        scale(scale = animation1Scale.value, pivot = this.center) {
            translateFromTo(
                from = centerCircleBig,
                to = this.center,
                progress = progress
            ) {
                with(painter1) { draw(size) }
                with(painterBigBlankContour) { draw(size) }
                with(painterBigBlank) { draw(size) }
            }
        }


        drawCenterLines()




        //drawCircle(color = Color.Green, radius = 5f, center = pointInitial)
        //drawCircle(color = Color.Black, radius = 5f, center = centerCircleBig)

        //with(painter9) { draw(size) }



        //translate(left = rotatedX, top = rotatedY) {
        //    with(painter9) { draw(size) }

        //}

        /*
        drawCircle(
            color = Color.Red,
            radius = 5f,
            center = toCanvas(Offset(323.04f, 142.83f))
        )

        drawCircle(color = Color.Black, radius = 5f, center = pointFinal)
        drawCircle(color = Color.Green, radius = 5f, center = pointInitial)
        drawCircle(color = Color.Red, radius = 5f, center = centerCircleBig)
        drawCircle(
            color = Color.Red,
            radius = 5f,
            center = this.center
        )


        drawLine(
            start = canvasStartPoint,
            end = this.center,
            color = Color.Green,
            strokeWidth = 12f
        )
        */


    }
}


@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_TYPE_DESK,
    //showSystemUi = true
)
@Composable
fun PreviewCanvas() {
    Box(modifier = Modifier.padding(16.dp)) {
        LogoFxCanvas(Modifier)
    }
}


@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = Logofx, contentDescription = "")
    }
}
