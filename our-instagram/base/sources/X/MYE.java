package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class MYE extends AbstractC66412zI {
    public final InterfaceC55362gb A00;
    public final C66102ym A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C52357NEv c52357NEv = (C52357NEv) interfaceC66482zP;
        C81403kA c81403kA = (C81403kA) c3oo;
        AbstractC167017dG.A1N(c52357NEv, c81403kA);
        this.A01.ADw(this.A00, c52357NEv.A00, c81403kA);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52357NEv.class;
    }

    public MYE(InterfaceC11380iw interfaceC11380iw, InterfaceC55362gb interfaceC55362gb) {
        this.A00 = interfaceC55362gb;
        this.A01 = new C66102ym(interfaceC11380iw);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C81403kA(this.A01.Csl(layoutInflater, viewGroup));
    }
}
