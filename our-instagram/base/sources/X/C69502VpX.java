package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.VpX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69502VpX {
    public final void A00(U44 u44, Ut4 ut4) {
        String A0G;
        C14360o3.A0B(u44, 1);
        Object A06 = AnonymousClass634.A06(ut4.A01, ut4.A02);
        A06.getClass();
        String str = ((C70692WfE) A06).A03;
        List list = u44.A02;
        C14360o3.A06(list);
        if (str.length() != 0) {
            Locale locale = Locale.US;
            C14360o3.A08(locale);
            String lowerCase = str.toLowerCase(locale);
            ArrayList A10 = AbstractC31174DnI.A10(lowerCase);
            for (Object obj : list) {
                C102884kP A08 = ((U48) obj).A01.A08(132);
                if (A08 != null && (A0G = A08.A0G()) != null) {
                    String lowerCase2 = A0G.toLowerCase(locale);
                    C14360o3.A07(lowerCase2);
                    if (AbstractC001900j.A0a(lowerCase2, lowerCase, false)) {
                        A10.add(obj);
                    }
                }
            }
            list = A10;
        }
        ut4.A00.A02(new U44(list, u44.A01, u44.A00));
    }
}
