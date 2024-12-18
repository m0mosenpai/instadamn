package X;

import android.os.HandlerThread;

/* loaded from: classes8.dex */
public final class MHF extends C0YY implements InterfaceC16820sZ {
    public static final MHF A00 = new MHF();

    public MHF() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("SurfaceVideoViewController");
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        return handlerThread;
    }
}
