package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.TNj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64627TNj implements Runnable {
    public final /* synthetic */ InterfaceC65542TmH A00;
    public final /* synthetic */ Q21 A01;

    public RunnableC64627TNj(InterfaceC65542TmH interfaceC65542TmH, Q21 q21) {
        this.A01 = q21;
        this.A00 = interfaceC65542TmH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q21 q21 = this.A01;
        CopyOnWriteArraySet copyOnWriteArraySet = q21.A0C;
        InterfaceC65542TmH interfaceC65542TmH = this.A00;
        if (copyOnWriteArraySet.contains(interfaceC65542TmH)) {
            try {
                interfaceC65542TmH.onHostResume();
            } catch (RuntimeException e) {
                q21.A0D(e);
            }
        }
    }
}
