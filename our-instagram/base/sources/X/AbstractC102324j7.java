package X;

import java.util.LinkedList;

/* renamed from: X.4j7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102324j7 extends AnonymousClass400 {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.TI1, java.lang.Object] */
    public final void A08(Object obj, String str) {
        C102314j6 c102314j6 = (C102314j6) this;
        ?? obj2 = new Object();
        obj2.A00 = -1;
        obj2.A03 = obj;
        if (str != null) {
            obj2.A02 = str;
            LinkedList linkedList = c102314j6.A00;
            if (linkedList == null) {
                linkedList = new LinkedList();
                c102314j6.A00 = linkedList;
            }
            if (linkedList.size() < 1000) {
                linkedList.addFirst(obj2);
                return;
            }
            return;
        }
        throw new NullPointerException("Cannot pass null fieldName");
    }
}
