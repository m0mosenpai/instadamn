package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EWx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32597EWx extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.row_switch_item, false);
        C31981E3j c31981E3j = new C31981E3j(A0C);
        A0C.setTag(c31981E3j);
        F89.A00(A0C, c31981E3j.A06);
        C14360o3.A0C(c31981E3j, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleSwitchRowViewBinder.Holder");
        return c31981E3j;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E8Y e8y = (E8Y) interfaceC66482zP;
        C31981E3j c31981E3j = (C31981E3j) c3oo;
        AbstractC167017dG.A1N(e8y, c31981E3j);
        FC1.A00(null, c31981E3j, null, e8y.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8Y.class;
    }
}
