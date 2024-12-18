package X;

import android.view.ViewGroup;

/* renamed from: X.7Ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159777Ep {
    public final /* synthetic */ C159737El A00;

    public C159777Ep(C159737El c159737El) {
        this.A00 = c159737El;
    }

    public final void A00() {
        C159737El.A0p(this.A00, false, false);
    }

    public final void A01() {
        ViewGroup viewGroup;
        C159737El c159737El = this.A00;
        C7IK c7ik = c159737El.A0U;
        C160607Hu c160607Hu = c159737El.A0t;
        if (c160607Hu != null && c7ik != null && (viewGroup = c160607Hu.A02) != null && viewGroup.getVisibility() == 8) {
            ViewGroup viewGroup2 = c160607Hu.A02;
            if (viewGroup2 != null) {
                if (viewGroup2.getVisibility() == 8) {
                    ViewGroup viewGroup3 = c160607Hu.A02;
                    if (viewGroup3 != null) {
                        AbstractC125325le A01 = AbstractC125325le.A01(viewGroup3, 0);
                        A01.A0G();
                        AbstractC125325le A0A = A01.A0A();
                        A0A.A0T(c160607Hu.A00, 0.0f);
                        A0A.A04 = 0;
                        A0A.A0H();
                    }
                }
                C159737El.A0h(c159737El, c7ik.A02);
                c159737El.A1B = true;
                return;
            }
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r1 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r2 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1.A02() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r1.A00 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(boolean r8) {
        /*
            r7 = this;
            X.7El r5 = r7.A00
            X.7Hp r1 = r5.A0c
            r0 = 1
            if (r1 == 0) goto Le
            boolean r1 = r1.A02()
            r6 = 1
            if (r1 != 0) goto Lf
        Le:
            r6 = 0
        Lf:
            X.FcE r1 = r5.A0S
            if (r1 == 0) goto L18
            android.view.ViewGroup r1 = r1.A00
            r4 = 1
            if (r1 != 0) goto L19
        L18:
            r4 = 0
        L19:
            android.view.ViewGroup r3 = r5.A1V
            r2 = 2131437240(0x7f0b26b8, float:1.8496373E38)
            android.view.View r1 = r3.findViewById(r2)
            if (r1 == 0) goto L2f
            android.view.View r1 = r3.findViewById(r2)
            int r1 = r1.getVisibility()
            r3 = 1
            if (r1 == 0) goto L30
        L2f:
            r3 = 0
        L30:
            X.7Hw r1 = r5.A0h
            if (r1 == 0) goto L3b
            boolean r2 = r1.A03()
            r1 = 1
            if (r2 != 0) goto L3c
        L3b:
            r1 = 0
        L3c:
            if (r6 == 0) goto L54
            if (r4 != 0) goto L5b
            if (r3 != 0) goto L5b
            if (r1 != 0) goto L5b
            if (r8 == 0) goto L5b
            com.instagram.common.session.UserSession r3 = r5.A1Z
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314034387159424(0x81036c00020980, double:3.028479799094716E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            return r0
        L54:
            if (r4 != 0) goto L5b
            if (r3 != 0) goto L5b
            if (r1 != 0) goto L5b
            return r0
        L5b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159777Ep.A02(boolean):boolean");
    }
}
