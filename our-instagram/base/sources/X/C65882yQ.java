package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65882yQ extends AbstractC65632xz {
    public C685736u A00;
    public final UserSession A01;
    public final C65892yR A02;

    public C65882yQ(Context context, C07X c07x, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c07x, 3);
        this.A01 = userSession;
        this.A02 = new C65892yR(context, c07x, userSession);
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1195599109);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C65892yR c65892yR = this.A02;
        LithoView lithoView = (LithoView) view;
        String id = ((InterfaceC38381qS) obj).getId();
        if (id == null) {
            id = "";
        }
        c65892yR.A05(lithoView, id, B7O.A00, new DGY(this, 34), new DGY(this, 35));
        C0f9.A0A(-291410333, A03);
    }

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
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(851130581);
        LithoView A032 = this.A02.A03();
        C0f9.A0A(2137553667, A03);
        return A032;
    }
}
