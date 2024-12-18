package com.facebook.smartcapture.diagnostic;

import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.C14360o3;
import X.C1H4;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class DiagnosticView extends View {
    public static final Companion Companion = new Object();
    public static final int TEXT_HORIZONTAL_PADDING = 5;
    public final float density;
    public DiagnosticInfo diagnosticInfo;
    public float scale;
    public float verticalOffset;

    /* loaded from: classes10.dex */
    public final class Companion {
        private final int convertToUnsigned(int i) {
            return i < 0 ? i + 256 : i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] createPixelColorArray(byte[] bArr) {
            int length = bArr.length / 4;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 4;
                int i3 = bArr[i2];
                if (i3 < 0) {
                    i3 += 256;
                }
                int i4 = bArr[i2 + 1];
                if (i4 < 0) {
                    i4 += 256;
                }
                int i5 = bArr[i2 + 2];
                if (i5 < 0) {
                    i5 += 256;
                }
                iArr[i] = android.graphics.Color.argb(255, i3, i4, i5);
            }
            return iArr;
        }

        private final int colorFloatToInt(float f) {
            return C1H4.A01(f * 255.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setPaintColor(Paint paint, Color color) {
            paint.setARGB(C1H4.A01(color.alpha * 255.0f), C1H4.A01(color.red * 255.0f), C1H4.A01(color.green * 255.0f), C1H4.A01(color.blue * 255.0f));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Rect getTextBackgroundSize(float f, float f2, String str, TextPaint textPaint) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            return new Rect((int) (f - 5.0f), (int) (fontMetrics.top + f2), (int) (f + textPaint.measureText(str) + 5.0f), (int) (f2 + fontMetrics.bottom));
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.density = getResources().getDisplayMetrics().density;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        DiagnosticInfo diagnosticInfo = this.diagnosticInfo;
        if (diagnosticInfo != null) {
            this.scale = getWidth() / diagnosticInfo.previewWidth;
            this.verticalOffset = (getHeight() - ((getWidth() * diagnosticInfo.previewHeight) / diagnosticInfo.previewWidth)) / 2.0f;
            drawImages(canvas, diagnosticInfo);
            drawPolygons(canvas, diagnosticInfo);
            drawPoints(canvas, diagnosticInfo);
            drawSegments(canvas, diagnosticInfo);
            drawTexts(canvas, diagnosticInfo);
        }
    }

    public final void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
        C14360o3.A0B(diagnosticInfo, 0);
        this.diagnosticInfo = diagnosticInfo;
        postInvalidate();
    }

    private final void drawImages(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        for (ImageAnnotation imageAnnotation : diagnosticInfo.imageAnnotations) {
            if (imageAnnotation.width != 0 && imageAnnotation.height != 0) {
                int[] createPixelColorArray = Companion.createPixelColorArray(imageAnnotation.image);
                int i = imageAnnotation.width;
                Bitmap createBitmap = Bitmap.createBitmap(createPixelColorArray, 0, i, i, imageAnnotation.height, Bitmap.Config.ARGB_8888);
                C14360o3.A07(createBitmap);
                float f = imageAnnotation.displayOrigin.x;
                float f2 = this.scale;
                int i2 = (int) (f * f2);
                int i3 = (int) ((r1.y * f2) + this.verticalOffset);
                canvas.drawBitmap(createBitmap, (Rect) null, new Rect(i2, i3, (int) (i2 + (imageAnnotation.displayWidth * f2)), (int) (i3 + (imageAnnotation.displayHeight * f2))), (Paint) null);
                createBitmap.recycle();
            }
        }
    }

    private final Path createPath(Point[] pointArr) {
        Path A0T = AbstractC166987dD.A0T();
        int length = pointArr.length;
        for (int i = 0; i < length; i++) {
            float f = pointArr[i].x;
            float f2 = this.scale;
            float f3 = f * f2;
            float f4 = (r1.y * f2) + this.verticalOffset;
            if (i == 0) {
                A0T.moveTo(f3, f4);
            } else {
                A0T.lineTo(f3, f4);
            }
        }
        A0T.close();
        return A0T;
    }

    private final void drawPoints(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        Paint A0R = AbstractC166987dD.A0R();
        for (PointAnnotation pointAnnotation : diagnosticInfo.pointAnnotations) {
            Companion.setPaintColor(A0R, pointAnnotation.color);
            float f = pointAnnotation.point.x;
            float f2 = this.scale;
            canvas.drawCircle(f * f2, (r1.y * f2) + this.verticalOffset, pointAnnotation.radius * this.density * f2, A0R);
        }
    }

    private final void drawPolygons(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        Paint A0R = AbstractC166987dD.A0R();
        for (PolygonAnnotation polygonAnnotation : diagnosticInfo.polygonAnnotations) {
            Path createPath = createPath(polygonAnnotation.points);
            AbstractC166987dD.A1R(A0R);
            Companion companion = Companion;
            companion.setPaintColor(A0R, polygonAnnotation.fillColor);
            canvas.drawPath(createPath, A0R);
            AbstractC43592JPx.A1E(A0R);
            companion.setPaintColor(A0R, polygonAnnotation.borderColor);
            A0R.setStrokeWidth(polygonAnnotation.borderWidth * this.density);
            canvas.drawPath(createPath, A0R);
        }
    }

    private final void drawSegments(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        Paint A0R = AbstractC166987dD.A0R();
        for (SegmentAnnotation segmentAnnotation : diagnosticInfo.segmentAnnotations) {
            Companion.setPaintColor(A0R, segmentAnnotation.color);
            A0R.setStrokeWidth(segmentAnnotation.lineWidth * this.density * this.scale);
            float f = segmentAnnotation.firstPoint.x;
            float f2 = this.scale;
            float f3 = r1.y * f2;
            float f4 = this.verticalOffset;
            Point point = segmentAnnotation.secondPoint;
            canvas.drawLine(f * f2, f3 + f4, point.x * f2, f4 + (point.y * f2), A0R);
        }
    }

    private final void drawTexts(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        Paint A0R = AbstractC166987dD.A0R();
        TextPaint textPaint = new TextPaint();
        for (TextAnnotation textAnnotation : diagnosticInfo.textAnnotations) {
            textPaint.setTextSize(((textAnnotation.fontSize * this.density) * 2.0f) / 3.0f);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f = textAnnotation.topLeftPosition.x;
            float f2 = this.scale;
            float f3 = f * f2;
            float f4 = (r2.y - (fontMetrics.top * f2)) + this.verticalOffset;
            Companion companion = Companion;
            companion.setPaintColor(A0R, textAnnotation.backgroundColor);
            canvas.drawRect(companion.getTextBackgroundSize(f3, f4, textAnnotation.text, textPaint), A0R);
            companion.setPaintColor(textPaint, textAnnotation.textColor);
            canvas.drawText(textAnnotation.text, f3, f4, textPaint);
        }
    }
}
