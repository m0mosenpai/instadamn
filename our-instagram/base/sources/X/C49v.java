package X;

/* renamed from: X.49v, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49v extends C1KO implements C49u {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public C49v(String str, float f, float f2, int i, int i2, long j) {
        super(str, j, j);
        this.A02 = i;
        this.A03 = i2;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.C1KO, X.C1KP
    public final String A00() {
        return "touch down";
    }

    @Override // X.C1KO
    public final String toString() {
        String str;
        int i = this.A03;
        if (i > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.A02);
            sb.append('/');
            sb.append(i);
            sb.append(')');
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("touch down");
        sb2.append(str);
        sb2.append(" on ");
        sb2.append(super.A01);
        sb2.append(" at ");
        sb2.append(((C1KP) this).A00);
        sb2.append(", downtime at ");
        sb2.append(((C1KO) this).A00);
        return sb2.toString();
    }
}
