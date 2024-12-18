package X;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.StQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63770StQ implements InterfaceC65570Tn3 {
    public InputStream A00;
    public final android.net.Uri A01;
    public final SX0 A02;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return InputStream.class;
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x002a, code lost:
    
        if (r2 == null) goto L18;
     */
    @Override // X.InterfaceC65570Tn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ChQ(X.EnumC61107RfN r11, X.InterfaceC65471Tko r12) {
        /*
            r10 = this;
            X.SX0 r7 = r10.A02     // Catch: java.io.FileNotFoundException -> La4
            android.net.Uri r6 = r10.A01     // Catch: java.io.FileNotFoundException -> La4
            java.lang.String r5 = "ThumbStreamOpener"
            r1 = 0
            X.Ti0 r0 = r7.A02     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1d
            android.database.Cursor r2 = r0.E7M(r6)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1d
            if (r2 == 0) goto L2f
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.SecurityException -> L1e java.lang.Throwable -> L23
            if (r0 == 0) goto L2c
            r0 = 0
            java.lang.String r1 = r2.getString(r0)     // Catch: java.lang.SecurityException -> L1e java.lang.Throwable -> L23
            goto L2c
        L1b:
            r0 = move-exception
            goto L6c
        L1d:
            r2 = r1
        L1e:
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r0 = move-exception
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.io.FileNotFoundException -> La4
            goto L6c
        L2a:
            if (r2 == 0) goto L2f
        L2c:
            r2.close()     // Catch: java.io.FileNotFoundException -> La4
        L2f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.io.FileNotFoundException -> La4
            r4 = 0
            if (r0 != 0) goto L6d
            java.io.File r3 = X.AbstractC166987dD.A11(r1)     // Catch: java.io.FileNotFoundException -> La4
            boolean r0 = r3.exists()     // Catch: java.io.FileNotFoundException -> La4
            if (r0 == 0) goto L6d
            r8 = 0
            long r1 = r3.length()     // Catch: java.io.FileNotFoundException -> La4
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6d
            android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch: java.io.FileNotFoundException -> La4
            android.content.ContentResolver r0 = r7.A00     // Catch: java.lang.NullPointerException -> L55 java.io.FileNotFoundException -> La4
            java.io.InputStream r4 = r0.openInputStream(r3)     // Catch: java.lang.NullPointerException -> L55 java.io.FileNotFoundException -> La4
            goto L6d
        L55:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.io.FileNotFoundException -> La4
            java.lang.String r0 = "NPE opening uri: "
            r1.append(r0)     // Catch: java.io.FileNotFoundException -> La4
            r1.append(r6)     // Catch: java.io.FileNotFoundException -> La4
            java.lang.String r0 = " -> "
            java.io.FileNotFoundException r0 = X.AbstractC58323PtF.A0c(r3, r0, r1)     // Catch: java.io.FileNotFoundException -> La4
            java.lang.Throwable r0 = r0.initCause(r2)     // Catch: java.io.FileNotFoundException -> La4
        L6c:
            throw r0     // Catch: java.io.FileNotFoundException -> La4
        L6d:
            r3 = -1
            if (r4 == 0) goto L9e
            r2 = 0
            android.content.ContentResolver r0 = r7.A00     // Catch: java.lang.Throwable -> L8d java.lang.Throwable -> L92
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Throwable -> L92
            java.util.List r1 = r7.A04     // Catch: java.lang.Throwable -> L8d java.lang.Throwable -> L92
            X.SiK r0 = r7.A03     // Catch: java.lang.Throwable -> L8d java.lang.Throwable -> L92
            int r1 = X.AbstractC63044SbN.A00(r0, r2, r1)     // Catch: java.lang.Throwable -> L8d java.lang.Throwable -> L92
            if (r2 == 0) goto L84
            r2.close()     // Catch: java.io.IOException -> L84 java.io.FileNotFoundException -> La4
        L84:
            if (r1 == r3) goto L9e
            X.RdX r0 = new X.RdX     // Catch: java.io.FileNotFoundException -> La4
            r0.<init>(r4, r1)     // Catch: java.io.FileNotFoundException -> La4
            r4 = r0
            goto L9e
        L8d:
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch: java.lang.Throwable -> L92
            goto L99
        L92:
            r0 = move-exception
            if (r2 == 0) goto L98
            r2.close()     // Catch: java.io.IOException -> L98 java.io.FileNotFoundException -> La4
        L98:
            throw r0     // Catch: java.io.FileNotFoundException -> La4
        L99:
            if (r2 == 0) goto L9e
            r2.close()     // Catch: java.io.IOException -> L9e java.io.FileNotFoundException -> La4
        L9e:
            r10.A00 = r4     // Catch: java.io.FileNotFoundException -> La4
            r12.D9H(r4)     // Catch: java.io.FileNotFoundException -> La4
            return
        La4:
            r2 = move-exception
            r1 = 3
            java.lang.String r0 = "MediaStoreThumbFetcher"
            android.util.Log.isLoggable(r0, r1)
            r12.DPj(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63770StQ.ChQ(X.RfN, X.Tko):void");
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
        InputStream inputStream = this.A00;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public C63770StQ(android.net.Uri uri, SX0 sx0) {
        this.A01 = uri;
        this.A02 = sx0;
    }

    public static C63770StQ A00(Context context, android.net.Uri uri, Ti0 ti0) {
        return new C63770StQ(uri, new SX0(context.getContentResolver(), ti0, ComponentCallbacks2C63416Sju.A00(context).A02, ((SQE) ComponentCallbacks2C63416Sju.A00(context).A00.A05.get()).A01()));
    }
}
