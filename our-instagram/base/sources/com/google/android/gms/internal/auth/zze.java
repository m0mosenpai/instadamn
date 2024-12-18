package com.google.android.gms.internal.auth;

import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes10.dex */
public abstract class zze extends zzb implements zzf {
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.auth.zza, com.google.android.gms.internal.auth.zzf] */
    public static zzf A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof zzf) {
            return (zzf) queryLocalInterface;
        }
        ?? zzaVar = new zza("com.google.android.auth.IAuthManagerService", iBinder);
        C0f9.A0A(81811183, C0f9.A03(1166281155));
        return zzaVar;
    }
}
