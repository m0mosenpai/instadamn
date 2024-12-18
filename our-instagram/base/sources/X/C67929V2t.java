package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.V2t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67929V2t extends AbstractC65632xz {
    public final InterfaceC71958XCk A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C67929V2t(InterfaceC71958XCk interfaceC71958XCk) {
        this.A00 = interfaceC71958XCk;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-32464563);
        AbstractC167027dH.A13(view, obj, obj2);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SearchSectionTitleViewBinder.Holder");
        C51760Mtj c51760Mtj = (C51760Mtj) obj;
        U36.A00(c51760Mtj, (VWV) obj2, this.A00, (U37) tag);
        C0f9.A0A(-283904570, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1270327556);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.search_section, false);
        A0C.setTag(new U37(A0C));
        C0f9.A0A(301140533, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
