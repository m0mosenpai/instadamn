package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7bS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166007bS {
    public final C26025BfE A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C1M1 A04;
    public final InterfaceC11360iu A05;

    public C166007bS(C26025BfE c26025BfE, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        C14360o3.A0B(interfaceC60442pS, 1);
        C14360o3.A0B(c26025BfE, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c1m1, 4);
        this.A03 = interfaceC60442pS;
        this.A00 = c26025BfE;
        this.A02 = userSession;
        this.A04 = c1m1;
        this.A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        this.A05 = AbstractC11060iN.A00(userSession);
    }

    public final void A07(InterfaceC38371qR interfaceC38371qR, String str, String str2, String str3, int i, int i2) {
        boolean z;
        C14360o3.A0B(str2, 2);
        C19280xC A01 = A01(interfaceC38371qR, str2, str, str3, str3, "comment_like");
        C38321qM BQN = interfaceC38371qR.BQN();
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        if (interfaceC38371qR instanceof C38321qM) {
            z = AbstractC75423a9.A02(interfaceC38371qR, interfaceC60442pS);
        } else {
            z = false;
        }
        A03(A01, userSession, BQN, i, i2, z);
        String loggingInfoToken = interfaceC38371qR.BQN().A0C.getLoggingInfoToken();
        if (loggingInfoToken != null) {
            A01.A0C("ranking_info_token", loggingInfoToken);
        }
        this.A05.EHW(A01);
    }

    public final void A08(InterfaceC38371qR interfaceC38371qR, String str, String str2, String str3, int i, int i2) {
        boolean z;
        C14360o3.A0B(str2, 2);
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C82713mZ A03 = AbstractC82703mY.A03(userSession, interfaceC38371qR, interfaceC60442pS, "comment_unlike");
        A03.A4u = str2;
        A03.A4w = str;
        A03.A6r = str3;
        A03.A6Q = str3;
        A03.A1f = Boolean.valueOf(interfaceC60442pS.isOrganicEligible());
        if (!C5I7.A00(userSession, A03, interfaceC60442pS, C05F.A01)) {
            C19280xC A01 = A01(interfaceC38371qR, str2, str, str3, str3, "comment_unlike");
            C38321qM BQN = interfaceC38371qR.BQN();
            if (interfaceC38371qR instanceof C38321qM) {
                z = AbstractC75423a9.A02(interfaceC38371qR, interfaceC60442pS);
            } else {
                z = false;
            }
            A03(A01, userSession, BQN, i, i2, z);
            this.A05.EHW(A01);
        }
    }

    public final void A09(User user, String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(user, 1);
        C14360o3.A0B(str2, 2);
        C28238Cci c28238Cci = C28238Cci.A00;
        UserSession userSession = this.A02;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerPoint(309476254, "select_comment_screen_un_restrict_tap");
        c28238Cci.A01(userSession);
        C75R.A00.A0H(this.A01, user, "click", "unrestrict_option", str2, str3, str, null);
    }

    public final void A0A(User user, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(user, 2);
        C14360o3.A0B(str3, 3);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerPoint(309476254, "select_comment_screen_restrict_tap");
        C75R.A00.A0H(this.A01, user, "click", str, str3, str4, str2, null);
    }

    public final void A0C(String str, String str2, String str3, String str4) {
        C81663kb A0N;
        String C7q;
        C14360o3.A0B(str2, 1);
        Long l = null;
        if (str4 != null && (A0N = ((C2DU) C2JD.A00(this.A02)).A0N(str4)) != null && (C7q = A0N.C7q()) != null) {
            l = AbstractC003100w.A0k(10, C7q);
        }
        Map A0M = AbstractC16850sd.A0M(new C09530e4("nav_chain", C1QM.A00.A02.A00));
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_comment_cover_event");
        A00.AAP("media_id", str2);
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.A9M("extra_values", A0M);
        A00.AAP("action", null);
        A00.AAP("comment_id", str3);
        A00.A9K("thread_fbid", l);
        A00.AAP("entrypoint", this.A03.getModuleName());
        A00.Cht();
    }

    public static final int A00(Integer num, Integer num2) {
        if (num != null) {
            return num.intValue();
        }
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    private final C19280xC A01(InterfaceC38371qR interfaceC38371qR, String str, String str2, String str3, String str4, String str5) {
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C19280xC A00 = AbstractC82703mY.A03(userSession, interfaceC38371qR, interfaceC60442pS, str5).A00();
        C38321qM BQN = interfaceC38371qR.BQN();
        A00.A0C("c_pk", str);
        A00.A0C("ca_pk", str2);
        if (str3 != null) {
            A00.A0C("parent_c_pk", str3);
        }
        if (str4 != null) {
            A00.A0C("replied_c_pk", str4);
        }
        int ordinal = BQN.BRp().ordinal();
        int i = 2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i = -1;
            }
        } else {
            i = 1;
        }
        A00.A08(Integer.valueOf(i), "m_t");
        A00.A0C("inventory_source", BQN.A0C.BJN());
        String sessionId = this.A04.getSessionId();
        String A002 = AbstractC37315GcH.A00(9, 10, 32);
        if (sessionId != null) {
            A00.A0C(A002, sessionId);
        }
        A00.A09("is_media_organic", Boolean.valueOf(interfaceC60442pS.isOrganicEligible()));
        return A00;
    }

    public static final void A02(C166007bS c166007bS, String str, String str2, List list) {
        Map A0M = AbstractC16850sd.A0M(new C09530e4("nav_chain", C1QM.A00.A02.A00));
        C18920wW c18920wW = c166007bS.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_comment_management_action");
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.A9M("extra_values", A0M);
        A00.AAP(AbstractC37315GcH.A00(9, 10, 32), str2);
        A00.AAP("selected_comment_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", list, null));
        A00.Cht();
    }

    public static final void A03(C19280xC c19280xC, UserSession userSession, C38321qM c38321qM, int i, int i2, boolean z) {
        if (z) {
            c19280xC.A0C("action", c38321qM.A0C.AZ3());
            c19280xC.A0C("tracking_token", AbstractC41071vF.A0F(userSession, c38321qM));
            c19280xC.A0C("ad_id", AbstractC41071vF.A07(userSession, c38321qM));
        }
        if (c38321qM.A5M() && i != -1) {
            c19280xC.A08(Integer.valueOf(i), "carousel_index");
            C38321qM A1e = c38321qM.A1e(0);
            if (A1e != null) {
                c19280xC.A0C("carousel_cover_media_id", A1e.getId());
                C38321qM A1e2 = c38321qM.A1e(i);
                if (A1e2 != null) {
                    c19280xC.A0C("carousel_media_id", A1e2.getId());
                    c19280xC.A0C("main_feed_carousel_starting_media_id", c38321qM.A0C.BPW());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (i2 >= 0) {
            c19280xC.A08(Integer.valueOf(i2), "m_ix");
        }
    }

    public final void A05(C169287h2 c169287h2) {
        C18920wW c18920wW = this.A01;
        String A00 = AbstractC43591JPw.A00(72);
        String str = c169287h2.A02;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_warning_system_undo");
        A002.AAP("source_of_action", A00);
        A002.AAP(MSV.A00(122), str);
        A002.A7v(MSV.A00(104), true);
        A002.A9M("extra_values", hashMap);
        A002.Cht();
    }

    public final void A06(C38321qM c38321qM, Integer num, Integer num2, Integer num3) {
        int i;
        UserSession userSession = this.A02;
        C1M1 c1m1 = this.A04;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        C32U.A0P(userSession, c38321qM, interfaceC60442pS, null, c1m1, null, null, Integer.valueOf(A00(num2, num3)), null, "see_translation", null, null, null, null, i);
    }

    public final void A0B(String str, int i) {
        InterfaceC11360iu interfaceC11360iu = this.A05;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C19280xC A00 = C19280xC.A00(interfaceC60442pS, str);
        A00.A08(Integer.valueOf(i), "count");
        A00.A09("is_media_organic", Boolean.valueOf(interfaceC60442pS.isOrganicEligible()));
        interfaceC11360iu.EHW(A00);
    }

    public final void A0D(String str, String str2, String str3, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_pin_comment_action");
        A00.AAP("media_id", str3);
        A00.AAP("comment_id", str2);
        A00.A7v("is_self_comment", Boolean.valueOf(z));
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.A9M("extra_values", hashMap);
        A00.AAP("module_name", this.A03.getModuleName());
        A00.Cht();
    }

    public final String A04() {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        Map A0M = AbstractC16850sd.A0M(new C09530e4("nav_chain", C1QM.A00.A02.A00));
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_comment_management_start_session");
        A00.AAP(AbstractC37315GcH.A00(9, 10, 32), obj);
        A00.A9M("extra_values", A0M);
        A00.Cht();
        return obj;
    }
}
