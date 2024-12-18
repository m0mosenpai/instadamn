package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.Vu6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69711Vu6 {
    public long A00;
    public C18920wW A01;
    public String A02;
    public String A03;
    public String A04;
    public final VHb A05;

    public C69711Vu6(InterfaceC11380iw interfaceC11380iw, UserSession userSession, VEB veb, String str, String str2) {
        VHb vHb;
        C14360o3.A0B(userSession, 1);
        this.A02 = str;
        this.A04 = str2;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        VHb[] values = VHb.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                vHb = values[i];
                if (vHb.A00.equals(veb.A00)) {
                    break;
                } else {
                    i++;
                }
            } else {
                vHb = VHb.UNKNOWN;
                break;
            }
        }
        this.A05 = vHb;
    }

    public final void A00(String str) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "voting_info_center_action");
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.AAP("action_type", "click");
        A00.A8R(this.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.AAP("ig_media_id", this.A02);
        A00.AAP("utm_source", this.A04);
        A00.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A03);
        A00.Cht();
    }

    public final void A01(String str, boolean z) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "voting_info_center_action");
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.AAP("action_type", "impression");
        A00.A8R(this.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.AAP("ig_media_id", this.A02);
        A00.AAP("utm_source", this.A04);
        A00.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, this.A03);
        if (z) {
            long j = this.A00;
            if (j != 0) {
                A00.A9K("timespent_in_ms", Long.valueOf(System.currentTimeMillis() - j));
            }
        }
        A00.Cht();
    }
}
