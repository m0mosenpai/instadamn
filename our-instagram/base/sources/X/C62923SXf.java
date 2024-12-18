package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SXf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62923SXf {
    public final Context A00;

    private final C63597Sq4 A00() {
        C63597Sq4 c63597Sq4 = new C63597Sq4(this.A00);
        if (c63597Sq4.isAvailableOnDevice()) {
            return c63597Sq4;
        }
        return null;
    }

    public final InterfaceC58096PpL A01() {
        C63597Sq4 c63597Sq4;
        String string;
        if (Build.VERSION.SDK_INT < 34 || (c63597Sq4 = A00()) == null) {
            c63597Sq4 = null;
            Context context = this.A00;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
            ArrayList A1E = AbstractC166987dD.A1E();
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (((PackageItemInfo) serviceInfo).metaData != null && (string = ((PackageItemInfo) serviceInfo).metaData.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                        A1E.add(string);
                    }
                }
            }
            List A0a = AbstractC001800i.A0a(A1E);
            if (!A0a.isEmpty()) {
                Iterator it = A0a.iterator();
                InterfaceC58096PpL interfaceC58096PpL = null;
                while (it.hasNext()) {
                    try {
                        Object newInstance = Class.forName(AbstractC166987dD.A1B(it)).getConstructor(Context.class).newInstance(context);
                        C14360o3.A0C(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                        InterfaceC58096PpL interfaceC58096PpL2 = (InterfaceC58096PpL) newInstance;
                        if (!interfaceC58096PpL2.isAvailableOnDevice()) {
                            continue;
                        } else if (interfaceC58096PpL == null) {
                            interfaceC58096PpL = interfaceC58096PpL2;
                        }
                    } catch (Throwable unused) {
                    }
                }
                return interfaceC58096PpL;
            }
        }
        return c63597Sq4;
    }

    public C62923SXf(Context context) {
        this.A00 = context;
    }
}
