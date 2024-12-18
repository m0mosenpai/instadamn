package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.76o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1578076o {
    public static final String A00(Context context, C161717Mg c161717Mg) {
        String str;
        int i;
        Object[] objArr;
        int i2;
        Object[] objArr2;
        int i3;
        Object[] objArr3;
        String string;
        C14360o3.A0B(context, 0);
        java.util.Set set = c161717Mg.A05;
        java.util.Set set2 = c161717Mg.A06;
        boolean z = c161717Mg.A0A;
        boolean z2 = c161717Mg.A0B;
        boolean z3 = c161717Mg.A07;
        boolean z4 = c161717Mg.A0D;
        boolean z5 = c161717Mg.A0C;
        int i4 = c161717Mg.A00;
        C1578176p c1578176p = C1578176p.A00;
        C14360o3.A0B(set2, 2);
        C14360o3.A0B(c1578176p, 10);
        List A01 = AbstractC1578276q.A01(set);
        C01T.A1D(new ArrayList(set2), AbstractC1578276q.A00);
        if (z3) {
            return AbstractC1578276q.A00(context, i4);
        }
        if (!z2) {
            set2.isEmpty();
            if (set != null && !set.isEmpty()) {
                return AbstractC43644JSc.A01(context, ((C206419By) A01.get(0)).A00);
            }
            string = context.getString(2131958633);
        } else {
            if (z) {
                if (!A01.isEmpty()) {
                    set2.isEmpty();
                }
                if (A01.isEmpty()) {
                    set2.isEmpty();
                }
                if (!(!A01.isEmpty()) || !set2.isEmpty()) {
                    return "";
                }
                i3 = 2131958635;
                objArr3 = new Object[1];
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A01, 10));
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C206419By) it.next()).A02);
                }
                str = AbstractC001800i.A0P(", ", "", "", arrayList, null);
            } else {
                set2.isEmpty();
                if (A01.isEmpty()) {
                    return "";
                }
                int size = A01.size();
                str = ((C206419By) A01.get(0)).A02;
                if (size == 1) {
                    i3 = 2131958637;
                    objArr3 = new Object[1];
                } else {
                    if (z4) {
                        if (z5) {
                            if (size != 2) {
                                i2 = 2131958636;
                                objArr2 = new Object[]{str, ((C206419By) A01.get(1)).A02, Integer.valueOf(size - 2)};
                            }
                            i2 = 2131958639;
                            objArr2 = new Object[]{str, ((C206419By) A01.get(1)).A02};
                        } else {
                            i = 2131958639;
                            objArr = new Object[]{str, AnonymousClass001.A00('+', size - 1)};
                            String string2 = context.getString(i, objArr);
                            C14360o3.A07(string2);
                            return string2;
                        }
                    } else {
                        if (size != 2) {
                            i = 2131958636;
                            objArr = new Object[]{str, ((C206419By) A01.get(1)).A02, Integer.valueOf(size - 2)};
                            String string22 = context.getString(i, objArr);
                            C14360o3.A07(string22);
                            return string22;
                        }
                        i2 = 2131958639;
                        objArr2 = new Object[]{str, ((C206419By) A01.get(1)).A02};
                    }
                    String string3 = context.getString(i2, objArr2);
                    C14360o3.A0A(string3);
                    return string3;
                }
            }
            objArr3[0] = str;
            string = context.getString(i3, objArr3);
        }
        C14360o3.A07(string);
        return string;
    }
}
