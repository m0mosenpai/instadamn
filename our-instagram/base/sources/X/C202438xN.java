package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8xN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202438xN extends AbstractC130945vi implements C5RR, InterfaceC133125ze {
    public ABF A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final UserSession A08;
    public final AlB A09;
    public final C216229hf A0A;
    public final C6RB A0B;
    public final C6RB A0C;
    public final C6RB A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Drawable A0H;
    public final C124385ju A0I;
    public final List A0J;

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "fundraiser_sticker_fundraiser_sticker_bundle_id";
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0J;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.A0A.draw(canvas);
        this.A0H.draw(canvas);
        this.A0D.draw(canvas);
        this.A0C.draw(canvas);
        this.A0B.draw(canvas);
        if (this.A01) {
            this.A0I.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A0G;
        C6RB c6rb = this.A0D;
        int i2 = (i + c6rb.A06) - c6rb.A08;
        int i3 = this.A04;
        int i4 = i2 - i3;
        C6RB c6rb2 = this.A0C;
        int i5 = (c6rb2.A06 - i3) + this.A0F;
        int i6 = (int) (this.A09.A00.A00 * this.A07.getResources().getDisplayMetrics().density);
        int i7 = c6rb2.A06;
        int i8 = 0;
        if (i7 < i6) {
            i8 = i6 - i7;
        }
        return this.A0A.A00 + i4 + i5 + i8 + this.A0E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        float f;
        super.setBounds(i, i2, i3, i4);
        float f2 = (i + i3) / 2.0f;
        float f3 = (i2 + i4) / 2.0f;
        float f4 = this.A06 / 2.0f;
        float f5 = f2 - f4;
        float intrinsicHeight = getIntrinsicHeight() / 2.0f;
        float f6 = f3 - intrinsicHeight;
        float f7 = f4 + f2;
        float f8 = f3 + intrinsicHeight;
        float f9 = this.A0E;
        float f10 = f8 - f9;
        float f11 = f9 + f10;
        float f12 = (f9 / 2.0f) + f10;
        C216229hf c216229hf = this.A0A;
        int i5 = c216229hf.A00;
        C6RB c6rb = this.A0D;
        int i6 = c6rb.A0A;
        int i7 = c6rb.A06;
        int i8 = c6rb.A08;
        int i9 = this.A0G;
        int i10 = ((i9 + i7) - i8) - this.A04;
        C6RB c6rb2 = this.A0C;
        int i11 = c6rb2.A0A;
        int i12 = c6rb2.A06;
        if (i12 < ((int) (this.A09.A00.A00 * this.A07.getResources().getDisplayMetrics().density))) {
            f = (r0 - i12) / 2.0f;
        } else {
            f = 0.0f;
        }
        C6RB c6rb3 = this.A0B;
        int i13 = c6rb3.A0A;
        int i14 = c6rb3.A06;
        int i15 = (int) f5;
        int i16 = (int) f7;
        c216229hf.setBounds(i15, (int) f6, i16, (int) f8);
        float f13 = i6 / 2.0f;
        float f14 = f6 + i5;
        float f15 = i9 + f14;
        float f16 = i8;
        float f17 = f14 + i10;
        c6rb.setBounds((int) (f2 - f13), (int) (f15 - f16), (int) (f13 + f2), (int) (f16 + f17));
        float f18 = i11 / 2.0f;
        c6rb2.setBounds((int) (f2 - f18), (int) (f17 + f), (int) (f18 + f2), (int) (f17 + i12 + f));
        int i17 = (int) f10;
        this.A0I.setBounds(i15, i17, i16, i17);
        this.A0H.setBounds(i15, i17, i16, (int) f11);
        float f19 = i13 / 2.0f;
        float f20 = i14 / 2.0f;
        c6rb3.setBounds((int) (f2 - f19), (int) (f12 - f20), (int) (f2 + f19), (int) (f12 + f20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0134, code lost:
    
        if (r7 == r2[1]) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202438xN(android.content.Context r15, com.instagram.common.session.UserSession r16, X.AlB r17) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202438xN.<init>(android.content.Context, com.instagram.common.session.UserSession, X.AlB):void");
    }
}
