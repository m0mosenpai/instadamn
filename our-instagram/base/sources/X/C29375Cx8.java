package X;

import android.animation.Animator;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Cx8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29375Cx8 implements JIL {
    public C138746Qe A00;
    public C138756Qf A01;
    public C6FG A02;
    public InterfaceC31041Dkf A03;
    public String A04;
    public InterfaceC16820sZ A05;
    public C147416kR A06;
    public final Context A07;
    public final C130015u6 A08;
    public final UserSession A09;
    public final HashMap A0A;

    public C29375Cx8(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A07 = context;
        this.A09 = userSession;
        this.A08 = new C130015u6();
        this.A0A = AbstractC166987dD.A1G();
    }

    @Override // X.JIL
    public final int getCurrentPositionMs() {
        return 0;
    }

    private final java.util.Set A00() {
        C6FG c6fg = this.A02;
        if (c6fg != null) {
            return new HashSet(((AbstractMap) c6fg.A00(R.id.bk_context_key_animations)).values());
        }
        return C16910sj.A00;
    }

    public final void A01() {
        this.A0A.clear();
        C138746Qe c138746Qe = this.A00;
        if (c138746Qe != null) {
            c138746Qe.A09();
        }
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        C147416kR c147416kR = this.A06;
        if (c147416kR != null) {
            c147416kR.A03();
        }
        C147416kR c147416kR2 = this.A06;
        if (c147416kR2 != null) {
            c147416kR2.A02();
        }
        this.A06 = null;
        this.A05 = null;
        this.A03 = null;
    }

    @Override // X.JIL
    public final void COJ(UserSession userSession, String str, boolean z) {
        if (this.A06 == null) {
            C147416kR c147416kR = new C147416kR(this.A07, userSession, new C29372Cx5(), str, "clips_viewer_clips_tab");
            this.A06 = c147416kR;
            c147416kR.A00 = null;
        }
    }

    @Override // X.JIL
    public final void Dzk() {
        C138746Qe c138746Qe = this.A00;
        if (c138746Qe != null) {
            c138746Qe.A0A();
        }
    }

    @Override // X.JIL
    public final void Dzl() {
        C138746Qe c138746Qe = this.A00;
        if (c138746Qe != null) {
            c138746Qe.A0H("video_play_request_start", null);
        }
    }

    @Override // X.JIL
    public final void Dzm() {
        C138746Qe c138746Qe = this.A00;
        if (c138746Qe != null) {
            c138746Qe.A0H("video_play_request_success", null);
        }
    }

    @Override // X.JIL
    public final void EJY(UserSession userSession, boolean z, boolean z2, boolean z3) {
        C147416kR c147416kR;
        C147416kR c147416kR2;
        if (z3 && (c147416kR2 = this.A06) != null) {
            c147416kR2.A03();
        }
        if (!z2 && (c147416kR = this.A06) != null) {
            c147416kR.A02();
        }
    }

    @Override // X.JIL
    public final void EhI(float f, int i) {
        C147416kR c147416kR = this.A06;
        if (c147416kR != null) {
            c147416kR.A05(f);
        }
    }

    @Override // X.JIL
    public final C6QC getVideoView() {
        InterfaceC16820sZ interfaceC16820sZ = this.A05;
        if (interfaceC16820sZ != null) {
            return (C6QC) interfaceC16820sZ.invoke();
        }
        return null;
    }

    @Override // X.JIL
    public final void seekTo(int i) {
        C147416kR c147416kR = this.A06;
        if (c147416kR != null) {
            c147416kR.A06(i);
        }
    }

    @Override // X.JIL
    public final void ADb(InterfaceC43583JMr interfaceC43583JMr, String str) {
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        C147416kR c147416kR = this.A06;
        if (c147416kR != null) {
            c147416kR.A07(interfaceC43583JMr, null, str, A1Y);
        }
    }

    @Override // X.JIL
    public final boolean EKf() {
        String str;
        Iterator it = A00().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).resume();
        }
        C147416kR c147416kR = this.A06;
        if (c147416kR != null && (str = c147416kR.A01) != null) {
            C147416kR.A00(c147416kR, str);
        }
        return isPlaying();
    }

    @Override // X.JIL
    public final boolean isPlaying() {
        java.util.Set A00 = A00();
        if (!(A00 instanceof Collection) || !A00.isEmpty()) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                if (((Animator) it.next()).isRunning()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.JIL
    public final void pause() {
        Iterator it = A00().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).pause();
        }
        C147416kR c147416kR = this.A06;
        if (c147416kR != null) {
            c147416kR.A01();
        }
    }

    @Override // X.JIL
    public final void stop() {
        Iterator it = A00().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).end();
        }
    }

    @Override // X.JIL
    public final void setTransformation(C40971v4 c40971v4, UserSession userSession, C62862tP c62862tP, InterfaceC31041Dkf interfaceC31041Dkf) {
        this.A03 = interfaceC31041Dkf;
    }
}
