package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.Gpk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38117Gpk extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C39098HIw c39098HIw = (C39098HIw) interfaceC66482zP;
        AbstractC153236ur.A03(c39098HIw.A00, (C153276uw) c3oo, c39098HIw.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C153276uw(AbstractC153236ur.A01(layoutInflater, viewGroup));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39098HIw.class;
    }
}
