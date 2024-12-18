package X;

import com.facebook.R;
import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;
import java.util.List;

/* renamed from: X.Grw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38253Grw extends AbstractC38244Grn {
    public C3Q0 A00;
    public C4S7 A01;
    public C25370BKn A02;
    public final C38254Grx A03;
    public final List A04;

    @Override // X.JIM
    public final C9C1 AuC() {
        return null;
    }

    @Override // X.JIM
    public final boolean CKi() {
        return false;
    }

    @Override // X.JIM
    public final void EKu() {
    }

    @Override // X.JIM
    public final boolean EPc() {
        return false;
    }

    @Override // X.JIM
    public final void EQ0(boolean z) {
    }

    @Override // X.JIM
    public final void EbH(String str) {
    }

    @Override // X.JIM
    public final void Ef8(boolean z, String str) {
    }

    public static final void A00(C38253Grw c38253Grw) {
        C18U.A06(C06090Tz.A05, ((AbstractC38244Grn) c38253Grw).A03, 36314704402058005L);
    }

    @Override // X.JIM
    public final void A9A(C37560GgG c37560GgG) {
        this.A04.add(c37560GgG);
    }

    @Override // X.JIM
    public final void AHp() {
        this.A04.clear();
    }

    @Override // X.JIM
    public final C120985dq AuE() {
        return super.A00;
    }

    @Override // X.JIM
    public final C3Q0 Be4() {
        return this.A00;
    }

    @Override // X.JIM
    public final C4S7 CFH() {
        return this.A01;
    }

    @Override // X.JIM
    public final C25370BKn CFh() {
        return this.A02;
    }

    @Override // X.JIM
    public final int E3c(String str) {
        JIL jil = super.A02;
        if (jil == null) {
            return 0;
        }
        jil.pause();
        this.A00 = C3Q0.PAUSED;
        return jil.getCurrentPositionMs();
    }

    @Override // X.JIM
    public final void EFb(C37560GgG c37560GgG) {
        this.A04.remove(c37560GgG);
    }

    @Override // X.JIM
    public final boolean EKg(String str, boolean z) {
        JIL jil;
        JIL jil2 = super.A02;
        if (jil2 == null || jil2.isPlaying() || (jil = super.A02) == null) {
            return false;
        }
        if (jil.EKf()) {
            A00(this);
            this.A00 = C3Q0.PLAYING;
            return true;
        }
        this.A00 = C3Q0.PREPARING;
        return false;
    }

    @Override // X.JIM
    public final void EhI(float f, int i) {
        JIL jil = super.A02;
        if (jil != null) {
            jil.EhI(f, i);
        }
        C4S7 c4s7 = this.A01;
        if (c4s7 != null) {
            c4s7.A00 = AbstractC167007dF.A1O((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        A00(this);
    }

    public C38253Grw(UserSession userSession, String str) {
        super(userSession, str);
        this.A00 = C3Q0.IDLE;
        this.A04 = AbstractC166987dD.A1E();
        this.A03 = new C38254Grx(this);
    }

    @Override // X.JIM
    public final boolean CsD(C120985dq c120985dq, C25370BKn c25370BKn) {
        AbstractC167017dG.A1N(c25370BKn, c120985dq);
        C25370BKn c25370BKn2 = this.A02;
        if (c25370BKn2 != null && c25370BKn.equals(c25370BKn2) && c120985dq.equals(super.A00)) {
            return false;
        }
        return true;
    }

    @Override // X.JIM
    public final boolean E5w(C62862tP c62862tP, C120985dq c120985dq, C37644Ghd c37644Ghd, C25370BKn c25370BKn, float f, int i, int i2, boolean z, boolean z2) {
        String str;
        IgShowreelNativeAnimationIntf Bx7;
        boolean A1a = AbstractC167017dG.A1a(c25370BKn, c120985dq);
        C14360o3.A0B(c62862tP, 6);
        this.A02 = c25370BKn;
        super.A00 = c120985dq;
        super.A01 = c37644Ghd;
        C4S7 c4s7 = new C4S7(c120985dq, i);
        c4s7.A00 = AbstractC167007dF.A1O((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        this.A01 = c4s7;
        String str2 = ShowreelNativeClientName.A0k.A00;
        InterfaceC104804nl interfaceC104804nl = c120985dq.A06().A06;
        InterfaceC43583JMr interfaceC43583JMr = null;
        if (interfaceC104804nl != null && (Bx7 = interfaceC104804nl.Bx7()) != null) {
            str = Bx7.Anz();
        } else {
            str = null;
        }
        boolean A0g = AbstractC002300n.A0g(str2, str, A1a);
        InterfaceC104924o5 interfaceC104924o5 = c120985dq.A06().A0I;
        if (interfaceC104924o5 != null) {
            interfaceC43583JMr = interfaceC104924o5.BVT();
        }
        ServerRenderedSponsoredContentView serverRenderedSponsoredContentView = (ServerRenderedSponsoredContentView) c25370BKn.A08.findViewById(R.id.clips_server_rendered_component_id);
        super.A02 = serverRenderedSponsoredContentView;
        if (serverRenderedSponsoredContentView != null) {
            if (interfaceC43583JMr != null) {
                serverRenderedSponsoredContentView.COJ(super.A03, super.A04, A0g);
            }
            serverRenderedSponsoredContentView.setTransformation(c120985dq.A06(), super.A03, c62862tP, this.A03);
            if (interfaceC43583JMr != null) {
                Long Azh = interfaceC43583JMr.Azh();
                if (Azh != null) {
                    serverRenderedSponsoredContentView.setTrackDuration(Azh.longValue());
                }
                serverRenderedSponsoredContentView.ADb(interfaceC43583JMr, AbstractC25226BEj.A1E(c120985dq));
            }
        }
        return A1a;
    }

    @Override // X.AbstractC38244Grn, X.JIM
    public final void EE4(String str) {
        super.EE4(str);
        this.A02 = null;
        this.A00 = C3Q0.IDLE;
    }
}
