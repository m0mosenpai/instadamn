package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.FbR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34994FbR {
    public static final C34994FbR A00 = new Object();

    public final void A00(AbstractC12990ll abstractC12990ll, String str) {
        AbstractC167017dG.A1N(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "choose_facebook");
        AbstractC31172DnG.A1O(A0f);
        AbstractC31177DnL.A1B(A0f, A01, A002);
        AbstractC31177DnL.A1G(A0f, "waterfall_id", C1Q9.A01(), A002);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, "flow", null);
        A0f.Cht();
    }
}
