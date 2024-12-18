package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes7.dex */
public abstract class I7U {
    public static final C189468aQ A00(Context context, View.OnClickListener onClickListener, Integer num) {
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A05 = onClickListener;
        c189458aP.A01(I7T.A00(context, num));
        c189458aP.A0A = true;
        c189458aP.A04 = new U8S(context, num);
        return c189458aP.A00();
    }
}
