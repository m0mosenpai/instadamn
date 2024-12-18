package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.S1k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62189S1k {
    public static C60622REh A00(C62731SNv c62731SNv) {
        try {
            C64027Sxz c64027Sxz = (C64027Sxz) AbstractC25234BEr.A0d(SR5.class);
            c64027Sxz.A00.A04("payment_type", "FBPAY_HUB");
            c64027Sxz.A02 = true;
            return C60622REh.A00(c62731SNv, C2FP.A06().A00.A00, c64027Sxz.A00(), new C58605PyY(19));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}
