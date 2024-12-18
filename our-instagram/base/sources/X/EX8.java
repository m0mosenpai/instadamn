package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes6.dex */
public final class EX8 extends AbstractC66412zI {
    public final EO8 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36197FyB c36197FyB = (C36197FyB) interfaceC66482zP;
        E2S e2s = (E2S) c3oo;
        AbstractC167017dG.A1N(c36197FyB, e2s);
        Integer num = c36197FyB.A00;
        boolean z = c36197FyB.A01;
        C14360o3.A0B(num, 0);
        IgdsListCell igdsListCell = e2s.A02;
        igdsListCell.A0I(AbstractC166997dE.A0p(e2s.A00, F7O.A00(num)));
        igdsListCell.setChecked(z);
        igdsListCell.A0C(new ViewOnClickListenerC31591DuJ(5, e2s, num));
    }

    public EX8(EO8 eo8) {
        this.A00 = eo8;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context A04 = AbstractC31176DnK.A04(viewGroup);
        IgdsListCell A0Z = AbstractC31174DnI.A0Z(A04);
        A0Z.A0G(EnumC53237Nga.A07, true);
        return new E2S(A04, this.A00, A0Z);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36197FyB.class;
    }
}
