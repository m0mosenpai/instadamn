package X;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.Deprecated;

/* renamed from: X.5hA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122745hA extends Canvas {
    public Canvas A00;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A02(canvas);
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A06(canvas, paint, rectF, rectF2, fArr, fArr2);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AHI.A02(canvas, paint, font, fArr, iArr, i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AHI.A00(canvas, ninePatch, paint, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A08(canvas, renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A03(canvas);
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return AbstractC55024OXa.A01(canvas, path);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.translate(f, f2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A04(canvas, j);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A05(canvas, paint, rectF, rectF2, f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AHI.A01(canvas, ninePatch, paint, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return AbstractC55024OXa.A00(canvas, f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A00(blendMode, canvas, i);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A07(canvas, paint, measuredText, f, f2, i, i2, i3, i4, z);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return AbstractC55024OXa.A02(canvas, rectF);
        }
        C14360o3.A0F("nativeCanvas");
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        AbstractC63381Siv.A01(blendMode, canvas, j);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(rectF);
        }
        C14360o3.A0F("nativeCanvas");
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        C14360o3.A0F("nativeCanvas");
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            C14360o3.A0F("nativeCanvas");
            throw C00O.createAndThrow();
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        C14360o3.A0F("nativeCanvas");
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        C14360o3.A0F("nativeCanvas");
        throw C00O.createAndThrow();
    }
}
