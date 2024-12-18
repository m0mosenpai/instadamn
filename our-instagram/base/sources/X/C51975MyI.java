package X;

import android.content.Context;
import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import java.util.List;

/* renamed from: X.MyI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51975MyI extends AbstractC55594OmX implements InterfaceC58018Po4 {
    public static C51975MyI A04;
    public static boolean A05;
    public static final C54115NwD A06 = new Object();
    public final InterfaceExecutorServiceC58314Pt6 A00;
    public final C006802i A01;
    public final AbstractC12990ll A02;
    public final OIX A03;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    @Override // X.InterfaceC58018Po4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D77(java.lang.String r11, int r12, int r13, java.lang.String r14) {
        /*
            r10 = this;
            r4 = 0
            X.AbstractC167007dF.A1E(r11, r4, r14)
            X.02i r3 = r10.A01
            r2 = 79499422(0x4bd109e, float:4.4448947E-36)
            java.lang.String r0 = "on_connected"
            r3.markerPoint(r2, r0)
            com.facebook.proxyservice.observer.ProxyServiceBroadcaster r5 = com.facebook.proxyservice.observer.ProxyServiceBroadcaster.instance
            monitor-enter(r5)
            java.lang.String r1 = r5.clientRegion     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r5)
            java.lang.String r0 = "client_region"
            r3.markerAnnotate(r2, r0, r1)
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 18300791225388138(0x41047900190c6a, double:1.8932565285244832E-307)
            boolean r9 = X.C1AD.A06(r5, r0)
            X.0ll r0 = r10.A02
            com.instagram.service.tigon.IGTigonService r8 = com.instagram.service.tigon.IGTigonService.getTigonService(r0)
            X.C14360o3.A07(r8)
            r0 = 18863741177364639(0x4304790003009f, double:2.115763913804138E-307)
            java.lang.String r7 = X.C1AD.A04(r5, r0)
            r0 = 18863741177430176(0x430479000400a0, double:2.115763913830042E-307)
            java.lang.String r6 = X.C1AD.A04(r5, r0)
            java.lang.String r5 = "http_engine"
            if (r9 == 0) goto L73
            com.facebook.tigon.iface.TigonServiceHolder r1 = r8.mTigonServiceHolder
            boolean r0 = r1 instanceof com.facebook.tigon.tigonmns.TigonMNSServiceHolder
            if (r0 == 0) goto L73
            com.facebook.tigon.tigonmns.TigonMNSServiceHolder r1 = (com.facebook.tigon.tigonmns.TigonMNSServiceHolder) r1
            boolean r1 = r1.setInAppProxyHostAndPortIfSystemProxyIsNotSet(r11, r12, r14)
            java.lang.String r0 = "mns"
        L51:
            r3.markerAnnotate(r2, r5, r0)
            if (r1 != 0) goto L7d
            java.lang.String r1 = "proxy_service"
            java.lang.String r0 = "IGProxyService::stop due to system proxy is already set."
            X.C0K8.A0D(r1, r0)
            java.lang.String r1 = "cancel_reason"
            java.lang.String r0 = "system_proxy_set"
            r3.markerAnnotate(r2, r1, r0)
            r1 = 4
            r3.markerEnd(r2, r1)
            X.OIX r0 = r10.A03
            r0.A00(r1)
            ca.psiphon.PsiphonTunnel r0 = r10.A04
            r0.stop()
            return
        L73:
            X.C23261Bg.A00()
            boolean r1 = X.C63188Sen.A00(r11, r7, r6, r14, r12)
            java.lang.String r0 = "liger"
            goto L51
        L7d:
            X.0vz r1 = X.AbstractC12960li.A00
            X.18V r0 = X.C18V.A01
            if (r0 == 0) goto L90
            X.C14360o3.A0B(r1, r4)
            X.1AC r0 = r0.A01()
            X.AbstractC202778xv.A00()
            X.C1AC.A00(r0, r4)
        L90:
            r1 = 2
            r3.markerEnd(r2, r1)
            X.OIX r0 = r10.A03
            r0.A00(r1)
            return
        L9a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51975MyI.D77(java.lang.String, int, int, java.lang.String):void");
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final String getAppName() {
        return "IG4A";
    }

    @Override // ca.psiphon.PsiphonTunnel.HostLogger
    public final void onDiagnosticMessage(String str) {
        C14360o3.A0B(str, 0);
        OIX oix = this.A03;
        if (oix.A02) {
            List A0R = AbstractC001900j.A0R(str, new String[]{": "}, 2);
            if (A0R.size() < 2) {
                oix.A00.markerPoint(79496324, AbstractC167007dF.A0h(AbstractC002300n.A0d(str, " ", "_", false)));
                return;
            }
            String A1I = AbstractC25226BEj.A1I(A0R, 0);
            String A1I2 = AbstractC25226BEj.A1I(A0R, 1);
            C006802i c006802i = oix.A00;
            c006802i.markerPoint(79496324, A1I);
            c006802i.markerAnnotate(79496324, A1I, A1I2);
            oix.A01.add(str);
        }
    }

    @Override // X.InterfaceC58018Po4
    public final void DAa() {
        C63188Sen.A00("", null, null, null, 0);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final Context getContext() {
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        return context;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    @Override // ca.psiphon.PsiphonTunnel.HostService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getPsiphonConfig() {
        /*
            r8 = this;
            android.content.Context r7 = X.AbstractC12290kX.A00
            X.C14360o3.A07(r7)
            android.content.res.AssetManager r1 = r7.getAssets()
            java.lang.String r0 = "proxyservice_config.json"
            java.io.InputStream r3 = r1.open(r0)
            java.lang.String r2 = "proxy_service"
            r6 = 0
            r4 = 1
            r5 = 0
            java.lang.String r1 = X.AbstractC12880la.A04(r7)     // Catch: java.lang.NumberFormatException -> L37 java.lang.RuntimeException -> L39 java.lang.Throwable -> L76
            if (r1 == 0) goto L52
            java.lang.String r0 = "."
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.NumberFormatException -> L37 java.lang.RuntimeException -> L39 java.lang.Throwable -> L76
            java.util.List r0 = X.AbstractC001900j.A0R(r1, r0, r6)     // Catch: java.lang.NumberFormatException -> L37 java.lang.RuntimeException -> L39 java.lang.Throwable -> L76
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)     // Catch: java.lang.NumberFormatException -> L37 java.lang.RuntimeException -> L39 java.lang.Throwable -> L76
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L37 java.lang.RuntimeException -> L39 java.lang.Throwable -> L76
            if (r0 == 0) goto L52
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)     // Catch: java.lang.NumberFormatException -> L37 java.lang.RuntimeException -> L39 java.lang.Throwable -> L76
            if (r0 == 0) goto L52
            int r5 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L37 java.lang.RuntimeException -> L39 java.lang.Throwable -> L76
            goto L52
        L37:
            r0 = move-exception
            goto L45
        L39:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "Failed to get version name (%s)."
            goto L4f
        L45:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "String to int failed (%s)."
        L4f:
            X.C0K8.A0O(r2, r0, r1)     // Catch: java.lang.Throwable -> L76
        L52:
            X.C14360o3.A0A(r3)     // Catch: java.lang.Throwable -> L76
            byte[] r2 = X.AbstractC54919OQu.A01(r3)     // Catch: java.lang.Throwable -> L76
            java.nio.charset.Charset r0 = X.C15W.A05     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L76
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L76
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = X.AbstractC166997dE.A0z(r1, r0)     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L75
            r3.close()
        L75:
            return r0
        L76:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            X.C20I.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51975MyI.getPsiphonConfig():java.lang.String");
    }

    public C51975MyI(InterfaceExecutorServiceC58314Pt6 interfaceExecutorServiceC58314Pt6, C006802i c006802i, AbstractC12990ll abstractC12990ll) {
        super(interfaceExecutorServiceC58314Pt6);
        this.A00 = interfaceExecutorServiceC58314Pt6;
        this.A01 = c006802i;
        this.A02 = abstractC12990ll;
        this.A03 = new OIX(c006802i);
        ProxyServiceBroadcaster.instance.registerObserver(this);
    }
}
