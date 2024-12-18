package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;

/* renamed from: X.Fay, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34973Fay {
    public final void A01(AbstractC12990ll abstractC12990ll, Integer num) {
        String str;
        C14360o3.A0B(abstractC12990ll, 0);
        if (num == C05F.A00 || num == C05F.A01) {
            AbstractC166987dD.A0y().A0G(AbstractC25231BEo.A0p());
        }
        switch (num.intValue()) {
            case 0:
                str = "identity_switcher";
                break;
            case 1:
                str = "settings";
                break;
            default:
                str = "reg_existing_login";
                break;
        }
        A00(abstractC12990ll, "spc", "identity_switcher", "registration_start", null, AbstractC167017dG.A0r(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
    }

    public static final void A00(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, HashMap hashMap) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "caa_acquisition_client_ig_event");
        if (A0f.isSampled()) {
            C17280tP A0y = AbstractC166987dD.A0y();
            C0Zx c0Zx = new C0Zx();
            AbstractC31179DnN.A1B(c0Zx, "registration_flow_state", str, str2, "registration_funnel");
            c0Zx.A05(AbstractC111324zv.A00(2324), null);
            c0Zx.A06(AbstractC43591JPw.A00(77), str4);
            c0Zx.A06("logged_in_identifier", null);
            c0Zx.A06("logged_out_identifier", null);
            c0Zx.A08("extra_client_data", hashMap);
            c0Zx.A06("waterfall_id", A0y.A08());
            c0Zx.A06("event_request_id", null);
            A0f.AAQ(c0Zx, "core");
            C0Zx c0Zx2 = new C0Zx();
            c0Zx2.A06("reg_instance", "");
            c0Zx2.A06(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str3);
            A0f.AAQ(c0Zx2, "acquisition_client_params");
            A0f.Cht();
        }
    }
}
