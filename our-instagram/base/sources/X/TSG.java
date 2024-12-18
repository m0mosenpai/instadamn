package X;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TSG implements Comparator {
    public final /* synthetic */ Map A00;

    public TSG(Map map) {
        this.A00 = map;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC167017dG.A1N(str, str2);
        Map map = this.A00;
        List A12 = AbstractC43592JPx.A12(str2, map);
        int i2 = 0;
        if (A12 != null) {
            i = A12.size();
        } else {
            i = 0;
        }
        List A122 = AbstractC43592JPx.A12(str, map);
        if (A122 != null) {
            i2 = A122.size();
        }
        int i3 = i - i2;
        if (i3 == 0) {
            return str2.compareTo(str);
        }
        return i3;
    }
}
