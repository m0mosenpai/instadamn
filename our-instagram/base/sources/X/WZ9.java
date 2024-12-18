package X;

import android.os.Build;

/* loaded from: classes11.dex */
public final class WZ9 implements InterfaceC71972XDf {
    @Override // X.InterfaceC71972XDf
    public final boolean AG6() {
        return false;
    }

    @Override // X.InterfaceC71972XDf
    public final boolean AG7() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.XEh] */
    @Override // X.InterfaceC71972XDf
    public final InterfaceC71993XEh AMZ(C69199VjS c69199VjS) {
        AbstractC1126356r.A07(!c69199VjS.A03, "PlatformBasedCodecMuxer cannot be used to produce fragMp4");
        return new Object();
    }

    @Override // X.InterfaceC71972XDf
    public final boolean Ei3() {
        return AbstractC58319PtB.A1P(Build.VERSION.SDK_INT, 29);
    }
}
