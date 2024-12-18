package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class KHM extends AbstractC66412zI {
    public final InterfaceC16660sJ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45181JzN c45181JzN = (C45181JzN) interfaceC66482zP;
        C44604JpA c44604JpA = (C44604JpA) c3oo;
        AbstractC167017dG.A1N(c45181JzN, c44604JpA);
        c44604JpA.A00.setText(c45181JzN.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45181JzN.class;
    }

    public KHM(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44604JpA(AbstractC31176DnK.A04(viewGroup), this.A00);
    }
}
