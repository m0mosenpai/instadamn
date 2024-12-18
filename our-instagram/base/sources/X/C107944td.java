package X;

/* renamed from: X.4td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107944td extends C1KO {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public C107944td(String str, float f, float f2, int i, int i2, long j, long j2, boolean z) {
        super(str, j, j2);
        this.A02 = i;
        this.A03 = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = z;
    }

    @Override // X.C1KO, X.C1KP
    public final String A00() {
        return "touch up";
    }

    @Override // X.C1KO
    public final String toString() {
        String str;
        String str2;
        if (this.A04) {
            str = "gesture canceled";
        } else {
            str = "touch up";
        }
        int i = this.A03;
        if (i > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.A02);
            sb.append('/');
            sb.append(i);
            sb.append(')');
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(" on ");
        sb2.append(super.A01);
        sb2.append(" at ");
        sb2.append(((C1KP) this).A00);
        sb2.append(", downtime at ");
        sb2.append(((C1KO) this).A00);
        return sb2.toString();
    }
}
