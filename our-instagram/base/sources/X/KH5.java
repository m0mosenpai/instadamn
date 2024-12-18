package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KH5 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44623JpT(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_sticker_tab_header_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45185JzR c45185JzR = (C45185JzR) interfaceC66482zP;
        C44623JpT c44623JpT = (C44623JpT) c3oo;
        AbstractC167017dG.A1N(c45185JzR, c44623JpT);
        c44623JpT.A00.setText(c45185JzR.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45185JzR.class;
    }
}
