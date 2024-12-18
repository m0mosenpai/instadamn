package X;

import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.user.model.User;

/* renamed from: X.9CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CC extends C0T6 implements InterfaceC166427cB {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C9CC(C38891rO c38891rO, String str, String str2) {
        this.A01 = c38891rO;
        this.A02 = str;
        this.A03 = str2;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9CC) && ((C9CC) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L30;
                case 1: goto L34;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L58
            r0 = 2
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2e
            X.9CC r3 = (X.C9CC) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L28:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L58
        L2e:
            r0 = 0
            return r0
        L30:
            if (r2 == r3) goto L58
            r0 = 0
            goto L37
        L34:
            if (r2 == r3) goto L58
            r0 = 1
        L37:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L2e
            X.9CC r3 = (X.C9CC) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L28
        L58:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CC.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int i2;
        int hashCode2;
        switch (this.A00) {
            case 0:
                i = ((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31;
                Object obj = this.A01;
                if (obj == null) {
                    i2 = 0;
                    break;
                } else {
                    i2 = obj.hashCode();
                    break;
                }
            case 1:
                int hashCode3 = this.A02.hashCode() * 31;
                String str = this.A03;
                i = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                i2 = (hashCode3 + hashCode) * 31;
                Object obj2 = this.A01;
                if (obj2 != null) {
                    i = obj2.hashCode();
                    break;
                }
                break;
            default:
                Object obj3 = this.A01;
                i = 0;
                if (obj3 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj3.hashCode();
                }
                i2 = ((hashCode2 * 31) + this.A02.hashCode()) * 31;
                String str2 = this.A03;
                if (str2 != null) {
                    i = str2.hashCode();
                    break;
                }
                break;
        }
        return i + i2;
    }

    public C9CC(UserPayFanclubUpsellParams userPayFanclubUpsellParams, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = userPayFanclubUpsellParams;
    }

    public C9CC(User user, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = user;
    }
}
