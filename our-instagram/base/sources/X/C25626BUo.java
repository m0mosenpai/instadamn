package X;

import android.animation.Animator;
import android.os.Handler;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;

/* renamed from: X.BUo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25626BUo extends AbstractC25683BWt implements Animator.AnimatorListener {
    public static final int A0A = AbstractC25225BEi.A1D(C25626BUo.class).hashCode();
    public int A00;
    public C147416kR A02;
    public C25627BUp A03;
    public boolean A04;
    public boolean A05;
    public final ShowreelNativeMediaView A08;
    public final InterfaceC150336ph A07 = new BVM(this, 0);
    public int A01 = -1;
    public final Handler A06 = AbstractC167007dF.A0J();
    public final RunnableC25631BUt A09 = new RunnableC25631BUt(this);

    @Override // X.InterfaceC130075uC
    public final void D1i(C6PT c6pt) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.A04 = false;
        this.A06.removeCallbacks(this.A09);
        this.A00 = 0;
        A01(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public static final void A00(C25626BUo c25626BUo) {
        C25627BUp c25627BUp;
        ServerRenderedSponsoredContentView serverRenderedSponsoredContentView;
        InterfaceC43583JMr interfaceC43583JMr;
        C147416kR c147416kR;
        int i;
        C147416kR c147416kR2 = c25626BUo.A02;
        if (c147416kR2 != null && c147416kR2.A08() && (c25627BUp = c25626BUo.A03) != null && (interfaceC43583JMr = (serverRenderedSponsoredContentView = c25627BUp.A00).A00) != null && (c147416kR = serverRenderedSponsoredContentView.A04) != null) {
            boolean EiN = c147416kR.A07.EiN();
            Long Bzx = interfaceC43583JMr.Bzx();
            if (Bzx != null) {
                i = (int) Bzx.longValue();
            } else {
                i = 0;
            }
            if (EiN) {
                i *= 1000;
            }
            c147416kR.A06(i);
        }
    }

    public static final void A01(C25626BUo c25626BUo) {
        if (!c25626BUo.A04) {
            c25626BUo.A06.postDelayed(c25626BUo.A09, 0L);
            c25626BUo.A04 = true;
        }
    }

    @Override // X.InterfaceC130075uC
    public final void DPW(C6PT c6pt) {
        InterfaceC31041Dkf interfaceC31041Dkf;
        InterfaceC31041Dkf interfaceC31041Dkf2;
        C25627BUp c25627BUp = this.A03;
        if (c25627BUp != null && (interfaceC31041Dkf2 = c25627BUp.A01) != null) {
            interfaceC31041Dkf2.Cwe();
        }
        this.A05 = true;
        C25627BUp c25627BUp2 = this.A03;
        if (c25627BUp2 != null && (interfaceC31041Dkf = c25627BUp2.A01) != null) {
            interfaceC31041Dkf.DPV();
        }
    }

    public C25626BUo(ShowreelNativeMediaView showreelNativeMediaView) {
        this.A08 = showreelNativeMediaView;
        showreelNativeMediaView.A02(this, A0A);
    }

    @Override // X.InterfaceC130075uC
    public final void Dns(C6PT c6pt) {
        A01(this);
    }

    @Override // X.InterfaceC130075uC
    public final void DEB(C6PT c6pt, Throwable th) {
    }
}
