package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.LFy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47944LFy {
    public static final Map A03 = new WeakHashMap();
    public final WeakReference A02;
    public final List A01 = AbstractC166987dD.A1E();
    public boolean A00 = false;

    public final void A00(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((Reference) it.next()).get();
                it.remove();
            }
        }
    }

    public C47944LFy(Context context) {
        this.A02 = AbstractC25225BEi.A16(context);
    }
}
