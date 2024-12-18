package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TEj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64447TEj implements InterfaceC65449TkL {
    public final /* synthetic */ Rd3 A00;
    public final /* synthetic */ UserSession A01;

    public C64447TEj(Rd3 rd3, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = rd3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    @Override // X.InterfaceC65449TkL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FE4(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            X.1Ux r0 = X.C27431Uw.A02
            X.1Uw r1 = r0.A00()
            com.instagram.common.session.UserSession r0 = r7.A01
            X.TFz r1 = r1.A00(r0)
            android.app.Application r0 = r1.A01
            X.Shy r0 = X.C64489TFz.A00(r0, r1)
            X.Q21 r6 = r0.A04()
            if (r6 == 0) goto L61
            com.facebook.react.bridge.WritableNativeMap r5 = X.AbstractC58321PtD.A0c()
            X.Rd3 r4 = r7.A00
            java.util.Set r0 = X.Rb0.A07
            java.lang.String r0 = r4.A02
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L2e
        L2d:
            r1 = 1
        L2e:
            java.lang.String r0 = "success"
            if (r1 == 0) goto L51
            r5.putBoolean(r0, r3)
        L36:
            java.lang.Class<com.facebook.react.modules.core.RCTNativeAppEventEmitter> r0 = com.facebook.react.modules.core.RCTNativeAppEventEmitter.class
            com.facebook.react.bridge.JavaScriptModule r1 = r6.A03(r0)
            com.facebook.react.modules.core.RCTNativeAppEventEmitter r1 = (com.facebook.react.modules.core.RCTNativeAppEventEmitter) r1
            java.lang.String r0 = "in_app_browser_close_event"
            r1.emit(r0, r5)
            X.TFx r1 = r4.A01
            if (r1 != 0) goto L5c
            java.lang.String r0 = "callbackHelper"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L51:
            r5.putBoolean(r0, r2)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "returnURL"
            r5.putString(r0, r1)
            goto L36
        L5c:
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64447TEj.FE4(java.lang.String, boolean):void");
    }
}
