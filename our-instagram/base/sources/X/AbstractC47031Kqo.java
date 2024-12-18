package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kqo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47031Kqo {
    public static final String A00(Context context, List list, int i, boolean z) {
        int i2;
        Object obj;
        Object[] objArr;
        Object obj2;
        Object obj3;
        Object obj4;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC25226BEj.A15(it).getUsername());
        }
        int size = A0q.size();
        Object obj5 = "";
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            if (A0q.size() > 0) {
                obj5 = A0q.get(0);
            }
            return (String) obj5;
        }
        if (z) {
            i2 = 2131962834;
            if (A0q.size() > 0) {
                obj5 = A0q.get(0);
            }
            objArr = AbstractC25228BEl.A1Z(obj5, i);
        } else if (size == 2) {
            i2 = 2131962836;
            if (A0q.size() <= 0) {
                obj4 = "";
            } else {
                obj4 = A0q.get(0);
            }
            if (1 < A0q.size()) {
                obj5 = A0q.get(1);
            }
            objArr = new Object[]{obj4, obj5};
        } else if (size == 3) {
            i2 = 2131962835;
            if (A0q.size() <= 0) {
                obj2 = "";
            } else {
                obj2 = A0q.get(0);
            }
            if (1 >= A0q.size()) {
                obj3 = "";
            } else {
                obj3 = A0q.get(1);
            }
            if (2 < A0q.size()) {
                obj5 = A0q.get(2);
            }
            objArr = new Object[]{obj2, obj3, obj5};
        } else {
            i2 = 2131962833;
            if (A0q.size() <= 0) {
                obj = "";
            } else {
                obj = A0q.get(0);
            }
            if (1 < A0q.size()) {
                obj5 = A0q.get(1);
            }
            objArr = new Object[]{obj, obj5, Integer.valueOf(i)};
        }
        String string = context.getString(i2, objArr);
        C14360o3.A07(string);
        return string;
    }
}
