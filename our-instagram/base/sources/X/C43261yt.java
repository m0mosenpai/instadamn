package X;

import com.instagram.common.session.UserSession;
import java.util.Random;

/* renamed from: X.1yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43261yt implements C1RX, InterfaceC13000lm {
    public static final Random A02 = new Random();
    public final UserSession A00;
    public final C42621xq A01;

    @Override // X.C1RX
    public final void ClJ(C1QY c1qy) {
        C42621xq c42621xq = this.A01;
        EnumC23341Bw enumC23341Bw = c1qy.A09;
        if ((enumC23341Bw != EnumC23341Bw.Image && enumC23341Bw != EnumC23341Bw.Video && enumC23341Bw != EnumC23341Bw.VideoCoverImage) || !c42621xq.A04 || c42621xq.A03.nextInt(c42621xq.A00) != 0) {
            return;
        }
        C18920wW c18920wW = c42621xq.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_request_prefetch_coverage");
        A00.A9K("ig_user_id", Long.valueOf(Long.parseLong(c42621xq.A02.userId)));
        A00.A7v("is_onscreen_priority", Boolean.valueOf(C1RN.A00(c1qy)));
        A00.AAP("request_type", enumC23341Bw.A00);
        A00.AAP("container_module", c1qy.A0E);
        A00.A7v("is_in_prefetch_graph", false);
        A00.AAP("user_current_container_module", C26771Rh.A00().A00);
        A00.Cht();
    }

    @Override // X.C1RX
    public final void CiS(double d, long j, long j2) {
        double d2;
        double max;
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        C43271yu c43271yu = (C43271yu) userSession.A01(C43271yu.class, new C50157MDk(userSession, 32));
        c43271yu.A02++;
        c43271yu.A05 += j2;
        c43271yu.A04 += j;
        if (j2 == 0) {
            d2 = 0.0d;
        } else {
            d2 = (j * 1.0d) / j2;
        }
        double d3 = c43271yu.A00;
        if (d3 == -1.0d) {
            max = d2;
        } else {
            max = Math.max(d3, d2);
        }
        c43271yu.A00 = max;
        double d4 = c43271yu.A01;
        if (d4 != -1.0d) {
            d2 = Math.min(d4, d2);
        }
        c43271yu.A01 = d2;
        c43271yu.A03 = System.currentTimeMillis();
    }

    @Override // X.C1RX
    public final void Ckm(double d) {
        if (A02.nextInt(10000) < 10) {
            "estimated_bandwidth_on_screen_request".getClass();
            C19280xC A01 = C19280xC.A01("estimated_bandwidth_on_screen_request", null);
            A01.A0A("bandwidth", Double.valueOf(d));
            AbstractC11060iN.A00(this.A00).EHW(A01);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C1RV c1rv = (C1RV) C1RV.A01.getValue();
        synchronized (c1rv) {
            c1rv.A00.remove(this);
        }
    }

    public C43261yt(UserSession userSession, C42621xq c42621xq) {
        this.A00 = userSession;
        this.A01 = c42621xq;
        C1RV c1rv = (C1RV) C1RV.A01.getValue();
        synchronized (c1rv) {
            c1rv.A00.add(this);
        }
        C14360o3.A0B(userSession, 0);
        C43271yu.A01((C43271yu) userSession.A01(C43271yu.class, new C50157MDk(userSession, 32)));
    }

    @Override // X.C1RX
    public final void ClI(String str, boolean z) {
        if (A02.nextInt(1000) <= 1) {
            "ig_request_cache_rate".getClass();
            C19280xC A01 = C19280xC.A01("ig_request_cache_rate", null);
            A01.A0C("path", str);
            A01.A09("cache_hit", Boolean.valueOf(z));
            AbstractC11060iN.A00(this.A00).EHW(A01);
        }
    }
}
