package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.Dv5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31639Dv5 extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E1O e1o = (E1O) c3oo;
        C14360o3.A0B(e1o, 1);
        e1o.A00.A02();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_shimmer_placeholder_layout);
        C14360o3.A0C(A0A, AbstractC43591JPw.A00(12));
        return new E1O((ShimmerFrameLayout) A0A);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY7.class;
    }
}
