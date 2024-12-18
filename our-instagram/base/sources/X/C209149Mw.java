package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.9Mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209149Mw {
    public final Context A00;
    public final Map A04 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A03 = AbstractC166987dD.A1G();
    public final StringBuilder A01 = AbstractC166987dD.A1C();

    public final void A00(BCA bca) {
        C14360o3.A0B(bca, 0);
        Map map = this.A02;
        if (map.containsKey(bca)) {
            synchronized (this) {
                Object obj = map.get(bca);
                if (obj != null) {
                    for (ACB acb : (java.util.Set) obj) {
                        int i = acb.A00 - 1;
                        acb.A00 = i;
                        if (i == 0) {
                            acb.A01.cleanup();
                            this.A04.remove(acb.A02);
                        }
                    }
                    Object remove = map.remove(bca);
                    if (remove != null) {
                        ((java.util.Set) remove).clear();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
    }

    public C209149Mw(Context context) {
        this.A00 = AbstractC166987dD.A0O(context);
    }
}
