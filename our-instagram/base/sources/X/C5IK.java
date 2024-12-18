package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5IK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5IK {
    public static final C5IK A00 = new Object();

    public final ArrayList A01(List list) {
        ArrayList arrayList = new ArrayList();
        char[] A002 = A00(list);
        int length = A002.length;
        for (int i = 0; i < length; i++) {
            if (A002[i] == '1') {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public static final char[] A00(List list) {
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            String num = Integer.toString(((Number) it.next()).intValue(), 2);
            C14360o3.A07(num);
            if (num.length() < 31) {
                num = AbstractC001900j.A0H(num, 31);
            }
            str = AnonymousClass001.A0R(str, num);
        }
        char[] charArray = str.toCharArray();
        C14360o3.A07(charArray);
        return charArray;
    }
}
