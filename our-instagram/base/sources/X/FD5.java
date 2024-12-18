package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* loaded from: classes6.dex */
public abstract class FD5 {
    public static final void A00(AbstractC12990ll abstractC12990ll, String str) {
        double A00 = AbstractC31177DnL.A00(abstractC12990ll);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "password_reset_attempt");
        AbstractC31179DnN.A18(A0f, A00, A002);
        AbstractC31175DnJ.A0y(A0f);
        AbstractC31172DnG.A1N(A0f);
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.Cht();
    }
}
