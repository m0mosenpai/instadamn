package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5TA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TA implements C30G {
    public C6C3 A00;
    public boolean A01;
    public boolean A02;
    public Runnable A03;
    public Runnable A04;
    public boolean A05;
    public final C4QW A06;
    public final C44218JgN A07;
    public final C44217JgM A08;

    public C5TA(Context context, UserSession userSession, C30P c30p, C6C3 c6c3, String str) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c6c3, 4);
        C14360o3.A0B(str, 5);
        this.A00 = c6c3;
        C44217JgM c44217JgM = new C44217JgM(this);
        this.A08 = c44217JgM;
        C11T.A06("This operation must be run on UI thread.");
        this.A06 = C4QS.A00(context, userSession, c30p, this, str);
        this.A07 = new C44218JgN(context, userSession, c44217JgM, this);
        this.A05 = C18U.A06(C06090Tz.A05, userSession, 36320111765758018L);
    }

    public final void A01() {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            ((C4QT) this.A06).A0Y = true;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A06(InterfaceC74623Ww interfaceC74623Ww) {
        C14360o3.A0B(interfaceC74623Ww, 0);
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            C4QT.A09(interfaceC74623Ww, (C4QT) this.A06, 0, false);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A07(InterfaceC74623Ww interfaceC74623Ww) {
        C14360o3.A0B(interfaceC74623Ww, 0);
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            C4QT c4qt = (C4QT) this.A06;
            AbstractC97724aA abstractC97724aA = c4qt.A0P;
            if (abstractC97724aA != null) {
                View A02 = abstractC97724aA.A02();
                if (A02.getParent() != null) {
                    ViewParent parent = A02.getParent();
                    C14360o3.A0C(parent, "null cannot be cast to non-null type com.instagram.ui.widget.videocontainer.TextureViewContainer");
                    ((InterfaceC74623Ww) parent).detachViewFromParent(A02);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                if (abstractC97724aA.A05()) {
                    interfaceC74623Ww.attachViewToParent(A02, abstractC97724aA.A01, layoutParams);
                    A02.requestLayout();
                } else {
                    abstractC97724aA.A03();
                    interfaceC74623Ww.addView(A02, abstractC97724aA.A01, layoutParams);
                }
                ViewGroup viewGroup = (ViewGroup) interfaceC74623Ww;
                if (C4QT.A0L(c4qt)) {
                    c4qt.A0t.A01(viewGroup, c4qt);
                }
            } else if (c4qt.A0K != null) {
                UserSession userSession = c4qt.A0m;
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36327585009253066L)) {
                    C95334Qt c95334Qt = c4qt.A0K;
                    ViewGroup viewGroup2 = (ViewGroup) interfaceC74623Ww;
                    c95334Qt.A08 = viewGroup2;
                    c95334Qt.A09.A0B(viewGroup2, c95334Qt.A0R);
                    C95334Qt.A03(c95334Qt);
                }
            }
            C123175hs c123175hs = c4qt.A0v;
            if (c123175hs != null) {
                C123175hs.A00(c123175hs);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A08(InterfaceC74623Ww interfaceC74623Ww, C75363a3 c75363a3, C4S7 c4s7, String str, String str2, float f, int i, int i2, boolean z, boolean z2) {
        C14360o3.A0B(c75363a3, 1);
        C14360o3.A0B(c4s7, 4);
        C14360o3.A0B(str2, 9);
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            A0C("unknown", true);
            this.A01 = !z2;
            this.A03 = new RunnableC44219JgO(interfaceC74623Ww, c75363a3, this, c4s7, str2, str, f, i, i2, z, z2);
            C3Q0 c3q0 = ((C4QT) this.A06).A0M;
            C14360o3.A07(c3q0);
            if (c3q0 == C3Q0.IDLE) {
                Runnable runnable = this.A03;
                if (runnable != null) {
                    runnable.run();
                }
                this.A03 = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A09(String str) {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            if (!this.A01) {
                this.A01 = true;
                this.A06.E3d(str);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A0A(String str) {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            this.A02 = true;
            this.A03 = null;
            this.A04 = null;
            C44218JgN c44218JgN = this.A07;
            c44218JgN.A00 = null;
            c44218JgN.A01 = null;
            c44218JgN.A04.A03(c44218JgN);
            this.A06.EE4(str);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A0B(String str, boolean z) {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            if (this.A01) {
                this.A01 = false;
                Runnable runnable = this.A04;
                if (runnable != null) {
                    runnable.run();
                    this.A04 = null;
                    return;
                }
                C4QW c4qw = this.A06;
                C3Q0 c3q0 = ((C4QT) c4qw).A0M;
                C14360o3.A07(c3q0);
                if (c3q0 == C3Q0.PREPARING && !this.A05) {
                    return;
                }
                c4qw.E4T(str, z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // X.C30G
    public final void onCues(List list) {
        C14360o3.A0B(list, 0);
        this.A00.onCues(list);
    }

    @Override // X.C30G
    public final void onPrepare(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        this.A00.onPrepare(c4s7);
    }

    @Override // X.C30G
    public final void onSeeking(long j) {
    }

    @Override // X.C30G
    public final void onStopVideo(String str, boolean z) {
        C14360o3.A0B(str, 0);
        this.A00.onStopVideo(str, z);
    }

    @Override // X.C30G
    public final void onSurfaceTextureDestroyed() {
    }

    @Override // X.C30G
    public final void onSurfaceTextureUpdated(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        this.A00.Dz8(c4s7);
    }

    @Override // X.C30G
    public final void onVideoDownloading(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        this.A00.onVideoDownloading(c4s7);
    }

    @Override // X.C30G
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        C14360o3.A0B(c4s7, 0);
        this.A00.onVideoPlayerError(c4s7, str);
    }

    @Override // X.C30G
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
        C14360o3.A0B(c4s7, 0);
        RunnableC44228JgY runnableC44228JgY = new RunnableC44228JgY(this, c4s7);
        this.A04 = runnableC44228JgY;
        if (!this.A01) {
            runnableC44228JgY.run();
            this.A04 = null;
        }
        this.A00.Dza(c4s7);
    }

    @Override // X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        this.A00.onVideoStartedPlaying(c4s7);
    }

    @Override // X.C30G
    public final void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
    }

    @Override // X.C30G
    public final void onVideoViewPrepared(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        this.A00.onVideoViewPrepared(c4s7);
    }

    public final int A00() {
        C4SE c4se = ((C4QT) this.A06).A0O;
        if (c4se == null) {
            return -1;
        }
        return c4se.A01;
    }

    public final void A02(float f, int i) {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            this.A06.EhI(f, i);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A04(int i, boolean z) {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            this.A06.EMg(i, z);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A05(EnumC95184Qe enumC95184Qe) {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            this.A06.Ed6(enumC95184Qe);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A0C(String str, boolean z) {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            C4QW c4qw = this.A06;
            C3Q0 c3q0 = ((C4QT) c4qw).A0M;
            C14360o3.A07(c3q0);
            if (c3q0 != C3Q0.IDLE && c3q0 != C3Q0.STOPPING) {
                c4qw.Eol(str, z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean A0D() {
        C11T.A06("This operation must be run on UI thread.");
        if (!this.A02) {
            C44218JgN c44218JgN = this.A07;
            return C4AJ.A00(c44218JgN.A05, null, c44218JgN.A02, false);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean A0E() {
        C3Q0 c3q0 = ((C4QT) this.A06).A0M;
        C14360o3.A07(c3q0);
        if (c3q0 != C3Q0.PLAYING) {
            return false;
        }
        return true;
    }

    public final boolean A0F() {
        return C4QT.A1M.contains(((C4QT) this.A06).A0M);
    }

    @Override // X.C30G
    public final void onCompletion() {
        this.A00.onCompletion();
    }

    @Override // X.C30G
    public final void onDrawnToSurface() {
    }

    @Override // X.C30G
    public final void onLoop(int i) {
        this.A00.onLoop(i);
    }

    @Override // X.C30G
    public final void onProgressStateChanged(boolean z) {
        this.A00.onProgressStateChanged(z);
    }

    @Override // X.C30G
    public final void onProgressUpdate(int i, int i2, boolean z) {
        this.A00.onProgressUpdate(i, i2, z);
    }

    @Override // X.C30G
    public final void onStopped(C4S7 c4s7, int i) {
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
            this.A03 = null;
        }
    }

    public final void A03(int i) {
        boolean z = !A0D();
        C44218JgN c44218JgN = this.A07;
        if (z) {
            c44218JgN.A02(i);
        } else {
            c44218JgN.A01(i);
        }
    }
}
