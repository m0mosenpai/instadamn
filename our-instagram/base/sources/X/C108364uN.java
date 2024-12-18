package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.4uN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108364uN {
    public static C108404uR A00;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.4uO, java.lang.Object] */
    public static synchronized C108404uR A00(final Context context) {
        C108404uR c108404uR;
        synchronized (C108364uN.class) {
            c108404uR = A00;
            if (c108404uR == null) {
                c108404uR = new C108404uR(context, (WifiManager) context.getApplicationContext().getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI), new InterfaceC108394uQ(context) { // from class: X.4uP
                    public final Context A00;

                    @Override // X.InterfaceC108394uQ
                    public final boolean hasPermission(String str) {
                        return AbstractC23451Ch.A07(this.A00, "android.permission.ACCESS_WIFI_STATE");
                    }

                    {
                        this.A00 = context;
                    }
                }, new Object());
                A00 = c108404uR;
            }
        }
        return c108404uR;
    }
}
