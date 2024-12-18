package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import java.util.HashMap;

/* renamed from: X.OaZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55079OaZ {
    public static final C55079OaZ A00 = new Object();

    public static final void A00(C18920wW c18920wW, String str, String str2, boolean z) {
        Integer num;
        String str3;
        HashMap A11 = AbstractC31174DnI.A11(str, 1);
        AbstractC50523MSb.A1S(A11);
        if (z) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        if (1 - num.intValue() != 0) {
            str3 = "v2_customizable";
        } else {
            str3 = "v2_not_customizable";
        }
        A11.put("version", str3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_wellbeing_limited_interactions_impression");
        MSX.A1H(A0f, str);
        AbstractC50523MSb.A12(A0f, "surface", str2, A11);
    }

    public final void A01(LimitedInteractionsVersions limitedInteractionsVersions, C18920wW c18920wW, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC50523MSb.A1S(A1G);
        AbstractC50523MSb.A1F(limitedInteractionsVersions, A1G);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_wellbeing_limited_interactions_action");
        MSX.A1H(A0f, str);
        AbstractC50523MSb.A12(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2, A1G);
    }

    public final void A02(LimitedInteractionsVersions limitedInteractionsVersions, C18920wW c18920wW, String str, boolean z) {
        Integer num;
        String str2;
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC50523MSb.A1S(A1G);
        AbstractC50523MSb.A1F(limitedInteractionsVersions, A1G);
        if (z) {
            num = C05F.A04;
        } else {
            num = C05F.A05;
        }
        if (12 - num.intValue() != 0) {
            str2 = "turn_off";
        } else {
            str2 = "turn_on";
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_wellbeing_limited_interactions_action");
        MSX.A1H(A0f, str);
        AbstractC50523MSb.A12(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2, A1G);
    }
}
