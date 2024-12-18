package X;

/* renamed from: X.2Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49722Qf {
    public final C49732Qg A00;
    public final java.util.Set A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49722Qf) {
                C49722Qf c49722Qf = (C49722Qf) obj;
                if (!C14360o3.A0K(this.A00, c49722Qf.A00) || !C14360o3.A0K(this.A01, c49722Qf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TDFAppDeviceRegistrationInfo(pubKey=");
        sb.append(this.A00);
        sb.append(", registeredUsers=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C49722Qf(C49732Qg c49732Qg, java.util.Set set) {
        this.A00 = c49732Qg;
        this.A01 = set;
    }

    public C49722Qf() {
        this(new C49732Qg("", C05F.A00), C16910sj.A00);
    }
}
