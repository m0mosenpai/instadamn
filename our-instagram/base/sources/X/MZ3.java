package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class MZ3 extends AbstractC66412zI {
    public final C66122yo A00 = new Object();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C68039V7k c68039V7k = (C68039V7k) interfaceC66482zP;
        C81383k8 c81383k8 = (C81383k8) c3oo;
        AbstractC167017dG.A1N(c68039V7k, c81383k8);
        this.A00.ADw(c68039V7k.A00, c68039V7k.A01, c81383k8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C68039V7k.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C81383k8(this.A00.Csl(layoutInflater, viewGroup));
    }
}
