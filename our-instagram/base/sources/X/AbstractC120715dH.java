package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5dH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120715dH {
    public static final C84823qW A00(EnumC75383a5 enumC75383a5, List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C84823qW) next).A12 == enumC75383a5) {
                obj = next;
                break;
            }
        }
        return (C84823qW) obj;
    }
}
