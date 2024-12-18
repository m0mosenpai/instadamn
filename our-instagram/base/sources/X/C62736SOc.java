package X;

/* renamed from: X.SOc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62736SOc {
    public final C67524UnO A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62736SOc) {
                C62736SOc c62736SOc = (C62736SOc) obj;
                if (!C14360o3.A0K(this.A01, c62736SOc.A01) || !C14360o3.A0K(this.A00, c62736SOc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }

    public C62736SOc(C67524UnO c67524UnO, String str) {
        this.A01 = str;
        this.A00 = c67524UnO;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FBPayFullNameComponent(payerName=");
        A1C.append(this.A01);
        A1C.append(", fullNameFieldConfig=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
