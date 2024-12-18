package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.direct.HighlightRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Fcc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35065Fcc {
    public static final String A02(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return "one_to_one";
            }
            if (intValue == 2) {
                return "group";
            }
            if (intValue == 16) {
                return "secure_group";
            }
            if (intValue == 15) {
                return "secure_one_to_one";
            }
            return "unknown";
        }
        return "unknown";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    public static final ImmutableList A00(ImmutableList immutableList, int i) {
        if (!immutableList.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            int size = immutableList.size();
            for (int i2 = 0; i2 < size; i2++) {
                HighlightRange highlightRange = (HighlightRange) immutableList.get(i2);
                int i3 = highlightRange.A02;
                int i4 = i - 1;
                int min = Math.min(highlightRange.A00, i4);
                if (i2 != 0) {
                    HighlightRange highlightRange2 = (HighlightRange) A1E.get(A1E.size() - 1);
                    int i5 = highlightRange2.A00;
                    if (i5 == i4) {
                        break;
                    }
                    if (i5 >= i3) {
                        int max = Math.max(i5, min);
                        int size2 = A1E.size() - 1;
                        int i6 = highlightRange2.A02;
                        int i7 = (max - i6) + 1;
                        ?? obj = new Object();
                        obj.A02 = i6;
                        obj.A01 = i7;
                        obj.A00 = (i6 + i7) - 1;
                        A1E.set(size2, obj);
                    }
                }
                int i8 = (min - i3) + 1;
                ?? obj2 = new Object();
                obj2.A02 = i3;
                obj2.A01 = i8;
                obj2.A00 = (i3 + i8) - 1;
                A1E.add(obj2);
            }
            return ImmutableList.copyOf((Collection) A1E);
        }
        return immutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    public static final ImmutableList A01(String str) {
        List list;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (str != null) {
            if (str.length() != 0) {
                List A0h = AbstractC31175DnJ.A0h(str, "\\s+");
                if (!A0h.isEmpty()) {
                    ListIterator listIterator = A0h.listIterator(A0h.size());
                    while (listIterator.hasPrevious()) {
                        if (AbstractC31176DnK.A02(listIterator) != 0) {
                            list = AbstractC31177DnL.A0k(A0h, listIterator);
                            break;
                        }
                    }
                }
                list = C16930sl.A00;
                String[] A1b = AbstractC31173DnH.A1b(list, 0);
                for (int i = 0; i < A1b.length; i += 4) {
                    if (Integer.parseInt(A1b[i]) == 5) {
                        int parseInt = Integer.parseInt(A1b[i + 2]);
                        int parseInt2 = Integer.parseInt(A1b[i + 3]);
                        ?? obj = new Object();
                        obj.A02 = parseInt;
                        obj.A01 = parseInt2;
                        obj.A00 = (parseInt + parseInt2) - 1;
                        builder.add((Object) obj);
                    }
                }
            }
        }
        return AbstractC31172DnG.A0K(builder);
    }
}
