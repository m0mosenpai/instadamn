package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.3gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79403gn extends C0YY implements InterfaceC16820sZ {
    public static final C79403gn A00 = new C79403gn();

    public C79403gn() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("ThreadUtilsBackgroundHandler", 5);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
