package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes9.dex */
public final class P0M implements InterfaceC58169PqZ {
    public final InterfaceC58310Pt2 A00;
    public final C81X A01;
    public final AbstractC59962oe A02;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        View A0C = AbstractC25227BEk.A0C(AbstractC31175DnJ.A06(this.A02), R.layout.internal_post_toggle_row);
        View requireViewById = A0C.requireViewById(R.id.internal_post_toggle_row_switch);
        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.igds.components.switchbutton.IgdsSwitch");
        ((IgdsSwitch) requireViewById).A07 = new P3T(this, 15);
        return A0C;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public P0M(AbstractC59962oe abstractC59962oe, InterfaceC58310Pt2 interfaceC58310Pt2) {
        AbstractC167017dG.A1P(abstractC59962oe, interfaceC58310Pt2);
        this.A02 = abstractC59962oe;
        this.A00 = interfaceC58310Pt2;
        this.A01 = C81X.A2i;
    }
}
