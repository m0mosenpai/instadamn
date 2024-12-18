package X;

/* renamed from: X.JxI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45088JxI extends C0T6 {
    public final int A00;
    public final EnumC40111tc A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45088JxI) {
                C45088JxI c45088JxI = (C45088JxI) obj;
                if (!C14360o3.A0K(this.A04, c45088JxI.A04) || this.A01 != c45088JxI.A01 || !C14360o3.A0K(this.A02, c45088JxI.A02) || !C14360o3.A0K(this.A07, c45088JxI.A07) || !C14360o3.A0K(this.A06, c45088JxI.A06) || this.A08 != c45088JxI.A08 || !C14360o3.A0K(this.A03, c45088JxI.A03) || !C14360o3.A0K(this.A05, c45088JxI.A05) || this.A00 != c45088JxI.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A08, (AbstractC166997dE.A0K(this.A07, (AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A04)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31))) + this.A00;
    }

    public C45088JxI(EnumC40111tc enumC40111tc, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        this.A04 = str;
        this.A01 = enumC40111tc;
        this.A02 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A08 = z;
        this.A03 = str5;
        this.A05 = str6;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NavigationFields(mediaId=");
        A1C.append(this.A04);
        A1C.append(MSV.A00(68));
        A1C.append(this.A01);
        A1C.append(", exploreSourceToken=");
        A1C.append(this.A02);
        A1C.append(", normalizedMediaId=");
        A1C.append(this.A07);
        A1C.append(AbstractC111324zv.A00(1436));
        A1C.append(this.A06);
        A1C.append(", isArchived=");
        A1C.append(this.A08);
        A1C.append(", mediaAuthorId=");
        A1C.append(this.A03);
        A1C.append(", messageAuthorId=");
        A1C.append(this.A05);
        A1C.append(", carouselShareIndex=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
