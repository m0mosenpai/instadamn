package X;

/* loaded from: classes10.dex */
public final class TW5 implements InterfaceC09250da, InterfaceC16620sF {
    public final int A00;
    public final Object A01;

    public TW5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        Object obj3 = this.A01;
        if (2 - i != 0) {
            AbstractC63223SfY abstractC63223SfY = (AbstractC63223SfY) obj3;
            InterfaceC172727mi interfaceC172727mi = abstractC63223SfY.A04;
            if (interfaceC172727mi != null && interfaceC172727mi.C9a() != null) {
                abstractC63223SfY.A04.C9a().A08();
                return null;
            }
            return null;
        }
        C63380Siu c63380Siu = (C63380Siu) obj3;
        c63380Siu.A0Q.A01.A06("FAILED_PASSKEY_VERIFICATION", c63380Siu.A03.A03());
        return null;
    }
}
