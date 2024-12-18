package X;

import android.os.Debug;

/* renamed from: X.Svo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63913Svo implements InterfaceC100084eW {
    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "memory";
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        sn2.A09 = memoryInfo;
    }
}
