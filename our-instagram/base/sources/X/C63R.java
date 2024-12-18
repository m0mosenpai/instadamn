package X;

import android.os.HandlerThread;

/* renamed from: X.63R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63R implements C1LY {
    public static final C63R A00 = new C63R();

    @Override // X.C1LY
    public final /* bridge */ /* synthetic */ Object get() {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_ReadWriteThread", 10);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        return handlerThread;
    }
}
