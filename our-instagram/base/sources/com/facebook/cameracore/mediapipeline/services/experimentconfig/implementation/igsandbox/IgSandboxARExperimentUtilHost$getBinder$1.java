package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.igsandbox;

import X.AbstractC12990ll;
import X.C06090Tz;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C23342AWm;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.meta.arfx.engine.interfaces.IARExperimentUtilBinding;

/* loaded from: classes4.dex */
public final class IgSandboxARExperimentUtilHost$getBinder$1 extends Binder implements IARExperimentUtilBinding {
    public final /* synthetic */ C23342AWm A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgSandboxARExperimentUtilHost$getBinder$1(C23342AWm c23342AWm) {
        this();
        this.A00 = c23342AWm;
        C0f9.A0A(-1752207492, C0f9.A03(-944097367));
    }

    @Override // com.meta.arfx.engine.interfaces.IARExperimentUtilBinding
    public final boolean Ah5(int i, boolean z) {
        int A03 = C0f9.A03(421478584);
        boolean A00 = C23342AWm.A00(this.A00, i, z);
        C0f9.A0A(-585848973, A03);
        return A00;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1725831901, C0f9.A03(-1633869614));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int i4;
        AbstractC12990ll abstractC12990ll;
        C06090Tz c06090Tz;
        long j;
        AbstractC12990ll abstractC12990ll2;
        C06090Tz c06090Tz2;
        long j2;
        int A03 = C0f9.A03(-572490334);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
                boolean z = false;
                boolean z2 = false;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    int readInt = parcel.readInt();
                                    double readDouble = parcel.readDouble();
                                    int A032 = C0f9.A03(-633337263);
                                    C23342AWm c23342AWm = this.A00;
                                    if (readInt == 2) {
                                        abstractC12990ll2 = c23342AWm.A00;
                                        c06090Tz2 = C06090Tz.A05;
                                        j2 = 37162960443146496L;
                                    } else {
                                        if (readInt == 3) {
                                            abstractC12990ll2 = c23342AWm.A00;
                                            c06090Tz2 = C06090Tz.A05;
                                            j2 = 37171065046172195L;
                                        }
                                        C0f9.A0A(-1891922512, A032);
                                        parcel2.writeNoException();
                                        parcel2.writeDouble(readDouble);
                                    }
                                    readDouble = C18U.A00(c06090Tz2, abstractC12990ll2, j2);
                                    C0f9.A0A(-1891922512, A032);
                                    parcel2.writeNoException();
                                    parcel2.writeDouble(readDouble);
                                }
                            } else {
                                parcel.readInt();
                                String readString = parcel.readString();
                                int A033 = C0f9.A03(-145675198);
                                C14360o3.A0B(readString, 1);
                                C0f9.A0A(-484011465, A033);
                                parcel2.writeNoException();
                                parcel2.writeString(readString);
                            }
                        } else {
                            int readInt2 = parcel.readInt();
                            long readLong = parcel.readLong();
                            int A034 = C0f9.A03(1705918781);
                            C23342AWm c23342AWm2 = this.A00;
                            if (readInt2 == 1) {
                                abstractC12990ll = c23342AWm2.A00;
                                c06090Tz = C06090Tz.A05;
                                j = 36592859368981215L;
                            } else {
                                if (readInt2 == 18) {
                                    abstractC12990ll = c23342AWm2.A00;
                                    c06090Tz = C06090Tz.A05;
                                    j = 36596694774778456L;
                                }
                                C0f9.A0A(816682553, A034);
                                parcel2.writeNoException();
                                parcel2.writeLong(readLong);
                            }
                            readLong = C18U.A01(c06090Tz, abstractC12990ll, j);
                            C0f9.A0A(816682553, A034);
                            parcel2.writeNoException();
                            parcel2.writeLong(readLong);
                        }
                        i3 = 63890202;
                        C0f9.A0A(i3, A03);
                        return true;
                    }
                    int readInt3 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    int A035 = C0f9.A03(-330753731);
                    C23342AWm c23342AWm3 = this.A00;
                    boolean z3 = z2;
                    if (readInt3 == 65) {
                        z3 = C18U.A06(C06090Tz.A06, c23342AWm3.A00, 36311818185016084L);
                    }
                    C0f9.A0A(453750789, A035);
                    i4 = z3;
                } else {
                    int readInt4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    i4 = Ah5(readInt4, z);
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                i3 = 63890202;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
                i3 = -679938119;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-1731147070, A03);
        return onTransact;
    }

    public IgSandboxARExperimentUtilHost$getBinder$1() {
        int A03 = C0f9.A03(-483049334);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
        C0f9.A0A(-2081057953, A03);
    }
}
