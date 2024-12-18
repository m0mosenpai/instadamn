package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209419Oa {
    public final Context A00;
    public final C2PY A01;
    public final C48k A02;
    public final C8KP A03;
    public final C49602Pt A04;
    public final C53752Nq4 A05;

    public C209419Oa(Context context, C53752Nq4 c53752Nq4, C2PY c2py, C48k c48k, C8KP c8kp, C49602Pt c49602Pt) {
        AbstractC167017dG.A1Q(context, c2py);
        C14360o3.A0B(c49602Pt, 7);
        this.A01 = c2py;
        this.A03 = c8kp;
        this.A05 = c53752Nq4;
        this.A02 = c48k;
        this.A04 = c49602Pt;
        this.A00 = context.getApplicationContext();
    }

    public static final A9U A00(List list, int i) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                A9U a9u = (A9U) obj;
                int i2 = a9u.A01;
                if (i <= a9u.A00 + i2 && i2 <= i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (A9U) obj;
    }
}
