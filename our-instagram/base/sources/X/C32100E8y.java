package X;

/* renamed from: X.E8y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32100E8y extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final EnumC33424Epv A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final String A0A;

    public C32100E8y(EnumC33424Epv enumC33424Epv, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z) {
        AbstractC167007dF.A1F(str, 1, str4);
        this.A08 = str;
        this.A0A = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A04 = str5;
        this.A06 = str6;
        this.A00 = i;
        this.A09 = z;
        this.A03 = num;
        this.A02 = enumC33424Epv;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32100E8y) {
                C32100E8y c32100E8y = (C32100E8y) obj;
                if (!C14360o3.A0K(this.A08, c32100E8y.A08) || !C14360o3.A0K(this.A0A, c32100E8y.A0A) || !C14360o3.A0K(this.A05, c32100E8y.A05) || !C14360o3.A0K(this.A07, c32100E8y.A07) || !C14360o3.A0K(this.A04, c32100E8y.A04) || !C14360o3.A0K(this.A06, c32100E8y.A06) || this.A00 != c32100E8y.A00 || this.A09 != c32100E8y.A09 || !C14360o3.A0K(this.A03, c32100E8y.A03) || this.A02 != c32100E8y.A02 || this.A01 != c32100E8y.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, (AbstractC167007dF.A0D(this.A09, (((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A0A, AbstractC166987dD.A0J(this.A08))))) + AbstractC167017dG.A0O(this.A06)) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A03)) * 31) + this.A01;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ChannelDiscoverySuggestionsRowViewModel(threadTitle=");
        A1C.append(this.A08);
        A1C.append(", subtitle=");
        AbstractC25235BEs.A1K(A1C, this.A0A);
        A1C.append(this.A05);
        A1C.append(", threadId=");
        A1C.append(this.A07);
        A1C.append(", creatorUsername=");
        A1C.append(this.A04);
        A1C.append(", socialContextUsername=");
        A1C.append(this.A06);
        A1C.append(", memberCount=");
        A1C.append(this.A00);
        A1C.append(", showVerifiedBadge=");
        A1C.append(this.A09);
        A1C.append(", threadSubtype=");
        A1C.append(this.A03);
        A1C.append(", searchSurface=");
        A1C.append(this.A02);
        A1C.append(", position=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
