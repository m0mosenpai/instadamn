package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9vW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224459vW {
    public static final LinkedHashMap A00(C62620SJd c62620SJd) {
        int i;
        List<C50627MWo> list = (List) c62620SJd.A0F.A00;
        if (list.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(AbstractC06950Ym.A1E(list, 10)));
        for (C50627MWo c50627MWo : list) {
            if (1 - AbstractC166987dD.A0H(c50627MWo.A00) != 0) {
                i = 357;
            } else {
                i = 319;
            }
            String A00 = MSV.A00(i);
            Locale locale = Locale.ROOT;
            String lowerCase = A00.toLowerCase(locale);
            C14360o3.A07(lowerCase);
            String lowerCase2 = AbstractC224449vV.A00((Integer) c50627MWo.A01).toLowerCase(locale);
            C14360o3.A07(lowerCase2);
            linkedHashMap.put(lowerCase, lowerCase2);
        }
        return linkedHashMap;
    }
}
