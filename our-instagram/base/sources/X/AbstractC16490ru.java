package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16490ru extends AbstractC18310vI {
    public static final String A0p(String str) {
        int i;
        InterfaceC16660sJ c016406h;
        C14360o3.A0B(str, 0);
        List A0O = AbstractC001900j.A0O(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0O) {
            if (!AbstractC001900j.A0T((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int length = ((String) it.next()).length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (!C11K.A01(r4.charAt(i2))) {
                    if (i2 != -1) {
                    }
                } else {
                    i2++;
                }
            }
            i2 = length;
            arrayList2.add(Integer.valueOf(i2));
        }
        Number number = (Number) AbstractC001800i.A06(arrayList2);
        int i3 = 0;
        if (number != null) {
            i = number.intValue();
        } else {
            i = 0;
        }
        int length2 = str.length();
        int length3 = "".length();
        int size = length2 + (A0O.size() * length3);
        if (length3 == 0) {
            c016406h = C016506j.A00;
        } else {
            c016406h = new C016406h();
        }
        InterfaceC16660sJ interfaceC16660sJ = c016406h;
        int size2 = A0O.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : A0O) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            String str2 = (String) obj2;
            if ((i3 != 0 && i3 != size2) || !AbstractC001900j.A0T(str2)) {
                Object invoke = interfaceC16660sJ.invoke(C00Q.A02(str2, i));
                Object obj3 = str2;
                if (invoke == null) {
                    if (str2 == null) {
                    }
                } else {
                    obj3 = invoke;
                }
                arrayList3.add(obj3);
            }
            i3 = i4;
        }
        StringBuilder sb = new StringBuilder(size);
        AbstractC001800i.A0q(sb, "\n", "", "", arrayList3, null);
        String obj4 = sb.toString();
        C14360o3.A07(obj4);
        return obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static final String A0q(String str, String str2) {
        InterfaceC16660sJ c016406h;
        C14360o3.A0B(str, 0);
        if (!AbstractC001900j.A0T(str2)) {
            List A0O = AbstractC001900j.A0O(str);
            int length = str.length();
            int length2 = "".length();
            int size = length + (A0O.size() * length2);
            if (length2 == 0) {
                c016406h = C016506j.A00;
            } else {
                c016406h = new C016406h();
            }
            InterfaceC16660sJ interfaceC16660sJ = c016406h;
            int size2 = A0O.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : A0O) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                ?? r3 = (String) obj;
                if ((i != 0 && i != size2) || !AbstractC001900j.A0T(r3)) {
                    int length3 = r3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length3) {
                            break;
                        }
                        if (!C11K.A01(r3.charAt(i3))) {
                            if (i3 != -1 && r3.startsWith(str2, i3)) {
                                String substring = r3.substring(i3 + str2.length());
                                C14360o3.A07(substring);
                                Object invoke = interfaceC16660sJ.invoke(substring);
                                if (invoke != null) {
                                    r3 = invoke;
                                }
                            }
                        } else {
                            i3++;
                        }
                    }
                    arrayList.add(r3);
                }
                i = i2;
            }
            StringBuilder sb = new StringBuilder(size);
            AbstractC001800i.A0q(sb, "\n", "", "", arrayList, null);
            String obj2 = sb.toString();
            C14360o3.A07(obj2);
            return obj2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }
}
