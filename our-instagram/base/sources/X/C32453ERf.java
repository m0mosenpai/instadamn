package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ERf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32453ERf extends AbstractC65632xz {
    public final Context A00;
    public final EQ9 A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32453ERf(Context context, EQ9 eq9, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A01 = eq9;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1284603776);
        if (view.getTag() == null) {
            C0f9.A0A(207675374, A03);
            return;
        }
        UserSession userSession = this.A03;
        view.getTag();
        if (userSession != null) {
            C17060sy.A01.A01(userSession);
        }
        throw AbstractC166987dD.A15("isPageLinkedToDifferentUser");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1048192905);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.page_row_with_preview);
        A0A.setTag(new FNL(A0A));
        C0f9.A0A(-1715604948, A03);
        return A0A;
    }
}
