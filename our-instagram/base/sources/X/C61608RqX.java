package X;

/* renamed from: X.RqX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61608RqX {
    public boolean A00;
    public boolean A01;
    public String[] A02;
    public String[] A03;

    public final void A00(String... strArr) {
        if (this.A01) {
            if (strArr.length != 0) {
                this.A02 = (String[]) strArr.clone();
                return;
            }
            throw AbstractC166987dD.A12("At least one cipher suite is required");
        }
        throw AbstractC166987dD.A14("no cipher suites for cleartext connections");
    }

    public final void A01(String... strArr) {
        if (this.A01) {
            if (strArr.length != 0) {
                this.A03 = (String[]) strArr.clone();
                return;
            }
            throw AbstractC166987dD.A12("At least one TLS version is required");
        }
        throw AbstractC166987dD.A14("no TLS versions for cleartext connections");
    }

    public final void A02(C63290Sgq... c63290SgqArr) {
        if (this.A01) {
            int length = c63290SgqArr.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = c63290SgqArr[i].A00;
            }
            A00(strArr);
            return;
        }
        throw AbstractC166987dD.A14("no cipher suites for cleartext connections");
    }

    public final void A03(RhU... rhUArr) {
        if (this.A01) {
            int length = rhUArr.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = rhUArr[i].A00;
            }
            A01(strArr);
            return;
        }
        throw AbstractC166987dD.A14("no TLS versions for cleartext connections");
    }
}
