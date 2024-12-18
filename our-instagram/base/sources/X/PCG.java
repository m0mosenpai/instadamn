package X;

import android.view.View;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.rtc.views.omnigridview.OmniGridView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorCoordinatorLayout;

/* loaded from: classes9.dex */
public final class PCG implements InterfaceC57985PnV {
    public OHN A00;
    public boolean A01;
    public final View A02;
    public final UserSession A03;
    public final InterfaceC09390do A04 = C57543PgH.A01(this, 9);
    public final InterfaceC09390do A06 = C57543PgH.A01(this, 11);
    public final InterfaceC09390do A08 = C57543PgH.A01(this, 13);
    public final InterfaceC09390do A05 = C57543PgH.A01(this, 10);
    public final InterfaceC09390do A07 = C57543PgH.A01(this, 12);

    public final OHN A00() {
        OHN ohn = this.A00;
        if (ohn != null) {
            return ohn;
        }
        C14360o3.A0F("listener");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.PlO, java.lang.Object] */
    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        ViewOnTouchListenerC50553MTk viewOnTouchListenerC50553MTk;
        C51903Mwl c51903Mwl = (C51903Mwl) interfaceC57856PlM;
        C14360o3.A0B(c51903Mwl, 0);
        boolean z = c51903Mwl.A00;
        OmniGridView omniGridView = (OmniGridView) this.A04.getValue();
        if (z) {
            omniGridView.A06 = (C55751OpK) this.A07.getValue();
            viewOnTouchListenerC50553MTk = new ViewOnTouchListenerC50553MTk(this, 18);
        } else {
            viewOnTouchListenerC50553MTk = null;
            omniGridView.A06 = null;
        }
        omniGridView.A00 = viewOnTouchListenerC50553MTk;
        if (c51903Mwl.A01) {
            ViewOnTouchListenerC51475MoM viewOnTouchListenerC51475MoM = (ViewOnTouchListenerC51475MoM) this.A05.getValue();
            View A0d = AbstractC166987dD.A0d(this.A06);
            C14360o3.A0B(A0d, 0);
            A0d.setOnTouchListener(viewOnTouchListenerC51475MoM);
        } else {
            InterfaceC09390do interfaceC09390do = this.A06;
            if (interfaceC09390do.CWa()) {
                this.A05.getValue();
                View A0d2 = AbstractC166987dD.A0d(interfaceC09390do);
                C14360o3.A0B(A0d2, 0);
                A0d2.setOnTouchListener(null);
            }
        }
        boolean z2 = this.A01;
        boolean z3 = c51903Mwl.A03;
        if (z2 != z3 && z3) {
            A00().A00.A04.A06(new Object(), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
        this.A01 = z3;
    }

    public PCG(View view, UserSession userSession) {
        this.A02 = view;
        this.A03 = userSession;
        ((TouchInterceptorCoordinatorLayout) view).COs(new ViewOnTouchListenerC50553MTk(this, 17));
    }
}
