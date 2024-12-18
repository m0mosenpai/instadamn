package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HQM extends C17T implements InterfaceC87603vS {
    @Override // X.InterfaceC87603vS
    public final C87593vR EvM() {
        return new C87593vR(getOptionalBooleanValueByHashCode(-1471316900));
    }

    @Override // X.InterfaceC87603vS
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (getOptionalBooleanValueByHashCode(-1471316900) != null) {
            A0X.put("should_disable", getOptionalBooleanValueByHashCode(-1471316900));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
