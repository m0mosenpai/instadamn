package X;

import android.net.NetworkInfo;
import com.facebook.realtime.common.appstate.AppStateGetter;
import com.facebook.realtime.common.appstate.AppStateSyncer;

/* renamed from: X.0xT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19430xT implements InterfaceC12870lZ, InterfaceC15680qO {
    public static InterfaceC09390do A02 = AbstractC09440dt.A01(C19150ww.A00);
    public final AppStateSyncer A00;
    public final AppStateGetter A01;

    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        this.A00.notifyNetworkStateChange(this.A01.mAppNetworkStateGetter.isNetworkConnected());
    }

    public C19430xT(final C218914p c218914p) {
        AppStateGetter appStateGetter = new AppStateGetter(new InterfaceC53672ct() { // from class: X.0sN
            @Override // X.InterfaceC53672ct
            public final /* synthetic */ boolean isAppSuspended() {
                return false;
            }

            @Override // X.InterfaceC53672ct
            public final boolean isAppForegrounded() {
                return !C218914p.A08();
            }
        }, C16680sL.A00);
        this.A01 = appStateGetter;
        this.A00 = new AppStateSyncer(appStateGetter);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1983405135);
        this.A00.notifyForegroundStateChange(EnumC71673Jq.A01);
        C0f9.A0A(-1972414089, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1535516313);
        this.A00.notifyForegroundStateChange(EnumC71673Jq.A02);
        C0f9.A0A(129865501, A03);
    }
}
