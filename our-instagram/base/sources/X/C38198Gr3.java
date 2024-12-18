package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.Gr3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38198Gr3 implements JHG {
    public long A00;
    public boolean A01;
    public final /* synthetic */ C38P A02;

    @Override // X.JHG
    public final void DDX(Integer num) {
        C14360o3.A0B(num, 0);
        boolean z = false;
        if (this.A01) {
            this.A01 = false;
        } else {
            if (num == C05F.A0C) {
                z = true;
            }
            this.A01 = z;
            long j = this.A00;
            if (j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > j) {
                    A00(currentTimeMillis - j, num);
                }
            } else {
                if (num != C05F.A00) {
                    return;
                }
                A00(0L, num);
                return;
            }
        }
        this.A00 = 0L;
    }

    public C38198Gr3(C38P c38p) {
        this.A02 = c38p;
    }

    private final void A00(long j, Integer num) {
        String str;
        String str2;
        C38P c38p = this.A02;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c38p.getSession()), "instagram_explore_tail_load");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, c38p.getModuleName());
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
            C37934GmW c37934GmW = c38p.A0E;
            Long l = null;
            if (c37934GmW != null && (str2 = c37934GmW.A05) != null && str2.length() != 0) {
                l = AbstractC25228BEl.A13(str2);
            }
            A0f.A9K("client_page", l);
            A0f.A9K("client_position", A0T);
            A0f.Cht();
        }
    }

    @Override // X.JHG
    public final void onStart() {
        if (this.A00 == 0) {
            this.A00 = System.currentTimeMillis();
        }
        this.A01 = false;
    }
}
