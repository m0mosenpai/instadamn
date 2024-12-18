package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EXW extends AbstractC66412zI {
    public final Fragment A00;
    public final InterfaceC37145GYg A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    public EXW(Fragment fragment, InterfaceC37145GYg interfaceC37145GYg, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = fragment;
        this.A01 = interfaceC37145GYg;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E44(this.A01, new IgdsPeopleCell(AbstractC31176DnK.A04(viewGroup), false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View.OnClickListener onClickListener;
        C32091E8p c32091E8p = (C32091E8p) interfaceC66482zP;
        E44 e44 = (E44) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c32091E8p, e44);
        User user = c32091E8p.A06;
        Integer num = c32091E8p.A07;
        boolean z = c32091E8p.A00;
        boolean z2 = c32091E8p.A09;
        C5QE c5qe = c32091E8p.A02;
        EnumC99704do enumC99704do = c32091E8p.A04;
        Integer num2 = c32091E8p.A08;
        EnumC99704do enumC99704do2 = c32091E8p.A05;
        C5QE c5qe2 = c32091E8p.A03;
        C5QE c5qe3 = c32091E8p.A01;
        UserSession userSession = this.A03;
        Fragment fragment = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C14360o3.A0B(user, 0);
        C14360o3.A0B(num, A1R ? 1 : 0);
        AbstractC25234BEr.A0k(4, c5qe, enumC99704do, num2, enumC99704do2);
        AbstractC25234BEr.A0l(8, c5qe2, c5qe3, userSession, fragment);
        C14360o3.A0B(interfaceC11380iw, 12);
        Context requireContext = fragment.requireContext();
        IgdsPeopleCell igdsPeopleCell = e44.A01;
        igdsPeopleCell.A01();
        igdsPeopleCell.A08(user.getUsername(), false);
        String fullName = user.getFullName();
        if (z) {
            if (fullName != null && fullName.length() != 0) {
                fullName = AnonymousClass001.A0g(user.getFullName(), " • ", requireContext.getString(2131969455));
            } else {
                fullName = requireContext.getString(2131969455);
            }
        }
        igdsPeopleCell.A07(fullName);
        CharSequence A00 = BHX.A00(requireContext, c5qe3);
        if (A00.length() > 0) {
            igdsPeopleCell.A06(A00);
        }
        InterfaceC85983sV A002 = E44.A00(fragment, e44, interfaceC11380iw, c5qe, userSession, enumC99704do, user, num, C05F.A00);
        C34556FKq c34556FKq = new C34556FKq(fragment, user);
        if (z2) {
            C0fQ.A00(new ViewOnClickListenerC35610Fo1(0, fragment, user, e44, userSession), igdsPeopleCell);
            onClickListener = new ViewOnClickListenerC35610Fo1(A1R ? 1 : 0, fragment, user, e44, userSession);
        } else {
            onClickListener = ViewOnClickListenerC35651Fol.A00;
        }
        c34556FKq.A00 = onClickListener;
        igdsPeopleCell.A03(userSession, c34556FKq, user);
        if (A002 != null) {
            igdsPeopleCell.A05(A002, E44.A00(fragment, e44, interfaceC11380iw, c5qe2, userSession, enumC99704do2, user, num2, C05F.A01));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32091E8p.class;
    }
}
