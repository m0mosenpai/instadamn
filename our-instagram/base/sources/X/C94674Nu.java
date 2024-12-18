package X;

/* renamed from: X.4Nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94674Nu {
    public final C94684Nv A00;
    public final C94664Nt A01;
    public final ClassLoader A02;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (X.AbstractC116185Nx.A00(X.AnonymousClass001.A0g("WindowLayoutComponent#addWindowLayoutInfoListener(", android.content.Context.class.getName(), ", androidx.window.extensions.core.util.function.Consumer) is not valid"), new X.C57514Pfo(r4, 25)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (X.AbstractC116185Nx.A00("FoldingFeature class is not valid", new X.C9EV(r4, 46)) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.window.extensions.layout.WindowLayoutComponent A00() {
        /*
            r4 = this;
            X.4Nv r2 = r4.A00
            r1 = 43
            X.9EV r0 = new X.9EV
            r0.<init>(r2, r1)
            r0.invoke()     // Catch: java.lang.Throwable -> L3a
            r0 = 44
            X.9EV r1 = new X.9EV
            r1.<init>(r2, r0)
            java.lang.String r0 = "WindowExtensionsProvider#getWindowExtensions is not valid"
            boolean r0 = X.AbstractC116185Nx.A00(r0, r1)
            if (r0 == 0) goto L3a
            r0 = 48
            X.9EV r1 = new X.9EV
            r1.<init>(r4, r0)
            java.lang.String r0 = "WindowExtensions#getWindowLayoutComponent is not valid"
            boolean r0 = X.AbstractC116185Nx.A00(r0, r1)
            if (r0 == 0) goto L3a
            r0 = 46
            X.9EV r1 = new X.9EV
            r1.<init>(r4, r0)
            java.lang.String r0 = "FoldingFeature class is not valid"
            boolean r1 = X.AbstractC116185Nx.A00(r0, r1)
            r0 = 1
            if (r1 != 0) goto L3b
        L3a:
            r0 = 0
        L3b:
            r1 = 0
            if (r0 == 0) goto L5e
            int r2 = X.C116195Ny.A00()
            r0 = 1
            if (r2 != r0) goto L62
            java.lang.String r2 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ", java.util.function.Consumer) is not valid"
            java.lang.String r2 = X.AnonymousClass001.A0g(r2, r1, r0)
            r1 = 47
            X.9EV r0 = new X.9EV
            r0.<init>(r4, r1)
            boolean r1 = X.AbstractC116185Nx.A00(r2, r0)
        L5e:
            r0 = 0
            if (r1 == 0) goto La4
            goto L9c
        L62:
            r0 = 2
            if (r0 > r2) goto L5e
            java.lang.String r3 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ", java.util.function.Consumer) is not valid"
            java.lang.String r2 = X.AnonymousClass001.A0g(r3, r1, r0)
            r1 = 47
            X.9EV r0 = new X.9EV
            r0.<init>(r4, r1)
            boolean r0 = X.AbstractC116185Nx.A00(r2, r0)
            if (r0 == 0) goto L9a
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ", androidx.window.extensions.core.util.function.Consumer) is not valid"
            java.lang.String r2 = X.AnonymousClass001.A0g(r3, r1, r0)
            r1 = 25
            X.Pfo r0 = new X.Pfo
            r0.<init>(r4, r1)
            boolean r0 = X.AbstractC116185Nx.A00(r2, r0)
            r1 = 1
            if (r0 != 0) goto L5e
        L9a:
            r1 = 0
            goto L5e
        L9c:
            androidx.window.extensions.WindowExtensions r1 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()     // Catch: java.lang.UnsupportedOperationException -> La4
            androidx.window.extensions.layout.WindowLayoutComponent r0 = r1.getWindowLayoutComponent()     // Catch: java.lang.UnsupportedOperationException -> La4
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94674Nu.A00():androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public C94674Nu(C94664Nt c94664Nt, ClassLoader classLoader) {
        this.A02 = classLoader;
        this.A01 = c94664Nt;
        this.A00 = new C94684Nv(classLoader);
    }
}
