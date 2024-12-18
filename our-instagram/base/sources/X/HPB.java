package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HPB extends C17T implements InterfaceC104844nr {
    @Override // X.InterfaceC104844nr
    public final C114595Ff Ets() {
        return new C114595Ff(getOptionalBooleanValueByHashCode(-1572801814));
    }

    @Override // X.InterfaceC104844nr
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (getOptionalBooleanValueByHashCode(-1572801814) != null) {
            A0X.put("enable_reels_ads_nudge", getOptionalBooleanValueByHashCode(-1572801814));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
