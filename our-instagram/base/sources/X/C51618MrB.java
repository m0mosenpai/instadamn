package X;

/* renamed from: X.MrB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51618MrB extends C0T6 {
    public final int A00;
    public final long A01;
    public final C167987et A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C51618MrB(C167987et c167987et, String str, String str2, int i, long j, boolean z) {
        C14360o3.A0B(str2, 2);
        this.A04 = str;
        this.A03 = str2;
        this.A01 = j;
        this.A00 = i;
        this.A02 = c167987et;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51618MrB) {
                C51618MrB c51618MrB = (C51618MrB) obj;
                if (!C14360o3.A0K(this.A04, c51618MrB.A04) || !C14360o3.A0K(this.A03, c51618MrB.A03) || this.A01 != c51618MrB.A01 || this.A00 != c51618MrB.A00 || !C14360o3.A0K(this.A02, c51618MrB.A02) || this.A05 != c51618MrB.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (((AbstractC25236BEt.A01(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04))) + this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31);
    }
}
