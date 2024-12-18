package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class M5C implements Runnable {
    public final /* synthetic */ C8Y3 A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public M5C(C8Y3 c8y3, List list, List list2) {
        this.A00 = c8y3;
        this.A02 = list;
        this.A01 = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01(this.A02, this.A01);
    }
}
