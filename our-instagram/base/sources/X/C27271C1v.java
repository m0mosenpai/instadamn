package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.aistudio.editor.AiCreationRepositoryV2$quickCreateAi$2;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.C1v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27271C1v extends C4A7 {
    public C1Df A00;
    public C49497LuA A01;
    public AnonymousClass195 A02;
    public final UserSession A03;
    public final C40701ud A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C05A A0S;
    public final C05A A0T;
    public final C05A A0U;
    public final C05A A0V;
    public final C05A A0W;
    public final C05A A0X;
    public final C05A A0Y;
    public final C0UO A0Z;
    public final C0UO A0a;
    public final C0UO A0b;
    public final C0UO A0c;
    public final C0UO A0d;
    public final C0UO A0e;
    public final C0UO A0f;
    public final C0UO A0g;
    public final C0UO A0h;
    public final C0UO A0i;
    public final C0UO A0j;
    public final C0UO A0k;
    public final C0UO A0l;
    public final C0UO A0m;
    public final C0UO A0n;
    public final C0UO A0o;
    public final C0UO A0p;
    public final C0UO A0q;
    public final C0UO A0r;
    public final C0UO A0s;
    public final C0UO A0t;
    public final C0UO A0u;
    public final C0UO A0v;
    public final C0UO A0w;
    public final C0UO A0x;
    public final C0UO A0y;
    public final C0UO A0z;

    public static final String A01(C27271C1v c27271C1v, C59958Qrg c59958Qrg) {
        Enum r3;
        if (c59958Qrg != null) {
            r3 = c59958Qrg.getOptionalEnumField(0, AbstractC43591JPw.A00(149), C83.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        } else {
            r3 = null;
        }
        Iterator A15 = AbstractC166997dE.A15((Map) c27271C1v.A0c.getValue());
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String str = (String) A1K.getKey();
            if (r3 == A1K.getValue()) {
                return str;
            }
        }
        return null;
    }

    public final void A07(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C1Df c1Df;
        AbstractC166997dE.A1Y(this.A0U, false);
        InterfaceC30792DgT interfaceC30792DgT = (InterfaceC30792DgT) this.A0v.getValue();
        InterfaceC09390do interfaceC09390do = this.A09;
        AbstractC25226BEj.A0r(interfaceC09390do).A06.markerStart(673067423);
        AbstractC25226BEj.A0r(interfaceC09390do).A0A("quick_create_request_sent");
        if ((interfaceC30792DgT instanceof C29082Cs9) && (c1Df = ((C29082Cs9) interfaceC30792DgT).A00) != null) {
            c1Df.cancel();
        }
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, DevServerEntity.COLUMN_DESCRIPTION);
        C0CA.A00(A0T, AbstractC166997dE.A0n(), "client_mutation_id");
        C0CA.A00(A0T, str3, AbstractC65711Tsk.A00());
        C0CA.A00(A0T, Boolean.valueOf(z), "lightweight");
        if (str2 != null) {
            C0CA.A00(A0T, str2, "template_option_id");
        }
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "KirbyQuickCreateAiMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59935QrJ.class, true, null, 96, null, "xfb_kirby_mobile_quick_create_genai_persona", AbstractC166987dD.A1E());
        pandoGraphQLRequest.setNetworkTimeoutSeconds(30);
        this.A0C.Egh(null);
        DRW drw = new DRW(this, 30);
        if (C18U.A06(C06090Tz.A05, this.A03, 36330101859828410L)) {
            AbstractC166987dD.A1Z(new AiCreationRepositoryV2$quickCreateAi$2(pandoGraphQLRequest, this, imageUrl, str, str4, str5, str6, null, drw, z), super.A01);
        } else {
            this.A0V.Egh(new C29082Cs9(this.A04.A01(new C28909CpI(0, drw), new C28915CpP(this, imageUrl, str4, str5, str6, drw, z), pandoGraphQLRequest), str));
        }
    }

    public final void A08(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A02);
        Object value = this.A0b.getValue();
        if (value != null) {
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, ((C26083BgC) value).A05, "persona_id");
            C0CA.A00(A0T, str, "image_prompt");
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            AbstractC25231BEo.A18(A0T, A0b);
            PandoGraphQLRequest A00 = AbstractC28918CpS.A00(A0b, A0b2);
            A00.setNetworkTimeoutSeconds(30);
            AbstractC166997dE.A1Y(this.A0M, true);
            this.A02 = AbstractC25226BEj.A1L(new MC9(this, A00, str, A0s, 1), super.A01);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final C7F6 A00(C27271C1v c27271C1v) {
        return AbstractC25226BEj.A0r(c27271C1v.A09);
    }

    public static final List A02(C27271C1v c27271C1v, C26083BgC c26083BgC) {
        C26083BgC A0s;
        List list;
        if (((Map) c27271C1v.A0c.getValue()).get(c26083BgC.A09) == C83.PUBLIC && (A0s = AbstractC25226BEj.A0s(c27271C1v.A0C)) != null && (list = A0s.A0F) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((C51741MtQ) obj).A04) {
                    A1E.add(obj);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                A0q.add(((C51741MtQ) it.next()).A01.toString());
            }
            return A0q;
        }
        return C16930sl.A00;
    }

    public static final void A04(C27271C1v c27271C1v) {
        String str;
        AbstractC25226BEj.A0r(c27271C1v.A09).A0A("quick_create_image_gen_subscription_started");
        c27271C1v.A06();
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        C26083BgC A0s = AbstractC25226BEj.A0s(c27271C1v.A0C);
        if (A0s == null || (str = A0s.A08) == null) {
            str = "";
        }
        A0b.A04("persona_version_Id", str);
        c27271C1v.A00 = AbstractC40691uc.A01(c27271C1v.A03).A01(new C28909CpI(c27271C1v, 1), new C28911CpL(c27271C1v, 0), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "KirbyAiCreationImageGenerationSubscription", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59927QrB.class, false, PandoRealtimeInfoJNI.forSubscription("xfb_genai_persona_initial_creation_image_subscribe"), 0, null, "xfb_genai_persona_initial_creation_image_subscribe", AbstractC166987dD.A1E()));
        AbstractC25231BEo.A1I(c27271C1v, ((C4A7) c27271C1v).A01, 43);
    }

    public final void A06() {
        C1Df c1Df = this.A00;
        if (c1Df != null) {
            c1Df.cancel();
        }
        this.A00 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27271C1v(UserSession userSession) {
        super(AbstractC43591JPw.A00(236), C4A8.A00(1464279681));
        Boolean A0a = AbstractC166997dE.A0a();
        this.A03 = userSession;
        this.A04 = AbstractC40691uc.A01(userSession);
        C008002u A00 = C10E.A00(C16930sl.A00);
        this.A0T = A00;
        this.A0t = AbstractC208910l.A02(A00);
        this.A0z = CO2.A02;
        this.A0y = CO2.A01;
        this.A0k = CO2.A00;
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A0B = A1H;
        this.A0a = AbstractC208910l.A02(A1H);
        C008002u A002 = C10E.A00(C29083CsA.A00);
        this.A0V = A002;
        this.A0v = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(null);
        this.A0C = A003;
        this.A0b = AbstractC208910l.A02(A003);
        this.A0W = C10E.A00(null);
        C008002u A004 = C10E.A00(null);
        this.A0E = A004;
        this.A0d = AbstractC208910l.A02(A004);
        C008002u A005 = C10E.A00(null);
        this.A0Y = A005;
        this.A0x = AbstractC208910l.A02(A005);
        C008002u A1H2 = AbstractC25225BEi.A1H(A0a);
        this.A0M = A1H2;
        this.A0m = AbstractC208910l.A02(A1H2);
        C008002u A006 = C10E.A00(AbstractC06930Yk.A0E());
        this.A0D = A006;
        this.A0c = AbstractC208910l.A02(A006);
        C008002u A1H3 = AbstractC25225BEi.A1H("");
        this.A0X = A1H3;
        this.A0w = AbstractC208910l.A02(A1H3);
        C008002u A007 = C10E.A00(Integer.valueOf(AbstractC34041F0u.A00(userSession)));
        this.A0K = A007;
        this.A0j = AbstractC208910l.A02(A007);
        C008002u A1H4 = AbstractC25225BEi.A1H(A0a);
        this.A0U = A1H4;
        this.A0u = AbstractC208910l.A02(A1H4);
        C008002u A008 = C10E.A00(null);
        this.A0A = A008;
        this.A0Z = AbstractC208910l.A02(A008);
        C008002u A1H5 = AbstractC25225BEi.A1H(A0a);
        this.A0Q = A1H5;
        this.A0q = AbstractC208910l.A02(A1H5);
        C008002u A1H6 = AbstractC25225BEi.A1H(A0a);
        this.A0R = A1H6;
        this.A0r = AbstractC208910l.A02(A1H6);
        C008002u A1H7 = AbstractC25225BEi.A1H(A0a);
        this.A0S = A1H7;
        this.A0s = AbstractC208910l.A02(A1H7);
        C008002u A009 = C10E.A00(null);
        this.A0J = A009;
        this.A0i = AbstractC208910l.A02(A009);
        C008002u A1H8 = AbstractC25225BEi.A1H(A0a);
        this.A0N = A1H8;
        this.A0n = AbstractC208910l.A02(A1H8);
        C008002u A0010 = C10E.A00(null);
        this.A0G = A0010;
        this.A0f = AbstractC208910l.A02(A0010);
        C008002u A1H9 = AbstractC25225BEi.A1H(A0a);
        this.A0O = A1H9;
        this.A0o = AbstractC208910l.A02(A1H9);
        C008002u A0011 = C10E.A00(null);
        this.A0H = A0011;
        this.A0g = AbstractC208910l.A02(A0011);
        C008002u A1H10 = AbstractC25225BEi.A1H(A0a);
        this.A0P = A1H10;
        this.A0p = AbstractC208910l.A02(A1H10);
        C008002u A0012 = C10E.A00(null);
        this.A0I = A0012;
        this.A0h = AbstractC208910l.A02(A0012);
        C008002u A1H11 = AbstractC25225BEi.A1H(A0a);
        this.A0L = A1H11;
        this.A0l = AbstractC208910l.A02(A1H11);
        C008002u A0013 = C10E.A00(null);
        this.A0F = A0013;
        this.A0e = AbstractC208910l.A02(A0013);
        this.A06 = AbstractC166987dD.A1E();
        this.A07 = AbstractC166987dD.A1E();
        this.A05 = AbstractC166987dD.A1E();
        this.A09 = C29909DGx.A00(this, 18);
        this.A08 = C29909DGx.A00(this, 17);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.2JO] */
    public static final List A03(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list == null) {
            list = C16930sl.A00;
        }
        for (MUW muw : list) {
            ?? graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A09(String.valueOf(muw.A01), "plugin_type");
            graphQlCallInput.A05("plugin_overrides", null);
            graphQlCallInput.A05("enabled_apps", AbstractC166987dD.A1J("INSTAGRAM"));
            graphQlCallInput.A08("is_enabled", (Boolean) muw.A00);
            A1E.add(graphQlCallInput);
        }
        return AbstractC001800i.A0a(A1E);
    }

    public static final void A05(C27271C1v c27271C1v, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0H = "ai_studio_creation_error";
        UserSession userSession = c27271C1v.A03;
        AbstractC25226BEj.A1N(AbstractC25225BEi.A0F(userSession), A0j, i);
        if (z) {
            A0j.A0G = AbstractC166997dE.A0p(AbstractC25225BEi.A0F(userSession), 2131975766);
            A0j.A01();
            A0j.A0A(new C29314Cw9(interfaceC16820sZ, 1));
        }
        AbstractC25233BEq.A1F(A0j);
    }
}
