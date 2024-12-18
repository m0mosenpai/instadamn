package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.model.direct.DirectShareTarget;
import java.util.function.Predicate;

/* renamed from: X.B1r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24943B1r implements Predicate {
    public final int A00;

    public C24943B1r(int i) {
        this.A00 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.A00) {
            case 0:
                if (((OTK) obj).A00 == CameraTool.A09) {
                    return true;
                }
                return false;
            case 1:
                return ((DirectShareTarget) obj).A0M();
            default:
                if (obj != null) {
                    return true;
                }
                return false;
        }
    }
}
