package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public final class HI0 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C52353NEr c52353NEr = (C52353NEr) interfaceC66482zP;
        AbstractC153236ur.A02(c52353NEr.A00, (C153276uw) c3oo, c52353NEr.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52353NEr.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A01 = AbstractC153236ur.A01(layoutInflater, viewGroup);
        C153276uw c153276uw = new C153276uw(A01);
        A01.setTag(c153276uw);
        return c153276uw;
    }
}
