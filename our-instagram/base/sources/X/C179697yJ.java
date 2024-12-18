package X;

/* renamed from: X.7yJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179697yJ extends AbstractC179687yI implements InterfaceC179707yK {
    public volatile InterfaceC178717wj A00;

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A00 = (InterfaceC178717wj) ((AbstractC179687yI) this).A00.Aq0(InterfaceC178717wj.A00);
    }

    @Override // X.InterfaceC179607yA
    public final C175767rq BKU() {
        return InterfaceC179707yK.A00;
    }

    @Override // X.InterfaceC179707yK
    public final void FAN(EnumC185018Iq enumC185018Iq, C8J3 c8j3, String str, float f, float f2) {
        C23128AMg c23128AMg;
        InterfaceC178717wj interfaceC178717wj = this.A00;
        if (interfaceC178717wj != null && (c23128AMg = ((C178707wi) interfaceC178717wj).A02) != null) {
            C23128AMg.A00(enumC185018Iq, c8j3, c23128AMg, str, f, f2);
        }
    }
}
