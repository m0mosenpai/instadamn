package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.33t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C677933t {
    public long A00 = 17630575;
    public final C24Q A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final void A00() {
        long j = this.A00;
        if (j != 17630575) {
            this.A00 = this.A01.A06(CancelReason.USER_CANCELLED, "Playback paused", 17630575, j);
        }
    }

    public final void A01() {
        this.A01.A0D("play_finished", this.A00, null, null, null, null);
    }

    public final void A02() {
        this.A00 = this.A01.A02(17630575, this.A00);
    }

    public final void A03() {
        long j = this.A00;
        if (j != 17630575) {
            this.A01.A0D("track_prepared", j, null, null, null, null);
        }
    }

    public final void A04(Exception exc) {
        C0K8.A0F("MusicPlayerLoggerImpl", "setDataSourceFailed", exc);
        long j = this.A00;
        if (j != 17630575) {
            C24Q c24q = this.A01;
            String message = exc.getMessage();
            if (message == null) {
                message = "Setting Data Source Failed";
            }
            this.A00 = c24q.A07(message, "", 17630575, j);
        }
    }

    public final void A05(String str) {
        long j = this.A00;
        if (j != 17630575) {
            this.A00 = this.A01.A07(str, "", 17630575, j);
        }
    }

    public final void A06(boolean z) {
        String str;
        String str2 = this.A05;
        if (!z) {
            if (this.A06) {
                str = toString();
            } else {
                str = "";
            }
            Integer valueOf = Integer.valueOf(AnonymousClass001.A0R("play", str).hashCode());
            C24Q c24q = this.A01;
            long A04 = c24q.A04(valueOf, null, 17630575, 3000L);
            this.A00 = A04;
            c24q.A0B(A04, "operation", "play", false);
            c24q.A0B(this.A00, "player_name", this.A04, false);
            c24q.A0B(this.A00, "use_case", str2, false);
            InterfaceC11380iw interfaceC11380iw = this.A02;
            if (interfaceC11380iw != null) {
                c24q.A0B(this.A00, "module", interfaceC11380iw.getModuleName(), false);
            }
            c24q.A0B(this.A00, "camera_destination", String.valueOf(AnonymousClass229.A01(this.A03).A0J()), false);
        }
    }

    public C677933t(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, boolean z) {
        this.A03 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = z;
        this.A02 = interfaceC11380iw;
        this.A01 = new C24Q(userSession);
    }
}
