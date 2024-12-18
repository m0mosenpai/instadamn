package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KHe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45615KHe extends AbstractC66412zI {
    public final InterfaceC16660sJ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44642Jpm(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.muted_word_list_item, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45286K2o c45286K2o = (C45286K2o) interfaceC66482zP;
        AbstractC167017dG.A1N(c45286K2o, c3oo);
        View view = c3oo.itemView;
        C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view).setText(c45286K2o.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45286K2o.class;
    }

    public C45615KHe(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
