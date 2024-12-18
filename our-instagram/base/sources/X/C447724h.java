package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.24h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C447724h {
    public long A00;
    public long A01;
    public long A02;
    public final long A03;
    public final C24Q A04;
    public final C24M A05;
    public final long A06;
    public final long A07;

    public C447724h(C24Q c24q, UserSession userSession, C24M c24m) {
        Long l;
        C14360o3.A0B(c24m, 3);
        this.A04 = c24q;
        this.A05 = c24m;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A01(c06090Tz, userSession, 36605976199042414L) > 0) {
            l = Long.valueOf(C18U.A01(c06090Tz, userSession, 36605976199042414L));
        } else {
            l = r0;
        }
        this.A03 = l.longValue() * 1000;
        this.A06 = (C18U.A01(c06090Tz, userSession, 36605976199173487L) > 0 ? Long.valueOf(C18U.A01(c06090Tz, userSession, 36605976199173487L)) : 33L).longValue() * 1000;
        this.A07 = C18U.A01(c06090Tz, userSession, 36605976199239024L) * 1000;
        this.A01 = 585185740L;
        this.A02 = 585179820L;
        this.A00 = 585177795L;
    }

    public final void A02(C5JK c5jk, String str) {
        C14360o3.A0B(c5jk, 1);
        if (this.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            C24Q c24q = this.A04;
            long A04 = c24q.A04(null, str, 585177795, this.A07);
            this.A00 = A04;
            c24q.A0B(A04, "clips_creation_type", c5jk.A00, false);
        }
    }

    public final void A03(C5JK c5jk, String str) {
        C14360o3.A0B(c5jk, 0);
        if (this.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            C24Q c24q = this.A04;
            c24q.A0B(this.A00, "success_exit_point", str, false);
            this.A00 = c24q.A02(585177795, this.A00);
        }
    }

    public final void A04(C5JK c5jk, String str) {
        C14360o3.A0B(c5jk, 0);
        C14360o3.A0B(str, 1);
        if (this.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            this.A01 = this.A04.A06(CancelReason.USER_CANCELLED, str, 585185740, this.A01);
        }
    }

    public final void A05(C5JK c5jk, String str) {
        C14360o3.A0B(c5jk, 0);
        if (this.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            this.A01 = this.A04.A05(str, 585185740, this.A01, this.A03);
        }
    }

    public final void A06(C5JK c5jk, String str, int i) {
        C14360o3.A0B(c5jk, 2);
        C24M c24m = this.A05;
        if (c24m.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            C24Q c24q = this.A04;
            long A04 = c24q.A04(null, str, 585185740, this.A03);
            this.A01 = A04;
            c24q.A0B(A04, "num_segments", String.valueOf(i), false);
            c24q.A0B(this.A01, "clips_creation_type", c5jk.A00, false);
            return;
        }
        C0K8.A0P("IgCameraCriticalUserFlowLogger", "logTransitionToPostCaptureStart omitted dest=%s clipsCreationType=%s", c24m.Ajy(), c5jk);
    }

    public final void A07(C5JK c5jk, String str, String str2, String str3) {
        C14360o3.A0B(c5jk, 0);
        C14360o3.A0B(str, 1);
        if (this.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            if (str2 != null) {
                this.A04.A09(this.A01, "error_details", str2);
            }
            if (str3 != null) {
                this.A04.A09(this.A01, "player_session_id", str3);
            }
            this.A01 = this.A04.A07(str, "", 585185740, this.A01);
        }
    }

    public final void A08(String str) {
        C14360o3.A0B(str, 0);
        this.A02 = this.A04.A04(null, str, 585179820, this.A06);
    }

    public final void A00(C5JK c5jk) {
        if (this.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            C24Q c24q = this.A04;
            long j = this.A01;
            c24q.A00.flowDrop(j);
            C24Q.A01(c24q, 585185740, j);
            c24q.A06.remove(Long.valueOf(j));
            this.A01 = 585185740L;
        }
    }

    public final void A01(C5JK c5jk, String str) {
        if (this.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            this.A00 = this.A04.A05(str, 585177795, this.A00, this.A07);
        }
    }
}
