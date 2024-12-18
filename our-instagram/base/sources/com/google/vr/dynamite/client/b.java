package com.google.vr.dynamite.client;

import X.C0f9;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class b extends com.google.ar.core.dependencies.c implements INativeLibraryLoader {
    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        int A03 = C0f9.A03(1415172034);
        Parcel A00 = A00();
        A00.writeString(str);
        Parcel A01 = A01(A00, 2);
        int readInt = A01.readInt();
        A01.recycle();
        C0f9.A0A(-1664313816, A03);
        return readInt;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        int A03 = C0f9.A03(-952629516);
        Parcel A00 = A00();
        A00.writeString(str);
        Parcel A01 = A01(A00, 1);
        long readLong = A01.readLong();
        A01.recycle();
        C0f9.A0A(515652715, A03);
        return readLong;
    }
}
