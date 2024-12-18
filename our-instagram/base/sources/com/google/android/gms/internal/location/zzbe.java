package com.google.android.gms.internal.location;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C0f9;
import X.C63471SlC;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzap;
import com.google.android.gms.location.zzaq;

/* loaded from: classes10.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(31);
    public int A00;
    public PendingIntent A01;
    public zzai A02;
    public zzbc A03;
    public zzap A04;
    public zzaq A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.location.zzaq] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.gms.location.zzap] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.location.zzb] */
    public zzbe(PendingIntent pendingIntent, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, zzbc zzbcVar, int i) {
        ?? r2;
        ?? r22;
        this.A00 = i;
        this.A03 = zzbcVar;
        zzai zzaiVar = null;
        if (iBinder == null) {
            r2 = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof zzaq) {
                r2 = (zzaq) queryLocalInterface;
            } else {
                zzb zzbVar = new zzb("com.google.android.gms.location.ILocationListener", iBinder);
                C0f9.A0A(147939916, C0f9.A03(1722998234));
                r2 = zzbVar;
            }
        }
        this.A05 = r2;
        this.A01 = pendingIntent;
        if (iBinder2 == null) {
            r22 = 0;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof zzap) {
                r22 = (zzap) queryLocalInterface2;
            } else {
                zzb zzbVar2 = new zzb("com.google.android.gms.location.ILocationCallback", iBinder2);
                C0f9.A0A(40883946, C0f9.A03(-1821358649));
                r22 = zzbVar2;
            }
        }
        this.A04 = r22;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof zzai) {
                zzaiVar = (zzai) queryLocalInterface3;
            } else {
                ?? zzbVar3 = new zzb("com.google.android.gms.location.internal.IFusedLocationProviderCallback", iBinder3);
                C0f9.A0A(-911171265, C0f9.A03(-1820971121));
                zzaiVar = zzbVar3;
            }
        }
        this.A02 = zzaiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        boolean A1U = AbstractC58322PtE.A1U(parcel, this.A03, i);
        zzaq zzaqVar = this.A05;
        IBinder iBinder = null;
        if (zzaqVar == null) {
            asBinder = null;
        } else {
            asBinder = zzaqVar.asBinder();
        }
        AbstractC128825rw.A03(asBinder, parcel, 3);
        AbstractC128825rw.A0A(parcel, this.A01, 4, i, A1U);
        zzap zzapVar = this.A04;
        if (zzapVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = zzapVar.asBinder();
        }
        AbstractC128825rw.A03(asBinder2, parcel, 5);
        zzai zzaiVar = this.A02;
        if (zzaiVar != null) {
            iBinder = zzaiVar.asBinder();
        }
        AbstractC128825rw.A03(iBinder, parcel, 6);
        AbstractC128825rw.A06(parcel, A04);
    }
}
