package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9IY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9IY implements C39D, InterfaceC60602pj {
    public boolean A00;
    public final View A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final ViewOnTouchListenerC60632pm A04;
    public final UserSession A05;
    public final JIG A06;
    public final InterfaceC60442pS A07;
    public final C39D A08;
    public final C3FQ A09;
    public final C1M1 A0A;
    public final boolean A0B;

    @Override // X.C39D
    public final void AAu(int i) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.C39D
    public final Integer BEZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A08.BEZ(c38321qM);
    }

    @Override // X.C39D
    public final C39447HbZ CHF(C38321qM c38321qM) {
        C96444Vc c96444Vc;
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A05;
        FragmentActivity fragmentActivity = this.A03;
        if (!c38321qM.CdW()) {
            return null;
        }
        if (c38321qM.Cff()) {
            c96444Vc = c38321qM.A1U();
        } else {
            c96444Vc = new C96444Vc(c38321qM.A0z(), c38321qM.A0y());
        }
        IAR A01 = C86833tv.A01(fragmentActivity, userSession, c96444Vc, C39B.A0A, C05F.A01, false, false);
        if (!(A01 instanceof C39447HbZ)) {
            return null;
        }
        return (C39447HbZ) A01;
    }

    @Override // X.C39D
    public final void CpJ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A08.CpJ(c38321qM);
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        if (this.A0B) {
            InterfaceC08430c6 interfaceC08430c6 = this.A02;
            if (interfaceC08430c6 instanceof InterfaceC59992oh) {
                ((InterfaceC59992oh) interfaceC08430c6).registerLifecycleListener(this);
            }
        }
    }

    @Override // X.C39D
    public final boolean E2P(View view, C38321qM c38321qM, IKE ike, C75113Zb c75113Zb, C39447HbZ c39447HbZ) {
        AbstractC167017dG.A1P(c38321qM, c75113Zb);
        return this.A08.E2P(view, c38321qM, ike, c75113Zb, c39447HbZ);
    }

    @Override // X.C39D
    public final void Epd(C38321qM c38321qM, C38620GyN c38620GyN, C39447HbZ c39447HbZ, String str) {
        C14360o3.A0B(c38321qM, 1);
        this.A08.Epd(c38321qM, c38620GyN, c39447HbZ, str);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.C39D
    public final int AF7(int i, int i2) {
        return this.A08.AF7(i, i2);
    }

    @Override // X.C39D
    public final int AFK(int i) {
        return this.A08.AFK(i);
    }

    @Override // X.C39D
    public final void AIN() {
        boolean z;
        C3FQ c3fq = this.A09;
        if (c3fq != null) {
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A04;
            if (viewOnTouchListenerC60632pm != null) {
                z = false;
                if (viewOnTouchListenerC60632pm.A01 < 2.0f) {
                    z = true;
                }
            } else {
                z = false;
            }
            this.A00 = z;
            AbstractC167017dG.A1I(viewOnTouchListenerC60632pm, c3fq);
        }
    }

    @Override // X.C39D
    public final int APz(View view, C3FP c3fp) {
        return this.A08.APz(view, c3fp);
    }

    @Override // X.C39D
    public final void ATf() {
        this.A08.ATf();
    }

    @Override // X.C39D
    public final void ATo() {
        this.A08.ATo();
    }

    @Override // X.C39D
    public final float AiS(int i) {
        return this.A08.AiS(i);
    }

    @Override // X.C39D
    public final Integer B31(C39447HbZ c39447HbZ) {
        return this.A08.B31(c39447HbZ);
    }

    @Override // X.C39D
    public final Integer B34() {
        return this.A08.B34();
    }

    @Override // X.C39D
    public final View B8W() {
        return this.A01;
    }

    @Override // X.C39D
    public final boolean CQs() {
        return this.A08.CQs();
    }

    @Override // X.C39D
    public final boolean CQt() {
        return this.A08.CQt();
    }

    @Override // X.C39D
    public final void Co3() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm;
        C3FQ c3fq = this.A09;
        if (c3fq != null && this.A00 && (viewOnTouchListenerC60632pm = this.A04) != null) {
            viewOnTouchListenerC60632pm.A0D = true;
            viewOnTouchListenerC60632pm.onScrollStateChanged(c3fq, 0);
        }
    }

    @Override // X.C39D
    public final void EV7(int i, ViewGroup viewGroup) {
        this.A08.EV7(i, viewGroup);
    }

    @Override // X.C39D
    public final void EmC(C3FP c3fp, int i, int i2) {
        this.A08.EmC(c3fp, i, i2);
    }

    @Override // X.C39D
    public final boolean EmG(View view, int i) {
        return this.A08.EmG(view, i);
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        return this.A09;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        if (!this.A0B) {
            InterfaceC08430c6 interfaceC08430c6 = this.A02;
            if (interfaceC08430c6 instanceof InterfaceC59992oh) {
                ((InterfaceC59992oh) interfaceC08430c6).unregisterLifecycleListener(this);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        if (this.A0B) {
            InterfaceC08430c6 interfaceC08430c6 = this.A02;
            if (interfaceC08430c6 instanceof InterfaceC59992oh) {
                ((InterfaceC59992oh) interfaceC08430c6).unregisterLifecycleListener(this);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C39D c39d = this.A08;
        if (c39d.CQt() && !c39d.CQs()) {
            ATf();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C3FQ c3fq = this.A09;
        if (c3fq != null) {
            AbstractC167017dG.A1I(this.A04, c3fq);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9IY(View view, Fragment fragment, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, JIG jig, InterfaceC60442pS interfaceC60442pS, C39D c39d, C3FQ c3fq, C1M1 c1m1) {
        AbstractC167017dG.A1Q(c1m1, userSession);
        C14360o3.A0B(interfaceC60442pS, 4);
        this.A0A = c1m1;
        this.A02 = fragment;
        this.A05 = userSession;
        this.A07 = interfaceC60442pS;
        this.A01 = view;
        this.A04 = viewOnTouchListenerC60632pm;
        this.A06 = jig;
        this.A09 = c3fq;
        this.A08 = c39d;
        this.A03 = fragment.requireActivity();
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323521971367249L);
        this.A0B = A06;
        if (!A06 && (fragment instanceof InterfaceC59992oh)) {
            ((InterfaceC59992oh) fragment).registerLifecycleListener(this);
        }
    }

    @Override // X.C39D
    public final void Cxo(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A08.Cxo(c38321qM, c75113Zb);
    }
}
