package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U1s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66151U1s {
    public C65911TwI A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final C18920wW A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public /* synthetic */ C66151U1s(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i, boolean z) {
        z = (i & 16) != 0 ? false : z;
        String A0n = (i & 32) != 0 ? AbstractC166997dE.A0n() : null;
        AbstractC167017dG.A1P(str, userSession);
        C14360o3.A0B(A0n, 6);
        this.A07 = str;
        this.A04 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = fragmentActivity;
        this.A0A = z;
        this.A06 = A0n;
        this.A03 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A05 = AbstractC31271Dot.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A08 = C18U.A06(c06090Tz, userSession, 36328207779118413L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36328207779183950L);
    }

    public final void A04(C38686GzR c38686GzR, C26069Bfx c26069Bfx, String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        String str6;
        List list;
        C14360o3.A0B(str2, 1);
        long A07 = AbstractC43593JPy.A07();
        UserSession userSession = this.A04;
        EnumC33443EqF enumC33443EqF = EnumC33443EqF.NULL_STATE_PROMPT;
        String str7 = c26069Bfx.A02;
        String str8 = c26069Bfx.A01;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = c26069Bfx.A00;
        if (str9 == null) {
            str9 = "";
        }
        List list2 = null;
        if (c38686GzR != null) {
            str4 = c38686GzR.A04;
            str5 = c38686GzR.A02;
            str6 = c38686GzR.A03;
            list = (List) c38686GzR.A01;
            list2 = (List) c38686GzR.A00;
        } else {
            str4 = null;
            str5 = null;
            str6 = null;
            list = null;
        }
        X37 x37 = new X37(FVU.A00(enumC33443EqF, F7I.A00(str7, str8, str9, str4, str5, str6, str3, list, list2), userSession, str2, null), this, str, str2, A07, z);
        if (this.A00 == null) {
            C65911TwI.A04.A00(userSession, new C45683KJu(2, x37, this), null, 2);
        } else {
            x37.invoke();
        }
    }

    public final void A05(C32021E4z c32021E4z, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 1);
        X3B x3b = new X3B(c32021E4z, this, str, str2, str3, str4, AbstractC43593JPy.A07());
        if (this.A00 == null) {
            C65911TwI.A04.A00(this.A04, new C45683KJu(1, x3b, this), null, 2);
        } else {
            x3b.invoke();
        }
    }

    public final void A06(UPT upt, String str) {
        String str2;
        String str3;
        String str4;
        List list;
        VEZ vez;
        if (upt != null) {
            str2 = upt.A05;
            C69211Vje c69211Vje = upt.A02;
            if (c69211Vje == null || (str3 = c69211Vje.A00) == null) {
                str3 = upt.A03;
            }
            str4 = upt.A04;
            if (c69211Vje != null) {
                list = c69211Vje.A01;
                ArrayList arrayList = new ArrayList(list);
                if (str2 == null && str3 != null && str4 != null) {
                    int i = 0;
                    if (arrayList.size() == 1) {
                        Venue A00 = AbstractC69973Vyo.A00(((MediaMapPin) arrayList.get(0)).A09);
                        W6l.A01(null, this.A01, this.A04, MapEntryPoint.A0E, VEZ.A05, str, A00.A02(), A00.A00.getName(), arrayList, new double[]{Double.parseDouble(String.valueOf(upt.A01)), Double.parseDouble(String.valueOf(upt.A00))});
                        return;
                    }
                    VEZ[] values = VEZ.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            vez = values[i];
                            if (C14360o3.A0K(vez.toString(), str4)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            vez = VEZ.A02;
                            break;
                        }
                    }
                    W6l.A01(null, this.A01, this.A04, MapEntryPoint.A0E, vez, str, str2, str3, arrayList, null);
                    return;
                }
                W6l.A02(null, this.A01, this.A04, MapEntryPoint.A0E, str);
            }
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        list = null;
        ArrayList arrayList2 = new ArrayList(list);
        if (str2 == null) {
        }
        W6l.A02(null, this.A01, this.A04, MapEntryPoint.A0E, str);
    }

    public final void A0B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        C14360o3.A0B(str, 0);
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A01, this.A04);
        A0P.A0B = "search_result";
        U04.A00();
        A0P.A0B(null, U29.A00(this.A07, str, str3, str4, str5, str6, str7, str8, z));
        InterfaceC11380iw interfaceC11380iw = this.A02;
        A0P.A09 = interfaceC11380iw;
        A0P.A07 = new C70590WdS(null, this, str2, str, interfaceC11380iw.getModuleName(), "echo", i);
        A0P.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (r27.A09 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C32021E4z r25, com.instagram.model.direct.DirectShareTarget r26, X.C66151U1s r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, boolean r34) {
        /*
            r12 = r26
            r1 = r27
            r9 = r25
            if (r26 != 0) goto L1a
            com.instagram.common.session.UserSession r4 = r1.A04
            X.0Tz r0 = X.AbstractC166997dE.A0U(r4)
            r2 = 36324767511359945(0x810d2f001031c9, double:3.0352674700579475E-306)
            boolean r0 = X.C18U.A06(r0, r4, r2)
            if (r0 != 0) goto L1a
        L19:
            return
        L1a:
            java.lang.String r21 = X.AbstractC31178DnM.A0b()
            com.instagram.common.session.UserSession r5 = r1.A04
            X.Vry r3 = X.VWZ.A00(r5)
            java.lang.String r0 = r1.A07
            r14 = r28
            r3.A00 = r14
            r3.A02 = r0
            r2 = r29
            r3.A01 = r2
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r7 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r7.<init>(r5)
            androidx.fragment.app.FragmentActivity r8 = r1.A01
            X.0iw r10 = r1.A02
            r19 = 0
            boolean r3 = X.AbstractC65702TsY.A1Y(r5)
            if (r3 == 0) goto L47
            boolean r3 = r1.A09
            r16 = 1
            if (r3 == 0) goto L49
        L47:
            r16 = 0
        L49:
            if (r25 != 0) goto L54
            X.EqF r4 = X.EnumC33443EqF.NULL_STATE_PROMPT
            r3 = 0
            r6 = r31
            X.E4z r9 = X.FVU.A00(r4, r3, r5, r6, r3)
        L54:
            X.WjM r11 = new X.WjM
            r27 = r32
            r17 = r34
            r22 = r11
            r23 = r1
            r24 = r21
            r25 = r14
            r26 = r2
            r29 = r17
            r22.<init>(r23, r24, r25, r26, r27, r29)
            r3 = 2
            X.Wn8 r13 = new X.Wn8
            r13.<init>(r1, r3)
            r18 = 1
            r15 = r30
            r20 = r19
            boolean r3 = r7.A0B(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r3 != 0) goto L19
            boolean r3 = r1.A09
            if (r3 != 0) goto L19
            X.0wW r4 = r1.A03
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>()
            java.lang.String r23 = android.util.Log.getStackTraceString(r3)
            X.C14360o3.A07(r23)
            java.lang.String r24 = X.AbstractC31173DnH.A0q(r1)
            X.C14360o3.A07(r24)
            java.lang.String r1 = r1.A05
            r20 = r12
            r22 = r14
            r25 = r1
            r26 = r0
            r27 = r2
            r19 = r4
            X.F1W.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66151U1s.A00(X.E4z, com.instagram.model.direct.DirectShareTarget, X.U1s, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean):void");
    }

    public static final void A01(C53S c53s, Reel reel, C3G2 c3g2, InterfaceC63982vJ interfaceC63982vJ, C38E c38e, C3Ow c3Ow, SearchContext searchContext, C66151U1s c66151U1s) {
        List A1J = AbstractC166987dD.A1J(reel);
        c38e.A0C = c66151U1s.A06;
        c38e.A05 = new C31559Dtj(c66151U1s.A01, c3Ow.Aek(), interfaceC63982vJ);
        c38e.A01 = c53s;
        c38e.A02 = c66151U1s.A02;
        c38e.A09 = "search_result";
        c38e.A08 = searchContext;
        c38e.A06(reel, c3g2, c3Ow, A1J, A1J, A1J);
    }

    public final void A02() {
        UserSession userSession = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        new C63702ur(interfaceC11380iw, userSession).A0A(new C6PH(new C6PG("su_in_search_null_state", "", interfaceC11380iw.getModuleName())));
        FragmentActivity fragmentActivity = this.A01;
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0B(null, AbstractC35067Fce.A00().A00().A01("serp_suggested_users", fragmentActivity.getString(2131960982)));
        c140966Yy.A04();
    }

    public final void A03(C8JW c8jw, JIN jin) {
        UserSession userSession = this.A04;
        AbstractC31177DnL.A0o(this.A01, AbstractC86593tX.A02(null, c8jw, AbstractC41763Iee.A04(jin, AbstractC65993Txo.A00(MusicProduct.A09)), AbstractC166997dE.A0n()), userSession, "audio_page");
    }

    public final void A07(Hashtag hashtag, String str, String str2, int i) {
        AbstractC167017dG.A1N(hashtag, str);
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String moduleName = interfaceC11380iw.getModuleName();
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC25230BEn.A1b("HashtagFeedFragment.ARGUMENT_SEARCH_QUERY_TEXT", str));
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A04;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0B = "search_result";
        Fragment A01 = WE2.A01(userSession);
        A01.setArguments(WE2.A00(hashtag, moduleName, "search_result"));
        A0P.A0B(A00, A01);
        A0P.A09 = interfaceC11380iw;
        A0P.A07 = new C70590WdS(null, this, str2, str, moduleName, "hashtag", i);
        A0P.A04();
    }

    public final void A08(C69794Vvd c69794Vvd, String str, String str2, int i) {
        String str3;
        double doubleValue;
        boolean A1R = AbstractC167007dF.A1R(0, c69794Vvd, str);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A04;
        String A05 = c69794Vvd.A00().A05();
        C14360o3.A07(A05);
        new Venue().A06(A05);
        Venue A00 = c69794Vvd.A00();
        if (A00.A00.getName() != null) {
            str3 = A00.A00.getName();
        } else {
            str3 = "";
        }
        double[] dArr = new double[2];
        double d = 0.0d;
        if (A00.A00() == null) {
            doubleValue = 0.0d;
        } else {
            doubleValue = A00.A00().doubleValue();
        }
        dArr[0] = doubleValue;
        if (A00.A01() != null) {
            d = A00.A01().doubleValue();
        }
        dArr[A1R ? 1 : 0] = d;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        AbstractC68491VSw.A00(fragmentActivity, new C70590WdS(c69794Vvd, this, str2, str, interfaceC11380iw.getModuleName(), "place", i), interfaceC11380iw, userSession, A00, "search_result", str3, dArr, false);
    }

    public final void A09(MusicAttributionConfig musicAttributionConfig) {
        UserSession userSession = this.A04;
        INH A0C = AbstractC86593tX.A0C(C22P.A4G);
        String str = null;
        MusicAssetModel musicAssetModel = musicAttributionConfig.A02;
        if (musicAssetModel != null) {
            str = musicAssetModel.A0E;
        }
        A0C.A0G = str;
        A0C.A08 = musicAttributionConfig;
        Bundle A00 = A0C.A00();
        FragmentActivity fragmentActivity = this.A01;
        C6XJ A02 = C6XJ.A02(fragmentActivity, A00, userSession, TransparentModalActivity.class, "clips_camera");
        AbstractC31179DnN.A1S(A02);
        A02.A0C(fragmentActivity);
    }

    public final void A0A(User user, String str, String str2, int i) {
        AbstractC167017dG.A1N(user, str);
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String moduleName = interfaceC11380iw.getModuleName();
        UserSession userSession = this.A04;
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, user.getId(), AbstractC111324zv.A00(5255), moduleName);
        A01.A0H = str2;
        if (this.A0A) {
            Bundle A02 = AbstractC37303Gc4.A02(userSession, A01);
            FragmentActivity fragmentActivity = this.A01;
            C6XJ c6xj = new C6XJ(fragmentActivity, A02, userSession, ModalActivity.class, "profile");
            c6xj.A08();
            c6xj.A02 = interfaceC11380iw;
            c6xj.A01 = new C70590WdS(null, this, str2, str, interfaceC11380iw.getModuleName(), PublicKeyCredentialControllerUtility.JSON_KEY_USER, i);
            c6xj.A0C(fragmentActivity);
            return;
        }
        Fragment A022 = AbstractC31364DqT.A03().A01.A02(userSession, A01.A03());
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A01, userSession);
        A0P.A0B = "search_result";
        A0P.A0B(null, A022);
        A0P.A09 = interfaceC11380iw;
        A0P.A07 = new C70590WdS(null, this, str2, str, moduleName, PublicKeyCredentialControllerUtility.JSON_KEY_USER, i);
        A0P.A04();
    }
}
