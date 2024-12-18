package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.N8v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52206N8v extends AbstractC65632xz {
    public final UserSession A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C52206N8v(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C0f9.A0A(-1979513793, C0f9.A03(1344910698));
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-520523288);
        Context context = viewGroup.getContext();
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.layout_header_with_action_text);
        AbstractC31172DnG.A1B(context, A0A, R.color.fds_transparent);
        AbstractC166997dE.A0T(A0A, R.id.header_text).setText(2131966378);
        C0f9.A0A(-1516454665, A03);
        return A0A;
    }
}
