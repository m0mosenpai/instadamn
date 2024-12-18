package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes9.dex */
public final class P0Y implements InterfaceC58169PqZ {
    public View A00;
    public IgdsSwitch A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC58310Pt2 A04;
    public final NK7 A05;
    public final C81X A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        View A0C = AbstractC25227BEk.A0C(AbstractC31175DnJ.A06(this.A02), R.layout.layout_share_to_feed_toggle);
        this.A00 = A0C;
        String str = "shareToFeedToggleRow";
        if (A0C != null) {
            this.A01 = (IgdsSwitch) A0C.requireViewById(R.id.share_to_feed_switch);
            P3T p3t = new P3T(this, 6);
            View view = this.A00;
            if (view != null) {
                ViewOnClickListenerC55466OkL.A02(view, 17, this);
                IgdsSwitch igdsSwitch = this.A01;
                if (igdsSwitch == null) {
                    str = "shareToFeedToggle";
                } else {
                    igdsSwitch.A07 = p3t;
                    View view2 = this.A00;
                    if (view2 != null) {
                        return view2;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A06;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A02;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 22), C07Y.A00(viewLifecycleOwner));
    }

    public P0Y(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, NK7 nk7) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A05 = nk7;
        this.A04 = interfaceC58310Pt2;
        this.A06 = C81X.A26;
    }
}
