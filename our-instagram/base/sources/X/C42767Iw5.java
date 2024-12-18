package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Iw5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42767Iw5 implements InterfaceC55012g0 {
    public final int A00;
    public final Object A01;

    public C42767Iw5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC55012g0
    public final void DSU(C4NL c4nl) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c4nl, 0);
                HCG hcg = (HCG) this.A01;
                if (hcg.A05 == null || hcg.A02 == null) {
                    return;
                }
                FrameLayout frameLayout = hcg.A01;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    AnonymousClass303 anonymousClass303 = hcg.A02;
                    if (anonymousClass303 != null) {
                        anonymousClass303.A03(hcg.A05, c4nl, null);
                    }
                    AnonymousClass303 anonymousClass3032 = hcg.A02;
                    if (anonymousClass3032 == null) {
                        return;
                    }
                    FrameLayout frameLayout2 = hcg.A01;
                    if (frameLayout2 != null) {
                        View A01 = anonymousClass3032.A01(0, null, frameLayout2);
                        if (A01 == null) {
                            return;
                        }
                        FrameLayout frameLayout3 = hcg.A01;
                        if (frameLayout3 != null) {
                            frameLayout3.addView(A01);
                            return;
                        }
                    }
                }
                C14360o3.A0F("qpView");
                throw C00O.createAndThrow();
            case 1:
                AdsProductPageFragment adsProductPageFragment = (AdsProductPageFragment) this.A01;
                C41753IeT c41753IeT = new C41753IeT(adsProductPageFragment.A0O);
                c41753IeT.A01 = c4nl;
                C41726Idx.A01(adsProductPageFragment, c41753IeT);
                IMP imp = adsProductPageFragment.A05;
                imp.A00(imp.A00, imp.A01);
                imp.A04.notifyDataSetChanged();
                return;
            default:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
                C38262Gs5 c38262Gs5 = reelDashboardFragment.mListAdapter;
                c38262Gs5.A02 = reelDashboardFragment.A09;
                c38262Gs5.A03 = (C52672NRt) c4nl;
                C0fA.A00(c38262Gs5, -1726971636);
                return;
        }
    }
}
