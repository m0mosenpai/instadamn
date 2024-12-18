package X;

import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.RIXUActionSource;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.RIXUPlayType;
import java.util.List;

/* renamed from: X.4zQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111094zQ extends C0T6 {
    public final C206309Bn A00;
    public final C38688GzT A01;
    public final C51757Mtg A02;
    public final ClipsIFUType A03;
    public final InterfaceC111084zP A04;
    public final InterfaceC39571se A05;
    public final RIXUActionSource A06;
    public final RIXUAspectRatio A07;
    public final RIXUCoverSize A08;
    public final RIXUCtaType A09;
    public final RIXULayoutFormat A0A;
    public final RIXULayoutStyle A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Boolean A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final RIXUPlayType A0R;
    public final Boolean A0S;
    public final Boolean A0T;
    public final Boolean A0U;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C111094zQ) {
                C111094zQ c111094zQ = (C111094zQ) obj;
                if (this.A06 != c111094zQ.A06 || !C14360o3.A0K(this.A02, c111094zQ.A02) || this.A07 != c111094zQ.A07 || !C14360o3.A0K(this.A0S, c111094zQ.A0S) || !C14360o3.A0K(this.A00, c111094zQ.A00) || !C14360o3.A0K(this.A0O, c111094zQ.A0O) || this.A03 != c111094zQ.A03 || !C14360o3.A0K(this.A01, c111094zQ.A01) || this.A09 != c111094zQ.A09 || !C14360o3.A0K(this.A0C, c111094zQ.A0C) || !C14360o3.A0K(this.A0H, c111094zQ.A0H) || !C14360o3.A0K(this.A0T, c111094zQ.A0T) || !C14360o3.A0K(this.A0K, c111094zQ.A0K) || !C14360o3.A0K(this.A0D, c111094zQ.A0D) || !C14360o3.A0K(this.A05, c111094zQ.A05) || this.A08 != c111094zQ.A08 || this.A0A != c111094zQ.A0A || this.A0B != c111094zQ.A0B || !C14360o3.A0K(this.A0P, c111094zQ.A0P) || !C14360o3.A0K(this.A0Q, c111094zQ.A0Q) || !C14360o3.A0K(this.A0I, c111094zQ.A0I) || !C14360o3.A0K(this.A0E, c111094zQ.A0E) || !C14360o3.A0K(this.A04, c111094zQ.A04) || !C14360o3.A0K(this.A0U, c111094zQ.A0U) || this.A0R != c111094zQ.A0R || !C14360o3.A0K(this.A0F, c111094zQ.A0F) || !C14360o3.A0K(this.A0L, c111094zQ.A0L) || !C14360o3.A0K(this.A0M, c111094zQ.A0M) || !C14360o3.A0K(this.A0N, c111094zQ.A0N) || !C14360o3.A0K(this.A0G, c111094zQ.A0G) || !C14360o3.A0K(this.A0J, c111094zQ.A0J)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        RIXUActionSource rIXUActionSource = this.A06;
        int hashCode = (rIXUActionSource == null ? 0 : rIXUActionSource.hashCode()) * 31;
        C51757Mtg c51757Mtg = this.A02;
        int hashCode2 = (hashCode + (c51757Mtg == null ? 0 : c51757Mtg.hashCode())) * 31;
        RIXUAspectRatio rIXUAspectRatio = this.A07;
        int hashCode3 = (hashCode2 + (rIXUAspectRatio == null ? 0 : rIXUAspectRatio.hashCode())) * 31;
        Boolean bool = this.A0S;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C206309Bn c206309Bn = this.A00;
        int hashCode5 = (hashCode4 + (c206309Bn == null ? 0 : c206309Bn.hashCode())) * 31;
        List list = this.A0O;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ClipsIFUType clipsIFUType = this.A03;
        int hashCode7 = (hashCode6 + (clipsIFUType == null ? 0 : clipsIFUType.hashCode())) * 31;
        C38688GzT c38688GzT = this.A01;
        int hashCode8 = (hashCode7 + (c38688GzT == null ? 0 : c38688GzT.hashCode())) * 31;
        RIXUCtaType rIXUCtaType = this.A09;
        int hashCode9 = (hashCode8 + (rIXUCtaType == null ? 0 : rIXUCtaType.hashCode())) * 31;
        Boolean bool2 = this.A0C;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.A0H;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.A0T;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.A0K;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.A0D;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A05;
        int hashCode15 = (hashCode14 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        RIXUCoverSize rIXUCoverSize = this.A08;
        int hashCode16 = (hashCode15 + (rIXUCoverSize == null ? 0 : rIXUCoverSize.hashCode())) * 31;
        RIXULayoutFormat rIXULayoutFormat = this.A0A;
        int hashCode17 = (hashCode16 + (rIXULayoutFormat == null ? 0 : rIXULayoutFormat.hashCode())) * 31;
        RIXULayoutStyle rIXULayoutStyle = this.A0B;
        int hashCode18 = (hashCode17 + (rIXULayoutStyle == null ? 0 : rIXULayoutStyle.hashCode())) * 31;
        List list2 = this.A0P;
        int hashCode19 = (hashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A0Q;
        int hashCode20 = (hashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.A0I;
        int hashCode21 = (hashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool5 = this.A0E;
        int hashCode22 = (hashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        InterfaceC111084zP interfaceC111084zP = this.A04;
        int hashCode23 = (hashCode22 + (interfaceC111084zP == null ? 0 : interfaceC111084zP.hashCode())) * 31;
        Boolean bool6 = this.A0U;
        int hashCode24 = (hashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        RIXUPlayType rIXUPlayType = this.A0R;
        int hashCode25 = (hashCode24 + (rIXUPlayType == null ? 0 : rIXUPlayType.hashCode())) * 31;
        Boolean bool7 = this.A0F;
        int hashCode26 = (hashCode25 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str2 = this.A0L;
        int hashCode27 = (hashCode26 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0M;
        int hashCode28 = (hashCode27 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0N;
        int hashCode29 = (hashCode28 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool8 = this.A0G;
        int hashCode30 = (hashCode29 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num3 = this.A0J;
        return hashCode30 + (num3 != null ? num3.hashCode() : 0);
    }

    public C111094zQ(C206309Bn c206309Bn, C38688GzT c38688GzT, C51757Mtg c51757Mtg, ClipsIFUType clipsIFUType, InterfaceC111084zP interfaceC111084zP, InterfaceC39571se interfaceC39571se, RIXUActionSource rIXUActionSource, RIXUAspectRatio rIXUAspectRatio, RIXUCoverSize rIXUCoverSize, RIXUCtaType rIXUCtaType, RIXULayoutFormat rIXULayoutFormat, RIXULayoutStyle rIXULayoutStyle, RIXUPlayType rIXUPlayType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        this.A06 = rIXUActionSource;
        this.A02 = c51757Mtg;
        this.A07 = rIXUAspectRatio;
        this.A0S = bool;
        this.A00 = c206309Bn;
        this.A0O = list;
        this.A03 = clipsIFUType;
        this.A01 = c38688GzT;
        this.A09 = rIXUCtaType;
        this.A0C = bool2;
        this.A0H = num;
        this.A0T = bool3;
        this.A0K = str;
        this.A0D = bool4;
        this.A05 = interfaceC39571se;
        this.A08 = rIXUCoverSize;
        this.A0A = rIXULayoutFormat;
        this.A0B = rIXULayoutStyle;
        this.A0P = list2;
        this.A0Q = list3;
        this.A0I = num2;
        this.A0E = bool5;
        this.A04 = interfaceC111084zP;
        this.A0U = bool6;
        this.A0R = rIXUPlayType;
        this.A0F = bool7;
        this.A0L = str2;
        this.A0M = str3;
        this.A0N = str4;
        this.A0G = bool8;
        this.A0J = num3;
    }
}
