package X;

import android.content.Context;

/* renamed from: X.13R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13R extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;
    public final boolean A02;

    public C13R(Context context, C211211o c211211o, boolean z) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = c211211o;
        this.A02 = z;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "PandoGraphQLInitializer";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(2:5|(7:7|(1:9)|10|11|(1:13)|14|15))|17|18|19|(1:21)|11|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        X.C0K8.A0M("IGPandoStaticGraphQLInitializer", "Failed to initialize Pando persisted query provider for '%s'!", r1, "ig4a-instagram-schema");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    @Override // X.AbstractC211911v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            r8 = this;
            boolean r0 = r8.A02
            if (r0 == 0) goto L84
            X.11o r0 = r8.A01
            X.11v r0 = r0.A00()
            X.122 r0 = (X.AnonymousClass122) r0
            X.0ll r0 = r0.A08()
            com.instagram.common.session.UserSession r5 = X.AbstractC03270Dk.A01(r0)
            android.content.Context r7 = r8.A00
            X.1Iz r4 = X.AbstractC24641Ih.A02
            X.C14360o3.A07(r4)
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            java.lang.String r6 = "ig4a-instagram-schema"
            if (r5 == 0) goto L85
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342157485985565291(0x208103d300310a6b, double:4.060902651306571E-152)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L85
            r0 = 36317320038126645(0x81066900111435, double:3.030557657996641E-306)
            boolean r3 = X.C18U.A06(r2, r5, r0)
            r1 = 2
            X.Pbh r0 = new X.Pbh
            r0.<init>(r6, r7, r1)
            X.0sx r2 = X.AbstractC09440dt.A01(r0)
            X.1uI r1 = new X.1uI
            r1.<init>(r2)
            java.util.concurrent.ConcurrentHashMap r0 = X.AbstractC40511uK.A00
            r0.put(r6, r1)
            r1 = 3
            if (r3 == 0) goto L52
            r1 = 2
        L52:
            X.1uL r0 = new X.1uL
            r0.<init>(r1)
            r4.Ep8(r0)
        L5a:
            X.0Tz r6 = X.C06090Tz.A05
            r0 = 36317320038126645(0x81066900111435, double:3.030557657996641E-306)
            boolean r3 = X.C18U.A06(r6, r5, r0)
            r0 = 36326670180825118(0x810eea0000381e, double:3.036470725889158E-306)
            boolean r2 = X.C18U.A06(r6, r5, r0)
            r0 = 36326244979128085(0x810e8700013715, double:3.0362018266238044E-306)
            X.C18U.A06(r6, r5, r0)
            X.AbstractC40541uN.A00 = r2
            r1 = 3
            if (r3 == 0) goto L7c
            r1 = 2
        L7c:
            X.1uO r0 = new X.1uO
            r0.<init>(r1)
            r4.Ep8(r0)
        L84:
            return
        L85:
            java.lang.String r3 = "Failed to initialize Pando persisted query provider for '%s'!"
            java.lang.String r2 = "IGPandoStaticGraphQLInitializer"
            com.facebook.graphql.query.JSONPersistedQueryProvider r1 = new com.facebook.graphql.query.JSONPersistedQueryProvider     // Catch: java.lang.Throwable -> L94
            r1.<init>(r7, r6)     // Catch: java.lang.Throwable -> L94
            java.util.concurrent.ConcurrentHashMap r0 = X.AbstractC40511uK.A00     // Catch: java.lang.Throwable -> L94
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L94
            goto L9c
        L94:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            X.C0K8.A0M(r2, r3, r1, r0)
        L9c:
            if (r5 == 0) goto L84
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13R.A07():void");
    }
}
