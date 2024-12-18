package X;

import java.net.Inet4Address;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class TS9 implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC167017dG.A1N(obj, obj2);
        boolean z = obj2 instanceof Inet4Address;
        if (obj instanceof Inet4Address) {
            if (z) {
                return 0;
            }
            return -1;
        }
        if (!z) {
            return 0;
        }
        return 1;
    }
}
