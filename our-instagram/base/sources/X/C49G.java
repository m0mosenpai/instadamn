package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.49G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49G {
    public final SharedPreferences A00;
    public final C0JM A01;
    public final String A02;
    public final String A03;

    public C49G(SharedPreferences sharedPreferences, String str, String str2) {
        C14360o3.A0B(str, 1);
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        this.A00 = sharedPreferences;
        this.A01 = c03250Di;
        if (str2.length() == 0) {
            throw new IllegalStateException("surfaceId cannot be empty");
        }
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A03(Integer num, String str) {
        Integer num2;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    num2 = C05F.A1F;
                } else {
                    num2 = C05F.A0u;
                }
            } else {
                num2 = C05F.A0Y;
            }
        } else {
            num2 = C05F.A0C;
        }
        return this.A00.getInt(A00(this, num2, str), 0);
    }

    public static final void A01(C49G c49g, Integer num) {
        String A0C = AnonymousClass001.A0C(c49g.A03, '/');
        String A0D = AnonymousClass001.A0D(C5OS.A00(num), '/');
        SharedPreferences sharedPreferences = c49g.A00;
        java.util.Set<String> keySet = sharedPreferences.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (String str : keySet) {
            String str2 = str;
            C14360o3.A0A(str2);
            if (AbstractC002300n.A0h(str2, A0C, false) && AbstractC002300n.A0f(str2, A0D, false)) {
                arrayList.add(str);
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    public static final String A00(C49G c49g, Integer num, String str) {
        if (str.length() == 0) {
            throw new IllegalStateException("promotionId cannot be empty");
        }
        return AnonymousClass001.A0T(c49g.A03, AnonymousClass001.A0T(str, C5OS.A00(num), '/'), '/');
    }

    public static final void A02(C49G c49g, Integer num, Integer num2, Integer num3, String str) {
        String A00 = A00(c49g, num, str);
        String A002 = A00(c49g, num2, str);
        long now = c49g.A01.now();
        SharedPreferences sharedPreferences = c49g.A00;
        SharedPreferences.Editor putLong = sharedPreferences.edit().putInt(A00, sharedPreferences.getInt(A00, 0) + 1).putLong(A002, now);
        if (num3 != null) {
            putLong.putLong(AnonymousClass001.A0T(c49g.A03, AnonymousClass001.A0T(c49g.A02, C5OS.A00(num3), '/'), '/'), now);
        }
        putLong.apply();
    }
}
