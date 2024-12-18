package com.google.vr.dynamite.client;

import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class a extends com.google.ar.core.dependencies.c implements ILoadedInstanceCreator {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.vr.dynamite.client.INativeLibraryLoader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        IBinder asBinder;
        IBinder asBinder2;
        ?? r2;
        int A03 = C0f9.A03(1396916038);
        Parcel A00 = A00();
        if (iObjectWrapper == null) {
            asBinder = null;
        } else {
            asBinder = iObjectWrapper.asBinder();
        }
        A00.writeStrongBinder(asBinder);
        if (iObjectWrapper2 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = iObjectWrapper2.asBinder();
        }
        A00.writeStrongBinder(asBinder2);
        Parcel A01 = A01(A00, 1);
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            r2 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                r2 = (INativeLibraryLoader) queryLocalInterface;
            } else {
                com.google.ar.core.dependencies.c cVar = new com.google.ar.core.dependencies.c("com.google.vr.dynamite.client.INativeLibraryLoader", readStrongBinder);
                C0f9.A0A(-414131614, C0f9.A03(-2131490757));
                r2 = cVar;
            }
        }
        A01.recycle();
        C0f9.A0A(-2015230473, A03);
        return r2;
    }
}
