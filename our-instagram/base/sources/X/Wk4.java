package X;

import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;

/* loaded from: classes11.dex */
public final class Wk4 implements C3CQ {
    public final int A00;
    public final Object A01;

    public Wk4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[ORIG_RETURN, RETURN] */
    @Override // X.C3CQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AJk(X.C38321qM r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L1c;
                case 1: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.A01
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r0 = (com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment) r0
            X.V2n r0 = r0.A03
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L1a
            java.lang.String r0 = r3.getId()
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
        L1c:
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            java.lang.Object r0 = r2.A01
            X.V1R r0 = (X.V1R) r0
            X.Tug r0 = r0.A07
            if (r0 != 0) goto L1a
            java.lang.String r0 = "grid"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wk4.AJk(X.1qM):boolean");
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        C66095TzW c66095TzW;
        switch (this.A00) {
            case 0:
                c66095TzW = ((V1R) this.A01).A06;
                if (c66095TzW == null) {
                    C14360o3.A0F("adapter");
                    throw C00O.createAndThrow();
                }
                break;
            case 1:
                c66095TzW = ((V1B) this.A01).A05;
                break;
            default:
                LimitedCommentsFragment limitedCommentsFragment = (LimitedCommentsFragment) this.A01;
                limitedCommentsFragment.A03.A01(limitedCommentsFragment.A01);
                return;
        }
        C66095TzW.A00(c66095TzW);
    }
}
