package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.8Ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189138Ze extends C0T6 implements InterfaceC189148Zf {
    public final int A00;
    public final C44I A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C189138Ze(C44I c44i, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(c44i, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str6, 8);
        C14360o3.A0B(str7, 9);
        C14360o3.A0B(str8, 10);
        C14360o3.A0B(str9, 11);
        C14360o3.A0B(str10, 12);
        C14360o3.A0B(str11, 13);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = c44i;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A00 = i;
        this.A08 = str6;
        this.A09 = str7;
        this.A0A = str8;
        this.A0B = str9;
        this.A0C = str10;
        this.A0D = str11;
        this.A02 = user;
    }

    @Override // X.InterfaceC189148Zf
    public final C189138Ze F6s(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC189148Zf
    public final C189138Ze F6t(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C189138Ze) {
                C189138Ze c189138Ze = (C189138Ze) obj;
                if (!C14360o3.A0K(this.A03, c189138Ze.A03) || !C14360o3.A0K(this.A04, c189138Ze.A04) || !C14360o3.A0K(this.A01, c189138Ze.A01) || !C14360o3.A0K(this.A05, c189138Ze.A05) || !C14360o3.A0K(this.A06, c189138Ze.A06) || !C14360o3.A0K(this.A07, c189138Ze.A07) || this.A00 != c189138Ze.A00 || !C14360o3.A0K(this.A08, c189138Ze.A08) || !C14360o3.A0K(this.A09, c189138Ze.A09) || !C14360o3.A0K(this.A0A, c189138Ze.A0A) || !C14360o3.A0K(this.A0B, c189138Ze.A0B) || !C14360o3.A0K(this.A0C, c189138Ze.A0C) || !C14360o3.A0K(this.A0D, c189138Ze.A0D) || !C14360o3.A0K(this.A02, c189138Ze.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A06;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode3 = (((((((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.A00) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0D.hashCode()) * 31;
        User user = this.A02;
        return hashCode3 + (user != null ? user.hashCode() : 0);
    }

    @Override // X.InterfaceC189148Zf
    public final String AeK() {
        return this.A03;
    }

    @Override // X.InterfaceC189148Zf
    public final String Aj8() {
        return this.A04;
    }

    @Override // X.InterfaceC189148Zf
    public final C44I AqZ() {
        return this.A01;
    }

    @Override // X.InterfaceC189148Zf
    public final String B98() {
        return this.A06;
    }

    @Override // X.InterfaceC189148Zf
    public final String BFX() {
        return this.A07;
    }

    @Override // X.InterfaceC189148Zf
    public final int BZy() {
        return this.A00;
    }

    @Override // X.InterfaceC189148Zf
    public final String Bys() {
        return this.A09;
    }

    @Override // X.InterfaceC189148Zf
    public final String C3f() {
        return this.A0B;
    }

    @Override // X.InterfaceC189148Zf
    public final String C8x() {
        return this.A0D;
    }

    @Override // X.InterfaceC189148Zf
    public final User CDj() {
        return this.A02;
    }

    @Override // X.InterfaceC189148Zf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryFundraiserDict", AbstractC22742A1m.A00(this));
    }

    @Override // X.InterfaceC189148Zf
    public final String getEndBackgroundColor() {
        return this.A05;
    }

    @Override // X.InterfaceC189148Zf
    public final String getPk() {
        return this.A08;
    }

    @Override // X.InterfaceC189148Zf
    public final String getStartBackgroundColor() {
        return this.A0A;
    }

    @Override // X.InterfaceC189148Zf
    public final String getTitle() {
        return this.A0C;
    }

    @Override // X.InterfaceC189148Zf
    public final InterfaceC189148Zf EC3(C1DY c1dy) {
        return this;
    }
}
