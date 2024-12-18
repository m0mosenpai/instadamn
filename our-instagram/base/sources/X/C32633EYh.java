package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EYh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32633EYh extends AbstractC66422zJ {
    public View A00;
    public final EOS A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31970E2y c31970E2y = (C31970E2y) c3oo;
        C14360o3.A0B(c31970E2y, 1);
        EOS eos = this.A01;
        C14360o3.A0B(eos, 1);
        ViewOnClickListenerC35685FpK.A01(c31970E2y.A00, 63, eos);
        c31970E2y.A01.setImageResource(R.drawable.instagram_group_pano_filled_24);
        c31970E2y.A03.setText(2131954715);
        IgTextView igTextView = c31970E2y.A02;
        igTextView.setVisibility(0);
        igTextView.setText(2131954714);
        igTextView.setCompoundDrawables(null, null, null, null);
    }

    public C32633EYh(EOS eos) {
        this.A01 = eos;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_campfire_create_row, false);
        this.A00 = A0R;
        return new C31970E2y(A0R);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36177Fxr.class;
    }
}
