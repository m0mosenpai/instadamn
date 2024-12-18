package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.aistudio.editor.AiSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Bcd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25878Bcd extends AbstractC52922bZ {
    public final AiSettingsRepository A00;
    public final UserSession A01;
    public final C05A A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C0UO A0C;
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
    public final NSM A0N;
    public final C05A A0O;
    public final C0UO A0P;
    public final C0UO A0Q;

    public C25878Bcd(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        AiSettingsRepository aiSettingsRepository = new AiSettingsRepository(userSession, AbstractC40691uc.A01(userSession));
        this.A00 = aiSettingsRepository;
        this.A0B = aiSettingsRepository.A0X;
        this.A0L = aiSettingsRepository.A0n;
        this.A0M = aiSettingsRepository.A0q;
        this.A0N = (NSM) userSession.A01(NSM.class, new C50157MDk(userSession, 20));
        this.A0I = aiSettingsRepository.A0f;
        C008002u A00 = C10E.A00(null);
        this.A07 = A00;
        this.A0J = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(null);
        this.A02 = A002;
        this.A08 = AbstractC208910l.A02(A002);
        C141796aw A003 = AbstractC141776au.A00(this);
        MCD mcd = new MCD(this, null, 11);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new MCD(this, null, 10), AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0X(this, anonymousClass191, AbstractC25235BEs.A0W(this, anonymousClass191, mcd, A003), 12), 13), 14), 15), 16), 17), 18), 19), 9));
        C008002u A004 = C10E.A00(null);
        this.A0O = A004;
        this.A0Q = AbstractC208910l.A02(A004);
        C008002u A005 = C10E.A00(null);
        this.A06 = A005;
        C0UO c0uo = aiSettingsRepository.A0o;
        this.A0G = AbstractC208910l.A01(null, AbstractC141776au.A00(this), C10Q.A00(new D5C(this, null, 1), A005, c0uo, aiSettingsRepository.A0h), new C15020pI(0L));
        C008002u A006 = C10E.A00(null);
        this.A05 = A006;
        this.A0F = AbstractC208910l.A01(null, AbstractC141776au.A00(this), C10Q.A00(new D5C(this, null, 0), A006, c0uo, aiSettingsRepository.A0g), new C15020pI(0L));
        C008002u A007 = C10E.A00(null);
        this.A04 = A007;
        this.A0D = AbstractC208910l.A02(A007);
        C008002u A008 = C10E.A00(null);
        this.A03 = A008;
        this.A0C = AbstractC208910l.A02(A008);
        C0UO c0uo2 = aiSettingsRepository.A0W;
        C15180pY A02 = C10Q.A02(new D5N(this, null, 0), c0uo2, c0uo, aiSettingsRepository.A0p, aiSettingsRepository.A0e, aiSettingsRepository.A0Y);
        C141796aw A009 = AbstractC141776au.A00(this);
        C15020pI c15020pI = new C15020pI(0L);
        C16930sl c16930sl = C16930sl.A00;
        this.A0K = AbstractC208910l.A01(new C26050Bfd(new C45127Jxw(null, null, null, 3, 6), null, null, null, null, "", "", "", "", "", "", "", c16930sl, c16930sl, c16930sl, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false), A009, A02, c15020pI);
        MWG mwg = new MWG(5, this, c0uo2);
        this.A0E = AbstractC208910l.A01(new C51756Mtf((List) null, (DefaultConstructorMarker) null, 1, 14), AbstractC141776au.A00(this), mwg, new C15020pI(0L));
        MWG mwg2 = new MWG(6, this, c0uo2);
        this.A0P = AbstractC208910l.A01(new MUG(1), AbstractC141776au.A00(this), mwg2, new C15020pI(0L));
        MWG mwg3 = new MWG(7, this, c0uo2);
        this.A0A = AbstractC208910l.A01(new MUG((List) null, (List) null, (DefaultConstructorMarker) null, 7, 2, false), AbstractC141776au.A00(this), mwg3, new C15020pI(0L));
        C15230pd A0010 = C10Q.A00(new D5F(1, (InterfaceC23621Ds) null), c0uo2, aiSettingsRepository.A0j, aiSettingsRepository.A0s);
        this.A0H = AbstractC208910l.A01(new C26035BfO(C29086CsD.A00, "", null, R.drawable.instagram_arrow_cw_pano_outline_24, true), AbstractC141776au.A00(this), A0010, new C15020pI(0L));
        MWG mwg4 = new MWG(8, this, c0uo2);
        this.A09 = AbstractC208910l.A01(new C51757Mtg(), AbstractC141776au.A00(this), mwg4, new C15020pI(0L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r4 <= X.AbstractC25225BEi.A07(X.AbstractC166997dE.A0U(r3), r3, 36605486573425935L)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(int r17, java.lang.String r18) {
        /*
            r16 = this;
            r11 = 1
            r1 = r16
            X.05A r5 = r1.A06
            r7 = r18
            boolean r0 = X.AbstractC001900j.A0T(r7)
            r10 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L35
            int r4 = r7.length()
            com.instagram.common.session.UserSession r3 = r1.A01
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36605486573425935(0x820c7f000a150f, double:3.212795335273413E-306)
            int r0 = X.AbstractC25225BEi.A07(r2, r3, r0)
            if (r4 > r0) goto L35
        L25:
            r12 = 0
            X.Bew r6 = new X.Bew
            r9 = r17
            r8 = r7
            r13 = r12
            r14 = r12
            r15 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r5.Egh(r6)
            return
        L35:
            r10 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25878Bcd.A09(int, java.lang.String):void");
    }

    public final void A0B(C50679MYx c50679MYx, int i, boolean z, boolean z2) {
        C05A c05a = this.A05;
        boolean A04 = A04(c50679MYx, this);
        boolean z3 = false;
        if (i != -1) {
            z3 = true;
        }
        c05a.Egh(new C26012Bf0(c50679MYx, c50679MYx, i, A04, z3, z, false, z2, true, false));
    }

    public final void A0E(String str) {
        C26072Bg1 c26072Bg1;
        boolean z;
        String str2;
        C05A c05a = this.A02;
        C26072Bg1 c26072Bg12 = (C26072Bg1) c05a.getValue();
        if (c26072Bg12 != null) {
            C26083BgC A00 = AiSettingsRepository.A00(this.A00);
            UserSession userSession = this.A01;
            int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573360398L);
            if (!AbstractC001900j.A0T(str) && str.length() <= A07) {
                if (A00 != null) {
                    str2 = A00.A0C;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.2JO] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.Be9] */
    public final void A0G(InterfaceC16660sJ interfaceC16660sJ) {
        C26083BgC A00;
        ?? A0q;
        String str;
        List list;
        List A0a;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C26050Bfd c26050Bfd = (C26050Bfd) this.A0K.getValue();
        AiSettingsRepository aiSettingsRepository = this.A00;
        String str8 = c26050Bfd.A08;
        String str9 = c26050Bfd.A0A;
        String str10 = c26050Bfd.A0B;
        String str11 = c26050Bfd.A09;
        boolean z = c26050Bfd.A0N;
        List list2 = c26050Bfd.A0D;
        C14360o3.A0B(str8, 0);
        AbstractC25233BEq.A0v(1, str9, str10, str11);
        C14360o3.A0B(list2, 5);
        Object value = aiSettingsRepository.A0W.getValue();
        if (value != null) {
            C26083BgC c26083BgC = (C26083BgC) value;
            A00 = C26083BgC.A00(null, null, c26083BgC, null, null, str8, null, null, null, str9, str10, null, null, null, null, null, null, list2, 14679291, false, false);
            C0UO c0uo = aiSettingsRepository.A0X;
            if (AbstractC25231BEo.A0o(str11, c0uo) != C83.PUBLIC && AbstractC25231BEo.A0o(str11, c0uo) != C83.PUBLIC_FOR_IG_PRIVATE_ACCOUNTS) {
                A0q = C16930sl.A00;
            } else {
                List list3 = c26083BgC.A0F;
                if (list3 == null) {
                    list3 = C16930sl.A00;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list3) {
                    if (((C51741MtQ) obj).A04) {
                        A1E.add(obj);
                    }
                }
                A0q = AbstractC167017dG.A0q(A1E);
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    A0q.add(((C51741MtQ) it.next()).A01.toString());
                }
            }
            ?? graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A07(c26083BgC.A05, "persona_id");
            graphQlCallInput.A07(c26083BgC.A08, "persona_version_id");
            C83 c83 = (C83) AbstractC25231BEo.A0o(str11, c0uo);
            if (c83 != null) {
                str = c83.name();
            } else {
                str = null;
            }
            graphQlCallInput.A07(str, "audience");
            C0CA.A00(graphQlCallInput.A02(), Boolean.valueOf(z), "show_in_ig_profile_banner");
            graphQlCallInput.A05("discoverable_apps", A0q);
            C26083BgC A0s = AbstractC25226BEj.A0s(aiSettingsRepository.A0G);
            ArrayList arrayList = null;
            if (A0s != null) {
                list = A0s.A0E;
            } else {
                list = null;
            }
            List<MUW> list4 = A00.A0E;
            if (C14360o3.A0K(list4, list)) {
                A0a = C16930sl.A00;
            } else {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                if (list4 == null) {
                    list4 = C16930sl.A00;
                }
                for (MUW muw : list4) {
                    ?? graphQlCallInput2 = new GraphQlCallInput();
                    graphQlCallInput2.A09(String.valueOf(muw.A01), "plugin_type");
                    graphQlCallInput2.A05("plugin_overrides", null);
                    graphQlCallInput2.A05("enabled_apps", AbstractC166987dD.A1J("INSTAGRAM"));
                    graphQlCallInput2.A08("is_enabled", (Boolean) muw.A00);
                    A1E2.add(graphQlCallInput2);
                }
                A0a = AbstractC001800i.A0a(A1E2);
            }
            ?? graphQlCallInput3 = new GraphQlCallInput();
            graphQlCallInput3.A09(A00.A07, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            graphQlCallInput3.A09(A00.A04, DevServerEntity.COLUMN_DESCRIPTION);
            graphQlCallInput3.A09(A00.A06, "image_prompt");
            graphQlCallInput3.A09(A00.A0A, "tagline");
            graphQlCallInput3.A09(A00.A0C, "welcome_message");
            List list5 = A00.A0H;
            graphQlCallInput3.A09(AbstractC25226BEj.A1I(list5, 0), "icebreaker_prompt_1");
            graphQlCallInput3.A09(AbstractC25226BEj.A1I(list5, 1), "icebreaker_prompt_2");
            graphQlCallInput3.A09(AbstractC25226BEj.A1I(list5, 2), "icebreaker_prompt_3");
            List list6 = A00.A0I;
            C50679MYx c50679MYx = (C50679MYx) AbstractC001800i.A0O(list6, 0);
            if (c50679MYx != null) {
                str2 = c50679MYx.A00;
            } else {
                str2 = null;
            }
            graphQlCallInput3.A09(str2, AbstractC58317Pt9.A00(270));
            C50679MYx c50679MYx2 = (C50679MYx) AbstractC001800i.A0O(list6, 0);
            if (c50679MYx2 != null) {
                str3 = c50679MYx2.A01;
            } else {
                str3 = null;
            }
            graphQlCallInput3.A09(str3, AbstractC58317Pt9.A00(267));
            C50679MYx c50679MYx3 = (C50679MYx) AbstractC001800i.A0O(list6, 1);
            if (c50679MYx3 != null) {
                str4 = c50679MYx3.A00;
            } else {
                str4 = null;
            }
            graphQlCallInput3.A09(str4, AbstractC58317Pt9.A00(271));
            C50679MYx c50679MYx4 = (C50679MYx) AbstractC001800i.A0O(list6, 1);
            if (c50679MYx4 != null) {
                str5 = c50679MYx4.A01;
            } else {
                str5 = null;
            }
            graphQlCallInput3.A09(str5, AbstractC58317Pt9.A00(268));
            C50679MYx c50679MYx5 = (C50679MYx) AbstractC001800i.A0O(list6, 2);
            if (c50679MYx5 != null) {
                str6 = c50679MYx5.A00;
            } else {
                str6 = null;
            }
            graphQlCallInput3.A09(str6, AbstractC58317Pt9.A00(272));
            C50679MYx c50679MYx6 = (C50679MYx) AbstractC001800i.A0O(list6, 2);
            if (c50679MYx6 != null) {
                str7 = c50679MYx6.A01;
            } else {
                str7 = null;
            }
            graphQlCallInput3.A09(str7, AbstractC58317Pt9.A00(269));
            graphQlCallInput3.A08("update_facts", true);
            graphQlCallInput3.A05("capabilities", A0a);
            graphQlCallInput3.A08("update_capabilities", Boolean.valueOf(AbstractC166987dD.A1b(A0a)));
            List list7 = A00.A0G;
            if (list7 != null) {
                arrayList = AbstractC167017dG.A0q(list7);
                Iterator it2 = list7.iterator();
                while (it2.hasNext()) {
                    AbstractC25236BEt.A0w(arrayList, it2);
                }
            }
            graphQlCallInput3.A05("example_dialogue", arrayList);
            graphQlCallInput3.A05("facts", A00.A0J);
            String str12 = A00.A0B;
            if (str12 != null) {
                graphQlCallInput3.A09(str12, "new_persona_version_image_id");
            }
            String A002 = CXN.A00(A00.A01, aiSettingsRepository.A02);
            if (A002 != null) {
                graphQlCallInput3.A09(A002, "thread_theme_id");
            }
            graphQlCallInput.A06(graphQlCallInput3, "attributes");
            graphQlCallInput.A07(AbstractC166997dE.A0o(), "client_mutation_id");
            aiSettingsRepository.A0R.Egh(true);
            AbstractC166987dD.A1Z(new D54((Object) graphQlCallInput, aiSettingsRepository, c26083BgC, list2, interfaceC16660sJ, str11, (InterfaceC23621Ds) null, 0), ((C4A7) aiSettingsRepository).A01);
            NSM nsm = this.A0N;
            nsm.A01.A03(new C1566571n(nsm.A00.userId));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A04(C50679MYx c50679MYx, C25878Bcd c25878Bcd) {
        String str = c50679MYx.A00;
        if (!AbstractC001900j.A0T(str)) {
            int length = str.length();
            UserSession userSession = c25878Bcd.A01;
            if (length <= AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573557009L)) {
                String str2 = c50679MYx.A01;
                if (AbstractC25225BEi.A1Y(str2) && str2.length() <= AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573491472L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void A05() {
        this.A05.Egh(new C26012Bf0(new C50679MYx("", "", 5), new C50679MYx("", "", 5), -1, false, false, false, false, false, true, false));
    }

    public final void A06() {
        AiSettingsRepository aiSettingsRepository = this.A00;
        AbstractC166997dE.A1Y(aiSettingsRepository.A0L, false);
        List list = aiSettingsRepository.A04;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25236BEt.A0x(it);
        }
        list.clear();
        AbstractC25226BEj.A0r(aiSettingsRepository.A07).A06(C05F.A0C);
    }

    public final void A07() {
        AiSettingsRepository aiSettingsRepository = this.A00;
        C05A c05a = aiSettingsRepository.A0Q;
        Boolean A0a = AbstractC166997dE.A0a();
        c05a.Egh(A0a);
        aiSettingsRepository.A0T.Egh(A0a);
        List list = aiSettingsRepository.A05;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25236BEt.A0x(it);
        }
        list.clear();
        AbstractC25226BEj.A0r(aiSettingsRepository.A07).A06(C05F.A0C);
    }

    public final void A08() {
        AiSettingsRepository aiSettingsRepository = this.A00;
        C05A c05a = aiSettingsRepository.A0U;
        Boolean A0a = AbstractC166997dE.A0a();
        c05a.Egh(A0a);
        aiSettingsRepository.A0N.Egh(A0a);
        aiSettingsRepository.A0O.Egh(A0a);
        aiSettingsRepository.A0P.Egh(A0a);
        List list = aiSettingsRepository.A06;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25236BEt.A0x(it);
        }
        list.clear();
        AbstractC25226BEj.A0r(aiSettingsRepository.A07).A06(C05F.A0C);
    }

    public final void A0A(int i, String str) {
        List list;
        C26072Bg1 c26072Bg1;
        Object obj;
        boolean A1a;
        List list2;
        C05A c05a = this.A02;
        C26072Bg1 c26072Bg12 = (C26072Bg1) c05a.getValue();
        if (c26072Bg12 != null && (list = c26072Bg12.A03) != null) {
            ArrayList A1F = AbstractC166987dD.A1F(list);
            A1F.set(i, str);
            C26072Bg1 c26072Bg13 = (C26072Bg1) c05a.getValue();
            if (c26072Bg13 != null) {
                C26083BgC A00 = AiSettingsRepository.A00(this.A00);
                UserSession userSession = this.A01;
                if (str.length() > AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573622546L)) {
                    A1a = false;
                } else {
                    if (A00 != null && (list2 = A00.A0H) != null) {
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

    public final void A0C(Integer num, String str, String str2, String str3) {
        List list;
        AiSettingsRepository aiSettingsRepository = this.A00;
        AbstractC25226BEj.A0r(aiSettingsRepository.A07).A06.markerStart(673065652);
        C23671Dx A1L = AbstractC25226BEj.A1L(new D50(aiSettingsRepository, num, str, str2, str3, null, 1), ((C4A7) aiSettingsRepository).A01);
        if (!str.equals("welcome_message") && !str.equals("icebreaker_prompt_1") && !str.equals("icebreaker_prompt_2") && !str.equals("icebreaker_prompt_3")) {
            if (str.equals("example_dialogue")) {
                list = aiSettingsRepository.A04;
            } else {
                list = aiSettingsRepository.A05;
            }
        } else {
            list = aiSettingsRepository.A06;
        }
        list.add(A1L);
    }

    public final void A0D(String str) {
        C26083BgC c26083BgC;
        C05A c05a = this.A00.A08;
        C26083BgC c26083BgC2 = (C26083BgC) c05a.getValue();
        if (c26083BgC2 != null) {
            c26083BgC = C26083BgC.A00(null, null, c26083BgC2, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, false, false);
        } else {
            C16930sl c16930sl = C16930sl.A00;
            c26083BgC = new C26083BgC(null, null, null, C84.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, str, "", "", "", "", null, "", "", "", null, c16930sl, c16930sl, c16930sl, null, null, c16930sl, null, false, false, false);
        }
        c05a.Egh(c26083BgC);
    }

    public final void A0F(String str) {
        Object value = this.A0F.getValue();
        if (value != null) {
            C26012Bf0 c26012Bf0 = (C26012Bf0) value;
            String str2 = c26012Bf0.A01.A00;
            C14360o3.A0B(str2, 0);
            C50679MYx c50679MYx = new C50679MYx(str2, str, 5);
            C05A c05a = this.A05;
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

    public final void A0H(boolean z, boolean z2) {
        this.A06.Egh(new C26008Bew("", "", -1, false, false, z, false, z2, true));
    }

    public final boolean A0I() {
        C26012Bf0 c26012Bf0 = (C26012Bf0) this.A0F.getValue();
        if (c26012Bf0 == null) {
            return false;
        }
        C50679MYx c50679MYx = c26012Bf0.A01;
        String A1A = AbstractC25228BEl.A1A(c50679MYx.A00);
        String A1A2 = AbstractC25228BEl.A1A(c50679MYx.A01);
        C50679MYx c50679MYx2 = c26012Bf0.A02;
        if (C14360o3.A0K(A1A, c50679MYx2.A00) && C14360o3.A0K(A1A2, c50679MYx2.A01)) {
            return false;
        }
        return true;
    }

    public final boolean A0J() {
        Object obj;
        List list;
        AiSettingsRepository aiSettingsRepository = this.A00;
        JWd jWd = (JWd) this.A04.getValue();
        if (jWd == null || (obj = jWd.A00) == null) {
            obj = C16930sl.A00;
        }
        C26083BgC A0s = AbstractC25226BEj.A0s(aiSettingsRepository.A08);
        if (A0s != null) {
            list = A0s.A0H;
        } else {
            list = null;
        }
        return AbstractC25225BEi.A1a(list, obj);
    }

    public final boolean A0K() {
        String str;
        String str2;
        AiSettingsRepository aiSettingsRepository = this.A00;
        JWd jWd = (JWd) this.A04.getValue();
        if (jWd == null || (str = jWd.A01) == null) {
            str = "";
        }
        C26083BgC A0s = AbstractC25226BEj.A0s(aiSettingsRepository.A08);
        if (A0s != null) {
            str2 = A0s.A0C;
        } else {
            str2 = null;
        }
        return AbstractC25225BEi.A1a(str2, str);
    }

    public static C26008Bew A00(InterfaceC09390do interfaceC09390do) {
        return (C26008Bew) ((C25878Bcd) interfaceC09390do.getValue()).A0G.getValue();
    }

    public static String A01(C26826Bso c26826Bso) {
        return (String) C26826Bso.A00(c26826Bso).A0J.getValue();
    }

    public static String A02(InterfaceC09390do interfaceC09390do) {
        return (String) ((C25878Bcd) interfaceC09390do.getValue()).A0J.getValue();
    }

    public static void A03(C26826Bso c26826Bso) {
        C1Df c1Df = C26826Bso.A00(c26826Bso).A00.A00;
        if (c1Df != null) {
            c1Df.cancel();
        }
    }
}
