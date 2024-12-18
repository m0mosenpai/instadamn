package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iuy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42703Iuy implements InterfaceC58152PqH {
    public boolean A00;
    public final int A01 = 0;
    public final Object A02;

    public C42703Iuy(C37716Gir c37716Gir) {
        this.A02 = c37716Gir;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C9JS c9js;
        if (this.A01 != 0) {
            C37716Gir c37716Gir = (C37716Gir) this.A02;
            AbstractC59962oe abstractC59962oe = c37716Gir.A04;
            if (abstractC59962oe.mLifecycleRegistry.A07() == C07S.RESUMED) {
                this.A00 = true;
                InterfaceC60442pS interfaceC60442pS = c37716Gir.A08;
                UserSession userSession = c37716Gir.A06;
                ClipsViewerConfig clipsViewerConfig = c37716Gir.A05;
                C37604Ggz c37604Ggz = c37716Gir.A09;
                C14360o3.A0B(interfaceC60442pS, 0);
                AbstractC167007dF.A1F(userSession, 1, c37604Ggz);
                InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(interfaceC60442pS, userSession);
                if (A0A.isSampled()) {
                    AbstractC25229BEm.A1A(A0A, interfaceC60442pS);
                    AbstractC25230BEn.A1B(A0A, 0L);
                    AbstractC25229BEm.A19(A0A, -1);
                    AbstractC25225BEi.A1P(A0A, c37604Ggz.A01);
                    AbstractC37300Gc1.A0e(BQL.A1S, A0A);
                    AbstractC25225BEi.A1M(EnumC120795dP.A0c, A0A);
                    AbstractC37300Gc1.A0r(A0A, c37604Ggz.A00);
                    A0A.Cht();
                }
                try {
                    C22P A00 = IB0.A00(clipsViewerConfig.A0J);
                    FragmentActivity fragmentActivity = c37716Gir.A03;
                    C44496Jm2 c44496Jm2 = c37716Gir.A07;
                    if (c44496Jm2 != null) {
                        c9js = c44496Jm2.A01;
                    } else {
                        c9js = null;
                    }
                    AbstractC167007dF.A1D(A00, 0, fragmentActivity);
                    if (c9js != null) {
                        AbstractC46690Kl9.A00(userSession, new C42398Ipz(fragmentActivity, A00, abstractC59962oe, userSession, c9js), c9js.A09);
                        return;
                    } else {
                        AbstractC41671Ic3.A01(fragmentActivity, null, abstractC59962oe, A00, userSession, false, true);
                        return;
                    }
                } catch (Exception e) {
                    C0f5 AEp = C18950wb.A01.AEp("ClipsViewerSnackbarController", 817902720);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "Could not open camera from unfinished reel snackbar");
                    AEp.ERI(e);
                    AEp.report();
                    return;
                }
            }
            return;
        }
        C14360o3.A0B(view, 0);
        AbstractC34775FTy.A01(((C31305DpR) this.A02).A00, AbstractC166997dE.A0L(view), this.A00);
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        C44496Jm2 c44496Jm2;
        if (this.A01 != 0) {
            C37716Gir c37716Gir = (C37716Gir) this.A02;
            if (c37716Gir.A04.mLifecycleRegistry.A07() == C07S.RESUMED && !this.A00 && (c44496Jm2 = c37716Gir.A07) != null) {
                AbstractC166987dD.A1Z(new PYv(c44496Jm2, null, 10), AbstractC141776au.A00(c44496Jm2));
            }
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        if (this.A01 != 0) {
            C37716Gir c37716Gir = (C37716Gir) this.A02;
            InterfaceC60442pS interfaceC60442pS = c37716Gir.A08;
            UserSession userSession = c37716Gir.A06;
            C37604Ggz c37604Ggz = c37716Gir.A09;
            AbstractC167017dG.A1N(interfaceC60442pS, userSession);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, c37604Ggz, 4), "instagram_clips_viewer_link_impression");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                AbstractC25230BEn.A1B(A0f, 0L);
                AbstractC25229BEm.A19(A0f, -1);
                AbstractC25225BEi.A1P(A0f, c37604Ggz.A01);
                AbstractC25233BEq.A17(A0f, "chaining_session_id", c37604Ggz.A00);
                AbstractC37300Gc1.A0e(BQL.A1S, A0f);
                AbstractC25225BEi.A1M(EnumC120795dP.A0c, A0f);
                A0f.Cht();
            }
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42703Iuy(C31305DpR c31305DpR, boolean z) {
        this.A02 = c31305DpR;
        this.A00 = z;
    }
}
