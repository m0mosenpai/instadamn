package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.54m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1121854m {
    public C101274gj A00;
    public InterfaceC124075jM A01;
    public String A02;
    public String A03;
    public List A04;
    public List A05;
    public List A06;
    public final C5IT A07;
    public final Integer A08;

    public final Integer A00() {
        if (this.A00.A01 == C1XV.A0Q) {
            return C05F.A0C;
        }
        return C05F.A01;
    }

    public C1121854m(UserSession userSession, C101274gj c101274gj, Integer num, List list) {
        C5IT c5it;
        this.A05 = new ArrayList();
        this.A06 = new ArrayList();
        this.A04 = list;
        this.A00 = c101274gj;
        C1XV c1xv = c101274gj.A01;
        if (c1xv == C1XV.A0m) {
            c5it = new C5IS(userSession);
        } else if (c1xv == C1XV.A0Q) {
            c5it = new C24028AlL(userSession);
        } else {
            c5it = null;
            this.A07 = null;
            this.A08 = num;
            if (c5it == null && c5it.BwE() && this.A04.size() >= 7 && this.A04.size() - c5it.BTy() >= 3) {
                this.A05 = this.A04.subList(0, c5it.BTy());
                this.A06 = this.A04.subList(c5it.BTy(), this.A04.size());
                return;
            }
            return;
        }
        this.A07 = c5it;
        this.A08 = num;
        if (c5it == null) {
        }
    }
}
