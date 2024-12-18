package X;

/* renamed from: X.19U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19U {
    public final long A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        String str = this.A02;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" : ");
        long j = this.A00;
        if (str == null) {
            sb.append(j);
        } else {
            sb.append(j);
            sb.append(" : ");
            sb.append(str);
        }
        return sb.toString();
    }

    public C19U(String str, long j, String str2) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = str2;
    }
}
