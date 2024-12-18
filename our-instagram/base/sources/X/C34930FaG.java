package X;

import com.instagram.save.model.SavedCollection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.FaG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34930FaG {
    public final LinkedList A00 = new LinkedList();

    public static final synchronized int A00(C34930FaG c34930FaG, String str) {
        int i;
        synchronized (c34930FaG) {
            Iterator it = c34930FaG.A00.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    int i2 = i + 1;
                    if (C14360o3.A0K(((SavedCollection) it.next()).A0F, str)) {
                        break;
                    }
                    i = i2;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        return i;
    }
}
