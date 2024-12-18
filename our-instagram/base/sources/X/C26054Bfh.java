package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bfh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26054Bfh extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C26054Bfh(C52020MzZ c52020MzZ, O1Z o1z, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        AbstractC167017dG.A1Q(str, str3);
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = c52020MzZ;
        this.A01 = interfaceC16820sZ;
        this.A02 = o1z;
        this.A03 = interfaceC16660sJ;
        this.A09 = z;
        this.A04 = interfaceC16820sZ2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26054Bfh) {
                    C26054Bfh c26054Bfh = (C26054Bfh) obj;
                    if (c26054Bfh.A00 == 1 && this.A09 == c26054Bfh.A09 && C14360o3.A0K(this.A07, c26054Bfh.A07) && C14360o3.A0K(this.A08, c26054Bfh.A08) && C14360o3.A0K(this.A03, c26054Bfh.A03) && C14360o3.A0K(this.A06, c26054Bfh.A06) && C14360o3.A0K(this.A02, c26054Bfh.A02) && C14360o3.A0K(this.A04, c26054Bfh.A04) && C14360o3.A0K(this.A05, c26054Bfh.A05)) {
                        obj2 = this.A01;
                        obj3 = c26054Bfh.A01;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C26054Bfh)) {
                return false;
            }
            C26054Bfh c26054Bfh2 = (C26054Bfh) obj;
            if (c26054Bfh2.A00 != 0 || !C14360o3.A0K(this.A06, c26054Bfh2.A06) || !C14360o3.A0K(this.A07, c26054Bfh2.A07) || !C14360o3.A0K(this.A08, c26054Bfh2.A08) || !C14360o3.A0K(this.A05, c26054Bfh2.A05) || !C14360o3.A0K(this.A01, c26054Bfh2.A01) || !C14360o3.A0K(this.A02, c26054Bfh2.A02) || !C14360o3.A0K(this.A03, c26054Bfh2.A03) || this.A09 != c26054Bfh2.A09) {
                return false;
            }
            obj2 = this.A04;
            obj3 = c26054Bfh2.A04;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int A0M;
        if (this.A00 != 0) {
            A0M = (((AbstractC166997dE.A0J(this.A02, (((((AbstractC166997dE.A0K(this.A07, AbstractC25225BEi.A08(this.A09)) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31;
            A0D = AbstractC166997dE.A0I(this.A01);
        } else {
            A0D = AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A06))))))));
            A0M = AbstractC167017dG.A0M(this.A04);
        }
        return A0D + A0M;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UiState(isLoaded=");
        A1C.append(this.A09);
        A1C.append(MSV.A00(298));
        A1C.append(this.A07);
        A1C.append(", username=");
        A1C.append(this.A08);
        A1C.append(", userProfilePictureUrl=");
        A1C.append(this.A03);
        A1C.append(", formattedCount=");
        A1C.append(this.A06);
        A1C.append(", thumbnailUrl=");
        A1C.append(this.A02);
        A1C.append(", usernameAttributionContentRes=");
        A1C.append(this.A04);
        A1C.append(", usernamePlaceholderContentRes=");
        A1C.append(this.A05);
        A1C.append(", isUsernameVerified=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C26054Bfh(C69749Vuj c69749Vuj, C69749Vuj c69749Vuj2, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, String str, String str2, String str3, boolean z) {
        AbstractC25229BEm.A1I(str, 2, imageUrl2);
        this.A09 = z;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = imageUrl;
        this.A06 = str3;
        this.A02 = imageUrl2;
        this.A04 = c69749Vuj;
        this.A05 = c69749Vuj2;
        this.A01 = bool;
    }
}
