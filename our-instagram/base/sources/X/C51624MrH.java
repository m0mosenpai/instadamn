package X;

import com.instagram.share.facebook.model.FBReelsAudienceType;

/* renamed from: X.MrH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51624MrH extends C0T6 {
    public final EnumC53299Nhb A00;
    public final FBReelsAudienceType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C51624MrH(EnumC53299Nhb enumC53299Nhb, FBReelsAudienceType fBReelsAudienceType, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1S(str2, str3);
        this.A02 = str;
        this.A01 = fBReelsAudienceType;
        this.A06 = true;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = enumC53299Nhb;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51624MrH) {
                C51624MrH c51624MrH = (C51624MrH) obj;
                if (!C14360o3.A0K(this.A02, c51624MrH.A02) || this.A01 != c51624MrH.A01 || this.A06 != c51624MrH.A06 || !C14360o3.A0K(this.A03, c51624MrH.A03) || !C14360o3.A0K(this.A04, c51624MrH.A04) || !C14360o3.A0K(this.A05, c51624MrH.A05) || this.A00 != c51624MrH.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02))))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
