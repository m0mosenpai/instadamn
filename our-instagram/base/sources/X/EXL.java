package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

/* loaded from: classes6.dex */
public final class EXL extends AbstractC66412zI {
    public final AbstractC59962oe A00;
    public final UserSession A01;

    public EXL(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        C14360o3.A0A(A06);
        IgdsRadioButton igdsRadioButton = new IgdsRadioButton(A06);
        igdsRadioButton.setBackgroundResource(R.drawable.radio_button_state_selector);
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(A06, null, 0, false);
        igdsPeopleCell.A05(igdsRadioButton, null);
        return new C31945E1z(igdsRadioButton, igdsPeopleCell);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        throw AbstractC166987dD.A15("getUser");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AbstractC36170Fxk.class;
    }
}
