package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.9SI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SI extends Drawable implements Drawable.Callback, C1NJ {
    public static final CharSequence A0O = "…";
    public boolean A00;
    public int A01;
    public C9Rz A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Resources A0B;
    public final Paint A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final Paint A0J;
    public final Path A0K;
    public final RectF A0L;
    public final RectF A0M;
    public final boolean A0N;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9SI(android.content.Context r11, com.instagram.music.common.model.MusicAssetModel r12, int r13, int r14, boolean r15, boolean r16, boolean r17) {
        /*
            r10 = this;
            r9 = 1
            r8 = 2
            r10.<init>()
            r10.A0A = r11
            r10.A00 = r15
            r0 = r16
            r10.A0N = r0
            android.content.res.Resources r3 = r11.getResources()
            r10.A0B = r3
            android.graphics.Paint r0 = X.AbstractC166987dD.A0R()
            r0.setColor(r14)
            r10.A0C = r0
            android.graphics.RectF r0 = X.AbstractC166987dD.A0X()
            r10.A0L = r0
            android.graphics.Paint r0 = X.AbstractC166987dD.A0S(r9)
            r10.A0J = r0
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r6 = r3.getDimensionPixelSize(r0)
            r10.A05 = r6
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r4 = r3.getDimensionPixelSize(r0)
            r10.A04 = r4
            r0 = 2131165344(0x7f0700a0, float:1.7944902E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r10.A0G = r0
            int r2 = X.AbstractC166997dE.A07(r3)
            r10.A03 = r2
            int r1 = X.AbstractC166997dE.A0A(r3)
            r10.A0H = r1
            int r0 = X.AbstractC166997dE.A0D(r3)
            r10.A0I = r0
            int r2 = r2 + r4
            int r2 = r2 + r1
            int r2 = r2 + r1
            int r13 = r13 - r2
            r10.A08 = r13
            r0 = 2131099784(0x7f060088, float:1.781193E38)
            int r0 = r11.getColor(r0)
            r10.A07 = r0
            r7 = 3
            X.PgD r0 = new X.PgD
            r0.<init>(r10, r7)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r10.A0E = r0
            r0 = 26
            X.0sx r0 = X.AbstractC167007dF.A0q(r10, r12, r14, r0)
            r10.A0F = r0
            r0 = 25
            X.0sx r0 = X.AbstractC167007dF.A0q(r10, r12, r14, r0)
            r10.A0D = r0
            r0 = -1
            r10.A01 = r0
            com.instagram.common.typedurl.ImageUrl r4 = r12.A03
            boolean r0 = X.AbstractC81033jX.A03(r4)
            if (r0 != 0) goto Le8
            X.1No r1 = X.C25821No.A00()
            if (r17 == 0) goto Le3
            android.graphics.Bitmap r0 = r1.A0G(r4)
            if (r0 == 0) goto Le8
            r10.A01(r0)
        L9a:
            X.0do r0 = r10.A0F
            java.lang.Object r0 = r0.getValue()
            X.6RB r0 = (X.C6RB) r0
            int r1 = r0.A0A
            X.0do r0 = r10.A0D
            java.lang.Object r0 = r0.getValue()
            X.6RB r0 = (X.C6RB) r0
            int r0 = r0.A0A
            if (r1 >= r0) goto Lb1
            r1 = r0
        Lb1:
            int r2 = r2 + r1
            r10.A09 = r2
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r10.A06 = r0
            float r1 = (float) r2
            float r0 = (float) r0
            r5 = 0
            android.graphics.RectF r4 = X.AbstractC166987dD.A0Y(r1, r0)
            r10.A0M = r4
            android.graphics.Path r3 = X.AbstractC166987dD.A0T()
            r0 = 8
            float[] r2 = new float[r0]
            r1 = 0
            float r0 = (float) r6
            r2[r1] = r0
            r2[r9] = r0
            r2[r8] = r0
            r2[r7] = r0
            X.AbstractC167017dG.A1X(r2, r5)
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r3.addRoundRect(r4, r2, r0)
            r10.A0K = r3
            return
        Le3:
            r0 = 0
            X.AbstractC167017dG.A1K(r10, r1, r4, r0)
            goto L9a
        Le8:
            r10.A00()
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9SI.<init>(android.content.Context, com.instagram.music.common.model.MusicAssetModel, int, int, boolean, boolean, boolean):void");
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private final void A00() {
        Bitmap bitmap;
        Context context = this.A0A;
        this.A01 = AbstractC166997dE.A02(context);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) context.getDrawable(R.drawable.default_album_art_icon);
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        } else {
            bitmap = null;
        }
        A01(bitmap);
    }

    private final void A01(Bitmap bitmap) {
        int i;
        Integer num;
        if (bitmap != null) {
            boolean z = this.A0N;
            if (z) {
                C65888Tvs A00 = new C65887Tvr(bitmap).A00();
                int A02 = AbstractC166997dE.A02(this.A0A);
                int A002 = A00.A00(A02);
                if (A002 == A02) {
                    C65890Tvu c65890Tvu = A00.A01;
                    if (c65890Tvu != null) {
                        A02 = c65890Tvu.A05;
                    }
                    A002 = A02;
                }
                this.A01 = A002;
                i = this.A0G;
            } else {
                i = this.A04;
            }
            int i2 = i;
            if (!z) {
                i = this.A05;
            }
            float f = i;
            if (z) {
                num = Integer.valueOf(this.A04 - this.A0G);
            } else {
                num = null;
            }
            C9Rz A003 = A23.A00(bitmap, num, f, i2, i2);
            A003.setCallback(this);
            this.A02 = A003;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable mutate;
        this.A0C.setAlpha(i);
        C9Rz c9Rz = this.A02;
        if (c9Rz != null && (mutate = c9Rz.mutate()) != null) {
            mutate.setAlpha(i);
        }
        AbstractC167027dH.A0h(AbstractC166987dD.A0a(this.A0F), i);
        AbstractC167027dH.A0h(AbstractC166987dD.A0a(this.A0D), i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0C.setColorFilter(colorFilter);
        AbstractC167017dG.A13(colorFilter, this.A02);
        AbstractC167027dH.A0d(colorFilter, AbstractC166987dD.A0a(this.A0F));
        AbstractC167027dH.A0d(colorFilter, AbstractC166987dD.A0a(this.A0D));
        invalidateSelf();
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        A01(AbstractC166997dE.A0O(c73033Pe));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        AbstractC167007dF.A0s(canvas, AbstractC166987dD.A0W(this));
        RectF rectF = this.A0M;
        float f = this.A05;
        canvas.drawRoundRect(rectF, f, f, this.A0C);
        C9Rz c9Rz = this.A02;
        if (c9Rz != null) {
            canvas.save();
            float f2 = this.A03;
            canvas.translate(f2, f2);
            int i = this.A01;
            if (i != -1) {
                Paint paint = this.A0J;
                paint.setColor(i);
                if (this.A0N) {
                    paint.setColorFilter(new PorterDuffColorFilter(AbstractC166997dE.A02(this.A0A), PorterDuff.Mode.DARKEN));
                }
                RectF rectF2 = this.A0L;
                float f3 = this.A04;
                rectF2.set(0.0f, 0.0f, f3, f3);
                canvas.drawRoundRect(rectF2, f, f, paint);
            }
            c9Rz.draw(canvas);
            if (this.A00) {
                AbstractC167007dF.A0v(canvas, this.A0E);
            }
            canvas.restore();
        }
        canvas.save();
        float f4 = this.A03 + this.A04 + this.A0H;
        int i2 = this.A06;
        InterfaceC09390do interfaceC09390do = this.A0F;
        int i3 = ((C6RB) interfaceC09390do.getValue()).A06;
        int i4 = this.A0I;
        InterfaceC09390do interfaceC09390do2 = this.A0D;
        canvas.translate(f4, AbstractC166987dD.A02(i2 - ((i3 + i4) + ((C6RB) interfaceC09390do2.getValue()).A06)));
        AbstractC167007dF.A0v(canvas, interfaceC09390do);
        canvas.translate(0.0f, ((C6RB) interfaceC09390do.getValue()).A06 + i4);
        AbstractC167007dF.A0v(canvas, interfaceC09390do2);
        canvas.restore();
        canvas.restore();
        if (this.A00) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        A00();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167027dH.A0j(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167027dH.A0i(this, runnable);
    }
}
