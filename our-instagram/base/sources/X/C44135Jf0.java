package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jf0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44135Jf0 extends C0T6 {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C44135Jf0(C26087BgG c26087BgG, C9H2 c9h2, String str, String str2, String str3, String str4) {
        this.A03 = 3;
        this.A03 = 3;
        this.A04 = c26087BgG;
        this.A06 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A00 = c9h2;
        this.A02 = false;
        this.A07 = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        switch (this.A03) {
            case 0:
                if (this != obj) {
                    if (obj instanceof C44135Jf0) {
                        C44135Jf0 c44135Jf0 = (C44135Jf0) obj;
                        if (c44135Jf0.A03 != 0 || !C14360o3.A0K(this.A01, c44135Jf0.A01) || !C14360o3.A0K(this.A05, c44135Jf0.A05) || !C14360o3.A0K(this.A07, c44135Jf0.A07) || !C14360o3.A0K(this.A06, c44135Jf0.A06) || !C14360o3.A0K(this.A04, c44135Jf0.A04) || !C14360o3.A0K(this.A00, c44135Jf0.A00) || this.A02 != c44135Jf0.A02) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            case 1:
                if (this != obj) {
                    if (obj instanceof C44135Jf0) {
                        C44135Jf0 c44135Jf02 = (C44135Jf0) obj;
                        if (c44135Jf02.A03 == 1 && C14360o3.A0K(this.A05, c44135Jf02.A05) && C14360o3.A0K(this.A04, c44135Jf02.A04) && C14360o3.A0K(this.A06, c44135Jf02.A06) && C14360o3.A0K(this.A07, c44135Jf02.A07) && this.A02 == c44135Jf02.A02 && C14360o3.A0K(this.A00, c44135Jf02.A00)) {
                            str = this.A01;
                            str2 = c44135Jf02.A01;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            case 2:
            default:
                return super.equals(obj);
            case 3:
                if (this != obj) {
                    if (obj instanceof C44135Jf0) {
                        C44135Jf0 c44135Jf03 = (C44135Jf0) obj;
                        if (c44135Jf03.A03 == 3 && C14360o3.A0K(this.A04, c44135Jf03.A04) && C14360o3.A0K(this.A06, c44135Jf03.A06) && C14360o3.A0K(this.A01, c44135Jf03.A01) && C14360o3.A0K(this.A05, c44135Jf03.A05) && this.A00 == c44135Jf03.A00 && this.A02 == c44135Jf03.A02) {
                            str = this.A07;
                            str2 = c44135Jf03.A07;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        String str;
        switch (this.A03) {
            case 0:
                return AbstractC166987dD.A0K(this.A02, (((((AbstractC166997dE.A0K(this.A07, (AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
            case 1:
                A0D = (AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0K(this.A07, (AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A05)) + AbstractC167017dG.A0O(this.A06)) * 31)) + AbstractC167017dG.A0M(this.A00)) * 31;
                str = this.A01;
                break;
            case 2:
            default:
                return super.hashCode();
            case 3:
                A0D = AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0J(this.A00, (((((AbstractC166987dD.A0G(this.A04) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31));
                str = this.A07;
                break;
        }
        return A0D + AbstractC25227BEk.A07(str);
    }

    public C44135Jf0(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A03 = 1;
        this.A03 = 1;
        this.A05 = str;
        this.A04 = imageUrl;
        this.A06 = str2;
        this.A07 = str3;
        this.A02 = false;
        this.A00 = null;
        this.A01 = null;
    }

    public C44135Jf0(C50627MWo c50627MWo, EnumC53223NgL enumC53223NgL, String str, String str2, String str3, String str4, boolean z) {
        this.A03 = 2;
        C14360o3.A0B(str, 1);
        AbstractC167007dF.A1E(str2, 2, str3);
        this.A01 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A04 = enumC53223NgL;
        this.A02 = z;
        this.A00 = c50627MWo;
    }

    public C44135Jf0(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, boolean z) {
        this.A03 = 0;
        this.A01 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A04 = bool;
        this.A00 = bool2;
        this.A02 = z;
    }
}
