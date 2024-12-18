package com.google.android.gms.internal.auth_blockstore;

import X.AbstractC37304Gc5;
import X.AbstractC43592JPx;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import X.S2N;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1811953677, C0f9.A03(-2026300582));
        return this;
    }

    public zzb(String str) {
        int A03 = C0f9.A03(-709917162);
        attachInterface(this, str);
        C0f9.A0A(5853961, A03);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        boolean z;
        int i3;
        int i4;
        Object createFromParcel;
        int A032 = C0f9.A03(-36567356);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i4 = -1201329244;
                C0f9.A0A(i4, A032);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        if (this instanceof zzk) {
            zzk zzkVar = (zzk) this;
            int A033 = C0f9.A03(1499518719);
            if (i != 1) {
                if (i != 2) {
                    C0f9.A0A(-625242649, A033);
                    z = false;
                } else {
                    Status status = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    Parcelable.Creator creator = RetrieveBytesResponse.CREATOR;
                    if (parcel.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = creator.createFromParcel(parcel);
                    }
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail <= 0) {
                        int A034 = C0f9.A03(1172786908);
                        S2N.A00(status, ((zzv) zzkVar).A00, createFromParcel);
                        C0f9.A0A(1523190538, A034);
                        C0f9.A0A(199390045, A033);
                        z = true;
                    } else {
                        throw AbstractC58320PtC.A0E(dataAvail);
                    }
                }
            } else {
                Parcelable.Creator creator2 = Status.CREATOR;
                if (parcel.readInt() != 0) {
                    creator2.createFromParcel(parcel);
                }
                parcel.createByteArray();
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 <= 0) {
                    int A035 = C0f9.A03(-323253540);
                    UnsupportedOperationException A11 = AbstractC43592JPx.A11();
                    C0f9.A0A(-363254742, A035);
                    throw A11;
                }
                throw AbstractC58320PtC.A0E(dataAvail2);
            }
        } else {
            if (this instanceof zzy) {
                zzy zzyVar = (zzy) this;
                A03 = C0f9.A03(309586204);
                z = true;
                if (i == 1) {
                    Status status2 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    boolean A1V = AbstractC37304Gc5.A1V(parcel);
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 <= 0) {
                        int A036 = C0f9.A03(1109666827);
                        S2N.A00(status2, zzyVar.A00, Boolean.valueOf(A1V));
                        C0f9.A0A(-2070289974, A036);
                        i3 = -1911967959;
                    } else {
                        throw AbstractC58320PtC.A0E(dataAvail3);
                    }
                } else {
                    z = false;
                    i3 = 688817054;
                }
            } else {
                zzu zzuVar = (zzu) this;
                A03 = C0f9.A03(81411986);
                z = true;
                if (i == 1) {
                    Status status3 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    int readInt = parcel.readInt();
                    int dataAvail4 = parcel.dataAvail();
                    if (dataAvail4 <= 0) {
                        int A037 = C0f9.A03(969333406);
                        S2N.A00(status3, zzuVar.A00, Integer.valueOf(readInt));
                        C0f9.A0A(457067075, A037);
                        i3 = 68497620;
                    } else {
                        throw AbstractC58320PtC.A0E(dataAvail4);
                    }
                } else {
                    z = false;
                    i3 = -853772175;
                }
            }
            C0f9.A0A(i3, A03);
        }
        i4 = 1450982289;
        C0f9.A0A(i4, A032);
        return z;
    }
}
