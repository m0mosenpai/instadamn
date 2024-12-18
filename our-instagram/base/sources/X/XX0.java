package X;

import android.content.Context;
import com.facebook.rsys.networkinfo.gen.NetworkInfoProxy;
import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class XX0 extends NetworkInfoProxy {
    public YA4 A00;
    public final Context A01;
    public final UserSession A02;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r0 == null) goto L47;
     */
    @Override // com.facebook.rsys.networkinfo.gen.NetworkInfoProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(com.facebook.rsys.networkinfo.gen.NetworkInfoCallback r10) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            android.content.Context r1 = r9.A01
            com.instagram.common.session.UserSession r0 = r9.A02
            X.YA4 r2 = new X.YA4
            r2.<init>(r1, r0)
            r9.A00 = r2
            monitor-enter(r2)
            com.instagram.common.session.UserSession r4 = r2.A0B     // Catch: java.lang.Throwable -> Lca
            X.0Tz r3 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> Lca
            r0 = 36328791894671147(0x8110d800003f2b, double:3.0378125062688426E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Lc8
            r2.A03()     // Catch: java.lang.Throwable -> Lca
            r2.A06 = r10     // Catch: java.lang.Throwable -> Lca
            X.0qN r0 = X.C18150uz.A0B     // Catch: java.lang.Throwable -> Lca
            r0.A03(r2)     // Catch: java.lang.Throwable -> Lca
            boolean r0 = r2.A0D     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Lb1
            X.1Cg r0 = X.C1CY.A00()     // Catch: java.lang.Throwable -> Lca
            r0.A0d(r2)     // Catch: java.lang.Throwable -> Lca
            r2.A04 = r0     // Catch: java.lang.Throwable -> Lca
            java.util.concurrent.atomic.AtomicReference r0 = r0.A0O     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lca
            X.1EQ r0 = (X.C1EQ) r0     // Catch: java.lang.Throwable -> Lca
            r2.A05 = r0     // Catch: java.lang.Throwable -> Lca
            java.util.LinkedHashMap r3 = X.AbstractC166987dD.A1I()     // Catch: java.lang.Throwable -> Laf
            X.1Cg r0 = r2.A04     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            if (r0 == 0) goto L4b
            r0.A0e(r3)     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
        L4b:
            java.lang.String r0 = "upstream_bandwidth_kbps"
            java.lang.Object r1 = r3.get(r0)     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            if (r0 == 0) goto L8e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            if (r1 == 0) goto L8e
            int r0 = r1.intValue()     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
        L5d:
            r2.A02 = r0     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            java.lang.String r0 = "is_congested"
            java.lang.Object r1 = r3.get(r0)     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            if (r0 == 0) goto L8b
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            if (r1 == 0) goto L8b
            int r0 = r1.intValue()     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
        L71:
            r2.A01 = r0     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            java.lang.String r0 = "data_saver"
            java.lang.Object r1 = r3.get(r0)     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            if (r0 == 0) goto L88
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            if (r1 == 0) goto L88
            int r0 = r1.intValue()     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
        L85:
            r2.A00 = r0     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            goto L91
        L88:
            int r0 = r2.A00     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            goto L85
        L8b:
            int r0 = r2.A01     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            goto L71
        L8e:
            int r0 = r2.A02     // Catch: java.lang.RuntimeException -> L96 java.lang.Throwable -> La6
            goto L5d
        L91:
            com.facebook.rsys.networkinfo.gen.NetworkInfoCallback r0 = r2.A06     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lb1
            goto La2
        L96:
            r3 = move-exception
            java.lang.String r1 = "IgNetworkInfoProxyImpl"
            java.lang.String r0 = "Radio signals: Error retrieving network capabilities from cellInfoProvider"
            X.C0K8.A0F(r1, r0, r3)     // Catch: java.lang.Throwable -> La6
            com.facebook.rsys.networkinfo.gen.NetworkInfoCallback r0 = r2.A06     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lb1
        La2:
            X.YA4.A00(r0, r2)     // Catch: java.lang.Throwable -> Laf
            goto Lb1
        La6:
            r1 = move-exception
            com.facebook.rsys.networkinfo.gen.NetworkInfoCallback r0 = r2.A06     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lae
            X.YA4.A00(r0, r2)     // Catch: java.lang.Throwable -> Laf
        Lae:
            throw r1     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lca
        Lb1:
            boolean r0 = r2.A0E     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Lc8
            java.util.Timer r3 = new java.util.Timer     // Catch: java.lang.Throwable -> Lca
            r3.<init>()     // Catch: java.lang.Throwable -> Lca
            X.YKS r4 = new X.YKS     // Catch: java.lang.Throwable -> Lca
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Lca
            long r5 = r2.A09     // Catch: java.lang.Throwable -> Lca
            long r7 = r2.A0A     // Catch: java.lang.Throwable -> Lca
            r3.schedule(r4, r5, r7)     // Catch: java.lang.Throwable -> Lca
            r2.A07 = r3     // Catch: java.lang.Throwable -> Lca
        Lc8:
            monitor-exit(r2)
            return
        Lca:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XX0.start(com.facebook.rsys.networkinfo.gen.NetworkInfoCallback):void");
    }

    @Override // com.facebook.rsys.networkinfo.gen.NetworkInfoProxy
    public final void stop() {
        YA4 ya4 = this.A00;
        if (ya4 != null) {
            ya4.A03();
            this.A00 = null;
        }
    }

    public XX0(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
    }
}
