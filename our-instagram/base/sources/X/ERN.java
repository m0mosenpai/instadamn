package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class ERN extends AbstractC65632xz {
    public final Context A00;
    public final GYQ A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERN(Context context, GYQ gyq) {
        this.A00 = context;
        this.A01 = gyq;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-533945074);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleHeaderRowViewBinder.Holder");
        AbstractC35093Fd4.A01((C31335Dq0) obj, this.A01, (E1F) tag, null);
        C0f9.A0A(1457643768, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1604563871);
        C14360o3.A0B(viewGroup, 1);
        View view = AbstractC35093Fd4.A00(this.A00, viewGroup, true).itemView;
        C14360o3.A07(view);
        C0f9.A0A(-1097465207, A03);
        return view;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
