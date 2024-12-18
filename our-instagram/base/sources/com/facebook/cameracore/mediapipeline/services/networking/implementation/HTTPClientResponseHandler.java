package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.AbstractC58318PtA;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes10.dex */
public class HTTPClientResponseHandler implements ResponseHandler {
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse, java.lang.Object] */
    @Override // org.apache.http.client.ResponseHandler
    public final /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        String[] strArr;
        ?? obj = new Object();
        obj.statusCode = httpResponse.getStatusLine().getStatusCode();
        Header[] allHeaders = httpResponse.getAllHeaders();
        if (allHeaders == null) {
            obj.headerNames = new String[0];
            strArr = new String[0];
        } else {
            int length = allHeaders.length;
            String[] strArr2 = new String[length];
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr2[i] = allHeaders[i].getName();
                strArr[i] = allHeaders[i].getValue();
            }
            obj.headerNames = strArr2;
        }
        obj.headerValues = strArr;
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = content.read(bArr, 0, 1024);
            if (read != -1) {
                A0U.write(bArr, 0, read);
            } else {
                A0U.flush();
                content.close();
                obj.content = A0U.toByteArray();
                return obj;
            }
        }
    }
}
