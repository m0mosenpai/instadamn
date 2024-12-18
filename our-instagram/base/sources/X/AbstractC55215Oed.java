package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Oed, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55215Oed {
    public static void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_cg_create_fundraiser_begin");
        A0f.AAP("source_name", "PRE_LIVE");
        A0f.A8R(EnumC72419XdP.IG_LIVE_FOR_CHARITY, "fundraiser_type");
        A0f.Cht();
    }

    public static void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_cg_add_standalone_fundraiser_pre_live");
        A0f.AAP("source_name", "PRE_LIVE");
        if (str != null) {
            A0f.A9K("fundraiser_id", AbstractC25228BEl.A13(str));
        }
        A0f.Cht();
    }

    public static void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Exception exc, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_cg_fundraiser_exception");
        if (A0f.isSampled()) {
            String A0m = AbstractC50522MSa.A0m(exc);
            if (str != null) {
                A0f.A9K("sticker_id", AbstractC25228BEl.A13(str));
            }
            A0f.AAP("exception_name", MSY.A0h(exc));
            A0f.AAP("exception_message", exc.getMessage());
            A0f.AAP("exception_stack", A0m);
            A0f.Cht();
        }
    }

    public static void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_cg_create_fundraiser_begin");
        A0f.AAP("source_name", str);
        A0f.A8R(EnumC72419XdP.IG_STICKER_FOR_CHARITY, "fundraiser_type");
        A0f.Cht();
    }

    public static void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("nonprofit_id", str2);
        A08(interfaceC11380iw, userSession, "fundraiser_creation_nudge_dialog_add_fundraiser", str, null, A1G);
    }

    public static void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("nonprofit_id", str2);
        A08(interfaceC11380iw, userSession, "fundraiser_creation_nudge_dialog_cancel", str, null, A1G);
    }

    public static void A06(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("nonprofit_id", str2);
        A07(interfaceC11380iw, userSession, "fundraiser_creation_nudge_dialog", str, null, null, A1G);
    }

    public static void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_cg_generic_impression");
        A0f.AAP("feature", str);
        A0f.AAP("source_name", str2);
        if (str3 != null) {
            A0f.A9K(AbstractC111324zv.A00(3125), AbstractC25228BEl.A13(str3));
        }
        if (str4 != null) {
            A0f.A9K("fundraiser_id", AbstractC25228BEl.A13(str4));
        }
        if (map != null) {
            A0f.A9M("attributes", map);
        }
        A0f.Cht();
    }

    public static void A08(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_cg_generic_click");
        A0f.AAP("feature", str);
        A0f.AAP("source_name", str2);
        if (str3 != null) {
            A0f.A9K("fundraiser_id", AbstractC25228BEl.A13(str3));
        }
        if (map != null) {
            A0f.A9M("attributes", map);
        }
        A0f.Cht();
    }

    public static void A09(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("nonprofit_id", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        A07(interfaceC11380iw, userSession, "fundraiser_creation_nudge", str, null, null, A1G);
    }
}
