package com.meta.arfx.engine.interfaces;

import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.util.List;

/* loaded from: classes4.dex */
public final class IAREngineServiceController$Stub$Proxy implements IAREngineServiceController {
    public IBinder A00;

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void AHT() {
        int A03 = C0f9.A03(369279273);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 9);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1714035093, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1965803494, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void AQ3(List list, int i, int i2, int i3, long j, long j2, boolean z) {
        int A03 = C0f9.A03(208189235);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeLong(j);
            obtain.writeLong(j2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i3);
            int size = list.size();
            obtain.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC167027dH.A0p(obtain, list, i4);
            }
            this.A00.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1226431441, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(185990321, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EGr(IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARExperimentUtilBinding iARExperimentUtilBinding, IARNetworkClientWorkerHost iARNetworkClientWorkerHost, int i, int i2, boolean z, boolean z2, boolean z3) {
        int A03 = C0f9.A03(1493461390);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            int i3 = 1;
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(AbstractC167007dF.A1M(z2 ? 1 : 0) ? 1 : 0);
            if (!z3) {
                i3 = 0;
            }
            obtain.writeInt(i3);
            obtain.writeStrongInterface(iARExperimentUtilBinding);
            obtain.writeStrongInterface(iARNetworkClientWorkerHost);
            obtain.writeStrongInterface(iARAnalyticsLoggerHost);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1176763322, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-673089887, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EGs() {
        int A03 = C0f9.A03(-1079324397);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 11);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1946075700, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-981682543, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EJd() {
        int A03 = C0f9.A03(827106714);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 12);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(137826717, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1043531412, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EQq(int i) {
        int A03 = C0f9.A03(673954610);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeInt(i);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 13);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1110017813, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1887812272, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EQv(int i) {
        int A03 = C0f9.A03(104261424);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeInt(i);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 14);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(20463325, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-387612865, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void ETe(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z) {
        int A03 = C0f9.A03(-2134643320);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeString(str5);
            obtain.writeInt(i);
            obtain.writeString(str6);
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i2);
            int size = list.size();
            obtain.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC167027dH.A0p(obtain, list, i3);
            }
            this.A00.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-734822989, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1845950772, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void Edj(IAREngineServiceCallback iAREngineServiceCallback) {
        int A03 = C0f9.A03(1961972413);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeStrongInterface(iAREngineServiceCallback);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1198280113, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(39237, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EfF(Surface surface, int i, int i2) {
        int A03 = C0f9.A03(2098176550);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            if (surface != null) {
                obtain.writeInt(1);
                surface.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(41465654, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-229359283, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void Ehn(VersionedSharedMemory versionedSharedMemory) {
        int A03 = C0f9.A03(352148085);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            if (versionedSharedMemory != null) {
                obtain.writeInt(1);
                versionedSharedMemory.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.A00.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-831122103, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1778988403, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void Eho(int i, int i2, int i3, int i4, boolean z) {
        int A03 = C0f9.A03(1479962054);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            this.A00.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1982273951, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-195991976, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EoW() {
        int A03 = C0f9.A03(1656276466);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 8);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1398628381, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-802690807, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void FB4(int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2) {
        int A03 = C0f9.A03(-111306225);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeInt(i);
            obtain.writeLong(j);
            int i5 = 1;
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeFloat(f);
            obtain.writeFloat(f2);
            obtain.writeFloat(f3);
            obtain.writeLong(j2);
            obtain.writeLong(j3);
            obtain.writeIntArray(iArr);
            obtain.writeIntArray(iArr2);
            obtain.writeIntArray(iArr3);
            obtain.writeInt(i4);
            if (!z2) {
                i5 = 0;
            }
            obtain.writeInt(i5);
            this.A00.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1504044086, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1957393777, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1340007776);
        IBinder iBinder = this.A00;
        C0f9.A0A(-321938493, A03);
        return iBinder;
    }
}
