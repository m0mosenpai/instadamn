package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.HHt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39069HHt extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C39092HIq c39092HIq = (C39092HIq) interfaceC66482zP;
        C38399Gua c38399Gua = (C38399Gua) c3oo;
        AbstractC167017dG.A1N(c39092HIq, c38399Gua);
        String str = c39092HIq.A01;
        String str2 = c39092HIq.A00;
        IgTextView igTextView = c38399Gua.A01;
        igTextView.setText(str);
        igTextView.setVisibility(0);
        if (str2 != null) {
            IgTextView igTextView2 = c38399Gua.A00;
            igTextView2.setText(str2);
            igTextView2.setVisibility(0);
            return;
        }
        c38399Gua.A00.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39092HIq.class;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3OO, X.Gua] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0A = AbstractC31176DnK.A0A(layoutInflater, viewGroup, R.layout.product_row_no_results);
        ?? c3oo = new C3OO(A0A);
        c3oo.A01 = AbstractC31175DnJ.A0L(A0A, R.id.row_no_results_title);
        c3oo.A00 = AbstractC31175DnJ.A0L(A0A, R.id.row_no_results_message);
        return c3oo;
    }
}
