package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.89K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89K extends C30F {
    public float A00 = 1.0f;
    public C4QW A01;
    public int A02;
    public int A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;

    public final void A03(Context context, C22915A8l c22915A8l, InterfaceC74623Ww interfaceC74623Ww) {
        C3Q0 c3q0;
        C14360o3.A0B(context, 0);
        C4QW c4qw = this.A01;
        if (c4qw != null) {
            c3q0 = ((C4QT) c4qw).A0M;
        } else {
            c3q0 = null;
        }
        if (c3q0 != C3Q0.STOPPING) {
            this.A02 = c22915A8l.A01;
            C4QW c4qw2 = c4qw;
            if (c4qw == null) {
                C4QT A00 = C4QS.A00(context, this.A05, null, this, this.A04.getModuleName());
                A00.EYb(true);
                A00.A0N = this;
                A00.Ed6(EnumC95184Qe.A03);
                this.A01 = A00;
                c4qw2 = A00;
            }
            c4qw2.Eol("unknown", true);
            if (((C4QT) c4qw2).A0M == C3Q0.IDLE) {
                int i = this.A03;
                Medium medium = c22915A8l.A02;
                C4S7 c4s7 = new C4S7(medium, i);
                float f = c22915A8l.A00;
                boolean z = c22915A8l.A03;
                String moduleName = this.A04.getModuleName();
                C14360o3.A0B(moduleName, 6);
                c4qw2.E5v(new C4SC(interfaceC74623Ww, new C4QP(false, false, false, false), null, c4s7, medium.A0X, moduleName, f, -1, i, z));
            }
            this.A03 = 0;
        }
    }

    public final void A05(String str) {
        C4QW c4qw;
        if (A00() && (c4qw = this.A01) != null) {
            c4qw.E4T(str, false);
        }
    }

    private final boolean A00() {
        C4QW c4qw = this.A01;
        if (c4qw != null) {
            C3Q0 c3q0 = ((C4QT) c4qw).A0M;
            if (c3q0 == null) {
                c3q0 = C3Q0.IDLE;
            }
            if (c3q0 == C3Q0.PAUSED || c3q0 == C3Q0.PREPARED) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A01() {
        C4QW c4qw;
        C4QW c4qw2 = this.A01;
        if (c4qw2 != null) {
            c4qw2.EMg(0, false);
        }
        if (A00() && (c4qw = this.A01) != null) {
            c4qw.E4T("autoplay", true);
        }
    }

    public final void A04(String str) {
        C4QW c4qw = this.A01;
        if (c4qw != null) {
            C3Q0 c3q0 = ((C4QT) c4qw).A0M;
            if (c3q0 == null) {
                c3q0 = C3Q0.IDLE;
            }
            if (c3q0 == C3Q0.PLAYING) {
                c4qw.E3d(str);
            }
        }
    }

    @Override // X.C30F, X.C30G
    public final void onProgressUpdate(int i, int i2, boolean z) {
        C4QW c4qw;
        int i3 = this.A02;
        if (i3 != 0 && i > i3 && (c4qw = this.A01) != null) {
            c4qw.EMg(0, false);
        }
    }

    public C89K(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
    }

    public final void A02(int i) {
        if (!A00()) {
            this.A03 = i;
        }
        C4QW c4qw = this.A01;
        if (c4qw != null) {
            c4qw.EMg(i, false);
        }
    }
}
