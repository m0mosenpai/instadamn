package X;

import java.util.List;
import java.util.TimerTask;

/* renamed from: X.M9z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50106M9z extends TimerTask {
    public final /* synthetic */ C51762Yz A00;
    public final /* synthetic */ List A01;

    public C50106M9z(C51762Yz c51762Yz, List list) {
        this.A00 = c51762Yz;
        this.A01 = list;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.A00.A03(new DRQ(this.A01, 35));
    }
}
