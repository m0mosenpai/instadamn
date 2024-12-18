package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.HPa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39217HPa extends C17T implements InterfaceC39371sI {
    @Override // X.InterfaceC39371sI
    public final Boolean Bux() {
        return getOptionalBooleanValueByHashCode(-1471316900);
    }

    @Override // X.InterfaceC39371sI
    public final C39361sH EuV() {
        return new C39361sH(getOptionalBooleanValueByHashCode(-1471316900));
    }

    @Override // X.InterfaceC39371sI
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (getOptionalBooleanValueByHashCode(-1471316900) != null) {
            A0X.put("should_disable", getOptionalBooleanValueByHashCode(-1471316900));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
