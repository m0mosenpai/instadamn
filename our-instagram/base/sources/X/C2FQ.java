package X;

import com.instagram.common.session.UserSession;
import com.messagingclient.componentslogger.ComponentLoggerPluginMCFBridgejniDispatcher;
import java.util.Map;

/* renamed from: X.2FQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FQ implements InterfaceC13000lm {
    public final int A00;
    public final int A01;
    public final C006802i A02;
    public final C218914p A03;
    public final InterfaceC12870lZ A04;
    public final UserSession A05;
    public volatile int A06;
    public volatile boolean A07;
    public volatile int A08;
    public volatile int A09;
    public volatile int A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;

    public C2FQ(C006802i c006802i, C218914p c218914p, UserSession userSession, int i) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c218914p, 3);
        this.A05 = userSession;
        this.A02 = c006802i;
        this.A03 = c218914p;
        this.A01 = i;
        this.A00 = userSession.userId.hashCode();
        this.A04 = new InterfaceC12870lZ() { // from class: X.2FT
            public boolean A00;

            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(1950258782);
                C2FQ c2fq = C2FQ.this;
                C006802i c006802i2 = c2fq.A02;
                int i2 = c2fq.A01;
                int i3 = c2fq.A00;
                c006802i2.markerAnnotate(i2, i3, "been_on_background", true);
                c006802i2.markerPoint(i2, i3, "on_background_start");
                this.A00 = true;
                C0f9.A0A(1326145666, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int A03 = C0f9.A03(2059631123);
                if (this.A00) {
                    C2FQ c2fq = C2FQ.this;
                    c2fq.A02.markerPoint(c2fq.A01, c2fq.A00, "on_background_end");
                }
                this.A00 = false;
                C0f9.A0A(-174295835, A03);
            }
        };
    }

    public final void A03(int i) {
        this.A0C = true;
        this.A08 = i;
        C006802i c006802i = this.A02;
        int i2 = this.A01;
        int i3 = this.A00;
        c006802i.markerPoint(i2, i3, "offline_sync_end");
        c006802i.markerAnnotate(i2, i3, "startup_destination", C1CC.A01);
        if (this.A08 != 0 && !this.A0B) {
            c006802i.markerAnnotate(i2, i3, "ending_extended", true);
            return;
        }
        c006802i.markerAnnotate(i2, i3, "ending_extended", false);
        A00(this);
        c006802i.markerEnd(i2, i3, (short) 2);
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        C006802i c006802i = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        if (c006802i.isMarkerOn(i, i2)) {
            c006802i.markerPoint(i, i2, str);
        }
        if (c006802i.isMarkerOn(20127518, i2)) {
            c006802i.markerPoint(20127518, i2, str);
        }
    }

    public final void A06(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C006802i c006802i = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        if (c006802i.isMarkerOn(i, i2)) {
            c006802i.markerAnnotate(i, i2, str, str2);
        }
        if (c006802i.isMarkerOn(20127518, i2)) {
            c006802i.markerAnnotate(20127518, i2, str, str2);
        }
    }

    public static final void A00(C2FQ c2fq) {
        int i = c2fq.A01;
        int i2 = c2fq.A00;
        Map MCIComponentAttributionLoggerCreateAggregatedDataNative = ComponentLoggerPluginMCFBridgejniDispatcher.MCIComponentAttributionLoggerCreateAggregatedDataNative(i, i2);
        C14360o3.A07(MCIComponentAttributionLoggerCreateAggregatedDataNative);
        for (Map.Entry entry : MCIComponentAttributionLoggerCreateAggregatedDataNative.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                C006802i c006802i = c2fq.A02;
                C14360o3.A0C(key, "null cannot be cast to non-null type kotlin.String");
                c006802i.markerAnnotate(i, i2, (String) key, ((Number) value).intValue());
            }
            if (value instanceof String) {
                C006802i c006802i2 = c2fq.A02;
                C14360o3.A0C(key, "null cannot be cast to non-null type kotlin.String");
                c006802i2.markerAnnotate(i, i2, (String) key, (String) value);
            }
        }
        ComponentLoggerPluginMCFBridgejniDispatcher.MCIComponentAttributionLoggerEndNative(i, i2);
    }

    public final void A01() {
        this.A09++;
        C006802i c006802i = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        if (c006802i.isMarkerOn(i, i2)) {
            c006802i.markerAnnotate(i, i2, "offline_message_processed", this.A09);
            if (this.A0C && this.A09 >= this.A08) {
                c006802i.markerPoint(i, i2, "offline_process_end");
                A00(this);
                c006802i.markerEnd(i, i2, (short) 2);
            }
        }
    }

    public final void A02() {
        this.A0A++;
        C006802i c006802i = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        if (c006802i.isMarkerOn(i, i2)) {
            c006802i.markerAnnotate(i, i2, "offline_message_processed_failed", this.A0A);
        }
    }

    public final void A05(String str) {
        C006802i c006802i = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        if (c006802i.isMarkerOn(i, i2)) {
            c006802i.markerAnnotate(i, i2, "potential_fail_reason", str);
        }
    }

    public final void A07(boolean z, boolean z2) {
        C006802i c006802i = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        if (!c006802i.isMarkerOn(i, i2)) {
            c006802i.markerStart(i, i2, false);
            ComponentLoggerPluginMCFBridgejniDispatcher.MCIComponentAttributionLoggerStartNative(i, i2, "bootstrap_attribution_plugin");
            if (this.A07) {
                c006802i.markerAnnotate(i, i2, "is_bg_sync", true);
                this.A07 = false;
            }
            this.A0B = z2;
            c006802i.markerAnnotate(i, i2, "is_background_account_sync", z2);
            c006802i.markerAnnotate(i, i2, "startup_type", C1CC.A09.toString());
            UserSession userSession = this.A05;
            C06090Tz c06090Tz = C06090Tz.A05;
            c006802i.markerAnnotate(i, i2, "is_instamadillo", C18U.A06(c06090Tz, userSession, 36326154785928895L));
            c006802i.markerAnnotate(i, i2, "is_ttlc", C18U.A06(c06090Tz, userSession, 36326154786584264L));
            c006802i.markerAnnotate(i, i2, "is_cold_start", z);
            C218914p.A03(EnumC220415e.A03, this.A04);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C006802i c006802i = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        c006802i.markerAnnotate(i, i2, "end_reason", "session_ends_with_no_offline_completion");
        A00(this);
        c006802i.markerEnd(i, i2, (short) 3);
        if (AbstractC201688vy.A01(this.A05, C05F.A0C)) {
            C218914p.A06(this.A04);
        }
    }
}
