package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class ERB extends AbstractC65632xz {
    public final UserSession A00;
    public final FFU A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERB(UserSession userSession, FFU ffu) {
        this.A00 = userSession;
        this.A01 = ffu;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String A0r;
        int A03 = C0f9.A03(-941462651);
        FJ4 fj4 = (FJ4) AbstractC31172DnG.A0x(view);
        UserSession userSession = this.A00;
        Context context = view.getContext();
        ViewOnClickListenerC35666Fp0.A00(fj4.A00, 52, this.A01);
        C14360o3.A0B(userSession, 0);
        List A19 = AbstractC31172DnG.A19(C35126FeT.A00(userSession).A05);
        if (A19.isEmpty()) {
            A0r = context.getResources().getString(2131971570);
        } else {
            A0r = AbstractC166997dE.A0r(context.getResources(), AbstractC13670mt.A05(", ", A19), 2131971571);
        }
        fj4.A01.setText(A0r);
        C0f9.A0A(1130924216, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1351082696);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.recipient_picker_add_to_highlights);
        A0A.setTag(new FJ4(A0A));
        C0f9.A0A(233669716, A03);
        return A0A;
    }
}
