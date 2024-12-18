package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.model.SavedCollection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class WFV {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C1M1 A03;

    public final void A04(C38321qM c38321qM, XB2 xb2) {
        C189448aO c189448aO = new C189448aO(this.A01);
        Activity activity = this.A00;
        c189448aO.A0d = AbstractC166997dE.A0p(activity, 2131968437);
        C189478aR A00 = c189448aO.A00();
        FB6.A00();
        C67902V1q c67902V1q = new C67902V1q();
        Bundle bundle = new Bundle();
        bundle.putString("SaveToNewCollectionFragment.ARGS_MEDIA_ID", c38321qM.getId());
        c67902V1q.setArguments(bundle);
        C14360o3.A0C(c67902V1q, "null cannot be cast to non-null type com.instagram.save.fragment.SaveToNewCollectionFragment");
        String A0p = AbstractC166997dE.A0p(activity, 2131961124);
        WNX wnx = new WNX(47, A00, c67902V1q, xb2);
        c67902V1q.A08 = new C69150Vif(wnx, A00, A0p);
        A00.A02(activity, c67902V1q);
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A06 = A0p;
        c189458aP.A05 = wnx;
        c189458aP.A0A = false;
        A00.A0K(c189458aP.A00(), true);
    }

    public final void A05(C38321qM c38321qM, XB2 xb2, XB3 xb3, SavedCollection savedCollection) {
        AbstractC167007dF.A1E(savedCollection, 0, c38321qM);
        UserSession userSession = this.A01;
        C36295Fzp A00 = FBA.A00(userSession);
        if (A00.A07() && A03(A00)) {
            A04(c38321qM, xb2);
            return;
        }
        C189448aO c189448aO = new C189448aO(userSession);
        Activity activity = this.A00;
        c189448aO.A0d = activity.getString(2131972732);
        C189478aR A002 = c189448aO.A00();
        A002.A02(activity, A00(c38321qM, A002, xb2, xb3, savedCollection));
    }

    public final void A06(C38321qM c38321qM, XB2 xb2, XB3 xb3, SavedCollection savedCollection) {
        AbstractC167007dF.A1E(savedCollection, 0, c38321qM);
        UserSession userSession = this.A01;
        C36295Fzp A00 = FBA.A00(userSession);
        if (A00.A07() && A03(A00)) {
            A04(c38321qM, xb2);
            return;
        }
        C189448aO c189448aO = new C189448aO(userSession);
        Activity activity = this.A00;
        c189448aO.A0d = activity.getString(2131966910);
        C189478aR A002 = c189448aO.A00();
        A002.A02(activity, A00(c38321qM, A002, xb2, xb3, savedCollection));
    }

    public static final boolean A03(C36295Fzp c36295Fzp) {
        C34930FaG c34930FaG;
        boolean z;
        List A1J = AbstractC166987dD.A1J(EnumC33416Epn.A0A);
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        synchronized (c36295Fzp) {
            if (c36295Fzp.A05) {
                if (!c36295Fzp.A00.isEmpty()) {
                    Iterator A13 = AbstractC166997dE.A13(c36295Fzp.A00);
                    while (A13.hasNext()) {
                        EnumC33380EpD enumC33380EpD = ((SavedCollection) AbstractC166997dE.A0l(A13)).A06;
                        if (enumC33380EpD != null && !AbstractC001800i.A0u(emptyList, enumC33380EpD)) {
                        }
                        return false;
                    }
                }
                return true;
            }
            if (!c36295Fzp.A03.isEmpty()) {
                ConcurrentHashMap concurrentHashMap = c36295Fzp.A04;
                Iterator A0l = AbstractC167007dF.A0l(concurrentHashMap);
                while (A0l.hasNext()) {
                    EnumC33416Epn enumC33416Epn = (EnumC33416Epn) AbstractC166997dE.A0l(A0l);
                    if (A1J.contains(enumC33416Epn) && (c34930FaG = (C34930FaG) concurrentHashMap.get(enumC33416Epn)) != null) {
                        synchronized (c34930FaG) {
                            z = false;
                            Iterator A132 = AbstractC166997dE.A13(c34930FaG.A00);
                            while (true) {
                                if (A132.hasNext()) {
                                    EnumC33380EpD enumC33380EpD2 = ((SavedCollection) AbstractC166997dE.A0l(A132)).A06;
                                    if (enumC33380EpD2 == null || AbstractC001800i.A0u(emptyList, enumC33380EpD2)) {
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    public WFV(Activity activity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        AbstractC167017dG.A1Q(interfaceC60442pS, userSession);
        this.A02 = interfaceC60442pS;
        this.A00 = activity;
        this.A03 = c1m1;
        this.A01 = userSession;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.V1p, androidx.fragment.app.Fragment, java.lang.Object, X.53Z] */
    private final C67901V1p A00(C38321qM c38321qM, C189478aR c189478aR, XB2 xb2, XB3 xb3, SavedCollection savedCollection) {
        C11520jB c11520jB;
        String str;
        FB6.A00();
        String str2 = savedCollection.A0F;
        C14360o3.A07(str2);
        C1M1 c1m1 = this.A03;
        String str3 = this.A01.token;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String moduleName = interfaceC60442pS.getModuleName();
        boolean isSponsoredEligible = interfaceC60442pS.isSponsoredEligible();
        boolean isOrganicEligible = interfaceC60442pS.isOrganicEligible();
        if (interfaceC60442pS instanceof AnonymousClass309) {
            c11520jB = ((AnonymousClass309) interfaceC60442pS).E6P();
        } else {
            c11520jB = null;
        }
        SaveToCollectionsParentInsightsHost saveToCollectionsParentInsightsHost = new SaveToCollectionsParentInsightsHost(c11520jB, moduleName, isSponsoredEligible, isOrganicEligible);
        C14360o3.A0B(str3, 2);
        ?? c53z = new C53Z();
        Bundle bundle = new Bundle();
        bundle.putSerializable("SaveToCollectionFragment.ARGS_SELECTION_MODE", VCX.MOVE_TO);
        bundle.putString("SaveToCollectionFragment.ARGS_COLLECTION_ID_VIEWING", str2);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str3);
        bundle.putParcelable("SaveToCollectionFragment.ARGS_PARENT_MODULE", saveToCollectionsParentInsightsHost);
        if (c1m1 != null) {
            str = c1m1.getSessionId();
        } else {
            str = null;
        }
        bundle.putString("SaveToCollectionFragment.ARGS_SESSION_ID", str);
        c53z.setArguments(bundle);
        C14360o3.A0C(c53z, "null cannot be cast to non-null type com.instagram.save.fragment.SaveToCollectionFragment");
        c53z.A06 = new C71004WmL(c38321qM, c189478aR, this, xb2, xb3);
        return c53z;
    }

    public static final void A01(C38321qM c38321qM, C75113Zb c75113Zb, C189478aR c189478aR, WFV wfv, String str, int i, int i2, boolean z) {
        C11520jB c11520jB;
        String str2;
        FB6.A00();
        C1M1 c1m1 = wfv.A03;
        InterfaceC60442pS interfaceC60442pS = wfv.A02;
        String moduleName = interfaceC60442pS.getModuleName();
        boolean isSponsoredEligible = interfaceC60442pS.isSponsoredEligible();
        boolean isOrganicEligible = interfaceC60442pS.isOrganicEligible();
        if (interfaceC60442pS instanceof AnonymousClass309) {
            c11520jB = ((AnonymousClass309) interfaceC60442pS).E6Q(c38321qM);
        } else {
            c11520jB = null;
        }
        SaveToCollectionsParentInsightsHost saveToCollectionsParentInsightsHost = new SaveToCollectionsParentInsightsHost(c11520jB, moduleName, isSponsoredEligible, isOrganicEligible);
        C67902V1q c67902V1q = new C67902V1q();
        Bundle bundle = new Bundle();
        bundle.putString("SaveToNewCollectionFragment.ARGS_MEDIA_ID", c38321qM.getId());
        bundle.putInt("SaveToNewCollectionFragment.ARGS_CAROUSEL_INDEX", c75113Zb.A03);
        bundle.putInt("SaveToNewCollectionFragment.ARGS_POSITION", i);
        bundle.putInt("SaveToNewCollectionFragment.ARGS_PREV_NUM_COLLECTIONS", i2);
        if (c1m1 != null) {
            str2 = c1m1.getSessionId();
        } else {
            str2 = null;
        }
        bundle.putString("SaveToNewCollectionFragment.ARGS_SESSION_ID", str2);
        bundle.putString("SaveToNewCollectionFragment.ARGS_NAVIGATION_TYPE", str);
        bundle.putParcelable("SaveToNewCollectionFragment.ARGS_PARENT_MODULE", saveToCollectionsParentInsightsHost);
        c67902V1q.setArguments(bundle);
        C14360o3.A0C(c67902V1q, "null cannot be cast to non-null type com.instagram.save.fragment.SaveToNewCollectionFragment");
        WNW wnw = new WNW(4, c189478aR, c67902V1q);
        Activity activity = wfv.A00;
        c67902V1q.A08 = new C69150Vif(wnw, c189478aR, AbstractC166997dE.A0p(activity, 2131972726));
        C189448aO c189448aO = new C189448aO(wfv.A01);
        c189448aO.A0d = AbstractC166997dE.A0p(activity, 2131968437);
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A06 = activity.getString(2131972726);
        c189458aP.A05 = wnw;
        c189458aP.A0A = false;
        c189448aO.A0R = c189458aP.A00();
        c189478aR.A0G(c67902V1q, c189448aO, z, z);
    }

    public static final void A02(C38321qM c38321qM, C189478aR c189478aR, WFV wfv, XB2 xb2, int i, boolean z) {
        FB6.A00();
        C67902V1q c67902V1q = new C67902V1q();
        Bundle bundle = new Bundle();
        bundle.putString("SaveToNewCollectionFragment.ARGS_MEDIA_ID", c38321qM.getId());
        c67902V1q.setArguments(bundle);
        C14360o3.A0C(c67902V1q, "null cannot be cast to non-null type com.instagram.save.fragment.SaveToNewCollectionFragment");
        Activity activity = wfv.A00;
        String A0p = AbstractC166997dE.A0p(activity, 2131961124);
        WMh wMh = new WMh(i, 5, xb2, c189478aR, c67902V1q);
        c67902V1q.A08 = new C69150Vif(wMh, c189478aR, A0p);
        C189448aO c189448aO = new C189448aO(wfv.A01);
        c189448aO.A0d = AbstractC166997dE.A0p(activity, 2131968437);
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A06 = A0p;
        c189458aP.A05 = wMh;
        c189458aP.A0A = false;
        c189448aO.A0R = c189458aP.A00();
        c189478aR.A0G(c67902V1q, c189448aO, z, z);
    }
}
