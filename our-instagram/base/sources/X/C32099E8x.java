package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.E8x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32099E8x extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public C32099E8x(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        AbstractC25233BEq.A0x(1, str, str2, str3);
        this.A08 = str;
        this.A02 = imageUrl;
        this.A01 = imageUrl2;
        this.A07 = str2;
        this.A04 = str3;
        this.A0A = z;
        this.A09 = z2;
        this.A03 = num;
        this.A00 = i;
        this.A05 = str4;
        this.A06 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32099E8x) {
                C32099E8x c32099E8x = (C32099E8x) obj;
                if (!C14360o3.A0K(this.A08, c32099E8x.A08) || !C14360o3.A0K(this.A02, c32099E8x.A02) || !C14360o3.A0K(this.A01, c32099E8x.A01) || !C14360o3.A0K(this.A07, c32099E8x.A07) || !C14360o3.A0K(this.A04, c32099E8x.A04) || this.A0A != c32099E8x.A0A || this.A09 != c32099E8x.A09 || !C14360o3.A0K(this.A03, c32099E8x.A03) || this.A00 != c32099E8x.A00 || !C14360o3.A0K(this.A05, c32099E8x.A05) || !C14360o3.A0K(this.A06, c32099E8x.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A07, (((AbstractC166987dD.A0J(this.A08) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31)))) + AbstractC167017dG.A0M(this.A03)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
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
        A1C.append("ChannelDiscoveryInvitesRowViewModel(threadTitle=");
        AbstractC25235BEs.A1K(A1C, this.A08);
        A1C.append(this.A02);
        A1C.append(", backgroundImageUrl=");
        A1C.append(this.A01);
        A1C.append(", threadId=");
        A1C.append(this.A07);
        A1C.append(", creatorUsername=");
        A1C.append(this.A04);
        A1C.append(", showVerifiedBadge=");
        A1C.append(this.A0A);
        A1C.append(", showUnreadBadge=");
        A1C.append(this.A09);
        A1C.append(", threadSubtype=");
        A1C.append(this.A03);
        A1C.append(", position=");
        A1C.append(this.A00);
        A1C.append(", inviteLink=");
        A1C.append(this.A05);
        A1C.append(", scInviteId=");
        return AbstractC25236BEt.A0Y(this.A06, A1C);
    }
}
