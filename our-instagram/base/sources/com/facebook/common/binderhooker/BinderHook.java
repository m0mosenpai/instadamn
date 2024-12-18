package com.facebook.common.binderhooker;

import X.C03290Dn;
import X.C03300Dp;
import X.C03720In;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.common.activitythreadhook.ActivityThreadBinderHooker$ApplicationThreadBinderHook;
import java.io.FileDescriptor;

/* loaded from: classes.dex */
public abstract class BinderHook extends Binder implements IInterface {
    public static final C03720In ML = new C03720In("BinderHook");
    public C03290Dn mCurrentHookedData;
    public final Object mLock;
    public final String mName;
    public boolean mShouldTransparentlyConvert;

    public BinderHook() {
        int A03 = C0f9.A03(389790626);
        this.mLock = new Object();
        this.mCurrentHookedData = null;
        this.mShouldTransparentlyConvert = false;
        this.mName = getClass().getSimpleName();
        C0f9.A0A(-1655867106, A03);
        C0f9.A0A(-1194310546, C0f9.A03(-376421738));
    }

    public static Binder getHookedBinderFrom(C03290Dn c03290Dn) {
        if (c03290Dn == null) {
            return null;
        }
        return c03290Dn.A00;
    }

    public static String hookBinderToString(Binder binder) {
        if (binder == null) {
            return "<Null Binder>";
        }
        String interfaceDescriptor = binder.getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            return interfaceDescriptor;
        }
        return "<No Interface Desc>";
    }

    private Binder getHookedBinderIfShouldCall() {
        int A03 = C0f9.A03(931153262);
        Binder hookedBinder = getHookedBinder();
        C0f9.A0A(-1067414401, A03);
        return hookedBinder;
    }

    private Binder getHookedBinder_native() {
        int A03 = C0f9.A03(2109027204);
        Binder hookedBinder = getHookedBinder();
        C0f9.A0A(-443399799, A03);
        return hookedBinder;
    }

    private long getHookedDataPtr_native() {
        int A03 = C0f9.A03(579033870);
        long hookedDataPtr = getHookedDataPtr();
        C0f9.A0A(-2094432216, A03);
        return hookedDataPtr;
    }

    private BinderHook getWrappedObjToUse() {
        C0f9.A0A(886191166, C0f9.A03(2099686188));
        return null;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i;
        int A03 = C0f9.A03(239049395);
        IBinder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null && (hookedBinderIfShouldCall instanceof IInterface)) {
            hookedBinderIfShouldCall = ((IInterface) hookedBinderIfShouldCall).asBinder();
            i = -809780118;
        } else {
            i = 1475318014;
        }
        C0f9.A0A(i, A03);
        return hookedBinderIfShouldCall;
    }

    public void clearHookedBinderData() {
        int A03 = C0f9.A03(-1575160925);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            Object[] objArr = {this.mName, wrappedObjToUse.getName()};
            wrappedObjToUse.clearHookedBinderData();
            C0f9.A0A(967941669, A03);
            return;
        }
        C03290Dn c03290Dn = this.mCurrentHookedData;
        Object[] objArr2 = {this.mName, hookBinderToString(getHookedBinderFrom(c03290Dn)), c03290Dn};
        synchronized (this.mLock) {
            try {
                this.mCurrentHookedData = null;
            } catch (Throwable th) {
                C0f9.A0A(2104934050, A03);
                throw th;
            }
        }
        C0f9.A0A(615164817, A03);
    }

    @Override // android.os.Binder, android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) {
        int i;
        int A03 = C0f9.A03(-829322259);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.dump(fileDescriptor, strArr);
            i = 612626007;
        } else {
            super.dump(fileDescriptor, strArr);
            i = -1741515878;
        }
        C0f9.A0A(i, A03);
    }

    @Override // android.os.Binder, android.os.IBinder
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        int i;
        int A03 = C0f9.A03(1585412868);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.dumpAsync(fileDescriptor, strArr);
            i = -211636046;
        } else {
            super.dumpAsync(fileDescriptor, strArr);
            i = 341877525;
        }
        C0f9.A0A(i, A03);
    }

    public Binder getHookedBinder() {
        Binder binder;
        int A03 = C0f9.A03(-1116733962);
        getWrappedObjToUse();
        int A032 = C0f9.A03(-1066733307);
        C03290Dn c03290Dn = this.mCurrentHookedData;
        if (c03290Dn == null) {
            binder = null;
        } else {
            binder = c03290Dn.A00;
        }
        C0f9.A0A(1452682522, A032);
        C0f9.A0A(-286122783, A03);
        return binder;
    }

    public long getHookedDataPtr() {
        long j;
        C03300Dp c03300Dp;
        int A03 = C0f9.A03(1102772852);
        getWrappedObjToUse();
        int A032 = C0f9.A03(-791329220);
        C03290Dn c03290Dn = this.mCurrentHookedData;
        if (c03290Dn != null && (c03300Dp = c03290Dn.A01) != null) {
            j = c03300Dp.A00;
        } else {
            j = 0;
        }
        C0f9.A0A(1118293812, A032);
        C0f9.A0A(726620739, A03);
        return j;
    }

    @Override // android.os.Binder, android.os.IBinder
    public String getInterfaceDescriptor() {
        String interfaceDescriptor;
        int i;
        int A03 = C0f9.A03(-1236743041);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            interfaceDescriptor = hookedBinderIfShouldCall.getInterfaceDescriptor();
            i = 660187571;
        } else {
            interfaceDescriptor = super.getInterfaceDescriptor();
            i = -2079079549;
        }
        C0f9.A0A(i, A03);
        return interfaceDescriptor;
    }

    public String getName() {
        int A03 = C0f9.A03(-697685446);
        String str = this.mName;
        C0f9.A0A(190782397, A03);
        return str;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean isBinderAlive() {
        boolean isBinderAlive;
        int i;
        int A03 = C0f9.A03(1770720429);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            isBinderAlive = hookedBinderIfShouldCall.isBinderAlive();
            i = 2127871636;
        } else {
            isBinderAlive = super.isBinderAlive();
            i = -1892620096;
        }
        C0f9.A0A(i, A03);
        return isBinderAlive;
    }

    public boolean isHooked() {
        int A03 = C0f9.A03(1872862619);
        getWrappedObjToUse();
        boolean z = false;
        if (this.mCurrentHookedData != null) {
            z = true;
        }
        C0f9.A0A(1366081844, A03);
        return z;
    }

    @Override // android.os.Binder, android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        int i2;
        int A03 = C0f9.A03(1929404028);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.linkToDeath(deathRecipient, i);
            i2 = 602389253;
        } else {
            super.linkToDeath(deathRecipient, i);
            i2 = -837496000;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        boolean z;
        C03300Dp c03300Dp;
        int nativeCallOriginalBinderOnTransact;
        int A03 = C0f9.A03(-40174759);
        getWrappedObjToUse();
        C03290Dn c03290Dn = this.mCurrentHookedData;
        ActivityThreadBinderHooker$ApplicationThreadBinderHook activityThreadBinderHooker$ApplicationThreadBinderHook = (ActivityThreadBinderHooker$ApplicationThreadBinderHook) this;
        int A032 = C0f9.A03(2126590221);
        activityThreadBinderHooker$ApplicationThreadBinderHook.A01.A01(activityThreadBinderHooker$ApplicationThreadBinderHook.A00, i, parcel);
        C0f9.A0A(1764171646, A032);
        if (parcel != null) {
            parcel.setDataPosition(0);
        }
        if (parcel2 != null) {
            parcel2.setDataPosition(0);
        }
        if (c03290Dn != null && (c03300Dp = c03290Dn.A01) != null) {
            if (parcel != null) {
                parcel.setDataPosition(0);
            }
            if (parcel2 != null) {
                parcel2.setDataPosition(0);
            }
            long j = c03300Dp.A00;
            if (NativeBinderHooker.PLATFORM_SUPPORTED) {
                try {
                    nativeCallOriginalBinderOnTransact = NativeBinderHooker.nativeCallOriginalBinderOnTransact(j, i, NativeBinderHooker.getParcelNativePtr(parcel), NativeBinderHooker.getParcelNativePtr(parcel2), i2);
                } catch (IllegalAccessException e) {
                    NativeBinderHooker.ML.A04("Call original binder on transact failed", e);
                }
                if (nativeCallOriginalBinderOnTransact != 523) {
                    z = false;
                    if (nativeCallOriginalBinderOnTransact == 213) {
                        z = true;
                    }
                    i3 = 90620012;
                    C0f9.A0A(i3, A03);
                    return z;
                }
            }
        } else {
            ML.A08("Do not have snapshot of current hooked data, so can't call original binder. This can have serious issues. HookData: %s", c03290Dn);
        }
        z = super.onTransact(i, parcel, parcel2, i2);
        i3 = 807025287;
        C0f9.A0A(i3, A03);
        return z;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean pingBinder() {
        boolean pingBinder;
        int i;
        int A03 = C0f9.A03(-678205118);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            pingBinder = hookedBinderIfShouldCall.pingBinder();
            i = 508227447;
        } else {
            pingBinder = super.pingBinder();
            i = -983658150;
        }
        C0f9.A0A(i, A03);
        return pingBinder;
    }

    @Override // android.os.Binder, android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        IInterface queryLocalInterface;
        int i;
        int A03 = C0f9.A03(1370005925);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            queryLocalInterface = hookedBinderIfShouldCall.queryLocalInterface(str);
            i = -1504908781;
        } else {
            queryLocalInterface = super.queryLocalInterface(str);
            i = 336920254;
        }
        C0f9.A0A(i, A03);
        return queryLocalInterface;
    }

    public void setHookedBinderData(Binder binder, long j) {
        int A03 = C0f9.A03(1207019107);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            Object[] objArr = {this.mName, wrappedObjToUse.getName()};
            wrappedObjToUse.setHookedBinderData(binder, j);
            C0f9.A0A(-2048462348, A03);
            return;
        }
        Object[] objArr2 = {this.mName, hookBinderToString(binder), Long.valueOf(j)};
        synchronized (this.mLock) {
            try {
                this.mCurrentHookedData = new C03290Dn(binder, j);
            } catch (Throwable th) {
                C0f9.A0A(597954832, A03);
                throw th;
            }
        }
        C0f9.A0A(-43519876, A03);
    }

    public String toString() {
        String str;
        int A03 = C0f9.A03(-2021918421);
        StringBuilder sb = new StringBuilder();
        sb.append("[BinderHook ");
        sb.append(this.mName);
        sb.append('(');
        sb.append(getClass().getName());
        sb.append(')');
        sb.append(" Hooked Data: ");
        C03290Dn c03290Dn = this.mCurrentHookedData;
        if (c03290Dn != null) {
            str = c03290Dn.toString();
        } else {
            str = "Not Hooked";
        }
        sb.append(str);
        getWrappedObjToUse();
        sb.append(']');
        String obj = sb.toString();
        C0f9.A0A(2065824159, A03);
        return obj;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        boolean unlinkToDeath;
        int i2;
        int A03 = C0f9.A03(1080247057);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            unlinkToDeath = hookedBinderIfShouldCall.unlinkToDeath(deathRecipient, i);
            i2 = -2145363977;
        } else {
            unlinkToDeath = super.unlinkToDeath(deathRecipient, i);
            i2 = -799434936;
        }
        C0f9.A0A(i2, A03);
        return unlinkToDeath;
    }
}
