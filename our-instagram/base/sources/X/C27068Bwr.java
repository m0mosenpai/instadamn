package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Bwr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27068Bwr extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final C45496KCl A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C25934Bdb(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.gallery_grid_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C29161CtS c29161CtS = (C29161CtS) interfaceC66482zP;
        C25934Bdb c25934Bdb = (C25934Bdb) c3oo;
        AbstractC167007dF.A1K(c29161CtS, c25934Bdb);
        IgImageView igImageView = c25934Bdb.A02;
        igImageView.setUrl(c29161CtS.A00(), this.A00);
        int i = 0;
        c25934Bdb.A01.setVisibility(0);
        View view = c25934Bdb.A00;
        if (c29161CtS.A00 == -1) {
            i = 8;
        }
        view.setVisibility(i);
        c25934Bdb.A03.A00(c29161CtS.A00);
        ViewOnClickListenerC28668ClG.A02(igImageView, 28, c29161CtS, this);
    }

    public C27068Bwr(InterfaceC11380iw interfaceC11380iw, C45496KCl c45496KCl) {
        this.A00 = interfaceC11380iw;
        this.A01 = c45496KCl;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C29161CtS.class;
    }
}
