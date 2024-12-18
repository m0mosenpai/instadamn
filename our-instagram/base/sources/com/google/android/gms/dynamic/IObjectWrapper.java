package com.google.android.gms.dynamic;

import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes2.dex */
public interface IObjectWrapper extends IInterface {

    /* loaded from: classes2.dex */
    public abstract class Stub extends com.google.android.gms.internal.common.zzb implements IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
            C0f9.A0A(315065025, C0f9.A03(369804989));
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.common.zza] */
        public static IObjectWrapper A01(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof IObjectWrapper) {
                return (IObjectWrapper) queryLocalInterface;
            }
            ?? zzaVar = new zza("com.google.android.gms.dynamic.IObjectWrapper", iBinder);
            C0f9.A0A(-187073898, C0f9.A03(1047145825));
            return zzaVar;
        }
    }
}
