package X;

/* renamed from: X.57l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1127957l implements InterfaceC1128057m {
    public static final C1127957l A00 = new Object();

    @Override // X.InterfaceC1128057m
    public final InterfaceC16820sZ COm(final AbstractC1127657i abstractC1127657i) {
        MTP mtp = new MTP(abstractC1127657i);
        abstractC1127657i.addOnAttachStateChangeListener(mtp);
        InterfaceC1128257o interfaceC1128257o = new InterfaceC1128257o() { // from class: X.57n
            @Override // X.InterfaceC1128257o
            public final void DeW() {
                AbstractC1127657i.this.A05();
            }
        };
        AbstractC105064oM.A00(abstractC1127657i).A00.add(interfaceC1128257o);
        return new C9FP(3, mtp, abstractC1127657i, interfaceC1128257o);
    }
}
