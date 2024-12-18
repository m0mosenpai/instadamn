package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EPM extends C35210Fg2 {
    public final /* synthetic */ EVX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPM(Context context, AbstractC018607g abstractC018607g, C34720FRh c34720FRh, InterfaceC37192Ga3 interfaceC37192Ga3, EVX evx, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        super(context, abstractC018607g, c34720FRh, interfaceC37192Ga3, interfaceC11380iw, userSession, str);
        this.A00 = evx;
    }

    @Override // X.C35210Fg2
    public final void A06(User user) {
        View view;
        EVX evx = this.A00;
        SearchController searchController = evx.A02;
        if (searchController.A03 == C05F.A0C && (view = (View) evx.A03.get()) != null) {
            searchController.A01(C05F.A00, 0.0f, view.getHeight(), true);
        }
        super.A06(user);
    }
}
