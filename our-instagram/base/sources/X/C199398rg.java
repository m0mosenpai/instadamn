package X;

/* renamed from: X.8rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199398rg extends AbstractC178657wd implements InterfaceC199408rh {
    public C199518rz A00;

    @Override // X.InterfaceC199408rh
    public final C199518rz B6U() {
        C199518rz c199518rz = this.A00;
        if (c199518rz == null) {
            Object obj = false;
            Object AqG = ((AbstractC178657wd) this).A00.AqG(InterfaceC198728qU.A00);
            if (AqG != null) {
                obj = AqG;
            }
            C199518rz c199518rz2 = new C199518rz(((Boolean) obj).booleanValue());
            this.A00 = c199518rz2;
            return c199518rz2;
        }
        return c199518rz;
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC199408rh.A00;
    }
}
