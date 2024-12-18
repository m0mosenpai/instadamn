package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4d1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99324d1 extends C0T6 implements InterfaceC99334d2 {
    public final InterfaceC99294cv A00;
    public final InterfaceC99354d5 A01;
    public final C99364d6 A02;
    public final ReplyControlStr A03;
    public final InterfaceC99404dC A04;
    public final TextAppSearchDiscussionTopic A05;
    public final InterfaceC99414dE A06;
    public final InterfaceC99344d3 A07;
    public final TextPostAppHeaderFollowVariant A08;
    public final C4d9 A09;
    public final TextPostAppPostUnavailableReason A0A;
    public final InterfaceC99384d8 A0B;
    public final C38321qM A0C;
    public final C99314cz A0D;
    public final User A0E;
    public final User A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Boolean A0K;
    public final Boolean A0L;
    public final Boolean A0M;
    public final Boolean A0N;
    public final Boolean A0O;
    public final Boolean A0P;
    public final Boolean A0Q;
    public final Boolean A0R;
    public final Integer A0S;
    public final Integer A0T;
    public final Integer A0U;
    public final Integer A0V;
    public final Integer A0W;
    public final Integer A0X;
    public final Integer A0Y;
    public final Integer A0Z;
    public final Integer A0a;
    public final Long A0b;
    public final Long A0c;
    public final String A0d;
    public final String A0e;
    public final List A0f;
    public final List A0g;

    @Override // X.InterfaceC99334d2
    public final InterfaceC99334d2 EBZ(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC99334d2
    public final C99324d1 F4y(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC99334d2
    public final C99324d1 F4z(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C99324d1) {
                C99324d1 c99324d1 = (C99324d1) obj;
                if (!C14360o3.A0K(this.A0G, c99324d1.A0G) || !C14360o3.A0K(this.A0H, c99324d1.A0H) || !C14360o3.A0K(this.A07, c99324d1.A07) || !C14360o3.A0K(this.A0b, c99324d1.A0b) || !C14360o3.A0K(this.A0S, c99324d1.A0S) || !C14360o3.A0K(this.A0c, c99324d1.A0c) || !C14360o3.A0K(this.A00, c99324d1.A00) || this.A08 != c99324d1.A08 || !C14360o3.A0K(this.A01, c99324d1.A01) || !C14360o3.A0K(this.A0T, c99324d1.A0T) || !C14360o3.A0K(this.A0I, c99324d1.A0I) || !C14360o3.A0K(this.A0J, c99324d1.A0J) || !C14360o3.A0K(this.A0K, c99324d1.A0K) || !C14360o3.A0K(this.A0L, c99324d1.A0L) || !C14360o3.A0K(this.A0M, c99324d1.A0M) || !C14360o3.A0K(this.A0N, c99324d1.A0N) || !C14360o3.A0K(this.A02, c99324d1.A02) || !C14360o3.A0K(this.A0C, c99324d1.A0C) || !C14360o3.A0K(this.A0B, c99324d1.A0B) || !C14360o3.A0K(this.A0U, c99324d1.A0U) || !C14360o3.A0K(this.A09, c99324d1.A09) || !C14360o3.A0K(this.A0d, c99324d1.A0d) || this.A0A != c99324d1.A0A || !C14360o3.A0K(this.A0E, c99324d1.A0E) || !C14360o3.A0K(this.A0V, c99324d1.A0V) || !C14360o3.A0K(this.A04, c99324d1.A04) || !C14360o3.A0K(this.A0f, c99324d1.A0f) || this.A03 != c99324d1.A03 || !C14360o3.A0K(this.A0W, c99324d1.A0W) || !C14360o3.A0K(this.A0g, c99324d1.A0g) || !C14360o3.A0K(this.A0X, c99324d1.A0X) || !C14360o3.A0K(this.A0F, c99324d1.A0F) || !C14360o3.A0K(this.A0Y, c99324d1.A0Y) || !C14360o3.A0K(this.A0Z, c99324d1.A0Z) || !C14360o3.A0K(this.A05, c99324d1.A05) || !C14360o3.A0K(this.A0a, c99324d1.A0a) || !C14360o3.A0K(this.A0D, c99324d1.A0D) || !C14360o3.A0K(this.A0O, c99324d1.A0O) || !C14360o3.A0K(this.A0P, c99324d1.A0P) || !C14360o3.A0K(this.A0e, c99324d1.A0e) || !C14360o3.A0K(this.A06, c99324d1.A06) || !C14360o3.A0K(this.A0Q, c99324d1.A0Q) || !C14360o3.A0K(this.A0R, c99324d1.A0R)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A0G;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A0H;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        InterfaceC99344d3 interfaceC99344d3 = this.A07;
        int hashCode3 = (hashCode2 + (interfaceC99344d3 == null ? 0 : interfaceC99344d3.hashCode())) * 31;
        Long l = this.A0b;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.A0S;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.A0c;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        InterfaceC99294cv interfaceC99294cv = this.A00;
        int hashCode7 = (hashCode6 + (interfaceC99294cv == null ? 0 : interfaceC99294cv.hashCode())) * 31;
        TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = this.A08;
        int hashCode8 = (hashCode7 + (textPostAppHeaderFollowVariant == null ? 0 : textPostAppHeaderFollowVariant.hashCode())) * 31;
        InterfaceC99354d5 interfaceC99354d5 = this.A01;
        int hashCode9 = (hashCode8 + (interfaceC99354d5 == null ? 0 : interfaceC99354d5.hashCode())) * 31;
        Integer num2 = this.A0T;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.A0I;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A0J;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A0K;
        int hashCode13 = (hashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0L;
        int hashCode14 = (hashCode13 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A0M;
        int hashCode15 = (hashCode14 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A0N;
        int hashCode16 = (hashCode15 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        C99364d6 c99364d6 = this.A02;
        int hashCode17 = (hashCode16 + (c99364d6 == null ? 0 : c99364d6.hashCode())) * 31;
        C38321qM c38321qM = this.A0C;
        int hashCode18 = (hashCode17 + (c38321qM == null ? 0 : c38321qM.hashCode())) * 31;
        InterfaceC99384d8 interfaceC99384d8 = this.A0B;
        int hashCode19 = (hashCode18 + (interfaceC99384d8 == null ? 0 : interfaceC99384d8.hashCode())) * 31;
        Integer num3 = this.A0U;
        int hashCode20 = (hashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C4d9 c4d9 = this.A09;
        int hashCode21 = (hashCode20 + (c4d9 == null ? 0 : c4d9.hashCode())) * 31;
        String str = this.A0d;
        int hashCode22 = (hashCode21 + (str == null ? 0 : str.hashCode())) * 31;
        TextPostAppPostUnavailableReason textPostAppPostUnavailableReason = this.A0A;
        int hashCode23 = (hashCode22 + (textPostAppPostUnavailableReason == null ? 0 : textPostAppPostUnavailableReason.hashCode())) * 31;
        User user = this.A0E;
        int hashCode24 = (hashCode23 + (user == null ? 0 : user.hashCode())) * 31;
        Integer num4 = this.A0V;
        int hashCode25 = (hashCode24 + (num4 == null ? 0 : num4.hashCode())) * 31;
        InterfaceC99404dC interfaceC99404dC = this.A04;
        int hashCode26 = (hashCode25 + (interfaceC99404dC == null ? 0 : interfaceC99404dC.hashCode())) * 31;
        List list = this.A0f;
        int hashCode27 = (hashCode26 + (list == null ? 0 : list.hashCode())) * 31;
        ReplyControlStr replyControlStr = this.A03;
        int hashCode28 = (hashCode27 + (replyControlStr == null ? 0 : replyControlStr.hashCode())) * 31;
        Integer num5 = this.A0W;
        int hashCode29 = (hashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List list2 = this.A0g;
        int hashCode30 = (hashCode29 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num6 = this.A0X;
        int hashCode31 = (hashCode30 + (num6 == null ? 0 : num6.hashCode())) * 31;
        User user2 = this.A0F;
        int hashCode32 = (hashCode31 + (user2 == null ? 0 : user2.hashCode())) * 31;
        Integer num7 = this.A0Y;
        int hashCode33 = (hashCode32 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.A0Z;
        int hashCode34 = (hashCode33 + (num8 == null ? 0 : num8.hashCode())) * 31;
        TextAppSearchDiscussionTopic textAppSearchDiscussionTopic = this.A05;
        int hashCode35 = (hashCode34 + (textAppSearchDiscussionTopic == null ? 0 : textAppSearchDiscussionTopic.hashCode())) * 31;
        Integer num9 = this.A0a;
        int hashCode36 = (hashCode35 + (num9 == null ? 0 : num9.hashCode())) * 31;
        C99314cz c99314cz = this.A0D;
        int hashCode37 = (hashCode36 + (c99314cz == null ? 0 : c99314cz.hashCode())) * 31;
        Boolean bool9 = this.A0O;
        int hashCode38 = (hashCode37 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.A0P;
        int hashCode39 = (hashCode38 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str2 = this.A0e;
        int hashCode40 = (hashCode39 + (str2 == null ? 0 : str2.hashCode())) * 31;
        InterfaceC99414dE interfaceC99414dE = this.A06;
        int hashCode41 = (hashCode40 + (interfaceC99414dE == null ? 0 : interfaceC99414dE.hashCode())) * 31;
        Boolean bool11 = this.A0Q;
        int hashCode42 = (hashCode41 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.A0R;
        return hashCode42 + (bool12 != null ? bool12.hashCode() : 0);
    }

    @Override // X.InterfaceC99334d2
    public final /* bridge */ /* synthetic */ C72858XpE AKk() {
        return new C72858XpE(this);
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Akb() {
        return this.A0G;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Aki() {
        return this.A0H;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99344d3 Avu() {
        return this.A07;
    }

    @Override // X.InterfaceC99334d2
    public final Long Awf() {
        return this.A0b;
    }

    @Override // X.InterfaceC99334d2
    public final Integer Axb() {
        return this.A0S;
    }

    @Override // X.InterfaceC99334d2
    public final Long B3G() {
        return this.A0c;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99294cv B5U() {
        return this.A00;
    }

    @Override // X.InterfaceC99334d2
    public final TextPostAppHeaderFollowVariant BDD() {
        return this.A08;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99354d5 BEQ() {
        return this.A01;
    }

    @Override // X.InterfaceC99334d2
    public final Integer BH7() {
        return this.A0T;
    }

    @Override // X.InterfaceC99334d2
    public final /* bridge */ /* synthetic */ InterfaceC99374d7 BNR() {
        return this.A02;
    }

    @Override // X.InterfaceC99334d2
    public final C38321qM BNd() {
        return this.A0C;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99384d8 BPK() {
        return this.A0B;
    }

    @Override // X.InterfaceC99334d2
    public final Integer BSL() {
        return this.A0U;
    }

    @Override // X.InterfaceC99334d2
    public final /* bridge */ /* synthetic */ InterfaceC99394dA BdJ() {
        return this.A09;
    }

    @Override // X.InterfaceC99334d2
    public final String Bf4() {
        return this.A0d;
    }

    @Override // X.InterfaceC99334d2
    public final TextPostAppPostUnavailableReason BfA() {
        return this.A0A;
    }

    @Override // X.InterfaceC99334d2
    public final User Bgg() {
        return this.A0E;
    }

    @Override // X.InterfaceC99334d2
    public final Integer Bjq() {
        return this.A0V;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99404dC BmB() {
        return this.A04;
    }

    @Override // X.InterfaceC99334d2
    public final List BmG() {
        return this.A0f;
    }

    @Override // X.InterfaceC99334d2
    public final ReplyControlStr BnB() {
        return this.A03;
    }

    @Override // X.InterfaceC99334d2
    public final Integer BnC() {
        return this.A0W;
    }

    @Override // X.InterfaceC99334d2
    public final List BnD() {
        return this.A0g;
    }

    @Override // X.InterfaceC99334d2
    public final Integer BnG() {
        return this.A0X;
    }

    @Override // X.InterfaceC99334d2
    public final User BnR() {
        return this.A0F;
    }

    @Override // X.InterfaceC99334d2
    public final Integer Bnp() {
        return this.A0Y;
    }

    @Override // X.InterfaceC99334d2
    public final Integer BoO() {
        return this.A0Z;
    }

    @Override // X.InterfaceC99334d2
    public final TextAppSearchDiscussionTopic BrJ() {
        return this.A05;
    }

    @Override // X.InterfaceC99334d2
    public final Integer Bt0() {
        return this.A0a;
    }

    @Override // X.InterfaceC99334d2
    public final /* bridge */ /* synthetic */ C4d0 BuA() {
        return this.A0D;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean BvH() {
        return this.A0O;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean BwR() {
        return this.A0P;
    }

    @Override // X.InterfaceC99334d2
    public final String Bz5() {
        return this.A0e;
    }

    @Override // X.InterfaceC99334d2
    public final InterfaceC99414dE C6L() {
        return this.A06;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean CGD() {
        return this.A0Q;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean CHk() {
        return this.A0R;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean CQ1() {
        return this.A0I;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean CUr() {
        return this.A0J;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Ca2() {
        return this.A0K;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Cam() {
        return this.A0L;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Cbs() {
        return this.A0M;
    }

    @Override // X.InterfaceC99334d2
    public final Boolean Ccw() {
        return this.A0N;
    }

    @Override // X.InterfaceC99334d2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppMediaInfo", AbstractC72892XqR.A01(this));
    }

    public C99324d1(InterfaceC99294cv interfaceC99294cv, InterfaceC99354d5 interfaceC99354d5, C99364d6 c99364d6, ReplyControlStr replyControlStr, InterfaceC99404dC interfaceC99404dC, TextAppSearchDiscussionTopic textAppSearchDiscussionTopic, InterfaceC99414dE interfaceC99414dE, InterfaceC99344d3 interfaceC99344d3, TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant, C4d9 c4d9, TextPostAppPostUnavailableReason textPostAppPostUnavailableReason, InterfaceC99384d8 interfaceC99384d8, C38321qM c38321qM, C99314cz c99314cz, User user, User user2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Long l, Long l2, String str, String str2, List list, List list2) {
        this.A0G = bool;
        this.A0H = bool2;
        this.A07 = interfaceC99344d3;
        this.A0b = l;
        this.A0S = num;
        this.A0c = l2;
        this.A00 = interfaceC99294cv;
        this.A08 = textPostAppHeaderFollowVariant;
        this.A01 = interfaceC99354d5;
        this.A0T = num2;
        this.A0I = bool3;
        this.A0J = bool4;
        this.A0K = bool5;
        this.A0L = bool6;
        this.A0M = bool7;
        this.A0N = bool8;
        this.A02 = c99364d6;
        this.A0C = c38321qM;
        this.A0B = interfaceC99384d8;
        this.A0U = num3;
        this.A09 = c4d9;
        this.A0d = str;
        this.A0A = textPostAppPostUnavailableReason;
        this.A0E = user;
        this.A0V = num4;
        this.A04 = interfaceC99404dC;
        this.A0f = list;
        this.A03 = replyControlStr;
        this.A0W = num5;
        this.A0g = list2;
        this.A0X = num6;
        this.A0F = user2;
        this.A0Y = num7;
        this.A0Z = num8;
        this.A05 = textAppSearchDiscussionTopic;
        this.A0a = num9;
        this.A0D = c99314cz;
        this.A0O = bool9;
        this.A0P = bool10;
        this.A0e = str2;
        this.A06 = interfaceC99414dE;
        this.A0Q = bool11;
        this.A0R = bool12;
    }
}
