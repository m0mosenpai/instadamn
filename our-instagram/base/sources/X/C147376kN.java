package X;

import android.content.Intent;
import android.view.Choreographer;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.6kN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147376kN implements InterfaceC145136gY {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public C41181vS A04;
    public C40954ICb A05;
    public IgShowreelCompositionView A06;
    public Runnable A07;
    public boolean A08;
    public long A09;
    public final ChoreographerFrameCallbackC147386kO A0A;
    public final InterfaceC147306kG A0B;
    public final UserSession A0C;
    public final C3G2 A0D;

    public C147376kN(UserSession userSession, C3G2 c3g2, InterfaceC147306kG interfaceC147306kG) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c3g2, 3);
        this.A0B = interfaceC147306kG;
        this.A0C = userSession;
        this.A0D = c3g2;
        this.A0A = new ChoreographerFrameCallbackC147386kO(this);
        this.A00 = 5000.0f;
        this.A09 = -1L;
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        C14360o3.A0B(interfaceC143576dw, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        C14360o3.A0B(c41551w4, 3);
        if ((!c41181vS.equals(this.A04)) || c141596ac.A0m) {
            A01();
        }
        this.A00 = C147316kH.A02.A00(this.A0C, c41181vS, c41551w4, this.A0D, interfaceC143576dw, c141596ac);
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    public final void A00() {
        if (this.A08) {
            this.A08 = false;
            IgShowreelCompositionView igShowreelCompositionView = this.A06;
            if (igShowreelCompositionView != null) {
                igShowreelCompositionView.pause();
            }
            Choreographer.getInstance().removeFrameCallback(this.A0A);
            this.A09 = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void DhB() {
        if (this.A04 != null && !this.A08) {
            this.A08 = true;
            IgShowreelCompositionView igShowreelCompositionView = this.A06;
            if (igShowreelCompositionView == null || igShowreelCompositionView.getCompositionController().CXh()) {
                IgShowreelCompositionView igShowreelCompositionView2 = this.A06;
                if (igShowreelCompositionView2 != null) {
                    igShowreelCompositionView2.EKd();
                }
                ChoreographerFrameCallbackC147386kO choreographerFrameCallbackC147386kO = this.A0A;
                choreographerFrameCallbackC147386kO.A00.A02 = System.currentTimeMillis();
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC147386kO);
            }
            long j = this.A09;
            if (j > 0) {
                this.A03 += System.currentTimeMillis() - j;
            }
            InterfaceC147306kG interfaceC147306kG = this.A0B;
            C41181vS c41181vS = this.A04;
            if (c41181vS != null) {
                interfaceC147306kG.DLc(c41181vS, this.A03 / 1000.0d);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }

    public final void A01() {
        IgShowreelCompositionView igShowreelCompositionView;
        A00();
        C41181vS c41181vS = this.A04;
        if (c41181vS != null) {
            this.A0B.DLd(c41181vS);
        }
        IgShowreelCompositionView igShowreelCompositionView2 = this.A06;
        if (igShowreelCompositionView2 != null) {
            igShowreelCompositionView2.stop();
        }
        C40954ICb c40954ICb = this.A05;
        if (c40954ICb != null && (igShowreelCompositionView = this.A06) != null) {
            igShowreelCompositionView.A02.remove(c40954ICb);
        }
        this.A05 = null;
        this.A06 = null;
        this.A01 = 0.0f;
        this.A03 = 0L;
        this.A09 = -1L;
        this.A07 = null;
        this.A04 = null;
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        A01();
    }

    @Override // X.InterfaceC145136gY
    public final void DXv(String str) {
        A00();
    }
}
