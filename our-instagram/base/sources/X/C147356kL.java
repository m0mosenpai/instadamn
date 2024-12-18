package X;

import android.content.Intent;
import android.view.Choreographer;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;

/* renamed from: X.6kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147356kL implements InterfaceC145136gY {
    public static final int A0D = C147356kL.class.hashCode();
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public C41181vS A04;
    public IgShowreelNativeProgressView A05;
    public Runnable A06;
    public boolean A07;
    public long A08;
    public final ChoreographerFrameCallbackC147366kM A09;
    public final InterfaceC147306kG A0A;
    public final UserSession A0B;
    public final C3G2 A0C;

    public C147356kL(UserSession userSession, C3G2 c3g2, InterfaceC147306kG interfaceC147306kG) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c3g2, 3);
        this.A0A = interfaceC147306kG;
        this.A0B = userSession;
        this.A0C = c3g2;
        this.A09 = new ChoreographerFrameCallbackC147366kM(this);
        this.A08 = -1L;
        this.A00 = 5000.0f;
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
        this.A00 = C147316kH.A02.A00(this.A0B, c41181vS, c41551w4, this.A0C, interfaceC143576dw, c141596ac);
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
        if (this.A07) {
            this.A07 = false;
            IgShowreelNativeProgressView igShowreelNativeProgressView = this.A05;
            if (igShowreelNativeProgressView != null) {
                igShowreelNativeProgressView.pause();
            }
            Choreographer.getInstance().removeFrameCallback(this.A09);
            this.A08 = System.currentTimeMillis();
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
        if (this.A04 != null && !this.A07) {
            this.A07 = true;
            IgShowreelNativeProgressView igShowreelNativeProgressView = this.A05;
            if (igShowreelNativeProgressView != null && igShowreelNativeProgressView.CXh()) {
                IgShowreelNativeProgressView igShowreelNativeProgressView2 = this.A05;
                if (igShowreelNativeProgressView2 != null) {
                    igShowreelNativeProgressView2.EKd();
                }
                ChoreographerFrameCallbackC147366kM choreographerFrameCallbackC147366kM = this.A09;
                choreographerFrameCallbackC147366kM.A00.A02 = System.currentTimeMillis();
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC147366kM);
            }
            long j = this.A08;
            if (j > 0) {
                this.A03 += System.currentTimeMillis() - j;
            }
            C41181vS c41181vS = this.A04;
            if (c41181vS != null) {
                this.A0A.DLc(c41181vS, this.A03 / 1000.0d);
            }
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
        A00();
        C41181vS c41181vS = this.A04;
        if (c41181vS != null) {
            this.A0A.DLd(c41181vS);
        }
        IgShowreelNativeProgressView igShowreelNativeProgressView = this.A05;
        if (igShowreelNativeProgressView != null) {
            igShowreelNativeProgressView.stop();
        }
        IgShowreelNativeProgressView igShowreelNativeProgressView2 = this.A05;
        if (igShowreelNativeProgressView2 != null) {
            igShowreelNativeProgressView2.A02(A0D);
        }
        this.A05 = null;
        this.A01 = 0.0f;
        this.A03 = 0L;
        this.A08 = -1L;
        this.A06 = null;
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
