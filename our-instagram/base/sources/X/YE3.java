package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class YE3 implements BusinessFlowAnalyticsLogger, CallerContextable {
    public static final String __redex_internal_original_name = "InspirationHubLogger";
    public String A00;
    public final C18920wW A01;
    public final String A02;

    public final void A03(String str) {
        String str2 = this.A00;
        if (str2 == null) {
            C14360o3.A0F("entryPoint");
            throw C00O.createAndThrow();
        }
        Cid(new Y7A(str, str2, null, null, null, null, null, null));
    }

    public final void A06(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str3, 2);
        A07(str, str2, str3, str4, null);
    }

    public final void A07(String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str3, 2);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put(AbstractC111324zv.A00(1255), str3);
        if (str4 != null) {
            A1I.put("media_index", str4);
        }
        if (str5 != null) {
            A1I.put("media_id", str5);
        }
        String str6 = this.A00;
        if (str6 == null) {
            C14360o3.A0F("entryPoint");
            throw C00O.createAndThrow();
        }
        Cm3(new Y7A(str, str6, str2, null, null, null, A1I, null));
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cid(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "inspiration_hub_cancel");
        if (A0f.isSampled()) {
            String str = y7a.A01;
            if (str != null) {
                Y7A.A06(A0f, y7a, str);
                MSW.A1U(A0f, this.A02);
                A00(A0f, y7a);
                A02(A0f, y7a);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cim(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjJ(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "inspiration_hub_fetch_data");
        if (A0f.isSampled()) {
            MSW.A1U(A0f, this.A02);
            String str = y7a.A01;
            if (str != null) {
                Y7A.A06(A0f, y7a, str);
                Y7A.A02(A0f, y7a);
                A01(A0f, y7a);
                A00(A0f, y7a);
                A02(A0f, y7a);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjK(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "inspiration_hub_fetch_data_error");
        if (A0f.isSampled()) {
            A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
            MSW.A1U(A0f, this.A02);
            Y7A.A08(A0f, y7a, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
            String str = y7a.A03;
            if (str != null) {
                A0f.AAP("error_message", str);
            }
            String str2 = y7a.A02;
            if (str2 != null) {
                A0f.AAP("error_identifier", str2);
            }
            A01(A0f, y7a);
            A00(A0f, y7a);
            A02(A0f, y7a);
            A0f.Cht();
        }
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjL(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "inspiration_hub_finish_step");
        if (A0f.isSampled()) {
            String str = y7a.A01;
            if (str != null) {
                Y7A.A06(A0f, y7a, str);
                MSW.A1U(A0f, this.A02);
                A01(A0f, y7a);
                A00(A0f, y7a);
                A02(A0f, y7a);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clj(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clo(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "inspiration_hub_start_step");
        if (A0f.isSampled()) {
            String str = y7a.A01;
            if (str != null) {
                Y7A.A06(A0f, y7a, str);
                MSW.A1U(A0f, this.A02);
                A01(A0f, y7a);
                A00(A0f, y7a);
                A02(A0f, y7a);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clu(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clv(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cm3(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "inspiration_hub_tap_component");
        if (A0f.isSampled()) {
            String str = y7a.A01;
            if (str != null) {
                Y7A.A06(A0f, y7a, str);
                Y7A.A08(A0f, y7a, "waterfall_id", this.A02);
                A01(A0f, y7a);
                A00(A0f, y7a);
                A02(A0f, y7a);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CmQ(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "inspiration_hub_view_component");
        if (A0f.isSampled()) {
            String str = y7a.A01;
            if (str != null) {
                Y7A.A06(A0f, y7a, str);
                Y7A.A08(A0f, y7a, "waterfall_id", this.A02);
                A01(A0f, y7a);
                A00(A0f, y7a);
                A02(A0f, y7a);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void A04(String str) {
        String str2 = this.A00;
        if (str2 != null) {
            CjL(new Y7A(str, str2, null, null, null, null, null, null));
        }
    }

    public final void A05(String str, String str2) {
        if (str2 != null) {
            this.A00 = str2;
        }
        String str3 = this.A00;
        if (str3 != null) {
            Clo(new Y7A(str, str3, null, null, null, null, null, null));
        }
    }

    public YE3(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A02 = obj;
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a) {
        Map A0B = y7a.A0B();
        if (A0B != null) {
            interfaceC02590Ai.A9M("selected_values", A0B);
        }
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a) {
        Map A09 = y7a.A09();
        if (A09 != null) {
            interfaceC02590Ai.A9M("available_options", A09);
        }
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a) {
        Map A0A = y7a.A0A();
        if (A0A != null) {
            interfaceC02590Ai.A9M("default_values", A0A);
        }
    }
}
