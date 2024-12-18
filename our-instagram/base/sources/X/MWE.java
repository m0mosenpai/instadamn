package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class MWE implements C2VM {
    public final List A00 = AbstractC166987dD.A1E();
    public volatile boolean A01;

    @Override // X.C2VM
    public final void A9k(C80503if c80503if) {
        synchronized (this) {
            if (!this.A01) {
                this.A00.add(c80503if);
            }
        }
    }

    @Override // X.C2VM
    public final boolean Cbm() {
        return this.A01;
    }
}
