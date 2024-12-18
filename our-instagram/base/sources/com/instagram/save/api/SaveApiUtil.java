package com.instagram.save.api;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC111324zv;
import X.AbstractC13670mt;
import X.AbstractC15820qc;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC16850sd;
import X.AbstractC2044893h;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC37303Gc4;
import X.AbstractC40891I9p;
import X.AbstractC41071vF;
import X.AbstractC41756IeX;
import X.AbstractC75423a9;
import X.AbstractC82703mY;
import X.AbstractC86623ta;
import X.AnonymousClass001;
import X.C05F;
import X.C06860Yd;
import X.C0w9;
import X.C11520jB;
import X.C130175uN;
import X.C14360o3;
import X.C1563670g;
import X.C1GJ;
import X.C1M1;
import X.C1ON;
import X.C1P1;
import X.C23031Ai;
import X.C25621Ms;
import X.C32U;
import X.C37410Gdq;
import X.C38321qM;
import X.C38801rC;
import X.C41151IJq;
import X.C42552IsV;
import X.C57602kZ;
import X.C82713mZ;
import X.ETZ;
import X.EnumC33416Epn;
import X.EnumC77213d7;
import X.FXM;
import X.GZO;
import X.I0I;
import X.InterfaceC38391qT;
import X.InterfaceC60442pS;
import X.InterfaceC76653cC;
import X.JML;
import android.app.Activity;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class SaveApiUtil {
    public static final C1ON A00(UserSession userSession, EnumC77213d7 enumC77213d7, Integer num, String str, String str2, Map map) {
        String str3;
        AbstractC167007dF.A1F(userSession, 0, str2);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        String obj = enumC77213d7.toString();
        C14360o3.A0B(obj, 1);
        if (num.intValue() != 0) {
            str3 = AbstractC111324zv.A00(3034);
        } else {
            str3 = "media/%s/%s/";
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str3, str, obj);
        C14360o3.A07(formatStrLocaleSafe);
        A0c.A0E = formatStrLocaleSafe;
        A0c.A9s("module_name", str2);
        AbstractC31173DnH.A1N(A0c);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            AbstractC37303Gc4.A16(A0c, A15);
        }
        return AbstractC31172DnG.A0U(A0c, true);
    }

    public static final void A03(Activity activity, Context context, C1ON c1on, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, GZO gzo, EnumC77213d7 enumC77213d7, SearchContext searchContext, C1M1 c1m1, String str, int i, int i2, int i3) {
        C41151IJq A02 = A02(context, userSession, enumC77213d7, c38321qM);
        Integer num = C05F.A00;
        c1on.A00 = new ETZ(1, null, gzo, userSession, num, A02, c38321qM, enumC77213d7);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC167007dF.A1L(A00, A00.A25, C23031Ai.A8c, 152, true);
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, enumC77213d7.toString());
        A0F.A09(i);
        A0F.A07 = i3;
        A0F.A3G = num;
        A0F.A71 = str;
        if (searchContext != null) {
            A0F.A6y = searchContext.A05;
            A0F.A6f = searchContext.A03;
            A0F.A6d = searchContext.A02;
            A0F.A11 = searchContext;
        }
        if (!AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
            A0F.A0C(activity, userSession);
            if (c1m1 != null) {
                A0F.A70 = c1m1.getSessionId();
            }
        }
        C32U.A0E(userSession, A0F, c38321qM, interfaceC60442pS, i2);
        if (enumC77213d7 != EnumC77213d7.A04) {
            num = C05F.A01;
        }
        AbstractC41756IeX.A01(activity, userSession, c38321qM, interfaceC60442pS, c1m1, num, EnumC33416Epn.A05.A01, i, i2);
    }

    public static final void A04(Activity activity, Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, GZO gzo, EnumC77213d7 enumC77213d7, SearchContext searchContext, C1M1 c1m1, String str, String str2, String str3, int i, int i2, int i3) {
        String str4;
        String obj;
        String str5;
        AbstractC25234BEr.A0j(0, c38321qM, enumC77213d7, interfaceC60442pS, activity);
        AbstractC167007dF.A1I(userSession, 6, context);
        String id = c38321qM.getId();
        if (id == null) {
            C0w9.A03("SaveApiUtil", "Cannot save media where media.id is null");
            return;
        }
        Integer num = C05F.A00;
        String str6 = null;
        if (c38321qM.CdW()) {
            str4 = c38321qM.A33();
        } else {
            str4 = null;
        }
        C06860Yd c06860Yd = new C06860Yd();
        c06860Yd.put("radio_type", AbstractC15820qc.A09(context));
        if (str4 != null && str4.length() != 0) {
            c06860Yd.put("tracking_token", str4);
        }
        if (searchContext != null) {
            c06860Yd.put("rank_token", searchContext.A03);
            c06860Yd.put("search_session_id", searchContext.A05);
            c06860Yd.put("query_text", searchContext.A02);
        }
        LinkedHashMap A03 = AbstractC06930Yk.A03(AbstractC16850sd.A0N(c06860Yd));
        A03.put("delivery_class", AbstractC86623ta.A00(c38321qM.A2P()));
        if (AbstractC25226BEj.A1G(c38321qM) != null) {
            A03.put("ranking_info_token", AbstractC25226BEj.A1G(c38321qM));
        }
        A03.put("starting_clips_media_id", str2);
        A03.put("starting_clips_ranking_info_token", str3);
        if (i3 != -1) {
            A03.put("feed_recs_post_position", String.valueOf(i3));
        }
        if (AbstractC37300Gc1.A0S(c38321qM) != null) {
            A03.put("inventory_source", AbstractC37300Gc1.A0S(c38321qM));
        }
        if (i != -1) {
            A03.put("client_position", String.valueOf(i));
        }
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            A03.put("nav_chain", A14);
        }
        if (c38321qM.A0C.Bns() != null) {
            JML Bns = c38321qM.A0C.Bns();
            if (Bns != null) {
                str5 = Bns.Bnr();
            } else {
                str5 = null;
            }
            A03.put("repost_id", str5);
        }
        if (i2 != -1) {
            A03.put("carousel_index", String.valueOf(i2));
            C38321qM A1e = c38321qM.A1e(i2);
            if (A1e != null) {
                str6 = A1e.getId();
            }
            A03.put("carousel_media_id", C38801rC.A05(str6));
        }
        C130175uN c130175uN = C130175uN.A00;
        Long A00 = C130175uN.A00(c38321qM);
        List A01 = c130175uN.A01(activity, userSession, c38321qM);
        if (A00 != null && (obj = A00.toString()) != null) {
            A03.put("num_visible_media_notes", obj);
        }
        if (A01 != null) {
            A03.put("fully_visible_media_note_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A01, null));
        }
        I0I.A00(userSession, c38321qM, enumC77213d7);
        C1ON A002 = A00(userSession, enumC77213d7, num, id, interfaceC60442pS.getModuleName(), A03);
        A03(activity, context, A002, userSession, c38321qM, interfaceC60442pS, gzo, enumC77213d7, searchContext, c1m1, str, i, i2, i3);
        C1GJ.A03(A002);
    }

    public static final void A05(Activity activity, Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, EnumC77213d7 enumC77213d7, int i) {
        A04(activity, context, userSession, c38321qM, interfaceC60442pS, null, enumC77213d7, null, null, null, null, null, i, 0, -1);
    }

    public static final void A07(Context context, UserSession userSession, EnumC77213d7 enumC77213d7, InterfaceC38391qT interfaceC38391qT, String str) {
        String str2;
        AbstractC167017dG.A1R(userSession, context);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        if (enumC77213d7 == EnumC77213d7.A04) {
            str2 = "map/save_location/";
        } else {
            str2 = "map/unsave_location/";
        }
        A0c.A0E = str2;
        A0c.A9s("location_id", interfaceC38391qT.BqK());
        A0c.A9s("module_name", str);
        AbstractC31173DnH.A1N(A0c);
        C1ON A0U = AbstractC31172DnG.A0U(A0c, true);
        A0U.A00 = new ETZ(1, null, null, userSession, C05F.A0C, A02(context, userSession, enumC77213d7, interfaceC38391qT), interfaceC38391qT, enumC77213d7);
        C1GJ.A03(A0U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(com.instagram.common.session.UserSession r17, X.InterfaceC60442pS r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r4 = 0
            java.lang.String r0 = "merchant_id"
            r2 = r20
            java.util.HashMap r16 = X.AbstractC167017dG.A0r(r0, r2)
            java.lang.Integer r13 = X.C05F.A01
            X.3d7 r12 = X.EnumC77213d7.A03
            r3 = r18
            java.lang.String r15 = r3.getModuleName()
            r11 = r17
            r14 = r19
            X.1ON r10 = A00(r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = r12.toString()
            java.lang.String r9 = "instagram_shopping"
            java.lang.String r8 = "_"
            java.lang.String r0 = X.AnonymousClass001.A0g(r9, r8, r0)
            X.3mZ r7 = new X.3mZ
            r7.<init>(r3, r0)
            r7.A6b = r14
            r7.A65 = r2
            java.lang.String r0 = r7.A63
            if (r0 == 0) goto L3b
            boolean r1 = r2.equals(r0)
            r0 = 1
            if (r1 == 0) goto L3c
        L3b:
            r0 = 0
        L3c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A1b = r0
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r7.A1p = r5
            r0 = r21
            r7.A6Z = r0
            r7.A3G = r13
            r7.A4c = r2
            java.lang.Integer r4 = X.C05F.A00
            X.C32U.A0I(r11, r7, r3, r4)
            java.lang.String r0 = "remove_from_collection"
            java.lang.String r0 = X.AnonymousClass001.A0g(r9, r8, r0)
            X.3mZ r1 = new X.3mZ
            r1.<init>(r3, r0)
            r1.A6b = r14
            r1.A65 = r2
            java.lang.String r0 = r1.A63
            if (r0 == 0) goto L70
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            r6 = 1
        L70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A1b = r0
            X.Epn r0 = X.EnumC33416Epn.A0C
            java.lang.String r0 = r0.A01
            X.AbstractC41756IeX.A06(r1, r13, r0)
            r1.A4c = r2
            r1.A1p = r5
            X.C32U.A0I(r11, r1, r3, r4)
            X.C1GJ.A03(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.save.api.SaveApiUtil.A08(com.instagram.common.session.UserSession, X.2pS, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final boolean A09(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (c38321qM != null && C57602kZ.A00(userSession).A0O(c38321qM)) {
            return true;
        }
        return false;
    }

    public static final void A06(Context context, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC76653cC interfaceC76653cC, EnumC77213d7 enumC77213d7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10;
        C06860Yd c06860Yd = new C06860Yd();
        if (str != null) {
            c06860Yd.put("merchant_id", str);
        }
        if (c38321qM != null) {
            c06860Yd.put("media_id", c38321qM.getId());
        }
        if (str9 != null) {
            c06860Yd.put("marketer_id", str9);
        }
        C06860Yd A0N = AbstractC16850sd.A0N(c06860Yd);
        String BqK = interfaceC76653cC.BqK();
        C14360o3.A07(BqK);
        Integer num = C05F.A01;
        C1ON A00 = A00(userSession, enumC77213d7, num, BqK, interfaceC60442pS.getModuleName(), A0N);
        A00.A00 = new ETZ(1, c1p1, null, userSession, num, A02(context, userSession, enumC77213d7, interfaceC76653cC), interfaceC76653cC, enumC77213d7);
        if (interfaceC76653cC instanceof Product) {
            Product product = (Product) interfaceC76653cC;
            String A0s = AbstractC25231BEo.A0s(c38321qM);
            C14360o3.A0B(product, 3);
            C11520jB A0B = AbstractC37300Gc1.A0B();
            A0B.A0A("shopping_session_id", str7);
            if (str8 != null) {
                A0B.A0A("position", str8);
            }
            String obj = enumC77213d7.toString();
            String str11 = product.A0H;
            C14360o3.A0B(str11, 0);
            C82713mZ A04 = AbstractC82703mY.A04(new C42552IsV(str11), interfaceC60442pS, obj);
            A04.A3G = num;
            A04.A6Z = str4;
            A04.A6a = str5;
            A04.A7C = str3;
            Boolean valueOf = Boolean.valueOf(product.A04());
            ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
            A04.A0H(userSession, c38321qM, productDetailsProductItemDict.A0C, productDetailsProductItemDict.A0F, valueOf, str11, str);
            A04.A5R = str2;
            A04.A61 = A0s;
            A04.A7Q = AbstractC41071vF.A0I(userSession, A0s);
            A04.A6y = str6;
            A04.A0E(A0B);
            if (enumC77213d7 == EnumC77213d7.A03) {
                A04.A1p = true;
            }
            C42552IsV c42552IsV = new C42552IsV(str11);
            Integer num2 = C05F.A00;
            C32U.A0B(userSession, A04, c42552IsV, interfaceC60442pS, num2);
            if (enumC77213d7 != EnumC77213d7.A04) {
                num2 = num;
            }
            String str12 = EnumC33416Epn.A0C.A01;
            if (c38321qM != null && !c38321qM.CdW()) {
                if (num2 == num2) {
                    str10 = "add_to_collection";
                } else {
                    str10 = "remove_from_collection";
                }
                C82713mZ A042 = AbstractC82703mY.A04(new C42552IsV(str11), interfaceC60442pS, str10);
                if (num2 == num) {
                    A042.A1p = true;
                }
                AbstractC41756IeX.A06(A042, num2, str12);
                A042.A3G = num;
                A042.A6Z = str4;
                A042.A7C = str3;
                Boolean valueOf2 = Boolean.valueOf(product.A04());
                ProductDetailsProductItemDict productDetailsProductItemDict2 = product.A01;
                A042.A0H(userSession, c38321qM, productDetailsProductItemDict2.A0C, productDetailsProductItemDict2.A0F, valueOf2, str11, str);
                A042.A0E(A0B);
                C32U.A0B(userSession, A042, new C42552IsV(str11), interfaceC60442pS, num2);
            }
        }
        C1GJ.A03(A00);
    }

    public static final C1ON A01(UserSession userSession, String str, String str2) {
        String A06 = AbstractC13670mt.A06("feed/collection/%s/clips/", str);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0E = A06;
        AbstractC37302Gc3.A1M(A0M, userSession, C37410Gdq.class);
        A0M.A0A = AnonymousClass001.A0R(A06, str2);
        A0M.A04();
        A0M.A9s("collection_id", str);
        AbstractC2044893h.A06(A0M, str2);
        return A0M.A0N();
    }

    public static final C41151IJq A02(Context context, UserSession userSession, EnumC77213d7 enumC77213d7, InterfaceC38391qT interfaceC38391qT) {
        InterfaceC76653cC interfaceC76653cC;
        AbstractC167027dH.A12(interfaceC38391qT, enumC77213d7, userSession);
        EnumC77213d7 A0L = C57602kZ.A00(userSession).A0L(interfaceC38391qT.BqJ(), interfaceC38391qT);
        C14360o3.A07(A0L);
        FXM.A00(userSession, A0L, enumC77213d7, interfaceC38391qT);
        Integer BqO = interfaceC38391qT.BqO();
        C14360o3.A07(BqO);
        C06860Yd c06860Yd = new C06860Yd();
        if (BqO == C05F.A00 && context != null) {
            c06860Yd.put("radio_type", AbstractC15820qc.A09(context));
        }
        C41151IJq A0M = C57602kZ.A00(userSession).A0M(enumC77213d7, interfaceC38391qT, AbstractC06930Yk.A03(AbstractC16850sd.A0N(c06860Yd)));
        if (BqO == C05F.A01 && (interfaceC38391qT instanceof InterfaceC76653cC) && (interfaceC76653cC = (InterfaceC76653cC) interfaceC38391qT) != null) {
            C1563670g A00 = AbstractC40891I9p.A00(userSession);
            A00.A02.put(interfaceC76653cC.BIa(), AbstractC31173DnH.A0g());
            A00.A02(interfaceC76653cC);
        }
        return A0M;
    }
}
