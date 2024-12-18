package X;

import com.facebook.cameracore.mediapipeline.services.networking.implementation.instagram.IgNetworkClientWorkerImplHost;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* renamed from: X.TWp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64848TWp implements ResponseHandler {
    public final /* synthetic */ IgNetworkClientWorkerImplHost A00;
    public final /* synthetic */ String A01;

    public C64848TWp(IgNetworkClientWorkerImplHost igNetworkClientWorkerImplHost, String str) {
        this.A00 = igNetworkClientWorkerImplHost;
        this.A01 = str;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        Map map = this.A00.A00;
        String str = this.A01;
        C14360o3.A0A(httpResponse);
        return map.put(str, httpResponse);
    }
}
