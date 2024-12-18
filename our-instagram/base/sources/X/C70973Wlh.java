package X;

import android.os.Handler;

/* renamed from: X.Wlh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70973Wlh implements InterfaceC54962fv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70973Wlh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC54962fv
    public final void AHP() {
        Handler handler;
        Runnable runnableC71366Wsb;
        int i = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 0:
                ((C54685ODl) obj).A00 = null;
                LLk.A0K(((C54413O2t) this.A01).A00);
                return;
            case 1:
                V1C v1c = (V1C) obj;
                if (!v1c.isVisible() || v1c.A04) {
                    return;
                }
                handler = (Handler) this.A01;
                runnableC71366Wsb = new RunnableC71366Wsb(v1c);
                handler.post(runnableC71366Wsb);
                return;
            default:
                V13 v13 = (V13) obj;
                if (v13.isVisible() && !v13.A03) {
                    handler = (Handler) this.A01;
                    runnableC71366Wsb = new RunnableC71368Wsd(v13);
                    handler.post(runnableC71366Wsb);
                    return;
                }
                v13.A04 = true;
                return;
        }
    }
}
