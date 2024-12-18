package X;

import android.content.Context;
import java.util.Date;
import java.util.EnumMap;

/* renamed from: X.Kry, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47103Kry {
    public static final String A00(Context context, int i, int i2) {
        String A0t;
        long j = i * 1000;
        Date date = new Date(j);
        EnumMap enumMap = new EnumMap(EnumC89613z1.class);
        C23831Eq.A0G(new Date(System.currentTimeMillis()), date, enumMap);
        enumMap.get(EnumC89613z1.A03);
        EnumC89613z1 enumC89613z1 = EnumC89613z1.A04;
        int A03 = AbstractC31177DnL.A03(AbstractC31171DnF.A0W(enumC89613z1, enumMap));
        EnumC89613z1 enumC89613z12 = EnumC89613z1.A06;
        int A032 = AbstractC31177DnL.A03(AbstractC31171DnF.A0W(enumC89613z12, enumMap));
        Date date2 = new Date(System.currentTimeMillis());
        Date date3 = new Date(j + (i2 * 1000));
        EnumMap enumMap2 = new EnumMap(EnumC89613z1.class);
        C23831Eq.A0G(date2, date3, enumMap2);
        int A0K = AbstractC167017dG.A0K(AbstractC31171DnF.A0W(enumC89613z1, enumMap2));
        int A0K2 = AbstractC167017dG.A0K(AbstractC31171DnF.A0W(enumC89613z12, enumMap2));
        if (A0K <= 0 && A0K2 <= 0) {
            A0t = context.getString(2131964480);
        } else {
            if (A03 <= 0) {
                A03 = 0;
            }
            A0t = AbstractC31174DnI.A0t(context, Integer.valueOf(A03), Integer.valueOf(A032), 2131964479);
        }
        C14360o3.A07(A0t);
        return A0t;
    }
}
