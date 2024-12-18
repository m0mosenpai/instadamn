package com.instagram.service.http;

import X.AbstractC50522MSa;
import X.C09170dP;
import X.C0K8;
import X.C14360o3;
import X.C3JQ;
import X.C54191NxV;
import X.InterfaceC26491Qe;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.javaservice.AbstractRequestToken;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class IGTigonAsyncHttpServiceRequestToken extends AbstractRequestToken implements InterfaceC26491Qe {
    public static final C54191NxV Companion = new Object();
    public final String GRAPHQL_IG_TIGON_ERROR_DOMAIN;
    public final String TAG;
    public boolean aborted;
    public C3JQ responseInfo;
    public final ByteArrayOutputStream responseStream;
    public int statusCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGTigonAsyncHttpServiceRequestToken(HybridData hybridData) {
        super(hybridData);
        C14360o3.A0B(hybridData, 1);
        this.GRAPHQL_IG_TIGON_ERROR_DOMAIN = "GraphqlIGTigonErrorDomain";
        this.TAG = "IGTigonAsyncHttpServiceRequestToken";
        this.responseStream = new ByteArrayOutputStream();
    }

    private final native void failure(int i, String str, int i2, String str2);

    private final native void success(int i, String[] strArr, long j, byte[] bArr);

    @Override // com.facebook.tigon.javaservice.AbstractRequestToken
    public void cancel() {
    }

    @Override // com.facebook.tigon.javaservice.AbstractRequestToken
    public void changeHttpPriority(byte b, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r7 == null) goto L21;
     */
    @Override // X.InterfaceC26491Qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onComplete() {
        /*
            r11 = this;
            r5 = r11
            X.3JQ r1 = r11.responseInfo
            java.lang.String r2 = ""
            if (r1 == 0) goto L19
            boolean r0 = r1.A01()
            if (r0 != 0) goto L19
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.NONE
            int r1 = r0.value
            java.lang.String r0 = r11.GRAPHQL_IG_TIGON_ERROR_DOMAIN
            int r4 = r11.statusCode
        L15:
            r11.failure(r1, r0, r4, r2)
            return
        L19:
            boolean r0 = r11.aborted
            r4 = 0
            if (r0 != 0) goto L53
            if (r1 == 0) goto L64
            java.util.List r0 = r1.A03
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            if (r1 == 0) goto L64
            int r0 = r1.size()
            int r0 = r0 * 2
            java.util.ArrayList r3 = X.AbstractC25225BEi.A17(r0)
            java.util.Iterator r2 = r1.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()
            X.1El r1 = (X.C23781El) r1
            java.lang.String r0 = r1.A00
            X.C14360o3.A06(r0)
            r3.add(r0)
            java.lang.String r0 = r1.A01
            X.C14360o3.A06(r0)
            r3.add(r0)
            goto L36
        L53:
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.NONE
            int r1 = r0.value
            java.lang.String r0 = r11.GRAPHQL_IG_TIGON_ERROR_DOMAIN
            goto L15
        L5a:
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r7 = r3.toArray(r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            if (r7 != 0) goto L66
        L64:
            java.lang.String[] r7 = new java.lang.String[r4]
        L66:
            int r6 = r11.statusCode
            java.io.ByteArrayOutputStream r0 = r11.responseStream
            int r0 = r0.size()
            long r8 = (long) r0
            java.io.ByteArrayOutputStream r0 = r11.responseStream
            byte[] r10 = r0.toByteArray()
            X.C14360o3.A07(r10)
            r5.success(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.http.IGTigonAsyncHttpServiceRequestToken.onComplete():void");
    }

    @Override // X.InterfaceC26491Qe
    public void onFailed(IOException iOException) {
        C14360o3.A0B(iOException, 0);
        C0K8.A0F(this.TAG, "Exception found during request", iOException);
        failure(TigonErrorCode.NONE.value, this.GRAPHQL_IG_TIGON_ERROR_DOMAIN, 0, iOException.toString());
    }

    @Override // X.InterfaceC26491Qe
    public void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        if (!this.aborted) {
            try {
                AbstractC50522MSa.A1X(this.responseStream, byteBuffer);
            } catch (Exception e) {
                C0K8.A0F(this.TAG, "Exception while writing response stream", e);
                this.aborted = true;
            }
        }
    }

    @Override // X.InterfaceC26491Qe
    public void onResponseStarted(C3JQ c3jq) {
        C14360o3.A0B(c3jq, 0);
        this.statusCode = c3jq.A01;
        this.responseInfo = c3jq;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NxV, java.lang.Object] */
    static {
        C09170dP.A0C("igtigonasynchttpservice-jni");
    }
}
