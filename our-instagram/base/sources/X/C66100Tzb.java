package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.Tzb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66100Tzb extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(layoutInflater, 1);
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        AbstractC43593JPy.A1B(frameLayout, -1);
        return new UI5(frameLayout);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        UI5 ui5 = (UI5) c3oo;
        C14360o3.A0B(ui5, 1);
        ViewGroup viewGroup = ui5.A00;
        C14360o3.A0C(viewGroup, AbstractC111324zv.A00(1));
        LayoutInflater.from(viewGroup.getContext());
        throw new NullPointerException("getLayoutResId");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AbstractC70799WhF.class;
    }
}
