package X;

import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.36v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C685836v implements InterfaceC685936w, InterfaceC686036x {
    public boolean A00;
    public boolean A01;
    public final Fragment A02;
    public final AbstractC10360h2 A03;
    public final ViewOnTouchListenerC60632pm A04;
    public final InterfaceC60142ow A05;
    public final C684436h A06;
    public final C675432t A07;
    public final C25671My A08;
    public final InterfaceC41501vz A09;
    public final UserSession A0A;
    public final C57112jm A0B;
    public final C689038b A0C;
    public final C38i A0D;
    public final C684636j A0E;
    public final InterfaceC114705Ga A0F;
    public final C5Gi A0G;
    public final C36Y A0H;
    public final InterfaceC114745Gf A0I;
    public final C690138n A0J;
    public final InterfaceC60442pS A0K;
    public final C689838k A0L;
    public final C33A A0M;
    public final AbstractC61692rW A0N;
    public final InterfaceC65282xQ A0O;
    public final C33F A0P;
    public final C33F A0Q;
    public final C33F A0R;
    public final C684736k A0S;
    public final C57332k8 A0T;
    public final C689538g A0U;
    public final C57462kL A0V;
    public final C33P A0W;
    public final C36Q A0X;
    public final C38W A0Y;
    public final C81063jb A0Z;
    public final C1Y1 A0a;
    public final ViewOnKeyListenerC677333n A0b;
    public final InterfaceC114755Gg A0c;
    public final C64842wi A0d;
    public final C38E A0e;
    public final AnonymousClass388 A0f;
    public final SearchContext A0g;
    public final C38A A0h;
    public final AnonymousClass389 A0i;
    public final C38T A0j;
    public final C38R A0k;
    public final C64892wn A0l;
    public final C689438f A0m;
    public final InterfaceC61432r6 A0n;
    public final C676533f A0o;
    public final User A0p;
    public final EnumC114765Gh A0q;
    public final Long A0r;
    public final String A0s;
    public final String A0t;
    public final String A0u;
    public final String A0v;
    public final String A0w;
    public final String A0x;
    public final InterfaceC09390do A0y;
    public final InterfaceC09390do A0z;
    public final InterfaceC09390do A10;
    public final InterfaceC09390do A11;
    public final InterfaceC09390do A12;
    public final InterfaceC09390do A13;
    public final InterfaceC09390do A14;
    public final InterfaceC09390do A15;
    public final InterfaceC09390do A16;
    public final InterfaceC09390do A17;
    public final InterfaceC09390do A18;
    public final InterfaceC09390do A19;
    public final InterfaceC09390do A1A;
    public final InterfaceC09390do A1B;
    public final InterfaceC09390do A1C;
    public final InterfaceC09390do A1D;
    public final InterfaceC09390do A1E;
    public final InterfaceC09390do A1F;
    public final InterfaceC09390do A1G;
    public final InterfaceC09390do A1H;
    public final InterfaceC09390do A1I;
    public final InterfaceC09390do A1J;
    public final InterfaceC09390do A1K;
    public final InterfaceC09390do A1L;
    public final InterfaceC09390do A1M;
    public final InterfaceC09390do A1N;
    public final InterfaceC09390do A1O;
    public final InterfaceC09390do A1P;
    public final InterfaceC09390do A1Q;
    public final InterfaceC09390do A1R;
    public final InterfaceC09390do A1S;
    public final InterfaceC09390do A1T;
    public final InterfaceC09390do A1U;
    public final InterfaceC09390do A1V;
    public final InterfaceC09390do A1W;
    public final InterfaceC09390do A1X;
    public final InterfaceC09390do A1Y;
    public final InterfaceC09390do A1Z;
    public final InterfaceC09390do A1a;
    public final InterfaceC09390do A1b;
    public final InterfaceC09390do A1c;
    public final InterfaceC09390do A1d;
    public final InterfaceC09390do A1e;
    public final InterfaceC09390do A1f;
    public final InterfaceC09390do A1g;
    public final InterfaceC09390do A1h;
    public final InterfaceC09390do A1i;
    public final InterfaceC09390do A1j;
    public final InterfaceC09390do A1k;
    public final InterfaceC09390do A1l;
    public final InterfaceC09390do A1m;
    public final InterfaceC09390do A1n;
    public final InterfaceC09390do A1o;
    public final InterfaceC09390do A1p;
    public final InterfaceC09390do A1q;
    public final InterfaceC09390do A1r;
    public final InterfaceC09390do A1s;
    public final InterfaceC09390do A1t;
    public final InterfaceC09390do A1u;
    public final InterfaceC09390do A1v;
    public final InterfaceC09390do A1w;
    public final InterfaceC09390do A1x;
    public final InterfaceC09390do A1y;
    public final InterfaceC09390do A1z;
    public final InterfaceC09390do A20;
    public final InterfaceC09390do A21;
    public final InterfaceC09390do A22;
    public final InterfaceC09390do A23;
    public final InterfaceC09390do A24;
    public final InterfaceC09390do A25;
    public final InterfaceC09390do A26;
    public final InterfaceC09390do A27;
    public final InterfaceC09390do A28;
    public final InterfaceC09390do A29;
    public final InterfaceC09390do A2A;
    public final InterfaceC09390do A2B;
    public final InterfaceC09390do A2C;
    public final InterfaceC09390do A2D;
    public final InterfaceC09390do A2E;
    public final InterfaceC09390do A2F;
    public final InterfaceC09390do A2G;
    public final InterfaceC09390do A2H;
    public final InterfaceC09390do A2I;
    public final InterfaceC09390do A2J;
    public final InterfaceC09390do A2K;
    public final InterfaceC09390do A2L;
    public final InterfaceC09390do A2M;
    public final InterfaceC09390do A2N;
    public final InterfaceC09390do A2O;
    public final InterfaceC09390do A2P;
    public final InterfaceC09390do A2Q;
    public final boolean A2R;
    public final boolean A2S;
    public final boolean A2T;
    public final boolean A2U;
    public final C63352uI A2V;
    public final AnonymousClass386 A2W;
    public final InterfaceC690738t A2X;
    public final InterfaceC59832oQ A2Y;
    public final InterfaceC09390do A2Z;

    @Override // X.InterfaceC685936w
    public final void DiB(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        if (c75113Zb != null) {
            this.A0f.Di3(c38321qM, c75113Zb, CCt(), i);
        }
    }

    @Override // X.InterfaceC687837p
    public final InterfaceC692939p AZ4() {
        return (C692639m) this.A0y.getValue();
    }

    public InterfaceC92434Ca AZI() {
        return (C4CZ) this.A0z.getValue();
    }

    @Override // X.InterfaceC686036x
    public final InterfaceC11380iw Abd() {
        if (this instanceof C685736u) {
            return ((C685736u) this).A0O;
        }
        return (InterfaceC11380iw) this.A02;
    }

    @Override // X.InterfaceC688337u
    public final JG1 AcJ() {
        return (C37508GfQ) this.A10.getValue();
    }

    @Override // X.InterfaceC688437v
    public final BC6 AhG() {
        return (G7L) this.A11.getValue();
    }

    @Override // X.InterfaceC687937q
    public final InterfaceC89303yW Ai6() {
        return (C89293yV) this.A12.getValue();
    }

    @Override // X.C37M
    public InterfaceC80083hx Ai8() {
        return (C80073hw) this.A13.getValue();
    }

    @Override // X.InterfaceC688037r
    public final MP4 AiF() {
        return (G7K) this.A14.getValue();
    }

    public InterfaceC101004gG Am6() {
        return (C100994gF) this.A15.getValue();
    }

    public InterfaceC101074gN Am7() {
        return (C101064gM) this.A16.getValue();
    }

    public InterfaceC904041a AmA() {
        return (C41Z) this.A17.getValue();
    }

    @Override // X.InterfaceC686136y
    public final InterfaceC677433o AmD() {
        return (InterfaceC677433o) this.A19.getValue();
    }

    public C3VU AmF() {
        return (C3VT) this.A18.getValue();
    }

    @Override // X.C37W
    public final InterfaceC904541f AmN() {
        return (C904441e) this.A1A.getValue();
    }

    @Override // X.InterfaceC687137i
    public final JPY AmO() {
        return (C42446Iqn) this.A1B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.BC9] */
    @Override // X.C37P
    public final BC9 AmP() {
        return new Object();
    }

    public InterfaceC105254of AmS() {
        return (C105244oe) this.A1C.getValue();
    }

    public C41V AmT() {
        return (C41U) this.A1D.getValue();
    }

    @Override // X.InterfaceC686837f
    public final InterfaceC30995Dju Aot() {
        return (C42606ItP) this.A1E.getValue();
    }

    @Override // X.InterfaceC687237j
    public final InterfaceC43438JHc Ap4() {
        return (C42453Iqu) this.A1F.getValue();
    }

    @Override // X.InterfaceC686136y
    public final InterfaceC25197BCu Ap6() {
        return (C37509GfR) this.A1G.getValue();
    }

    @Override // X.InterfaceC686437b
    public final InterfaceC30994Djt ApD() {
        return (C42455Iqw) this.A1H.getValue();
    }

    @Override // X.InterfaceC688137s
    public final InterfaceC43587JPs ApE() {
        return (C37503GfL) this.A1I.getValue();
    }

    @Override // X.C37K
    public final InterfaceC86673tf ApH() {
        return (C86663te) this.A1J.getValue();
    }

    @Override // X.InterfaceC686136y
    public final InterfaceC690238o Aqv() {
        return this.A0J;
    }

    @Override // X.AnonymousClass372
    public final C39G Ar3() {
        Object value = this.A23.getValue();
        C14360o3.A07(value);
        return (C39G) value;
    }

    @Override // X.InterfaceC686136y
    public final C39P B5R() {
        return (C39O) this.A1Q.getValue();
    }

    @Override // X.InterfaceC688237t
    public final MSN B5X() {
        return (C49376LsA) this.A1R.getValue();
    }

    @Override // X.InterfaceC686136y
    public final InterfaceC87303un B5c() {
        return (C87293um) this.A1S.getValue();
    }

    @Override // X.InterfaceC687337k
    public final C4FX B5j() {
        return (C4FW) this.A1T.getValue();
    }

    @Override // X.InterfaceC686136y
    public final InterfaceC63362uJ B5k() {
        return this.A2V;
    }

    @Override // X.InterfaceC686036x
    public final InterfaceC65282xQ B5p() {
        if (this instanceof C685736u) {
            return ((C685736u) this).A0L;
        }
        return this.A0O;
    }

    @Override // X.C37Y
    public InterfaceC80023hr B5t() {
        return (C80013hq) this.A1U.getValue();
    }

    @Override // X.InterfaceC688537w
    public final JH2 B95() {
        return (C37506GfO) this.A1W.getValue();
    }

    public InterfaceC690038m BDf() {
        return (C689938l) this.A1X.getValue();
    }

    @Override // X.InterfaceC686136y
    public final JH3 BES() {
        return (C37515GfX) this.A1b.getValue();
    }

    @Override // X.InterfaceC688637x
    public final JH4 BF2() {
        return (C29275CvW) this.A1Z.getValue();
    }

    @Override // X.InterfaceC686136y
    public final InterfaceC57993Pnd BFd() {
        return (C42834IxA) this.A1a.getValue();
    }

    @Override // X.C37Q
    public final InterfaceC81083jd BNt() {
        return (C81073jc) this.A1d.getValue();
    }

    @Override // X.InterfaceC686136y
    public final InterfaceC87013uH BQk() {
        return (C87003uG) this.A1e.getValue();
    }

    @Override // X.AnonymousClass370
    public final JG7 BQm() {
        return (C42618Itb) this.A1f.getValue();
    }

    @Override // X.InterfaceC687537m
    public final InterfaceC43586JPr BQu() {
        return (C42624Ith) this.A1g.getValue();
    }

    @Override // X.InterfaceC686937g
    public final JPZ BQv() {
        return (C42626Itj) this.A1h.getValue();
    }

    public InterfaceC75453aC BQw() {
        return (C75443aB) this.A1i.getValue();
    }

    public InterfaceC86223st BQy() {
        return (C86213ss) this.A1j.getValue();
    }

    @Override // X.InterfaceC686637d
    public final InterfaceC909543n BR7() {
        return (C909443m) this.A1k.getValue();
    }

    @Override // X.C37C
    public final C3h2 BRL() {
        return (C79543h1) this.A1m.getValue();
    }

    @Override // X.InterfaceC686537c
    public final InterfaceC144646fk BRM() {
        return (C42459Ir0) this.A1n.getValue();
    }

    public AnonymousClass388 BRS() {
        return (C42811Iwn) this.A1o.getValue();
    }

    @Override // X.C37D
    public final InterfaceC80063hv BRf() {
        return (C80053hu) this.A1p.getValue();
    }

    @Override // X.InterfaceC686236z
    public final InterfaceC86303t2 BRj() {
        return (C86293t1) this.A1q.getValue();
    }

    @Override // X.AnonymousClass374
    public final InterfaceC86433tG BRk() {
        return (C86423tF) this.A1r.getValue();
    }

    @Override // X.InterfaceC687037h
    public final InterfaceC75543aL BRn() {
        return (C75533aK) this.A1s.getValue();
    }

    public InterfaceC86963uC BRs() {
        return (C86953uB) this.A1t.getValue();
    }

    @Override // X.InterfaceC686136y
    public final InterfaceC77113cx BRt() {
        return (C77093cv) this.A1u.getValue();
    }

    public JG2 BRu() {
        return (C42499Ire) this.A1v.getValue();
    }

    @Override // X.InterfaceC686737e
    public final InterfaceC79903hf BRv() {
        return (C79893he) this.A1w.getValue();
    }

    public InterfaceC909343k BRw() {
        return (C909243j) this.A1x.getValue();
    }

    @Override // X.InterfaceC687437l
    public final BC8 BRx() {
        return (C42503Iri) this.A1y.getValue();
    }

    @Override // X.C37U
    public final InterfaceC85133r1 BS2() {
        return (C85123r0) this.A1z.getValue();
    }

    @Override // X.C37F
    public final InterfaceC76043b9 BS4() {
        return (C76023b7) this.A20.getValue();
    }

    public InterfaceC79883hd BS5() {
        return (C79873hc) this.A21.getValue();
    }

    public InterfaceC75403a7 BS6() {
        return (C75393a6) this.A22.getValue();
    }

    @Override // X.InterfaceC687637n
    public final InterfaceC690738t BTh() {
        return this.A2X;
    }

    @Override // X.C37H
    public final AnonymousClass428 BZ0() {
        return (AnonymousClass427) this.A24.getValue();
    }

    @Override // X.InterfaceC688737y
    public final JH5 BZ1() {
        return (C37517GfZ) this.A25.getValue();
    }

    @Override // X.AnonymousClass379
    public final AnonymousClass421 BZ3() {
        return (AnonymousClass420) this.A26.getValue();
    }

    @Override // X.InterfaceC688837z
    public final BC7 BZ6() {
        return (C37518Gfa) this.A27.getValue();
    }

    @Override // X.AnonymousClass381
    public final InterfaceC31057Dkz BfD() {
        return (InterfaceC31057Dkz) this.A28.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.JPm] */
    @Override // X.C37G
    public final JPm Bgz() {
        return new Object();
    }

    @Override // X.InterfaceC64882wm
    public final JPn Bh2() {
        return (C42932Iyk) this.A29.getValue();
    }

    @Override // X.InterfaceC687737o
    public final InterfaceC64872wl Bh3() {
        return (C42935Iyn) this.A2A.getValue();
    }

    @Override // X.InterfaceC686136y
    public final JH6 BhU() {
        return (C37513GfV) this.A2B.getValue();
    }

    @Override // X.AnonymousClass378
    public final InterfaceC60682pr Br6() {
        return (C39A) this.A2C.getValue();
    }

    @Override // X.C37N
    public final SeekBar.OnSeekBarChangeListener Bs2() {
        return (C79953hk) this.A2D.getValue();
    }

    @Override // X.AnonymousClass380
    public final JH7 Buj() {
        return (C37510GfS) this.A2F.getValue();
    }

    public InterfaceC75603aR BxQ() {
        return (C75593aQ) this.A2G.getValue();
    }

    @Override // X.AnonymousClass382
    public final InterfaceC904641g BzI() {
        return (C42493IrY) this.A2H.getValue();
    }

    @Override // X.AnonymousClass383
    public final InterfaceC30944Dj1 C4d() {
        return (Aj5) this.A2I.getValue();
    }

    @Override // X.C37B
    public final InterfaceC31076DlJ C56() {
        return (C29394CxR) this.A2J.getValue();
    }

    @Override // X.AnonymousClass384
    public final AnonymousClass386 C8J() {
        return this.A2W;
    }

    public InterfaceC690438q C9C() {
        return (C690338p) this.A2K.getValue();
    }

    public InterfaceC692739n C9D() {
        return (C692639m) this.A2L.getValue();
    }

    @Override // X.AnonymousClass385
    public final InterfaceC76533by CCX() {
        return (C76523bx) this.A2M.getValue();
    }

    @Override // X.AnonymousClass375
    public final InterfaceC37202GaD CCt() {
        return (GFS) this.A2N.getValue();
    }

    @Override // X.C37T
    public final BDQ CD9() {
        return (C37511GfT) this.A2P.getValue();
    }

    @Override // X.C37I
    public final BDR CDB() {
        return (C37507GfP) this.A2Q.getValue();
    }

    @Override // X.C37V
    public C39D CHG() {
        return (C39C) this.A1P.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C685836v(final Fragment fragment, AbstractC10360h2 abstractC10360h2, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC60142ow interfaceC60142ow, C684436h c684436h, final UserSession userSession, C57112jm c57112jm, C684636j c684636j, InterfaceC114705Ga interfaceC114705Ga, C5Gi c5Gi, C36Y c36y, InterfaceC114745Gf interfaceC114745Gf, final InterfaceC60442pS interfaceC60442pS, C33A c33a, AbstractC61692rW abstractC61692rW, InterfaceC65282xQ interfaceC65282xQ, C33F c33f, C33F c33f2, C33F c33f3, C684736k c684736k, C57332k8 c57332k8, C33P c33p, C36Q c36q, C81063jb c81063jb, C1Y1 c1y1, InterfaceC59832oQ interfaceC59832oQ, ViewOnKeyListenerC677333n viewOnKeyListenerC677333n, InterfaceC114755Gg interfaceC114755Gg, C64842wi c64842wi, AnonymousClass388 anonymousClass388, SearchContext searchContext, InterfaceC61432r6 interfaceC61432r6, C676533f c676533f, C1M1 c1m1, EnumC114765Gh enumC114765Gh, Long l, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        Object obj;
        this.A02 = fragment;
        this.A03 = abstractC10360h2;
        this.A0K = interfaceC60442pS;
        this.A0O = interfaceC65282xQ;
        this.A0W = c33p;
        this.A0b = viewOnKeyListenerC677333n;
        this.A0H = c36y;
        this.A0M = c33a;
        this.A0o = c676533f;
        this.A0A = userSession;
        this.A0Q = c33f;
        this.A0R = c33f2;
        this.A0P = c33f3;
        this.A0f = anonymousClass388;
        this.A06 = c684436h;
        this.A0T = c57332k8;
        this.A2T = z;
        this.A0I = interfaceC114745Gf;
        this.A0B = c57112jm;
        this.A0X = c36q;
        this.A0t = str;
        this.A0w = str2;
        this.A0s = str3;
        this.A0a = c1y1;
        this.A0E = c684636j;
        this.A0S = c684736k;
        this.A0n = interfaceC61432r6;
        this.A2Y = interfaceC59832oQ;
        this.A2U = z2;
        this.A2R = z3;
        this.A0c = interfaceC114755Gg;
        this.A0u = str4;
        this.A0F = interfaceC114705Ga;
        this.A0q = enumC114765Gh;
        this.A0G = c5Gi;
        this.A2S = z4;
        this.A0g = searchContext;
        this.A0d = c64842wi;
        this.A04 = viewOnTouchListenerC60632pm;
        this.A0Z = c81063jb;
        this.A0r = l;
        this.A0x = str5;
        this.A05 = interfaceC60142ow;
        this.A0N = abstractC61692rW;
        C17050sx A01 = AbstractC09440dt.A01(new C9ER(c1m1, 39));
        this.A2E = A01;
        this.A07 = new C675432t(userSession, interfaceC60442pS, (C1M1) A01.getValue());
        this.A0i = new AnonymousClass389(fragment, interfaceC60442pS, userSession);
        this.A0h = new C38A(interfaceC60442pS, userSession, str2, null, null);
        this.A0V = new C57462kL(userSession);
        this.A08 = AbstractC25651Mw.A00(userSession);
        this.A0p = C17060sy.A01.A01(userSession);
        this.A0e = new C38E((InterfaceC11380iw) fragment, userSession, new C38C(fragment, -1));
        String obj2 = UUID.randomUUID().toString();
        C14360o3.A07(obj2);
        this.A0v = obj2;
        this.A0k = new C38R(fragment.requireActivity(), userSession, c57112jm, interfaceC60442pS, interfaceC65282xQ, str2, null, null, false);
        this.A0j = new C38T(userSession, c57112jm, interfaceC60442pS);
        this.A0l = new C64892wn(userSession, c57112jm, interfaceC60442pS, str2, null, null, interfaceC60442pS.getModuleName(), null, null, null, -1);
        C1M1 c1m12 = (C1M1) this.A2E.getValue();
        this.A0Y = new C38W(fragment, fragment.requireActivity(), userSession, (C1GL) fragment, interfaceC60442pS, c1m12);
        this.A0C = new C689038b(userSession, c57112jm, interfaceC60442pS);
        this.A0m = new C689438f(userSession, interfaceC60442pS, c81063jb, interfaceC61432r6, (C1M1) this.A2E.getValue());
        this.A0U = new C689538g(fragment, abstractC10360h2, userSession);
        this.A09 = new InterfaceC41501vz() { // from class: X.38h
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj3) {
                int A03 = C0f9.A03(1455928470);
                C72263Lz c72263Lz = (C72263Lz) obj3;
                int A032 = C0f9.A03(-1049346959);
                C14360o3.A0B(c72263Lz, 0);
                C685836v c685836v = C685836v.this;
                C38321qM c38321qM = c72263Lz.A00;
                C75113Zb BRZ = c685836v.A0O.BRZ(c38321qM);
                c685836v.A0n.DVi(C6T5.A00(), AnonymousClass317.A0O, c38321qM, BRZ);
                C0f9.A0A(1004875015, A032);
                C0f9.A0A(-549560316, A03);
            }
        };
        this.A0D = new C38i(userSession, interfaceC60442pS.getModuleName());
        this.A0L = AbstractC689738j.A00(userSession);
        this.A1l = AbstractC09440dt.A01(new C9ER(this, 10));
        this.A1M = AbstractC09440dt.A01(new C9EG(this, 34));
        this.A1K = AbstractC09440dt.A01(new C9EG(this, 32));
        this.A1Y = AbstractC09440dt.A01(new C9EG(this, 46));
        this.A1N = AbstractC09440dt.A01(new C9EG(this, 35));
        this.A1O = AbstractC09440dt.A01(new C9EG(this, 36));
        this.A1L = AbstractC09440dt.A01(new C9EG(this, 33));
        this.A2O = AbstractC09440dt.A01(new C9ER(this, 49));
        this.A1S = AbstractC09440dt.A01(new C9EG(this, 40));
        this.A1X = AbstractC09440dt.A01(new C9EG(this, 45));
        this.A1s = AbstractC09440dt.A01(new C9ER(this, 17));
        this.A1J = AbstractC09440dt.A01(new C9EG(this, 31));
        this.A23 = AbstractC09440dt.A01(new C9ER(this, 28));
        this.A2K = AbstractC09440dt.A01(new C9ER(this, 45));
        this.A2J = AbstractC09440dt.A01(new C9ER(this, 44));
        this.A1b = AbstractC09440dt.A01(new C9EG(this, 49));
        this.A2B = AbstractC09440dt.A01(new C9ER(this, 36));
        this.A2N = AbstractC09440dt.A01(new C9ER(this, 48));
        this.A1R = AbstractC09440dt.A01(new C9EG(this, 39));
        this.A0J = new C690138n(fragment.requireContext(), userSession, interfaceC60442pS, interfaceC65282xQ, (C689938l) this.A1X.getValue(), (C1M1) this.A2E.getValue());
        this.A1o = AbstractC09440dt.A01(new C9ER(this, 13));
        this.A1W = AbstractC09440dt.A01(new C9EG(this, 44));
        this.A25 = AbstractC09440dt.A01(new C9ER(this, 30));
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A27 = AbstractC09440dt.A00(enumC09460dv, new C9ER(this, 32));
        this.A26 = AbstractC09440dt.A01(new C9ER(this, 31));
        this.A24 = AbstractC09440dt.A00(enumC09460dv, new C9ER(this, 29));
        final C690338p c690338p = (C690338p) this.A2K.getValue();
        this.A2W = new AnonymousClass386(fragment, c690338p) { // from class: X.38r
            public final Fragment A00;
            public final InterfaceC690438q A01;

            {
                C14360o3.A0B(c690338p, 2);
                this.A00 = fragment;
                this.A01 = c690338p;
            }

            @Override // X.AnonymousClass386
            public final void D42(C4dV c4dV, C119835bh c119835bh) {
                C42592ItB c42592ItB = new C42592ItB(c4dV, c119835bh);
                c119835bh.EVm(EnumC114405Eh.A02);
                InterfaceC08430c6 interfaceC08430c6 = this.A00;
                C14360o3.A0C(interfaceC08430c6, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.ScrollingViewProxyProvider");
                C3FQ scrollingViewProxy = ((InterfaceC60682pr) interfaceC08430c6).getScrollingViewProxy();
                if (scrollingViewProxy != null) {
                    c42592ItB.A00(this.A01, scrollingViewProxy);
                }
            }
        };
        this.A1v = AbstractC09440dt.A01(new C9ER(this, 20));
        this.A1t = AbstractC09440dt.A01(new C9ER(this, 18));
        this.A1x = AbstractC09440dt.A01(new C9ER(this, 22));
        this.A1w = AbstractC09440dt.A01(new C9ER(this, 21));
        this.A1u = AbstractC09440dt.A01(new C9ER(this, 19));
        this.A1e = AbstractC09440dt.A01(new C9ER(this, 2));
        this.A1i = AbstractC09440dt.A01(new C9ER(this, 7));
        this.A1f = AbstractC09440dt.A01(new C9ER(this, 4));
        this.A2Z = AbstractC09440dt.A01(new C9ER(this, 3));
        this.A1d = AbstractC09440dt.A01(new C9ER(this, 1));
        this.A1j = AbstractC09440dt.A01(new C9ER(this, 8));
        this.A1h = AbstractC09440dt.A01(new C9ER(this, 6));
        this.A1q = AbstractC09440dt.A01(new C9ER(this, 15));
        this.A1F = AbstractC09440dt.A01(new C9EG(this, 27));
        this.A2L = AbstractC09440dt.A01(new C9ER(this, 46));
        this.A1k = AbstractC09440dt.A01(new C9ER(this, 9));
        this.A1H = AbstractC09440dt.A01(new C9EG(this, 29));
        this.A1G = AbstractC09440dt.A01(new C9EG(this, 28));
        this.A0z = AbstractC09440dt.A01(new C9EG(this, 11));
        this.A13 = AbstractC09440dt.A01(new C9EG(this, 15));
        this.A17 = AbstractC09440dt.A01(new C9EG(this, 19));
        this.A1m = AbstractC09440dt.A01(new C9ER(this, 11));
        this.A1p = AbstractC09440dt.A01(new C9ER(this, 14));
        this.A1C = AbstractC09440dt.A01(new C9EG(this, 24));
        this.A1D = AbstractC09440dt.A01(new C9EG(this, 25));
        this.A1r = AbstractC09440dt.A01(new C9ER(this, 16));
        this.A16 = AbstractC09440dt.A01(new C9EG(this, 18));
        this.A2I = AbstractC09440dt.A01(new C9ER(this, 43));
        this.A15 = AbstractC09440dt.A01(new C9EG(this, 17));
        this.A1B = AbstractC09440dt.A01(new C9EG(this, 23));
        this.A1A = AbstractC09440dt.A01(new C9EG(this, 22));
        this.A18 = AbstractC09440dt.A01(new C9EG(this, 20));
        this.A19 = AbstractC09440dt.A01(new C9EG(this, 21));
        this.A21 = AbstractC09440dt.A01(new C9ER(this, 26));
        this.A2H = AbstractC09440dt.A01(new C9ER(this, 42));
        this.A29 = AbstractC09440dt.A01(new C9ER(this, 34));
        this.A2A = AbstractC09440dt.A01(new C9ER(this, 35));
        this.A1n = AbstractC09440dt.A01(new C9ER(this, 12));
        this.A2F = AbstractC09440dt.A01(new C9ER(this, 40));
        this.A11 = AbstractC09440dt.A01(new C9EG(this, 13));
        this.A1Z = AbstractC09440dt.A01(new C9EG(this, 47));
        this.A1U = AbstractC09440dt.A01(new C9EG(this, 42));
        this.A1a = AbstractC09440dt.A01(new C9EG(this, 48));
        this.A2G = AbstractC09440dt.A01(new C9ER(this, 41));
        this.A20 = AbstractC09440dt.A01(new C9ER(this, 25));
        this.A1V = AbstractC09440dt.A01(new C9EG(this, 43));
        this.A1Q = AbstractC09440dt.A01(new C9EG(this, 38));
        this.A22 = AbstractC09440dt.A01(new C9ER(this, 27));
        this.A1T = AbstractC09440dt.A01(new C9EG(this, 41));
        this.A2C = AbstractC09440dt.A01(new C9ER(this, 37));
        this.A10 = AbstractC09440dt.A01(new C9EG(this, 12));
        this.A2Q = AbstractC09440dt.A01(new C207019Eg(this, 1));
        this.A2P = AbstractC09440dt.A01(new C207019Eg(this, 0));
        this.A1g = AbstractC09440dt.A01(new C9ER(this, 5));
        this.A1I = AbstractC09440dt.A01(new C9EG(this, 30));
        this.A12 = AbstractC09440dt.A01(new C9EG(this, 14));
        this.A1c = AbstractC09440dt.A01(new C9ER(this, 0));
        this.A1E = AbstractC09440dt.A01(new C9EG(this, 26));
        this.A2M = AbstractC09440dt.A01(new C9ER(this, 47));
        this.A14 = AbstractC09440dt.A01(new C9EG(this, 16));
        this.A0y = AbstractC09440dt.A01(new C9EG(this, 10));
        this.A1P = AbstractC09440dt.A01(new C9EG(this, 37));
        AbstractC65512xn.A00(userSession);
        if (C57462kL.A01(userSession)) {
            final C1M1 c1m13 = (C1M1) this.A2E.getValue();
            obj = new InterfaceC690738t(userSession, interfaceC60442pS, c1m13) { // from class: X.4f9
                public final UserSession A00;
                public final InterfaceC60442pS A01;
                public final C1M1 A02;

                {
                    C14360o3.A0B(c1m13, 2);
                    this.A00 = userSession;
                    this.A02 = c1m13;
                    this.A01 = interfaceC60442pS;
                }

                @Override // X.InterfaceC690738t
                public final void Cka(C38321qM c38321qM, C75113Zb c75113Zb) {
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    UserSession userSession2 = this.A00;
                    C1M1 c1m14 = this.A02;
                    InterfaceC60442pS interfaceC60442pS2 = this.A01;
                    C82713mZ A02 = AbstractC82703mY.A02(userSession2, c38321qM, interfaceC60442pS2, c1m14, Integer.valueOf(c75113Zb.getPosition()), -1, "more_indicator_tap");
                    if (A02 != null) {
                        C32U.A0C(userSession2, A02, c38321qM, interfaceC60442pS2, null);
                    }
                }

                @Override // X.InterfaceC690738t
                public final void Ckb(C38321qM c38321qM, C75113Zb c75113Zb) {
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    UserSession userSession2 = this.A00;
                    C1M1 c1m14 = this.A02;
                    InterfaceC60442pS interfaceC60442pS2 = this.A01;
                    C82713mZ A02 = AbstractC82703mY.A02(userSession2, c38321qM, interfaceC60442pS2, c1m14, Integer.valueOf(c75113Zb.getPosition()), -1, "feed_video_end_scene_impression");
                    if (A02 != null) {
                        A02.A01 = c38321qM.A0l();
                        A02.A5R = "more_indicator";
                        C11520jB c11520jB = new C11520jB();
                        Map map = c11520jB.A00;
                        map.put("mid_nudge_auto_dismiss_enabled", true);
                        AbstractC65512xn.A00(userSession2);
                        double A00 = C18U.A00(C06090Tz.A05, userSession2, 37173663501910626L);
                        if (A00 == 0.0d) {
                            A00 = c38321qM.A0l() / 3.0d;
                        }
                        map.put("mid_nudge_auto_dismiss_duration", Double.valueOf(A00));
                        A02.A0E(c11520jB);
                        C32U.A0C(userSession2, A02, c38321qM, interfaceC60442pS2, null);
                    }
                }
            };
        } else {
            obj = new Object();
        }
        this.A2X = (InterfaceC690738t) obj;
        this.A2V = new C63352uI(fragment, userSession, interfaceC60442pS, (InterfaceC60682pr) fragment);
        this.A2D = AbstractC09440dt.A01(new C9ER(this, 38));
        this.A1z = AbstractC09440dt.A01(new C9ER(this, 24));
        this.A28 = AbstractC09440dt.A01(new C9ER(this, 33));
        this.A1y = AbstractC09440dt.A01(new C9ER(this, 23));
        final InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.38u
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj3) {
                int A03 = C0f9.A03(126907825);
                int A032 = C0f9.A03(582307834);
                C685836v.this.A01 = true;
                C0f9.A0A(415197419, A032);
                C0f9.A0A(215220021, A03);
            }
        };
        final InterfaceC41501vz interfaceC41501vz2 = new InterfaceC41501vz() { // from class: X.38v
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj3) {
                int A03 = C0f9.A03(-1143201332);
                int A032 = C0f9.A03(-1235313960);
                C685836v.this.A01 = false;
                C0f9.A0A(1501627603, A032);
                C0f9.A0A(-1400936593, A03);
            }
        };
        final InterfaceC41501vz interfaceC41501vz3 = new InterfaceC41501vz() { // from class: X.38w
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj3) {
                int A03 = C0f9.A03(-917528200);
                C3MY c3my = (C3MY) obj3;
                int A032 = C0f9.A03(-1843720513);
                C14360o3.A0B(c3my, 0);
                boolean z5 = c3my.A00;
                C33P c33p2 = C685836v.this.A0W;
                if (z5) {
                    C30E c30e = c33p2.A0G;
                    C4QW c4qw = c30e.A05;
                    if (c4qw == null || !c4qw.isPlaying()) {
                        c30e.A0M();
                    }
                } else {
                    c33p2.A0G.A0U("bottom_sheet_height_threshold_reached");
                }
                C0f9.A0A(-1130299998, A032);
                C0f9.A0A(1436087898, A03);
            }
        };
        final InterfaceC41501vz interfaceC41501vz4 = new InterfaceC41501vz() { // from class: X.38x
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj3) {
                int A03 = C0f9.A03(-226131671);
                int A032 = C0f9.A03(-338841509);
                C30E c30e = C685836v.this.A0W.A0G;
                C4QW c4qw = c30e.A05;
                if (c4qw == null || !c4qw.isPlaying()) {
                    c30e.A0M();
                }
                C0f9.A0A(833439157, A032);
                C0f9.A0A(1994411428, A03);
            }
        };
        ((InterfaceC59992oh) fragment).registerLifecycleListener(new AbstractC60592pi() { // from class: X.38y
            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            public final void onDestroy() {
                ((InterfaceC59992oh) this.A02).unregisterLifecycleListener(this);
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
            
                if (X.C72293Mc.A01(r2) != false) goto L6;
             */
            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onPause() {
                /*
                    r5 = this;
                    X.36v r4 = r5
                    X.1My r3 = r4.A08
                    java.lang.Class<X.3MW> r1 = X.C3MW.class
                    X.1vz r0 = r2
                    r3.A02(r0, r1)
                    java.lang.Class<X.3MX> r1 = X.C3MX.class
                    X.1vz r0 = r3
                    r3.A02(r0, r1)
                    java.lang.Class<X.3MY> r1 = X.C3MY.class
                    X.1vz r0 = r4
                    r3.A02(r0, r1)
                    com.instagram.common.session.UserSession r2 = r4.A0A
                    X.317 r1 = X.AnonymousClass317.A0O
                    java.util.List r0 = X.C3MZ.A02
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L35
                    X.3Mc r0 = X.AbstractC72283Mb.A00
                    boolean r0 = X.C72293Mc.A01(r2)
                    if (r0 == 0) goto L35
                L2d:
                    java.lang.Class<X.3Lz> r1 = X.C72263Lz.class
                    X.1vz r0 = r4.A09
                    r3.A02(r0, r1)
                L34:
                    return
                L35:
                    java.util.List r0 = X.C3MZ.A03
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L34
                    X.3Mc r0 = X.AbstractC72283Mb.A00
                    boolean r0 = X.C72293Mc.A00(r2)
                    if (r0 == 0) goto L34
                    goto L2d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C691238y.onPause():void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
            
                if (X.C72293Mc.A01(r2) != false) goto L6;
             */
            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onResume() {
                /*
                    r5 = this;
                    X.36v r4 = r5
                    X.1My r3 = r4.A08
                    java.lang.Class<X.3MW> r1 = X.C3MW.class
                    X.1vz r0 = r2
                    r3.A01(r0, r1)
                    java.lang.Class<X.3MX> r1 = X.C3MX.class
                    X.1vz r0 = r3
                    r3.A01(r0, r1)
                    java.lang.Class<X.3MY> r1 = X.C3MY.class
                    X.1vz r0 = r4
                    r3.A01(r0, r1)
                    com.instagram.common.session.UserSession r2 = r4.A0A
                    X.317 r1 = X.AnonymousClass317.A0O
                    java.util.List r0 = X.C3MZ.A02
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L35
                    X.3Mc r0 = X.AbstractC72283Mb.A00
                    boolean r0 = X.C72293Mc.A01(r2)
                    if (r0 == 0) goto L35
                L2d:
                    java.lang.Class<X.3Lz> r1 = X.C72263Lz.class
                    X.1vz r0 = r4.A09
                    r3.A01(r0, r1)
                L34:
                    return
                L35:
                    java.util.List r0 = X.C3MZ.A03
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L34
                    X.3Mc r0 = X.AbstractC72283Mb.A00
                    boolean r0 = X.C72293Mc.A00(r2)
                    if (r0 == 0) goto L34
                    goto L2d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C691238y.onResume():void");
            }

            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            public final void onStart() {
                AbstractC25651Mw.A00(this.A0A).A01(interfaceC41501vz4, C3IJ.class);
            }

            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            public final void onStop() {
                AbstractC25651Mw.A00(this.A0A).A02(interfaceC41501vz4, C3IJ.class);
            }
        });
    }
}
