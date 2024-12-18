package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.HOo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39212HOo extends C17T implements JJM {
    @Override // X.JJM
    public final H3B EtG() {
        return new H3B(getOptionalStringListByHashCode(-1901966812));
    }

    @Override // X.JJM
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (getOptionalStringListByHashCode(-1901966812) != null) {
            A0X.put("grid_media_ids", getOptionalStringListByHashCode(-1901966812));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
