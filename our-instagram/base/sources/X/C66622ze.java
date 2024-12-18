package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.2ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66622ze extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C0f9.A0A(1813323881, C0f9.A03(-292764307));
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1865577853);
        C14360o3.A0B(viewGroup, 1);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.jest_e2e_end_of_feed_indicator, viewGroup, false);
        inflate.setMinimumHeight(10);
        C0f9.A0A(1004605354, A03);
        return inflate;
    }
}
