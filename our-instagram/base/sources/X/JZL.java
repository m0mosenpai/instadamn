package X;

/* loaded from: classes8.dex */
public final class JZL implements InterfaceC13060ls {
    public final int A00;
    public final Object A01;

    public JZL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
        if (this.A00 != 0) {
            C44501Jm7 c44501Jm7 = (C44501Jm7) this.A01;
            c44501Jm7.A03.A05("HARD_BLOCK_PIN_FLOW_APP_BACKGROUNDED");
            if (!c44501Jm7.A00) {
                KPA kpa = c44501Jm7.A02;
                kpa.A03();
                kpa.A07("BACKGROUND_SOURCE", "PIN_HARDBLOCK_FLOW");
                kpa.A02();
            }
            c44501Jm7.A00 = true;
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        if (this.A00 != 0) {
            ((C44501Jm7) this.A01).A03.A05("HARD_BLOCK_PIN_FLOW_APP_FOREGROUNDED");
            return;
        }
        JXM jxm = (JXM) this.A01;
        jxm.A02.clear();
        jxm.A01.clear();
        C72Z.A01(null);
    }
}
