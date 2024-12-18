package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EX5 extends AbstractC66412zI {
    public final FG9 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        FG9 fg9 = this.A00;
        C14360o3.A0B(fg9, 1);
        ViewOnClickListenerC35666Fp0.A00(c3oo.itemView, 11, fg9);
    }

    public EX5(FG9 fg9) {
        this.A00 = fg9;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.collaborative_collection_creation_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36173Fxn.class;
    }
}
