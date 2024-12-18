package X;

import android.animation.Animator;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class J26 implements C6C3, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public J27 A00;
    public final int A01;
    public final int A02;
    public final C38951HDd A03;
    public final C120985dq A04;
    public final C37644Ghd A05;
    public final C41725Idw A06;
    public final C41725Idw A07;
    public final InterfaceC43447JHl A08;
    public final Context A09;
    public final UserSession A0A;
    public final C41000IDv A0B;

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        J27 j27 = this.A00;
        if (j27 != null) {
            j27.Dza(c4s7);
        }
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCompletion() {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
    }

    @Override // X.C6C3
    public final void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
        C14360o3.A0B(str, 0);
        J27 j27 = this.A00;
        if (j27 != null) {
            j27.onStopVideo(str, z);
        }
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public final void A00() {
        J2V j2v;
        J27 j27 = this.A00;
        if (j27 != null) {
            C5TA c5ta = j27.A00;
            if (c5ta != null) {
                c5ta.A0A("out_of_playback_range");
            }
            j27.A00 = null;
        } else {
            InterfaceC43447JHl interfaceC43447JHl = this.A08;
            if ((interfaceC43447JHl instanceof J2V) && (j2v = (J2V) interfaceC43447JHl) != null) {
                IM1 im1 = j2v.A00;
                if (im1 == null) {
                    C14360o3.A0F("photoDelegate");
                    throw C00O.createAndThrow();
                }
                Animator animator = im1.A00;
                if (animator != null) {
                    animator.end();
                }
                View view = im1.A02;
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        }
        this.A00 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r5 = this;
            X.J27 r3 = r5.A00
            if (r3 == 0) goto L5e
            r2 = 0
            X.5TA r0 = r3.A00
            if (r0 == 0) goto Lc
            r0.A04(r2, r2)
        Lc:
            X.5TA r0 = r3.A00
            if (r0 == 0) goto L4f
            X.4QW r0 = r0.A06
            int r0 = r0.getCurrentPositionMs()
            if (r0 != 0) goto L4f
            X.HbT r0 = r3.A01
            if (r0 == 0) goto L27
            X.J2W r0 = r0.A03
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A00
            if (r1 == 0) goto L9e
            android.view.animation.Animation r0 = r3.A03
            r1.startAnimation(r0)
        L27:
            X.5TA r1 = r3.A00
            if (r1 == 0) goto L30
            java.lang.String r0 = "resume"
            r1.A0B(r0, r2)
        L30:
            com.instagram.common.session.UserSession r0 = r3.A06
            X.1Hd r0 = X.AbstractC24321Hb.A00(r0)
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L40
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
        L40:
            X.1vI r0 = r3.A04
            r0.A04(r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.5TA r0 = r3.A00
            if (r0 == 0) goto L4e
            r0.A02(r1, r2)
        L4e:
            return
        L4f:
            X.HbT r0 = r3.A01
            if (r0 == 0) goto L27
            X.J2W r0 = r0.A03
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A00
            if (r1 == 0) goto L9e
            r0 = 4
            r1.setVisibility(r0)
            goto L27
        L5e:
            X.JHl r1 = r5.A08
            boolean r0 = r1 instanceof X.J2V
            if (r0 == 0) goto L4e
            X.J2V r1 = (X.J2V) r1
            if (r1 == 0) goto L4e
            X.IM1 r4 = r1.A00
            if (r4 != 0) goto L6f
            java.lang.String r0 = "photoDelegate"
            goto La0
        L6f:
            com.instagram.common.session.UserSession r3 = r4.A03
            X.0Tz r2 = X.AbstractC25228BEl.A0l(r3)
            r0 = 36319209823280172(0x810821000a1c2c, double:3.0317527657372855E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4e
            android.animation.Animator r0 = r4.A00
            if (r0 == 0) goto L87
            r0.end()
        L87:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r2 = 1066611507(0x3f933333, float:1.15)
            long r0 = r4.A01
            java.util.List r0 = r4.A00(r2, r0)
            r3.playTogether(r0)
            r3.start()
            r4.A00 = r3
            return
        L9e:
            java.lang.String r0 = "imagePlaceholder"
        La0:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J26.A01():void");
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        J27 j27 = this.A00;
        if (j27 != null) {
            j27.onAudioFocusChange(i);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        J27 j27 = this.A00;
        if (j27 != null) {
            return j27.onKey(view, i, keyEvent);
        }
        return false;
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        J27 j27 = this.A00;
        if (j27 != null) {
            j27.onProgressUpdate(i, i2, z);
        }
    }

    public J26(Context context, C38951HDd c38951HDd, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41725Idw c41725Idw, C41725Idw c41725Idw2, InterfaceC43447JHl interfaceC43447JHl, int i, int i2) {
        J27 j27;
        AbstractC167017dG.A1T(c41725Idw, c41725Idw2);
        C14360o3.A0B(interfaceC43447JHl, 7);
        this.A09 = context;
        this.A0A = userSession;
        this.A01 = i;
        this.A06 = c41725Idw;
        this.A07 = c41725Idw2;
        this.A08 = interfaceC43447JHl;
        this.A04 = c120985dq;
        this.A05 = c37644Ghd;
        this.A02 = i2;
        this.A03 = c38951HDd;
        if (interfaceC43447JHl.CBr() == C05F.A01) {
            j27 = new J27(context, interfaceC11380iw, userSession, c41725Idw);
        } else {
            j27 = null;
        }
        this.A00 = j27;
        C41000IDv c41000IDv = new C41000IDv(this);
        this.A0B = c41000IDv;
        interfaceC43447JHl.EYq(c41000IDv);
    }
}
