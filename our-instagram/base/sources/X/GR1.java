package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes6.dex */
public final class GR1 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EnumC46283KeF A01;
    public final /* synthetic */ C7YJ A02;
    public final /* synthetic */ RtcCallFunnelSessionId A03;
    public final /* synthetic */ C7T3 A04;
    public final /* synthetic */ RtcStartCoWatchPlaybackArguments A05;
    public final /* synthetic */ boolean A06;

    public GR1(Context context, EnumC46283KeF enumC46283KeF, C7YJ c7yj, RtcCallFunnelSessionId rtcCallFunnelSessionId, C7T3 c7t3, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, boolean z) {
        this.A02 = c7yj;
        this.A00 = context;
        this.A06 = z;
        this.A04 = c7t3;
        this.A05 = rtcStartCoWatchPlaybackArguments;
        this.A03 = rtcCallFunnelSessionId;
        this.A01 = enumC46283KeF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        C7YJ c7yj = this.A02;
        Activity A04 = AbstractC31172DnG.A04(c7yj.A01);
        Context context = this.A00;
        UserSession userSession = c7yj.A03;
        Object value = c7yj.A08.getValue();
        boolean z = this.A06;
        InterfaceC11380iw interfaceC11380iw = c7yj.A02;
        C7T3 c7t3 = this.A04;
        RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = this.A05;
        RtcCallFunnelSessionId rtcCallFunnelSessionId = this.A03;
        EnumC46283KeF enumC46283KeF = this.A01;
        C14360o3.A0B(A04, 0);
        boolean A1a = AbstractC31175DnJ.A1a(value);
        D91 d91 = new D91(context, userSession, value, interfaceC11380iw, c7t3, rtcStartCoWatchPlaybackArguments, rtcCallFunnelSessionId, enumC46283KeF, A1a ? 1 : 0, z);
        String[] strArr = (String[]) AbstractC166987dD.A1E().toArray(new String[0]);
        int length = strArr.length;
        if (AbstractC23451Ch.A08(A04, (String[]) Arrays.copyOf(strArr, length))) {
            d91.invoke();
        } else {
            AbstractC23451Ch.A04(A04, new C70784Wgx(A1a ? 1 : 0, A04, d91, strArr), (String[]) Arrays.copyOf(strArr, length));
        }
        C36303Fzy A00 = C36303Fzy.A00(userSession);
        if (A00.A06 != null && A00.A03 != null && (scheduledFuture = A00.A07) != null) {
            scheduledFuture.cancel(false);
        }
    }
}
