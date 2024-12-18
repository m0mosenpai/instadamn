package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149986or {
    public String A00;
    public final Object A02 = new Object();
    public List A01 = Collections.synchronizedList(new LinkedList());
    public final Map A08 = Collections.synchronizedMap(new HashMap());
    public final Map A06 = Collections.synchronizedMap(new HashMap());
    public final Map A07 = Collections.synchronizedMap(new HashMap());
    public final Map A05 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());

    public static void A00(StringBuilder sb, List list) {
        if (list != null && !list.isEmpty()) {
            synchronized (list) {
                Iterator it = list.iterator();
                sb.append((String) it.next());
                while (it.hasNext()) {
                    sb.append(" | ");
                    sb.append((String) it.next());
                }
            }
        }
    }
}
