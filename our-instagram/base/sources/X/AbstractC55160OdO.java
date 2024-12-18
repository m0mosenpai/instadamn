package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.OdO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55160OdO {
    public static final C04060Jx A00 = C04060Jx.A00();

    public static boolean A03(String str) {
        char charAt;
        return (str == null || str.isEmpty() || (charAt = str.charAt(0)) == '_' || Character.isDigit(charAt)) ? false : true;
    }

    public static String A01(InterfaceC10260gi interfaceC10260gi, List list, boolean z) {
        C55696OoN c55696OoN = new C55696OoN(interfaceC10260gi);
        try {
            C0CA A02 = A00.A02();
            A02(A02.A0B("configs"), c55696OoN, list, z);
            return A00(A02);
        } catch (IOException e) {
            C0K8.A0F("MobileConfigDebugUtil", "Failed to generate consistency logging JSON", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r5 >= 16384) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        if ((r7 instanceof X.C1A2) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C0CA r21, X.InterfaceC57905Pm9 r22, java.util.Collection r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55160OdO.A02(X.0CA, X.Pm9, java.util.Collection, boolean):void");
    }

    public static String A00(C0CA c0ca) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C0C2 A002 = C0C2.A00();
        AbstractC05810Sj.A01(A002, "encoder cannot be null!");
        c0ca.A02 = A002;
        AbstractC05810Sj.A01(A002, "No encoder set, please call setEncoder() first!");
        c0ca.A02.A04(c0ca, A0O);
        c0ca.A02();
        return A0O.toString();
    }
}
