package X;

import java.util.List;

/* renamed from: X.Apn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24282Apn implements Runnable {
    public final /* synthetic */ C175407rG A00;

    public RunnableC24282Apn(C175407rG c175407rG) {
        this.A00 = c175407rG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = AbstractC175037qd.A00;
        AbstractC175037qd.A00(1, 0, AnonymousClass001.A0g("ConcurrentFrontBackController", ": ", "Preview started for both cameras"));
        List list = this.A00.A0D.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC184558Gw) list.get(i2)).Dak();
        }
    }
}
