package X;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WUI implements InterfaceC71969XDb {
    public static final long A04 = TimeUnit.MINUTES.toMillis(30);
    public final C0JM A00;
    public final File A01;
    public final File A02;
    public final VY1 A03;

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(3:2|3|(2:5|6))|8|(4:10|(1:12)|13|14)|16|17|13|14) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WUI(X.VY1 r5, java.io.File r6) {
        /*
            r4 = this;
            r3 = 1
            r4.<init>()
            r4.A01 = r6
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L17
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r6.getCanonicalPath()     // Catch: java.lang.Throwable -> L17
            r0.contains(r1)     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = 0
            java.lang.String r1 = "v2"
            r0 = 100
            java.lang.Object[] r1 = X.AbstractC58320PtC.A1a(r1, r0, r3)
            java.lang.String r0 = "%s.ols%d.%d"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r6, r1)
            r4.A02 = r0
            r4.A03 = r5
            java.io.File r1 = r4.A01
            boolean r0 = r1.exists()
            if (r0 == 0) goto L42
            java.io.File r0 = r4.A02
            boolean r0 = r0.exists()
            if (r0 != 0) goto L47
            X.AbstractC03440Gx.A02(r1)
        L42:
            java.io.File r0 = r4.A02     // Catch: X.C61011Rdf -> L47
            X.AbstractC61758RtD.A00(r0)     // Catch: X.C61011Rdf -> L47
        L47:
            X.0Di r0 = X.C03250Di.A00
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WUI.<init>(X.VY1, java.io.File):void");
    }

    @Override // X.InterfaceC71969XDb
    public final void AHb() {
        AbstractC03440Gx.A01(this.A01);
    }

    @Override // X.InterfaceC71969XDb
    public final /* bridge */ /* synthetic */ Collection B2M() {
        C70403WUg c70403WUg = new C70403WUg(this);
        AbstractC03440Gx.A00(c70403WUg, this.A02);
        return Collections.unmodifiableList(c70403WUg.A00);
    }

    @Override // X.InterfaceC71969XDb
    public final void E6q() {
        AbstractC03440Gx.A00(new C70404WUh(this), this.A01);
    }

    @Override // X.InterfaceC71969XDb
    public final long EEf(C69583Vrm c69583Vrm) {
        File file = c69583Vrm.A02.A00;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }
}
