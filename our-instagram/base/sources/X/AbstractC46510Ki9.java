package X;

import android.content.Context;

/* renamed from: X.Ki9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46510Ki9 {
    public final String A00(Context context) {
        if (this instanceof KSD) {
            KSD ksd = (KSD) this;
            String A0p = AbstractC166997dE.A0p(context, ksd.A00);
            String str = ksd.A01;
            if (str != null) {
                return AbstractC43592JPx.A10(A0p, str);
            }
            return A0p;
        }
        KSC ksc = (KSC) this;
        String str2 = ksc.A00;
        if (str2 != null) {
            return AbstractC43592JPx.A10(ksc.A01, str2);
        }
        return ksc.A01;
    }
}
