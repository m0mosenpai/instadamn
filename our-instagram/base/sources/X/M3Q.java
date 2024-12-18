package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class M3Q implements Runnable {
    public final /* synthetic */ C8Y3 A00;
    public final /* synthetic */ List A01;

    public M3Q(C8Y3 c8y3, List list) {
        this.A00 = c8y3;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01(null, this.A01);
    }
}
