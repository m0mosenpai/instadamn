package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes8.dex */
public final class KJJ extends AbstractC66422zJ {
    public final InterfaceC16820sZ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.ai_sticker_generate_more_button, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        K04 k04 = (K04) interfaceC66482zP;
        boolean A1R = AbstractC167007dF.A1R(0, k04, c3oo);
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(c3oo.itemView, R.id.action_button);
        if (!k04.A00) {
            ViewOnClickListenerC48064LPp.A00(c3oo.itemView, 61, this);
            igdsButton.setLoading(false);
        } else {
            igdsButton.setLoading(A1R);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K04.class;
    }

    public KJJ(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
