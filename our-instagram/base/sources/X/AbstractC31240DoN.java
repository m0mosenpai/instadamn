package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.DoN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31240DoN {
    public static final void A00(C18920wW c18920wW, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        String str8;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "ig_push_token_registration");
        boolean z2 = false;
        if (A0f.isSampled()) {
            A0f.AAP(AbstractC31189DnY.A02(), str4);
            A0f.AAP("device_type", str5);
            if (z) {
                str8 = "success";
            } else {
                str8 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            A0f.AAP("result", str8);
            A0f.AAP("error", str2);
            A0f.AAP("error_class", str3);
            A0f.AAP("device_sub_type", str6);
            AbstractC31171DnF.A1B(A0f, str);
            z2 = true;
        }
        if (!str7.equals("unknown")) {
            if (z2) {
                A0f.AAP("trigger", str7);
            } else {
                return;
            }
        } else if (!z2) {
            return;
        }
        A0f.Cht();
    }
}
