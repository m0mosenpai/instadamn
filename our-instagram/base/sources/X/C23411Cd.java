package X;

import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.1Cd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23411Cd {
    public final TelephonyManager A00;
    public final C23391Cb A01;
    public final C23381Ca A02;
    public final InterfaceC08830cm A03;
    public final InterfaceC08830cm A04;

    public final void A0A(Executor executor, TelephonyCallback telephonyCallback) {
        String str;
        try {
            this.A00.registerTelephonyCallback(2, executor, telephonyCallback);
        } catch (IllegalStateException e) {
            e = e;
            str = "registerTelephonyCallbackIncludeLocationData: Caught IllegalStateException ";
            C0K8.A0J("SafeTelephonyManager", str, e);
        } catch (SecurityException e2) {
            e = e2;
            str = "registerTelephonyCallbackIncludeLocationData: Caught Security Exception ";
            C0K8.A0J("SafeTelephonyManager", str, e);
        }
    }

    private void A00(String str, String str2, boolean z) {
        InterfaceC08830cm interfaceC08830cm = this.A03;
        if (interfaceC08830cm != null) {
            ((C103754lu) interfaceC08830cm.get()).A01(null, "SafeTelephonyManager", str, str2, null, null, z);
        }
    }

    public static boolean A01(C23411Cd c23411Cd) {
        if (c23411Cd.A01 != null && Build.VERSION.SDK_INT >= 29) {
            return !C0L6.A06();
        }
        return false;
    }

    public static boolean A02(C23411Cd c23411Cd) {
        InterfaceC08830cm interfaceC08830cm = c23411Cd.A04;
        if (interfaceC08830cm != null) {
            C100004eN c100004eN = (C100004eN) interfaceC08830cm.get();
            if (c100004eN.A00.getApplicationInfo().targetSdkVersion >= 29) {
                return c100004eN.A02();
            }
            return c100004eN.A01();
        }
        return false;
    }

    public final int A03() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return this.A00.getDataNetworkType();
            } catch (SecurityException unused) {
                return 0;
            }
        }
        return this.A00.getNetworkType();
    }

    public final C23411Cd A05(int i) {
        return new C23411Cd(this.A00.createForSubscriptionId(i), this.A01, this.A02, this.A03, this.A04);
    }

    public final void A07(PhoneStateListener phoneStateListener, int i) {
        String str;
        if ((i & 1040) != 0 && (!A02(this) || A01(this))) {
            i = i & (-1025) & (-17);
        }
        if ((i & 1) != 0) {
            if (A01(this)) {
                i &= -2;
            } else {
                A02(this);
            }
        }
        try {
            this.A00.listen(phoneStateListener, i);
        } catch (IllegalStateException e) {
            e = e;
            str = "Failed to register listener due to exceeded limit: ";
            C0K8.A0F("SafeTelephonyManager", str, e);
        } catch (NullPointerException e2) {
            e = e2;
            str = "A null pointer exception is thrown here because a SELinux 'find' permission is required to access the access an object in the telelphony registry. ";
            C0K8.A0F("SafeTelephonyManager", str, e);
        } catch (SecurityException e3) {
            e = e3;
            str = "Listen: Caught Security Exception ";
            C0K8.A0F("SafeTelephonyManager", str, e);
        }
    }

    public final void A08(TelephonyCallback telephonyCallback) {
        this.A00.unregisterTelephonyCallback(telephonyCallback);
    }

    public final void A09(Executor executor, TelephonyCallback telephonyCallback) {
        String str;
        try {
            this.A00.registerTelephonyCallback(executor, telephonyCallback);
        } catch (IllegalStateException e) {
            e = e;
            str = "registerTelephonyCallback: Caught IllegalStateException ";
            C0K8.A0J("SafeTelephonyManager", str, e);
        } catch (SecurityException e2) {
            e = e2;
            str = "registerTelephonyCallback: Caught Security Exception ";
            C0K8.A0J("SafeTelephonyManager", str, e);
        }
    }

    public final void A0B(Executor executor, TelephonyManager.CellInfoCallback cellInfoCallback) {
        if (A01(this)) {
            A00("requestCellInfoUpdate", "CellDiagnostics", true);
            return;
        }
        A00("requestCellInfoUpdate", "CellDiagnostics", false);
        try {
            this.A00.requestCellInfoUpdate(executor, cellInfoCallback);
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    public C23411Cd(TelephonyManager telephonyManager, C23391Cb c23391Cb, C23381Ca c23381Ca, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        this.A00 = telephonyManager;
        this.A02 = c23381Ca;
        this.A01 = c23391Cb;
        this.A03 = interfaceC08830cm;
        this.A04 = interfaceC08830cm2;
    }

    public final CellLocation A04(String str) {
        if (A01(this)) {
            A00("getCellLocation", str, true);
        } else if (A02(this)) {
            A00("getCellLocation", str, false);
            try {
                TelephonyManager telephonyManager = this.A00;
                C0fZ c0fZ = C0fZ.$redex_init_class;
                if (C0T8.A01()) {
                    try {
                        ReadWriteLock readWriteLock = C0T8.A01;
                        readWriteLock.readLock().lock();
                        C0T7 c0t7 = C0T8.A00;
                        if (c0t7 != null) {
                            CellLocation DJN = c0t7.DJN(telephonyManager);
                            readWriteLock.readLock().unlock();
                            return DJN;
                        }
                        readWriteLock.readLock().unlock();
                        return null;
                    } catch (Throwable th) {
                        C0T8.A01.readLock().unlock();
                        throw th;
                    }
                }
                try {
                    return telephonyManager.getCellLocation();
                } catch (Exception unused) {
                    return null;
                }
            } catch (SecurityException unused2) {
                return null;
            }
        }
        return null;
    }

    public final List A06(String str) {
        if (A01(this)) {
            A00("getAllCellInfo", str, true);
            return null;
        }
        A00("getAllCellInfo", str, false);
        try {
            TelephonyManager telephonyManager = this.A00;
            C0fZ c0fZ = C0fZ.$redex_init_class;
            if (C0T8.A01()) {
                try {
                    ReadWriteLock readWriteLock = C0T8.A01;
                    readWriteLock.readLock().lock();
                    C0T7 c0t7 = C0T8.A00;
                    if (c0t7 != null) {
                        List DJL = c0t7.DJL(telephonyManager);
                        readWriteLock.readLock().unlock();
                        return DJL;
                    }
                    readWriteLock.readLock().unlock();
                    return null;
                } catch (Throwable th) {
                    C0T8.A01.readLock().unlock();
                    throw th;
                }
            }
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null) {
                return new ArrayList();
            }
            return allCellInfo;
        } catch (SecurityException unused) {
            return null;
        }
    }
}
