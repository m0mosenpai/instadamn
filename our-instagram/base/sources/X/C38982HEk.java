package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.HEk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38982HEk extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1761764950);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.common.SectionHeaderViewBinder.Holder");
        IS7.A01((C38457Gve) tag, (H7F) obj);
        C0f9.A0A(-1403630312, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1437717568);
        View A00 = IS7.A00(viewGroup);
        C0f9.A0A(1573026306, A0G);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
