package X;

import java.util.Locale;

/* renamed from: X.Npo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53737Npo {
    public static final void A00(C2N9 c2n9, Object obj) {
        Class BUQ = c2n9.BUQ();
        C14360o3.A07(BUQ);
        Class<?> cls = obj.getClass();
        if (BUQ.isAssignableFrom(cls)) {
            return;
        }
        String format = String.format(Locale.US, "Expected McfRef object of type '%s' but actual was '%s'", MSX.A1b(BUQ, cls, 2));
        C14360o3.A07(format);
        throw AbstractC166987dD.A14(format);
    }
}
