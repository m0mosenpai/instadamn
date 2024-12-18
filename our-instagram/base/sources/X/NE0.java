package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class NE0 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56121Ovg c56121Ovg = (C56121Ovg) interfaceC66482zP;
        C51270Mkt c51270Mkt = (C51270Mkt) c3oo;
        AbstractC167017dG.A1N(c56121Ovg, c51270Mkt);
        int i = c56121Ovg.A00;
        c51270Mkt.A01.A02(AbstractC166997dE.A0p(c51270Mkt.A00, i), c56121Ovg.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56121Ovg.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context A04 = AbstractC31176DnK.A04(viewGroup);
        return new C51270Mkt(A04, new C38311Gsx(A04));
    }
}
