package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes6.dex */
public final class EX7 extends AbstractC66412zI {
    public final C31792DyB A00;

    public EX7(C31792DyB c31792DyB) {
        C14360o3.A0B(c31792DyB, 1);
        this.A00 = c31792DyB;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E1U(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.customized_benefit_selection_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32084E8i c32084E8i = (C32084E8i) interfaceC66482zP;
        E1U e1u = (E1U) c3oo;
        AbstractC167017dG.A1N(c32084E8i, e1u);
        IgdsListCell igdsListCell = e1u.A00;
        igdsListCell.A0G(EnumC53237Nga.A03, c32084E8i.A00);
        igdsListCell.A06(c32084E8i.A03);
        igdsListCell.setChecked(c32084E8i.A01);
        igdsListCell.setEnabled(c32084E8i.A00);
        igdsListCell.A0D(new C35744Fqc(6, c32084E8i, this, igdsListCell));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32084E8i.class;
    }
}
