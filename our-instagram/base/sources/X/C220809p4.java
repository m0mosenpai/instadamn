package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.9p4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220809p4 extends AbstractC130945vi implements C5RP {
    public C202728xq A00;
    public C6RB A01;
    public final int A02;
    public final C24011Akp A03;
    public final float A04;
    public final int A05;
    public final Context A06;
    public final Resources A07;
    public final Paint A08;
    public final RectF A09;
    public final List A0A;

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        C202728xq c202728xq = this.A00;
        if (c202728xq != null) {
            c202728xq.A9I(interfaceC25177BCa);
        }
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        C202728xq c202728xq = this.A00;
        if (c202728xq != null) {
            c202728xq.EFh(interfaceC25177BCa);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (!isLoading()) {
            RectF rectF = this.A09;
            float f = this.A04;
            canvas.drawRoundRect(rectF, f, f, this.A08);
            C202728xq c202728xq = this.A00;
            if (c202728xq != null) {
                c202728xq.draw(canvas);
            }
            this.A01.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C220809p4(android.content.Context r26, X.C24011Akp r27) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220809p4.<init>(android.content.Context, X.Akp):void");
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0A;
    }

    @Override // X.C5RP
    public final void AHq() {
        C202728xq c202728xq = this.A00;
        if (c202728xq != null) {
            c202728xq.AHq();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02 + 280 + 28;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05 + 56;
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        C202728xq c202728xq = this.A00;
        if (c202728xq == null || c202728xq.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC130945vi
    public final String A09() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        C24011Akp c24011Akp = this.A03;
        C5NG A0V = AbstractC167007dF.A0V();
        AbstractC166987dD.A1V(C148276lx.A0c, A0V);
        A1C.append(A0V.A00());
        A1C.append('_');
        A1C.append(AbstractC166997dE.A1Z(Boolean.valueOf(AbstractC167007dF.A1T(c24011Akp.A00.A00)), true));
        return A1C.toString();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        Rect bounds;
        Rect bounds2;
        super.setBounds(i, i2, i3, i4);
        int i6 = this.A02;
        int i7 = (i2 + i4) / 2;
        int i8 = ((i6 + 280) + 28) / 2;
        int i9 = i7 - i8;
        int i10 = i7 + i8;
        RectF rectF = this.A09;
        rectF.left = i;
        rectF.top = i9;
        rectF.right = i3;
        rectF.bottom = i10;
        C202728xq c202728xq = this.A00;
        if (c202728xq != null) {
            c202728xq.setBounds(i + 28, (i10 - 28) - i6, c202728xq.getIntrinsicWidth(), c202728xq.getIntrinsicHeight());
        }
        float f = rectF.top;
        int i11 = 0;
        if (c202728xq != null && (bounds2 = c202728xq.getBounds()) != null) {
            i5 = bounds2.top;
        } else {
            i5 = 0;
        }
        C6RB c6rb = this.A01;
        float f2 = ((f + i5) - c6rb.A06) / 2.0f;
        if (c202728xq != null && (bounds = c202728xq.getBounds()) != null) {
            i11 = bounds.left;
        }
        c6rb.setBounds(i11 + 28 + (AbstractC166997dE.A0A(this.A07) * 2), C1H4.A01(f2), getBounds().right, AbstractC166987dD.A0D(this));
    }
}
