package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.HcH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39489HcH extends AbstractC38244Grn implements C30G {
    public C4QW A00;
    public C6QC A01;
    public C4S7 A02;
    public C25370BKn A03;
    public Integer A04;
    public Runnable A05;
    public boolean A06;
    public final AbstractC59962oe A07;
    public final C30P A08;
    public final J05 A09;
    public final java.util.Set A0A;

    @Override // X.JIM
    public final int E3c(String str) {
        C4QW c4qw = this.A00;
        int i = 0;
        if (c4qw == null) {
            return 0;
        }
        if (Be4() == C3Q0.PLAYING) {
            c4qw.E3d(str);
        }
        JIL jil = super.A02;
        if (jil != null) {
            jil.pause();
            i = jil.getCurrentPositionMs();
        }
        C4QW c4qw2 = this.A00;
        if (c4qw2 != null) {
            return c4qw2.getCurrentPositionMs();
        }
        return i;
    }

    @Override // X.JIM
    public final boolean E5w(C62862tP c62862tP, C120985dq c120985dq, C37644Ghd c37644Ghd, C25370BKn c25370BKn, float f, int i, int i2, boolean z, boolean z2) {
        C3Q0 c3q0;
        JIL jil;
        InterfaceC43583JMr interfaceC43583JMr;
        C6QC c6qc;
        MediaFrameLayout mediaFrameLayout;
        ImageUrl A1S;
        C6QC c6qc2;
        IgProgressImageView igProgressImageView;
        AbstractC25229BEm.A1I(c120985dq, 1, c62862tP);
        AbstractC59962oe abstractC59962oe = this.A07;
        Context context = abstractC59962oe.getContext();
        boolean z3 = false;
        if (context != null && abstractC59962oe.isResumed()) {
            C4QW c4qw = this.A00;
            if (c4qw != null) {
                c3q0 = ((C4QT) c4qw).A0M;
            } else {
                c3q0 = null;
            }
            if (c3q0 != C3Q0.STOPPING) {
                this.A03 = c25370BKn;
                super.A00 = c120985dq;
                super.A01 = c37644Ghd;
                C4QW c4qw2 = c4qw;
                if (c4qw == null) {
                    C4QT A00 = C4QS.A00(context, super.A03, this.A08, this, abstractC59962oe.getModuleName());
                    A00.Ed6(EnumC95184Qe.A03);
                    A00.EYb(true);
                    A00.A0N = this;
                    A00.A0Z = true;
                    A00.A06 = 100;
                    this.A00 = A00;
                    c4qw2 = A00;
                }
                c4qw2.Eol("unknown", true);
                this.A04 = C05F.A00;
                UserSession userSession = super.A03;
                if (C18U.A06(C06090Tz.A06, userSession, 36326880634222768L)) {
                    jil = c25370BKn.A04;
                } else {
                    C25370BKn c25370BKn2 = this.A03;
                    if (c25370BKn2 != null) {
                        jil = (ServerRenderedSponsoredContentView) c25370BKn2.A08.findViewById(R.id.clips_server_rendered_component_id);
                    } else {
                        jil = null;
                    }
                }
                super.A02 = jil;
                C38321qM A0y = AbstractC25226BEj.A0y(c120985dq);
                C4S7 c4s7 = new C4S7(c120985dq, i);
                this.A02 = c4s7;
                if (A0y.A5B()) {
                    JIL jil2 = super.A02;
                    if (jil2 != null) {
                        c6qc = jil2.getVideoView();
                    } else {
                        c6qc = null;
                    }
                    this.A01 = c6qc;
                    ExtendedImageUrl A1q = A0y.A1q(context);
                    if (A1q != null && (A1S = A0y.A1S()) != null && (c6qc2 = this.A01) != null && (igProgressImageView = c6qc2.A00) != null) {
                        igProgressImageView.setUrlWithFallback(A1q, A1S, abstractC59962oe);
                    }
                    C6QC c6qc3 = this.A01;
                    if (c6qc3 != null && (mediaFrameLayout = c6qc3.A01) != null) {
                        this.A05 = new RunnableC43160J5x(c120985dq, mediaFrameLayout, c4s7, c4qw2, this, abstractC59962oe.getModuleName(), f, i2, z);
                    } else {
                        z3 = true;
                    }
                    this.A06 = z3;
                }
                JIL jil3 = super.A02;
                if (jil3 != null) {
                    InterfaceC104924o5 interfaceC104924o5 = c120985dq.A06().A0I;
                    if (interfaceC104924o5 != null) {
                        interfaceC43583JMr = interfaceC104924o5.BVT();
                        if (interfaceC43583JMr != null) {
                            jil3.COJ(userSession, super.A04, true);
                        }
                    } else {
                        interfaceC43583JMr = null;
                    }
                    jil3.setTransformation(c120985dq.A06(), userSession, c62862tP, this.A09);
                    if (interfaceC43583JMr != null) {
                        jil3.ADb(interfaceC43583JMr, AbstractC25226BEj.A1E(c120985dq));
                    }
                }
                if (((C4QT) c4qw2).A0M == C3Q0.IDLE) {
                    Runnable runnable = this.A05;
                    if (runnable != null) {
                        runnable.run();
                    }
                    this.A05 = null;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.JIM
    public final void EKu() {
    }

    @Override // X.C30G
    public final void onCompletion() {
    }

    @Override // X.C30G
    public final void onCues(List list) {
        C14360o3.A0B(list, 0);
        for (C37560GgG c37560GgG : this.A0A) {
            C120985dq c120985dq = super.A00;
            if (c120985dq != null) {
                Iterator it = c37560GgG.A0I.iterator();
                while (it.hasNext()) {
                    ((JIH) it.next()).D8r(c120985dq, list);
                }
            }
        }
    }

    @Override // X.C30G
    public final void onDrawnToSurface() {
    }

    @Override // X.C30G
    public final void onSeeking(long j) {
    }

    @Override // X.C30G
    public final void onStopVideo(String str, boolean z) {
        C4QW c4qw;
        C14360o3.A0B(str, 0);
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
            this.A05 = null;
        }
        if (str.equals("fragment_paused") && (c4qw = this.A00) != null && this.A02 != null) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                it.next();
                c4qw.getCurrentPositionMs();
            }
        }
    }

    @Override // X.C30G
    public final void onSurfaceTextureDestroyed() {
    }

    @Override // X.C30G
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        Integer num;
        C14360o3.A0B(c4s7, 0);
        JIL jil = super.A02;
        if (jil != null) {
            jil.Dzm();
        }
        C4S8 c4s8 = c4s7.A02;
        boolean z = c4s8.A02;
        EnumC92424Bx enumC92424Bx = c4s8.A01;
        C14360o3.A06(enumC92424Bx);
        EnumC92424Bx enumC92424Bx2 = c4s8.A00;
        C14360o3.A06(enumC92424Bx2);
        boolean z2 = c4s8.A03;
        for (C37560GgG c37560GgG : this.A0A) {
            synchronized (c37560GgG) {
                C206199Bc c206199Bc = new C206199Bc(enumC92424Bx, enumC92424Bx2, z, z2);
                Iterator it = c37560GgG.A0J.iterator();
                while (it.hasNext()) {
                    ((JIK) it.next()).E0A(c206199Bc, C37560GgG.A00(c37560GgG));
                }
                C37563GgJ A03 = C37560GgG.A03(c37560GgG);
                C120985dq A032 = A03.A03.A03(C37560GgG.A00(c37560GgG));
                if (A032 != null) {
                    if (A032.A02 != null) {
                        C120985dq A01 = C37560GgG.A01(c37560GgG);
                        if (A01 != null) {
                            num = C37560GgG.A02(A01, c37560GgG).A0H;
                        } else {
                            num = null;
                        }
                        Iterator it2 = c37560GgG.A0I.iterator();
                        while (it2.hasNext()) {
                            ((JIH) it2.next()).DzP(A032, num, C37560GgG.A00(c37560GgG));
                        }
                    }
                    C41699IdS c41699IdS = c37560GgG.A02;
                    if (c41699IdS != null) {
                        c41699IdS.A02(A032.getId());
                    }
                    C43749JWk A00 = AbstractC43751JWn.A00(c37560GgG.A0E);
                    C38801rC c38801rC = C38321qM.A0h;
                    A00.A00(C38801rC.A06(A032.getId()));
                }
            }
        }
    }

    @Override // X.C30G
    public final void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
    }

    @Override // X.JIM
    public final void A9A(C37560GgG c37560GgG) {
        this.A0A.add(c37560GgG);
    }

    @Override // X.JIM
    public final void AHp() {
        this.A0A.clear();
    }

    @Override // X.JIM
    public final C9C1 AuC() {
        C4QW c4qw = this.A00;
        if (c4qw != null) {
            return c4qw.AuC();
        }
        return null;
    }

    @Override // X.JIM
    public final C120985dq AuE() {
        return super.A00;
    }

    @Override // X.JIM
    public final C3Q0 Be4() {
        C3Q0 c3q0;
        C4QW c4qw = this.A00;
        if (c4qw == null || (c3q0 = ((C4QT) c4qw).A0M) == null) {
            return C3Q0.IDLE;
        }
        return c3q0;
    }

    @Override // X.JIM
    public final C4S7 CFH() {
        return this.A02;
    }

    @Override // X.JIM
    public final C25370BKn CFh() {
        return this.A03;
    }

    @Override // X.JIM
    public final boolean CKi() {
        C4QW c4qw = this.A00;
        if (c4qw != null) {
            return c4qw.CKi();
        }
        return false;
    }

    @Override // X.AbstractC38244Grn, X.JIM
    public final void EE4(String str) {
        C4QW c4qw = this.A00;
        if (c4qw != null) {
            c4qw.E3d(str);
            c4qw.EE4(str);
            this.A00 = null;
        }
        super.EE4(str);
        this.A03 = null;
        this.A01 = null;
    }

    @Override // X.JIM
    public final void EFb(C37560GgG c37560GgG) {
        this.A0A.remove(c37560GgG);
    }

    @Override // X.JIM
    public final boolean EPc() {
        C4QW c4qw = this.A00;
        if (c4qw != null) {
            return c4qw.EPc();
        }
        return false;
    }

    @Override // X.JIM
    public final void EQ0(boolean z) {
        C4QW c4qw = this.A00;
        if (c4qw != null) {
            c4qw.EQ0(z);
        }
    }

    @Override // X.JIM
    public final void EbH(String str) {
        C4QW c4qw = this.A00;
        if (c4qw != null) {
            c4qw.EbH(str);
        }
    }

    @Override // X.JIM
    public final void Ef8(boolean z, String str) {
        C4QW c4qw = this.A00;
        if (c4qw != null) {
            c4qw.Ef8(z, str);
        }
    }

    @Override // X.JIM
    public final void EhI(float f, int i) {
        JIL jil = super.A02;
        if (jil != null) {
            jil.EhI(f, i);
        }
        C4QW c4qw = this.A00;
        if (c4qw != null) {
            c4qw.EhI(f, i);
        }
        C4S7 c4s7 = this.A02;
        if (c4s7 != null) {
            c4s7.A00 = AbstractC167007dF.A1O((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
    }

    @Override // X.C30G
    public final void onLoop(int i) {
        C120985dq c120985dq = super.A00;
        if (c120985dq != null) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                ((C37560GgG) it.next()).A0O(c120985dq, i);
            }
        }
    }

    @Override // X.C30G
    public final void onPrepare(C4S7 c4s7) {
        C120985dq c120985dq = super.A00;
        if (c120985dq != null) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                ((C37560GgG) it.next()).A0L(c120985dq);
            }
        }
    }

    @Override // X.C30G
    public final void onProgressStateChanged(boolean z) {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            ((C37560GgG) it.next()).A0U(this, z);
        }
    }

    @Override // X.C30G
    public final void onProgressUpdate(int i, int i2, boolean z) {
        C120985dq c120985dq = super.A00;
        if (c120985dq != null) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                ((C37560GgG) it.next()).A0P(c120985dq, i, i2, z);
            }
        }
    }

    @Override // X.C30G
    public final void onStopped(C4S7 c4s7, int i) {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            ((C37560GgG) it.next()).A0G();
        }
    }

    @Override // X.C30G
    public final void onSurfaceTextureUpdated(C4S7 c4s7) {
        C120985dq c120985dq;
        C37644Ghd c37644Ghd;
        if (this.A03 != null) {
            Integer num = this.A04;
            if (num == C05F.A01) {
                this.A04 = C05F.A0C;
            } else if (num == C05F.A0C && (c120985dq = super.A00) != null && (c37644Ghd = super.A01) != null) {
                Iterator it = this.A0A.iterator();
                while (it.hasNext()) {
                    ((C37560GgG) it.next()).A0Q(c120985dq, c37644Ghd, this);
                }
            }
            C6QC c6qc = this.A01;
            if (c6qc != null) {
                AbstractC167007dF.A0x(c6qc.A00);
            }
        }
    }

    @Override // X.C30G
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        JIL jil = super.A02;
        if (jil != null) {
            jil.Dzk();
        }
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            ((C37560GgG) it.next()).A0V(str);
        }
    }

    @Override // X.C30G
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
        JIL jil = super.A02;
        if (jil != null) {
            jil.Dzl();
        }
        C120985dq c120985dq = super.A00;
        if (c120985dq != null) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                ((C37560GgG) it.next()).A0R(c120985dq, this, z);
            }
        }
    }

    @Override // X.C30G
    public final void onVideoViewPrepared(C4S7 c4s7) {
        this.A04 = C05F.A01;
    }

    public C39489HcH(AbstractC59962oe abstractC59962oe, UserSession userSession, C30P c30p, String str) {
        super(userSession, str);
        this.A07 = abstractC59962oe;
        this.A08 = c30p;
        this.A0A = new CopyOnWriteArraySet();
        this.A09 = new J05(this);
    }

    @Override // X.JIM
    public final boolean CsD(C120985dq c120985dq, C25370BKn c25370BKn) {
        AbstractC167017dG.A1N(c25370BKn, c120985dq);
        C25370BKn c25370BKn2 = this.A03;
        if (c25370BKn2 != null && c25370BKn.equals(c25370BKn2) && c120985dq.equals(super.A00) && !this.A06) {
            return false;
        }
        return true;
    }

    @Override // X.JIM
    public final boolean EKg(String str, boolean z) {
        JIL jil;
        C3Q0 Be4 = Be4();
        C4QW c4qw = this.A00;
        if (c4qw != null && (Be4 == C3Q0.PAUSED || Be4 == C3Q0.PREPARED)) {
            c4qw.E4T(str, z);
            return true;
        }
        JIL jil2 = super.A02;
        if (jil2 != null && !jil2.isPlaying() && (jil = super.A02) != null) {
            return jil.EKf();
        }
        return false;
    }
}
