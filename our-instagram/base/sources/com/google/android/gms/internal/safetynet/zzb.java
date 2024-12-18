package com.google.android.gms.internal.safetynet;

import X.AbstractC43592JPx;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import X.LW6;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;

/* loaded from: classes10.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1162498016, C0f9.A03(1315444279));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int A03;
        UnsupportedOperationException A11;
        int i4;
        int A032 = C0f9.A03(-1670519701);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i3 = -1419468264;
                C0f9.A0A(i3, A032);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        zzh zzhVar = (zzh) this;
        int A033 = C0f9.A03(-327317852);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 6) {
                            if (i != 8) {
                                if (i != 15) {
                                    if (i != 10) {
                                        if (i != 11) {
                                            C0f9.A0A(-1079990223, A033);
                                            z = false;
                                        } else {
                                            AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                                            A03 = C0f9.A03(-2008051377);
                                            A11 = AbstractC43592JPx.A11();
                                            i4 = -94107580;
                                        }
                                    } else {
                                        AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                                        parcel.readInt();
                                        A03 = C0f9.A03(938961795);
                                        A11 = AbstractC43592JPx.A11();
                                        i4 = -682690614;
                                    }
                                } else {
                                    AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                                    AbstractC58320PtC.A0F(parcel, com.google.android.gms.safetynet.zzh.CREATOR);
                                    A03 = C0f9.A03(497120371);
                                    A11 = AbstractC43592JPx.A11();
                                    i4 = 1233272284;
                                }
                            } else {
                                AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                                AbstractC58320PtC.A0F(parcel, zzd.CREATOR);
                                A03 = C0f9.A03(-576487706);
                                A11 = AbstractC43592JPx.A11();
                                i4 = 835279620;
                            }
                        } else {
                            AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                            AbstractC58320PtC.A0F(parcel, zzf.CREATOR);
                            A03 = C0f9.A03(-1732215827);
                            A11 = AbstractC43592JPx.A11();
                            i4 = 2110392790;
                        }
                    } else {
                        AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                        parcel.readInt();
                        A03 = C0f9.A03(504100917);
                        A11 = AbstractC43592JPx.A11();
                        i4 = -1042925533;
                    }
                } else {
                    AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    AbstractC58320PtC.A0F(parcel, SafeBrowsingData.CREATOR);
                    A03 = C0f9.A03(10410541);
                    A11 = AbstractC43592JPx.A11();
                    i4 = 110687571;
                }
            } else {
                parcel.readString();
                A03 = C0f9.A03(330561414);
                A11 = AbstractC43592JPx.A11();
                i4 = -1631347409;
            }
            C0f9.A0A(i4, A03);
            throw A11;
        }
        Status status = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
        zza zzaVar = (zza) AbstractC58320PtC.A0F(parcel, zza.CREATOR);
        int A034 = C0f9.A03(-1438580690);
        ((zzs) zzhVar).A00.A06(new LW6(status, zzaVar));
        C0f9.A0A(938216723, A034);
        C0f9.A0A(-1675967967, A033);
        z = true;
        i3 = -283988315;
        C0f9.A0A(i3, A032);
        return z;
    }
}
