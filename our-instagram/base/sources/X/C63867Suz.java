package X;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: X.Suz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63867Suz implements InterfaceC65633Tpu {
    public final Context A00;
    public final InterfaceC65327Ti8 A01;

    @Override // X.InterfaceC65538TmA
    public final void onDestroy() {
    }

    @Override // X.InterfaceC65538TmA
    public final void onStart() {
        boolean z;
        SWS A00 = SWS.A00(this.A00);
        InterfaceC65327Ti8 interfaceC65327Ti8 = this.A01;
        synchronized (A00) {
            java.util.Set set = A00.A02;
            set.add(interfaceC65327Ti8);
            if (!A00.A00 && !set.isEmpty()) {
                SHF shf = A00.A01;
                InterfaceC65610To1 interfaceC65610To1 = shf.A03;
                shf.A00 = AbstractC167007dF.A1W(((ConnectivityManager) interfaceC65610To1.get()).getActiveNetwork());
                try {
                    ((ConnectivityManager) interfaceC65610To1.get()).registerDefaultNetworkCallback(shf.A01);
                    z = true;
                } catch (RuntimeException e) {
                    if (android.util.Log.isLoggable("ConnectivityMonitor", 5)) {
                        android.util.Log.w("ConnectivityMonitor", MSV.A00(768), e);
                    }
                    z = false;
                }
                A00.A00 = z;
            }
        }
    }

    @Override // X.InterfaceC65538TmA
    public final void onStop() {
        SWS A00 = SWS.A00(this.A00);
        InterfaceC65327Ti8 interfaceC65327Ti8 = this.A01;
        synchronized (A00) {
            java.util.Set set = A00.A02;
            set.remove(interfaceC65327Ti8);
            if (A00.A00 && set.isEmpty()) {
                SHF shf = A00.A01;
                ((ConnectivityManager) shf.A03.get()).unregisterNetworkCallback(shf.A01);
                A00.A00 = false;
            }
        }
    }

    public C63867Suz(Context context, InterfaceC65327Ti8 interfaceC65327Ti8) {
        this.A00 = context.getApplicationContext();
        this.A01 = interfaceC65327Ti8;
    }
}
