package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Dw0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31695Dw0 extends AbstractC66412zI {
    public final GYT A00;

    public C31695Dw0(GYT gyt) {
        C14360o3.A0B(gyt, 1);
        this.A00 = gyt;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        VA9 va9 = (VA9) interfaceC66482zP;
        AbstractC167017dG.A1N(va9, c3oo);
        Context A0L = AbstractC166997dE.A0L(c3oo.itemView);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.search.SearchFooterViewBinder.Holder");
        C31699Dw4 c31699Dw4 = va9.A00;
        String str = c31699Dw4.A01;
        int i = c31699Dw4.A00;
        boolean z = va9.A01.A00;
        FC3.A00(A0L, this.A00, (FLP) tag, str, i, z);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.row_search_for_x);
        A0A.setTag(new FLP(A0A));
        C3OO c3oo = new C3OO(A0A);
        if (A0A.getTag() instanceof FLP) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA9.class;
    }
}
