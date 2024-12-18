package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9MX, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9MX {
    public static final List A00 = Collections.emptyList();

    public static List A00(List list) {
        if (list != null && !list.isEmpty()) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        return A00;
    }
}
