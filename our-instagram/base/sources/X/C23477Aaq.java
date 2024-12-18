package X;

import android.os.Handler;

/* renamed from: X.Aaq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23477Aaq implements InterfaceC55932he {
    public static final C55942hf A05 = C55942hf.A04(30.0d, 5.0d);
    public float A00;
    public final Handler A01;
    public final C55982hj A02;
    public final Runnable A03 = new RunnableC24477Asw(this);
    public final C189988bH A04;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r3.A0e != X.C05F.A00) goto L19;
     */
    @Override // X.InterfaceC55932he
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dnm(X.C55982hj r8) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            X.2hk r0 = r8.A09
            double r0 = r0.A00
            float r4 = (float) r0
            r7.A00 = r4
            X.8bH r3 = r7.A04
            X.AGt r6 = r3.A0U
            if (r6 == 0) goto L3e
            android.widget.TextView r2 = r6.A01
            r2.setAlpha(r4)
            r5 = 0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L1e
            r0 = 4
        L1e:
            r2.setVisibility(r0)
            X.2iX r2 = r6.A02
            int r1 = r2.CGb()
            r0 = 8
            if (r1 == r0) goto L3e
            android.view.View r2 = r2.getView()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 - r4
            r2.setAlpha(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            r5 = 4
        L3b:
            r2.setVisibility(r5)
        L3e:
            X.AK9 r5 = r3.A0X
            if (r5 == 0) goto L62
            boolean r0 = r3.A15
            if (r0 == 0) goto L4d
            java.lang.Integer r2 = r3.A0e
            java.lang.Integer r0 = X.C05F.A00
            r1 = 1
            if (r2 == r0) goto L4e
        L4d:
            r1 = 0
        L4e:
            boolean r0 = r5.A01
            if (r0 == 0) goto L62
            float r0 = r5.A00
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L62
            r5.A00 = r4
            if (r1 != 0) goto L5f
            X.AK9.A00(r5, r4)
        L5f:
            X.AK9.A01(r5, r4)
        L62:
            X.AlJ r0 = r3.A0Y
            if (r0 == 0) goto L7a
            X.W9A r0 = r0.A02
            if (r0 == 0) goto L7a
            X.U8b r2 = r0.A07
            r2.A01 = r4
            r1 = 1
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L75
            r1 = 3
        L75:
            r2.A0B = r1
            r2.invalidateSelf()
        L7a:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            X.AMp r1 = r3.A0Z
            if (r0 != 0) goto L8b
            if (r1 == 0) goto L8a
            boolean r0 = r1.A0B
            if (r0 == 0) goto L8a
            X.AMp.A07(r1)
        L8a:
            return
        L8b:
            if (r1 == 0) goto L8a
            boolean r0 = r1.A0B
            if (r0 == 0) goto L8a
            X.AMp.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23477Aaq.Dnm(X.2hj):void");
    }

    public C23477Aaq(C189988bH c189988bH) {
        this.A04 = c189988bH;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(A05);
        A0R.A06 = true;
        A0R.A0A(this);
        this.A02 = A0R;
        this.A01 = AbstractC167007dF.A0J();
    }
}
