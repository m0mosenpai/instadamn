package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wuc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71476Wuc implements Runnable {
    public final /* synthetic */ V11 A00;
    public final /* synthetic */ C23031Ai A01;

    public RunnableC71476Wuc(V11 v11, C23031Ai c23031Ai) {
        this.A01 = c23031Ai;
        this.A00 = v11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC19610xo ARD = this.A01.A01.ARD();
        ARD.E77("has_seen_hec_appeal_tooltip", true);
        ARD.apply();
        V11 v11 = this.A00;
        C5SW c5sw = v11.A07;
        if (c5sw != null) {
            c5sw.A07((UserSession) v11.A0N.getValue());
        }
    }
}
