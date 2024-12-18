package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HQ9 extends C17T implements C5FY {
    @Override // X.C5FY
    public final String BTF() {
        return A0i(923090703);
    }

    @Override // X.C5FY
    public final C38720H3i Ev9() {
        return new C38720H3i(A0i(923090703));
    }

    @Override // X.C5FY
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0i(923090703) != null) {
            A0X.put("metaCheckoutExperienceType", A0i(923090703));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
