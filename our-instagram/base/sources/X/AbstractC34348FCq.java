package X;

import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.FCq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34348FCq {
    public static final void A00(AbstractC12990ll abstractC12990ll, String str) {
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "attempt_read_email_for_prefill");
        AbstractC31179DnN.A16(A0f, A01, A00);
        AbstractC31177DnL.A1G(A0f, CacheBehaviorLogger.SOURCE, str, A00);
        AbstractC31178DnM.A19(A0f, "email");
        AbstractC35274Fh9.A04(A0f);
        AbstractC31172DnG.A1O(A0f);
        A0f.Cht();
    }
}
