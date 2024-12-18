package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P11 implements InterfaceC58169PqZ {
    public View A00;
    public View A01;
    public View A02;
    public ViewStub A03;
    public TextView A04;
    public View A05;
    public final AbstractC59962oe A06;
    public final UserSession A07;
    public final NKA A08;
    public final InterfaceC58310Pt2 A09;
    public final C81X A0A;

    public P11(AbstractC59962oe abstractC59962oe, UserSession userSession, NKA nka, InterfaceC58310Pt2 interfaceC58310Pt2) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, nka, interfaceC58310Pt2);
        this.A06 = abstractC59962oe;
        this.A07 = userSession;
        this.A08 = nka;
        this.A09 = interfaceC58310Pt2;
        this.A0A = C81X.A2e;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        View A0C = AbstractC25227BEk.A0C(AbstractC31175DnJ.A06(this.A06), R.layout.tag_people);
        this.A05 = A0C;
        String str = "contentView";
        if (A0C != null) {
            View requireViewById = A0C.requireViewById(R.id.metadata_row_people);
            C14360o3.A0B(requireViewById, 0);
            this.A01 = requireViewById;
            this.A02 = requireViewById.requireViewById(R.id.tag_people_row_icon);
            View view = this.A01;
            if (view != null) {
                this.A04 = AbstractC166997dE.A0T(view, R.id.metadata_textview_people);
                View view2 = this.A05;
                if (view2 != null) {
                    this.A03 = AbstractC31173DnH.A0G(view2, R.id.tag_people_info_button_view_stub);
                    View view3 = this.A01;
                    if (view3 != null) {
                        this.A00 = view3.requireViewById(R.id.chevron_icon);
                        View view4 = this.A02;
                        if (view4 == null) {
                            str = "peopleTagRowIcon";
                        } else {
                            view4.setVisibility(0);
                            View view5 = this.A00;
                            if (view5 == null) {
                                str = "chevronIcon";
                            } else {
                                view5.setVisibility(0);
                                View view6 = this.A01;
                                if (view6 != null) {
                                    ViewOnClickListenerC55466OkL.A02(view6, 28, this);
                                    View view7 = this.A05;
                                    if (view7 != null) {
                                        return view7;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            str = "peopleTagRow";
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
        return this.A0A;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A06;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 37), C07Y.A00(viewLifecycleOwner));
    }
}
