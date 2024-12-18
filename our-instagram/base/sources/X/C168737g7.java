package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7g7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168737g7 extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C168737g7(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(2086997493);
        C34531FJr c34531FJr = (C34531FJr) obj2;
        Object tag = view.getTag();
        tag.getClass();
        AbstractC35093Fd4.A02((C31335Dq0) obj, (E1F) tag, c34531FJr.A00, c34531FJr.A01);
        C0f9.A0A(-13880068, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-2038080600);
        View view = AbstractC35093Fd4.A00(this.A00, viewGroup, false).itemView;
        C0f9.A0A(-562385633, A03);
        return view;
    }
}
