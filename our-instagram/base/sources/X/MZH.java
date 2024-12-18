package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class MZH extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        MZU mzu = new MZU(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.row_divider_dynamic_margin, false));
        View view = mzu.A00;
        view.setBackgroundResource(AbstractC53242c7.A0H(view.getContext(), R.attr.igds_color_separator));
        return mzu;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View view;
        MZT mzt = (MZT) interfaceC66482zP;
        MZU mzu = (MZU) c3oo;
        C14360o3.A0B(mzt, 0);
        C14360o3.A0B(mzu, 1);
        int ordinal = mzt.A00.ordinal();
        if (ordinal != 3) {
            if (ordinal == 4 && (view = mzu.A01) != null) {
                int A04 = AbstractC167017dG.A04(view.getContext());
                view.setPadding(0, A04, 0, A04);
                return;
            }
            return;
        }
        View view2 = mzu.A01;
        if (view2 == null) {
            return;
        }
        view2.setPadding(0, 0, 0, AbstractC167017dG.A06(view2.getContext()));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return MZT.class;
    }
}
