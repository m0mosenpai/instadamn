package X;

/* renamed from: X.G7f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36481G7f implements InterfaceC154236wY {
    public final /* synthetic */ EMO A00;

    public C36481G7f(EMO emo) {
        this.A00 = emo;
    }

    @Override // X.InterfaceC154236wY
    public final void DE0(InterfaceC81933lD interfaceC81933lD) {
        EMO emo = this.A00;
        if (AbstractC154636xD.A00(interfaceC81933lD) == C05F.A01) {
            if (interfaceC81933lD.BD4() != null) {
                IB8.A00(emo.requireActivity(), emo, emo.A01, interfaceC81933lD.BD4().F59());
                return;
            }
            return;
        }
        if (AbstractC154636xD.A00(interfaceC81933lD) != C05F.A00 || interfaceC81933lD.CDh() == null) {
            return;
        }
        EMO.A02(emo, interfaceC81933lD.CDh().getId());
    }
}
