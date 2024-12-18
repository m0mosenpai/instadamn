package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public final class HIU extends AbstractC66412zI {
    public final EnumC65592xv A00;
    public final C37443GeN A01;
    public final Class A02;

    @Override // X.AbstractC66422zJ
    public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View createView = this.A01.createView(this.A00.ordinal(), viewGroup);
        if (createView.getTag() == null) {
            createView.setTag(new C38405Gug(createView, 1));
        }
        return AbstractC37300Gc1.A03(createView.getTag(), AbstractC111324zv.A00(1135));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        AbstractC42554IsY abstractC42554IsY = (AbstractC42554IsY) interfaceC66482zP;
        AbstractC167017dG.A1N(abstractC42554IsY, c3oo);
        this.A01.bindView(this.A00.ordinal(), AbstractC31171DnF.A06(c3oo), abstractC42554IsY.A01, abstractC42554IsY.A02);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return this.A02;
    }

    public HIU(EnumC65592xv enumC65592xv, C37443GeN c37443GeN, Class cls) {
        this.A00 = enumC65592xv;
        this.A02 = cls;
        this.A01 = c37443GeN;
    }
}
