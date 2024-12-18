package X;

import androidx.datastore.preferences.core.Preferences;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class JQQ extends Preferences {
    public final Map A00;
    public final AtomicBoolean A01;

    public JQQ(Map map, boolean z) {
        C14360o3.A0B(map, 1);
        this.A00 = map;
        this.A01 = new AtomicBoolean(z);
    }

    public final void A00() {
        if (!this.A01.get()) {
        } else {
            throw AbstractC166987dD.A14("Do mutate preferences once returned to DataStore.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof JQQ) {
            return C14360o3.A0K(this.A00, ((JQQ) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC001800i.A0P(",\n", "{\n", "\n}", this.A00.entrySet(), C50288MIs.A00);
    }

    public final void A01(MT1 mt1, Object obj) {
        A00();
        if (obj == null) {
            A00();
            this.A00.remove(mt1);
            return;
        }
        boolean z = obj instanceof java.util.Set;
        Map map = this.A00;
        if (z) {
            obj = Collections.unmodifiableSet(AbstractC001800i.A0k((Iterable) obj));
            C14360o3.A07(obj);
        }
        map.put(mt1, obj);
    }

    public JQQ() {
        this(AbstractC166987dD.A1I(), true);
    }
}
