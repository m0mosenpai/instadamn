package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.KGz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45610KGz extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44656Jq0(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.placeholder_generic, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int dimensionPixelSize;
        C3T1 c3t1;
        KJ6 kj6 = (KJ6) interfaceC66482zP;
        C44656Jq0 c44656Jq0 = (C44656Jq0) c3oo;
        AbstractC167017dG.A1N(kj6, c44656Jq0);
        ViewGroup.LayoutParams layoutParams = c44656Jq0.A00.getLayoutParams();
        Integer num = kj6.A00;
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            Resources resources = c44656Jq0.itemView.getResources();
            C14360o3.A07(resources);
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.browser_actions_context_menu_max_width);
        }
        layoutParams.height = dimensionPixelSize;
        SpinnerImageView spinnerImageView = c44656Jq0.A01;
        if (kj6.A01) {
            c3t1 = C3T1.LOADING;
        } else {
            c3t1 = C3T1.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(c3t1);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KJ6.class;
    }
}
