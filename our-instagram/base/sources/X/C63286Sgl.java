package X;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: X.Sgl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63286Sgl {
    public final void A03(L9M l9m, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, l9m, str);
        String A00 = A00(l9m, str);
        if (A00.length() > 0) {
            URLConnection A16 = AbstractC58320PtC.A16(AnonymousClass001.A0R(AbstractC43591JPw.A00(1040), A00));
            C14360o3.A0C(A16, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) A16;
            httpURLConnection.setRequestMethod("DELETE");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(A1R);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setRequestProperty("Authorization", C47980LIv.A00(l9m));
            C0K8.A0D("GoogleDriveIntegration", AnonymousClass001.A0O("response code for deleting :", httpURLConnection.getResponseCode()));
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        r1 = X.AbstractC001900j.A0K(r1, ":", r1);
        r2 = X.AbstractC25228BEl.A1A(X.AbstractC002300n.A0d(X.AbstractC001900j.A0L(r1, com.facebook.traffic.knob.InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, r1), "\"", "", false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        r4.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(X.L9M r4, java.lang.String r5) {
        /*
            java.lang.String r1 = "https://www.googleapis.com/drive/v3/files?q=name%3D'"
            java.lang.String r0 = "'&spaces=appDataFolder"
            java.lang.String r0 = X.AnonymousClass001.A0g(r1, r5, r0)
            java.net.URLConnection r3 = X.AbstractC58320PtC.A16(r0)
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.C14360o3.A0C(r3, r0)
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)
            r5 = 0
            r3.setUseCaches(r5)
            r0 = 1
            r3.setDoInput(r0)
            r3.setDoOutput(r5)
            java.lang.String r1 = X.C47980LIv.A00(r4)
            java.lang.String r0 = "Authorization"
            r3.setRequestProperty(r0, r1)
            int r4 = r3.getResponseCode()
            r0 = 200(0xc8, float:2.8E-43)
            boolean r0 = X.AbstractC167007dF.A1P(r4, r0)
            if (r0 == 0) goto L8e
            r0 = 1939458693(0x7399ca85, float:2.4369171E31)
            X.0fR r0 = X.AbstractC09810fe.A00(r3, r0)
            java.io.BufferedReader r4 = X.AbstractC58320PtC.A0h(r0)
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L87
        L47:
            if (r1 == 0) goto L73
            java.lang.String r0 = "id"
            boolean r0 = X.AbstractC001900j.A0a(r1, r0, r5)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6a
            java.lang.String r0 = ":"
            java.lang.String r1 = X.AbstractC001900j.A0K(r1, r0, r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ","
            java.lang.String r2 = X.AbstractC001900j.A0L(r1, r0, r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = "\""
            java.lang.String r0 = ""
            java.lang.String r0 = X.AbstractC002300n.A0d(r2, r1, r0, r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = X.AbstractC25228BEl.A1A(r0)     // Catch: java.lang.Throwable -> L87
            goto L6f
        L6a:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L87
            goto L47
        L6f:
            r4.close()
            goto L78
        L73:
            r4.close()
            java.lang.String r2 = ""
        L78:
            java.lang.String r0 = "response data for getting file id :"
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r2)
            java.lang.String r0 = "GoogleDriveIntegration"
            X.C0K8.A0D(r0, r1)
            r3.disconnect()
            return r2
        L87:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            X.C20I.A00(r4, r1)
            throw r0
        L8e:
            java.lang.String r2 = "Bad request: "
            java.lang.String r1 = " with error message: "
            java.io.InputStream r0 = r3.getErrorStream()
            X.C14360o3.A07(r0)
            java.lang.String r0 = A01(r0)
            java.lang.String r1 = X.AnonymousClass001.A05(r4, r2, r1, r0)
            java.lang.String r0 = "GoogleDriveIntegration"
            X.C0K8.A0D(r0, r1)
            java.io.IOException r0 = X.AbstractC58320PtC.A0i(r2, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63286Sgl.A00(X.L9M, java.lang.String):java.lang.String");
    }

    public static final String A02(HttpURLConnection httpURLConnection, int i) {
        boolean z;
        InputStream errorStream;
        if (i == 200) {
            z = true;
            errorStream = AbstractC09810fe.A00(httpURLConnection, -1778398725);
        } else {
            z = false;
            errorStream = httpURLConnection.getErrorStream();
        }
        C14360o3.A0A(errorStream);
        String A01 = A01(errorStream);
        if (z) {
            return A01;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(i);
        A1C.append(":(");
        throw MSW.A0y(AbstractC25236BEt.A0Y(A01, A1C));
    }

    public static final String A01(InputStream inputStream) {
        BufferedReader A0h = AbstractC58320PtC.A0h(inputStream);
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (String readLine = A0h.readLine(); readLine != null; readLine = A0h.readLine()) {
                stringBuffer.append(readLine);
            }
            String obj = stringBuffer.toString();
            A0h.close();
            return obj;
        } finally {
        }
    }
}
