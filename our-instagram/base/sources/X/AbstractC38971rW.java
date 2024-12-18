package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.1rW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC38971rW {
    public static /* synthetic */ java.util.Set A00(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("duplicate element: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
