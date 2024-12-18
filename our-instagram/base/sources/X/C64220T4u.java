package X;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.T4u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64220T4u implements C61X {
    public static final C64220T4u A01 = new C64220T4u(AbstractC166987dD.A0b());
    public final Bundle A00;

    public /* synthetic */ C64220T4u(Bundle bundle) {
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C64220T4u) {
                Bundle bundle = this.A00;
                Bundle bundle2 = ((C64220T4u) obj).A00;
                if (bundle.size() == bundle2.size()) {
                    java.util.Set<String> keySet = bundle.keySet();
                    if (keySet.containsAll(bundle2.keySet())) {
                        Iterator<String> it = keySet.iterator();
                        while (it.hasNext()) {
                            String A1B = AbstractC166987dD.A1B(it);
                            if (!SSI.A01(bundle.get(A1B), bundle2.get(A1B))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(this.A00);
    }
}
