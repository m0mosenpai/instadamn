package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class RLB extends AbstractC61295RlF {
    public final Context A00;
    public final InterfaceC65411Tji A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC61295RlF) {
                RLB rlb = (RLB) ((AbstractC61295RlF) obj);
                if (!this.A00.equals(rlb.A00) || !this.A01.equals(rlb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A11("FlagsContext{context=", this.A00.toString(), ", hermeticFileOverrides=", this.A01.toString(), "}");
    }

    public RLB(Context context, InterfaceC65411Tji interfaceC65411Tji) {
        this.A00 = context;
        this.A01 = interfaceC65411Tji;
    }
}
