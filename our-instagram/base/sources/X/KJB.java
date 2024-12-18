package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJB extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44611JpH(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.encrypted_backups_fishfooding_banners_header, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45184JzQ c45184JzQ = (C45184JzQ) interfaceC66482zP;
        C44611JpH c44611JpH = (C44611JpH) c3oo;
        AbstractC167017dG.A1N(c45184JzQ, c44611JpH);
        c44611JpH.A00.setText(c45184JzQ.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45184JzQ.class;
    }
}
