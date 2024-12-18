package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.35V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35V {
    public final Map A00 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();

    public final void A00(String str) {
        Map map = this.A02;
        List list = (List) map.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setTouchDelegate(null);
            }
        }
        map.remove(str);
    }
}
