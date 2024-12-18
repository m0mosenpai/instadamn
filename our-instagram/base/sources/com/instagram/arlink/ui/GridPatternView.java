package com.instagram.arlink.ui;

import X.AbstractC166987dD;
import X.AbstractC25227BEk;
import X.AbstractC43592JPx;
import X.AsyncTaskC44378JjH;
import X.C05F;
import X.C0f9;
import X.C1NC;
import X.C48110LRk;
import X.C65887Tvr;
import X.C6RE;
import X.InterfaceC50394MMw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.facebook.R;

/* loaded from: classes8.dex */
public class GridPatternView extends View {
    public static final float[][] A0O = {new float[]{-45.0f, 0.0f, 45.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 45.0f}, new float[]{45.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, -45.0f, 0.0f, 45.0f}};
    public int A00;
    public int A01;
    public InterfaceC50394MMw A02;
    public Integer A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public Bitmap A0F;
    public Bitmap A0G;
    public Bitmap A0H;
    public Bitmap A0I;
    public Integer A0J;
    public String A0K;
    public final Matrix A0L;
    public final Paint A0M;
    public final TextPaint A0N;

    private void A00() {
        Bitmap emojiBitmap;
        int intValue = this.A0J.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    emojiBitmap = getSelfieWithStickerBitmap();
                } else {
                    return;
                }
            } else {
                Resources resources = getResources();
                int i = this.A0B;
                int i2 = this.A0A;
                boolean z = C1NC.A02;
                Rect A0U = AbstractC166987dD.A0U();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(resources, i, options);
                A0U.right = options.outWidth;
                A0U.bottom = options.outHeight;
                int min = Math.min(Math.max(A0U.width() / i2, A0U.height() / i2), Math.max(A0U.width() / i2, A0U.height() / i2));
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = Math.max(min, 1);
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options2);
                decodeResource.getClass();
                emojiBitmap = C1NC.A0B(decodeResource, i2, i2, true);
            }
        } else {
            emojiBitmap = getEmojiBitmap();
        }
        if (emojiBitmap != null && !emojiBitmap.isRecycled()) {
            A02(emojiBitmap, this.A0G, 4);
            int i3 = this.A0C;
            if (i3 % 4 > 0) {
                A02(emojiBitmap, this.A0H, i3 % 4);
            }
        }
    }

    private void A01() {
        TextPaint textPaint = this.A0N;
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        Paint paint = this.A0M;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        this.A04 = AbstractC166987dD.A04(getResources(), R.dimen.album_preview_add_item_margin);
    }

    private void A02(Bitmap bitmap, Bitmap bitmap2, int i) {
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bitmap2.eraseColor(0);
            Canvas A06 = AbstractC43592JPx.A06(bitmap2);
            float width = ((this.A0D - bitmap.getWidth()) / 2.0f) + this.A07;
            float height = ((this.A0D - bitmap.getHeight()) / 2.0f) + this.A07;
            float width2 = bitmap.getWidth() / 2.0f;
            float height2 = bitmap.getHeight() / 2.0f;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = 0;
                do {
                    if (i2 % 2 == i3 % 2) {
                        A06.save();
                        int i4 = this.A0D;
                        A06.translate((i3 * i4) + width, (i4 * i2) + height);
                        Matrix matrix = this.A0L;
                        matrix.reset();
                        matrix.setRotate(A0O[i2][i3], width2, height2);
                        A06.drawBitmap(bitmap, matrix, this.A0M);
                        A06.restore();
                    }
                    i3++;
                } while (i3 < 4);
            }
        }
    }

    private Bitmap getEmojiBitmap() {
        this.A0K.getClass();
        Bitmap bitmap = this.A0F;
        int i = this.A0D;
        Bitmap A08 = C1NC.A08(bitmap, i, i);
        this.A0F = A08;
        Canvas A06 = AbstractC43592JPx.A06(A08);
        TextPaint textPaint = this.A0N;
        textPaint.setTextSize(this.A04);
        float measureText = textPaint.measureText(this.A0K);
        if (measureText > 0.0f) {
            textPaint.setTextSize((this.A0D * this.A04) / measureText);
        }
        StaticLayout staticLayout = new StaticLayout(this.A0K, textPaint, this.A01, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        A06.save();
        A06.translate(-C6RE.A00(staticLayout), 0.0f);
        staticLayout.draw(A06);
        A06.restore();
        C65887Tvr c65887Tvr = new C65887Tvr(this.A0F);
        new AsyncTaskC44378JjH(c65887Tvr, new C48110LRk(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, c65887Tvr.A02);
        return this.A0F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 > r2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap getSelfieWithStickerBitmap() {
        /*
            r3 = this;
            android.graphics.Bitmap r0 = r3.A0I
            if (r0 == 0) goto L1f
            int r0 = r0.getWidth()
            int r2 = r3.A0A
            if (r0 > r2) goto L16
            android.graphics.Bitmap r0 = r3.A0I
            int r0 = r0.getHeight()
            int r2 = r3.A0A
            if (r0 <= r2) goto L1f
        L16:
            android.graphics.Bitmap r1 = r3.A0I
            r0 = 1
            android.graphics.Bitmap r0 = X.C1NC.A0B(r1, r2, r2, r0)
            r3.A0I = r0
        L1f:
            android.graphics.Bitmap r0 = r3.A0I
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.ui.GridPatternView.getSelfieWithStickerBitmap():android.graphics.Bitmap");
    }

    public Integer getDominantColor() {
        return this.A03;
    }

    public void setColorUpdateCallback(InterfaceC50394MMw interfaceC50394MMw) {
        this.A02 = interfaceC50394MMw;
    }

    public void setEmoji(String str) {
        this.A0K = str;
        this.A03 = null;
        this.A0J = C05F.A01;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public void setSelfieWithSticker(Bitmap bitmap) {
        if (this.A0D > 0) {
            int i = this.A0A;
            bitmap = C1NC.A0B(bitmap, i, i, true);
        }
        this.A0I = bitmap;
        this.A0J = C05F.A0N;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public void setSticker(int i) {
        this.A0B = i;
        this.A0J = C05F.A0C;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public GridPatternView(Context context) {
        super(context);
        this.A0N = new TextPaint();
        this.A0M = AbstractC166987dD.A0R();
        this.A0L = AbstractC166987dD.A0Q();
        this.A0J = C05F.A00;
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r0.isRecycled() != false) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            super.onDraw(r9)
            int r3 = r8.A0E
            int r2 = r8.A01
            int r1 = r8.A00
            int r0 = r8.A06
            int r1 = r1 - r0
            r0 = 0
            r9.clipRect(r0, r3, r2, r1)
            android.graphics.Bitmap r0 = r8.A0G
            if (r0 == 0) goto L79
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L79
            android.graphics.Bitmap r0 = r8.A0H
            r7 = 1
            if (r0 == 0) goto L26
            boolean r0 = r0.isRecycled()
            r6 = 1
            if (r0 == 0) goto L27
        L26:
            r6 = 0
        L27:
            r4 = 0
        L28:
            int r0 = r8.A09
            if (r4 >= r0) goto L79
            r3 = 0
        L2d:
            int r0 = r8.A08
            if (r3 >= r0) goto L76
            r9.save()
            android.graphics.Bitmap r0 = r8.A0G
            int r0 = r0.getWidth()
            int r0 = r0 * r3
            float r5 = (float) r0
            float r0 = r8.A05
            float r5 = r5 - r0
            int r0 = r3 * 2
            int r1 = r0 + 1
            int r0 = r8.A07
            int r1 = r1 * r0
            float r0 = (float) r1
            float r5 = r5 - r0
            android.graphics.Bitmap r0 = r8.A0G
            int r2 = r0.getHeight()
            int r2 = r2 * r4
            int r0 = r8.A0E
            int r2 = r2 + r0
            int r1 = r4 * 2
            int r0 = r8.A07
            int r1 = r1 * r0
            int r2 = r2 - r1
            float r0 = (float) r2
            r9.translate(r5, r0)
            int r0 = r8.A09
            int r0 = r0 - r7
            if (r4 != r0) goto L73
            if (r6 == 0) goto L73
            android.graphics.Bitmap r2 = r8.A0H
            r2.getClass()
        L68:
            r1 = 0
            r0 = 0
            r9.drawBitmap(r2, r0, r0, r1)
            r9.restore()
            int r3 = r3 + 1
            goto L2d
        L73:
            android.graphics.Bitmap r2 = r8.A0G
            goto L68
        L76:
            int r4 = r4 + 1
            goto L28
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.ui.GridPatternView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Bitmap bitmap;
        int A06 = C0f9.A06(1477078933);
        super.onSizeChanged(i, i2, i3, i4);
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            View view = (View) parent;
            View findViewById = view.findViewById(R.id.top_bar);
            if (findViewById != null) {
                this.A0E = findViewById.getMeasuredHeight();
            }
            View findViewById2 = view.findViewById(R.id.bottom_bar);
            if (findViewById2 != null) {
                this.A06 = findViewById2.getMeasuredHeight();
            }
            if (this.A0E > 0 && this.A06 > 0) {
                break;
            }
        }
        this.A01 = i;
        this.A00 = i2;
        int i5 = (i2 - this.A0E) - this.A06;
        int ceil = (int) Math.ceil(i5 / (0.2f * r8));
        this.A0C = ceil;
        double sqrt = Math.sqrt(2.0d);
        int i6 = (int) (i5 / ((ceil + sqrt) - 1.0d));
        this.A0D = i6;
        this.A07 = (int) ((i6 * (sqrt - 1.0d)) / 2.0d);
        float f = i6;
        this.A0A = (int) (0.75f * f);
        this.A05 = Math.max(AbstractC25227BEk.A00(((float) Math.ceil(r8 / f)) * f, i), 0.0f);
        int ceil2 = (int) Math.ceil((i6 * 4) + (r4 * 2));
        this.A09 = (int) Math.ceil(ceil / 4.0f);
        this.A08 = (int) Math.ceil(r8 / (f * 4.0f));
        this.A0G = C1NC.A08(this.A0G, ceil2, ceil2);
        int i7 = this.A0C % 4;
        if (i7 > 0) {
            bitmap = C1NC.A08(this.A0H, ceil2, (i7 * this.A0D) + (this.A07 * 2));
        } else {
            Bitmap bitmap2 = this.A0H;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.A0H.recycle();
            }
            bitmap = null;
        }
        this.A0H = bitmap;
        A00();
        C0f9.A0D(939819688, A06);
    }

    public GridPatternView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0N = new TextPaint();
        this.A0M = AbstractC166987dD.A0R();
        this.A0L = AbstractC166987dD.A0Q();
        this.A0J = C05F.A00;
        A01();
    }

    public GridPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0N = new TextPaint();
        this.A0M = AbstractC166987dD.A0R();
        this.A0L = AbstractC166987dD.A0Q();
        this.A0J = C05F.A00;
        A01();
    }
}
