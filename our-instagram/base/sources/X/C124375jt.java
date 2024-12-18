package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.R;

/* renamed from: X.5jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124375jt implements InterfaceC55932he {
    public static final C55942hf A09 = C55942hf.A04(80.0d, 10.0d);
    public boolean A00;
    public boolean A01;
    public float A02;
    public boolean A03;
    public boolean A04;
    public final C55982hj A05;
    public final C124385ju A06;
    public final int A07;
    public final int A08;

    public C124375jt(Context context, C55952hg c55952hg, Integer num) {
        int i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A08 = context.getColor(R.color.cyan_5);
        this.A07 = context.getColor(R.color.design_dark_default_color_on_background);
        float f = dimensionPixelSize;
        switch (num.intValue()) {
            case 0:
                i = 16;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 48;
                break;
            case 3:
                i = 80;
                break;
            case 4:
                i = 3;
                break;
            default:
                i = 5;
                break;
        }
        this.A06 = new C124385ju(context, f, R.color.cyan_5, i);
        C55982hj A02 = c55952hg.A02();
        A02.A06 = true;
        A02.A0A(this);
        A02.A09(A09);
        this.A05 = A02;
        this.A03 = true;
        A02.A0A(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r9.A00 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (java.lang.Math.abs(r15) < 0.5f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(float r10, float r11, boolean r12, boolean r13, float r14, float r15, float r16) {
        /*
            r9 = this;
            r3 = 0
            if (r12 != 0) goto L8
            boolean r0 = r9.A00
            r8 = 0
            if (r0 == 0) goto L9
        L8:
            r8 = 1
        L9:
            boolean r5 = r9.A00
            boolean r0 = r9.A03
            if (r0 == 0) goto L1a
            float r1 = java.lang.Math.abs(r15)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r7 = 0
            if (r0 >= 0) goto L1b
        L1a:
            r7 = 1
        L1b:
            r6 = 925353388(0x3727c5ac, float:1.0E-5)
            r4 = 1
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L25
            r2 = 1
        L25:
            float r1 = r10 - r6
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L31
            float r0 = r10 + r6
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3a
        L31:
            float r10 = r10 + r6
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 <= 0) goto L6a
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 > 0) goto L6a
        L3a:
            r0 = 1
        L3b:
            if (r8 == 0) goto L68
            if (r7 == 0) goto L68
            if (r0 != 0) goto L47
            if (r2 != 0) goto L45
            if (r5 == 0) goto L68
        L45:
            if (r13 == 0) goto L68
        L47:
            r9.A00 = r4
            r5 = r16
            r9.A02 = r5
            X.2hj r2 = r9.A05
            if (r4 == 0) goto L65
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L53:
            r2.A06(r0)
            r0 = 1117126656(0x42960000, float:75.0)
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 >= 0) goto L62
            r0 = 0
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 <= 0) goto L62
            r3 = 1
        L62:
            r9.A04 = r3
            return
        L65:
            r0 = 0
            goto L53
        L68:
            r4 = 0
            goto L47
        L6a:
            r0 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124375jt.A01(float, float, boolean, boolean, float, float, float):void");
    }

    public final void A02(Canvas canvas) {
        C124385ju c124385ju;
        double d = this.A05.A09.A00;
        boolean z = this.A01;
        if (d > 0.0d) {
            if (z) {
                this.A06.A08.setColor(this.A08);
            }
            c124385ju = this.A06;
        } else {
            if (!z || !this.A04 || this.A00) {
                return;
            }
            c124385ju = this.A06;
            c124385ju.A08.setColor(this.A07);
            c124385ju.setAlpha(Math.max(((int) (255.0f * ((100.0f - this.A02) / 100.0f))) - 80, 0));
        }
        c124385ju.draw(canvas);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj.A09.A00 == 1.0d) {
            C2UY.A01.A05(5L);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (C14360o3.A0K(this.A05, c55982hj)) {
            this.A06.setAlpha((int) AbstractC70163Da.A04(c55982hj.A09.A00, 0.0d, 1.0d, 0.0d, 255.0d));
        }
    }

    public final void A00() {
        this.A05.A05(0.0d);
        this.A04 = false;
        this.A00 = false;
        this.A02 = 0.0f;
    }

    public final void A03(Rect rect) {
        C124385ju c124385ju = this.A06;
        c124385ju.setBounds(rect);
        int i = rect.left;
        int i2 = rect.top;
        c124385ju.A01 = i;
        c124385ju.A02 = i2;
    }

    public final void A04(boolean z) {
        double d;
        C55982hj c55982hj = this.A05;
        if (z) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        c55982hj.A06(d);
    }
}
