package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.1qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38611qr extends C0T6 implements InterfaceC38621qt {
    public final InterfaceC39571se A00;
    public final ImageUrl A01;
    public final Boolean A02;
    public final Integer A03;
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
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final List A0N;

    @Override // X.InterfaceC38621qt
    public final C38611qr F6l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38611qr) {
                C38611qr c38611qr = (C38611qr) obj;
                if (!C14360o3.A0K(this.A04, c38611qr.A04) || !C14360o3.A0K(this.A0M, c38611qr.A0M) || !C14360o3.A0K(this.A05, c38611qr.A05) || !C14360o3.A0K(this.A06, c38611qr.A06) || !C14360o3.A0K(this.A07, c38611qr.A07) || !C14360o3.A0K(this.A08, c38611qr.A08) || !C14360o3.A0K(this.A09, c38611qr.A09) || !C14360o3.A0K(this.A0A, c38611qr.A0A) || !C14360o3.A0K(this.A0B, c38611qr.A0B) || !C14360o3.A0K(this.A03, c38611qr.A03) || !C14360o3.A0K(this.A02, c38611qr.A02) || !C14360o3.A0K(this.A01, c38611qr.A01) || !C14360o3.A0K(this.A0C, c38611qr.A0C) || !C14360o3.A0K(this.A00, c38611qr.A00) || !C14360o3.A0K(this.A0D, c38611qr.A0D) || !C14360o3.A0K(this.A0E, c38611qr.A0E) || !C14360o3.A0K(this.A0F, c38611qr.A0F) || !C14360o3.A0K(this.A0G, c38611qr.A0G) || !C14360o3.A0K(this.A0H, c38611qr.A0H) || !C14360o3.A0K(this.A0I, c38611qr.A0I) || !C14360o3.A0K(this.A0J, c38611qr.A0J) || !C14360o3.A0K(this.A0N, c38611qr.A0N) || !C14360o3.A0K(this.A0K, c38611qr.A0K) || !C14360o3.A0K(this.A0L, c38611qr.A0L)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.A0M;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A08;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A09;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0A;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0B;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        ImageUrl imageUrl = this.A01;
        int hashCode12 = (hashCode11 + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        String str9 = this.A0C;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A00;
        int hashCode14 = (hashCode13 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        String str10 = this.A0D;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A0E;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.A0F;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.A0G;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.A0H;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.A0I;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.A0J;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        List list2 = this.A0N;
        int hashCode22 = (hashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str17 = this.A0K;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.A0L;
        return hashCode23 + (str18 != null ? str18.hashCode() : 0);
    }

    @Override // X.InterfaceC38621qt
    public final String AYk() {
        return this.A04;
    }

    @Override // X.InterfaceC38621qt
    public final List AZF() {
        return this.A0M;
    }

    @Override // X.InterfaceC38621qt
    public final String Ahe() {
        return this.A05;
    }

    @Override // X.InterfaceC38621qt
    public final String Aip() {
        return this.A06;
    }

    @Override // X.InterfaceC38621qt
    public final String Aj7() {
        return this.A07;
    }

    @Override // X.InterfaceC38621qt
    public final String Atc() {
        return this.A08;
    }

    @Override // X.InterfaceC38621qt
    public final String AyQ() {
        return this.A09;
    }

    @Override // X.InterfaceC38621qt
    public final String B3q() {
        return this.A0A;
    }

    @Override // X.InterfaceC38621qt
    public final String B3t() {
        return this.A0B;
    }

    @Override // X.InterfaceC38621qt
    public final Integer BA3() {
        return this.A03;
    }

    @Override // X.InterfaceC38621qt
    public final Boolean BBS() {
        return this.A02;
    }

    @Override // X.InterfaceC38621qt
    public final ImageUrl BEx() {
        return this.A01;
    }

    @Override // X.InterfaceC38621qt
    public final InterfaceC39571se BJz() {
        return this.A00;
    }

    @Override // X.InterfaceC38621qt
    public final String BSZ() {
        return this.A0D;
    }

    @Override // X.InterfaceC38621qt
    public final String BWf() {
        return this.A0F;
    }

    @Override // X.InterfaceC38621qt
    public final String BkL() {
        return this.A0H;
    }

    @Override // X.InterfaceC38621qt
    public final String BkN() {
        return this.A0I;
    }

    @Override // X.InterfaceC38621qt
    public final List C9d() {
        return this.A0N;
    }

    @Override // X.InterfaceC38621qt
    public final String CAR() {
        return this.A0K;
    }

    @Override // X.InterfaceC38621qt
    public final String CFs() {
        return this.A0L;
    }

    @Override // X.InterfaceC38621qt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSimpleAction", AbstractC40752I4g.A00(this));
    }

    @Override // X.InterfaceC38621qt
    public final String getId() {
        return this.A0C;
    }

    @Override // X.InterfaceC38621qt
    public final String getMessage() {
        return this.A0E;
    }

    @Override // X.InterfaceC38621qt
    public final String getProductId() {
        return this.A0G;
    }

    @Override // X.InterfaceC38621qt
    public final String getTitle() {
        return this.A0J;
    }

    public C38611qr(InterfaceC39571se interfaceC39571se, ImageUrl imageUrl, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, List list2) {
        this.A04 = str;
        this.A0M = list;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A0A = str7;
        this.A0B = str8;
        this.A03 = num;
        this.A02 = bool;
        this.A01 = imageUrl;
        this.A0C = str9;
        this.A00 = interfaceC39571se;
        this.A0D = str10;
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str13;
        this.A0H = str14;
        this.A0I = str15;
        this.A0J = str16;
        this.A0N = list2;
        this.A0K = str17;
        this.A0L = str18;
    }
}
