package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class KJV extends AbstractC66422zJ {
    public final UserSession A00;
    public final C43996Jcj A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44670JqF(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.twinbox_filter_layout, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45658KIv c45658KIv = (C45658KIv) interfaceC66482zP;
        C44670JqF c44670JqF = (C44670JqF) c3oo;
        AbstractC167017dG.A1N(c45658KIv, c44670JqF);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C45084JxE c45084JxE : c45658KIv.A00) {
            int i = c45084JxE.A02;
            int i2 = c45084JxE.A00;
            int i3 = c45084JxE.A01;
            A1E.add(new L4B(c45084JxE.A03, c45084JxE.A04, c45084JxE.A05, i, i2, i3));
        }
        C44560Jnh c44560Jnh = c44670JqF.A00;
        AbstractC31175DnJ.A0x(c44560Jnh, A1E, c44560Jnh.A02);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45658KIv.class;
    }

    public KJV(UserSession userSession, C43996Jcj c43996Jcj) {
        this.A00 = userSession;
        this.A01 = c43996Jcj;
    }
}
