package com.google.android.gms.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C0f9;
import X.C63474SlF;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes10.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(61);
    public final zzj A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.common.internal.zzaa] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public zzs(IBinder iBinder, String str, boolean z, boolean z2) {
        ?? r2;
        byte[] bArr;
        this.A01 = str;
        zzk zzkVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof zzaa) {
                    r2 = (zzaa) queryLocalInterface;
                } else {
                    zza zzaVar = new zza("com.google.android.gms.common.internal.ICertData", iBinder);
                    C0f9.A0A(-1403327283, C0f9.A03(1018010375));
                    r2 = zzaVar;
                }
                IObjectWrapper FG4 = r2.FG4();
                if (FG4 != null && (bArr = (byte[]) ObjectWrapper.A00(FG4)) != null) {
                    zzkVar = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.A00 = zzkVar;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC58322PtE.A1D(parcel, str);
        zzj zzjVar = this.A00;
        if (zzjVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzjVar = null;
        }
        AbstractC128825rw.A03(zzjVar, parcel, 2);
        AbstractC128825rw.A09(parcel, 3, this.A02);
        AbstractC128825rw.A09(parcel, 4, this.A03);
        AbstractC128825rw.A06(parcel, A04);
    }
}
