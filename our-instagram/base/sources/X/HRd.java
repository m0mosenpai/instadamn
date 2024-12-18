package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HRd extends C17T implements InterfaceC43510JJw {
    @Override // X.InterfaceC43510JJw
    public final H4T Exw() {
        return new H4T(A0V());
    }

    @Override // X.InterfaceC43510JJw
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0V() != null) {
            AbstractC37300Gc1.A13(A0V(), A0X);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // X.InterfaceC43510JJw
    public final String getUrl() {
        return A0V();
    }
}
