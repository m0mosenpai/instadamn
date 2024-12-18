package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43271yu implements InterfaceC12870lZ, InterfaceC13000lm {
    public long A02;
    public long A04;
    public long A05;
    public final Context A07;
    public final UserSession A08;
    public double A00 = -1.0d;
    public double A01 = -1.0d;
    public long A06 = -1;
    public long A03 = -1;

    private final void A00() {
        double d;
        double d2;
        UserSession userSession = this.A08;
        C14360o3.A0B(userSession, 0);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "ig_session_throughput";
        C18920wW A00 = c12210kP.A00();
        InterfaceC02590Ai A002 = A00.A00(A00.A00, "instagram_session_throughput");
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        A002.A9K("ig_user_id", AbstractC003100w.A0k(10, str));
        A002.A9K("total_bytes_downloaded", Long.valueOf(this.A04));
        A002.A9K("throughput_measurement_count", Long.valueOf(this.A02));
        A002.A9K("total_ram_in_bytes", Long.valueOf(C14470oJ.A00(this.A07)));
        A002.A9K("session_end_time", Long.valueOf(this.A03));
        A002.A9K("session_start_time", Long.valueOf(this.A06));
        A002.A8I("min_throughput_kilobits_per_sec", Double.valueOf(this.A01 * 8.0d));
        A002.A8I("max_throughput_kilobits_per_sec", Double.valueOf(this.A00 * 8.0d));
        long j = this.A04;
        long j2 = this.A05;
        if (j2 == 0) {
            d = 0.0d;
        } else {
            d = (j * 1.0d) / j2;
        }
        A002.A8I("session_throughput_kilobits_per_sec", Double.valueOf(d * 8.0d));
        A002.A9K("total_download_time_ms", Long.valueOf(this.A05));
        A002.A8I("last_bandwidth_estimate_reading", Double.valueOf(C1BU.A00().A01()));
        C1BU A003 = C1BU.A00();
        synchronized (A003) {
            d2 = A003.A00;
        }
        A002.A8I("app_start_previous_bandwidth_estiamte_reading", Double.valueOf(d2));
        A002.Cht();
        A01(this);
    }

    public static final void A01(C43271yu c43271yu) {
        c43271yu.A04 = 0L;
        c43271yu.A05 = 0L;
        c43271yu.A00 = -1.0d;
        c43271yu.A01 = -1.0d;
        c43271yu.A03 = -1L;
        c43271yu.A02 = 0L;
        c43271yu.A06 = System.currentTimeMillis();
    }

    public C43271yu(Context context, UserSession userSession) {
        this.A07 = context;
        this.A08 = userSession;
        C218914p.A03(EnumC220415e.A03, this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(115936998);
        A00();
        C0f9.A0A(205446334, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1890623098);
        A01(this);
        C0f9.A0A(-877116369, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        A00();
    }
}
