package com.instagram.aistudio.editor;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC06930Yk;
import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC28918CpS;
import X.AbstractC34041F0u;
import X.AbstractC40691uc;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.AnonymousClass195;
import X.C008002u;
import X.C05A;
import X.C09530e4;
import X.C0CA;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C146106i8;
import X.C16930sl;
import X.C1Df;
import X.C26083BgC;
import X.C28909CpI;
import X.C29907DGv;
import X.C2JM;
import X.C40701ud;
import X.C4A7;
import X.C4A8;
import X.C51741MtQ;
import X.C58510Pwe;
import X.C59825Qon;
import X.C59958Qrg;
import X.C83;
import X.EnumC61203Rh3;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.MC9;
import X.R1H;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AiSettingsRepository extends C4A7 {
    public C1Df A00;
    public AnonymousClass195 A01;
    public final UserSession A02;
    public final C40701ud A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final InterfaceC09390do A07;
    public final C05A A08;
    public final C05A A09;
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
    public final C0UO A0W;
    public final C0UO A0X;
    public final C0UO A0Y;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiSettingsRepository(UserSession userSession, C40701ud c40701ud) {
        super("AiSettingsRepository", C4A8.A00(1968915545));
        C14360o3.A0B(c40701ud, 2);
        this.A02 = userSession;
        this.A03 = c40701ud;
        C008002u A00 = C10E.A00(null);
        this.A08 = A00;
        this.A0W = AbstractC208910l.A02(A00);
        this.A0G = C10E.A00(null);
        C008002u A002 = C10E.A00(AbstractC06930Yk.A0E());
        this.A09 = A002;
        this.A0X = AbstractC208910l.A02(A002);
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A0M = A1H;
        this.A0j = AbstractC208910l.A02(A1H);
        C008002u A003 = C10E.A00(null);
        this.A0V = A003;
        this.A0s = AbstractC208910l.A02(A003);
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A0R = A1H2;
        this.A0o = AbstractC208910l.A02(A1H2);
        C008002u A1H3 = AbstractC25225BEi.A1H(false);
        this.A0S = A1H3;
        this.A0p = AbstractC208910l.A02(A1H3);
        C008002u A1H4 = AbstractC25225BEi.A1H(false);
        this.A0I = A1H4;
        this.A0f = AbstractC208910l.A02(A1H4);
        C008002u A004 = C10E.A00(Integer.valueOf(AbstractC34041F0u.A00(userSession)));
        this.A0H = A004;
        this.A0e = AbstractC208910l.A02(A004);
        C008002u A1H5 = AbstractC25225BEi.A1H(0);
        this.A0K = A1H5;
        this.A0h = AbstractC208910l.A02(A1H5);
        C008002u A1H6 = AbstractC25225BEi.A1H(0);
        this.A0J = A1H6;
        this.A0g = AbstractC208910l.A02(A1H6);
        C008002u A1H7 = AbstractC25225BEi.A1H("");
        this.A0A = A1H7;
        this.A0Y = AbstractC208910l.A02(A1H7);
        C008002u A1H8 = AbstractC25225BEi.A1H(false);
        this.A0Q = A1H8;
        this.A0n = AbstractC208910l.A02(A1H8);
        C008002u A1H9 = AbstractC25225BEi.A1H(false);
        this.A0T = A1H9;
        this.A0q = AbstractC208910l.A02(A1H9);
        C008002u A1H10 = AbstractC25225BEi.A1H(false);
        this.A0U = A1H10;
        this.A0r = AbstractC208910l.A02(A1H10);
        C008002u A005 = C10E.A00(null);
        this.A0F = A005;
        this.A0d = AbstractC208910l.A02(A005);
        C008002u A1H11 = AbstractC25225BEi.A1H(false);
        this.A0N = A1H11;
        this.A0k = AbstractC208910l.A02(A1H11);
        C008002u A006 = C10E.A00(null);
        this.A0C = A006;
        this.A0a = AbstractC208910l.A02(A006);
        C008002u A1H12 = AbstractC25225BEi.A1H(false);
        this.A0O = A1H12;
        this.A0l = AbstractC208910l.A02(A1H12);
        C008002u A007 = C10E.A00(null);
        this.A0D = A007;
        this.A0b = AbstractC208910l.A02(A007);
        C008002u A1H13 = AbstractC25225BEi.A1H(false);
        this.A0P = A1H13;
        this.A0m = AbstractC208910l.A02(A1H13);
        C008002u A008 = C10E.A00(null);
        this.A0E = A008;
        this.A0c = AbstractC208910l.A02(A008);
        C008002u A1H14 = AbstractC25225BEi.A1H(false);
        this.A0L = A1H14;
        this.A0i = AbstractC208910l.A02(A1H14);
        C008002u A009 = C10E.A00(null);
        this.A0B = A009;
        this.A0Z = AbstractC208910l.A02(A009);
        this.A05 = AbstractC166987dD.A1E();
        this.A06 = AbstractC166987dD.A1E();
        this.A04 = AbstractC166987dD.A1E();
        this.A07 = AbstractC09440dt.A01(C29907DGv.A01(this, 40));
    }

    public static final String A01(AiSettingsRepository aiSettingsRepository, C59958Qrg c59958Qrg) {
        Enum r3;
        if (c59958Qrg != null) {
            r3 = c59958Qrg.getOptionalEnumField(0, AbstractC43591JPw.A00(149), C83.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        } else {
            r3 = null;
        }
        Iterator A15 = AbstractC166997dE.A15((Map) aiSettingsRepository.A0X.getValue());
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String str = (String) A1K.getKey();
            if (r3 == A1K.getValue()) {
                return str;
            }
        }
        return null;
    }

    public static /* synthetic */ void A04(AiSettingsRepository aiSettingsRepository) {
        A03(null, aiSettingsRepository, null, null, null, null, null, null, null, 511);
    }

    public static /* synthetic */ void A07(AiSettingsRepository aiSettingsRepository, String str, String str2, String str3, int i) {
        A03(null, aiSettingsRepository, str, str2, null, str3, null, null, null, i);
    }

    public final void A09(String str) {
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A01);
        Object value = this.A0W.getValue();
        if (value != null) {
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, ((C26083BgC) value).A05, "persona_id");
            C0CA.A00(A0T, str, "image_prompt");
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            AbstractC25231BEo.A18(A0T, A0b);
            PandoGraphQLRequest A00 = AbstractC28918CpS.A00(A0b, A0b2);
            A00.setNetworkTimeoutSeconds(30);
            AbstractC166997dE.A1Y(this.A0M, true);
            this.A01 = AbstractC25226BEj.A1L(new MC9(this, A00, str, A0s, 3), super.A01);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0A(String str) {
        C26083BgC c26083BgC;
        C14360o3.A0B(str, 0);
        C05A c05a = this.A08;
        C26083BgC c26083BgC2 = (C26083BgC) c05a.getValue();
        if (c26083BgC2 != null) {
            c26083BgC = C26083BgC.A00(null, null, c26083BgC2, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, 16776703, false, false);
        } else {
            c26083BgC = null;
        }
        c05a.Egh(c26083BgC);
        A03(null, this, null, null, str, null, null, null, null, 507);
    }

    public final void A0B(List list) {
        C26083BgC c26083BgC;
        C14360o3.A0B(list, 0);
        C05A c05a = this.A08;
        C26083BgC c26083BgC2 = (C26083BgC) c05a.getValue();
        if (c26083BgC2 != null) {
            c26083BgC = C26083BgC.A00(null, null, c26083BgC2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, 14680063, false, false);
        } else {
            c26083BgC = null;
        }
        c05a.Egh(c26083BgC);
        A03(null, this, null, null, null, null, null, list, null, 447);
    }

    public final void A0C(List list) {
        C14360o3.A0B(list, 0);
        Object value = this.A0W.getValue();
        if (value != null) {
            this.A08.Egh(C26083BgC.A00(null, null, (C26083BgC) value, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, 15728639, false, false));
            A03(null, this, null, null, null, null, null, null, null, 511);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final boolean A0E(String str, List list) {
        boolean A1R = AbstractC167007dF.A1R(0, list, str);
        C26083BgC A0s = AbstractC25226BEj.A0s(this.A08);
        if (A0s != null) {
            UserSession userSession = this.A02;
            int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573360398L);
            if (!AbstractC001900j.A0T(str) && str.length() <= A07) {
                int A072 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486573622546L);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC166987dD.A1B(it).length() > A072) {
                        }
                    }
                }
                if (str.equals(A0s.A0C)) {
                    ArrayList A0R = AbstractC001800i.A0R(list, A0s.A0H);
                    if ((A0R instanceof Collection) && A0R.isEmpty()) {
                        return false;
                    }
                    Iterator it2 = A0R.iterator();
                    while (it2.hasNext()) {
                        C09530e4 c09530e4 = (C09530e4) it2.next();
                        if (AbstractC25225BEi.A1a(c09530e4.A00, c09530e4.A01)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        return A1R;
    }

    public static C26083BgC A00(AiSettingsRepository aiSettingsRepository) {
        return (C26083BgC) aiSettingsRepository.A0W.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0146, code lost:
    
        if (X.C14360o3.A0K(r4, r0) == false) goto L278;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void A03(X.C26069Bfx r23, com.instagram.aistudio.editor.AiSettingsRepository r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.List r30, java.util.List r31, int r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.editor.AiSettingsRepository.A03(X.Bfx, com.instagram.aistudio.editor.AiSettingsRepository, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int):void");
    }

    public static final void A05(AiSettingsRepository aiSettingsRepository, C83 c83) {
        String str;
        C83 c832 = C83.ONLY_ME;
        C1Df c1Df = aiSettingsRepository.A00;
        if (c83 == c832) {
            if (c1Df != null) {
                c1Df.cancel();
            }
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C26083BgC A0s = AbstractC25226BEj.A0s(aiSettingsRepository.A08);
            if (A0s == null || (str = A0s.A08) == null) {
                str = "";
            }
            A0b.A04("personaVersionId", str);
            aiSettingsRepository.A00 = AbstractC40691uc.A01(aiSettingsRepository.A02).A01(new C28909CpI(aiSettingsRepository, 2), new C58510Pwe(aiSettingsRepository, 2), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "AiSafetyViolationsGraphQLSubscription", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59825Qon.class, false, PandoRealtimeInfoJNI.forSubscription("xfb_genai_persona_version_safety_status_update_subscribe"), 0, null, "xfb_genai_persona_version_safety_status_update_subscribe", AbstractC166987dD.A1E()));
            return;
        }
        if (c1Df == null) {
            return;
        }
        c1Df.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(X.C50679MYx r18, java.lang.String r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r17 = this;
            r5 = 32
            r6 = r21
            boolean r0 = X.MAN.A02(r6, r5)
            r4 = r17
            if (r0 == 0) goto Lc9
            r3 = r6
            X.MAN r3 = (X.MAN) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc9
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r1 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r11 = 1
            if (r0 == 0) goto L48
            if (r0 != r11) goto Ld5
            java.lang.Object r2 = r3.A01
            com.instagram.aistudio.editor.AiSettingsRepository r2 = (com.instagram.aistudio.editor.AiSettingsRepository) r2
            X.AbstractC09560e7.A00(r1)
        L2c:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L43
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Ld0
            X.05A r1 = r2.A0R
            r0 = 0
            X.AbstractC166997dE.A1Y(r1, r0)
            r1 = 2131952833(0x7f1304c1, float:1.954212E38)
            java.lang.String r0 = "ai_studio_save_ai_changes_error"
            A06(r2, r0, r1)
            r11 = 0
        L43:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L48:
            X.AbstractC09560e7.A00(r1)
            r7 = r20
            r6 = r18
            if (r18 != 0) goto Lb2
            if (r20 == 0) goto Lda
            r5 = 0
        L54:
            X.0Jx r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.lang.String r0 = "persona_id"
            r6 = r19
            X.0CA r6 = X.AbstractC25227BEk.A0T(r1, r6, r0)
            java.lang.String r1 = X.AbstractC166997dE.A0o()
            java.lang.String r0 = "client_mutation_id"
            X.C0CA.A00(r6, r1, r0)
            java.lang.String r1 = "new_example_dialogue"
            if (r5 == 0) goto L73
            X.0CA r0 = r5.A02()
            r6.A0E(r0, r1)
        L73:
            java.lang.String r0 = "new_fact"
            X.C0CA.A00(r6, r7, r0)
            X.05A r0 = r4.A0R
            X.AbstractC166997dE.A1Y(r0, r11)
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r1 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "input"
            X.1uJ r6 = X.AbstractC25233BEq.A0H(r6, r5, r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r1.getParamsCopy()
            java.lang.Class<X.Qov> r10 = X.C59833Qov.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "AiStudioAddPersonaKnowledgeMutation"
            r13 = 96
            java.lang.String r15 = "xfb_genai_persona_update_persona_from_chat"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1ud r0 = r4.A03
            r3.A01 = r4
            r3.A00 = r11
            java.lang.Object r1 = r0.A04(r5, r3)
            if (r1 != r2) goto Lc6
            return r2
        Lb2:
            X.2JO r5 = new X.2JO
            r5.<init>()
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "prompt"
            r5.A09(r1, r0)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "response"
            r5.A09(r1, r0)
            goto L54
        Lc6:
            r2 = r4
            goto L2c
        Lc9:
            X.MAN r3 = new X.MAN
            r3.<init>(r4, r6, r5)
            goto L1a
        Ld0:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lda:
            java.lang.String r0 = "Both example dialogue and instruction cannot be null"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.editor.AiSettingsRepository.A08(X.MYx, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final ArrayList A02(C59958Qrg c59958Qrg) {
        List list;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c59958Qrg == null || (list = c59958Qrg.getRequiredCompactedTreeListField(2, AbstractC58317Pt9.A00(95), R1H.class, 728213440)) == null) {
            list = C16930sl.A00;
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj : list) {
            R1H r1h = (R1H) obj;
            if (r1h.A08("app_formatted") != null && r1h.A0E() != null) {
                A1E2.add(obj);
            }
        }
        Iterator it = A1E2.iterator();
        while (it.hasNext()) {
            R1H r1h2 = (R1H) it.next();
            String valueOf = String.valueOf(r1h2.A08("app_formatted"));
            String A09 = r1h2.A09("app_subtext");
            EnumC61203Rh3 A0E = r1h2.A0E();
            if (A0E != null) {
                A1E.add(new C51741MtQ(A0E, valueOf, A09, r1h2.getCoercedBooleanField(3, "is_enabled")));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return A1E;
    }

    public static final void A06(AiSettingsRepository aiSettingsRepository, String str, int i) {
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0H = str;
        AbstractC25226BEj.A1N(AbstractC25225BEi.A0F(aiSettingsRepository.A02), A0j, i);
        AbstractC25233BEq.A1F(A0j);
    }

    public final boolean A0D() {
        String str;
        C26083BgC A00 = A00(this);
        String str2 = null;
        if (A00 != null) {
            str = A00.A04;
        } else {
            str = null;
        }
        C26083BgC A0s = AbstractC25226BEj.A0s(this.A0G);
        if (A0s != null) {
            str2 = A0s.A04;
        }
        return AbstractC25225BEi.A1a(str, str2);
    }
}
