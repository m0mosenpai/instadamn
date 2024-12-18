package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MTt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50562MTt {
    public boolean A09;
    public final C18920wW A0A;
    public final String A0B;
    public final Map A0C = AbstractC166987dD.A1I();
    public long A04 = -1;
    public long A06 = -1;
    public String A08 = "unknown";
    public String A07 = "unknown";
    public long A01 = -1;
    public long A03 = -1;
    public long A00 = -1;
    public long A02 = -1;
    public long A05 = -1;

    public final void A00(long j, long j2) {
        long valueOf;
        if (this.A09) {
            if (j == this.A03 && j2 == this.A02) {
                return;
            }
            if (this.A01 == -1) {
                this.A01 = j;
            }
            if (this.A00 == -1) {
                this.A00 = j2;
            }
            this.A03 = j;
            this.A02 = j2;
            Map map = this.A0C;
            C51u c51u = (C51u) map.get(Long.valueOf(j));
            Long valueOf2 = Long.valueOf(this.A03);
            Long valueOf3 = Long.valueOf(j2);
            if (c51u == null) {
                valueOf = 1L;
            } else {
                valueOf = Long.valueOf(AbstractC166987dD.A0N(c51u.A02) + 1);
            }
            map.put(Long.valueOf(this.A03), new C51u(valueOf2, valueOf3, valueOf));
        }
    }

    public C50562MTt(UserSession userSession, String str) {
        this.A0B = str;
        this.A0A = AbstractC12220kQ.A02(userSession);
    }
}
