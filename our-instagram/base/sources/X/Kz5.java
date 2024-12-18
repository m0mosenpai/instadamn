package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.CustomFadingEdgeListView;

/* loaded from: classes8.dex */
public final class Kz5 {
    public final KEB A00;
    public final CustomFadingEdgeListView A01;

    public Kz5(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, InterfaceC150196pR interfaceC150196pR) {
        C14360o3.A0B(view, 3);
        this.A00 = new KEB(AbstractC166997dE.A0L(view), interfaceC11380iw, userSession, c1810981l, interfaceC150196pR);
        View requireViewById = view.requireViewById(R.id.list);
        CustomFadingEdgeListView customFadingEdgeListView = (CustomFadingEdgeListView) requireViewById;
        customFadingEdgeListView.A00 = false;
        customFadingEdgeListView.setAdapter(customFadingEdgeListView.getAdapter());
        C14360o3.A07(requireViewById);
        this.A01 = customFadingEdgeListView;
    }
}
