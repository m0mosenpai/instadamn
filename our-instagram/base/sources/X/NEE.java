package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEE extends AbstractC66412zI {
    public final N8B A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC25227BEk.A0C(layoutInflater, R.layout.branded_content_selected_project_list_cell);
        C14360o3.A07(A0C);
        return new C51271Mku(A0C, this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56079Ouw c56079Ouw = (C56079Ouw) interfaceC66482zP;
        C51271Mku c51271Mku = (C51271Mku) c3oo;
        AbstractC167017dG.A1N(c56079Ouw, c51271Mku);
        C51675Ms6 c51675Ms6 = c56079Ouw.A00;
        View view = c51271Mku.A00;
        AbstractC166997dE.A0T(view, R.id.brand_name).setText(c51675Ms6.A02);
        AbstractC166997dE.A0T(view, R.id.project_name).setText(c51675Ms6.A06);
        ViewOnClickListenerC55467OkM.A00(view, 52, c51271Mku);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56079Ouw.class;
    }

    public NEE(N8B n8b) {
        this.A00 = n8b;
    }
}
