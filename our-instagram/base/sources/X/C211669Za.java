package X;

/* renamed from: X.9Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211669Za extends C0T6 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211669Za) {
                C211669Za c211669Za = (C211669Za) obj;
                if (!C14360o3.A0K(this.A06, c211669Za.A06) || !C14360o3.A0K(this.A04, c211669Za.A04) || this.A00 != c211669Za.A00 || this.A01 != c211669Za.A01 || !C14360o3.A0K(this.A02, c211669Za.A02) || !C14360o3.A0K(this.A03, c211669Za.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A01, (AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A06)) + this.A00) * 31);
        int i = 0;
        int A0O = (A07 + AbstractC167017dG.A0O(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public C211669Za(String str, String str2, String str3, String str4, int i, long j) {
        this.A06 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = str3;
        this.A03 = str4;
        this.A05 = AnonymousClass001.A0G(str2, '_', i);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserInClipsTogetherState(userId=");
        A1C.append(this.A06);
        A1C.append(", surfaceId=");
        A1C.append(this.A04);
        A1C.append(", surfaceType=");
        A1C.append(this.A00);
        A1C.append(", capabilities=");
        A1C.append(this.A01);
        A1C.append(", clipId=");
        A1C.append(this.A02);
        A1C.append(", publishTimestamp=");
        A1C.append(this.A03);
        return AbstractC167017dG.A0p(A1C);
    }
}
