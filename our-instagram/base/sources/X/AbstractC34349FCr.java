package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.FCr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34349FCr {
    public static final void A00(AbstractC12990ll abstractC12990ll, String str, String str2) {
        double A00 = AbstractC31177DnL.A00(abstractC12990ll);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "cancel_facebook_auth");
        A0f.A7v("fb4a_installed", Boolean.valueOf(AbstractC23851Es.A03()));
        A0f.AAP("referrer", str2);
        AbstractC31177DnL.A1B(A0f, A00, A002);
        AbstractC31177DnL.A1G(A0f, "waterfall_id", C1Q9.A01(), A002);
        AbstractC31176DnK.A1K(A0f, A00);
        AbstractC31172DnG.A1N(A0f);
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC35274Fh9.A05(A0f);
        A0f.Cht();
    }
}
