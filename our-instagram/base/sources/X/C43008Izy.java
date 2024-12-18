package X;

import java.util.Map;

/* renamed from: X.Izy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43008Izy implements AnonymousClass322 {
    public final C1PH A00;

    @Override // X.AnonymousClass322
    public final void EKs(C1PZ c1pz) {
        C14360o3.A0B(c1pz, 0);
        C1PH c1ph = this.A00;
        c1ph.A03.put(AbstractC41685IdE.A01(), c1pz);
    }

    @Override // X.AnonymousClass322
    public final C1PZ Bow() {
        C1PZ c1pz;
        C1PH c1ph = this.A00;
        C1PC A01 = AbstractC41685IdE.A01();
        Map map = c1ph.A03;
        if (map.containsKey(A01)) {
            c1pz = (C1PZ) map.get(A01);
        } else {
            c1pz = C1PZ.A0K;
        }
        C14360o3.A07(c1pz);
        return c1pz;
    }

    public C43008Izy(C1PH c1ph) {
        this.A00 = c1ph;
    }
}
