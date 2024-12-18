package X;

import android.util.SparseArray;
import com.google.common.base.Strings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2zN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66462zN {
    public SparseArray A00;
    public Map A01;
    public Map A02;

    private void A00(int i) {
        this.A01 = new HashMap((int) Math.ceil((i * 4.0d) / 3.0d), 0.75f);
        this.A00 = new SparseArray(i);
        this.A02 = new HashMap(i);
    }

    private void A01(AbstractC66422zJ abstractC66422zJ, Class cls, Integer num) {
        boolean z = !this.A01.containsKey(cls);
        StringBuilder sb = new StringBuilder();
        sb.append("Duplicate ModelClass ");
        sb.append(cls);
        sb.append(" in definition not allowed");
        C18C.A0H(z, sb.toString());
        this.A01.put(cls, abstractC66422zJ);
        boolean z2 = !this.A02.containsKey(cls);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Duplicate ModelClass ");
        sb2.append(cls);
        sb2.append(" in model-to-view-type map not allowed");
        C18C.A0H(z2, sb2.toString());
        this.A02.put(cls, num);
        this.A00.put(num.intValue(), abstractC66422zJ);
    }

    public final AbstractC66422zJ A02(int i) {
        AbstractC66422zJ abstractC66422zJ = (AbstractC66422zJ) this.A00.get(i);
        if (abstractC66422zJ != null) {
            return abstractC66422zJ;
        }
        throw new NullPointerException(Strings.A00("No definition corresponding to rawViewType %s was found", Integer.valueOf(i)));
    }

    public C66462zN(Map map) {
        A00(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Integer num = (Integer) entry.getKey();
            AbstractC66422zJ abstractC66422zJ = (AbstractC66422zJ) entry.getValue();
            A01(abstractC66422zJ, abstractC66422zJ.modelClass(), num);
        }
    }

    public C66462zN(List list) {
        A00(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC66422zJ abstractC66422zJ = (AbstractC66422zJ) it.next();
            A01(abstractC66422zJ, abstractC66422zJ.modelClass(), Integer.valueOf(i));
            i++;
        }
    }
}
