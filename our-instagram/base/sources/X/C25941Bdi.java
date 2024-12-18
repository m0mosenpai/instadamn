package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bdi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25941Bdi extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final RecyclerView A03;
    public final C66362zD A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25941Bdi(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPm jPm) {
        super(view);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.feed_product_pivots_title);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.feed_product_pivots_button);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.products_recyclerview);
        C14360o3.A0B(A0T, 5);
        AbstractC167017dG.A1U(A0T2, recyclerView);
        this.A00 = view;
        this.A02 = A0T;
        this.A01 = A0T2;
        this.A03 = recyclerView;
        Context context = view.getContext();
        C66392zG A00 = C66362zD.A00(context);
        C14360o3.A07(context);
        A00.A01(new HIZ(context, interfaceC11380iw, userSession, jPm));
        C66362zD A002 = A00.A00();
        recyclerView.setAdapter(A002);
        this.A04 = A002;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.A10(new C3YB(context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), AbstractC167017dG.A0E(context)));
    }
}
