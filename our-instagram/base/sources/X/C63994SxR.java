package X;

/* renamed from: X.SxR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63994SxR implements InterfaceC48212Jk {
    public final int A00;

    public C63994SxR(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        String str;
        if (this.A00 == 0) {
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            C0K8.A0C("com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.base.ARClassBenchmark", str);
        }
    }
}
