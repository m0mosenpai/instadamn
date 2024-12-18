package X;

import com.facebook.msys.mcs.SyncHandler;

/* renamed from: X.69z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1352469z implements InterfaceC1352169w {
    @Override // X.InterfaceC1352169w
    public final /* synthetic */ void Epz() {
    }

    @Override // X.InterfaceC1352169w
    public final /* bridge */ /* synthetic */ void EgM(Object obj) {
        C1351969u c1351969u = (C1351969u) obj;
        C14360o3.A0B(c1351969u, 0);
        SyncHandler syncHandler = c1351969u.A01.getSyncHandler();
        C42201xA c42201xA = C1334460n.A06;
        if (syncHandler != null) {
            syncHandler.enableTraceType(2);
            syncHandler.enableTraceType(1);
            syncHandler.enableTraceType(10);
            syncHandler.enableTraceType(13);
            syncHandler.enableTraceType(14);
            syncHandler.enableTraceType(15);
            syncHandler.enableTraceType(16);
            syncHandler.enableTraceType(17);
            return;
        }
        C0K8.A0E("IgMsysMailboxProvider", "SyncHandler was null");
    }
}
