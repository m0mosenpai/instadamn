package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public final class HII extends AbstractC66412zI {
    public final C37443GeN A00;

    @Override // X.AbstractC66422zJ
    public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        return AbstractC37300Gc1.A03(this.A00.createView(EnumC65592xv.A0v.ordinal(), viewGroup).getTag(), AbstractC111324zv.A00(1135));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42312Ioa c42312Ioa = (C42312Ioa) interfaceC66482zP;
        AbstractC167017dG.A1N(c42312Ioa, c3oo);
        this.A00.bindView(EnumC65592xv.A0v.ordinal(), AbstractC31171DnF.A06(c3oo), c42312Ioa.A00, c42312Ioa.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42312Ioa.class;
    }

    public HII(C37443GeN c37443GeN) {
        this.A00 = c37443GeN;
    }
}
