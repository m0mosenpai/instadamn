package X;

import android.content.Context;
import com.instagram.creation.fragment.ManageDraftsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KEC extends C7E1 {
    public boolean A00;
    public final ArrayList A01 = AbstractC166987dD.A1E();
    public final ArrayList A02 = AbstractC166987dD.A1E();
    public final Map A03 = AbstractC166987dD.A1G();
    public final KEY A04;

    public KEC(Context context, C189038Yt c189038Yt, ManageDraftsFragment manageDraftsFragment) {
        KEY key = new KEY(context, c189038Yt, manageDraftsFragment);
        this.A04 = key;
        A0B(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Kyy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    public static void A00(KEC kec) {
        kec.A06();
        Iterator it = kec.A01.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Map map = kec.A03;
            C47531Kyy c47531Kyy = (C47531Kyy) map.get(next);
            if (c47531Kyy == 0) {
                c47531Kyy = new Object();
                map.put(next, c47531Kyy);
            }
            c47531Kyy.A00 = kec.A00;
            c47531Kyy.A01 = kec.A02.contains(next);
            kec.A09(kec.A04, next, c47531Kyy);
        }
        kec.A07();
    }
}
