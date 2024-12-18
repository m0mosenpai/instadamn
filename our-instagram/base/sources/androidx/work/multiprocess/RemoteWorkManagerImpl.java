package androidx.work.multiprocess;

import X.AbstractC49102Nf;
import X.AbstractRunnableC129135sZ;
import X.C0f9;
import X.C1114750l;
import X.C1114950n;
import X.C1120453t;
import X.C2L0;
import X.C2L1;
import X.C2LB;
import X.C2LC;
import X.C2LE;
import X.C3EF;
import X.C3EH;
import X.C48532Kv;
import X.C49142Nl;
import X.C62895SWb;
import X.InterfaceC49162No;
import X.QAH;
import X.QAI;
import X.QAN;
import X.RunnableC64729TRl;
import X.SFM;
import X.SQY;
import X.TQR;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class RemoteWorkManagerImpl extends Binder implements IWorkManagerImpl {
    public static byte[] A01 = new byte[0];
    public final C2L1 A00;

    public static void A01(IWorkManagerImplCallback iWorkManagerImplCallback, RemoteWorkManagerImpl remoteWorkManagerImpl, ListenableFuture listenableFuture, Executor executor, int i) {
        QAN qan = new QAN(iWorkManagerImplCallback, remoteWorkManagerImpl, listenableFuture, executor, i);
        ((SFM) qan).A01.addListener(new RunnableC64729TRl(qan), qan.A02);
    }

    public RemoteWorkManagerImpl(Context context) {
        this();
        int A03 = C0f9.A03(852259783);
        this.A00 = C2L1.A00(context);
        C0f9.A0A(175402001, A03);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.work.multiprocess.IWorkManagerImplCallback$Stub$Proxy, java.lang.Object, androidx.work.multiprocess.IWorkManagerImplCallback] */
    public static IWorkManagerImplCallback A00(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(IWorkManagerImplCallback.A00);
        if (queryLocalInterface != null && (queryLocalInterface instanceof IWorkManagerImplCallback)) {
            return (IWorkManagerImplCallback) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = C0f9.A03(-666504642);
        obj.A00 = readStrongBinder;
        C0f9.A0A(1042408621, A03);
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1226538504, C0f9.A03(-262247747));
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.2Nr] */
    @Override // android.os.Binder
    public final boolean onTransact(int code, Parcel data, Parcel reply, int flags) {
        int i;
        int A03;
        int i2;
        int A032 = C0f9.A03(572054545);
        String str = IWorkManagerImpl.A00;
        if (code >= 1) {
            if (code <= 16777215) {
                data.enforceInterface(str);
                switch (code) {
                    case 1:
                        byte[] createByteArray = data.createByteArray();
                        IWorkManagerImplCallback A00 = A00(data);
                        A03 = C0f9.A03(-1283788850);
                        try {
                            List list = ((ParcelableWorkRequests) SQY.A00(ParcelableWorkRequests.CREATOR, createByteArray)).A00;
                            C2L1 c2l1 = this.A00;
                            InterfaceC49162No A033 = c2l1.A03(list);
                            A01(A00, this, ((C49142Nl) A033).A00, ((C2LB) c2l1.A06).A01, 1);
                        } catch (Throwable th) {
                            RunnableC64729TRl.A00(A00, th);
                        }
                        i2 = -913617087;
                        break;
                    case 2:
                        String readString = data.readString();
                        byte[] createByteArray2 = data.createByteArray();
                        IWorkManagerImplCallback A002 = A00(data);
                        A03 = C0f9.A03(-1192952002);
                        try {
                            C2L0 c2l0 = ((ParcelableWorkRequest) SQY.A00(ParcelableWorkRequest.CREATOR, createByteArray2)).A00;
                            C2L1 c2l12 = this.A00;
                            C49142Nl A003 = AbstractC49102Nf.A00(c2l0, c2l12, readString);
                            A01(A002, this, A003.A00, ((C2LB) c2l12.A06).A01, 0);
                        } catch (Throwable th2) {
                            RunnableC64729TRl.A00(A002, th2);
                        }
                        i2 = -2095991627;
                        break;
                    case 3:
                        byte[] createByteArray3 = data.createByteArray();
                        IWorkManagerImplCallback A004 = A00(data);
                        A03 = C0f9.A03(-1663680490);
                        try {
                            ParcelableWorkContinuationImpl parcelableWorkContinuationImpl = (ParcelableWorkContinuationImpl) SQY.A00(ParcelableWorkContinuationImpl.CREATOR, createByteArray3);
                            C2L1 c2l13 = this.A00;
                            C62895SWb c62895SWb = parcelableWorkContinuationImpl.A00;
                            InterfaceC49162No A02 = new C1120453t(c2l13, c62895SWb.A01, c62895SWb.A02, c62895SWb.A03, C62895SWb.A00(c2l13, c62895SWb.A00)).A02();
                            A01(A004, this, ((C49142Nl) A02).A00, ((C2LB) c2l13.A06).A01, 2);
                        } catch (Throwable th3) {
                            RunnableC64729TRl.A00(A004, th3);
                        }
                        i2 = 1702885766;
                        break;
                    case 4:
                        String readString2 = data.readString();
                        IWorkManagerImplCallback A005 = A00(data);
                        A03 = C0f9.A03(809952806);
                        try {
                            C2L1 c2l14 = this.A00;
                            QAI qai = new QAI(c2l14, UUID.fromString(readString2));
                            C2LC c2lc = c2l14.A06;
                            c2lc.ATa(qai);
                            C49142Nl c49142Nl = ((AbstractRunnableC129135sZ) qai).A00;
                            A01(A005, this, c49142Nl.A00, ((C2LB) c2lc).A01, 3);
                        } catch (Throwable th4) {
                            RunnableC64729TRl.A00(A005, th4);
                        }
                        i2 = -603946782;
                        break;
                    case 5:
                        String readString3 = data.readString();
                        IWorkManagerImplCallback A006 = A00(data);
                        A03 = C0f9.A03(-588027378);
                        try {
                            C2L1 c2l15 = this.A00;
                            C49142Nl A04 = c2l15.A04(readString3);
                            A01(A006, this, A04.A00, ((C2LB) c2l15.A06).A01, 4);
                        } catch (Throwable th5) {
                            RunnableC64729TRl.A00(A006, th5);
                        }
                        i2 = 1489095335;
                        break;
                    case 6:
                        String readString4 = data.readString();
                        IWorkManagerImplCallback A007 = A00(data);
                        A03 = C0f9.A03(1165872815);
                        try {
                            C2L1 c2l16 = this.A00;
                            C49142Nl A05 = c2l16.A05(readString4);
                            A01(A007, this, A05.A00, ((C2LB) c2l16.A06).A01, 5);
                        } catch (Throwable th6) {
                            RunnableC64729TRl.A00(A007, th6);
                        }
                        i2 = -1230561332;
                        break;
                    case 7:
                        IWorkManagerImplCallback A008 = A00(data);
                        A03 = C0f9.A03(1923938867);
                        try {
                            C2L1 c2l17 = this.A00;
                            QAH qah = new QAH(c2l17);
                            C2LC c2lc2 = c2l17.A06;
                            c2lc2.ATa(qah);
                            C49142Nl c49142Nl2 = ((AbstractRunnableC129135sZ) qah).A00;
                            A01(A008, this, c49142Nl2.A00, ((C2LB) c2lc2).A01, 6);
                        } catch (Throwable th7) {
                            RunnableC64729TRl.A00(A008, th7);
                        }
                        i2 = -1294887380;
                        break;
                    case 8:
                        byte[] createByteArray4 = data.createByteArray();
                        IWorkManagerImplCallback A009 = A00(data);
                        A03 = C0f9.A03(2047636478);
                        try {
                            ParcelableWorkQuery parcelableWorkQuery = (ParcelableWorkQuery) SQY.A00(ParcelableWorkQuery.CREATOR, createByteArray4);
                            C2L1 c2l18 = this.A00;
                            C2LE c2le = ((C2LB) c2l18.A06).A01;
                            C3EF c3ef = new C3EF(parcelableWorkQuery.A00, c2l18);
                            c2le.execute(c3ef);
                            A01(A009, this, ((C3EH) c3ef).A00, c2le, 7);
                        } catch (Throwable th8) {
                            RunnableC64729TRl.A00(A009, th8);
                        }
                        i2 = 971786478;
                        break;
                    case 9:
                        byte[] createByteArray5 = data.createByteArray();
                        IWorkManagerImplCallback A0010 = A00(data);
                        A03 = C0f9.A03(-985354320);
                        try {
                            ParcelableUpdateRequest parcelableUpdateRequest = (ParcelableUpdateRequest) SQY.A00(ParcelableUpdateRequest.CREATOR, createByteArray5);
                            C2L1 c2l19 = this.A00;
                            C2LC c2lc3 = c2l19.A06;
                            C2LE c2le2 = ((C2LB) c2lc3).A01;
                            C1114750l c1114750l = new C1114750l(c2l19.A04, c2lc3);
                            UUID fromString = UUID.fromString(parcelableUpdateRequest.A01);
                            C48532Kv c48532Kv = parcelableUpdateRequest.A00.A00;
                            ?? obj = new Object();
                            c1114750l.A01.ATa(new TQR(c48532Kv, c1114750l, obj, fromString));
                            A01(A0010, this, obj, c2le2, 8);
                        } catch (Throwable th9) {
                            RunnableC64729TRl.A00(A0010, th9);
                        }
                        i2 = -736267194;
                        break;
                    case 10:
                        byte[] createByteArray6 = data.createByteArray();
                        IWorkManagerImplCallback A0011 = A00(data);
                        A03 = C0f9.A03(59257112);
                        try {
                            ParcelableForegroundRequestInfo parcelableForegroundRequestInfo = (ParcelableForegroundRequestInfo) SQY.A00(ParcelableForegroundRequestInfo.CREATOR, createByteArray6);
                            C2L1 c2l110 = this.A00;
                            C2LC c2lc4 = c2l110.A06;
                            A01(A0011, this, new C1114950n(c2l110.A04, c2l110.A03, c2lc4).EUm(c2l110.A01, parcelableForegroundRequestInfo.A00, UUID.fromString(parcelableForegroundRequestInfo.A01)), ((C2LB) c2lc4).A01, 9);
                        } catch (Throwable th10) {
                            RunnableC64729TRl.A00(A0011, th10);
                        }
                        i2 = -1821671022;
                        break;
                }
                C0f9.A0A(i2, A03);
                i = 907321468;
                C0f9.A0A(i, A032);
                return true;
            }
            if (code == 1598968902) {
                reply.writeString(str);
                i = -365631064;
                C0f9.A0A(i, A032);
                return true;
            }
        }
        boolean onTransact = super.onTransact(code, data, reply, flags);
        C0f9.A0A(-934836754, A032);
        return onTransact;
    }

    public RemoteWorkManagerImpl() {
        int A03 = C0f9.A03(-380799638);
        attachInterface(this, IWorkManagerImpl.A00);
        C0f9.A0A(-292431358, A03);
    }
}
