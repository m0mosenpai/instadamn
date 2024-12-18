package X;

/* renamed from: X.07j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C018907j extends AbstractC52922bZ {
    public static final InterfaceC52932ba A02 = new InterfaceC52932ba() { // from class: X.07i
        @Override // X.InterfaceC52932ba
        public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
            return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
        }

        @Override // X.InterfaceC52932ba
        public final AbstractC52922bZ create(Class cls) {
            return new C018907j();
        }

        @Override // X.InterfaceC52932ba
        public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
            C14360o3.A0B(cls, 1);
            return create(cls);
        }
    };
    public C005101q A00 = new C005101q();
    public boolean A01 = false;

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C005101q c005101q = this.A00;
        int A00 = c005101q.A00();
        for (int i = 0; i < A00; i++) {
            ((C08890cs) c005101q.A04(i)).A0E(true);
        }
        c005101q.A05();
    }
}
