package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ivi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42744Ivi implements JHG {
    public int A00;
    public long A01;
    public boolean A02;
    public final UserSession A03;
    public final C114485Es A04;
    public final String A05;

    public C42744Ivi(UserSession userSession, C114485Es c114485Es, String str) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = c114485Es;
    }

    @Override // X.JHG
    public final void DDX(Integer num) {
        C14360o3.A0B(num, 0);
        int i = this.A00;
        boolean z = true;
        if (i <= 0 && !this.A02) {
            int i2 = 0;
            if (num == C05F.A0C) {
                i2 = 2;
            }
            this.A00 = i2;
            if (num != C05F.A00) {
                z = false;
            }
            this.A02 = z;
            long j = this.A01;
            if (j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > j) {
                    A00(currentTimeMillis - j, num);
                }
            } else {
                if (!z) {
                    return;
                }
                A00(0L, num);
                return;
            }
        } else {
            this.A00 = i - 1;
            this.A02 = false;
        }
        this.A01 = 0L;
    }

    private final void A00(long j, Integer num) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A03), "instagram_explore_tail_load");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, this.A05);
            A0f.A9K("time_spent", Long.valueOf(j));
            Long A0T = AbstractC37302Gc3.A0T();
            A0f.A9K("time_spent_all_media_rendered", A0T);
            A0f.A9K("time_spent_first_media_rendered", A0T);
            switch (num.intValue()) {
                case 0:
                    str = "success";
                    break;
                case 1:
                    str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
                    break;
                default:
                    str = "canceled";
                    break;
            }
            A0f.AAP("event_outcome", str);
            C114485Es c114485Es = this.A04;
            A0f.A9K("client_page", AbstractC31171DnF.A0V(c114485Es.A03));
            A0f.A9K("client_position", AbstractC31171DnF.A0V(c114485Es.A04));
            A0f.Cht();
        }
    }

    @Override // X.JHG
    public final void onStart() {
        if (this.A01 == 0) {
            this.A01 = System.currentTimeMillis();
        }
        this.A00 = 0;
        this.A02 = false;
    }
}
