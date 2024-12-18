package X;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: X.GcY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37330GcY {
    public C11520jB A00 = AbstractC37300Gc1.A0B();

    public final void A00(Bundle bundle) {
        C11520jB c11520jB;
        Serializable serializable = bundle.getSerializable("extra_flow_analytics_ig_extras");
        if ((serializable instanceof C11520jB) && (c11520jB = (C11520jB) serializable) != null) {
            this.A00.A06(c11520jB);
        }
    }

    public final void A01(Bundle bundle) {
        bundle.putSerializable("extra_flow_analytics_ig_extras", this.A00);
    }

    public final void A02(C11520jB c11520jB) {
        if (c11520jB != null && c11520jB != this.A00) {
            this.A00 = c11520jB;
        }
    }
}
