package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CWo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28016CWo {
    public static final ArrayList A00(InterfaceC1131259a interfaceC1131259a) {
        List A0L;
        C14360o3.A0C(interfaceC1131259a, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        AnonymousClass599 BMY = ((C59Y) interfaceC1131259a).BMY();
        boolean A01 = A01(BMY);
        List A0G = BMY.A0G();
        ArrayList A0q = AbstractC25230BEn.A0q(A0G);
        int size = A0G.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass599 anonymousClass599 = (AnonymousClass599) A0G.get(i);
            if (A01) {
                A0L = anonymousClass599.A0E();
            } else {
                A0L = anonymousClass599.A0U.A0J.A0L();
            }
            A0q.add(A0L);
        }
        return A0q;
    }

    public static final boolean A01(AnonymousClass599 anonymousClass599) {
        int intValue = anonymousClass599.A0U.A06.intValue();
        if (intValue == 1 || intValue == 3) {
            return true;
        }
        if (intValue != 0 && intValue != 2) {
            if (intValue == 4) {
                AnonymousClass599 A0B = anonymousClass599.A0B();
                if (A0B != null) {
                    return A01(A0B);
                }
                throw AbstractC166987dD.A12("no parent for idle node");
            }
            throw B4Z.A00();
        }
        return false;
    }
}
