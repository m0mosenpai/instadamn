package X;

import android.content.Context;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class Xz7 {
    public static final Map A00 = AbstractC166987dD.A1I();

    public static final void A00(Context context, EnumC72358Xbu enumC72358Xbu, C72737Xm9 c72737Xm9) {
        Map map = A00;
        if (!map.containsKey(enumC72358Xbu)) {
            map.put(enumC72358Xbu, new Y09(new C13270mD(context, 0), c72737Xm9));
            Y09 y09 = (Y09) map.get(enumC72358Xbu);
            if (y09 != null) {
                Y09.A00(c72737Xm9, y09, y09.A03);
            }
        }
    }
}
