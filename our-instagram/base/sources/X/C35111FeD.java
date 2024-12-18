package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.FeD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35111FeD {
    public static final C35111FeD A00 = new Object();

    public static final void A00(AbstractC12990ll abstractC12990ll, Boolean bool, String str) {
        AbstractC167017dG.A1N(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "skip_button_tapped");
        AbstractC31177DnL.A1B(A0f, A01, A002);
        AbstractC31179DnN.A1A(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str, A002);
        AbstractC35274Fh9.A0D(A0f, "containermodule", "waterfall_log_in");
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, "flow", null);
        A0f.A7v("is_standalone", bool);
        A0f.Cht();
    }
}
