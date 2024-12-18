package X;

import java.util.Random;

/* renamed from: X.1CE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CE implements C1CF {
    public final int A00;
    public final boolean A01;

    @Override // X.C1CF
    public final boolean EjH(int i) {
        if (C21A.A02()) {
            return true;
        }
        return this.A01 && new Random().nextInt(this.A00) < 1;
    }

    @Override // X.C1CF
    public final boolean isEnabled() {
        if (!this.A01 && !C21A.A02()) {
            return false;
        }
        return true;
    }

    public C1CE(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }
}
