package X;

import java.util.Map;

/* loaded from: classes9.dex */
public final class OME {
    public final Map A00 = AbstractC166987dD.A1I();

    public final void A00(Integer num, String str) {
        if (num != null) {
            this.A00.put(str, new NT2(num.intValue()));
        }
    }

    public final void A01(String str, Boolean bool) {
        if (bool != null) {
            this.A00.put(str, new NSz(bool.booleanValue()));
        }
    }

    public final void A02(String str, Long l) {
        if (l != null) {
            this.A00.put(str, new NT3(l.longValue()));
        }
    }

    public final void A03(String str, String str2) {
        if (str2 != null) {
            this.A00.put(str, new NT4(str2));
        }
    }
}
