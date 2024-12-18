package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService$Stub$Proxy;
import androidx.browser.customtabs.CustomTabsClient$2;

/* renamed from: X.SkB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractServiceConnectionC63432SkB implements ServiceConnection {
    public Context A00;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.Rqi] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.support.customtabs.ICustomTabsService$Stub$Proxy, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ICustomTabsService iCustomTabsService;
        if (this.A00 != null) {
            if (iBinder == null) {
                iCustomTabsService = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.A00);
                if (queryLocalInterface != null && (queryLocalInterface instanceof ICustomTabsService)) {
                    iCustomTabsService = (ICustomTabsService) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    int A03 = C0f9.A03(1358281000);
                    obj.A00 = iBinder;
                    C0f9.A0A(1189365140, A03);
                    iCustomTabsService = obj;
                }
            }
            SWZ swz = new SWZ(componentName, this.A00, iCustomTabsService, this);
            C58727Q5i c58727Q5i = (C58727Q5i) this;
            try {
                ICustomTabsService$Stub$Proxy iCustomTabsService$Stub$Proxy = (ICustomTabsService$Stub$Proxy) swz.A02;
                int A032 = C0f9.A03(-88062666);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.A00);
                    obtain.writeLong(0L);
                    AbstractC167027dH.A0k(iCustomTabsService$Stub$Proxy.A00, obtain, obtain2, 2);
                    obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    C0f9.A0A(-1467466138, A032);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    C0f9.A0A(-1092528197, A032);
                    throw th;
                }
            } catch (RemoteException unused) {
            }
            THA tha = c58727Q5i.A01;
            CustomTabsClient$2 customTabsClient$2 = new CustomTabsClient$2(new Object(), swz);
            SFE sfe = null;
            try {
                ICustomTabsService iCustomTabsService2 = swz.A02;
                ICustomTabsService$Stub$Proxy iCustomTabsService$Stub$Proxy2 = (ICustomTabsService$Stub$Proxy) iCustomTabsService2;
                int A033 = C0f9.A03(113561412);
                Parcel obtain3 = Parcel.obtain();
                Parcel obtain4 = Parcel.obtain();
                try {
                    obtain3.writeInterfaceToken(ICustomTabsService.A00);
                    obtain3.writeStrongInterface(customTabsClient$2);
                    IBinder iBinder2 = iCustomTabsService$Stub$Proxy2.A00;
                    boolean z = false;
                    if (AbstractC58322PtE.A05(iBinder2, obtain3, obtain4, 3) != 0) {
                        z = true;
                    }
                    obtain4.recycle();
                    obtain3.recycle();
                    C0f9.A0A(-134261549, A033);
                    if (z) {
                        sfe = new SFE(swz.A00, customTabsClient$2, iCustomTabsService2);
                    }
                } catch (Throwable th2) {
                    obtain4.recycle();
                    obtain3.recycle();
                    C0f9.A0A(1965144289, A033);
                    throw th2;
                }
            } catch (RemoteException unused2) {
            }
            tha.A02 = sfe;
            if (sfe != null) {
                C63165SeP c63165SeP = new C63165SeP();
                SFE sfe2 = tha.A02;
                Intent intent = c63165SeP.A01;
                intent.setPackage(sfe2.A00.getPackageName());
                IBinder asBinder = sfe2.A01.asBinder();
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBinder("android.support.customtabs.extra.SESSION", asBinder);
                intent.putExtras(A0b);
                c63165SeP.A01().A00(tha.A00, c58727Q5i.A00.A00());
                tha.A03 = true;
                return;
            }
            AbstractServiceConnectionC63432SkB abstractServiceConnectionC63432SkB = tha.A01;
            if (abstractServiceConnectionC63432SkB != null) {
                tha.A00.unbindService(abstractServiceConnectionC63432SkB);
                tha.A02 = null;
                tha.A01 = null;
            }
            THA.A00(tha);
            return;
        }
        throw AbstractC166987dD.A14("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
