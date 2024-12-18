package X;

/* loaded from: classes8.dex */
public final class JnM extends AbstractC154146wP {
    public final /* synthetic */ AbstractC45465KBa A00;

    public JnM(AbstractC45465KBa abstractC45465KBa) {
        this.A00 = abstractC45465KBa;
    }

    @Override // X.AbstractC154146wP
    public final int A03(int i) {
        AbstractC45465KBa abstractC45465KBa = this.A00;
        C66362zD c66362zD = abstractC45465KBa.A05;
        if (c66362zD != null) {
            if (c66362zD.getItemViewType(i) == 0) {
                return 1;
            }
            return abstractC45465KBa.A00;
        }
        AbstractC31171DnF.A0t();
        throw C00O.createAndThrow();
    }
}
