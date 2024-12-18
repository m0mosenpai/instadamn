package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Jhx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44306Jhx extends Drawable implements Drawable.Callback {
    public Drawable A00;
    public boolean A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06;
    public final Path A07;
    public final Drawable A08;
    public final Drawable A09;
    public final C48269LXs A0A;
    public final C23597Acr A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C44306Jhx(Context context, Drawable drawable, Drawable drawable2, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        AbstractC167007dF.A1I(context, 1, drawable);
        this.A0D = str;
        this.A0F = z;
        this.A05 = i3;
        this.A04 = i4;
        this.A00 = drawable;
        this.A0C = str2;
        this.A08 = drawable2;
        this.A0E = z2;
        Paint paint = C3LQ.A00;
        this.A09 = C3LQ.A05(context, i2, context.getColor(R.color.audio_bar_action_color_enabled));
        this.A07 = AbstractC166987dD.A0T();
        this.A06 = AbstractC166987dD.A0R();
        this.A03 = context.getResources().getDimensionPixelOffset(i);
        this.A02 = AbstractC166987dD.A02(i4);
        this.A0A = new C48269LXs(this, 0);
        this.A0B = new C23597Acr(2, context, this);
        String str3 = this.A0D;
        if (str3 != null) {
            C1OG A0J = C25821No.A00().A0J(AbstractC25225BEi.A0t(str3), "STORIES_STICKERS_SEARCH");
            A0J.A02(this.A0A);
            A0J.A01();
        }
        if (str2 != null && str2.length() != 0) {
            C1OG A0J2 = C25821No.A00().A0J(AbstractC25225BEi.A0t(this.A0C), "CUSTOMIZATION_BACKGROUND");
            A0J2.A02(this.A0B);
            A0J2.A01();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A00;
        int i = this.A03;
        int i2 = i / 2;
        int i3 = this.A04;
        int i4 = i2 + i3;
        int i5 = i3 + i;
        drawable.setBounds(i2, i, i4, i5);
        this.A00.draw(canvas);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.setBounds(i2, i, i4, i5);
            drawable2.draw(canvas);
            invalidateDrawable(drawable2);
        } else if (!this.A01 && this.A0F) {
            Drawable drawable3 = this.A09;
            drawable3.setBounds(i2, i, i4, i5);
            drawable3.draw(canvas);
        }
        canvas.drawPath(this.A07, this.A06);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04 + this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04 + this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C44306Jhx(android.content.Context r15, android.graphics.drawable.Drawable r16, android.graphics.drawable.Drawable r17, java.lang.String r18, int r19, int r20, int r21, int r22, int r23, boolean r24) {
        /*
            r14 = this;
            r5 = r17
            r4 = r16
            r11 = r22
            r12 = r24
            r10 = r21
            r9 = r20
            r7 = 0
            r2 = r23
            r0 = r23 & 8
            if (r0 == 0) goto L16
            r9 = 2131238347(0x7f081dcb, float:1.809297E38)
        L16:
            r0 = r23 & 16
            if (r0 == 0) goto L1b
            r12 = 1
        L1b:
            r0 = r23 & 32
            r3 = r15
            if (r0 == 0) goto L2b
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            int r10 = r1.getDimensionPixelSize(r0)
        L2b:
            r0 = r23 & 64
            if (r0 == 0) goto L33
            int r11 = X.AbstractC43594JPz.A03(r15)
        L33:
            r0 = r2 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3b
            android.graphics.drawable.GradientDrawable r4 = X.AbstractC43594JPz.A0D()
        L3b:
            r0 = r2 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L40
            r5 = r7
        L40:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            boolean r13 = X.AbstractC167007dF.A1M(r0)
            r2 = r14
            r6 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44306Jhx.<init>(android.content.Context, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.lang.String, int, int, int, int, int, boolean):void");
    }
}
