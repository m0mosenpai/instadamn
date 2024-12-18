package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EWs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32592EWs extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E2Q(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fan_club_gifting_price_button, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32085E8j c32085E8j = (C32085E8j) interfaceC66482zP;
        E2Q e2q = (E2Q) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c32085E8j, e2q);
        e2q.A01.setText(c32085E8j.A00);
        e2q.A02.setText(c32085E8j.A01);
        View view = e2q.A00;
        boolean z = c32085E8j.A03;
        view.setEnabled(z);
        ViewOnClickListenerC35685FpK.A01(view, 5, c32085E8j);
        float f = 0.7f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
        view.setFocusable(A1a);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32085E8j.class;
    }
}
