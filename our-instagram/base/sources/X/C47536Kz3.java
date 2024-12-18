package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.CustomFadingEdgeListView;
import java.util.List;

/* renamed from: X.Kz3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47536Kz3 {
    public CustomFadingEdgeListView A00;
    public final KEE A01;

    public C47536Kz3(Context context, ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, CustomFadingEdgeListView customFadingEdgeListView, C7OC c7oc, int i, int i2) {
        C14360o3.A0B(customFadingEdgeListView, 5);
        this.A00 = customFadingEdgeListView;
        KEE kee = new KEE(AbstractC166997dE.A0L(customFadingEdgeListView), interfaceC11380iw, userSession, c7oc, i, i2);
        this.A01 = kee;
        List A0J = AbstractC009903n.A0J(C148336m3.A04.A07(userSession));
        List list = kee.A00;
        list.clear();
        list.addAll(A0J);
        KEE.A00(kee);
        CustomFadingEdgeListView customFadingEdgeListView2 = this.A00;
        customFadingEdgeListView2.A00 = false;
        customFadingEdgeListView2.setAdapter((ListAdapter) kee);
        int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A00.setOnScrollListener(new C220579oh(context, viewGroup, interfaceC11380iw, userSession, kee, new JWK(this.A00)));
    }
}
