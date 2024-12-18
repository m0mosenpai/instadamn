package com.google.android.gms.common.internal;

import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;

/* loaded from: classes10.dex */
public abstract class AccountAccessor extends zzb implements IAccountAccessor {
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.common.zza, com.google.android.gms.common.internal.IAccountAccessor] */
    public static IAccountAccessor A00(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        ?? zzaVar = new zza("com.google.android.gms.common.internal.IAccountAccessor", iBinder);
        C0f9.A0A(1342352058, C0f9.A03(2075624599));
        return zzaVar;
    }
}
