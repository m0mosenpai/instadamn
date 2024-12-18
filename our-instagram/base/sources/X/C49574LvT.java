package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.shopping.ProductItemWithARIntf;

/* renamed from: X.LvT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49574LvT implements InterfaceC97544Zo, InterfaceC144606fg {
    public final /* synthetic */ DirectVisualMessageViewerController A00;

    @Override // X.InterfaceC97544Zo
    public final void DZX() {
    }

    public C49574LvT(DirectVisualMessageViewerController directVisualMessageViewerController) {
        this.A00 = directVisualMessageViewerController;
    }

    @Override // X.InterfaceC144606fg
    public final void DCv(RectF rectF, CreativeConfigIntf creativeConfigIntf, String str) {
        if (creativeConfigIntf != null) {
            DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
            if (!directVisualMessageViewerController.A0y.A04) {
                directVisualMessageViewerController.A0U = true;
                UserSession userSession = directVisualMessageViewerController.A0m;
                FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                AbstractC59962oe abstractC59962oe = directVisualMessageViewerController.A0f;
                String str2 = directVisualMessageViewerController.A16;
                InterfaceC1119353f interfaceC1119353f = directVisualMessageViewerController.A0w;
                ProductItemWithARIntf B0b = creativeConfigIntf.B0b();
                if (B0b != null) {
                    C1XJ c1xj = C1XJ.A00;
                    FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                    C22P c22p = C22P.A2P;
                    String moduleName = abstractC59962oe.getModuleName();
                    C41623IbD A08 = c1xj.A08(requireActivity, c22p, userSession, B0b.AcV(), AbstractC38048Gob.A01(B0b.BhA()), null, moduleName);
                    A08.A03 = str2;
                    A08.A01();
                } else {
                    C6XJ A02 = C6XJ.A02(fragmentActivity, ((C47723L5k) AbstractC69933Cc.A00.getValue()).A00(rectF, C22P.A2G, userSession, creativeConfigIntf), userSession, TransparentModalActivity.class, "attribution_quick_camera_fragment");
                    A02.A0E(interfaceC1119353f);
                    A02.A0C(fragmentActivity);
                }
                fragmentActivity.overridePendingTransition(0, 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1gv, X.1OW] */
    @Override // X.InterfaceC97544Zo
    public final void DZY(InterfaceC41201vU interfaceC41201vU, C101394gx c101394gx, InterfaceC97554Zq interfaceC97554Zq, String str, String str2, float f, int i) {
        boolean A1a = AbstractC167017dG.A1a(interfaceC97554Zq, c101394gx);
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
        C3o9 c3o9 = directVisualMessageViewerController.A0x;
        if (!(c3o9 instanceof MsysThreadId)) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
            if (touchInterceptorFrameLayout != null) {
                Context A0L = AbstractC166997dE.A0L(touchInterceptorFrameLayout);
                UserSession userSession = directVisualMessageViewerController.A0m;
                DirectThreadKey A01 = JRE.A01(c3o9);
                C45093JxN A02 = DirectVisualMessageViewerController.A02(directVisualMessageViewerController);
                if (A02 != null) {
                    if (!C18U.A06(C06090Tz.A05, userSession, 2342154698548576990L)) {
                        C193328hC A0I = AbstractC31171DnF.A0I(A0L);
                        A0I.A0A(2131959359);
                        A0I.A09(2131959358);
                        A0I.A07();
                        AbstractC166987dD.A1W(A0I);
                        return;
                    }
                    if (i < AbstractC25231BEo.A0I(c101394gx.A0F)) {
                        JTa A07 = AbstractC31277Doz.A07(userSession, C32711gv.class);
                        String str3 = A02.A0K;
                        ?? c1ow = new C1OW(A07);
                        c1ow.A01 = A01;
                        c1ow.A03 = str3;
                        c1ow.A00 = i;
                        c1ow.A02 = AbstractC43593JPy.A0w();
                        AbstractC31173DnH.A1U(userSession, c1ow);
                        C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0x, A02.A0P);
                        if (A00 != null) {
                            A00.A1M = Integer.valueOf(i);
                        }
                        interfaceC97554Zq.EoG(userSession, null);
                        InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
                        A0e.E77("has_ever_voted_on_direct_poll", A1a);
                        A0e.apply();
                        return;
                    }
                    C0w9.A03(KCV.__redex_internal_original_name, "Selected poll index out of bounds");
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
