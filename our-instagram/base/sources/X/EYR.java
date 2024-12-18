package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;

/* loaded from: classes6.dex */
public final class EYR extends AbstractC66422zJ {
    public final EOH A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E2T(this.A00, new IgdsInlineSearchBox(AbstractC31176DnK.A04(viewGroup), null, 0));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EY3 ey3 = (EY3) interfaceC66482zP;
        E2T e2t = (E2T) c3oo;
        AbstractC167017dG.A1N(ey3, e2t);
        String str = ey3.A00;
        C14360o3.A0B(str, 0);
        IgdsInlineSearchBox igdsInlineSearchBox = e2t.A02;
        BackInterceptEditText backInterceptEditText = igdsInlineSearchBox.A0E;
        backInterceptEditText.setText(str);
        backInterceptEditText.requestFocus();
        igdsInlineSearchBox.A02 = e2t.A00;
        igdsInlineSearchBox.setImeOptions(6);
        AbstractC31174DnI.A1D(igdsInlineSearchBox, -1, -2);
    }

    public EYR(EOH eoh) {
        this.A00 = eoh;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY3.class;
    }
}
