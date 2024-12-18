package X;

import java.util.List;

/* renamed from: X.Apo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24283Apo implements Runnable {
    public final /* synthetic */ C175407rG A00;

    public RunnableC24283Apo(C175407rG c175407rG) {
        this.A00 = c175407rG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = AbstractC175037qd.A00;
        AbstractC175037qd.A00(1, 0, AnonymousClass001.A0g("ConcurrentFrontBackController", ": ", "Preview stopped for at least one of the cameras"));
        List list = this.A00.A0E.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC174807qG) list.get(i2)).Dal();
        }
    }
}
