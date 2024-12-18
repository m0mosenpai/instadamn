package X;

import com.facebook.realtime.common.appstate.AppStateGetter;
import com.facebook.realtime.common.appstate.AppStateSyncer;

/* renamed from: X.2cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53642cq implements InterfaceC12870lZ {
    public static InterfaceC09390do A02 = AbstractC09440dt.A01(C53652cr.A00);
    public final AppStateGetter A00;
    public final AppStateSyncer A01;

    public C53642cq(final C218914p c218914p) {
        AppStateGetter appStateGetter = new AppStateGetter(new InterfaceC53672ct() { // from class: X.2cs
            @Override // X.InterfaceC53672ct
            public final /* synthetic */ boolean isAppSuspended() {
                return false;
            }

            @Override // X.InterfaceC53672ct
            public final boolean isAppForegrounded() {
                return !C218914p.A08();
            }
        }, C53682cu.A00);
        this.A00 = appStateGetter;
        this.A01 = new AppStateSyncer(appStateGetter);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1164979185);
        this.A01.notifyForegroundStateChange(EnumC71673Jq.A01);
        C0f9.A0A(1436445369, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1715122237);
        this.A01.notifyForegroundStateChange(EnumC71673Jq.A02);
        C0f9.A0A(-1470158385, A03);
    }
}
