package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NE6 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51381Mmg(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.metadata_fundraiser_row, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        OFO ofo = (OFO) interfaceC66482zP;
        C51381Mmg c51381Mmg = (C51381Mmg) c3oo;
        AbstractC167017dG.A1N(ofo, c51381Mmg);
        new OHd(c51381Mmg).A00(ofo);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C53023Ncv.class;
    }
}
