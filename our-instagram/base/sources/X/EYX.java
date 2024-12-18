package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EYX extends AbstractC66422zJ {
    public final /* synthetic */ N7C A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E24(new IgdsPeopleCell(AbstractC166997dE.A0L(viewGroup), true), this.A00);
    }

    public EYX(N7C n7c) {
        this.A00 = n7c;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56095OvF c56095OvF = (C56095OvF) interfaceC66482zP;
        E24 e24 = (E24) c3oo;
        AbstractC167017dG.A1N(c56095OvF, e24);
        IgdsPeopleCell igdsPeopleCell = e24.A00;
        igdsPeopleCell.A01();
        User user = c56095OvF.A00;
        igdsPeopleCell.A08(user.getUsername(), false);
        igdsPeopleCell.A07(user.getFullName());
        N7C n7c = e24.A01;
        igdsPeopleCell.A03(AbstractC166987dD.A0r(n7c.A04), new C34556FKq(n7c, user), null);
        igdsPeopleCell.A09.setVisibility(AbstractC167007dF.A05(C6XI.A02(user) ? 1 : 0));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56095OvF.class;
    }
}
