package com.instagram.service.http;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC43593JPy;
import X.C05F;
import X.C126615nx;
import X.C14360o3;
import X.C1JO;
import X.C1QW;
import X.C23781El;
import X.C26371Ps;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.javaservice.JavaBackedTigonService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class IGTigonAsyncHttpService implements JavaBackedTigonService {
    public final AbstractC12990ll session;

    public IGTigonAsyncHttpService(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.session = abstractC12990ll;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // com.facebook.tigon.javaservice.JavaBackedTigonService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void submitHttpRequest(com.facebook.tigon.javaservice.AbstractRequestToken r10, com.facebook.tigon.iface.TigonRequest r11, byte[] r12) {
        /*
            r9 = this;
            r7 = 0
            boolean r6 = X.AbstractC167007dF.A1R(r7, r10, r11)
            r5 = 2
            X.C14360o3.A0B(r12, r5)
            boolean r0 = r10 instanceof com.instagram.service.http.IGTigonAsyncHttpServiceRequestToken
            if (r0 == 0) goto L73
            com.instagram.service.http.IGTigonAsyncHttpServiceRequestToken r10 = (com.instagram.service.http.IGTigonAsyncHttpServiceRequestToken) r10
            if (r10 == 0) goto L73
            X.1C6 r4 = X.C1C6.A00()
            X.1QW r8 = r9.createHttpRequest(r11, r12)
            X.1QX r2 = new X.1QX
            r2.<init>()
            X.1Bw r0 = X.EnumC23341Bw.GraphQL
            r2.A04 = r0
            X.1S3 r0 = X.C1S2.A05
            java.lang.Object r0 = r11.getLayerInformation(r0)
            X.1Rw r0 = (X.C26861Rw) r0
            if (r0 == 0) goto L70
            java.util.Map r1 = r0.A00
            r0 = 2935(0xb77, float:4.113E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r1 = X.AbstractC166987dD.A1A(r0, r1)
            if (r1 == 0) goto L70
            java.lang.String r0 = "fetch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L65
            X.1Ef r0 = X.C1Ef.OnScreen
        L44:
            r2.A03 = r0
            java.lang.Integer r3 = X.C05F.A01
            r2.A07 = r3
            X.1QY r2 = r2.A00()
            int r1 = r11.startupStatusOnAdded()
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r6) goto L5f
            r0 = r3
            if (r1 == r5) goto L5f
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r7) goto L5f
            java.lang.Integer r0 = X.C05F.A0N
        L5f:
            r2.A03 = r0
            r4.A02(r10, r8, r2)
            return
        L65:
            java.lang.String r0 = "prefetch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L70
            X.1Ef r0 = X.C1Ef.OffScreen
            goto L44
        L70:
            X.1Ef r0 = X.C1Ef.Undefined
            goto L44
        L73:
            java.lang.String r0 = "TigonRequestToken is not TigonAsyncHttpServiceRequestToken type"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.http.IGTigonAsyncHttpService.submitHttpRequest(com.facebook.tigon.javaservice.AbstractRequestToken, com.facebook.tigon.iface.TigonRequest, byte[]):void");
    }

    private final C1QW createHttpRequest(TigonRequest tigonRequest, byte[] bArr) {
        Integer num;
        C26371Ps c26371Ps = new C26371Ps(new C1JO(this.session));
        String method = tigonRequest.method();
        if (method.equals("HEAD")) {
            num = C05F.A00;
        } else if (method.equals("POST")) {
            num = C05F.A01;
        } else if (method.equals("PATCH")) {
            num = C05F.A0C;
        } else if (method.equals("GET")) {
            num = C05F.A0N;
        } else if (method.equals("DELETE")) {
            num = C05F.A0Y;
        } else {
            throw AbstractC166987dD.A12(method);
        }
        c26371Ps.A01(num);
        c26371Ps.A02(tigonRequest.url());
        Map headers = tigonRequest.headers();
        ArrayList A12 = AbstractC166997dE.A12(headers, 0);
        Iterator A122 = AbstractC43593JPy.A12(headers);
        while (A122.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A122);
            A12.add(new C23781El(A1B, AbstractC166987dD.A1A(A1B, headers)));
        }
        List list = c26371Ps.A06;
        list.clear();
        list.addAll(A12);
        c26371Ps.A00 = new C126615nx(new C23781El(AbstractC111324zv.A00(610), AbstractC111324zv.A00(729)), bArr);
        c26371Ps.A05 = tigonRequest.retryable();
        if (tigonRequest.replaySafe()) {
            c26371Ps.A04 = true;
        }
        C1QW A00 = c26371Ps.A00();
        byte b = tigonRequest.httpPriority().A00;
        boolean z = tigonRequest.httpPriority().A01;
        A00.A00 = b;
        A00.A03 = z;
        return A00;
    }
}
