package X;

/* renamed from: X.Tww, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65951Tww implements InterfaceC192128fD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65951Tww(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC192128fD
    public final void Dgh(AbstractC192138fE abstractC192138fE) {
        if (this.A00 != 0) {
            C14360o3.A0B(abstractC192138fE, 0);
            ((JGM) this.A01).onResult(abstractC192138fE);
            ((InterfaceC192098fA) this.A02).EFu(this);
            return;
        }
        C66201U3x c66201U3x = (C66201U3x) this.A01;
        if (c66201U3x.A0A.getAndSet(abstractC192138fE) == abstractC192138fE) {
            return;
        }
        InterfaceC72008XEw interfaceC72008XEw = c66201U3x.A00;
        if (interfaceC72008XEw != null && (abstractC192138fE instanceof C215549gU)) {
            interfaceC72008XEw.AAO("action_load_step");
        }
        try {
            c66201U3x.A09.set(abstractC192138fE.A00);
            c66201U3x.A08.set(c66201U3x.A06.now());
        } finally {
            ((InterfaceC192128fD) this.A02).Dgh(abstractC192138fE);
        }
    }
}
