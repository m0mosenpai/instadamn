package X;

import com.instagram.api.schemas.IGUserHighlightsTrayType;
import java.util.List;

/* renamed from: X.3NO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NO extends C0T6 implements C3NQ {
    public final C74433Vz A00;
    public final IGUserHighlightsTrayType A01;
    public final C114855Gv A02;
    public final C3NK A03;
    public final C37771pE A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;

    @Override // X.C3NQ
    public final C3NO F5T(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3NO) {
                C3NO c3no = (C3NO) obj;
                if (!C14360o3.A0K(this.A0G, c3no.A0G) || !C14360o3.A0K(this.A0D, c3no.A0D) || !C14360o3.A0K(this.A00, c3no.A00) || !C14360o3.A0K(this.A0E, c3no.A0E) || !C14360o3.A0K(this.A05, c3no.A05) || this.A01 != c3no.A01 || !C14360o3.A0K(this.A06, c3no.A06) || !C14360o3.A0K(this.A09, c3no.A09) || !C14360o3.A0K(this.A0A, c3no.A0A) || !C14360o3.A0K(this.A07, c3no.A07) || !C14360o3.A0K(this.A0B, c3no.A0B) || !C14360o3.A0K(this.A03, c3no.A03) || !C14360o3.A0K(this.A0C, c3no.A0C) || !C14360o3.A0K(this.A0H, c3no.A0H) || !C14360o3.A0K(this.A0I, c3no.A0I) || !C14360o3.A0K(this.A04, c3no.A04) || !C14360o3.A0K(this.A02, c3no.A02) || !C14360o3.A0K(this.A08, c3no.A08) || !C14360o3.A0K(this.A0F, c3no.A0F) || !C14360o3.A0K(this.A0J, c3no.A0J)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A0G;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A0D;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C74433Vz c74433Vz = this.A00;
        int hashCode3 = (hashCode2 + (c74433Vz == null ? 0 : c74433Vz.hashCode())) * 31;
        String str2 = this.A0E;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.A05;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        IGUserHighlightsTrayType iGUserHighlightsTrayType = this.A01;
        int hashCode6 = (hashCode5 + (iGUserHighlightsTrayType == null ? 0 : iGUserHighlightsTrayType.hashCode())) * 31;
        Boolean bool2 = this.A06;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.A09;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0A;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.A0B;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C3NK c3nk = this.A03;
        int hashCode12 = (hashCode11 + (c3nk == null ? 0 : c3nk.hashCode())) * 31;
        Integer num4 = this.A0C;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list2 = this.A0H;
        int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A0I;
        int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        C37771pE c37771pE = this.A04;
        int hashCode16 = (hashCode15 + (c37771pE == null ? 0 : c37771pE.hashCode())) * 31;
        C114855Gv c114855Gv = this.A02;
        int hashCode17 = (hashCode16 + (c114855Gv == null ? 0 : c114855Gv.hashCode())) * 31;
        Boolean bool4 = this.A08;
        int hashCode18 = (hashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.A0F;
        int hashCode19 = (hashCode18 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list4 = this.A0J;
        return hashCode19 + (list4 != null ? list4.hashCode() : 0);
    }

    @Override // X.C3NQ
    public final List AiP() {
        return this.A0G;
    }

    @Override // X.C3NQ
    public final String Aib() {
        return this.A0D;
    }

    @Override // X.C3NQ
    public final C3W0 Anv() {
        return this.A00;
    }

    @Override // X.C3NQ
    public final String AvB() {
        return this.A0E;
    }

    @Override // X.C3NQ
    public final Boolean BCE() {
        return this.A05;
    }

    @Override // X.C3NQ
    public final IGUserHighlightsTrayType BEC() {
        return this.A01;
    }

    @Override // X.C3NQ
    public final Integer BPH() {
        return this.A09;
    }

    @Override // X.C3NQ
    public final Integer BPI() {
        return this.A0A;
    }

    @Override // X.C3NQ
    public final Boolean BW1() {
        return this.A07;
    }

    @Override // X.C3NQ
    public final Integer BX1() {
        return this.A0B;
    }

    @Override // X.C3NQ
    public final /* bridge */ /* synthetic */ C3NM Bch() {
        return this.A03;
    }

    @Override // X.C3NQ
    public final Integer Bm7() {
        return this.A0C;
    }

    @Override // X.C3NQ
    public final List BmL() {
        return this.A0H;
    }

    @Override // X.C3NQ
    public final List Bp5() {
        return this.A0I;
    }

    @Override // X.C3NQ
    public final /* bridge */ /* synthetic */ InterfaceC37791pH Bsz() {
        return this.A04;
    }

    @Override // X.C3NQ
    public final InterfaceC114865Gw BuL() {
        return this.A02;
    }

    @Override // X.C3NQ
    public final Boolean C14() {
        return this.A08;
    }

    @Override // X.C3NQ
    public final String C25() {
        return this.A0F;
    }

    @Override // X.C3NQ
    public final List CAq() {
        return this.A0J;
    }

    @Override // X.C3NQ
    public final Boolean Cdu() {
        return this.A06;
    }

    public C3NO(C74433Vz c74433Vz, IGUserHighlightsTrayType iGUserHighlightsTrayType, C114855Gv c114855Gv, C3NK c3nk, C37771pE c37771pE, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, List list, List list2, List list3, List list4) {
        this.A0G = list;
        this.A0D = str;
        this.A00 = c74433Vz;
        this.A0E = str2;
        this.A05 = bool;
        this.A01 = iGUserHighlightsTrayType;
        this.A06 = bool2;
        this.A09 = num;
        this.A0A = num2;
        this.A07 = bool3;
        this.A0B = num3;
        this.A03 = c3nk;
        this.A0C = num4;
        this.A0H = list2;
        this.A0I = list3;
        this.A04 = c37771pE;
        this.A02 = c114855Gv;
        this.A08 = bool4;
        this.A0F = str3;
        this.A0J = list4;
    }
}
