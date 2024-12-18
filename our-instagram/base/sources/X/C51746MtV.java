package X;

import java.util.List;

/* renamed from: X.MtV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51746MtV extends C0T6 {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;
    public final String A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51746MtV(List list) {
        this(list, 0, (String) null, (String) null, 5);
        this.A03 = 5;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51746MtV) && ((C51746MtV) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L5c;
                case 3: goto L60;
                case 4: goto L80;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto Lb2
            r0 = 5
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2a
            X.MtV r3 = (X.C51746MtV) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L2a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L24:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto La6
        L2a:
            r0 = 0
            return r0
        L2c:
            if (r2 == r3) goto Lb2
            r0 = 1
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2a
            X.MtV r3 = (X.C51746MtV) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto Lb2
            goto L2a
        L5c:
            if (r2 == r3) goto Lb2
            r0 = 2
            goto L63
        L60:
            if (r2 == r3) goto Lb2
            r0 = 3
        L63:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2a
            X.MtV r3 = (X.C51746MtV) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L2a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L24
        L80:
            if (r2 == r3) goto Lb2
            r0 = 4
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2a
            X.MtV r3 = (X.C51746MtV) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto La6
            goto L2a
        La6:
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lb2
            goto L2a
        Lb2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51746MtV.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0M;
        int A07;
        int A0J;
        int i;
        switch (this.A03) {
            case 1:
                A07 = (((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31;
                A0M = this.A00;
                break;
            case 2:
            case 3:
            default:
                A0J = (AbstractC166987dD.A0J(this.A02) + this.A00) * 31;
                i = this.A01.hashCode();
                A07 = (A0J + i) * 31;
                A0M = this.A04.hashCode();
                break;
            case 4:
                A0J = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02));
                i = this.A00;
                A07 = (A0J + i) * 31;
                A0M = this.A04.hashCode();
                break;
            case 5:
                A0M = ((((AbstractC167017dG.A0M(this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
                A07 = AbstractC25227BEk.A07(this.A04);
                break;
        }
        return A0M + A07;
    }

    public final String toString() {
        if (5 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductOnboardingStepsData(productOnboardingNextStepInfo=");
        A1C.append(this.A01);
        A1C.append(", currentStepIndex=");
        A1C.append(this.A00);
        A1C.append(", onboardingIntroVideoUrl=");
        A1C.append(this.A02);
        A1C.append(", taxInfoDescription=");
        return AbstractC25236BEt.A0Y(this.A04, A1C);
    }

    public C51746MtV(List list, int i, String str, String str2, int i2) {
        this.A03 = 5;
        this.A01 = list;
        this.A00 = 0;
        this.A02 = str;
        this.A04 = str2;
    }

    public C51746MtV(String str, String str2, List list, int i, int i2) {
        this.A03 = i2;
        AbstractC25233BEq.A0w(1, str, list, str2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = list;
        this.A04 = str2;
    }

    public C51746MtV(String str, List list, int i, String str2, int i2) {
        this.A03 = 4;
        AbstractC167017dG.A1P(str, list);
        C14360o3.A0B(str2, 4);
        this.A02 = str;
        this.A01 = list;
        this.A00 = i;
        this.A04 = str2;
    }

    public C51746MtV() {
        this.A03 = 1;
        C5HZ c5hz = C5HZ.A01;
        this.A03 = 1;
        C14360o3.A0B(c5hz, 1);
        this.A01 = c5hz;
        this.A02 = null;
        this.A04 = null;
        this.A00 = 0;
    }
}
