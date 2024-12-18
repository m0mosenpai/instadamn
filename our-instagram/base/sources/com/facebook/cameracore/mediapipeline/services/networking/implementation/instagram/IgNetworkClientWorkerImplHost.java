package com.facebook.cameracore.mediapipeline.services.networking.implementation.instagram;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.AbstractC31172DnG;
import X.AbstractC37304Gc5;
import X.AbstractC54919OQu;
import X.C0K8;
import X.C0f9;
import X.C14360o3;
import X.C1GJ;
import X.C64848TWp;
import X.SUW;
import X.T8E;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.interfaces.ARNetworkClientWorkerResponse;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/* loaded from: classes10.dex */
public final class IgNetworkClientWorkerImplHost extends Binder implements IARNetworkClientWorkerHost {
    public final Map A00;
    public final Map A01;

    public IgNetworkClientWorkerImplHost() {
        int A03 = C0f9.A03(468623895);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost");
        C0f9.A0A(1822167427, A03);
        int A032 = C0f9.A03(1421662955);
        this.A01 = AbstractC166987dD.A1I();
        this.A00 = AbstractC166987dD.A1I();
        C0f9.A0A(-827279893, A032);
    }

    @Override // com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost
    public final void AII(String str) {
        int i;
        int A0N = AbstractC167017dG.A0N(str, 707579521);
        Map map = this.A01;
        if (!map.containsKey(str)) {
            C0K8.A0C("IgNetworkerClientWorker", "Attempted to close shared memory for invalid request id");
            i = -898700542;
        } else {
            VersionedSharedMemory versionedSharedMemory = (VersionedSharedMemory) map.get(str);
            if (versionedSharedMemory != null) {
                versionedSharedMemory.close();
            }
            map.remove(str);
            i = -1375705992;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost
    public final Bundle Bof() {
        int A03 = C0f9.A03(-1788521971);
        Bundle A0b = AbstractC166987dD.A0b();
        Map map = this.A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            A1K.getValue();
            HttpResponse httpResponse = (HttpResponse) map.get(A17);
            if (httpResponse != null) {
                ARNetworkClientWorkerResponse aRNetworkClientWorkerResponse = new ARNetworkClientWorkerResponse();
                StatusLine statusLine = httpResponse.getStatusLine();
                aRNetworkClientWorkerResponse.A00 = statusLine.getStatusCode();
                aRNetworkClientWorkerResponse.A02 = statusLine.getReasonPhrase();
                HttpEntity entity = httpResponse.getEntity();
                aRNetworkClientWorkerResponse.A01 = entity.getContentLength();
                InputStream content = entity.getContent();
                C14360o3.A07(content);
                byte[] A01 = AbstractC54919OQu.A01(content);
                int length = A01.length;
                if (length < 512000) {
                    aRNetworkClientWorkerResponse.A03 = A01;
                } else {
                    VersionedSharedMemory A012 = VersionedSharedMemory.CREATOR.A01("ig_network_worker_http_body_stream", length);
                    ByteBuffer mapReadWrite = A012.mapReadWrite();
                    if (mapReadWrite != null) {
                        mapReadWrite.position(0);
                        mapReadWrite.put(A01);
                    }
                    A0b.putParcelable("bodyStream", A012);
                    Map map2 = this.A01;
                    C14360o3.A0C(A012, "null cannot be cast to non-null type com.facebook.cameracore.util.memory.VersionedSharedMemory");
                    map2.put(A17, A012);
                    A012.unmap(mapReadWrite);
                }
                A0b.putParcelable(A17, aRNetworkClientWorkerResponse);
                map.remove(A17);
            }
        }
        if (A0b.isEmpty()) {
            C0f9.A0A(1864415562, A03);
            return null;
        }
        C0f9.A0A(2135137911, A03);
        return A0b;
    }

    @Override // com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost
    public final void EOI(String str, String str2, String str3, String str4, String[] strArr, String[] strArr2, boolean z) {
        int A03 = C0f9.A03(795893799);
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        AbstractC25233BEq.A0x(2, str3, strArr, strArr2);
        C1GJ.A06(SUW.A00(new T8E(0), str2, str3, str4, new C64848TWp(this, str), strArr, strArr2), -4, 3, A1a, A1a);
        C0f9.A0A(-776843319, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1001589708, C0f9.A03(-1579093786));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(-2076111018);
        boolean z = true;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost");
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            AII(parcel.readString());
                        }
                    } else {
                        Bundle Bof = Bof();
                        parcel2.writeNoException();
                        if (Bof != null) {
                            parcel2.writeInt(1);
                            Bof.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        i3 = -372717239;
                    }
                } else {
                    EOI(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.createStringArray(), AbstractC37304Gc5.A1V(parcel));
                }
                parcel2.writeNoException();
                i3 = -372717239;
            } else if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost");
                i3 = 486107238;
            }
            C0f9.A0A(i3, A03);
            return z;
        }
        z = super.onTransact(i, parcel, parcel2, i2);
        i3 = -2079161660;
        C0f9.A0A(i3, A03);
        return z;
    }
}
