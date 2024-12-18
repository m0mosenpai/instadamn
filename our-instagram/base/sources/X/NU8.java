package X;

import com.instagram.rtc.rsys.proxies.EngineProxy;

/* loaded from: classes9.dex */
public final class NU8 extends EngineProxy {
    public final /* synthetic */ C54996OUf A00;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r6 != null) goto L19;
     */
    @Override // com.instagram.rtc.rsys.proxies.EngineProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void stateChangedHandler(com.instagram.rtc.rsys.models.EngineModel r9) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            X.OUf r4 = r8.A00
            org.webrtc.EglBase$Context r0 = X.C54996OUf.A0m
            boolean r0 = r4.A06
            if (r0 != 0) goto L2a
            r0 = 1
            r4.A06 = r0
            X.OId r5 = r4.A0F
            java.lang.String r1 = r4.A0f
            java.lang.Long r0 = r5.A00
            if (r0 == 0) goto L2a
            long r2 = r0.longValue()
            java.lang.String r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L2a
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r1 = r5.A02
            java.lang.String r0 = "first_engine_model"
            r1.flowMarkPoint(r2, r0)
        L2a:
            com.instagram.rtc.rsys.models.IgCallModel r0 = r9.callModel
            r7 = 0
            if (r0 == 0) goto Lbb
            java.lang.String r6 = r0.serverInfoData
        L31:
            com.instagram.model.rtc.RtcCallKey r0 = r4.A05
            if (r0 == 0) goto L96
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L96
            int r0 = r0.length()
            if (r0 == 0) goto L96
            if (r6 == 0) goto L46
        L41:
            com.instagram.model.rtc.RtcCallKey r7 = new com.instagram.model.rtc.RtcCallKey
            r7.<init>(r6)
        L46:
            r4.A05 = r7
            int r1 = r9.state
            r6 = 0
            r5 = 4
            r3 = 2
            r2 = 1
            if (r1 == r2) goto L7b
            if (r1 == r3) goto L7b
            r0 = 3
            if (r1 == r0) goto L78
            if (r1 == r5) goto L78
            java.lang.Integer r2 = X.C05F.A0Y
        L59:
            com.instagram.rtc.rsys.models.IgCallModel r0 = r9.callModel
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.serverInfoData
            if (r0 == 0) goto L66
            com.instagram.model.rtc.RtcCallKey r6 = new com.instagram.model.rtc.RtcCallKey
            r6.<init>(r0)
        L66:
            java.lang.Integer r1 = r4.A0e
            X.MwP r0 = new X.MwP
            r0.<init>(r6, r2, r1)
            X.Mti r1 = new X.Mti
            r1.<init>(r9, r0)
            X.0sJ r0 = r4.A0i
            r0.invoke(r1)
            return
        L78:
            java.lang.Integer r2 = X.C05F.A0N
            goto L59
        L7b:
            com.instagram.rtc.rsys.models.IgCallModel r0 = r9.callModel
            if (r0 == 0) goto L93
            int r1 = r0.inCallState
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L93
            if (r1 == r5) goto L90
            if (r1 == r2) goto L90
            if (r1 != r3) goto L93
            java.lang.Integer r2 = X.C05F.A01
            goto L59
        L90:
            java.lang.Integer r2 = X.C05F.A00
            goto L59
        L93:
            java.lang.Integer r2 = X.C05F.A0C
            goto L59
        L96:
            if (r6 == 0) goto L46
            X.OId r5 = r4.A0F
            java.lang.String r1 = r4.A0f
            java.lang.Long r0 = r5.A00
            if (r0 == 0) goto L41
            long r2 = r0.longValue()
            java.lang.String r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L41
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r1 = r5.A02
            java.lang.String r0 = "call_connected"
            r1.flowMarkPoint(r2, r0)
            r1.flowEndSuccess(r2)
            r5.A00 = r7
            r5.A01 = r7
            goto L41
        Lbb:
            r6 = r7
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU8.stateChangedHandler(com.instagram.rtc.rsys.models.EngineModel):void");
    }

    public NU8(C54996OUf c54996OUf) {
        this.A00 = c54996OUf;
    }
}
