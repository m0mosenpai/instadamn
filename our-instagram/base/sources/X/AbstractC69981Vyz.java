package X;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vyz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69981Vyz {
    public static final String A00(List list) {
        C14360o3.A0B(list, 0);
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C69159Vio c69159Vio = (C69159Vio) it.next();
            if (!z || !c69159Vio.A02) {
                if (c69159Vio.A00 || c69159Vio.A02) {
                    z = c69159Vio.A02;
                    sb.append(c69159Vio.A01);
                }
            }
        }
        return AbstractC166987dD.A19(sb);
    }

    public static final ArrayList A01(String str) {
        ArrayList arrayList = new ArrayList();
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        int first = wordInstance.first();
        while (true) {
            int next = wordInstance.next();
            int i = first;
            first = next;
            if (next != -1) {
                arrayList.add(new C69159Vio(AbstractC25227BEk.A0w(str, i, next)));
            } else {
                return arrayList;
            }
        }
    }
}
