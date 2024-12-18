package androidx.room;

import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.C0f9;
import X.C14360o3;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;

/* loaded from: classes10.dex */
public final class MultiInstanceInvalidationService$binder$1 extends Binder implements IMultiInstanceInvalidationService {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this();
        this.A00 = multiInstanceInvalidationService;
        C0f9.A0A(90552005, C0f9.A03(-1697554461));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1698239304, C0f9.A03(-1788130953));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int i4;
        int i5;
        int A03 = C0f9.A03(1241636157);
        String str = IMultiInstanceInvalidationService.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            int readInt = parcel.readInt();
                            String[] createStringArray = parcel.createStringArray();
                            int A032 = C0f9.A03(-140073984);
                            C14360o3.A0B(createStringArray, 1);
                            MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
                            RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
                            synchronized (remoteCallbackList) {
                                try {
                                    Map map = multiInstanceInvalidationService.A02;
                                    String str2 = (String) AbstractC166997dE.A0m(map, readInt);
                                    if (str2 == null) {
                                        Log.w("ROOM", "Remote invalidation client ID not registered");
                                        i5 = -1045868061;
                                    } else {
                                        int beginBroadcast = remoteCallbackList.beginBroadcast();
                                        for (int i6 = 0; i6 < beginBroadcast; i6++) {
                                            try {
                                                Object broadcastCookie = remoteCallbackList.getBroadcastCookie(i6);
                                                C14360o3.A0C(broadcastCookie, AbstractC111324zv.A00(488));
                                                int A07 = AbstractC58318PtA.A07(broadcastCookie);
                                                String str3 = (String) AbstractC166997dE.A0m(map, A07);
                                                if (readInt != A07 && str2.equals(str3)) {
                                                    try {
                                                        IMultiInstanceInvalidationCallback$Stub$Proxy iMultiInstanceInvalidationCallback$Stub$Proxy = (IMultiInstanceInvalidationCallback$Stub$Proxy) ((IMultiInstanceInvalidationCallback) remoteCallbackList.getBroadcastItem(i6));
                                                        int A033 = C0f9.A03(1388715494);
                                                        Parcel obtain = Parcel.obtain();
                                                        try {
                                                            obtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.A00);
                                                            obtain.writeStringArray(createStringArray);
                                                            iMultiInstanceInvalidationCallback$Stub$Proxy.A00.transact(1, obtain, null, 1);
                                                            obtain.recycle();
                                                            C0f9.A0A(1465223271, A033);
                                                        } catch (Throwable th) {
                                                            obtain.recycle();
                                                            C0f9.A0A(-1710716750, A033);
                                                            throw th;
                                                            break;
                                                        }
                                                    } catch (RemoteException e) {
                                                        Log.w("ROOM", "Error invoking a remote callback", e);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                remoteCallbackList.finishBroadcast();
                                                C0f9.A0A(396209090, A032);
                                                throw th2;
                                            }
                                        }
                                        remoteCallbackList.finishBroadcast();
                                        i5 = 236870985;
                                    }
                                } catch (Throwable th3) {
                                    C0f9.A0A(1899608479, A032);
                                    throw th3;
                                }
                            }
                            C0f9.A0A(i5, A032);
                        }
                    } else {
                        IMultiInstanceInvalidationCallback A00 = MultiInstanceInvalidationClient$callback$1.A00(parcel.readStrongBinder());
                        int readInt2 = parcel.readInt();
                        int A0N = AbstractC167017dG.A0N(A00, 685382538);
                        MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.A00;
                        RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.A01;
                        synchronized (remoteCallbackList2) {
                            try {
                                remoteCallbackList2.unregister(A00);
                                multiInstanceInvalidationService2.A02.remove(Integer.valueOf(readInt2));
                            } catch (Throwable th4) {
                                C0f9.A0A(273753889, A0N);
                                throw th4;
                            }
                        }
                        C0f9.A0A(1519209530, A0N);
                        parcel2.writeNoException();
                    }
                } else {
                    IMultiInstanceInvalidationCallback A002 = MultiInstanceInvalidationClient$callback$1.A00(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    int A0N2 = AbstractC167017dG.A0N(A002, 1756970826);
                    int i7 = 0;
                    if (readString == null) {
                        i4 = 557018806;
                    } else {
                        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.A00;
                        RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.A01;
                        synchronized (remoteCallbackList3) {
                            try {
                                int i8 = multiInstanceInvalidationService3.A00 + 1;
                                multiInstanceInvalidationService3.A00 = i8;
                                Integer valueOf = Integer.valueOf(i8);
                                if (remoteCallbackList3.register(A002, valueOf)) {
                                    multiInstanceInvalidationService3.A02.put(valueOf, readString);
                                    i7 = i8;
                                } else {
                                    multiInstanceInvalidationService3.A00--;
                                }
                            } catch (Throwable th5) {
                                C0f9.A0A(935918832, A0N2);
                                throw th5;
                            }
                        }
                        i4 = 37833664;
                    }
                    C0f9.A0A(i4, A0N2);
                    parcel2.writeNoException();
                    parcel2.writeInt(i7);
                }
                i3 = 1261623556;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                i3 = -238232284;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-1270099336, A03);
        return onTransact;
    }

    public MultiInstanceInvalidationService$binder$1() {
        int A03 = C0f9.A03(-534289645);
        attachInterface(this, IMultiInstanceInvalidationService.A00);
        C0f9.A0A(-2061017608, A03);
    }
}
