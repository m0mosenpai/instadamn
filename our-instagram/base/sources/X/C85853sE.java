package X;

import com.facebook.stash.core.FileStash;

/* renamed from: X.3sE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85853sE extends AbstractC71443Ii {
    public final FileStash A00;
    public final String A01;
    public final C59812oO A02;
    public final C107954te A03;
    public final boolean A04;
    public final /* synthetic */ C59852oS A05;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C85853sE(com.facebook.stash.core.FileStash r2, X.C59812oO r3, X.C59852oS r4, X.C107954te r5, java.lang.String r6, boolean r7) {
        /*
            r1 = this;
            r0 = 3
            X.C14360o3.A0B(r3, r0)
            r1.A05 = r4
            java.io.OutputStream r0 = r2.write(r6)
            X.C14360o3.A07(r0)
            r1.<init>(r0)
            r1.A01 = r6
            r1.A02 = r3
            r1.A00 = r2
            r1.A03 = r5
            r1.A04 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85853sE.<init>(com.facebook.stash.core.FileStash, X.2oO, X.2oS, X.4te, java.lang.String, boolean):void");
    }

    @Override // X.AbstractC71443Ii
    public final void A02() {
        if (!super.A00) {
            try {
                this.A00.remove(this.A01);
            } finally {
                close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r1.A02(r3, "metadata") == null) goto L13;
     */
    @Override // X.AbstractC71443Ii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            r8 = this;
            boolean r0 = r8.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L89
            boolean r0 = r8.A01     // Catch: java.lang.Throwable -> L84
            r5 = 0
            if (r0 == 0) goto L18
            X.2oO r0 = r8.A02     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r8.A01     // Catch: java.lang.Throwable -> L84
            r0.remove(r3)     // Catch: java.lang.Throwable -> L84
            com.facebook.stash.core.FileStash r6 = r8.A00     // Catch: java.lang.Throwable -> L84
        L14:
            r6.remove(r3)     // Catch: java.lang.Throwable -> L84
            goto L7c
        L18:
            X.4te r0 = r8.A03     // Catch: java.lang.Throwable -> L84
            r7 = 1
            if (r0 == 0) goto L33
            X.2oO r4 = r8.A02     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r8.A01     // Catch: java.lang.Throwable -> L84
            org.json.JSONObject r2 = r0.A00     // Catch: java.lang.Throwable -> L84
            X.C14360o3.A07(r2)     // Catch: java.lang.Throwable -> L84
            X.C14360o3.A0B(r3, r5)     // Catch: java.lang.Throwable -> L84
            X.2oM r0 = r4.A00     // Catch: java.lang.Throwable -> L84
            X.1F5 r1 = r0.A00     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "metadata"
            r1.A04(r3, r2, r0)     // Catch: java.lang.Throwable -> L84
            goto L4a
        L33:
            X.2oO r4 = r8.A02     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r8.A01     // Catch: java.lang.Throwable -> L84
            X.C14360o3.A0B(r3, r5)     // Catch: java.lang.Throwable -> L84
            X.2oM r0 = r4.A00     // Catch: java.lang.Throwable -> L84
            X.1F5 r1 = r0.A00     // Catch: java.lang.Throwable -> L84
            r1.A03(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "metadata"
            java.lang.Object r0 = r1.A02(r3, r0)     // Catch: java.lang.Throwable -> L84
            r2 = 1
            if (r0 != 0) goto L4b
        L4a:
            r2 = 0
        L4b:
            com.facebook.stash.core.FileStash r6 = r8.A00     // Catch: java.lang.Throwable -> L84
            java.io.File r1 = r6.getFilePath(r3)     // Catch: java.lang.Throwable -> L84
            java.io.File r0 = r4.insertFile(r3)     // Catch: java.lang.Throwable -> L84
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L71
            boolean r0 = r1.renameTo(r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L78
            X.2oS r0 = r8.A05     // Catch: java.lang.Throwable -> L84
            boolean r1 = r8.A04     // Catch: java.lang.Throwable -> L84
            X.2oO r0 = r0.A00     // Catch: java.lang.Throwable -> L84
            java.io.File r0 = r0.getFilePath(r3)     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.setExecutable(r1)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L78
            goto L80
        L71:
            java.lang.String r1 = "IgDiskStash2"
            java.lang.String r0 = "Failed to commit because of metadata error"
            X.C0w9.A03(r1, r0)     // Catch: java.lang.Throwable -> L84
        L78:
            r4.remove(r3)     // Catch: java.lang.Throwable -> L84
            goto L14
        L7c:
            r8.close()
            return r5
        L80:
            r8.close()
            return r7
        L84:
            r0 = move-exception
            r8.close()
            throw r0
        L89:
            java.lang.String r1 = "Try to operate on an EditorOutputStream that is already closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85853sE.A03():boolean");
    }

    @Override // X.AbstractC71443Ii, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        C59852oS.A00(this.A05, this.A01);
    }
}
