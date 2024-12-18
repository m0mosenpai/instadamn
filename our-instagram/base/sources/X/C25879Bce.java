package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.aistudio.editor.AiCreationViewModelV2$creationAiConfigurationUiState$1;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Bce, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25879Bce extends AbstractC52922bZ {
    public final C27271C1v A00;
    public final UserSession A01;
    public final String A02 = AbstractC167017dG.A0j();
    public final InterfaceC09390do A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C0UO A0D;
    public final C0UO A0E;
    public final C0UO A0F;
    public final C0UO A0G;
    public final C0UO A0H;
    public final C0UO A0I;
    public final C0UO A0J;
    public final C0UO A0K;
    public final C0UO A0L;
    public final C0UO A0M;
    public final C0UO A0N;
    public final C0UO A0O;
    public final C0UO A0P;
    public final C0UO A0Q;
    public final C0UO A0R;
    public final C0UO A0S;
    public final C0UO A0T;
    public final C0UO A0U;
    public final C0UO A0V;
    public final C0UO A0W;
    public final C05A A0X;

    public final void A0F(String str) {
        C26072Bg1 c26072Bg1;
        boolean z;
        String str2;
        C05A c05a = this.A04;
        C26072Bg1 c26072Bg12 = (C26072Bg1) c05a.getValue();
        if (c26072Bg12 != null) {
            C26083BgC A0a = AbstractC25235BEs.A0a(this.A00.A0b);
            UserSession userSession = this.A01;
            int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573360398L);
            if (!AbstractC001900j.A0T(str) && str.length() <= A07) {
                if (A0a != null) {
                    str2 = A0a.A0C;
                } else {
                    str2 = null;
                }
                z = !str.equals(str2);
            } else {
                z = false;
            }
            c26072Bg1 = C26072Bg1.A00(c26072Bg12, str, null, null, null, null, 2014, z, false, false, false, false);
        } else {
            c26072Bg1 = null;
        }
        c05a.Egh(c26072Bg1);
    }

    public C25879Bce(C27271C1v c27271C1v, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c27271C1v;
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A09 = A1H;
        this.A0R = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(null);
        this.A0C = A00;
        this.A0W = AbstractC208910l.A02(A00);
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A06 = A1H2;
        this.A0M = AbstractC208910l.A02(A1H2);
        C008002u A002 = C10E.A00(null);
        this.A0B = A002;
        this.A0U = AbstractC208910l.A02(A002);
        this.A0F = c27271C1v.A0c;
        C008002u A003 = C10E.A00(null);
        this.A0X = A003;
        this.A0V = AbstractC208910l.A02(A003);
        C008002u A004 = C10E.A00(null);
        this.A05 = A004;
        C008002u A005 = C10E.A00(null);
        this.A0A = A005;
        this.A0S = AbstractC208910l.A02(A005);
        this.A0E = c27271C1v.A0Z;
        this.A0T = c27271C1v.A0u;
        this.A03 = C29909DGx.A00(this, 23);
        C008002u A006 = C10E.A00(null);
        this.A04 = A006;
        this.A0D = AbstractC208910l.A02(A006);
        C141796aw A007 = AbstractC141776au.A00(this);
        PZA pza = new PZA(this, (InterfaceC23621Ds) null, 46);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new PZA(this, (InterfaceC23621Ds) null, 45), AbstractC25235BEs.A0W(this, anonymousClass191, new PZA(this, (InterfaceC23621Ds) null, 44), AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0W(this, anonymousClass191, new PZA(this, (InterfaceC23621Ds) null, 49), AbstractC25235BEs.A0W(this, anonymousClass191, new PZA(this, (InterfaceC23621Ds) null, 48), AbstractC25235BEs.A0W(this, anonymousClass191, new PZA(this, (InterfaceC23621Ds) null, 47), AbstractC25235BEs.A0W(this, anonymousClass191, pza, A007)))), 0), 1), 2), 3), 4)));
        MWG mwg = new MWG(3, this, c27271C1v.A0t);
        this.A0K = AbstractC208910l.A01(new C51758Mth(null, 3, 4, false), AbstractC141776au.A00(this), mwg, new C15020pI(0L));
        C0UO c0uo = c27271C1v.A0b;
        C0UO c0uo2 = c27271C1v.A0v;
        C0UO c0uo3 = c27271C1v.A0a;
        C15200pa A01 = C10Q.A01(new D5K(this, null, 0), A004, c0uo, c0uo2, c0uo3);
        this.A0G = AbstractC208910l.A01(new C26061Bfo((InterfaceC30793DgU) null, (InterfaceC30794DgV) null, (InterfaceC30795DgW) null, (InterfaceC30796DgX) null, (String) null, (String) null, (String) null, (String) null, (List) null, 1023, false), AbstractC141776au.A00(this), A01, new C15020pI(0L));
        C15230pd A008 = C10Q.A00(new BUP(this, null, 0), c27271C1v.A0z, c27271C1v.A0k, c27271C1v.A0y);
        this.A0L = AbstractC208910l.A01(new C51748MtX(AbstractC35051FcO.A01(userSession)), AbstractC141776au.A00(this), A008, new C15020pI(0L));
        C15180pY A02 = C10Q.A02(new D5O(this, null, 0), c0uo2, c0uo, c0uo3, c27271C1v.A0q, c27271C1v.A0r);
        C141796aw A009 = AbstractC141776au.A00(this);
        C15020pI c15020pI = new C15020pI(0L);
        C29085CsC c29085CsC = C29085CsC.A00;
        C29088CsF c29088CsF = C29088CsF.A00;
        C29087CsE c29087CsE = C29087CsE.A00;
        C16930sl c16930sl = C16930sl.A00;
        this.A0J = AbstractC208910l.A01(new C26049Bfc(null, c29085CsC, c29087CsE, c29088CsF, null, null, null, null, "", null, "", c16930sl, false, false, false, false, false, false, false, false, false), A009, A02, c15020pI);
        C15200pa A012 = C10Q.A01(new AiCreationViewModelV2$creationAiConfigurationUiState$1(this, null), c0uo, c0uo3, c27271C1v.A0w, c27271C1v.A0j);
        this.A0H = AbstractC208910l.A01(new C26048Bfb(AbstractC25225BEi.A0t(""), null, "", null, null, "", "", "", "", c16930sl, c16930sl, 0, false, false, false), AbstractC141776au.A00(this), A012, new C15020pI(0L));
        C15230pd A0010 = C10Q.A00(new D5F(0, (InterfaceC23621Ds) null), c0uo, c27271C1v.A0m, c27271C1v.A0x);
        this.A0Q = AbstractC208910l.A01(new C26035BfO(C29086CsD.A00, "", null, R.drawable.instagram_arrow_cw_pano_outline_24, true), AbstractC141776au.A00(this), A0010, new C15020pI(0L));
        MWG mwg2 = new MWG(4, this, c0uo);
        this.A0N = AbstractC208910l.A01(new C51756Mtf((List) null, (DefaultConstructorMarker) null, 1, 14), AbstractC141776au.A00(this), mwg2, new C15020pI(0L));
        C15150pV A03 = C10Q.A03(new C57182PaB(3, null), c0uo, c0uo3);
        this.A0I = AbstractC208910l.A01(new C45126Jxv(), AbstractC141776au.A00(this), A03, new C15020pI(0L));
        C008002u A0011 = C10E.A00(null);
        this.A08 = A0011;
        this.A0P = AbstractC208910l.A02(A0011);
        C008002u A0012 = C10E.A00(null);
        this.A07 = A0012;
        this.A0O = AbstractC208910l.A02(A0012);
    }

    public static final boolean A04(C50679MYx c50679MYx, C25879Bce c25879Bce) {
        String str = c50679MYx.A00;
        if (!AbstractC001900j.A0T(str)) {
            int length = str.length();
            UserSession userSession = c25879Bce.A01;
            if (length <= AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573557009L)) {
                String str2 = c50679MYx.A01;
                if (AbstractC25225BEi.A1Y(str2) && str2.length() <= AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573491472L)) {
                    Object value = c25879Bce.A0O.getValue();
                    if (value != null) {
                        String A1A = AbstractC25228BEl.A1A(c50679MYx.A00);
                        C50679MYx c50679MYx2 = ((C26012Bf0) value).A02;
                        if (!C14360o3.A0K(A1A, c50679MYx2.A00) || !C14360o3.A0K(AbstractC25228BEl.A1A(c50679MYx.A01), c50679MYx2.A01)) {
                            return true;
                        }
                        return false;
                    }
                    throw AbstractC166997dE.A0g();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void A05() {
        C27271C1v c27271C1v = this.A00;
        AbstractC166997dE.A1Y(c27271C1v.A0L, false);
        List list = c27271C1v.A05;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25236BEt.A0x(it);
        }
        list.clear();
        AbstractC25226BEj.A0r(c27271C1v.A09).A06(C05F.A0C);
    }

    public final void A06() {
        C27271C1v c27271C1v = this.A00;
        C05A c05a = c27271C1v.A0S;
        Boolean A0a = AbstractC166997dE.A0a();
        c05a.Egh(A0a);
        c27271C1v.A0N.Egh(A0a);
        c27271C1v.A0O.Egh(A0a);
        c27271C1v.A0P.Egh(A0a);
        List list = c27271C1v.A07;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25236BEt.A0x(it);
        }
        list.clear();
        AbstractC25226BEj.A0r(c27271C1v.A09).A06(C05F.A0C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.Be9] */
    public final void A07() {
        boolean z;
        String str;
        C27271C1v c27271C1v = this.A00;
        String str2 = this.A02;
        C26083BgC A0a = AbstractC25235BEs.A0a(c27271C1v.A0b);
        if (A0a != null) {
            ?? graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A07(A0a.A07, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            graphQlCallInput.A07(A0a.A05, "persona_id");
            graphQlCallInput.A07(A0a.A08, "persona_version_id");
            graphQlCallInput.A07((String) c27271C1v.A0a.getValue(), DevServerEntity.COLUMN_DESCRIPTION);
            graphQlCallInput.A07(A0a.A0A, "tagline");
            C0UO c0uo = c27271C1v.A0c;
            Map map = (Map) c0uo.getValue();
            String str3 = A0a.A09;
            if (map.get(str3) != C83.ONLY_ME) {
                z = A0a.A0M;
            } else {
                z = false;
            }
            C0CA.A00(graphQlCallInput.A02(), Boolean.valueOf(z), "show_in_ig_profile_banner");
            graphQlCallInput.A07(A0a.A06, "updated_image_prompt");
            graphQlCallInput.A05("discoverable_apps", C27271C1v.A02(c27271C1v, A0a));
            C83 c83 = (C83) AbstractC25231BEo.A0o(str3, c0uo);
            if (c83 != null) {
                str = c83.name();
            } else {
                str = null;
            }
            graphQlCallInput.A07(str, "audience");
            graphQlCallInput.A07(AbstractC166997dE.A0n(), "client_mutation_id");
            graphQlCallInput.A07(str2, AbstractC65711Tsk.A00());
            String str4 = A0a.A0B;
            if (str4 != null) {
                graphQlCallInput.A07(str4, "updated_image_id");
            }
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A00(graphQlCallInput, "input");
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "KirbyCompleteQuickCreationMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59929QrD.class, true, null, 96, null, "xfb_kirby_mobile_complete_quick_create_genai_persona", AbstractC166987dD.A1E());
            pandoGraphQLRequest.setNetworkTimeoutSeconds(30);
            UserSession userSession = c27271C1v.A03;
            boolean A06 = C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36324011599146812L);
            C19L c19l = ((C4A7) c27271C1v).A01;
            if (A06) {
                AbstractC166987dD.A1Z(new JTH(A0a, c27271C1v, pandoGraphQLRequest, null, 10), c19l);
            } else {
                AbstractC166987dD.A1Z(new JTH(A0a, c27271C1v, pandoGraphQLRequest, null, 11), c19l);
            }
        }
    }

    public final void A08() {
        Object value = this.A04.getValue();
        if (value != null) {
            C26072Bg1 c26072Bg1 = (C26072Bg1) value;
            C27271C1v c27271C1v = this.A00;
            String str = c26072Bg1.A00;
            List list = c26072Bg1.A03;
            List list2 = c26072Bg1.A04;
            List list3 = c26072Bg1.A02;
            List list4 = c26072Bg1.A01;
            C14360o3.A0B(str, 0);
            AbstractC167027dH.A0a(1, list, list2, list3, list4);
            Object value2 = c27271C1v.A0b.getValue();
            if (value2 != null) {
                c27271C1v.A0C.Egh(C26083BgC.A00(null, null, (C26083BgC) value2, null, null, null, null, null, null, null, str, null, list2, null, null, list3, list, list4, 13104639, false, false));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A09() {
        String str;
        List list;
        List list2;
        List list3;
        List list4;
        C05A c05a = this.A04;
        C0UO c0uo = this.A00.A0b;
        C26083BgC A0a = AbstractC25235BEs.A0a(c0uo);
        if (A0a == null || (str = A0a.A0C) == null) {
            str = "";
        }
        C26083BgC A0a2 = AbstractC25235BEs.A0a(c0uo);
        if (A0a2 == null || (list = A0a2.A0H) == null) {
            list = C16930sl.A00;
        }
        C26083BgC A0a3 = AbstractC25235BEs.A0a(c0uo);
        if (A0a3 == null || (list2 = A0a3.A0J) == null) {
            list2 = C16930sl.A00;
        }
        C26083BgC A0a4 = AbstractC25235BEs.A0a(c0uo);
        if (A0a4 == null || (list3 = A0a4.A0G) == null) {
            list3 = C16930sl.A00;
        }
        C26083BgC A0a5 = AbstractC25235BEs.A0a(c0uo);
        if (A0a5 == null || (list4 = A0a5.A0E) == null) {
            list4 = C16930sl.A00;
        }
        c05a.Egh(new C26072Bg1(str, list, list2, list3, list4, false, false, false, false, false, C18U.A06(C06090Tz.A05, this.A01, 36330101860156095L)));
    }

    public final void A0A() {
        C27271C1v c27271C1v = this.A00;
        AbstractC166987dD.A1Z(new MCH(c27271C1v, (InterfaceC23621Ds) null, 22), ((C4A7) c27271C1v).A01);
    }

    public final void A0B() {
        C27271C1v c27271C1v = this.A00;
        c27271C1v.A0K.Egh(Integer.valueOf(AbstractC34041F0u.A00(c27271C1v.A03)));
    }

    public final void A0C(int i, String str) {
        List list;
        C26072Bg1 c26072Bg1;
        Object obj;
        boolean A1a;
        List list2;
        C05A c05a = this.A04;
        C26072Bg1 c26072Bg12 = (C26072Bg1) c05a.getValue();
        if (c26072Bg12 != null && (list = c26072Bg12.A03) != null) {
            ArrayList A1F = AbstractC166987dD.A1F(list);
            A1F.set(i, str);
            C26072Bg1 c26072Bg13 = (C26072Bg1) c05a.getValue();
            if (c26072Bg13 != null) {
                C26083BgC A0a = AbstractC25235BEs.A0a(this.A00.A0b);
                UserSession userSession = this.A01;
                if (str.length() > AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573622546L)) {
                    A1a = false;
                } else {
                    if (A0a != null && (list2 = A0a.A0H) != null) {
                        obj = list2.get(i);
                    } else {
                        obj = null;
                    }
                    A1a = AbstractC25225BEi.A1a(obj, str);
                }
                c26072Bg1 = C26072Bg1.A00(c26072Bg13, null, A1F, null, null, null, 2013, A1a, false, false, false, false);
            } else {
                c26072Bg1 = null;
            }
            c05a.Egh(c26072Bg1);
        }
    }

    public final void A0D(Integer num, String str, String str2, String str3) {
        List list;
        C27271C1v c27271C1v = this.A00;
        AbstractC25226BEj.A0r(c27271C1v.A09).A06.markerStart(673065652);
        C23671Dx A1L = AbstractC25226BEj.A1L(new D50(c27271C1v, num, str, str2, str3, null, 0), ((C4A7) c27271C1v).A01);
        if (!str.equals("welcome_message") && !str.equals("icebreaker_prompt_1") && !str.equals("icebreaker_prompt_2") && !str.equals("icebreaker_prompt_3")) {
            if (str.equals("example_dialogue")) {
                list = c27271C1v.A05;
            } else {
                list = c27271C1v.A06;
            }
        } else {
            list = c27271C1v.A07;
        }
        list.add(A1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r1 != 8) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(java.lang.String r19) {
        /*
            r18 = this;
            r0 = r18
            X.C1v r7 = r0.A00
            X.05A r0 = r7.A0X
            r1 = r19
            r0.Egh(r1)
            X.0UO r2 = r7.A0c
            java.lang.Object r1 = r2.getValue()
            java.util.Map r1 = (java.util.Map) r1
            X.0UO r5 = r7.A0w
            java.lang.Object r0 = r5.getValue()
            java.lang.Object r0 = r1.get(r0)
            X.C83 r0 = (X.C83) r0
            if (r0 == 0) goto L31
            int r1 = r0.ordinal()
            r17 = 1
            r0 = 7
            if (r1 == r0) goto L33
            r0 = 2
            if (r1 == r0) goto L33
            r0 = 8
            if (r1 == r0) goto L33
        L31:
            r17 = 0
        L33:
            java.lang.Object r1 = r2.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r5.getValue()
            java.lang.Object r2 = r1.get(r0)
            X.C83 r1 = X.C83.PUBLIC
            r8 = 0
            X.0UO r0 = r7.A0b
            X.BgC r0 = X.AbstractC25235BEs.A0a(r0)
            if (r2 != r1) goto L7b
            if (r0 == 0) goto La4
            java.util.List r0 = r0.A0F
            if (r0 == 0) goto La4
            java.util.ArrayList r14 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r6 = r0.iterator()
        L5a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r6.next()
            X.MtQ r0 = (X.C51741MtQ) r0
            java.lang.String r4 = r0.A02
            java.lang.String r3 = r0.A03
            java.lang.Object r2 = r0.A01
            X.Rh3 r2 = (X.EnumC61203Rh3) r2
            r1 = 1
            X.AbstractC167017dG.A1O(r4, r2)
            X.MtQ r0 = new X.MtQ
            r0.<init>(r2, r4, r3, r1)
            r14.add(r0)
            goto L5a
        L7b:
            if (r0 == 0) goto La4
            java.util.List r14 = r0.A0F
        L7f:
            X.05A r2 = r7.A0C
        L81:
            java.lang.Object r1 = r2.getValue()
            r9 = r1
            X.BgC r9 = (X.C26083BgC) r9
            if (r9 == 0) goto La2
            java.lang.Object r13 = r5.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r16 = 16351231(0xf97fff, float:2.2912955E-38)
            r10 = r8
            r11 = r8
            r12 = r8
            r15 = r8
            X.BgC r0 = X.C26083BgC.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L9b:
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L81
            return
        La2:
            r0 = r8
            goto L9b
        La4:
            r14 = r8
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25879Bce.A0E(java.lang.String):void");
    }

    public final void A0G(String str) {
        Object value = this.A0O.getValue();
        if (value != null) {
            C26012Bf0 c26012Bf0 = (C26012Bf0) value;
            String str2 = c26012Bf0.A01.A00;
            C14360o3.A0B(str2, 0);
            C50679MYx c50679MYx = new C50679MYx(str2, str, 5);
            C05A c05a = this.A07;
            boolean A04 = A04(c50679MYx, this);
            int i = c26012Bf0.A00;
            C50679MYx c50679MYx2 = c26012Bf0.A02;
            boolean z = c26012Bf0.A08;
            boolean z2 = c26012Bf0.A05;
            boolean z3 = c26012Bf0.A07;
            boolean z4 = c26012Bf0.A06;
            boolean z5 = c26012Bf0.A03;
            boolean z6 = c26012Bf0.A09;
            C14360o3.A0B(c50679MYx2, 1);
            c05a.Egh(new C26012Bf0(c50679MYx2, c50679MYx, i, A04, z, z2, z3, z4, z5, z6));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0H(String str, int i) {
        Iterator A1J = AbstractC25226BEj.A1J(this.A00.A0z.getValue());
        while (A1J.hasNext()) {
            C45126Jxv c45126Jxv = (C45126Jxv) A1J.next();
            String str2 = c45126Jxv.A02;
            if (C14360o3.A0K(str2, str)) {
                QJ0 qj0 = (QJ0) AbstractC167007dF.A0e((List) c45126Jxv.A00, i);
                C05A c05a = this.A0X;
                String str3 = qj0.A03;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = qj0.A01;
                if (str5 != null) {
                    str4 = str5;
                }
                String str6 = qj0.A04;
                ImageUrl imageUrl = (ImageUrl) qj0.A00;
                String str7 = c45126Jxv.A03;
                c05a.Egh(new C26070Bfy(imageUrl, str3, str4, str6, str7, str2, qj0.A02));
                this.A0B.Egh(str7);
                return;
            }
        }
    }

    public final void A0I(boolean z) {
        Object value;
        C26083BgC c26083BgC;
        C05A c05a = this.A00.A0C;
        do {
            value = c05a.getValue();
            C26083BgC c26083BgC2 = (C26083BgC) value;
            if (c26083BgC2 != null) {
                c26083BgC = C26083BgC.A00(null, null, c26083BgC2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16646143, false, z);
            } else {
                c26083BgC = null;
            }
        } while (!c05a.AIi(value, c26083BgC));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.2JM] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.graphql.calls.GraphQlCallInput, X.Be9] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    public final void A0J(boolean z, String str) {
        ?? r4;
        boolean z2;
        String str2;
        C27271C1v c27271C1v = this.A00;
        String str3 = this.A02;
        C26083BgC A0a = AbstractC25235BEs.A0a(c27271C1v.A0b);
        if (A0a != null) {
            ?? graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A09(A0a.A07, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            graphQlCallInput.A09((String) c27271C1v.A0a.getValue(), DevServerEntity.COLUMN_DESCRIPTION);
            graphQlCallInput.A09(A0a.A0A, "tagline");
            graphQlCallInput.A09(A0a.A06, "image_prompt");
            graphQlCallInput.A05("capabilities", C27271C1v.A03(A0a.A0E));
            graphQlCallInput.A09(A0a.A0C, "welcome_message");
            List list = A0a.A0G;
            if (list != null) {
                r4 = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC25236BEt.A0w(r4, it);
                }
            } else {
                r4 = C16930sl.A00;
            }
            graphQlCallInput.A05("example_dialogue", r4);
            graphQlCallInput.A05("facts", A0a.A0J);
            List list2 = A0a.A0H;
            graphQlCallInput.A09(AbstractC25226BEj.A1I(list2, 0), "icebreaker_prompt_1");
            graphQlCallInput.A09(AbstractC25226BEj.A1I(list2, 1), "icebreaker_prompt_2");
            graphQlCallInput.A09(AbstractC25226BEj.A1I(list2, 2), "icebreaker_prompt_3");
            graphQlCallInput.A08("update_facts", true);
            graphQlCallInput.A08("update_capabilities", true);
            String str4 = A0a.A0B;
            if (str4 != null) {
                graphQlCallInput.A09(str4, "new_persona_version_image_id");
            }
            UserSession userSession = c27271C1v.A03;
            String A00 = CXN.A00(A0a.A01, userSession);
            if (A00 != null) {
                graphQlCallInput.A09(A00, "thread_theme_id");
            }
            ?? graphQlCallInput2 = new GraphQlCallInput();
            graphQlCallInput2.A06(graphQlCallInput, "attributes");
            graphQlCallInput2.A07(A0a.A05, "persona_id");
            graphQlCallInput2.A07(A0a.A08, "persona_version_id");
            C0UO c0uo = c27271C1v.A0c;
            Map map = (Map) c0uo.getValue();
            String str5 = A0a.A09;
            if (map.get(str5) != C83.ONLY_ME) {
                z2 = A0a.A0M;
            } else {
                z2 = false;
            }
            C0CA.A00(graphQlCallInput2.A02(), Boolean.valueOf(z2), "show_in_ig_profile_banner");
            graphQlCallInput2.A05("discoverable_apps", C27271C1v.A02(c27271C1v, A0a));
            C83 c83 = (C83) AbstractC25231BEo.A0o(str5, c0uo);
            if (c83 != null) {
                str2 = c83.name();
            } else {
                str2 = null;
            }
            graphQlCallInput2.A07(str2, "audience");
            graphQlCallInput2.A07(AbstractC166997dE.A0n(), "client_mutation_id");
            graphQlCallInput2.A07(str3, AbstractC65711Tsk.A00());
            if (z && str != null) {
                graphQlCallInput2.A07(str, "template_option_id");
            }
            ?? A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A00(graphQlCallInput2, "input");
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "KirbyCompleteQuickCreationV2Mutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59931QrF.class, true, null, 96, null, "xfb_kirby_mobile_complete_quick_create_genai_persona_v2", AbstractC166987dD.A1E());
            pandoGraphQLRequest.setNetworkTimeoutSeconds(30);
            boolean A06 = C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36324011599146812L);
            C19L c19l = ((C4A7) c27271C1v).A01;
            if (A06) {
                AbstractC166987dD.A1Z(new JTH(A0a, c27271C1v, pandoGraphQLRequest, null, 12), c19l);
            } else {
                AbstractC166987dD.A1Z(new JTH(A0a, c27271C1v, pandoGraphQLRequest, null, 13), c19l);
            }
        }
    }

    public final boolean A0K() {
        String str;
        C27271C1v c27271C1v = this.A00;
        C26035BfO c26035BfO = (C26035BfO) c27271C1v.A0x.getValue();
        if (c26035BfO == null) {
            return false;
        }
        InterfaceC30795DgW interfaceC30795DgW = c26035BfO.A01;
        String str2 = c26035BfO.A02;
        C26083BgC A0a = AbstractC25235BEs.A0a(c27271C1v.A0b);
        ImageUrl imageUrl = null;
        if (A0a != null) {
            str = A0a.A06;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str)) {
            if (!(interfaceC30795DgW instanceof C26115Bgz)) {
                return false;
            }
            ImageUrl imageUrl2 = ((C26115Bgz) interfaceC30795DgW).A00;
            C26083BgC A0s = AbstractC25226BEj.A0s(c27271C1v.A0C);
            if (A0s != null) {
                imageUrl = A0s.A02;
            }
            if (C14360o3.A0K(imageUrl2, imageUrl)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0L() {
        String str;
        C27271C1v c27271C1v = this.A00;
        Object value = c27271C1v.A0a.getValue();
        C26083BgC A0a = AbstractC25235BEs.A0a(c27271C1v.A0d);
        if (A0a != null) {
            str = A0a.A04;
        } else {
            str = null;
        }
        return AbstractC25225BEi.A1a(value, str);
    }

    public final boolean A0M() {
        String str;
        C27271C1v c27271C1v = this.A00;
        C26083BgC A0a = AbstractC25235BEs.A0a(c27271C1v.A0b);
        String str2 = null;
        if (A0a != null) {
            str = A0a.A07;
        } else {
            str = null;
        }
        C26083BgC A0a2 = AbstractC25235BEs.A0a(c27271C1v.A0d);
        if (A0a2 != null) {
            str2 = A0a2.A07;
        }
        return AbstractC25225BEi.A1a(str, str2);
    }

    public final boolean A0N() {
        String str;
        C27271C1v c27271C1v = this.A00;
        C26083BgC A0a = AbstractC25235BEs.A0a(c27271C1v.A0b);
        String str2 = null;
        if (A0a != null) {
            str = A0a.A0A;
        } else {
            str = null;
        }
        C26083BgC A0a2 = AbstractC25235BEs.A0a(c27271C1v.A0d);
        if (A0a2 != null) {
            str2 = A0a2.A0A;
        }
        return AbstractC25225BEi.A1a(str, str2);
    }

    public static C26049Bfc A00(InterfaceC09390do interfaceC09390do) {
        return (C26049Bfc) ((C25879Bce) interfaceC09390do.getValue()).A0J.getValue();
    }

    public static UtmMetadata A01(InterfaceC09390do interfaceC09390do) {
        return (UtmMetadata) ((C25879Bce) interfaceC09390do.getValue()).A0W.getValue();
    }

    public static String A02(InterfaceC09390do interfaceC09390do) {
        return ((C25879Bce) interfaceC09390do.getValue()).A02;
    }

    public static String A03(InterfaceC09390do interfaceC09390do) {
        return (String) ((C25879Bce) interfaceC09390do.getValue()).A0S.getValue();
    }
}
