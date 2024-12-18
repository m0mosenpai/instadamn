package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.2zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66752zs extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C0f9.A0A(239059447, C0f9.A03(692928043));
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1932935839);
        C14360o3.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        view.setBackgroundColor(context.getColor(AbstractC53242c7.A0D(context)));
        C0f9.A0A(-849975192, A03);
        return view;
    }
}
