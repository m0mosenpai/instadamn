package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public final class HIO extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC43386JFb A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42326Ioo c42326Ioo = (C42326Ioo) interfaceC66482zP;
        C38404Guf c38404Guf = (C38404Guf) c3oo;
        AbstractC167007dF.A1K(c42326Ioo, c38404Guf);
        C41643IbZ c41643IbZ = c42326Ioo.A02;
        ISB.A01(c42326Ioo.A00, c42326Ioo.A01, this.A00, this.A01, c38404Guf, c41643IbZ, c42326Ioo.A03, false);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        return ISB.A00(viewGroup);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42326Ioo.class;
    }

    public HIO(InterfaceC11380iw interfaceC11380iw, InterfaceC43386JFb interfaceC43386JFb) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC43386JFb;
    }
}
