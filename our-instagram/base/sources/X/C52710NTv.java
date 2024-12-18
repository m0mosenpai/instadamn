package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.NTv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52710NTv extends AbstractC54988OTw {
    public C25671My A00;
    public C51863Mw7 A01;
    public Integer A02;
    public List A03;
    public ScheduledFuture A04;
    public InterfaceC06180Ui A05;
    public final UserSession A06;
    public final C54456O4k A07;
    public final HashMap A08;
    public final ScheduledExecutorService A09;

    public C52710NTv(UserSession userSession, C54446O4a c54446O4a, C54456O4k c54456O4k) {
        super(c54446O4a);
        this.A06 = userSession;
        this.A07 = c54456O4k;
        this.A05 = C10M.A00(C05F.A01, 1, 0);
        Integer num = C05F.A00;
        this.A01 = new C51863Mw7(num, null, 0L);
        this.A02 = num;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        this.A09 = scheduledThreadPoolExecutor;
        this.A03 = C16930sl.A00;
        this.A00 = AbstractC25651Mw.A00(userSession);
        this.A08 = AbstractC166987dD.A1G();
    }
}
