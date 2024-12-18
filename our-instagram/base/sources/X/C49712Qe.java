package X;

/* renamed from: X.2Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49712Qe {
    public final C49722Qf A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C49712Qe) && C14360o3.A0K(this.A00, ((C49712Qe) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrustedDeviceCacheData(registrationInfo=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C49712Qe(C49722Qf c49722Qf) {
        this.A00 = c49722Qf;
    }

    public C49712Qe() {
        this(new C49722Qf(new C49732Qg("", C05F.A00), C16910sj.A00));
    }
}
