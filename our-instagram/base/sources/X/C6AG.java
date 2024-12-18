package X;

/* renamed from: X.6AG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AG {
    public final C6AI A00;
    public final C133225zo A01;

    public final void A01(boolean z, final Runnable runnable) {
        final C41761wQ c41761wQ = new C41761wQ(null);
        C133225zo c133225zo = this.A01;
        C42221xC A0O = c133225zo.A02.A0N(AbstractC137146It.A00("mailbox_ig_advanced_crypto_transport")).A0O(AbstractC137146It.A00("logout_ig_advanced_crypto_transport"));
        final C207129Er c207129Er = new C207129Er(4, c133225zo, z);
        c41761wQ.A02(A0O.A0J(new C6D2() { // from class: X.8w3
            @Override // X.C6D2
            public final /* synthetic */ Object apply(Object obj) {
                return InterfaceC16660sJ.this.invoke(obj);
            }
        }).A0G(), new InterfaceC42241xE() { // from class: X.8w4
            @Override // X.InterfaceC42241xE
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C41761wQ.this.A01();
                runnable.run();
            }
        });
    }

    public final C42221xC A00() {
        return this.A01.A02.A0N(AbstractC137146It.A00("mailbox_ig_advanced_crypto_transport"));
    }

    public C6AG(C133225zo c133225zo, C6AI c6ai) {
        this.A00 = c6ai;
        this.A01 = c133225zo;
    }
}
