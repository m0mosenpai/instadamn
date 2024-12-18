package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.FCt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34351FCt {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, boolean z) {
        String str2;
        AbstractC167007dF.A1E(abstractC12990ll, 0, context);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "connect_with_friends");
        if (z) {
            str2 = "waterfall_log_in";
        } else if (interfaceC11380iw != null) {
            str2 = interfaceC11380iw.getModuleName();
        } else {
            str2 = null;
        }
        AbstractC25225BEi.A1O(A0f, str2);
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, "release_channel", AbstractC35274Fh9.A01());
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31179DnN.A1A(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str, A00);
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC35274Fh9.A06(A0f);
        AbstractC35274Fh9.A05(A0f);
        A0f.AAP("app_device_id", AbstractC31172DnG.A10(context));
        A0f.Cht();
    }
}
