package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dv2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31636Dv2 extends AbstractC66422zJ {
    public static C63702ur A04;
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C31623Dup A02;
    public final InterfaceC09390do A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E3I(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.recommended_user_row, false));
    }

    public static final C6PG A00(C31462Ds6 c31462Ds6, String str) {
        C6PG c6pg = new C6PG("recommended_users_direct_inbox", c31462Ds6.A01.getId(), str);
        String str2 = c31462Ds6.A02;
        if (str2 != null) {
            c6pg.A07 = str2;
        }
        c6pg.A00 = c31462Ds6.A00;
        return c6pg;
    }

    public final C63702ur A01() {
        if (C18U.A06(C06090Tz.A05, this.A01, 36330638730871755L)) {
            return (C63702ur) this.A03.getValue();
        }
        return A04;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31462Ds6 c31462Ds6 = (C31462Ds6) interfaceC66482zP;
        E3I e3i = (E3I) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c31462Ds6, e3i);
        IgdsPeopleCell igdsPeopleCell = e3i.A01;
        igdsPeopleCell.A01();
        User user = c31462Ds6.A01;
        FpQ.A01(e3i.A00, 30, this, c31462Ds6);
        FollowButton followButton = e3i.A02;
        ((FollowButtonBase) followButton).A0A = A1R;
        ((FollowButtonBase) followButton).A09 = !c31462Ds6.A04;
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        UserSession userSession = this.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        viewOnAttachStateChangeListenerC110564yT.A04(abstractC59962oe, userSession, user);
        viewOnAttachStateChangeListenerC110564yT.A08(new C33271EnS(0, c31462Ds6, this));
        igdsPeopleCell.A05(followButton, null);
        igdsPeopleCell.A08(user.getUsername(), user.isVerified());
        igdsPeopleCell.A03(userSession, new C34556FKq(abstractC59962oe, user), null);
        ViewOnClickListenerC35684FpJ.A00(igdsPeopleCell, c31462Ds6, this, user, 20);
        String A0e = AbstractC31171DnF.A0e(user);
        if (A0e != null && !A0e.equals("")) {
            List list = c31462Ds6.A03;
            if (list != null) {
                igdsPeopleCell.A06(A0e);
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(AbstractC25226BEj.A15(it).Bhu());
                }
                AbstractC167007dF.A1D(abstractC59962oe, A1R ? 1 : 0, userSession);
                IgSimpleImageView igSimpleImageView = igdsPeopleCell.A08;
                igSimpleImageView.setImageDrawable(AbstractC89513yr.A05(abstractC59962oe.requireContext(), Float.valueOf(0.67f), C05F.A01, null, Integer.valueOf(AbstractC166987dD.A0C(abstractC59962oe.requireContext(), A1R ? 1 : 0)), null, abstractC59962oe.getModuleName(), A0q, AbstractC166987dD.A0C(abstractC59962oe.requireContext(), 23), C18U.A06(C06090Tz.A05, userSession, 36325428935275586L), A1R));
                igSimpleImageView.setVisibility(0);
                igdsPeopleCell.A07.setVisibility(0);
            } else {
                igdsPeopleCell.A06(A0e);
            }
        } else {
            igdsPeopleCell.A07(user.getFullName());
        }
        if (A04 == null && !C18U.A06(C06090Tz.A05, userSession, 36330638730871755L)) {
            A04 = new C63702ur(abstractC59962oe, userSession);
        }
        C31623Dup c31623Dup = this.A02;
        E71 e71 = new E71(user, c31462Ds6.A02, c31462Ds6.A00);
        JR2 jr2 = c31623Dup.A00;
        C57112jm c57112jm = (C57112jm) jr2.A2w.getValue();
        if (c57112jm != null) {
            UserSession A0p = jr2.A0p();
            AbstractC59962oe abstractC59962oe2 = jr2.A1L;
            C36313G0i c36313G0i = new C36313G0i(abstractC59962oe2, A0p, abstractC59962oe2.getModuleName(), jr2.A2Z);
            C59072n8 A00 = C59062n7.A00(e71, null, AbstractC31171DnF.A0g(e71.A01));
            A00.A00(c36313G0i);
            AbstractC25227BEk.A10(igdsPeopleCell, A00, c57112jm);
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        E3I e3i = (E3I) c3oo;
        C14360o3.A0B(e3i, 0);
        if (C18U.A06(C06090Tz.A05, this.A01, 36330638730937292L)) {
            C31623Dup c31623Dup = this.A02;
            IgdsPeopleCell igdsPeopleCell = e3i.A01;
            C14360o3.A0B(igdsPeopleCell, 0);
            C57112jm c57112jm = (C57112jm) c31623Dup.A00.A2w.getValue();
            if (c57112jm != null) {
                c57112jm.A04(igdsPeopleCell);
            }
        }
    }

    public C31636Dv2(AbstractC59962oe abstractC59962oe, UserSession userSession, C31623Dup c31623Dup, InterfaceC09390do interfaceC09390do) {
        this.A01 = userSession;
        this.A02 = c31623Dup;
        this.A00 = abstractC59962oe;
        this.A03 = interfaceC09390do;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31462Ds6.class;
    }
}
