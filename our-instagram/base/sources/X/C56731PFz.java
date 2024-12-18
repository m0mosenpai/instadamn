package X;

import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.PFz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56731PFz implements InterfaceC191388dp {
    public final int A00;
    public final Object A01;

    public C56731PFz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC191388dp
    public final void Dlg() {
        switch (this.A00) {
            case 0:
                C214959fX.A05((C214959fX) this.A01);
                return;
            case 1:
                C52199N8o c52199N8o = ((DirectPrivateStoryRecipientController) this.A01).A0H;
                if (c52199N8o == null) {
                    return;
                }
                c52199N8o.A06();
                return;
            case 2:
                ((OAD) this.A01).A00 = true;
                return;
            default:
                C56255Oy2.A04((C56255Oy2) this.A01);
                return;
        }
    }
}
