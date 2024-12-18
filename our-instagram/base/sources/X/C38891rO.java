package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClientDisplayMethod;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1rO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38891rO extends C0T6 implements InterfaceC38901rP {
    public final ClientDisplayMethod A00;
    public final C5FH A01;
    public final CommentGiphyMediaInfo A02;
    public final C5FM A03;
    public final CommentRestrictStatus A04;
    public final PrivateReplyStatus A05;
    public final C5FO A06;
    public final C5FI A07;
    public final C110864yy A08;
    public final User A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Boolean A0F;
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
    public final Boolean A0S;
    public final Boolean A0T;
    public final Boolean A0U;
    public final Boolean A0V;
    public final Integer A0W;
    public final Integer A0X;
    public final Integer A0Y;
    public final Integer A0Z;
    public final Integer A0a;
    public final Integer A0b;
    public final Integer A0c;
    public final Integer A0d;
    public final Integer A0e;
    public final Integer A0f;
    public final Long A0g;
    public final Long A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final String A0o;
    public final String A0p;
    public final String A0q;
    public final String A0r;
    public final String A0s;
    public final String A0t;
    public final String A0u;
    public final HashMap A0v;
    public final List A0w;
    public final List A0x;
    public final List A0y;
    public final List A0z;
    public final List A10;
    public final List A11;

    @Override // X.InterfaceC38901rP
    public final C38891rO F4U(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38901rP
    public final C38891rO F4V(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38891rO) {
                C38891rO c38891rO = (C38891rO) obj;
                if (!C14360o3.A0K(this.A01, c38891rO.A01) || !C14360o3.A0K(this.A0i, c38891rO.A0i) || !C14360o3.A0K(this.A0j, c38891rO.A0j) || !C14360o3.A0K(this.A0A, c38891rO.A0A) || !C14360o3.A0K(this.A0B, c38891rO.A0B) || !C14360o3.A0K(this.A07, c38891rO.A07) || !C14360o3.A0K(this.A0w, c38891rO.A0w) || !C14360o3.A0K(this.A0W, c38891rO.A0W) || !C14360o3.A0K(this.A0X, c38891rO.A0X) || !C14360o3.A0K(this.A0C, c38891rO.A0C) || !C14360o3.A0K(this.A0Y, c38891rO.A0Y) || !C14360o3.A0K(this.A0Z, c38891rO.A0Z) || !C14360o3.A0K(this.A0x, c38891rO.A0x) || !C14360o3.A0K(this.A0g, c38891rO.A0g) || !C14360o3.A0K(this.A0h, c38891rO.A0h) || !C14360o3.A0K(this.A0k, c38891rO.A0k) || !C14360o3.A0K(this.A0D, c38891rO.A0D) || !C14360o3.A0K(this.A0y, c38891rO.A0y) || !C14360o3.A0K(this.A0z, c38891rO.A0z) || !C14360o3.A0K(this.A10, c38891rO.A10) || !C14360o3.A0K(this.A0a, c38891rO.A0a) || !C14360o3.A0K(this.A02, c38891rO.A02) || !C14360o3.A0K(this.A0E, c38891rO.A0E) || !C14360o3.A0K(this.A0F, c38891rO.A0F) || !C14360o3.A0K(this.A0G, c38891rO.A0G) || !C14360o3.A0K(this.A0H, c38891rO.A0H) || !C14360o3.A0K(this.A0I, c38891rO.A0I) || !C14360o3.A0K(this.A0l, c38891rO.A0l) || !C14360o3.A0K(this.A03, c38891rO.A03) || this.A00 != c38891rO.A00 || !C14360o3.A0K(this.A0J, c38891rO.A0J) || !C14360o3.A0K(this.A0K, c38891rO.A0K) || !C14360o3.A0K(this.A0L, c38891rO.A0L) || !C14360o3.A0K(this.A0M, c38891rO.A0M) || !C14360o3.A0K(this.A0N, c38891rO.A0N) || !C14360o3.A0K(this.A0O, c38891rO.A0O) || !C14360o3.A0K(this.A0P, c38891rO.A0P) || !C14360o3.A0K(this.A0Q, c38891rO.A0Q) || !C14360o3.A0K(this.A0R, c38891rO.A0R) || !C14360o3.A0K(this.A0S, c38891rO.A0S) || !C14360o3.A0K(this.A0T, c38891rO.A0T) || !C14360o3.A0K(this.A08, c38891rO.A08) || !C14360o3.A0K(this.A0m, c38891rO.A0m) || !C14360o3.A0K(this.A0n, c38891rO.A0n) || !C14360o3.A0K(this.A06, c38891rO.A06) || !C14360o3.A0K(this.A0v, c38891rO.A0v) || !C14360o3.A0K(this.A0o, c38891rO.A0o) || !C14360o3.A0K(this.A0p, c38891rO.A0p) || !C14360o3.A0K(this.A0b, c38891rO.A0b) || !C14360o3.A0K(this.A0c, c38891rO.A0c) || !C14360o3.A0K(this.A0q, c38891rO.A0q) || !C14360o3.A0K(this.A0d, c38891rO.A0d) || !C14360o3.A0K(this.A0r, c38891rO.A0r) || !C14360o3.A0K(this.A11, c38891rO.A11) || this.A05 != c38891rO.A05 || !C14360o3.A0K(this.A0s, c38891rO.A0s) || this.A04 != c38891rO.A04 || !C14360o3.A0K(this.A0U, c38891rO.A0U) || !C14360o3.A0K(this.A0V, c38891rO.A0V) || !C14360o3.A0K(this.A0t, c38891rO.A0t) || !C14360o3.A0K(this.A0u, c38891rO.A0u) || !C14360o3.A0K(this.A0e, c38891rO.A0e) || !C14360o3.A0K(this.A0f, c38891rO.A0f) || !C14360o3.A0K(this.A09, c38891rO.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C5FH c5fh = this.A01;
        int hashCode = (c5fh == null ? 0 : c5fh.hashCode()) * 31;
        String str = this.A0i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.A0A;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A0B;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C5FI c5fi = this.A07;
        int hashCode6 = (hashCode5 + (c5fi == null ? 0 : c5fi.hashCode())) * 31;
        List list = this.A0w;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A0W;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0X;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.A0C;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.A0Y;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A0Z;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list2 = this.A0x;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.A0g;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.A0h;
        int hashCode15 = (hashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.A0k;
        int hashCode16 = (hashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.A0D;
        int hashCode17 = (hashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List list3 = this.A0y;
        int hashCode18 = (hashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.A0z;
        int hashCode19 = (hashCode18 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.A10;
        int hashCode20 = (hashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num5 = this.A0a;
        int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        CommentGiphyMediaInfo commentGiphyMediaInfo = this.A02;
        int hashCode22 = (hashCode21 + (commentGiphyMediaInfo == null ? 0 : commentGiphyMediaInfo.hashCode())) * 31;
        Boolean bool5 = this.A0E;
        int hashCode23 = (hashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0F;
        int hashCode24 = (hashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A0G;
        int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A0H;
        int hashCode26 = (hashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A0I;
        int hashCode27 = (hashCode26 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str4 = this.A0l;
        int hashCode28 = (hashCode27 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C5FM c5fm = this.A03;
        int hashCode29 = (hashCode28 + (c5fm == null ? 0 : c5fm.hashCode())) * 31;
        ClientDisplayMethod clientDisplayMethod = this.A00;
        int hashCode30 = (hashCode29 + (clientDisplayMethod == null ? 0 : clientDisplayMethod.hashCode())) * 31;
        Boolean bool10 = this.A0J;
        int hashCode31 = (hashCode30 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.A0K;
        int hashCode32 = (hashCode31 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.A0L;
        int hashCode33 = (hashCode32 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.A0M;
        int hashCode34 = (hashCode33 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.A0N;
        int hashCode35 = (hashCode34 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.A0O;
        int hashCode36 = (hashCode35 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.A0P;
        int hashCode37 = (hashCode36 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.A0Q;
        int hashCode38 = (hashCode37 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.A0R;
        int hashCode39 = (hashCode38 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.A0S;
        int hashCode40 = (hashCode39 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.A0T;
        int hashCode41 = (hashCode40 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        C110864yy c110864yy = this.A08;
        int hashCode42 = (hashCode41 + (c110864yy == null ? 0 : c110864yy.hashCode())) * 31;
        String str5 = this.A0m;
        int hashCode43 = (hashCode42 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0n;
        int hashCode44 = (hashCode43 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C5FO c5fo = this.A06;
        int hashCode45 = (hashCode44 + (c5fo == null ? 0 : c5fo.hashCode())) * 31;
        HashMap hashMap = this.A0v;
        int hashCode46 = (hashCode45 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        String str7 = this.A0o;
        int hashCode47 = (hashCode46 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0p;
        int hashCode48 = (hashCode47 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num6 = this.A0b;
        int hashCode49 = (hashCode48 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.A0c;
        int hashCode50 = (hashCode49 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str9 = this.A0q;
        int hashCode51 = (hashCode50 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num8 = this.A0d;
        int hashCode52 = (hashCode51 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str10 = this.A0r;
        int hashCode53 = (hashCode52 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List list6 = this.A11;
        int hashCode54 = (hashCode53 + (list6 == null ? 0 : list6.hashCode())) * 31;
        PrivateReplyStatus privateReplyStatus = this.A05;
        int hashCode55 = (hashCode54 + (privateReplyStatus == null ? 0 : privateReplyStatus.hashCode())) * 31;
        String str11 = this.A0s;
        int hashCode56 = (hashCode55 + (str11 == null ? 0 : str11.hashCode())) * 31;
        CommentRestrictStatus commentRestrictStatus = this.A04;
        int hashCode57 = (hashCode56 + (commentRestrictStatus == null ? 0 : commentRestrictStatus.hashCode())) * 31;
        Boolean bool21 = this.A0U;
        int hashCode58 = (hashCode57 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.A0V;
        int hashCode59 = (hashCode58 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        String str12 = this.A0t;
        int hashCode60 = (hashCode59 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.A0u;
        int hashCode61 = (hashCode60 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num9 = this.A0e;
        int hashCode62 = (hashCode61 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.A0f;
        int hashCode63 = (hashCode62 + (num10 == null ? 0 : num10.hashCode())) * 31;
        User user = this.A09;
        return hashCode63 + (user != null ? user.hashCode() : 0);
    }

    @Override // X.InterfaceC38901rP
    public final /* bridge */ /* synthetic */ C72859XpF AKi() {
        return new C72859XpF(this);
    }

    @Override // X.InterfaceC38901rP
    public final C5FH AeV() {
        return this.A01;
    }

    @Override // X.InterfaceC38901rP
    public final String Aeu() {
        return this.A0j;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean AlD() {
        return this.A0A;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean AlM() {
        return this.A0B;
    }

    @Override // X.InterfaceC38901rP
    public final /* bridge */ /* synthetic */ C5FJ Ale() {
        return this.A07;
    }

    @Override // X.InterfaceC38901rP
    public final List Am4() {
        return this.A0w;
    }

    @Override // X.InterfaceC38901rP
    public final Integer AnX() {
        return this.A0W;
    }

    @Override // X.InterfaceC38901rP
    public final Integer AnY() {
        return this.A0X;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean ApZ() {
        return this.A0C;
    }

    @Override // X.InterfaceC38901rP
    public final Integer Apa() {
        return this.A0Y;
    }

    @Override // X.InterfaceC38901rP
    public final Integer Apd() {
        return this.A0Z;
    }

    @Override // X.InterfaceC38901rP
    public final List Aph() {
        return this.A0x;
    }

    @Override // X.InterfaceC38901rP
    public final Long Asa() {
        return this.A0g;
    }

    @Override // X.InterfaceC38901rP
    public final Long Asc() {
        return this.A0h;
    }

    @Override // X.InterfaceC38901rP
    public final String AwB() {
        return this.A0k;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean AxM() {
        return this.A0D;
    }

    @Override // X.InterfaceC38901rP
    public final List Aym() {
        return this.A0y;
    }

    @Override // X.InterfaceC38901rP
    public final List B07() {
        return this.A0z;
    }

    @Override // X.InterfaceC38901rP
    public final List B4l() {
        return this.A10;
    }

    @Override // X.InterfaceC38901rP
    public final Integer B6i() {
        return this.A0a;
    }

    @Override // X.InterfaceC38901rP
    public final /* bridge */ /* synthetic */ CommentGiphyMediaInfoIntf B9s() {
        return this.A02;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BC2() {
        return this.A0E;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BC8() {
        return this.A0F;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BCA() {
        return this.A0G;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BCr() {
        return this.A0H;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BDu() {
        return this.A0I;
    }

    @Override // X.InterfaceC38901rP
    public final String BFC() {
        return this.A0l;
    }

    @Override // X.InterfaceC38901rP
    public final C5FM BH1() {
        return this.A03;
    }

    @Override // X.InterfaceC38901rP
    public final ClientDisplayMethod BHo() {
        return this.A00;
    }

    @Override // X.InterfaceC38901rP
    public final /* bridge */ /* synthetic */ InterfaceC110874yz BKr() {
        return this.A08;
    }

    @Override // X.InterfaceC38901rP
    public final String BQW() {
        return this.A0m;
    }

    @Override // X.InterfaceC38901rP
    public final /* bridge */ /* synthetic */ C5FP BR3() {
        return this.A06;
    }

    @Override // X.InterfaceC38901rP
    public final /* bridge */ /* synthetic */ Map BSP() {
        return this.A0v;
    }

    @Override // X.InterfaceC38901rP
    public final String BWz() {
        return this.A0o;
    }

    @Override // X.InterfaceC38901rP
    public final String BX0() {
        return this.A0p;
    }

    @Override // X.InterfaceC38901rP
    public final Integer BXf() {
        return this.A0b;
    }

    @Override // X.InterfaceC38901rP
    public final Integer BY4() {
        return this.A0c;
    }

    @Override // X.InterfaceC38901rP
    public final String BbH() {
        return this.A0q;
    }

    @Override // X.InterfaceC38901rP
    public final Integer BbI() {
        return this.A0d;
    }

    @Override // X.InterfaceC38901rP
    public final List Bfk() {
        return this.A11;
    }

    @Override // X.InterfaceC38901rP
    public final PrivateReplyStatus Bgi() {
        return this.A05;
    }

    @Override // X.InterfaceC38901rP
    public final String Bn2() {
        return this.A0s;
    }

    @Override // X.InterfaceC38901rP
    public final CommentRestrictStatus Boq() {
        return this.A04;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean BwH() {
        return this.A0U;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean Bwn() {
        return this.A0V;
    }

    @Override // X.InterfaceC38901rP
    public final Integer C6j() {
        return this.A0e;
    }

    @Override // X.InterfaceC38901rP
    public final Integer CBl() {
        return this.A0f;
    }

    @Override // X.InterfaceC38901rP
    public final User CDj() {
        return this.A09;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CRq() {
        return this.A0J;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CRr() {
        return this.A0K;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CVO() {
        return this.A0L;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CVs() {
        return this.A0M;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CXR() {
        return this.A0N;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CXS() {
        return this.A0O;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CZM() {
        return this.A0P;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CaI() {
        return this.A0Q;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CbP() {
        return this.A0R;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean CbW() {
        return this.A0S;
    }

    @Override // X.InterfaceC38901rP
    public final Boolean Cfs() {
        return this.A0T;
    }

    @Override // X.InterfaceC38901rP
    public final InterfaceC38901rP EBK(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38901rP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommentDict", XMJ.A01(this));
    }

    @Override // X.InterfaceC38901rP
    public final String getBackgroundColor() {
        return this.A0i;
    }

    @Override // X.InterfaceC38901rP
    public final String getMediaId() {
        return this.A0n;
    }

    @Override // X.InterfaceC38901rP
    public final String getPk() {
        return this.A0r;
    }

    @Override // X.InterfaceC38901rP
    public final String getText() {
        return this.A0t;
    }

    @Override // X.InterfaceC38901rP
    public final String getTextColor() {
        return this.A0u;
    }

    public C38891rO(ClientDisplayMethod clientDisplayMethod, C5FH c5fh, CommentGiphyMediaInfo commentGiphyMediaInfo, C5FM c5fm, CommentRestrictStatus commentRestrictStatus, PrivateReplyStatus privateReplyStatus, C5FO c5fo, C5FI c5fi, C110864yy c110864yy, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, HashMap hashMap, List list, List list2, List list3, List list4, List list5, List list6) {
        this.A01 = c5fh;
        this.A0i = str;
        this.A0j = str2;
        this.A0A = bool;
        this.A0B = bool2;
        this.A07 = c5fi;
        this.A0w = list;
        this.A0W = num;
        this.A0X = num2;
        this.A0C = bool3;
        this.A0Y = num3;
        this.A0Z = num4;
        this.A0x = list2;
        this.A0g = l;
        this.A0h = l2;
        this.A0k = str3;
        this.A0D = bool4;
        this.A0y = list3;
        this.A0z = list4;
        this.A10 = list5;
        this.A0a = num5;
        this.A02 = commentGiphyMediaInfo;
        this.A0E = bool5;
        this.A0F = bool6;
        this.A0G = bool7;
        this.A0H = bool8;
        this.A0I = bool9;
        this.A0l = str4;
        this.A03 = c5fm;
        this.A00 = clientDisplayMethod;
        this.A0J = bool10;
        this.A0K = bool11;
        this.A0L = bool12;
        this.A0M = bool13;
        this.A0N = bool14;
        this.A0O = bool15;
        this.A0P = bool16;
        this.A0Q = bool17;
        this.A0R = bool18;
        this.A0S = bool19;
        this.A0T = bool20;
        this.A08 = c110864yy;
        this.A0m = str5;
        this.A0n = str6;
        this.A06 = c5fo;
        this.A0v = hashMap;
        this.A0o = str7;
        this.A0p = str8;
        this.A0b = num6;
        this.A0c = num7;
        this.A0q = str9;
        this.A0d = num8;
        this.A0r = str10;
        this.A11 = list6;
        this.A05 = privateReplyStatus;
        this.A0s = str11;
        this.A04 = commentRestrictStatus;
        this.A0U = bool21;
        this.A0V = bool22;
        this.A0t = str12;
        this.A0u = str13;
        this.A0e = num9;
        this.A0f = num10;
        this.A09 = user;
    }
}
