package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7GT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7GT implements C7GO, C7GU, C7GV {
    public int A00;
    public int A01;
    public long A02;
    public KBY A03;
    public C189478aR A04;
    public L33 A05;
    public boolean A06;
    public final UserSession A08;
    public final C7DK A09;
    public final C7GS A0A;
    public final C7DM A0B;
    public final C125055lB A0C;
    public final C12M A07 = new C12M();
    public final C19L A0E = AbstractC24771Iv.A01(967693919, 3);
    public final InterfaceC09390do A0D = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E1(this, 27));

    public final void A00() {
        C7DK c7dk = this.A09;
        if (c7dk.A0C()) {
            c7dk.A0A("send");
        }
        this.A06 = true;
        C189478aR c189478aR = this.A04;
        if (c189478aR != null) {
            c189478aR.A07();
        }
        this.A04 = null;
        InterfaceC09390do interfaceC09390do = this.A0D;
        if (((MRH) interfaceC09390do.getValue()).isRecording()) {
            ((MRH) interfaceC09390do.getValue()).Eoe(true);
            this.A0A.A00.A0Q.E1S();
        }
        this.A0A.A00.A0D();
    }

    @Override // X.C7GV
    public final void Cy2(DirectMessageIdentifier directMessageIdentifier) {
        KBY kby = this.A03;
        if (kby != null) {
            KBY.A05(kby, false);
        }
    }

    @Override // X.C7GU
    public final void Cy3() {
        KBY kby = this.A03;
        if (kby != null) {
            KBY.A05(kby, false);
        }
    }

    @Override // X.C7GU
    public final void Cy4(int i, int i2, boolean z) {
        KBY kby = this.A03;
        if (kby != null) {
            KBY.A00(kby).setPlaybackPercentage(i / i2);
            KBY.A04(kby, i2 - i);
        }
        if (i >= this.A01) {
            this.A09.A0A("finished");
            KBY kby2 = this.A03;
            if (kby2 != null) {
                KBY.A05(kby2, false);
            }
        }
    }

    @Override // X.C7GO
    public final void DEF(Exception exc) {
        KBY kby = this.A03;
        if (kby != null) {
            kby.A06();
        }
        this.A0B.A01(exc);
        this.A0A.A00.A0Q.E1P(exc);
    }

    @Override // X.C7GO
    public final void DR9() {
        L33 Auq = ((MRH) this.A0D.getValue()).Auq();
        this.A05 = Auq;
        if (Auq != null) {
            Auq.A00 = (int) (System.currentTimeMillis() - this.A02);
        }
        KBY kby = this.A03;
        if (kby != null) {
            kby.A06();
        }
    }

    @Override // X.C7GO
    public final void DdX(boolean z) {
        if (z) {
            KBY kby = this.A03;
            if (kby != null) {
                kby.A04 = true;
                KBY.A00(kby).setPlaybackPercentage(1.0f);
                KBY.A00(kby).A0F.clear();
                KBY.A00(kby).A0E.clear();
                KBY.A00(kby).setActiveWindowEnabled(false);
                KBY.A03(kby);
                KBY.A05(kby, false);
                KBY.A01(kby).setVisibility(4);
                Object value = kby.A0B.getValue();
                C14360o3.A07(value);
                ((View) value).setEnabled(false);
                Object value2 = kby.A08.getValue();
                C14360o3.A07(value2);
                ((View) value2).setEnabled(false);
                Object value3 = kby.A0C.getValue();
                C14360o3.A07(value3);
                ((View) value3).setEnabled(false);
            }
            this.A0A.A00.A0Q.E1R(false);
        }
    }

    @Override // X.C7GO
    public final void DdZ() {
        int i;
        L33 Auq = ((MRH) this.A0D.getValue()).Auq();
        this.A05 = Auq;
        if (Auq != null) {
            Auq.A00 = (int) (System.currentTimeMillis() - this.A02);
        }
        KBY kby = this.A03;
        if (kby != null) {
            kby.A06();
        }
        C7GL c7gl = this.A0A.A00.A0Q;
        c7gl.E1T();
        L33 l33 = this.A05;
        if (l33 != null) {
            i = l33.A00;
        } else {
            i = 0;
        }
        c7gl.E1Q(false, i);
    }

    @Override // X.C7GO
    public final void E1s(long j, double d) {
        L33 l33 = this.A05;
        if (l33 != null) {
            l33.A00 = (int) (System.currentTimeMillis() - this.A02);
        }
        KBY kby = this.A03;
        if (kby != null) {
            KBY.A00(kby).A02((float) d);
            C7GT c7gt = kby.A02;
            if (c7gt == null) {
                C14360o3.A0F("delegate");
                throw C00O.createAndThrow();
            }
            if (c7gt.A05 != null) {
                KBY.A04(kby, r0.A00);
            }
        }
    }

    public C7GT(UserSession userSession, C7DK c7dk, C7GS c7gs, C7DM c7dm, C125055lB c125055lB) {
        this.A08 = userSession;
        this.A09 = c7dk;
        this.A0C = c125055lB;
        this.A0B = c7dm;
        this.A0A = c7gs;
    }
}
