package X;

import android.os.Handler;

/* renamed from: X.Wlg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70972Wlg implements InterfaceC54962fv {
    public final int A00;
    public final Object A01;

    public C70972Wlg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC54962fv
    public final void AHP() {
        Handler handler;
        Runnable runnableC71367Wsc;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C67883V0o c67883V0o = (C67883V0o) obj;
            handler = c67883V0o.A0E;
            runnableC71367Wsc = new RunnableC71369Wse(c67883V0o);
        } else {
            AbstractC67886V0t abstractC67886V0t = (AbstractC67886V0t) obj;
            if (abstractC67886V0t.isVisible() && !abstractC67886V0t.A09) {
                handler = abstractC67886V0t.A0D;
                runnableC71367Wsc = new RunnableC71367Wsc(abstractC67886V0t);
            } else {
                abstractC67886V0t.A0A = true;
                return;
            }
        }
        handler.post(runnableC71367Wsc);
    }
}
