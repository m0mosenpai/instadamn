package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CG1 {
    public static final List A00(Context context, List list) {
        Integer num;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CS7 cs7 = (CS7) it.next();
            String A0p = AbstractC166997dE.A0p(context, cs7.A02.A00);
            Drawable drawable = context.getDrawable(cs7.A01.A00);
            Integer num2 = cs7.A00.A00;
            if (num2 != null) {
                num = Integer.valueOf(AbstractC53242c7.A0H(context, num2.intValue()));
            } else {
                num = null;
            }
            A0q.add(new C199928sw(null, drawable, null, new G85(cs7, 3), num, A0p, 0, 0, 0, false, false, false, true, false, false, false));
        }
        return AbstractC001800i.A0a(A0q);
    }
}
