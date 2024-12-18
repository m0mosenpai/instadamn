package X;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* renamed from: X.390, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass390 {
    public final Map A00;
    public final Map A01;

    public AnonymousClass390(Map map, Map map2) {
        this.A01 = map;
        this.A00 = map2;
    }

    public final void A00(Bitmap bitmap, C38321qM c38321qM, String str) {
        List<C3YL> list = (List) this.A01.remove(c38321qM.A38());
        if (list != null) {
            for (C3YL c3yl : list) {
                boolean z = false;
                if (bitmap != null) {
                    z = true;
                }
                C3BJ c3bj = c3yl.A01;
                String A38 = c3yl.A00.A38();
                if (A38 != null) {
                    C3BJ.A00(null, c3bj, A38, str, null, z);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }
}
