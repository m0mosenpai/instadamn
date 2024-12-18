package X;

import java.util.List;

/* renamed from: X.Ek6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33161Ek6 extends AbstractC55145Od4 {
    public final String A00;
    public final boolean A01 = true;

    public C33161Ek6(String str) {
        this.A00 = str;
    }

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33161Ek6) {
                C33161Ek6 c33161Ek6 = (C33161Ek6) obj;
                if (!C14360o3.A0K(this.A00, c33161Ek6.A00) || this.A01 != c33161Ek6.A01) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0034. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // X.AbstractC55145Od4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r7, com.instagram.settings2.core.session.AbstractValueResolverImpl r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            java.lang.String r3 = r6.A00
            boolean r0 = r6.A01
            if (r0 == 0) goto Lbc
            X.AbstractC54195NxZ.A00()
            r4 = 0
            boolean r2 = X.AbstractC167007dF.A1R(r4, r7, r3)
            int r1 = r3.hashCode()
            switch(r1) {
                case -1684343236: goto L1f;
                case 1444832803: goto L22;
                case 1985697779: goto L29;
                case 2010491935: goto L2c;
                default: goto L15;
            }
        L15:
            android.os.Bundle r5 = X.AbstractC166987dD.A0b()
        L19:
            X.E9Z r0 = new X.E9Z
            r0.<init>(r3, r5)
            return r0
        L1f:
            r0 = 97
            goto L24
        L22:
            r0 = 39
        L24:
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L2e
        L29:
            java.lang.String r0 = "hallpass_list"
            goto L2e
        L2c:
            java.lang.String r0 = "follower_list"
        L2e:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L15
            switch(r1) {
                case -1684343236: goto L4a;
                case 1444832803: goto L64;
                case 1985697779: goto L8c;
                case 2010491935: goto L9e;
                default: goto L37;
            }
        L37:
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            r0 = 55
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L4a:
            r0 = 97
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L37
            android.os.Bundle r5 = X.AbstractC166987dD.A0b()
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            r5.putBoolean(r0, r2)
            goto Lb7
        L64:
            r0 = 39
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L37
            X.Epg r2 = X.EnumC33409Epg.SETTINGS
            android.os.Bundle r5 = X.AbstractC166987dD.A0b()
            java.lang.String r1 = "not_eligible"
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r5.putString(r0, r1)
            java.lang.String r0 = "private_story_share_to_fb"
            r5.putBoolean(r0, r4)
            java.lang.String r0 = "entry_point"
            r5.putSerializable(r0, r2)
            goto Lb7
        L8c:
            java.lang.String r0 = "hallpass_list"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L37
            android.os.Bundle r5 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = "is_from_share_cut"
            r5.putBoolean(r0, r4)
            goto Lb7
        L9e:
            java.lang.String r0 = "follower_list"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L37
            X.Dtg r2 = X.EnumC31556Dtg.A04
            java.lang.String r1 = r7.userId
            r0 = 0
            com.instagram.user.recommended.FollowListData r1 = X.AbstractC31565Dtq.A00(r2, r1, r0, r4)
            X.1XQ r0 = X.AbstractC31412DrH.A01()
            android.os.Bundle r5 = r0.AME(r7, r1, r4)
        Lb7:
            X.C14360o3.A0A(r5)
            goto L19
        Lbc:
            r5 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33161Ek6.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.1Ds):java.lang.Object");
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    @Override // X.AbstractC55145Od4
    public final InterfaceC37109GWu A05() {
        return GGY.A00;
    }

    @Override // X.AbstractC55145Od4
    public final List A08() {
        return C16930sl.A00;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append(": { ");
        A1C.append(this.A00);
        A1C.append(", hasArgumentFactory: ");
        A1C.append(this.A01);
        return AbstractC166997dE.A0x(" }", A1C);
    }
}
