package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HQJ extends C17T implements JJQ {
    @Override // X.JJQ
    public final C38729H3s EvJ() {
        return new C38729H3s(A0T());
    }

    @Override // X.JJQ
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0T() != null) {
            A0X.put(DevServerEntity.COLUMN_DESCRIPTION, A0T());
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
