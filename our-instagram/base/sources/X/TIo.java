package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TIo implements Iterable {
    public Map A00;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.A00;
        if (map == null) {
            return Collections.emptyList().iterator();
        }
        return AbstractC166997dE.A16(map);
    }
}
