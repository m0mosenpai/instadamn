package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Exp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33887Exp {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        Object obj = list.get(0);
        Object obj2 = list.get(1);
        Object obj3 = list.get(2);
        C3DN A0r = AbstractC31172DnG.A0r(C6BQ.A04(c6fq));
        if (A0r != null) {
            C34726FRp A07 = C28531Zo.A04.A02.A07(C6BQ.A08(c6fq), AbstractC31172DnG.A0W(c6fq), C2EY.A0r);
            obj.getClass();
            String str = (String) obj;
            obj2.getClass();
            String str2 = (String) obj2;
            obj3.getClass();
            String str3 = (String) obj3;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            C14360o3.A0B(str3, 2);
            Bundle bundle = A07.A07;
            bundle.putString("DirectShareSheetConstants.referral_id", str);
            bundle.putString("DirectShareSheetConstants.referral_title", str2);
            bundle.putString("DirectShareSheetConstants.referral_title", str3);
            A0r.A0J(A07.A00());
            return null;
        }
        return null;
    }
}
