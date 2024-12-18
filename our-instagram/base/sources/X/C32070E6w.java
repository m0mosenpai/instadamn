package X;

import com.facebook.R;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;

/* renamed from: X.E6w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32070E6w extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C32070E6w(C5QE c5qe, String str, String str2, String str3, String str4, int i, boolean z) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A02 = c5qe;
        this.A07 = z;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C32070E6w) {
                    C32070E6w c32070E6w = (C32070E6w) obj;
                    if (c32070E6w.A00 != 1 || !C14360o3.A0K(this.A03, c32070E6w.A03) || !C14360o3.A0K(this.A05, c32070E6w.A05) || this.A02 != c32070E6w.A02 || !C14360o3.A0K(this.A06, c32070E6w.A06) || this.A01 != c32070E6w.A01 || this.A07 != c32070E6w.A07 || !C14360o3.A0K(this.A04, c32070E6w.A04)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C32070E6w)) {
                return false;
            }
            C32070E6w c32070E6w2 = (C32070E6w) obj;
            if (c32070E6w2.A00 != 0 || !C14360o3.A0K(this.A05, c32070E6w2.A05) || !C14360o3.A0K(this.A04, c32070E6w2.A04) || !C14360o3.A0K(this.A06, c32070E6w2.A06) || !C14360o3.A0K(this.A03, c32070E6w2.A03) || !C14360o3.A0K(this.A02, c32070E6w2.A02) || this.A07 != c32070E6w2.A07 || this.A01 != c32070E6w2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int i;
        if (this.A00 != 0) {
            A0D = AbstractC167007dF.A0D(this.A07, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A02, (AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0O(this.A05)) * 31)) + this.A01) * 31);
            i = AbstractC25227BEk.A07(this.A04);
        } else {
            A0D = AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A05))))));
            i = this.A01;
        }
        return A0D + i;
    }

    public C32070E6w(IgUserBioLinkTypeEnum igUserBioLinkTypeEnum, String str, String str2, String str3, String str4, int i, boolean z) {
        AbstractC167007dF.A1E(str, 1, igUserBioLinkTypeEnum);
        this.A03 = str;
        this.A05 = str2;
        this.A02 = igUserBioLinkTypeEnum;
        this.A06 = str3;
        this.A01 = i;
        this.A07 = z;
        this.A04 = str4;
    }

    public C32070E6w(IgUserBioLinkTypeEnum igUserBioLinkTypeEnum, String str, String str2, String str3) {
        this(igUserBioLinkTypeEnum, str, str2, str3, (String) null, R.drawable.instagram_facebook_circle_pano_outline_24, true);
    }
}
