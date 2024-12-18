package X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.interfaces.ARNetworkClientWorkerResponse;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpVersion;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;

/* renamed from: X.Swt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63967Swt implements BBY {
    public IARNetworkClientWorkerHost A00;
    public final Map A01 = AbstractC166987dD.A1I();
    public final Map A02 = AbstractC166987dD.A1I();

    @Override // X.BBY
    public final void EOJ(C2JL c2jl, String str, String str2, String str3, ResponseHandler responseHandler, String[] strArr, String[] strArr2, boolean z) {
        C14360o3.A0B(str, 0);
        AbstractC25233BEq.A0w(1, str2, strArr, strArr2);
        String A0p = AbstractC25231BEo.A0p();
        this.A01.put(A0p, c2jl);
        this.A02.put(A0p, responseHandler);
        IARNetworkClientWorkerHost iARNetworkClientWorkerHost = this.A00;
        if (iARNetworkClientWorkerHost != null) {
            iARNetworkClientWorkerHost.EOI(A0p, str, str2, str3, strArr, strArr2, z);
        }
    }

    public final void A00() {
        Bundle Bof;
        Object parcelable;
        Object parcelable2;
        Map map = this.A01;
        List A0a = AbstractC001800i.A0a(map.keySet());
        IARNetworkClientWorkerHost iARNetworkClientWorkerHost = this.A00;
        if (iARNetworkClientWorkerHost != null && (Bof = iARNetworkClientWorkerHost.Bof()) != null) {
            Bof.setClassLoader(ARNetworkClientWorkerResponse.class.getClassLoader());
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (Bof.containsKey(A1B)) {
                    Map map2 = this.A02;
                    if (map2.containsKey(A1B)) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 33) {
                            parcelable = Bof.getParcelable(A1B, ARNetworkClientWorkerResponse.class);
                        } else {
                            parcelable = Bof.getParcelable(A1B);
                        }
                        ARNetworkClientWorkerResponse aRNetworkClientWorkerResponse = (ARNetworkClientWorkerResponse) parcelable;
                        if (i >= 33) {
                            parcelable2 = Bof.getParcelable("bodyStream", VersionedSharedMemory.class);
                        } else {
                            parcelable2 = Bof.getParcelable("bodyStream");
                        }
                        VersionedSharedMemory versionedSharedMemory = (VersionedSharedMemory) parcelable2;
                        if (versionedSharedMemory != null) {
                            int i2 = versionedSharedMemory.size;
                            ByteBuffer mapReadOnly = versionedSharedMemory.mapReadOnly();
                            byte[] bArr = new byte[i2];
                            if (mapReadOnly != null) {
                                mapReadOnly.get(bArr, 0, i2);
                            }
                            if (aRNetworkClientWorkerResponse != null) {
                                aRNetworkClientWorkerResponse.A03 = bArr;
                            }
                            versionedSharedMemory.unmap(mapReadOnly);
                            versionedSharedMemory.close();
                            IARNetworkClientWorkerHost iARNetworkClientWorkerHost2 = this.A00;
                            if (iARNetworkClientWorkerHost2 != null) {
                                iARNetworkClientWorkerHost2.AII(A1B);
                            }
                        }
                        C2JL c2jl = (C2JL) map.get(A1B);
                        ResponseHandler responseHandler = (ResponseHandler) map2.get(A1B);
                        if (aRNetworkClientWorkerResponse != null && c2jl != null && responseHandler != null) {
                            HttpVersion httpVersion = HttpVersion.HTTP_1_1;
                            int i3 = aRNetworkClientWorkerResponse.A00;
                            String str = aRNetworkClientWorkerResponse.A02;
                            if (str == null) {
                                str = "";
                            }
                            BasicHttpResponse basicHttpResponse = new BasicHttpResponse(httpVersion, i3, str);
                            byte[] bArr2 = aRNetworkClientWorkerResponse.A03;
                            C14360o3.A06(bArr2);
                            basicHttpResponse.setEntity(new InputStreamEntity(new ByteArrayInputStream(bArr2), aRNetworkClientWorkerResponse.A01));
                            c2jl.onSuccess(responseHandler.handleResponse(basicHttpResponse));
                            map2.remove(A1B);
                            map.remove(A1B);
                        }
                    }
                }
            }
        }
    }
}
