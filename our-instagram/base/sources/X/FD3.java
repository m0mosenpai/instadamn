package X;

import com.instagram.common.api.base.CacheBehaviorLogger;

/* loaded from: classes6.dex */
public abstract class FD3 {
    public static final void A00(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4) {
        double A00 = AbstractC31177DnL.A00(abstractC12990ll);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "nux_step_error");
        if (A0f.isSampled()) {
            AbstractC31177DnL.A1B(A0f, A00, A002);
            A0f.AAP(CacheBehaviorLogger.SOURCE, str2);
            AbstractC31178DnM.A19(A0f, str);
            AbstractC31176DnK.A1K(A0f, A00);
            AbstractC31177DnL.A1G(A0f, "module", "waterfall_log_in", A002);
            AbstractC35274Fh9.A05(A0f);
            A0f.AAP("error", str3);
            A0f.AAP("extra", str4);
            A0f.Cht();
        }
    }
}
