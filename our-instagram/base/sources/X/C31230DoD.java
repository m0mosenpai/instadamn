package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.DoD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31230DoD extends C0T6 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public C31230DoD(EnumC33326EoL enumC33326EoL, List list, long j) {
        this.A00 = 0;
        AbstractC167017dG.A1R(enumC33326EoL, list);
        this.A01 = j;
        this.A02 = enumC33326EoL;
        this.A03 = list;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto La;
                case 1: goto L26;
                case 2: goto L46;
                case 3: goto L66;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r6)
            return r0
        La:
            if (r5 == r6) goto L8d
            r1 = 0
            boolean r0 = r6 instanceof X.C31230DoD
            if (r0 == 0) goto L7b
            X.DoD r6 = (X.C31230DoD) r6
            int r0 = r6.A00
            if (r0 != r1) goto L7b
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L7b
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            if (r1 == r0) goto L7d
            goto L7b
        L26:
            if (r5 == r6) goto L8d
            r1 = 1
            boolean r0 = r6 instanceof X.C31230DoD
            if (r0 == 0) goto L7b
            X.DoD r6 = (X.C31230DoD) r6
            int r0 = r6.A00
            if (r0 != r1) goto L7b
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L7b
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L82
            goto L7b
        L46:
            if (r5 == r6) goto L8d
            r1 = 2
            boolean r0 = r6 instanceof X.C31230DoD
            if (r0 == 0) goto L7b
            X.DoD r6 = (X.C31230DoD) r6
            int r0 = r6.A00
            if (r0 != r1) goto L7b
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L7b
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L82
            goto L7b
        L66:
            if (r5 == r6) goto L8d
            r1 = 3
            boolean r0 = r6 instanceof X.C31230DoD
            if (r0 == 0) goto L7b
            X.DoD r6 = (X.C31230DoD) r6
            int r0 = r6.A00
            if (r0 != r1) goto L7b
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L7d
        L7b:
            r0 = 0
            return r0
        L7d:
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            goto L86
        L82:
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
        L86:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L8d
            goto L7b
        L8d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31230DoD.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0J;
        Object obj;
        int i;
        switch (this.A00) {
            case 0:
                A0J = AbstractC166997dE.A0J(this.A02, AbstractC25235BEs.A03(this.A01));
                obj = this.A03;
                i = obj.hashCode();
                return A0J + i;
            case 1:
                A0J = AbstractC25236BEt.A01(this.A01, AbstractC167017dG.A0M(this.A03) * 31);
                obj = this.A02;
                i = obj.hashCode();
                return A0J + i;
            case 2:
                A0J = AbstractC166997dE.A0J(this.A03, AbstractC25235BEs.A03(this.A01));
                obj = this.A02;
                i = obj.hashCode();
                return A0J + i;
            case 3:
                A0J = AbstractC25235BEs.A03(this.A01);
                obj = this.A03;
                if (obj == null) {
                    i = 0;
                    return A0J + i;
                }
                i = obj.hashCode();
                return A0J + i;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("promptType: ");
        A1C.append(this.A02);
        A1C.append(" createdAt: ");
        A1C.append(this.A01);
        A1C.append(" updatedFields: ");
        return AbstractC166997dE.A0v(this.A03, A1C);
    }

    public C31230DoD(C81703kf c81703kf, long j) {
        this.A00 = 3;
        this.A01 = j;
        this.A03 = c81703kf;
        this.A02 = AbstractC09440dt.A01(new MHH(this, 25));
    }

    public C31230DoD(ImageUrl imageUrl, C38321qM c38321qM, long j) {
        this.A00 = 1;
        this.A03 = imageUrl;
        this.A01 = j;
        this.A02 = c38321qM;
    }

    public C31230DoD(DirectThreadKey directThreadKey, Integer num, long j) {
        this.A00 = 4;
        C14360o3.A0B(num, 2);
        this.A03 = directThreadKey;
        this.A02 = num;
        this.A01 = j;
    }

    public C31230DoD(C162297Or c162297Or, List list, long j) {
        this.A00 = 2;
        this.A01 = j;
        this.A03 = c162297Or;
        this.A02 = list;
    }
}
