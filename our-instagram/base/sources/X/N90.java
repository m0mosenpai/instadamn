package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.user.model.Product;

/* loaded from: classes9.dex */
public final class N90 extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final InterfaceC43445JHj A01;

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1379508528);
        AbstractC167027dH.A13(view, obj, obj2);
        C41626IbH c41626IbH = C41626IbH.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.search.ProductListItemViewBinder.Holder");
        c41626IbH.A00(interfaceC11380iw, (C34470FHi) obj2, this.A01, (IK9) tag, (Product) obj);
        C0f9.A0A(-445289328, A03);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public N90(InterfaceC11380iw interfaceC11380iw, InterfaceC43445JHj interfaceC43445JHj) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC43445JHj;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1545444979);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.shopping_item, false);
        A0C.setTag(new IK9(A0C));
        C0f9.A0A(1347963892, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
