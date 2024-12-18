package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ActionButtonPartnerType;

/* renamed from: X.4zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111184zg extends C0T6 implements InterfaceC111194zh {
    public final ActionButtonPartnerType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C111184zg(ActionButtonPartnerType actionButtonPartnerType, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str6, 6);
        C14360o3.A0B(actionButtonPartnerType, 7);
        C14360o3.A0B(str7, 8);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A00 = actionButtonPartnerType;
        this.A07 = str7;
    }

    @Override // X.InterfaceC111194zh
    public final C111184zg EqY() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C111184zg) {
                C111184zg c111184zg = (C111184zg) obj;
                if (!C14360o3.A0K(this.A01, c111184zg.A01) || !C14360o3.A0K(this.A02, c111184zg.A02) || !C14360o3.A0K(this.A03, c111184zg.A03) || !C14360o3.A0K(this.A04, c111184zg.A04) || !C14360o3.A0K(this.A05, c111184zg.A05) || !C14360o3.A0K(this.A06, c111184zg.A06) || this.A00 != c111184zg.A00 || !C14360o3.A0K(this.A07, c111184zg.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A05;
        return ((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.A06.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A07.hashCode();
    }

    @Override // X.InterfaceC111194zh
    public final String AcH() {
        return this.A01;
    }

    @Override // X.InterfaceC111194zh
    public final String AcL() {
        return this.A02;
    }

    @Override // X.InterfaceC111194zh
    public final String Aj3() {
        return this.A03;
    }

    @Override // X.InterfaceC111194zh
    public final String Amd() {
        return this.A04;
    }

    @Override // X.InterfaceC111194zh
    public final String AyS() {
        return this.A05;
    }

    @Override // X.InterfaceC111194zh
    public final String Bba() {
        return this.A06;
    }

    @Override // X.InterfaceC111194zh
    public final ActionButtonPartnerType Bbb() {
        return this.A00;
    }

    @Override // X.InterfaceC111194zh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTActionButtonPartner", AbstractC33659Eu9.A00(this));
    }

    @Override // X.InterfaceC111194zh
    public final String getUrl() {
        return this.A07;
    }
}
