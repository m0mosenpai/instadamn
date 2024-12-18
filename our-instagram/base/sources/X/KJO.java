package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJO extends AbstractC66422zJ {
    public final int A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44727JrA(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.quick_snap_consumption_viewer_end_card, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44727JrA c44727JrA = (C44727JrA) c3oo;
        AbstractC167017dG.A1N(interfaceC66482zP, c44727JrA);
        View view = c44727JrA.A01;
        int i = this.A00;
        AbstractC13880nE.A0h(view, i, i);
        AMo.A06(view, i);
        AbstractC13880nE.A0h(c44727JrA.A02, i, i);
        AbstractC31173DnH.A12(c44727JrA.A00, c44727JrA.A03, AbstractC166987dD.A0H(AbstractC001800i.A0G(KJ5.A01, AbstractC50712Us.A00)));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KJ5.class;
    }

    public KJO(int i) {
        this.A00 = i;
    }
}
