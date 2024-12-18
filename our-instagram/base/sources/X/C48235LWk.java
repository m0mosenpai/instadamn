package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.LWk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48235LWk implements MQO {
    public final /* synthetic */ C45485KBz A00;

    @Override // X.MQO
    public final void CwN(C46520KiJ c46520KiJ) {
        C44542Jmm c44542Jmm;
        Jo1 jo1;
        C45485KBz c45485KBz = this.A00;
        C87T c87t = c45485KBz.A09;
        if (c87t != null && (c44542Jmm = c45485KBz.A08) != null && (jo1 = c45485KBz.A07) != null) {
            Map map = c44542Jmm.A08;
            Integer valueOf = Integer.valueOf(c46520KiJ.A00);
            if (map.containsKey(valueOf)) {
                AbstractC43592JPx.A1W(valueOf, map, true);
                if (!map.containsValue(false)) {
                    c44542Jmm.A03.A00();
                    C87R c87r = c44542Jmm.A05.A0C;
                    if (!c87r.A02.getAndSet(true)) {
                        AtomicLong atomicLong = c87r.A03;
                        atomicLong.set(c87r.A01.A02(17638221, atomicLong.get()));
                    }
                }
            }
            int i = c45485KBz.A00;
            int i2 = c45485KBz.A01;
            if (i >= 0) {
                List list = jo1.A06;
                if (i < list.size() && i2 >= 0 && i2 < list.size()) {
                    while (i <= i2 && i < list.size()) {
                        if (c46520KiJ == ((LHy) list.get(i)).A00) {
                            c87t.A0B(c44542Jmm.A07, AbstractC166987dD.A1J(c46520KiJ));
                            return;
                        }
                        i++;
                    }
                }
            }
        }
    }

    public C48235LWk(C45485KBz c45485KBz) {
        this.A00 = c45485KBz;
    }

    @Override // X.MQO
    public final void DD1(C46520KiJ c46520KiJ, boolean z) {
        C87T c87t = this.A00.A09;
        if (c87t != null) {
            String str = c46520KiJ.A05;
            C14360o3.A07(str);
            c87t.A07(str);
        }
    }

    @Override // X.MQO
    public final void DVs() {
        C87T c87t = this.A00.A09;
        if (c87t != null) {
            c87t.A04.A01(C85B.A0B);
        }
    }
}
