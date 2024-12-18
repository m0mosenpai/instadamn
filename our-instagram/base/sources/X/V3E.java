package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V3E extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final XLU A03;
    public final InterfaceC72020XFi A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public V3E(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, XLU xlu, InterfaceC72020XFi interfaceC72020XFi, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(interfaceC72020XFi, 5);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = xlu;
        this.A04 = interfaceC72020XFi;
        this.A0B = z;
        this.A07 = AbstractC13620mo.A02(context);
        this.A0C = z2;
        this.A0D = z3;
        this.A0A = z4;
        this.A08 = z5;
        this.A09 = z6;
        this.A06 = str;
        this.A05 = num;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        AbstractC167017dG.A1P(obj, obj2);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1513633431);
        C14360o3.A0B(view, 1);
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
        Tx0 tx0 = (Tx0) obj2;
        C66170U2l c66170U2l = AbstractC66175U2q.A00;
        Context context = this.A00;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.search.common.model.UserSearchEntry");
        C65741TtG c65741TtG = (C65741TtG) obj;
        XLU xlu = this.A03;
        InterfaceC72020XFi interfaceC72020XFi = this.A04;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.UserRowViewBinder.Holder");
        C66171U2m c66171U2m = (C66171U2m) tag;
        boolean z = this.A0B;
        boolean z2 = this.A0C;
        boolean z3 = this.A0D;
        boolean z4 = false;
        boolean A1P = AbstractC167007dF.A1P(i, 1);
        if (tx0.A0F) {
            z4 = true;
        }
        boolean z5 = this.A09;
        String str = this.A06;
        c66170U2l.A03(null, context, interfaceC11380iw, userSession, tx0, c65741TtG, null, xlu, c66171U2m, new C66172U2n(C17060sy.A01.A01(userSession), this.A05, str, z, z2, z3, A1P, z4, z5, false, false, this.A0A, this.A08, false), interfaceC72020XFi);
        C0f9.A0A(-1343415881, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-330373308);
        C14360o3.A0B(viewGroup, 1);
        Context context = this.A00;
        ViewGroup A00 = C66170U2l.A00(context, viewGroup, this.A07);
        if (i != 0) {
            if (i == 1) {
                ViewGroup.LayoutParams layoutParams = A00.getLayoutParams();
                layoutParams.height = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
                A00.setLayoutParams(layoutParams);
            } else {
                IllegalArgumentException A0n = AbstractC25230BEn.A0n("Invalid viewType = ", i);
                C0f9.A0A(1650127043, A03);
                throw A0n;
            }
        }
        C0f9.A0A(697305906, A03);
        return A00;
    }
}
