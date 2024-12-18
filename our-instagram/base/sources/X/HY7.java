package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HY7 extends C70893Gb {
    public boolean A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final Context A05;
    public final InterfaceC61642rR A06;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 == false) goto L10;
     */
    @Override // X.C70893Gb, X.AbstractC70903Gc, X.InterfaceC669530m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CoM(X.C9C3 r14, X.AnonymousClass320 r15, X.EnumC37671p4 r16, java.lang.String r17, java.lang.String r18, double r19, boolean r21) {
        /*
            r13 = this;
            r8 = r15
            r9 = r16
            X.AbstractC167017dG.A1O(r15, r9)
            r3 = 1
            r11 = r17
            r12 = r18
            if (r14 == 0) goto L7b
            boolean r0 = r14.A02
            if (r0 != r3) goto L7b
            X.1PY r1 = r13.A03
            java.util.LinkedList r0 = r1.A02
            boolean r2 = r0.isEmpty()
            boolean r0 = r13.A04
            if (r0 != 0) goto L24
            boolean r0 = r1.A09()
            r1 = 1
            if (r0 != 0) goto L25
        L24:
            r1 = 0
        L25:
            boolean r0 = r13.A00
            if (r0 == 0) goto L31
            X.0do r0 = r13.A02
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 != 0) goto L7a
        L31:
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A06
            boolean r0 = r0.get()
            if (r0 == 0) goto L7a
            X.1Pa r0 = r13.A01
            boolean r0 = r0.A01()
            if (r0 == 0) goto L7a
            if (r2 != 0) goto L45
            if (r1 == 0) goto L7a
        L45:
            r13.A00 = r3
            X.0do r2 = r13.A01
            java.lang.Object r1 = X.AbstractC166987dD.A17(r2)
            X.02i r1 = (X.C006802i) r1
            r0 = 424097382(0x19473666, float:1.02990445E-23)
            r1.markerStart(r0)
            X.0do r0 = r13.A04
            java.lang.Object r3 = r0.getValue()
            X.2rU r3 = (X.C61672rU) r3
            if (r3 == 0) goto L7a
            android.content.Context r0 = r13.A05
            android.content.Context r4 = X.AbstractC166987dD.A0O(r0)
            java.lang.Object r7 = r14.A00
            X.5d4 r7 = (X.C120595d4) r7
            java.lang.String r10 = r14.A01
            if (r10 != 0) goto L6f
            java.lang.String r10 = ""
        L6f:
            java.lang.Object r5 = X.AbstractC166987dD.A17(r2)
            X.02i r5 = (X.C006802i) r5
            X.2rR r6 = r13.A06
            r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L7a:
            return
        L7b:
            super.CoM(r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HY7.CoM(X.9C3, X.320, X.1p4, java.lang.String, java.lang.String, double, boolean):void");
    }

    public HY7(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AnonymousClass318 anonymousClass318, C3G2 c3g2, C3GX c3gx, C26191Pa c26191Pa, C31G c31g, C1PY c1py, C1M1 c1m1, String str) {
        super(context, abstractC018607g, userSession, anonymousClass318, c3g2, c3gx, c26191Pa, c31g, c1py, c1m1, str);
        this.A05 = context;
        this.A03 = AbstractC09440dt.A01(new C25027B5z(userSession, 14));
        this.A04 = AbstractC09440dt.A01(new C25027B5z(userSession, 15));
        this.A01 = AbstractC09440dt.A01(new C25027B5z(userSession, 12));
        this.A02 = AbstractC09440dt.A01(new C25027B5z(userSession, 13));
        this.A06 = new C42742Ivc(this);
    }
}
