package X;

import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: X.0sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16830sb extends AbstractC10090gM {
    public static final HashSet A05(Object... objArr) {
        HashSet hashSet = new HashSet(AbstractC16850sd.A0L(objArr.length));
        AbstractC009903n.A0M(hashSet, objArr);
        return hashSet;
    }

    public static final java.util.Set A06(Object... objArr) {
        C14360o3.A0B(objArr, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC16850sd.A0L(objArr.length));
        AbstractC009903n.A0M(linkedHashSet, objArr);
        return linkedHashSet;
    }

    public static final java.util.Set A07(Object... objArr) {
        C14360o3.A0B(objArr, 0);
        return AbstractC009903n.A0K(objArr);
    }
}
