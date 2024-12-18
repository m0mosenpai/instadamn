package X;

/* renamed from: X.VsP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69622VsP {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append("/");
        sb.append(this.A02);
        sb.append("/");
        sb.append(this.A00);
        sb.append("/");
        sb.append(this.A01);
        sb.append("/");
        sb.append(this.A04);
        sb.append("/");
        sb.append(this.A05);
        return AbstractC166987dD.A19(sb);
    }

    public C69622VsP(String str, String str2, long j, long j2, boolean z, boolean z2) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = z;
        this.A05 = z2;
    }
}
