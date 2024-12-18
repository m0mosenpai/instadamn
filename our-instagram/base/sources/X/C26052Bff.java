package X;

/* renamed from: X.Bff, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26052Bff extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26052Bff) {
                C26052Bff c26052Bff = (C26052Bff) obj;
                if (!C14360o3.A0K(this.A02, c26052Bff.A02) || !C14360o3.A0K(this.A03, c26052Bff.A03) || !C14360o3.A0K(this.A01, c26052Bff.A01) || this.A06 != c26052Bff.A06 || this.A00 != c26052Bff.A00 || !C14360o3.A0K(this.A04, c26052Bff.A04) || this.A05 != c26052Bff.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (((AbstractC167007dF.A0D(this.A06, ((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + this.A00) * 31) + AbstractC25227BEk.A07(this.A04)) * 31);
    }

    public C26052Bff(String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A06 = z;
        this.A00 = i;
        this.A04 = str4;
        this.A05 = z2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UiState(spinsAuthorName=");
        A1C.append(this.A02);
        A1C.append(", spinsContent=");
        A1C.append(this.A03);
        A1C.append(MSV.A00(133));
        A1C.append(this.A01);
        A1C.append(", isSpinsLiked=");
        A1C.append(this.A06);
        A1C.append(AbstractC111324zv.A00(570));
        A1C.append(this.A00);
        A1C.append(", timeStampText=");
        A1C.append(this.A04);
        A1C.append(", isSpinAuthorReachable=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }

    public C26052Bff() {
        this(null, null, null, null, 0, false, false);
    }
}
