package X;

import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class DTC extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C57h A01;
    public final /* synthetic */ C74863Yb A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTC(C57h c57h, C74863Yb c74863Yb, InterfaceC60442pS interfaceC60442pS, String str, long j, boolean z) {
        super(2);
        this.A03 = interfaceC60442pS;
        this.A02 = c74863Yb;
        this.A01 = c57h;
        this.A05 = z;
        this.A00 = j;
        this.A04 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1516587617, "com.instagram.compose.igds.components.navigation.actionbar.MainFeedActionBarTitleComposeView.getComposeView.<anonymous>.<anonymous> (InstagramLogoTitle.kt:69)");
            }
            InterfaceC60442pS interfaceC60442pS = this.A03;
            String moduleName = interfaceC60442pS.getModuleName();
            C74863Yb c74863Yb = this.A02;
            UserSession userSession = c74863Yb.A03;
            boolean isOrganicEligible = interfaceC60442pS.isOrganicEligible();
            boolean isSponsoredEligible = interfaceC60442pS.isSponsoredEligible();
            boolean z = this.A05;
            C5VW.A03(c5Tl, userSession, moduleName, C5UA.A01(c5Tl, new DSH(c74863Yb, this.A04, this.A00, z), 711970524), 196608, 4, false, isOrganicEligible, isSponsoredEligible);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 8388691;
            this.A01.setLayoutParams(layoutParams);
            if (C0fH.A02()) {
                C0fH.A00(1683171841);
            }
        }
        return C0eB.A00;
    }
}
