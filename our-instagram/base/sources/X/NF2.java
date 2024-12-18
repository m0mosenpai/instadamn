package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NF2 extends AbstractC66422zJ {
    public final Context A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C51251Mka(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.immersive_catch_up_completed_item_layout, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56075Ous.class;
    }

    public NF2(Context context) {
        this.A00 = context;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        AbstractC167017dG.A1N(interfaceC66482zP, c3oo);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
    }
}
