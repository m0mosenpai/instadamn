package X;

/* renamed from: X.2bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52942bb {
    public static final InterfaceC51892Zn A01 = C52952bc.A00;
    public final C52982bf A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C52942bb(X.InterfaceC018407e r4) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            X.07d r2 = r4.getViewModelStore()
            boolean r0 = r4 instanceof X.C07N
            if (r0 == 0) goto L1a
            X.07N r4 = (X.C07N) r4
            X.2ba r1 = r4.getDefaultViewModelProviderFactory()
            X.2be r0 = r4.getDefaultViewModelCreationExtras()
        L16:
            r3.<init>(r1, r2, r0)
            return
        L1a:
            X.AUV r1 = X.AUV.A00
            X.2bd r0 = X.C52962bd.A00
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52942bb.<init>(X.07e):void");
    }

    public final AbstractC52922bZ A00(Class cls) {
        C14360o3.A0B(cls, 0);
        return A02(new C0YZ(cls));
    }

    public final AbstractC52922bZ A01(Class cls, String str) {
        C14360o3.A0B(str, 0);
        return this.A00.A00(str, new C0YZ(cls));
    }

    public final AbstractC52922bZ A02(InterfaceC16510rw interfaceC16510rw) {
        C14360o3.A0B(interfaceC16510rw, 0);
        C52982bf c52982bf = this.A00;
        String A00 = AbstractC13230m9.A00(((C0YZ) interfaceC16510rw).A00);
        if (A00 != null) {
            return c52982bf.A00(AnonymousClass001.A0R("androidx.lifecycle.ViewModelProvider.DefaultKey:", A00), interfaceC16510rw);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C52942bb(InterfaceC52932ba interfaceC52932ba, C018307d c018307d, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(c018307d, 1);
        C14360o3.A0B(interfaceC52932ba, 2);
        C14360o3.A0B(abstractC52972be, 3);
        this.A00 = new C52982bf(interfaceC52932ba, c018307d, abstractC52972be);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C52942bb(X.InterfaceC52932ba r3, X.InterfaceC018407e r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            r0 = 2
            X.C14360o3.A0B(r3, r0)
            X.07d r1 = r4.getViewModelStore()
            boolean r0 = r4 instanceof X.C07N
            if (r0 == 0) goto L1a
            X.07N r4 = (X.C07N) r4
            X.2be r0 = r4.getDefaultViewModelCreationExtras()
        L16:
            r2.<init>(r3, r1, r0)
            return
        L1a:
            X.2bd r0 = X.C52962bd.A00
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52942bb.<init>(X.2ba, X.07e):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52942bb(InterfaceC52932ba interfaceC52932ba, C018307d c018307d) {
        this(interfaceC52932ba, c018307d, C52962bd.A00);
        C14360o3.A0B(c018307d, 1);
    }
}
