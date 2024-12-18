package com.instagram.debug.image;

import X.C5G0;
import X.C5GF;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.debug.image.ImageDebugConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class DebugOverlayDrawerImpl implements C5G0 {
    public static final int ERROR_BACKGROUND_COLOR = -1057030144;
    public static final int NORMAL_BACKGROUND_COLOR = -1073741824;
    public final Paint mBackgroundPaint = new Paint();
    public final ImageDebugConfiguration mConfig;
    public final Paint mFramePaint;
    public final Paint mTextPaint;

    public static int fixScanNum(int i, int i2) {
        return i == -1 ? i2 : i;
    }

    private void drawConciseOverlay(Canvas canvas, ArrayList arrayList, boolean z, C5GF c5gf) {
        int i;
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (height < width) {
            width = height;
        }
        int max = Math.max(width / 32, 32);
        if (this.mConfig.mShowLoadSource == ImageDebugConfiguration.LoadSourceDisplayMode.COLOR) {
            this.mFramePaint.setColor(getLoadSourceColor(c5gf));
            canvas.drawRect(0.0f, height - max, max, height, this.mFramePaint);
            i = max;
        } else {
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            float f = max;
            float f2 = f / 4.0f;
            this.mTextPaint.setTextSize(f);
            StringBuilder sb = new StringBuilder((String) arrayList.get(0));
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                sb.append(", ");
                sb.append((String) arrayList.get(i2));
            }
            String obj = sb.toString();
            float measureText = this.mTextPaint.measureText(obj);
            Paint paint = this.mBackgroundPaint;
            int i3 = NORMAL_BACKGROUND_COLOR;
            if (z) {
                i3 = ERROR_BACKGROUND_COLOR;
            }
            paint.setColor(i3);
            float f3 = i;
            float f4 = height;
            canvas.drawRect(f3, height - max, measureText + f3 + (f2 * 2.0f), f4, this.mBackgroundPaint);
            canvas.drawText(obj, f3 + f2, f4 - (((this.mTextPaint.descent() - this.mTextPaint.ascent()) - f) / 2.0f), this.mTextPaint);
        }
    }

    private void drawVerboseOverlay(Canvas canvas, ArrayList arrayList, boolean z, C5GF c5gf) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.mConfig.mShowLoadSource == ImageDebugConfiguration.LoadSourceDisplayMode.COLOR) {
            Paint paint = this.mFramePaint;
            int i = width;
            if (height < width) {
                i = height;
            }
            paint.setStrokeWidth(i / 40);
            this.mFramePaint.setColor(getLoadSourceColor(c5gf));
            canvas.drawRect(0.0f, 0.0f, width, height, this.mFramePaint);
        }
        if (!arrayList.isEmpty()) {
            int i2 = width;
            if (height < width) {
                i2 = height;
            }
            float f = i2 / 8;
            float f2 = f / 4.0f;
            this.mTextPaint.setTextSize(f);
            float size = arrayList.size() * f;
            float f3 = 0.0f;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f3 = Math.max(this.mTextPaint.measureText((String) it.next()), f3);
            }
            float f4 = width;
            if (f3 > f4) {
                float f5 = f4 / f3;
                f *= f5;
                f2 *= f5;
                f3 *= f5;
                size *= f5;
                this.mTextPaint.setTextSize(f);
            }
            Paint paint2 = this.mBackgroundPaint;
            int i3 = NORMAL_BACKGROUND_COLOR;
            if (z) {
                i3 = ERROR_BACKGROUND_COLOR;
            }
            paint2.setColor(i3);
            float f6 = height;
            float f7 = (f6 - size) / 2.0f;
            canvas.drawRect(((f4 - f3) / 2.0f) - f2, f7, ((f4 + f3) / 2.0f) + f2, ((f6 + size) / 2.0f) + f2, this.mBackgroundPaint);
            float f8 = f7 + f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                canvas.drawText((String) it2.next(), width / 2, f8, this.mTextPaint);
                f8 += f;
            }
        }
    }

    public static int getLoadSourceColor(C5GF c5gf) {
        boolean equals;
        int i;
        if (c5gf != null) {
            String str = c5gf.A07;
            switch (str.hashCode()) {
                case -1077756671:
                    equals = str.equals("memory");
                    i = -16711936;
                    break;
                case 3083677:
                    equals = str.equals("disk");
                    i = -256;
                    break;
                case 1843485230:
                    equals = str.equals("network");
                    i = -65536;
                    break;
            }
            if (equals) {
                return i;
            }
        }
        return -7829368;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a6, code lost:
    
        if (r25.getHeight() <= (r23 * 2)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01af, code lost:
    
        if (r20.mConfig.mShowOffscreenPixelsPerc == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b1, code lost:
    
        if (r10 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b3, code lost:
    
        r6 = "offscreen_pixels_percent:";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01b5, code lost:
    
        r2.add(X.AnonymousClass001.A0c(r6, "%", getOffscreenPixelsPerc(java.lang.Integer.valueOf(r22), java.lang.Integer.valueOf(r23), r25)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01cc, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01a9, code lost:
    
        if (r25 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d9, code lost:
    
        if (r25 != null) goto L117;
     */
    @Override // X.C5G0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawOverlay(android.graphics.Canvas r21, int r22, int r23, X.C5GF r24, android.graphics.Bitmap r25) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.image.DebugOverlayDrawerImpl.drawOverlay(android.graphics.Canvas, int, int, X.5GF, android.graphics.Bitmap):void");
    }

    public DebugOverlayDrawerImpl(ImageDebugConfiguration imageDebugConfiguration) {
        Paint.Style style;
        this.mConfig = imageDebugConfiguration;
        Paint paint = new Paint();
        this.mTextPaint = paint;
        Paint paint2 = new Paint();
        this.mFramePaint = paint2;
        paint.setColor(-1);
        if (imageDebugConfiguration.mOverlayDisplayMode == ImageDebugConfiguration.OverlayDisplayMode.CONCISE) {
            paint.setTextAlign(Paint.Align.LEFT);
            style = Paint.Style.FILL;
        } else {
            paint.setTextAlign(Paint.Align.CENTER);
            style = Paint.Style.STROKE;
        }
        paint2.setStyle(style);
    }

    public static int getOffscreenPixelsPerc(Integer num, Integer num2, Bitmap bitmap) {
        float min = Math.min(bitmap.getWidth() / num.intValue(), bitmap.getHeight() / num2.intValue());
        int i = (int) (r3 * r2 * min * min);
        int width = bitmap.getWidth() * bitmap.getHeight();
        return ((width - i) * 100) / width;
    }

    @Override // X.C5G0
    public void drawOverlay(Canvas canvas, ImageView imageView, C5GF c5gf, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (this.mConfig.mIsImageOverlayEnabled) {
            if (bitmap == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof BitmapDrawable) {
                    bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            drawOverlay(canvas, imageView.getWidth(), imageView.getHeight(), c5gf, bitmap2);
        }
    }
}
