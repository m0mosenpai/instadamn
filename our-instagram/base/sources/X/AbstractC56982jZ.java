package X;

import java.util.List;

/* renamed from: X.2jZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56982jZ {
    public C57222jx A00;

    public final void A01() {
        C57222jx c57222jx = this.A00;
        if (c57222jx != null) {
            C57192ju c57192ju = c57222jx.A00;
            if (!c57192ju.A01) {
                c57192ju.A01 = true;
                c57192ju.A04.post(c57192ju.A0A);
            }
        }
    }

    public final void A02() {
        C57222jx c57222jx = this.A00;
        if (c57222jx != null) {
            C57192ju c57192ju = c57222jx.A00;
            InterfaceC57132jo interfaceC57132jo = c57192ju.A00;
            if (interfaceC57132jo != null) {
                interfaceC57132jo.DiQ();
            }
            if (c57192ju.A01) {
                c57192ju.A04.removeCallbacks(c57192ju.A0A);
                long now = c57192ju.A05.now();
                if (c57192ju.A0C.isEmpty()) {
                    C2U9 c2u9 = c57192ju.A07;
                    List list = c57192ju.A0B;
                    c2u9.A00(list);
                    C57152jq c57152jq = c57192ju.A09;
                    c57152jq.A03(now, list);
                    c57152jq.A02();
                } else {
                    throw new IllegalStateException();
                }
            }
            c57192ju.A01 = false;
        }
    }
}
