package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.WdX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70593WdX implements C5yI {
    public final InterfaceC132365yF A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC16660sJ A02;
    public final Context A03;
    public final L3A A04;
    public final Wk3 A05;
    public final UserSession A06;
    public final C3MQ A07;
    public final boolean A08;

    @Override // X.C5yI
    public final void Cui(AbstractC136536Gh abstractC136536Gh, C136546Gi c136546Gi, String str, String str2, String str3, String str4, int i, boolean z) {
        Long l;
        String str5;
        Long l2;
        AbstractC25234BEr.A0k(0, str, abstractC136536Gh, c136546Gi, str4);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_organic_action_menu");
            String id = A0h.getId();
            if (id != null) {
                A00.AAP("m_pk", id);
                String organicTrackingToken = A0h.A0C.getOrganicTrackingToken();
                if (organicTrackingToken == null) {
                    organicTrackingToken = "";
                }
                A00.AAP("tracking_token", organicTrackingToken);
                String id2 = A0h.getId();
                if (id2 != null) {
                    String A06 = C38801rC.A06(id2);
                    C14360o3.A0B(A06, 0);
                    A00.A9K("media_id", AbstractC003100w.A0k(10, A06));
                    User CDj = A0h.A0C.CDj();
                    Long l3 = null;
                    if (CDj != null) {
                        l = AbstractC003100w.A0k(10, CDj.getId());
                    } else {
                        l = null;
                    }
                    A00.A9K("media_author_id", l);
                    User CDj2 = A0h.A0C.CDj();
                    if (CDj2 != null) {
                        str5 = CDj2.B7L().toString();
                    } else {
                        str5 = null;
                    }
                    A00.AAP(AbstractC111324zv.A00(402), str5);
                    A00.AAP("module_name", interfaceC60442pS.getModuleName());
                    A00.A9K("m_ix", Long.valueOf(i));
                    if (str2 != null) {
                        String A062 = C38801rC.A06(str2);
                        C14360o3.A0B(A062, 0);
                        l2 = AbstractC003100w.A0k(10, A062);
                    } else {
                        l2 = null;
                    }
                    A00.A9K(AbstractC111324zv.A00(177), l2);
                    if (str3 != null) {
                        String A063 = C38801rC.A06(str3);
                        C14360o3.A0B(A063, 0);
                        l3 = AbstractC003100w.A0k(10, A063);
                    }
                    A00.A9K(AbstractC111324zv.A00(32), l3);
                    AbstractC37302Gc3.A0y(A00, A0h);
                    A00.Cht();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A00.CrR(abstractC136536Gh, c136546Gi, str, str4, str2, str3, z);
    }

    @Override // X.C5yI
    public final void CvA(C38641Gyi c38641Gyi) {
        String A19;
        C14360o3.A0B(c38641Gyi, 0);
        Context context = this.A03;
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        List<AndroidLink> list = c38641Gyi.A07;
        if (list != null) {
            for (AndroidLink androidLink : list) {
                EnumC906041v A01 = AbstractC114965Hm.A01(androidLink);
                if (A01 != null) {
                    int ordinal = A01.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                continue;
                            } else {
                                A19 = androidLink.Aw8();
                                if (A19 == null) {
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                        } else {
                            String CIt = androidLink.CIt();
                            if (CIt != null) {
                                A19 = AbstractC166987dD.A19(AbstractC14490oL.A03(CIt, androidLink.Bm5()));
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        if (Hx6.A00(context, A19)) {
                            return;
                        }
                    } else {
                        String CHN = androidLink.CHN();
                        if (CHN != null) {
                            C63397SjR c63397SjR = new C63397SjR(context, userSession, C2Fb.A45, CHN, false);
                            c63397SjR.A0P = androidLink.BlN();
                            c63397SjR.A0T = Collections.unmodifiableList(c38641Gyi.A06);
                            c63397SjR.A0C(c38641Gyi.A03);
                            c63397SjR.A0B(c38641Gyi.A00);
                            c63397SjR.A0S = interfaceC60442pS.getModuleName();
                            c63397SjR.A0D(c38641Gyi.A05);
                            c63397SjR.A0A();
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
    }

    @Override // X.C5yI
    public final void D5q(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        AbstractC167007dF.A1D(str, 0, str3);
        InterfaceC60442pS interfaceC60442pS = this.A01;
        if (str5 == null) {
            str5 = str3;
        }
        A00(EnumC71343Hv.A0M, str5);
        this.A00.CrQ(str3, interfaceC60442pS.getModuleName(), null, null, null, false, false);
    }

    @Override // X.C5yI
    public final void D7q(String str, String str2, long j) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "threads_24hr_timer_tap");
        if (A00.isSampled()) {
            AbstractC31175DnJ.A14(A00, interfaceC60442pS);
            A00.AAP("nav_chain", AbstractC31178DnM.A0b());
            C38801rC c38801rC = C38321qM.A0h;
            AbstractC25236BEt.A0r(A00, C38801rC.A06(str));
            A00.Cht();
        }
        this.A00.Cqk(str, str2, j);
    }

    @Override // X.C5yI
    public final void D9n(String str) {
        C14360o3.A0B(str, 0);
        this.A02.invoke(new C70594WdY(str));
    }

    @Override // X.C5yI
    public final void DF6(String str) {
    }

    @Override // X.C5yI
    public final void DHx(C19260xA c19260xA, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AbstractC167017dG.A1N(str, str2);
        this.A02.invoke(new C70603Wdh(c19260xA, str, str2, str3, str4));
        if (z2) {
            L3A l3a = this.A04;
            C19L c19l = l3a.A04;
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZW(l3a, (InterfaceC23621Ds) null, 11, z), c19l);
        }
    }

    @Override // X.C5yI
    public final void DJ5(String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        String moduleName = interfaceC60442pS.getModuleName();
        EnumC124565kK enumC124565kK = EnumC124565kK.THREADS_POST;
        AbstractC86593tX.A0e(enumC124565kK, null, userSession, null, moduleName, AbstractC111324zv.A00(420), str);
        C124575kL.A00(this.A03, enumC124565kK, null, userSession, interfaceC60442pS.getModuleName(), str, true);
    }

    @Override // X.C5yI
    public final void DJ6(String str) {
        C14360o3.A0B(str, 0);
        AbstractC86593tX.A0e(EnumC124565kK.THREADS_POST, null, this.A06, null, this.A01.getModuleName(), AbstractC111324zv.A00(4504), str);
    }

    @Override // X.C5yI
    public final void DKg(String str) {
    }

    @Override // X.C5yI
    public final void DMS(String str) {
        C14360o3.A0B(str, 0);
        this.A02.invoke(new C70595WdZ(str));
    }

    @Override // X.C5yI
    public final void DOy(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C14360o3.A0B(str, 0);
        this.A02.invoke(new C70604Wdi(str, str2, str3, str4, str5, z, str7));
    }

    @Override // X.C5yI
    public final void DQJ(String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C38801rC c38801rC = C38321qM.A0h;
        Long A0j = AbstractC25231BEo.A0j(0, C38801rC.A06(str));
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "threads_subtitle_impression");
        if (A00.isSampled()) {
            AbstractC31175DnJ.A14(A00, interfaceC60442pS);
            A00.AAP("nav_chain", AbstractC31178DnM.A0b());
            A00.A9K("media_id", A0j);
            A00.A8R(VHW.A02, "subtitle_type");
            A00.Cht();
        }
    }

    @Override // X.C5yI
    public final void DQK(String str, String str2, String str3) {
        AbstractC167027dH.A12(str, str2, str3);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C38801rC c38801rC = C38321qM.A0h;
        Long A0j = AbstractC25231BEo.A0j(0, C38801rC.A06(str));
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "threads_subtitle_tap");
        if (A00.isSampled()) {
            AbstractC31175DnJ.A14(A00, interfaceC60442pS);
            A00.AAP("nav_chain", AbstractC31178DnM.A0b());
            A00.A9K("media_id", A0j);
            A00.A8R(VHW.A02, "subtitle_type");
            A00.Cht();
        }
        this.A00.Crt(str3, MSV.A00(508), null, str2, null, null, null);
    }

    @Override // X.C5yI
    public final void DRL(C51729Mt8 c51729Mt8, Integer num, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1N(str, str2);
        Hx3.A00(this.A06, this.A01, num, null, str);
        this.A00.CrI(c51729Mt8, str, str2, str3, str4);
    }

    @Override // X.C5yI
    public final void DS9(String str, String str2, String str3) {
        AbstractC167017dG.A1P(str2, str3);
        this.A00.Crt("", "media_pivot_page", null, null, null, str2, str3);
    }

    @Override // X.C5yI
    public final void DSg(String str, String str2, boolean z, String str3) {
        String str4 = str2;
        AbstractC167017dG.A1O(str, str2);
        VPY.A00(this.A06, this.A01, str4, null, null, null);
        if (z) {
            this.A00.Cr7(str, str2);
            return;
        }
        if (str3 != null) {
            str4 = str3;
        }
        A00(EnumC71343Hv.A0S, str4);
        this.A00.Crk(str);
    }

    @Override // X.C5yI
    public final void Daz(String str, boolean z) {
        C14360o3.A0B(str, 0);
        L3A l3a = this.A04;
        C19L c19l = l3a.A04;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PXZ(l3a, str, null, 1, z), c19l);
    }

    @Override // X.C5yI
    public final void DbY(String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        AbstractC167017dG.A1N(str, str2);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        VPY.A00(userSession, interfaceC60442pS, str2, str, str3, str4);
        if (str5 == null) {
            str6 = str2;
        }
        A00(EnumC71343Hv.A0S, str6);
        this.A00.Crh(str, str2, str3, str4);
        if (this.A08) {
            C70808WhO c70808WhO = (C70808WhO) userSession.A01(C70808WhO.class, X4P.A00);
            String moduleName = interfaceC60442pS.getModuleName();
            long currentTimeMillis = System.currentTimeMillis();
            C14360o3.A0B(moduleName, 0);
            C70808WhO.A00(new C51757Mtg("profile_tap", Long.valueOf(currentTimeMillis)), c70808WhO, moduleName, str2);
        }
    }

    @Override // X.C5yI
    public final void Dcu(String str) {
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility;
        C4d0 BuA;
        C14360o3.A0B(str, 0);
        C38321qM A0h = AbstractC25229BEm.A0h(this.A06, str);
        if (A0h != null) {
            InterfaceC99334d2 C6Y = A0h.A0C.C6Y();
            if (C6Y == null || (BuA = C6Y.BuA()) == null || (xDTTextAppQuoteAttachmentEligibility = BuA.Akc()) == null) {
                xDTTextAppQuoteAttachmentEligibility = XDTTextAppQuoteAttachmentEligibility.A08;
            }
            L3A l3a = this.A04;
            AbstractC23641Du.A05(AnonymousClass191.A00, new MCJ(xDTTextAppQuoteAttachmentEligibility, l3a, null, 20), l3a.A04);
        }
    }

    @Override // X.C5yI
    public final void Dfi(RepostRestrictedReason repostRestrictedReason, String str, String str2, String str3, boolean z, boolean z2) {
        Long l;
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_organic_repost_button_tap");
            AbstractC31175DnJ.A14(A00, interfaceC60442pS);
            A00.AAP("nav_chain", AbstractC31178DnM.A0b());
            C38801rC c38801rC = C38321qM.A0h;
            String id = A0h.getId();
            if (id != null) {
                AbstractC25236BEt.A0r(A00, C38801rC.A06(id));
                AbstractC37301Gc2.A15(A00, interfaceC60442pS);
                User CDj = A0h.A0C.CDj();
                if (CDj != null) {
                    l = AbstractC25231BEo.A0k(CDj);
                } else {
                    l = null;
                }
                A00.A9K("media_author_id", l);
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("search_session_id", null);
                c0Zx.A06("serp_session_id", null);
                c0Zx.A06("query_text", null);
                c0Zx.A06("rank_token", null);
                A00.AAQ(c0Zx, "search_context");
                A00.Cht();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (this.A08) {
            C70808WhO c70808WhO = (C70808WhO) userSession.A01(C70808WhO.class, X4P.A00);
            String moduleName = interfaceC60442pS.getModuleName();
            long currentTimeMillis = System.currentTimeMillis();
            C14360o3.A0B(moduleName, 0);
            C70808WhO.A00(new C51757Mtg("repost_tap", Long.valueOf(currentTimeMillis)), c70808WhO, moduleName, str);
        }
        if (!z && !z2) {
            if (repostRestrictedReason != null && repostRestrictedReason.ordinal() == 3) {
                C9GR.A07(this.A03, 2131972420);
                return;
            }
            return;
        }
        this.A00.CrU(str, str2, str3, interfaceC60442pS.getModuleName());
    }

    @Override // X.C5yI
    public final void Dfj(RepostRestrictedReason repostRestrictedReason, String str, String str2, boolean z) {
        Long l;
        Long l2;
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_organic_quote_post_tap");
            AbstractC31175DnJ.A14(A00, interfaceC60442pS);
            A00.AAP("nav_chain", AbstractC31178DnM.A0b());
            C38801rC c38801rC = C38321qM.A0h;
            String id = A0h.getId();
            if (id != null) {
                AbstractC25236BEt.A0r(A00, C38801rC.A06(id));
                AbstractC37301Gc2.A15(A00, interfaceC60442pS);
                User CDj = A0h.A0C.CDj();
                if (CDj != null) {
                    l = AbstractC25231BEo.A0k(CDj);
                } else {
                    l = null;
                }
                A00.A9K("media_author_id", l);
                if (str2 != null) {
                    l2 = AbstractC25231BEo.A0j(0, C38801rC.A06(str2));
                } else {
                    l2 = null;
                }
                A00.A9K(AbstractC111324zv.A00(177), l2);
                A00.A7v(AbstractC111324zv.A00(2603), true);
                A00.AAQ(null, "search_context");
                AbstractC37302Gc3.A0y(A00, A0h);
                A00.Cht();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        this.A00.Cql(str);
    }

    @Override // X.C5yI
    public final void DhI(String str) {
        C14360o3.A0B(str, 0);
        this.A02.invoke(new C70596Wda(str));
    }

    @Override // X.C5yI
    public final void DhO(String str) {
    }

    @Override // X.C5yI
    public final void Dii(String str, long j) {
        C14360o3.A0B(str, 0);
        this.A05.A00 = str;
        this.A07.Dih(j);
    }

    @Override // X.C5yI
    public final void DjU(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String id;
        String A05;
        Long A0k;
        String id2;
        String A04;
        Long A0k2;
        AbstractC167017dG.A1N(str, str2);
        if (C14360o3.A0K(str3, AbstractC43591JPw.A00(1372))) {
            UserSession userSession = this.A06;
            InterfaceC60442pS interfaceC60442pS = this.A01;
            C38321qM A0h = AbstractC25229BEm.A0h(userSession, str2);
            if (A0h != null && (id = A0h.getId()) != null && (A05 = C38801rC.A05(id)) != null && (A0k = AbstractC003100w.A0k(10, A05)) != null && (id2 = A0h.getId()) != null && (A04 = C38801rC.A04(id2)) != null && (A0k2 = AbstractC003100w.A0k(10, A04)) != null) {
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
                InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_timely_topic_tap");
                if (A00.isSampled()) {
                    A00.AAP("nav_chain", AbstractC31178DnM.A0b());
                    A00.AAP("module_name", interfaceC60442pS.getModuleName());
                    A00.A9K("media_author_id", A0k2);
                    A00.AAP("timely_topic_text", str);
                    A00.A9K("media_id", A0k);
                    A00.Cht();
                }
            }
        }
        if (str5 != null && str6 != null) {
            this.A02.invoke(new C70602Wdg(str4, str5, str6, str7));
        }
        this.A00.Crt(str, str3, null, null, null, null, null);
    }

    @Override // X.C5yI
    public final void Djq(String str) {
        C14360o3.A0B(str, 0);
        this.A02.invoke(new C70597Wdb(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a8, code lost:
    
        if (X.C18U.A06(r7, r12, 36328422527483400L) == false) goto L16;
     */
    @Override // X.C5yI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DlT(java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70593WdX.DlT(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.C5yI
    public final void DlX(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        this.A02.invoke(new C48248LWx(str, str2, str3, true));
    }

    @Override // X.C5yI
    public final void DwI(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        this.A02.invoke(new C70600Wde(str, str2, str3));
    }

    @Override // X.C5yI
    public final void DwJ(String str) {
    }

    @Override // X.C5yI
    public final void DxK(String str) {
        C14360o3.A0B(str, 0);
        L3A l3a = this.A04;
        C50120MBu.A01(l3a, str, l3a.A04, 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.4Hy, java.lang.Object] */
    private final void A00(EnumC71343Hv enumC71343Hv, String str) {
        UserSession userSession = this.A06;
        if (C18U.A06(C06090Tz.A05, userSession, 36330389622571865L)) {
            InterfaceC60442pS interfaceC60442pS = this.A01;
            C3KL A00 = C3KL.A00(userSession);
            C14360o3.A07(A00);
            C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
            if (A0h != null && !A0h.CdW()) {
                ?? obj = new Object();
                obj.A01 = A0h;
                obj.A02 = interfaceC60442pS;
                obj.A06 = false;
                obj.A00 = null;
                obj.A05 = Collections.emptySet();
                A00.A04(obj, AbstractC16960so.A1O(A0h.A0C.getLoggingInfoToken()), AbstractC166987dD.A1J(new C71353Hw(enumC71343Hv)), 1, true);
            }
        }
    }

    @Override // X.C5yI
    public final void D6A(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        String str7 = str5;
        AbstractC167017dG.A1N(str, str2);
        if (z) {
            UserSession userSession = this.A06;
            InterfaceC60442pS interfaceC60442pS = this.A01;
            VPZ.A00(userSession, interfaceC60442pS, str, str3, str4);
            if (this.A08) {
                C70808WhO c70808WhO = (C70808WhO) userSession.A01(C70808WhO.class, X4P.A00);
                String moduleName = interfaceC60442pS.getModuleName();
                long currentTimeMillis = System.currentTimeMillis();
                C14360o3.A0B(moduleName, 0);
                C70808WhO.A00(new C51757Mtg("comment_tap", Long.valueOf(currentTimeMillis)), c70808WhO, moduleName, str);
            }
        }
        W3w w3w = W3w.A00;
        UserSession userSession2 = this.A06;
        InterfaceC60442pS interfaceC60442pS2 = this.A01;
        w3w.A00(interfaceC60442pS2, userSession2, str, str6, null, str3, null);
        if (str5 == null) {
            str7 = str2;
        }
        A00(EnumC71343Hv.A0M, str7);
        InterfaceC132365yF interfaceC132365yF = this.A00;
        String moduleName2 = interfaceC60442pS2.getModuleName();
        C06090Tz c06090Tz = C06090Tz.A05;
        interfaceC132365yF.CrQ(str2, moduleName2, str3, null, null, C18U.A06(c06090Tz, userSession2, 36330303723422515L), C18U.A06(c06090Tz, userSession2, 36330303723619125L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cb, code lost:
    
        if (X.C18U.A06(r3, r2, 36327494814677627L) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    @Override // X.C5yI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D86(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70593WdX.D86(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }

    @Override // X.C5yI
    public final void DGV(boolean z) {
        L3A l3a = this.A04;
        C19L c19l = l3a.A04;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZW(l3a, (InterfaceC23621Ds) null, 10, z), c19l);
    }

    @Override // X.C5yI
    public final void DMw() {
        L3A l3a = this.A04;
        MBq.A01(l3a, l3a.A04, 38);
    }

    @Override // X.C5yI
    public final void DZt(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        String str7 = str6;
        AbstractC167007dF.A1D(str, 0, str3);
        W3w w3w = W3w.A00;
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        w3w.A00(interfaceC60442pS, userSession, str, str2, str4, str5, null);
        if (str6 == null) {
            str7 = str3;
        }
        A00(EnumC71343Hv.A0M, str7);
        this.A00.CrQ(str3, interfaceC60442pS.getModuleName(), str5, null, list, false, false);
        if (this.A08) {
            C70808WhO c70808WhO = (C70808WhO) userSession.A01(C70808WhO.class, X4P.A00);
            String moduleName = interfaceC60442pS.getModuleName();
            long currentTimeMillis = System.currentTimeMillis();
            C14360o3.A0B(moduleName, 0);
            C70808WhO.A00(new C51757Mtg("post_tap", Long.valueOf(currentTimeMillis)), c70808WhO, moduleName, str);
        }
    }

    @Override // X.C5yI
    public final void Dcw(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8 = str7;
        AbstractC25233BEq.A0v(0, str, str3, str4);
        W3w w3w = W3w.A00;
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        w3w.A00(interfaceC60442pS, userSession, str3, str2, str4, str5, str6);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_quoted_post_tap");
        if (A00.isSampled()) {
            C38801rC c38801rC = C38321qM.A0h;
            AbstractC25236BEt.A0r(A00, C38801rC.A06(str));
            A00.A9K("media_author_id", AbstractC25228BEl.A13(str4));
            A00.AAP("module_name", interfaceC60442pS.getModuleName());
            A00.AAP("nav_chain", AbstractC31178DnM.A0b());
            Long l = null;
            A00.A9K(AbstractC111324zv.A00(32), null);
            A00.A8p("m_ix", Integer.valueOf(i));
            if (str2 != null) {
                l = AbstractC25228BEl.A13(C38801rC.A06(str2));
            }
            A00.A9K(AbstractC111324zv.A00(1234), l);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("search_session_id", null);
            c0Zx.A06("serp_session_id", null);
            c0Zx.A06("query_text", null);
            c0Zx.A06("rank_token", null);
            A00.AAQ(c0Zx, "search_context");
            A00.Cht();
        }
        if (str7 == null) {
            str8 = str3;
        }
        A00(EnumC71343Hv.A0M, str8);
        this.A00.CrQ(str3, interfaceC60442pS.getModuleName(), null, str6, null, false, false);
        if (this.A08) {
            X4P x4p = X4P.A00;
            C70808WhO c70808WhO = (C70808WhO) userSession.A01(C70808WhO.class, x4p);
            String moduleName = interfaceC60442pS.getModuleName();
            long currentTimeMillis = System.currentTimeMillis();
            C14360o3.A0B(moduleName, 0);
            C70808WhO.A00(new C51757Mtg("post_tap", Long.valueOf(currentTimeMillis)), c70808WhO, moduleName, str3);
            C70808WhO c70808WhO2 = (C70808WhO) userSession.A01(C70808WhO.class, x4p);
            String moduleName2 = interfaceC60442pS.getModuleName();
            long currentTimeMillis2 = System.currentTimeMillis();
            C14360o3.A0B(moduleName2, 0);
            C70808WhO.A00(new C51757Mtg("quoted_post_tap", Long.valueOf(currentTimeMillis2)), c70808WhO2, moduleName2, str);
        }
    }

    @Override // X.C5yI
    public final void Drz(String str, String str2, String str3, String str4) {
        String id;
        String A05;
        Long A0k;
        String A04;
        AbstractC167017dG.A1N(str, str2);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str2);
        if (A0h != null && (id = A0h.getId()) != null && (A05 = C38801rC.A05(id)) != null && (A0k = AbstractC003100w.A0k(10, A05)) != null) {
            String id2 = A0h.getId();
            Long l = null;
            if (id2 != null && (A04 = C38801rC.A04(id2)) != null) {
                l = AbstractC003100w.A0k(10, A04);
            }
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_tags_caption_tap");
            if (A00.isSampled()) {
                A00.AAP("module_name", interfaceC60442pS.getModuleName());
                A00.AAP("nav_chain", AbstractC31178DnM.A0b());
                A00.A9K("media_id", A0k);
                A00.A9K("media_author_id", l);
                AbstractC37302Gc3.A0y(A00, A0h);
                A00.A7v("is_hashtag", Boolean.valueOf(AbstractC002300n.A0h(str, "#", false)));
                A00.Cht();
            }
        }
        this.A00.Crt(str, str3, str4, null, null, null, null);
    }

    @Override // X.C5yI
    public final void DxR() {
        L3A l3a = this.A04;
        MBq.A01(l3a, l3a.A04, 40);
    }

    public C70593WdX(Context context, InterfaceC132365yF interfaceC132365yF, L3A l3a, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A02 = interfaceC16660sJ;
        this.A00 = interfaceC132365yF;
        this.A04 = l3a;
        this.A06 = userSession;
        this.A01 = interfaceC60442pS;
        this.A03 = context;
        this.A08 = z;
        Wk3 wk3 = new Wk3(userSession);
        this.A05 = wk3;
        this.A07 = new C3MQ(userSession, wk3, interfaceC60442pS, null);
    }

    @Override // X.C5yI
    public final void DCr(String str, String str2) {
        long j;
        long j2;
        AbstractC167017dG.A1N(str, str2);
        L3A l3a = this.A04;
        UserSession userSession = l3a.A03;
        InterfaceC11380iw interfaceC11380iw = l3a.A02;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_post_edited_toast_impression");
        if (A00.isSampled()) {
            AbstractC31175DnJ.A14(A00, interfaceC11380iw);
            A00.AAP("nav_chain", AbstractC31178DnM.A0b());
            C38801rC c38801rC = C38321qM.A0h;
            try {
                j = Long.parseLong(C38801rC.A06(str));
            } catch (NumberFormatException unused) {
                j = 0;
            }
            A00.A9K("media_id", Long.valueOf(j));
            try {
                j2 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
                j2 = 0;
            }
            A00.A9K("media_author_id", Long.valueOf(j2));
            A00.Cht();
        }
        MBq.A01(l3a, l3a.A04, 39);
    }

    @Override // X.C5yI
    public final void DMQ(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A02.invoke(new C48247LWw(str, str2));
    }

    @Override // X.C5yI
    public final void DMR(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A02.invoke(new C48247LWw(str, str2));
    }

    @Override // X.C5yI
    public final void DZZ(String str, String str2, int i) {
        AbstractC167017dG.A1N(str, str2);
        this.A02.invoke(new C70601Wdf(str, str2, i));
    }

    @Override // X.C5yI
    public final void Daa(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        Long A0k = AbstractC003100w.A0k(10, str);
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str2);
        C14360o3.A0B(A06, 0);
        Long A0k2 = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_active_now_impression");
            if (A00.isSampled()) {
                AbstractC31175DnJ.A14(A00, interfaceC60442pS);
                A00.AAP("nav_chain", AbstractC31178DnM.A0b());
                A00.A9K(AbstractC111324zv.A00(3216), A0k);
                A00.A9K("media_id", A0k2);
                A00.Cht();
            }
        }
    }

    @Override // X.C5yI
    public final void Dcv(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        InterfaceC132365yF interfaceC132365yF = this.A00;
        String A00 = AbstractC111324zv.A00(1084);
        interfaceC132365yF.Cqm(str2, A00);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "barcelona_organic_quote_media_tap");
        if (A002.isSampled()) {
            A002.AAP("nav_chain", AbstractC31178DnM.A0b());
            C38801rC c38801rC = C38321qM.A0h;
            AbstractC25236BEt.A0r(A002, C38801rC.A06(str));
            AbstractC37301Gc2.A15(A002, interfaceC60442pS);
            AbstractC31175DnJ.A17(A002, A00);
        }
    }

    @Override // X.C5yI
    public final void DjJ(String str, String str2, String str3) {
        AbstractC167027dH.A12(str, str2, str3);
        this.A00.CrF(str2, str3);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_organic_view_media_quote_usage_tap");
        if (A00.isSampled()) {
            A00.AAP("nav_chain", AbstractC31178DnM.A0b());
            C38801rC c38801rC = C38321qM.A0h;
            AbstractC25236BEt.A0r(A00, C38801rC.A06(str));
            AbstractC37301Gc2.A15(A00, interfaceC60442pS);
            AbstractC31175DnJ.A17(A00, str3);
        }
    }

    @Override // X.C5yI
    public final void Dry(String str, String str2) {
        String id;
        String A05;
        Long A0k;
        Long l;
        String A04;
        AbstractC167017dG.A1N(str, str2);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null && (id = A0h.getId()) != null && (A05 = C38801rC.A05(id)) != null && (A0k = AbstractC003100w.A0k(10, A05)) != null) {
            String id2 = A0h.getId();
            if (id2 != null && (A04 = C38801rC.A04(id2)) != null) {
                l = AbstractC003100w.A0k(10, A04);
            } else {
                l = null;
            }
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_tags_participation_entrypoint_tap");
            if (A00.isSampled()) {
                A00.AAP("module_name", interfaceC60442pS.getModuleName());
                A00.AAP("nav_chain", AbstractC31178DnM.A0b());
                A00.A9K("media_id", A0k);
                A00.A9K("media_author_id", l);
                AbstractC37302Gc3.A0y(A00, A0h);
                A00.Cht();
            }
        }
        this.A00.Cqn(str2);
    }

    @Override // X.C5yI
    public final void Dtd(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A02.invoke(new C70598Wdc(str, str2));
    }

    @Override // X.C5yI
    public final void Dx7(EnumC132255y4 enumC132255y4, String str, int i) {
        AbstractC167017dG.A1O(str, enumC132255y4);
        this.A02.invoke(new C70599Wdd(enumC132255y4, str, i));
    }

    @Override // X.C5yI
    public final void E2m(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        UserSession userSession = this.A06;
        C18920wW A01 = AbstractC12220kQ.A01(this.A01, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "p92_rights_management_media_notice_click");
        if (A00.isSampled()) {
            A00.A9K("ig_user_id", AbstractC25228BEl.A13(userSession.userId));
            C38801rC c38801rC = C38321qM.A0h;
            A00.A9K("media_igid", AbstractC25228BEl.A13(C38801rC.A06(str)));
            A00.Cht();
        }
        Context context = this.A03;
        C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        AbstractC41776Ies.A01((Activity) context, userSession, str2, str);
    }
}
