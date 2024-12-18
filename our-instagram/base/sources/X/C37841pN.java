package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1pN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37841pN extends C0T6 implements InterfaceC37861pP {
    public final InterfaceC39571se A00;
    public final C103434lJ A01;
    public final C914346k A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    @Override // X.InterfaceC37861pP
    public final C37841pN F5X() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37841pN) {
                C37841pN c37841pN = (C37841pN) obj;
                if (!C14360o3.A0K(this.A05, c37841pN.A05) || !C14360o3.A0K(this.A02, c37841pN.A02) || !C14360o3.A0K(this.A06, c37841pN.A06) || !C14360o3.A0K(this.A03, c37841pN.A03) || !C14360o3.A0K(this.A07, c37841pN.A07) || !C14360o3.A0K(this.A00, c37841pN.A00) || !C14360o3.A0K(this.A01, c37841pN.A01) || !C14360o3.A0K(this.A08, c37841pN.A08) || !C14360o3.A0K(this.A09, c37841pN.A09) || !C14360o3.A0K(this.A0A, c37841pN.A0A) || !C14360o3.A0K(this.A04, c37841pN.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C914346k c914346k = this.A02;
        int hashCode2 = (hashCode + (c914346k == null ? 0 : c914346k.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A00;
        int hashCode6 = (hashCode5 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        C103434lJ c103434lJ = this.A01;
        int hashCode7 = (hashCode6 + (c103434lJ == null ? 0 : c103434lJ.hashCode())) * 31;
        String str4 = this.A08;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A09;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0A;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.A04;
        return hashCode10 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC37861pP
    public final String AYe() {
        return this.A05;
    }

    @Override // X.InterfaceC37861pP
    public final C914346k AgU() {
        return this.A02;
    }

    @Override // X.InterfaceC37861pP
    public final String AsC() {
        return this.A06;
    }

    @Override // X.InterfaceC37861pP
    public final Integer BA3() {
        return this.A03;
    }

    @Override // X.InterfaceC37861pP
    public final InterfaceC39571se BJz() {
        return this.A00;
    }

    @Override // X.InterfaceC37861pP
    public final C103434lJ BMP() {
        return this.A01;
    }

    @Override // X.InterfaceC37861pP
    public final String CAR() {
        return this.A0A;
    }

    @Override // X.InterfaceC37861pP
    public final Integer CFr() {
        return this.A04;
    }

    @Override // X.InterfaceC37861pP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAd4ad", AbstractC40711I2r.A00(this));
    }

    @Override // X.InterfaceC37861pP
    public final String getId() {
        return this.A07;
    }

    @Override // X.InterfaceC37861pP
    public final String getMessage() {
        return this.A08;
    }

    @Override // X.InterfaceC37861pP
    public final String getTitle() {
        return this.A09;
    }

    public C37841pN(InterfaceC39571se interfaceC39571se, C103434lJ c103434lJ, C914346k c914346k, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A05 = str;
        this.A02 = c914346k;
        this.A06 = str2;
        this.A03 = num;
        this.A07 = str3;
        this.A00 = interfaceC39571se;
        this.A01 = c103434lJ;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A04 = num2;
    }
}
