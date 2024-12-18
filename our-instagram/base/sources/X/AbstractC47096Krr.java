package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Krr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47096Krr {
    public static Drawable A00(Context context, InterfaceC11380iw interfaceC11380iw, Boolean bool, List list, int i, int i2) {
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (list.size() == 1) {
                return new C89533yt(AbstractC25225BEi.A0t(AbstractC25226BEj.A1I(list, 0)), interfaceC11380iw.getModuleName(), AbstractC166997dE.A04(context, i), 0, 0, 0);
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            while (i3 < list.size()) {
                A1E.add(AbstractC25225BEi.A0t(AbstractC25226BEj.A1I(list, i3)));
                i3++;
                if (i3 >= 3) {
                    break;
                }
            }
            L9I l9i = new L9I(context, interfaceC11380iw.getModuleName(), A1E, AbstractC166997dE.A04(context, i));
            l9i.A0G = true;
            l9i.A0B = bool.booleanValue();
            l9i.A01(AbstractC166997dE.A04(context, i2));
            l9i.A0D = true;
            return l9i.A00();
        }
        return null;
    }
}
