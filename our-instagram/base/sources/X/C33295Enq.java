package X;

/* renamed from: X.Enq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33295Enq extends AbstractC33573Esl {
    public final int A00;
    public final InterfaceC38371qR A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33295Enq) {
                C33295Enq c33295Enq = (C33295Enq) obj;
                if (!C14360o3.A0K(this.A02, c33295Enq.A02) || this.A06 != c33295Enq.A06 || this.A00 != c33295Enq.A00 || !C14360o3.A0K(this.A01, c33295Enq.A01) || !C14360o3.A0K(this.A03, c33295Enq.A03) || !C14360o3.A0K(this.A04, c33295Enq.A04) || !C14360o3.A0K(this.A05, c33295Enq.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC167007dF.A0D(this.A06, AbstractC166987dD.A0J(this.A02)) + this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public C33295Enq(InterfaceC38371qR interfaceC38371qR, String str, String str2, String str3, String str4, int i, boolean z) {
        this.A02 = str;
        this.A06 = z;
        this.A00 = i;
        this.A01 = interfaceC38371qR;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }
}
