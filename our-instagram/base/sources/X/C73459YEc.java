package X;

import com.facebook.falco.fabric.FFSingletonJNILogger;

/* renamed from: X.YEc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73459YEc implements InterfaceC14070nX {
    public final /* synthetic */ C5FR A00;

    public C73459YEc(C5FR c5fr) {
        this.A00 = c5fr;
    }

    @Override // X.InterfaceC14070nX
    public final void DMT() {
        FFSingletonJNILogger.resumeTasksForInternalUse();
    }

    @Override // X.InterfaceC14070nX
    public final void DMU() {
        FFSingletonJNILogger.pauseTasksForInternalUse();
    }
}
