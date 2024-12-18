package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes10.dex */
public final class SMT {
    public final Context A00;
    public final AbstractC61599RqO A01;
    public final InterfaceC65489TlA A02;
    public final C1Ro A03;
    public final InterfaceC08830cm A04;

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a0, code lost:
    
        if (r0.versionCode == 1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A00() {
        /*
            r5 = this;
            android.content.Context r1 = r5.A00
            X.RqO r0 = r5.A01
            java.lang.String r2 = r0.A00()
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            if (r1 == 0) goto L30
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r3 = 0
            if (r4 == 0) goto L30
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo
            if (r0 == 0) goto L30
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L30
            java.lang.String r0 = "preloaded-stub"
            boolean r0 = r1.getBoolean(r0, r3)
            r1 = 1
            if (r0 == 0) goto L2d
            int r0 = r4.versionCode
            if (r0 != r1) goto L2d
            r3 = 1
        L2d:
            r0 = r3 ^ 1
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L36
            java.lang.Integer r0 = X.C05F.A0N
            return r0
        L36:
            X.1Ro r3 = r5.A03
            if (r3 != 0) goto L3d
            java.lang.Integer r0 = X.C05F.A00
            return r0
        L3d:
            X.1TT r1 = r3.A00()
            boolean r0 = r1.A06
            if (r0 != 0) goto L48
            java.lang.Integer r0 = X.C05F.A15
            return r0
        L48:
            boolean r0 = r1.A05
            if (r0 != 0) goto L62
            X.1TO r0 = r1.A01
            if (r0 == 0) goto L5f
            boolean r0 = r0.A05
            if (r0 == 0) goto L5f
            X.1SI r0 = r1.A00
            if (r0 == 0) goto L5c
            boolean r0 = r0.A05
            if (r0 != 0) goto La8
        L5c:
            java.lang.Integer r0 = X.C05F.A0j
            return r0
        L5f:
            java.lang.Integer r0 = X.C05F.A0u
            return r0
        L62:
            X.1Rv r4 = r3.A03
            X.1TT r0 = r3.A00()
            X.1TO r1 = r0.A01
            if (r1 == 0) goto L94
            boolean r0 = r1.A05
            if (r0 == 0) goto L94
            java.util.Set r1 = r1.A04
            X.1TL r0 = X.C1TL.INSTALL
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L94
        L7a:
            r0 = 1
        L7b:
            if (r0 == 0) goto La8
            r0 = 19
            boolean r0 = r3.A01(r0)
            if (r0 == 0) goto La5
            X.0cm r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.SLa r0 = (X.C62664SLa) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto La5
            java.lang.Integer r0 = X.C05F.A01
            return r0
        L94:
            r1 = 0
            android.content.pm.PackageManager r0 = r4.A00     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La3
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La3
            r1 = 1
            if (r0 == 0) goto La3
            int r0 = r0.versionCode
            if (r0 != r1) goto La3
            goto L7a
        La3:
            r0 = 0
            goto L7b
        La5:
            java.lang.Integer r0 = X.C05F.A0Y
            return r0
        La8:
            java.lang.Integer r0 = X.C05F.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMT.A00():java.lang.Integer");
    }

    public SMT(Context context, AbstractC61599RqO abstractC61599RqO, InterfaceC65489TlA interfaceC65489TlA) {
        C1Ro c1Ro;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            c1Ro = null;
        } else {
            c1Ro = new C1Ro(context, packageManager);
        }
        C64816TVg c64816TVg = new C64816TVg(context, 0);
        this.A00 = context;
        this.A01 = abstractC61599RqO;
        this.A03 = c1Ro;
        this.A04 = c64816TVg;
        this.A02 = interfaceC65489TlA;
    }
}
