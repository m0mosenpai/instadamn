package X;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176867ti {
    public static final C176877tj A01 = new C176877tj(1280, 720);
    public static final C176877tj A00 = new C176877tj(1920, 1080);

    public static List A02(Size[] sizeArr) {
        int length;
        if (sizeArr != null && (length = sizeArr.length) != 0) {
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            do {
                arrayList.add(new C176877tj(sizeArr[i].getWidth(), sizeArr[i].getHeight()));
                i++;
            } while (i < length);
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public static ArrayList A00(List list, List list2) {
        HashSet hashSet;
        if (list.size() < list2.size()) {
            hashSet = new HashSet(list);
            list = list2;
        } else {
            hashSet = new HashSet(list2);
        }
        int size = list.size();
        int size2 = hashSet.size();
        ArrayList arrayList = new ArrayList(size2);
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (hashSet.contains(obj)) {
                arrayList.add(obj);
                if (arrayList.size() == size2) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static List A01(C176877tj c176877tj, List list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            C176877tj c176877tj2 = (C176877tj) list.get(i);
            int i2 = c176877tj2.A02;
            int i3 = c176877tj.A02;
            if ((i2 <= i3 && c176877tj2.A01 <= c176877tj.A01) || (c176877tj2.A02 <= c176877tj.A01 && c176877tj2.A01 <= i3)) {
                arrayList.add(c176877tj2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
