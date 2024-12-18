package X;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes7.dex */
public final class HL3 extends AbstractC37439GeJ {
    public C154796xU A00;
    public AnonymousClass388 A01;
    public String A02;
    public String A03;
    public final UserSession A04;
    public final JIJ A05;
    public final SavedCollection A06;
    public final InterfaceC684136e A07;
    public final Fragment A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.07X, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.36e] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public HL3(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JIJ jij, SavedContextualFeedNetworkConfig savedContextualFeedNetworkConfig, String str, String str2) {
        ?? r9;
        this.A08 = fragment;
        this.A04 = userSession;
        this.A05 = jij;
        SavedCollection savedCollection = savedContextualFeedNetworkConfig.A00;
        this.A06 = savedCollection;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = new C154796xU(fragment.requireContext(), AbstractC018607g.A00(fragment), userSession, savedContextualFeedNetworkConfig.A01);
        C18C.A0E(fragment instanceof AbstractC59962oe);
        C18C.A0E(fragment instanceof InterfaceC60442pS);
        C18C.A0E(fragment instanceof C1M1);
        ComponentCallbacks2 rootActivity = ((AbstractC59962oe) fragment).getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            r9 = new C684036d(fragment, interfaceC11380iw, (InterfaceC53832dN) rootActivity);
        } else {
            r9 = new Object();
        }
        this.A07 = r9;
        C1M1 c1m1 = (C1M1) fragment;
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) fragment;
        this.A01 = new C42810Iwm(fragment, userSession, new C41645Ibb(fragment, userSession, interfaceC60442pS, c1m1), new AnonymousClass387(fragment, userSession, interfaceC60442pS, null, r9, null, c1m1, null, null, false), (savedCollection == null || savedCollection.A07 != EnumC33416Epn.A05) ? savedCollection : null);
    }
}
