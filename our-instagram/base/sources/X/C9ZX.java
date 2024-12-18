package X;

/* renamed from: X.9ZX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZX extends C0T6 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZX) {
                C9ZX c9zx = (C9ZX) obj;
                if (!C14360o3.A0K(this.A04, c9zx.A04) || !C14360o3.A0K(this.A03, c9zx.A03) || this.A05 != c9zx.A05 || this.A00 != c9zx.A00 || !C14360o3.A0K(this.A02, c9zx.A02) || !C14360o3.A0K(this.A01, c9zx.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A00, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04))));
        int i = 0;
        int A0O = (A07 + AbstractC167017dG.A0O(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public C9ZX(String str, String str2, String str3, String str4, long j, boolean z) {
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A00 = j;
        this.A02 = str3;
        this.A01 = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserInThreadState(userId=");
        A1C.append(this.A04);
        A1C.append(", threadFbid=");
        A1C.append(this.A03);
        A1C.append(", isPresentInThread=");
        A1C.append(this.A05);
        A1C.append(", capabilities=");
        A1C.append(this.A00);
        A1C.append(", publishTimestamp=");
        A1C.append(this.A02);
        A1C.append(", igThreadId=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
