package X;

import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2XX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XX {
    public static final C11L A00 = new C11L("(\\d+)");

    public static final String A00(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, C2XE c2xe) {
        String A0I;
        int i;
        boolean z = abstractC50812Vc2.A04;
        if (z) {
            A0I = AnonymousClass001.A0D(abstractC50812Vc2.A0I(), '$');
        } else {
            A0I = abstractC50812Vc2.A0I();
            C14360o3.A07(A0I);
        }
        if (abstractC50812Vc != null) {
            String A08 = c2xe.A08();
            C14360o3.A0B(A0I, 1);
            String A0T = AnonymousClass001.A0T(A08, A0I, ',');
            C2Y5 c2y5 = c2xe.A05;
            c2y5.getClass();
            if (z) {
                Map map = c2y5.manualKeysCounter;
                if (map == null) {
                    map = new HashMap(1);
                    c2y5.manualKeysCounter = map;
                }
                Number number = (Number) map.get(A0I);
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = 0;
                }
                map.put(A0I, Integer.valueOf(i + 1));
                if (i != 0) {
                    String substring = A0I.substring(1);
                    C14360o3.A07(substring);
                    C2YE.A01("ComponentKeyUtils:DuplicateManualKey", C05F.A00, AnonymousClass001.A11("The manual key ", substring, " you are setting on this ", abstractC50812Vc2.A0H(), " is a duplicate and will be changed into a unique one. This will result in unexpected behavior if you don't change it."));
                }
            } else {
                InterfaceC09390do interfaceC09390do = c2y5.A06;
                SparseIntArray sparseIntArray = (SparseIntArray) interfaceC09390do.getValue();
                int i2 = abstractC50812Vc2.A05;
                i = sparseIntArray.get(i2, 0);
                ((SparseIntArray) interfaceC09390do.getValue()).put(i2, i + 1);
            }
            C14360o3.A0B(A0T, 0);
            if (i != 0) {
                return AnonymousClass001.A0G(A0T, '!', i);
            }
            return A0T;
        }
        return A0I;
    }
}
