package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class HIM extends AbstractC66412zI {
    public final JGR A00;
    public final String A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        ViewOnClickListenerC42033Ik2.A00(c3oo.itemView, 41, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39086HIk.class;
    }

    public HIM(JGR jgr, String str) {
        this.A01 = str;
        this.A00 = jgr;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        String str = this.A01;
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.publishing_add_product);
        TextView A0e = AbstractC166987dD.A0e(A0A, R.id.label);
        if (A0e != null) {
            A0e.setText(str);
        }
        return new C3OO(A0A);
    }
}
