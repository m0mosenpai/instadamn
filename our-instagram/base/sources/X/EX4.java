package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class EX4 extends AbstractC66412zI {
    public final EVU A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31962E2q(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_row_suggested_ssc_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EY5 ey5 = (EY5) interfaceC66482zP;
        C31962E2q c31962E2q = (C31962E2q) c3oo;
        AbstractC167017dG.A1N(ey5, c31962E2q);
        C5QE c5qe = ey5.A01;
        C14360o3.A0B(c5qe, 0);
        IgTextView igTextView = c31962E2q.A02;
        View view = c31962E2q.A01;
        Context A0L = AbstractC166997dE.A0L(view);
        igTextView.setText(BHX.A00(A0L, c5qe));
        c31962E2q.A00 = c5qe;
        int i = ey5.A00;
        Integer valueOf = Integer.valueOf(i);
        CircularImageView circularImageView = c31962E2q.A03;
        if (valueOf != null) {
            circularImageView.setVisibility(0);
            AbstractC166997dE.A19(A0L, circularImageView, i);
        } else {
            circularImageView.setVisibility(8);
        }
        EVU evu = this.A00;
        C14360o3.A0B(evu, 0);
        C0fQ.A00(new ViewOnClickListenerC35691FpR(evu, 18), view);
    }

    public EX4(EVU evu) {
        this.A00 = evu;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY5.class;
    }
}
