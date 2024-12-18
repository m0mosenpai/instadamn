package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.0qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15840qe {
    public static C108404uR A00;

    public static final synchronized C108404uR A00(final Context context) {
        C108404uR c108404uR;
        synchronized (C15840qe.class) {
            c108404uR = A00;
            if (c108404uR == null) {
                Object systemService = context.getApplicationContext().getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI);
                C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                c108404uR = new C108404uR(context, (WifiManager) systemService, new InterfaceC108394uQ(context) { // from class: X.0qd
                    public final Context A00;

                    @Override // X.InterfaceC108394uQ
                    public final boolean hasPermission(String str) {
                        return AbstractC23451Ch.A07(this.A00, "android.permission.ACCESS_WIFI_STATE");
                    }

                    {
                        this.A00 = context;
                    }
                }, new C72820Xnm().A00());
                A00 = c108404uR;
            }
            if (c108404uR == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return c108404uR;
    }
}
