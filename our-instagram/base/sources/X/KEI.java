package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KEI extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1350332749);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.common.ShoppingMenuRowViewBinder.Holder");
        L24 l24 = (L24) tag;
        E71 e71 = (E71) obj;
        AbstractC167017dG.A1N(l24, e71);
        l24.A02.setText(e71.A02);
        l24.A01.setText(String.valueOf(e71.A00));
        C0fQ.A00((View.OnClickListener) e71.A01, l24.A00);
        C0f9.A0A(2033886156, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -875826001);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.shopping_menu_row, false);
        A0C.setTag(new L24(A0C));
        C0f9.A0A(114163574, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
