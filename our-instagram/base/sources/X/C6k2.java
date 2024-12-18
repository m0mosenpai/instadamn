package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.6k2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6k2 {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final ReelViewerConfig A02;
    public final InterfaceC149856oe A03;
    public final InterfaceC1118853a A04;
    public final InterfaceC1119153d A05;

    public C6k2(AbstractC59962oe abstractC59962oe, UserSession userSession, ReelViewerConfig reelViewerConfig, InterfaceC1118853a interfaceC1118853a, InterfaceC1119153d interfaceC1119153d) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(reelViewerConfig, 4);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A04 = interfaceC1118853a;
        this.A02 = reelViewerConfig;
        this.A05 = interfaceC1119153d;
        this.A03 = new C6k3(userSession, interfaceC1118853a);
    }

    public final void A00(EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration) {
        AbstractC59962oe abstractC59962oe = this.A00;
        Context context = abstractC59962oe.getContext();
        if (context != null && abstractC59962oe.mFragmentManager != null) {
            AbstractC55031OXo.A02(context, EnumC50631MWs.A0J, this.A01, null, effectInfoBottomSheetConfiguration, this.A03, this.A05);
            this.A04.EJE("context_switch");
        }
    }
}
