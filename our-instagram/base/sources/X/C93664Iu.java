package X;

/* renamed from: X.4Iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93664Iu {
    public final double A00;
    public final double A01;
    public final double A02;
    public final String A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(this.A01);
        sb.append(", csvqm=");
        sb.append(C2BN.A00(1L, this.A00));
        sb.append(", uumos=");
        sb.append(C2BN.A00(1L, this.A02));
        sb.append(" (");
        sb.append(this.A03);
        sb.append(")}");
        return sb.toString();
    }

    public C93664Iu(String str, double d, double d2, double d3) {
        this.A01 = d;
        this.A00 = d2;
        this.A02 = d3;
        this.A03 = str;
    }
}
