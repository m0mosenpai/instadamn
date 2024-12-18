package com.google.android.gms.internal.location;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import X.SGK;
import X.T5B;
import X.T5C;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes10.dex */
public abstract class zza extends Binder implements IInterface {
    public zza(String str) {
        int A03 = C0f9.A03(1432871374);
        attachInterface(this, str);
        C0f9.A0A(-703433712, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-65678159, C0f9.A03(1813310896));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        int i3;
        int i4;
        boolean z;
        int A032;
        int i5;
        int i6;
        int i7;
        int A033 = C0f9.A03(-1221644972);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i6 = -62759463;
                C0f9.A0A(i6, A033);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        if (this instanceof zzaz) {
            zzaz zzazVar = (zzaz) this;
            int A034 = C0f9.A03(1226516167);
            z = true;
            if (i == 1) {
                LocationSettingsResult locationSettingsResult = (LocationSettingsResult) AbstractC58320PtC.A0F(parcel, LocationSettingsResult.CREATOR);
                int A035 = C0f9.A03(-1860818505);
                ((BasePendingResult) zzazVar.A00).A06(locationSettingsResult);
                zzazVar.A00 = null;
                C0f9.A0A(1377546889, A035);
                i7 = -343838041;
            } else {
                z = false;
                i7 = -1697043938;
            }
            C0f9.A0A(i7, A034);
        } else if (this instanceof zzas) {
            zzas zzasVar = (zzas) this;
            A03 = C0f9.A03(-715841369);
            if (i != 1) {
                if (i != 2) {
                    i4 = -1146999123;
                    C0f9.A0A(i4, A03);
                    z = false;
                } else {
                    LocationAvailability locationAvailability = (LocationAvailability) AbstractC58320PtC.A0F(parcel, LocationAvailability.CREATOR);
                    A032 = C0f9.A03(-708481067);
                    final SGK sgk = zzasVar.A00;
                    final T5C t5c = new T5C(locationAvailability);
                    sgk.A00.execute(new Runnable() { // from class: X.TOX
                        @Override // java.lang.Runnable
                        public final void run() {
                            SGK sgk2 = sgk;
                            InterfaceC65405Tjc interfaceC65405Tjc = t5c;
                            Object obj = sgk2.A02;
                            if (obj != null) {
                                try {
                                    interfaceC65405Tjc.CtO(obj);
                                } catch (RuntimeException e) {
                                    throw e;
                                }
                            }
                        }
                    });
                    i5 = 1333366222;
                }
            } else {
                LocationResult locationResult = (LocationResult) AbstractC58320PtC.A0F(parcel, LocationResult.CREATOR);
                A032 = C0f9.A03(-1310496737);
                final SGK sgk2 = zzasVar.A00;
                final T5B t5b = new T5B(locationResult);
                sgk2.A00.execute(new Runnable() { // from class: X.TOX
                    @Override // java.lang.Runnable
                    public final void run() {
                        SGK sgk22 = sgk2;
                        InterfaceC65405Tjc interfaceC65405Tjc = t5b;
                        Object obj = sgk22.A02;
                        if (obj != null) {
                            try {
                                interfaceC65405Tjc.CtO(obj);
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        }
                    }
                });
                i5 = -6166997;
            }
            C0f9.A0A(i5, A032);
            i3 = -813099893;
            C0f9.A0A(i3, A03);
            z = true;
        } else {
            zzah zzahVar = (zzah) this;
            A03 = C0f9.A03(715726681);
            if (i != 1) {
                if (i != 2) {
                    i4 = -1598604518;
                    C0f9.A0A(i4, A03);
                    z = false;
                } else {
                    zzahVar.A71();
                }
            } else {
                zzahVar.FFf((zzac) AbstractC58320PtC.A0F(parcel, zzac.CREATOR));
            }
            i3 = 1405533967;
            C0f9.A0A(i3, A03);
            z = true;
        }
        i6 = 1093600575;
        C0f9.A0A(i6, A033);
        return z;
    }
}
