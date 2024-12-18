package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYZ extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(null, 0);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E3E(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_ai_agent_picker_featured_item, false), this.A00, this.A01);
    }

    public EYZ(InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8M.class;
    }
}
