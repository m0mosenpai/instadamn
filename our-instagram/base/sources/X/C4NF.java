package X;

/* renamed from: X.4NF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NF extends C1KR {
    public final boolean A00;

    public C4NF(C1KO c1ko, String str, long j, boolean z) {
        super(c1ko, "NO_ID", str, j);
        this.A00 = z;
    }

    @Override // X.C1KP
    public final String A00() {
        if (this.A00) {
            return "log out";
        }
        return "account switch";
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.A00) {
            sb = new StringBuilder();
            str = "Logged out at ";
        } else {
            sb = new StringBuilder();
            str = "Account switch at ";
        }
        sb.append(str);
        sb.append(((C1KP) this).A00);
        return sb.toString();
    }
}
