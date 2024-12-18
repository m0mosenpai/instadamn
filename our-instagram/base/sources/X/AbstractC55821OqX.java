package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.OqX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55821OqX implements InterfaceC23731Ed {
    public static void A00(AnonymousClass182 anonymousClass182, Map map, Map map2) {
        anonymousClass182.A0d();
        ArrayList A0k = MSY.A0k(map);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            Object value = A1K.getValue();
            anonymousClass182.A0r(A17);
            anonymousClass182.A0J(value);
            A0k.add(C0eB.A00);
        }
        ArrayList A0k2 = MSY.A0k(map2);
        Iterator A152 = AbstractC166997dE.A15(map2);
        while (A152.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
            String A172 = AbstractC31172DnG.A17(A1K2);
            Object value2 = A1K2.getValue();
            anonymousClass182.A0r(A172);
            anonymousClass182.A0J(value2);
            A0k2.add(C0eB.A00);
        }
        anonymousClass182.A0a();
    }
}
