package X;

import android.os.HandlerThread;

/* renamed from: X.4Rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95584Rs extends C0YY implements InterfaceC16820sZ {
    public static final C95584Rs A00 = new C95584Rs();

    public C95584Rs() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("WorkerThreadManager_VideoPlayerWorkerThread");
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        AbstractC95574Rr.A00 = true;
        return handlerThread;
    }
}
