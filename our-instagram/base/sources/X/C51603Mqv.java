package X;

/* renamed from: X.Mqv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51603Mqv extends C0T6 {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51603Mqv) {
                C51603Mqv c51603Mqv = (C51603Mqv) obj;
                if (!C14360o3.A0K(this.A03, c51603Mqv.A03) || !C14360o3.A0K(this.A02, c51603Mqv.A02) || this.A00 != c51603Mqv.A00 || this.A01 != c51603Mqv.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03)));
        long j = this.A01;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public C51603Mqv(long j, String str, long j2, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = j2;
    }
}
