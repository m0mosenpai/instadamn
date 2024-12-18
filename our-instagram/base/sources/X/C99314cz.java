package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;

/* renamed from: X.4cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99314cz extends C0T6 implements C4d0 {
    public final RepostRestrictedReason A00;
    public final XDTTextAppQuoteAttachmentEligibility A01;
    public final C38321qM A02;
    public final C38321qM A03;
    public final C38321qM A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Integer A0D;
    public final String A0E;

    @Override // X.C4d0
    public final C4d0 EBW(C1DY c1dy) {
        return this;
    }

    @Override // X.C4d0
    public final C99314cz F4t(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C99314cz) {
                C99314cz c99314cz = (C99314cz) obj;
                if (this.A01 != c99314cz.A01 || !C14360o3.A0K(this.A05, c99314cz.A05) || !C14360o3.A0K(this.A06, c99314cz.A06) || !C14360o3.A0K(this.A07, c99314cz.A07) || !C14360o3.A0K(this.A08, c99314cz.A08) || !C14360o3.A0K(this.A09, c99314cz.A09) || !C14360o3.A0K(this.A0A, c99314cz.A0A) || !C14360o3.A0K(this.A0B, c99314cz.A0B) || !C14360o3.A0K(this.A02, c99314cz.A02) || !C14360o3.A0K(this.A0C, c99314cz.A0C) || !C14360o3.A0K(this.A0D, c99314cz.A0D) || !C14360o3.A0K(this.A03, c99314cz.A03) || !C14360o3.A0K(this.A0E, c99314cz.A0E) || this.A00 != c99314cz.A00 || !C14360o3.A0K(this.A04, c99314cz.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility = this.A01;
        int hashCode = (xDTTextAppQuoteAttachmentEligibility == null ? 0 : xDTTextAppQuoteAttachmentEligibility.hashCode()) * 31;
        Boolean bool = this.A05;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A06;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A08;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A09;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0A;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A0B;
        int hashCode8 = (hashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        C38321qM c38321qM = this.A02;
        int hashCode9 = (hashCode8 + (c38321qM == null ? 0 : c38321qM.hashCode())) * 31;
        Boolean bool8 = this.A0C;
        int hashCode10 = (hashCode9 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num = this.A0D;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        C38321qM c38321qM2 = this.A03;
        int hashCode12 = (hashCode11 + (c38321qM2 == null ? 0 : c38321qM2.hashCode())) * 31;
        String str = this.A0E;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        RepostRestrictedReason repostRestrictedReason = this.A00;
        int hashCode14 = (hashCode13 + (repostRestrictedReason == null ? 0 : repostRestrictedReason.hashCode())) * 31;
        C38321qM c38321qM3 = this.A04;
        return hashCode14 + (c38321qM3 != null ? c38321qM3.hashCode() : 0);
    }

    @Override // X.C4d0
    public final XDTTextAppQuoteAttachmentEligibility Akc() {
        return this.A01;
    }

    @Override // X.C4d0
    public final Boolean Akd() {
        return this.A05;
    }

    @Override // X.C4d0
    public final Boolean Akj() {
        return this.A06;
    }

    @Override // X.C4d0
    public final Boolean Al5() {
        return this.A07;
    }

    @Override // X.C4d0
    public final Boolean Al6() {
        return this.A08;
    }

    @Override // X.C4d0
    public final Boolean Bjr() {
        return this.A0B;
    }

    @Override // X.C4d0
    public final C38321qM Bjs() {
        return this.A02;
    }

    @Override // X.C4d0
    public final Boolean Bjt() {
        return this.A0C;
    }

    @Override // X.C4d0
    public final Integer Bju() {
        return this.A0D;
    }

    @Override // X.C4d0
    public final C38321qM Bjw() {
        return this.A03;
    }

    @Override // X.C4d0
    public final String Bjx() {
        return this.A0E;
    }

    @Override // X.C4d0
    public final RepostRestrictedReason Bnt() {
        return this.A00;
    }

    @Override // X.C4d0
    public final C38321qM Bnw() {
        return this.A04;
    }

    @Override // X.C4d0
    public final Boolean Cbu() {
        return this.A09;
    }

    @Override // X.C4d0
    public final Boolean Cc0() {
        return this.A0A;
    }

    @Override // X.C4d0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShareInfo", AbstractC47022Kqf.A00(this));
    }

    public C99314cz(RepostRestrictedReason repostRestrictedReason, XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility, C38321qM c38321qM, C38321qM c38321qM2, C38321qM c38321qM3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, String str) {
        this.A01 = xDTTextAppQuoteAttachmentEligibility;
        this.A05 = bool;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A08 = bool4;
        this.A09 = bool5;
        this.A0A = bool6;
        this.A0B = bool7;
        this.A02 = c38321qM;
        this.A0C = bool8;
        this.A0D = num;
        this.A03 = c38321qM2;
        this.A0E = str;
        this.A00 = repostRestrictedReason;
        this.A04 = c38321qM3;
    }
}
