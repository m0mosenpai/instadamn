package X;

import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* renamed from: X.Mfr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50984Mfr extends AbstractC52922bZ {
    public O6H A00;
    public final LimitsPlusRepository A01;
    public final C54288Nz8 A02;
    public final C05A A03;
    public final C0UO A04;

    public C50984Mfr(LimitsPlusRepository limitsPlusRepository, C54288Nz8 c54288Nz8) {
        C14360o3.A0B(limitsPlusRepository, 1);
        this.A01 = limitsPlusRepository;
        this.A02 = c54288Nz8;
        C008002u A1H = AbstractC25225BEi.A1H(new C51599Mqr(C05F.A00, 0, 0L));
        this.A03 = A1H;
        this.A04 = AbstractC208910l.A02(A1H);
    }

    public final void A01(int i) {
        Object value;
        Integer num;
        long j;
        C05A c05a = this.A03;
        do {
            value = c05a.getValue();
            C51599Mqr c51599Mqr = (C51599Mqr) value;
            num = c51599Mqr.A02;
            j = c51599Mqr.A01;
            C14360o3.A0B(num, 0);
        } while (!c05a.AIi(value, new C51599Mqr(num, i, j)));
    }

    public final void A00() {
        long j;
        Object value;
        Integer num;
        int i;
        N7N n7n;
        long A03 = AbstractC50524MSc.A03();
        C05A c05a = this.A03;
        Integer num2 = ((C51599Mqr) c05a.getValue()).A02;
        Integer num3 = C05F.A00;
        long j2 = ((C51599Mqr) c05a.getValue()).A00;
        if (num2 == num3) {
            j = SandboxRepository.CACHE_TTL;
        } else {
            j = 604800;
        }
        long j3 = A03 + (j2 * j);
        do {
            value = c05a.getValue();
            C51599Mqr c51599Mqr = (C51599Mqr) value;
            num = c51599Mqr.A02;
            i = c51599Mqr.A00;
            C14360o3.A0B(num, 0);
        } while (!c05a.AIi(value, new C51599Mqr(num, i, j3)));
        O6H o6h = this.A00;
        if (o6h != null && (n7n = o6h.A00.A02) != null) {
            n7n.A00 = j3;
        }
    }
}
