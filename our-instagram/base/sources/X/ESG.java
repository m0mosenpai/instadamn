package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ESG extends AbstractC65632xz {
    public final C34609FMs A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC37216GaR A04;
    public final boolean A05;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-838265485);
        AbstractC167017dG.A1P(view, obj);
        C14360o3.A0B(obj2, 3);
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.follow.chaining.binder.RecommendedUserCardsViewBinder.Holder");
        C34552FKm c34552FKm = (C34552FKm) tag;
        C09530e4 c09530e4 = (C09530e4) obj;
        C32061E6n c32061E6n = (C32061E6n) obj2;
        InterfaceC37216GaR interfaceC37216GaR = this.A04;
        boolean z = this.A05;
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1P(interfaceC11380iw, c34552FKm);
        C14360o3.A0B(c09530e4, 3);
        AbstractC167007dF.A1G(c32061E6n, 4, interfaceC37216GaR);
        FNY fny = c34552FKm.A01;
        C47P c47p = (C47P) c09530e4.A00;
        String str = c32061E6n.A02;
        int i2 = c32061E6n.A01;
        C35106Fe8.A00(interfaceC11380iw, userSession, fny, interfaceC37216GaR, c47p, str, i2, z);
        C47P c47p2 = (C47P) c09530e4.A01;
        int i3 = 0;
        FNY fny2 = c34552FKm.A02;
        View view2 = fny2.A00;
        if (c47p2 != null) {
            view2.setVisibility(0);
            C35106Fe8.A00(interfaceC11380iw, userSession, fny2, interfaceC37216GaR, c47p2, str, i2 + 1, z);
        } else {
            view2.setVisibility(4);
        }
        if (!c32061E6n.A03) {
            i3 = c34552FKm.A00.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        }
        AbstractC13880nE.A0Y(c34552FKm.A00, i3);
        C34609FMs c34609FMs = this.A00;
        String A00 = A00(c32061E6n, c09530e4);
        C14360o3.A0B(A00, 0);
        C59062n7 A002 = c34609FMs.A01.A00(A00);
        if (!C14360o3.A0K(A002, C59062n7.A07)) {
            c34609FMs.A00.A05(view, A002);
        }
        C0f9.A0A(-324281854, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C09530e4 c09530e4 = (C09530e4) obj;
        C32061E6n c32061E6n = (C32061E6n) obj2;
        AbstractC31180DnO.A1S(anonymousClass306);
        if (c09530e4 != null && c32061E6n != null) {
            C34609FMs c34609FMs = this.A00;
            String A00 = A00(c32061E6n, c09530e4);
            C14360o3.A0B(A00, 0);
            C63622uj c63622uj = c34609FMs.A01;
            AbstractC31176DnK.A1V(c34609FMs.A03, C59062n7.A00(c09530e4, c32061E6n, A00), c63622uj, A00);
        }
    }

    public ESG(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C34609FMs c34609FMs, InterfaceC37216GaR interfaceC37216GaR, boolean z) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = interfaceC37216GaR;
        this.A00 = c34609FMs;
        this.A05 = z;
    }

    public static final String A00(C32061E6n c32061E6n, C09530e4 c09530e4) {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(((C17D) c09530e4.A00).getId());
        A1C.append('_');
        C17D c17d = (C17D) c09530e4.A01;
        if (c17d == null || (str = c17d.getId()) == null) {
            str = "Empty";
        }
        A1C.append(str);
        A1C.append('_');
        A1C.append(c32061E6n.A01);
        return A1C.toString();
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(533833588);
        View A0R = AbstractC25226BEj.A0R(AbstractC31172DnG.A09(this.A01), viewGroup, R.layout.row_recommended_user_cards, false);
        A0R.setTag(new C34552FKm(A0R));
        C0f9.A0A(-399539289, A03);
        return A0R;
    }
}
