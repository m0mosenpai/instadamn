package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEA extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51255Mke(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_section_visibility, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51255Mke c51255Mke = (C51255Mke) c3oo;
        AbstractC167017dG.A1N(interfaceC66482zP, c51255Mke);
        ViewOnClickListenerC55456OkA.A00(c51255Mke.A00, 22, interfaceC66482zP);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56085Ov2.class;
    }
}
