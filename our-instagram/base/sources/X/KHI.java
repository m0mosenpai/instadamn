package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KHI extends AbstractC66412zI {
    public final C47242KuF A00;

    public KHI(C47242KuF c47242KuF) {
        C14360o3.A0B(c47242KuF, 1);
        this.A00 = c47242KuF;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44729JrC(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_pack_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        SpinnerImageView spinnerImageView;
        C3T1 c3t1;
        int intValue;
        C48314LZn c48314LZn = (C48314LZn) interfaceC66482zP;
        C44729JrC c44729JrC = (C44729JrC) c3oo;
        AbstractC167007dF.A1K(c48314LZn, c44729JrC);
        c44729JrC.A02.setText(c48314LZn.A05);
        Integer num = c48314LZn.A00;
        if (num != null && (intValue = num.intValue()) > 0) {
            ((TextView) c44729JrC.A03.getView()).setText(AbstractC31175DnJ.A0W(c44729JrC.itemView.getResources(), num, R.plurals.appreciation_funding_bonus_amount, intValue));
        }
        boolean z = c48314LZn.A06;
        IgTextView igTextView = c44729JrC.A01;
        if (z) {
            igTextView.setVisibility(8);
            spinnerImageView = c44729JrC.A04;
            c3t1 = C3T1.LOADING;
        } else {
            igTextView.setText(c48314LZn.A02);
            igTextView.setVisibility(0);
            spinnerImageView = c44729JrC.A04;
            c3t1 = C3T1.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(c3t1);
        IgLinearLayout igLinearLayout = c44729JrC.A00;
        AbstractC56952jT.A02(igLinearLayout, c44729JrC.itemView.getResources().getString(2131953039));
        igLinearLayout.setContentDescription(c48314LZn.A01);
        ViewOnClickListenerC48066LPr.A00(igLinearLayout, 4, c48314LZn, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48314LZn.class;
    }
}
