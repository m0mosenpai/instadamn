package X;

import android.content.Context;

/* renamed from: X.St6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63751St6 implements InterfaceC65470Tkn {
    public static final C62997SaL A01 = new C62997SaL(C62997SaL.A04, null, "com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    public final Context A00;

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        return A00((android.net.Uri) obj, c63729Ssj);
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return ((android.net.Uri) obj).getScheme().equals("android.resource");
    }

    public C63751St6(Context context) {
        this.A00 = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.QBU, X.Stk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.QBU A00(android.net.Uri r9, X.C63729Ssj r10) {
        /*
            r8 = this;
            java.lang.String r5 = r9.getAuthority()
            android.content.Context r4 = r8.A00
            r3 = r4
            java.lang.String r0 = r4.getPackageName()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L32
            r0 = 0
            android.content.Context r3 = r4.createPackageContext(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            goto L32
        L17:
            r2 = move-exception
            java.lang.String r0 = r4.getPackageName()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L32
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Failed to obtain context or unrecognized Uri format for: "
            java.lang.String r1 = X.AbstractC167017dG.A0n(r9, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        L32:
            java.util.List r2 = r9.getPathSegments()
            int r1 = r2.size()
            r0 = 2
            if (r1 != r0) goto L71
            java.util.List r2 = r9.getPathSegments()
            java.lang.String r1 = r9.getAuthority()
            java.lang.Object r7 = X.AbstractC166987dD.A16(r2)
            java.lang.String r7 = (java.lang.String) r7
            r0 = 1
            java.lang.String r2 = X.AbstractC25226BEj.A1I(r2, r0)
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r0.getIdentifier(r2, r7, r1)
            if (r6 != 0) goto L81
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            java.lang.String r0 = "android"
            int r6 = r1.getIdentifier(r2, r7, r0)
            if (r6 != 0) goto L81
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Failed to find resource id for: "
            java.lang.IllegalArgumentException r0 = X.AbstractC37303Gc4.A0M(r9, r0, r1)
            throw r0
        L71:
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto Lc7
            java.util.List r1 = r9.getPathSegments()
            r0 = 0
            int r6 = X.AbstractC167007dF.A0C(r1, r0)     // Catch: java.lang.NumberFormatException -> Lb6
        L81:
            X.SaL r0 = X.C63751St6.A01
            java.lang.Object r2 = r10.A00(r0)
            android.content.res.Resources$Theme r2 = (android.content.res.Resources.Theme) r2
            java.lang.String r0 = r3.getPackageName()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L96
            r1 = 0
            if (r2 != 0) goto L97
        L96:
            r1 = 1
        L97:
            java.lang.String r0 = "Can't get a theme from another package"
            if (r1 == 0) goto Lb1
            if (r2 != 0) goto Laa
            r0 = 0
            android.graphics.drawable.Drawable r1 = X.S6A.A00(r4, r3, r0, r6)
        La2:
            if (r1 == 0) goto Laf
            X.QBU r0 = new X.QBU
            r0.<init>(r1)
            return r0
        Laa:
            android.graphics.drawable.Drawable r1 = X.S6A.A00(r4, r4, r2, r6)
            goto La2
        Laf:
            r0 = 0
            return r0
        Lb1:
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        Lb6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Unrecognized Uri format: "
            java.lang.String r1 = X.AbstractC167017dG.A0n(r9, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        Lc7:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Unrecognized Uri format: "
            java.lang.IllegalArgumentException r0 = X.AbstractC37303Gc4.A0M(r9, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63751St6.A00(android.net.Uri, X.Ssj):X.QBU");
    }
}
