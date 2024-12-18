package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ERF extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final C32280EJr A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERF(InterfaceC11380iw interfaceC11380iw, C32280EJr c32280EJr) {
        this.A00 = interfaceC11380iw;
        this.A01 = c32280EJr;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(257161138);
        FMA fma = (FMA) AbstractC31172DnG.A0x(view);
        User user = (User) obj;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C32280EJr c32280EJr = this.A01;
        fma.A03.setUrl(user.Bhu(), interfaceC11380iw);
        AbstractC31173DnH.A1F(fma.A02, user);
        fma.A01.setText(user.A0Q());
        C0fQ.A00(new ViewOnClickListenerC31591DuJ(c32280EJr, user, 61), fma.A00);
        C0f9.A0A(1760467584, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1624704714);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_account_recovery_user);
        viewGroup2.setTag(new FMA(viewGroup2));
        C0f9.A0A(1928242358, A03);
        return viewGroup2;
    }
}
