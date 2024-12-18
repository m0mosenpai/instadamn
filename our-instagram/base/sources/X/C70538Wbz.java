package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.Wbz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70538Wbz implements InterfaceC126735oD {
    public final List A00;

    @Override // X.InterfaceC126735oD
    public final int B2o() {
        return 1;
    }

    @Override // X.InterfaceC126735oD
    public final int BWs(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // X.InterfaceC126735oD
    public final List Au4(long j) {
        if (j >= 0) {
            return this.A00;
        }
        return Collections.emptyList();
    }

    public C70538Wbz(List list) {
        this.A00 = list;
    }

    @Override // X.InterfaceC126735oD
    public final long B2n(int i) {
        C4B8.A03(AbstractC167007dF.A1N(i));
        return 0L;
    }
}
