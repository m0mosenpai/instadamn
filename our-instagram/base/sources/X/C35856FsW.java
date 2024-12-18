package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.FsW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35856FsW implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public C35856FsW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r4 != null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L65;
                case 2: goto L5b;
                case 3: goto L50;
                case 4: goto L5b;
                case 5: goto L3b;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r3.A01
            X.66r r2 = (X.C1346766r) r2
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.6Ly r0 = X.C137766Ly.A0L
        Ld:
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L14
        L11:
            r2.A02(r0)
        L14:
            r2.A00()
        L17:
            return
        L18:
            java.lang.Object r2 = r3.A01
            X.66r r2 = (X.C1346766r) r2
            boolean r0 = X.AbstractC166987dD.A1a(r4)
            if (r0 == 0) goto L2f
            java.lang.Boolean r0 = X.AbstractC166997dE.A0b()
            X.5zK r1 = new X.5zK
            r1.<init>(r0)
        L2b:
            r2.A02(r1)
            goto L14
        L2f:
            java.lang.String r0 = "MailboxTam returns false when running tam_client_request_participants_add"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            X.Lcn r1 = new X.Lcn
            r1.<init>(r0)
            goto L2b
        L3b:
            java.lang.Object r2 = r3.A01
            X.66r r2 = (X.C1346766r) r2
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.6Ly r0 = X.C137766Ly.A0L
            java.lang.Object r1 = r4.value
            if (r1 == 0) goto L4d
            X.4JL r0 = new X.4JL
            r0.<init>(r1)
            goto L11
        L4d:
            X.4JK r0 = X.C4JK.A00
            goto L11
        L50:
            java.lang.Object r2 = r3.A01
            X.66r r2 = (X.C1346766r) r2
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            X.6Ly r0 = X.C137766Ly.A0L
            if (r4 == 0) goto L14
            goto Ld
        L5b:
            java.lang.Object r2 = r3.A01
            X.66r r2 = (X.C1346766r) r2
            X.6Ly r0 = X.C137766Ly.A0L
            r2.A02(r4)
            goto L14
        L65:
            java.lang.Object r1 = r3.A01
            X.Fbr r1 = (X.C35018Fbr) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L17
            int r0 = X.AbstractC166987dD.A0H(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            return
        L7a:
            java.lang.Object r1 = r3.A01
            X.Fbr r1 = (X.C35018Fbr) r1
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r0 = r4.value
            if (r0 == 0) goto L17
            int r0 = X.AbstractC166987dD.A0H(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35856FsW.onCompletion(java.lang.Object):void");
    }
}
