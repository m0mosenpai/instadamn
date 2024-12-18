package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.9zG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226589zG {
    public static final C66646URk A00(C194808jg c194808jg) {
        C5RU c5ru;
        Drawable A04 = c194808jg.A04();
        if ((A04 instanceof C5RU) && (c5ru = (C5RU) A04) != null) {
            C66646URk A05 = c5ru.A05();
            int A042 = c5ru.A04();
            C6S5 A06 = c5ru.A06();
            List list = A05.A07;
            int i = A05.A01;
            VES ves = A05.A02;
            Integer num = A05.A09;
            String str = A05.A06;
            boolean z = A05.A08;
            Integer num2 = A05.A05;
            Integer num3 = A05.A04;
            AbstractC167017dG.A1O(list, ves);
            C14360o3.A0B(A06, 4);
            return new C66646URk(ves, A06, num, num2, num3, str, list, i, A042, z);
        }
        return null;
    }
}
