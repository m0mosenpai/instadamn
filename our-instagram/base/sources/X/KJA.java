package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJA extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.ai_sticker_reroll_prompts, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45182JzO.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        AbstractC167017dG.A1N(interfaceC66482zP, c3oo);
        ViewOnClickListenerC48064LPp.A00(c3oo.itemView, 62, interfaceC66482zP);
    }
}
