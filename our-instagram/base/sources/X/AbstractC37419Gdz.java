package X;

import com.instagram.api.schemas.RingSpec;
import java.util.ArrayList;

/* renamed from: X.Gdz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37419Gdz {
    public static final BHN A00() {
        RingSpec ringSpec = (RingSpec) C3Oc.A0B.getValue();
        C14360o3.A0B(ringSpec, 0);
        String name = ringSpec.getName();
        long A00 = AbstractC119395aw.A00(ringSpec.Bzg().CI0(), ringSpec.Bzg().CIZ());
        long A002 = AbstractC119395aw.A00(ringSpec.B1y().CI0(), ringSpec.B1y().CIZ());
        int length = AbstractC72903Oq.A00(ringSpec).length;
        ArrayList A17 = AbstractC25225BEi.A17(length);
        for (int i = 0; i < length; i++) {
            A17.add(new C1132359l(r6[i] << 32));
        }
        return new BHN(name, AbstractC133095zb.A00(A17), AbstractC133095zb.A00(ringSpec.BOR()), A00, A002);
    }
}
