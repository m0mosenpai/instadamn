package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsInsetBanner;

/* loaded from: classes6.dex */
public final class ES0 extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "AutoFollowBackBannerBinderGroup";
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ES0(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        E1Y e1y;
        IgdsInsetBanner igdsInsetBanner;
        int A03 = C0f9.A03(-1853370173);
        C14360o3.A0B(view, 1);
        Object tag = view.getTag();
        if (tag instanceof E1Y) {
            e1y = (E1Y) tag;
        } else {
            e1y = null;
        }
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Context context = this.A00;
        AbstractC25233BEq.A0v(1, userSession, interfaceC11380iw, context);
        if (C35266Fh1.A00.A08(userSession)) {
            C35121FeO c35121FeO = new C35121FeO(interfaceC11380iw, userSession);
            InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
            AbstractC31178DnM.A12(EnumC33496ErV.BANNER, A00);
            C35121FeO.A01(A00, c35121FeO);
            if (e1y != null && (igdsInsetBanner = e1y.A00) != null) {
                igdsInsetBanner.A00 = new C36501G7z(context, interfaceC11380iw, userSession, e1y, c35121FeO);
            }
        } else if (e1y != null) {
            AbstractC167007dF.A0x(e1y.A00);
        }
        C0f9.A0A(144772664, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 587931397);
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.auto_follow_back_banner_row, false);
        A0D.setTag(new E1Y(A0D));
        C0f9.A0A(-977404784, A0G);
        return A0D;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
