package com.meta.arfx.engine.common;

import X.APM;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58317Pt9;
import X.AbstractServiceC201348vN;
import X.B00;
import X.B05;
import X.B07;
import X.C0f9;
import X.C14360o3;
import X.RunnableC24513AtW;
import X.RunnableC24514AtX;
import X.RunnableC24515AtY;
import X.RunnableC24516AtZ;
import X.RunnableC24517Ata;
import X.RunnableC24715Aww;
import X.RunnableC24716Awx;
import X.RunnableC24817Ayd;
import X.RunnableC24855AzG;
import X.RunnableC24887Azm;
import X.RunnableC24897Azw;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import com.meta.arfx.engine.interfaces.IAREngineServiceController;
import com.meta.arfx.engine.interfaces.IARExperimentUtilBinding;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class AREngineService$binder$1 extends Binder implements IAREngineServiceController {
    public final /* synthetic */ AbstractServiceC201348vN A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AREngineService$binder$1(AbstractServiceC201348vN abstractServiceC201348vN) {
        this();
        this.A00 = abstractServiceC201348vN;
        C0f9.A0A(-1815833668, C0f9.A03(2102833043));
    }

    public static final void A00(AREngineService$binder$1 aREngineService$binder$1) {
        int A03 = C0f9.A03(-613539275);
        AbstractServiceC201348vN abstractServiceC201348vN = aREngineService$binder$1.A00;
        VersionedSharedMemory versionedSharedMemory = abstractServiceC201348vN.A0G;
        if (versionedSharedMemory != null) {
            versionedSharedMemory.unmap(abstractServiceC201348vN.A0L);
        }
        abstractServiceC201348vN.A0L = null;
        VersionedSharedMemory versionedSharedMemory2 = abstractServiceC201348vN.A0G;
        if (versionedSharedMemory2 != null) {
            versionedSharedMemory2.close();
        }
        abstractServiceC201348vN.A0G = null;
        C0f9.A0A(-1300942285, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void AHT() {
        int A03 = C0f9.A03(904905206);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        while (true) {
            LinkedList linkedList = abstractServiceC201348vN.A0R;
            if (!linkedList.isEmpty()) {
                Future future = (Future) linkedList.poll();
                if (future != null) {
                    future.cancel(true);
                }
            } else {
                abstractServiceC201348vN.A0U.execute(new RunnableC24513AtW(abstractServiceC201348vN));
                C0f9.A0A(261064630, A03);
                return;
            }
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void AQ3(List list, int i, int i2, int i3, long j, long j2, boolean z) {
        AbstractServiceC201348vN abstractServiceC201348vN;
        LinkedList linkedList;
        int i4;
        int A03 = C0f9.A03(-487580945);
        if (list != null) {
            this.A00.A0S.addAll(list);
        }
        while (true) {
            abstractServiceC201348vN = this.A00;
            linkedList = abstractServiceC201348vN.A0Q;
            Future future = (Future) linkedList.peek();
            if (future == null || !future.isDone()) {
                break;
            } else {
                linkedList.poll();
            }
        }
        if (linkedList.size() > 5) {
            i4 = 1642585098;
        } else {
            linkedList.add(abstractServiceC201348vN.A0U.submit(new RunnableC24897Azw(abstractServiceC201348vN, i, i2, i3, j2, j, z)));
            i4 = -1762863292;
        }
        C0f9.A0A(i4, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EGr(IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARExperimentUtilBinding iARExperimentUtilBinding, IARNetworkClientWorkerHost iARNetworkClientWorkerHost, int i, int i2, boolean z, boolean z2, boolean z3) {
        int A03 = C0f9.A03(-1470818828);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        abstractServiceC201348vN.A0U.execute(new B00(abstractServiceC201348vN, iARAnalyticsLoggerHost, iARExperimentUtilBinding, iARNetworkClientWorkerHost, i, i2, z, z3));
        C0f9.A0A(-921555432, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EGs() {
        int A03 = C0f9.A03(164337530);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        while (true) {
            LinkedList linkedList = abstractServiceC201348vN.A0Q;
            if (!(!linkedList.isEmpty())) {
                break;
            }
            Future future = (Future) linkedList.poll();
            if (future != null) {
                future.cancel(true);
            }
        }
        while (true) {
            LinkedList linkedList2 = abstractServiceC201348vN.A0R;
            if (AbstractC166987dD.A1b(linkedList2)) {
                Future future2 = (Future) linkedList2.poll();
                if (future2 != null) {
                    future2.cancel(true);
                }
            } else {
                abstractServiceC201348vN.A0T.execute(new RunnableC24514AtX(this));
                abstractServiceC201348vN.A0U.execute(new RunnableC24515AtY(abstractServiceC201348vN));
                C0f9.A0A(1354122819, A03);
                return;
            }
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EJd() {
        int A03 = C0f9.A03(375863182);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        abstractServiceC201348vN.A0U.execute(new RunnableC24516AtZ(abstractServiceC201348vN));
        C0f9.A0A(-1968215278, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EQq(int i) {
        int A03 = C0f9.A03(1649574728);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        abstractServiceC201348vN.A0U.execute(new RunnableC24715Aww(abstractServiceC201348vN, i));
        C0f9.A0A(-88135247, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EQv(int i) {
        int A03 = C0f9.A03(2086960120);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        abstractServiceC201348vN.A0U.execute(new RunnableC24716Awx(abstractServiceC201348vN, i));
        C0f9.A0A(1613204015, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void ETe(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z) {
        int A03 = C0f9.A03(-1520047004);
        C14360o3.A0B(list, 9);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        abstractServiceC201348vN.A0U.execute(new B05(abstractServiceC201348vN, str, str2, str3, str4, str5, str6, list, i, i2, z));
        C0f9.A0A(-2055154530, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void Edj(IAREngineServiceCallback iAREngineServiceCallback) {
        int A03 = C0f9.A03(-1849503469);
        this.A00.A0J = iAREngineServiceCallback;
        C0f9.A0A(962042174, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EfF(Surface surface, int i, int i2) {
        int A03 = C0f9.A03(-1013966585);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        abstractServiceC201348vN.A0U.execute(new RunnableC24855AzG(surface, abstractServiceC201348vN, i, i2));
        C0f9.A0A(-1344586104, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void Ehn(VersionedSharedMemory versionedSharedMemory) {
        int A03 = C0f9.A03(1961985730);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        abstractServiceC201348vN.A0T.execute(new RunnableC24817Ayd(versionedSharedMemory, this, abstractServiceC201348vN));
        C0f9.A0A(821902615, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void Eho(int i, int i2, int i3, int i4, boolean z) {
        int A03 = C0f9.A03(-1256262925);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        abstractServiceC201348vN.A0U.execute(new RunnableC24887Azm(abstractServiceC201348vN, i, i2, i3, i4, z));
        C0f9.A0A(2099916417, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void EoW() {
        int A03 = C0f9.A03(618715178);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        while (true) {
            LinkedList linkedList = abstractServiceC201348vN.A0Q;
            if (!linkedList.isEmpty()) {
                Future future = (Future) linkedList.poll();
                if (future != null) {
                    future.cancel(true);
                }
            } else {
                abstractServiceC201348vN.A0U.execute(new RunnableC24517Ata(abstractServiceC201348vN));
                C0f9.A0A(-1456992910, A03);
                return;
            }
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceController
    public final void FB4(int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2) {
        AbstractServiceC201348vN abstractServiceC201348vN;
        LinkedList linkedList;
        int i5;
        int A03 = C0f9.A03(-79603393);
        C14360o3.A0B(iArr, 10);
        C14360o3.A0B(iArr2, 11);
        C14360o3.A0B(iArr3, 12);
        while (true) {
            abstractServiceC201348vN = this.A00;
            linkedList = abstractServiceC201348vN.A0R;
            Future future = (Future) linkedList.peek();
            if (future == null || !future.isDone()) {
                break;
            } else {
                linkedList.poll();
            }
        }
        if (linkedList.size() > 5) {
            i5 = -1053339006;
        } else {
            linkedList.add(abstractServiceC201348vN.A0T.submit(new B07(abstractServiceC201348vN, iArr, iArr2, iArr3, f, f2, f3, i, i2, i3, i4, j, j2, j3, z, z2)));
            i5 = 991540094;
        }
        C0f9.A0A(i5, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-757544830, C0f9.A03(-1427956496));
        return this;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost$Stub$Proxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.meta.arfx.engine.interfaces.IAREngineServiceCallback$Stub$Proxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost$Stub$Proxy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, com.meta.arfx.engine.interfaces.IARExperimentUtilBinding$Stub$Proxy] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean onTransact;
        int i3;
        Object obj;
        Object obj2;
        IARExperimentUtilBinding iARExperimentUtilBinding;
        IARNetworkClientWorkerHost iARNetworkClientWorkerHost;
        IARAnalyticsLoggerHost iARAnalyticsLoggerHost;
        IAREngineServiceCallback iAREngineServiceCallback;
        int A03 = C0f9.A03(-2022313451);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IAREngineServiceController");
                switch (i) {
                    case 1:
                        onTransact = true;
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            iAREngineServiceCallback = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof IAREngineServiceCallback)) {
                                iAREngineServiceCallback = (IAREngineServiceCallback) queryLocalInterface;
                            } else {
                                ?? obj3 = new Object();
                                int A032 = C0f9.A03(1321415730);
                                obj3.A00 = readStrongBinder;
                                C0f9.A0A(1304598251, A032);
                                iAREngineServiceCallback = obj3;
                            }
                        }
                        Edj(iAREngineServiceCallback);
                        parcel2.writeNoException();
                        i3 = 1660115826;
                        break;
                    case 2:
                        onTransact = true;
                        boolean A1M = AbstractC167007dF.A1M(parcel.readInt());
                        int readInt = parcel.readInt();
                        int readInt2 = parcel.readInt();
                        boolean A1M2 = AbstractC167007dF.A1M(parcel.readInt());
                        boolean A1M3 = AbstractC167007dF.A1M(parcel.readInt());
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            iARExperimentUtilBinding = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
                            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof IARExperimentUtilBinding)) {
                                iARExperimentUtilBinding = (IARExperimentUtilBinding) queryLocalInterface2;
                            } else {
                                ?? obj4 = new Object();
                                int A033 = C0f9.A03(159124499);
                                obj4.A00 = readStrongBinder2;
                                C0f9.A0A(-442393393, A033);
                                iARExperimentUtilBinding = obj4;
                            }
                        }
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 == null) {
                            iARNetworkClientWorkerHost = null;
                        } else {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface(AbstractC58317Pt9.A00(36));
                            if (queryLocalInterface3 != null && (queryLocalInterface3 instanceof IARNetworkClientWorkerHost)) {
                                iARNetworkClientWorkerHost = (IARNetworkClientWorkerHost) queryLocalInterface3;
                            } else {
                                ?? obj5 = new Object();
                                int A034 = C0f9.A03(713213044);
                                obj5.A00 = readStrongBinder3;
                                C0f9.A0A(-1049227454, A034);
                                iARNetworkClientWorkerHost = obj5;
                            }
                        }
                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                        if (readStrongBinder4 == null) {
                            iARAnalyticsLoggerHost = null;
                        } else {
                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
                            if (queryLocalInterface4 != null && (queryLocalInterface4 instanceof IARAnalyticsLoggerHost)) {
                                iARAnalyticsLoggerHost = (IARAnalyticsLoggerHost) queryLocalInterface4;
                            } else {
                                ?? obj6 = new Object();
                                int A035 = C0f9.A03(1607432808);
                                obj6.A00 = readStrongBinder4;
                                C0f9.A0A(314683952, A035);
                                iARAnalyticsLoggerHost = obj6;
                            }
                        }
                        EGr(iARAnalyticsLoggerHost, iARExperimentUtilBinding, iARNetworkClientWorkerHost, readInt, readInt2, A1M, A1M2, A1M3);
                        parcel2.writeNoException();
                        i3 = 1660115826;
                        break;
                    case 3:
                        onTransact = true;
                        Parcelable.Creator creator = Surface.CREATOR;
                        if (parcel.readInt() != 0) {
                            obj2 = creator.createFromParcel(parcel);
                        } else {
                            obj2 = null;
                        }
                        EfF((Surface) obj2, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        i3 = 1660115826;
                        break;
                    case 4:
                        onTransact = true;
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        String readString5 = parcel.readString();
                        int readInt3 = parcel.readInt();
                        String readString6 = parcel.readString();
                        boolean A1M4 = AbstractC167007dF.A1M(parcel.readInt());
                        ETe(readString, readString2, readString3, readString4, readString5, readString6, parcel.createTypedArrayList(Bundle.CREATOR), readInt3, parcel.readInt(), A1M4);
                        parcel2.writeNoException();
                        i3 = 1660115826;
                        break;
                    case 5:
                        onTransact = true;
                        long readLong = parcel.readLong();
                        long readLong2 = parcel.readLong();
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        boolean A1M5 = AbstractC167007dF.A1M(parcel.readInt());
                        AQ3(parcel.createTypedArrayList(Bundle.CREATOR), readInt4, readInt5, parcel.readInt(), readLong, readLong2, A1M5);
                        parcel2.writeNoException();
                        i3 = 1660115826;
                        break;
                    case 6:
                        onTransact = true;
                        APM apm = VersionedSharedMemory.CREATOR;
                        if (parcel.readInt() != 0) {
                            obj = apm.createFromParcel(parcel);
                        } else {
                            obj = null;
                        }
                        Ehn((VersionedSharedMemory) obj);
                        parcel2.writeNoException();
                        i3 = 1660115826;
                        break;
                    case 7:
                        int readInt6 = parcel.readInt();
                        long readLong3 = parcel.readLong();
                        boolean A1M6 = AbstractC167007dF.A1M(parcel.readInt());
                        int readInt7 = parcel.readInt();
                        int readInt8 = parcel.readInt();
                        onTransact = true;
                        FB4(parcel.createIntArray(), parcel.createIntArray(), parcel.createIntArray(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), readInt6, readInt7, readInt8, parcel.readInt(), readLong3, parcel.readLong(), parcel.readLong(), A1M6, AbstractC167007dF.A1M(parcel.readInt()));
                        parcel2.writeNoException();
                        i3 = 1660115826;
                        break;
                    case 8:
                        EoW();
                        parcel2.writeNoException();
                        onTransact = true;
                        i3 = 1660115826;
                        break;
                    case 9:
                        AHT();
                        parcel2.writeNoException();
                        onTransact = true;
                        i3 = 1660115826;
                        break;
                    case 10:
                        Eho(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), AbstractC167007dF.A1M(parcel.readInt()));
                        parcel2.writeNoException();
                        onTransact = true;
                        i3 = 1660115826;
                        break;
                    case 11:
                        EGs();
                        parcel2.writeNoException();
                        onTransact = true;
                        i3 = 1660115826;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        EJd();
                        parcel2.writeNoException();
                        onTransact = true;
                        i3 = 1660115826;
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        EQq(parcel.readInt());
                        parcel2.writeNoException();
                        onTransact = true;
                        i3 = 1660115826;
                        break;
                    case 14:
                        EQv(parcel.readInt());
                        parcel2.writeNoException();
                        onTransact = true;
                        i3 = 1660115826;
                        break;
                }
                C0f9.A0A(i3, A03);
                return onTransact;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IAREngineServiceController");
                C0f9.A0A(719792414, A03);
                return true;
            }
        }
        onTransact = super.onTransact(i, parcel, parcel2, i2);
        i3 = 232069149;
        C0f9.A0A(i3, A03);
        return onTransact;
    }

    public AREngineService$binder$1() {
        int A03 = C0f9.A03(667450032);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IAREngineServiceController");
        C0f9.A0A(-783022387, A03);
    }
}
