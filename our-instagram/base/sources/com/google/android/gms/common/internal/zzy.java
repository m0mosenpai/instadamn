package com.google.android.gms.common.internal;

import X.C0f9;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes10.dex */
public final class zzy extends zza implements zzaa {
    @Override // com.google.android.gms.common.internal.zzaa
    public final int FFy() {
        int A03 = C0f9.A03(776365533);
        Parcel A02 = A02(A01(), 2);
        int readInt = A02.readInt();
        A02.recycle();
        C0f9.A0A(1033736618, A03);
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper FG4() {
        int A03 = C0f9.A03(-1160254712);
        IObjectWrapper A00 = zza.A00(A01(), this, 1);
        C0f9.A0A(-1129275615, A03);
        return A00;
    }
}
