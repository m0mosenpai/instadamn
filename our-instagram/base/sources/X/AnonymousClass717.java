package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.717, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass717 extends AbstractC66542zW {
    public final List A01 = new ArrayList();
    public final List A00 = new ArrayList();

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        return true;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        if (((Number) this.A01.get(i)).intValue() != ((Number) this.A00.get(i2)).intValue()) {
            return false;
        }
        return true;
    }
}
