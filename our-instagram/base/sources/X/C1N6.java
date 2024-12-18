package X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1N6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1N6 {
    public final Map A00 = Collections.synchronizedMap(new LinkedHashMap());

    public final ArrayList A00() {
        ArrayList arrayList;
        Map map = this.A00;
        C14360o3.A06(map);
        synchronized (map) {
            arrayList = new ArrayList(map.values());
        }
        return arrayList;
    }

    public final void A01(Reel reel) {
        Map map = this.A00;
        C14360o3.A06(map);
        map.put(reel.getId(), reel);
    }

    public final void A02(Reel reel) {
        Map map = this.A00;
        ArrayList arrayList = new ArrayList(map.values());
        map.clear();
        map.put(reel.getId(), reel);
        Iterator it = arrayList.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Reel reel2 = (Reel) it.next();
            map.put(reel2.getId(), reel2);
        }
    }

    public final void A03(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            Map map = this.A00;
            C14360o3.A06(map);
            map.put(reel.getId(), reel);
        }
    }
}
