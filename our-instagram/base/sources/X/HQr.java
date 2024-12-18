package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HQr extends C17T implements C5L2 {
    @Override // X.C5L2
    public final C5L1 EwD() {
        return new C5L1(A0Q());
    }

    @Override // X.C5L2
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0Q() != null) {
            AbstractC37300Gc1.A14(A0Q(), A0X);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // X.C5L2
    public final String getName() {
        return A0Q();
    }
}
