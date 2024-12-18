package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: X.RNa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60698RNa extends T6D implements Serializable {
    public transient int A00;
    public transient Map A01;

    public final List A00(Object obj, Collection collection) {
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new RNW(null, this, obj, list);
        }
        return new RNW(null, this, obj, list);
    }
}
