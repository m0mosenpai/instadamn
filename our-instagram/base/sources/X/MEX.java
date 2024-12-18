package X;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes8.dex */
public final class MEX extends C0YY implements InterfaceC16820sZ {
    public static final MEX A00 = new MEX();

    public MEX() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("BloksScriptDispatchLowPriThread", 10);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
