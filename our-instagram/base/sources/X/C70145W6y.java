package X;

import android.os.Bundle;

/* renamed from: X.W6y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70145W6y {
    public static final /* synthetic */ C70145W6y A00 = new Object();

    public static final void A00(Bundle bundle, InterfaceC72023XFl interfaceC72023XFl) {
        String BWI = interfaceC72023XFl.BWI();
        boolean equals = BWI.equals("screen_query");
        if (!equals && !BWI.equals("legacy_screen")) {
            throw AbstractC31175DnJ.A0V("No bundler found to write navigation data of type: ", BWI);
        }
        bundle.putString("__nav_data_type", BWI);
        if (!equals) {
            if (BWI.equals("legacy_screen")) {
                C66273U6s.A02(bundle, (C66273U6s) interfaceC72023XFl, false);
                return;
            }
            throw AbstractC65702TsY.A0S(BWI);
        }
        if (interfaceC72023XFl instanceof WTT) {
            ((WTT) interfaceC72023XFl).A00(bundle, false);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }
}
