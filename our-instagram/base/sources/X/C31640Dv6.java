package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Dv6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31640Dv6 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.direct_row_limit_disclaimer, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return new E1Q((TextView) inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31608Dua c31608Dua = (C31608Dua) interfaceC66482zP;
        E1Q e1q = (E1Q) c3oo;
        AbstractC167017dG.A1N(c31608Dua, e1q);
        e1q.A00.setText(c31608Dua.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31608Dua.class;
    }
}
