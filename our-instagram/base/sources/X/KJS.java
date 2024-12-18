package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KJS extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.ai_sticker_suggested_prompt, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45200Jzg c45200Jzg = (C45200Jzg) interfaceC66482zP;
        AbstractC167017dG.A1N(c45200Jzg, c3oo);
        ViewGroup.LayoutParams layoutParams = c3oo.itemView.getLayoutParams();
        int A03 = AbstractC167017dG.A03(AbstractC31172DnG.A05(c3oo));
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (c45200Jzg.A00 != 0) {
                A03 = 0;
            }
            marginLayoutParams.setMarginStart(A03);
        }
        ViewOnClickListenerC48064LPp.A00(c3oo.itemView, 63, c45200Jzg);
        AbstractC167007dF.A0N(c3oo.itemView, R.id.suggested_prompt).setText(c45200Jzg.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45200Jzg.class;
    }

    public KJS(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
