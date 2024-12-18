package X;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUK implements Callable {
    public final /* synthetic */ C1Dk A00;
    public final /* synthetic */ C40701ud A01;

    public PUK(C1Dk c1Dk, C40701ud c40701ud) {
        this.A01 = c40701ud;
        this.A00 = c1Dk;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Ke, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ?? obj = new Object();
        NM3 nm3 = new NM3(obj);
        C40701ud c40701ud = this.A01;
        C1Dk c1Dk = this.A00;
        C40851us A00 = C40701ud.A00(c40701ud, c1Dk.getSchema());
        C40851us.A00(new C55661Onm(nm3, 7), new MV7(nm3, 7), c1Dk, A00, C1M8.A01, A00.A04);
        return obj.get();
    }
}
