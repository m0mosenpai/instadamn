package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.EWy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32598EWy extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E36(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.empty_recon_section_title, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E36 e36 = (E36) c3oo;
        AbstractC167017dG.A1N(interfaceC66482zP, e36);
        IgTextView igTextView = e36.A02;
        AbstractC31173DnH.A19(igTextView.getResources(), igTextView, 2131974016);
        IgTextView igTextView2 = e36.A01;
        AbstractC31173DnH.A19(igTextView2.getResources(), igTextView2, 2131974015);
        IgImageView igImageView = e36.A03;
        AbstractC166997dE.A19(igImageView.getContext(), igImageView, R.drawable.ufi_save_icon);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42289IoD.class;
    }
}
