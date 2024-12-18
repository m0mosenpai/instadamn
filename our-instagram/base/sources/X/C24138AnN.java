package X;

import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.AnN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24138AnN implements InterfaceC190628cK {
    public final /* synthetic */ C190398bx A00;

    public C24138AnN(C190398bx c190398bx) {
        this.A00 = c190398bx;
    }

    @Override // X.InterfaceC190628cK
    public final void DOI() {
        C190398bx c190398bx = this.A00;
        InterfaceC1810081c interfaceC1810081c = c190398bx.A1W;
        if (interfaceC1810081c.CRB(EnumC1810181d.A0E) || interfaceC1810081c.CRB(EnumC1810181d.A0F)) {
            c190398bx.A1X.DOI();
        }
        C190398bx.A0B(c190398bx);
    }

    @Override // X.InterfaceC190628cK
    public final boolean DdB(C05R c05r) {
        this.A00.A1X.CJs(c05r);
        return true;
    }

    @Override // X.InterfaceC190628cK
    public final void DkM(ConstrainedEditText constrainedEditText, int i, int i2) {
        C190398bx c190398bx = this.A00;
        ((C202848y2) c190398bx.A1f.get()).A02(AbstractC190978ct.A05(c190398bx.A1j.getText()));
    }
}
