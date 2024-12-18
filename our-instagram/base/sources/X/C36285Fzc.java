package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fzc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36285Fzc implements InterfaceC13000lm {
    public long A00;
    public long A01;
    public long A02;
    public final boolean A03;
    public final UserSession A04;

    public final void A00(InterfaceC11380iw interfaceC11380iw, Boolean bool, Boolean bool2, String str, long j, boolean z) {
        Long l;
        if (this.A03) {
            long j2 = this.A02;
            if (j2 != 0) {
                long j3 = this.A01;
                Long l2 = null;
                if (j3 != 0) {
                    l = Long.valueOf(j3 - j2);
                } else {
                    l = null;
                }
                if (j3 != 0) {
                    long j4 = this.A00;
                    if (j4 != 0) {
                        l2 = Long.valueOf(j4 - j3);
                    }
                }
                UserSession userSession = this.A04;
                long j5 = j - j2;
                C06090Tz c06090Tz = C06090Tz.A05;
                Long A0i = AbstractC166997dE.A0i(c06090Tz, userSession, 36594916658382826L);
                Boolean A0c = AbstractC166997dE.A0c(c06090Tz, userSession, 36313441681606662L);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(interfaceC11380iw, userSession), "banyan_real_time_latency");
                A0f.A9K("max_ranking_timeout", A0i);
                A0f.A7v("is_real_time_ranking_request", A0c);
                A0f.A7v("is_private_reshare", bool);
                A0f.A7v("api_surpassed_timeout", bool2);
                if (str == null) {
                    str = "";
                }
                A0f.AAP("ranking_request_id", str);
                A0f.A9K("time_latency_ms", Long.valueOf(j5));
                A0f.A7v("load_status", Boolean.valueOf(z));
                A0f.A9K("network_latency_ms", l2);
                A0f.A9K("preprocessing_latency_ms", l);
                A0f.Cht();
                this.A02 = 0L;
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02 = 0L;
    }

    public C36285Fzc(UserSession userSession) {
        this.A04 = userSession;
        this.A03 = C18U.A06(C06090Tz.A06, userSession, 36313441681541125L);
    }
}
