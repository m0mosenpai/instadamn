package X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74043Tv {
    public static final AnonymousClass320 A01(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C41551w4) it.next()).A0H);
        }
        return A00(arrayList, list2, i);
    }

    public static final AnonymousClass320 A00(List list, List list2, int i) {
        String str;
        Reel reel = (Reel) AbstractC001800i.A0O(list, i);
        if (reel != null) {
            str = reel.getId();
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        int i2 = 0;
        while (it.hasNext()) {
            Reel reel2 = (Reel) it.next();
            String A0F = reel2.A0F();
            if (A0F != null) {
                if (C14360o3.A0K(reel2.getId(), str)) {
                    i2 = arrayList.size();
                }
                arrayList.add(A0F);
            }
            if (!z) {
                z = false;
                if (reel2.A1L) {
                }
            }
            z = true;
        }
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (AbstractC74053Tw.A04((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return new AnonymousClass320(arrayList, i, i2, z);
    }
}
