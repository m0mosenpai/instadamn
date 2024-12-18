package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.api.SaveApiUtil;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148726mh implements AnonymousClass388 {
    public final Activity A00;
    public final C25671My A01;
    public final InterfaceC59992oh A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC1118853a A05;
    public final C1M1 A06;
    public final Fragment A07;

    @Override // X.AnonymousClass388
    public final void Di3(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC37202GaD interfaceC37202GaD, int i) {
        int i2 = c75113Zb.A03;
        c75113Zb.A08();
        UserSession userSession = this.A03;
        if (C57602kZ.A00(userSession).A0O(c38321qM)) {
            c38321qM.BqL();
            if (!c38321qM.BqL().isEmpty()) {
                this.A05.EJE("dialog");
                new FQ5(this.A00, userSession, interfaceC37202GaD).A00(new DialogInterfaceOnDismissListenerC35458FkF(this), c38321qM, c75113Zb, i2, i);
                return;
            }
        }
        A00(c38321qM, this, i2, i);
    }

    @Override // X.AnonymousClass388
    public final void Di5(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C11520jB c11520jB;
        Activity activity = this.A00;
        if (activity.getCurrentFocus() != null) {
            AbstractC13880nE.A0O(activity.getCurrentFocus());
        }
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A03;
        AbstractC41756IeX.A04(userSession, c38321qM, interfaceC60442pS, "long_press", i);
        this.A05.EJE("bottom_sheet");
        FB6.A00();
        C1M1 c1m1 = this.A06;
        String str = userSession.token;
        String moduleName = interfaceC60442pS.getModuleName();
        boolean isSponsoredEligible = interfaceC60442pS.isSponsoredEligible();
        boolean isOrganicEligible = interfaceC60442pS.isOrganicEligible();
        if (interfaceC60442pS instanceof AnonymousClass309) {
            c11520jB = ((AnonymousClass309) interfaceC60442pS).E6Q(c38321qM);
        } else {
            c11520jB = null;
        }
        SaveToCollectionsParentInsightsHost saveToCollectionsParentInsightsHost = new SaveToCollectionsParentInsightsHost(c11520jB, moduleName, isSponsoredEligible, isOrganicEligible);
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(str, 4);
        V1Q v1q = new V1Q();
        Bundle bundle = new Bundle();
        bundle.putString("SaveToCollectionsFragment.ARGS_MEDIA_ID", c38321qM.getId());
        bundle.putInt("SaveToCollectionsFragment.ARGS_CAROUSEL_INDEX", c75113Zb.A03);
        bundle.putInt("SaveToCollectionsFragment.ARGS_POSITION", i);
        bundle.putString("SaveToCollectionsFragment.ARGS_COLLECTION_ID_VIEWING", null);
        bundle.putString("SaveToCollectionsFragment.ARGS_SESSION_ID", c1m1.getSessionId());
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        bundle.putString("SaveToCollectionsFragment.ARGS_NAVIGATION_TYPE", "long_press");
        bundle.putParcelable("SaveToCollectionsFragment.ARGS_PARENT_MODULE", saveToCollectionsParentInsightsHost);
        v1q.setArguments(bundle);
        C3DN A00 = C3DN.A00.A00(activity);
        if (A00 != null) {
            A00.A0R(new C33168EkF(this));
            A00.A0R(v1q);
            A00.A0J(v1q);
        }
        this.A01.A05(new C42240InQ(true));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.ICf, java.lang.Object] */
    public static void A00(C38321qM c38321qM, C148726mh c148726mh, int i, int i2) {
        EnumC77213d7 enumC77213d7;
        UserSession userSession = c148726mh.A03;
        if (C57602kZ.A00(userSession).A0O(c38321qM)) {
            enumC77213d7 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A04;
        }
        InterfaceC60442pS interfaceC60442pS = c148726mh.A04;
        Activity activity = c148726mh.A00;
        C1M1 c1m1 = c148726mh.A06;
        GFH gfh = new GFH(enumC77213d7, c148726mh);
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 6);
        SaveApiUtil.A04(activity, activity, userSession, c38321qM, interfaceC60442pS, gfh, enumC77213d7, null, c1m1, null, null, null, i2, i, -1);
        C25671My c25671My = c148726mh.A01;
        ?? obj = new Object();
        obj.A00 = c38321qM;
        c25671My.E4s(AbstractC40790I5s.A00(obj));
        ReelViewerFragment.A0I((ReelViewerFragment) c148726mh.A05, false);
    }

    @Override // X.AnonymousClass375
    public final InterfaceC37202GaD CCt() {
        return new GFR(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C148726mh(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC1118853a interfaceC1118853a, C1M1 c1m1) {
        this.A07 = fragment;
        this.A00 = fragment.requireActivity();
        this.A02 = (InterfaceC59992oh) fragment;
        this.A05 = interfaceC1118853a;
        this.A06 = c1m1;
        this.A04 = interfaceC60442pS;
        this.A03 = userSession;
        this.A01 = AbstractC25651Mw.A00(userSession);
    }
}
