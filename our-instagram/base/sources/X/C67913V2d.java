package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.V2d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67913V2d extends C7E1 {
    public List A00;
    public C67925V2p A01;
    public final EQR A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.EQR, X.2y0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.V2p, java.lang.Object, X.2y0] */
    public C67913V2d(Context context, XA0 xa0, GYX gyx, List list) {
        this.A00 = list;
        ?? obj = new Object();
        obj.A00 = context;
        obj.A01 = xa0;
        this.A01 = obj;
        ?? obj2 = new Object();
        obj2.A00 = gyx;
        this.A02 = obj2;
        A0B(obj, obj2);
        A00(this);
    }

    public static void A00(C67913V2d c67913V2d) {
        c67913V2d.A06();
        c67913V2d.A08(c67913V2d.A02, null);
        int i = 0;
        while (true) {
            List list = c67913V2d.A00;
            if (i < list.size()) {
                c67913V2d.A08(c67913V2d.A01, list.get((list.size() - i) - 1));
                i++;
            } else {
                c67913V2d.A07();
                return;
            }
        }
    }
}
