package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0LH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LH implements InterfaceC08240bm {
    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        return new ArrayList(Collections.singletonList(new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }

    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        C0OO c0oo;
        C0LW c0lw = C04X.A01;
        C0OP c0op = C0OP.A0Q;
        synchronized (c0lw.A03) {
            Iterator it = c0lw.A07.iterator();
            while (true) {
                if (it.hasNext()) {
                    c0oo = (C0OO) it.next();
                    if (C07580aX.class.isInstance(c0oo) && c0oo.BW2() == c0op) {
                        break;
                    }
                } else {
                    c0oo = null;
                    break;
                }
            }
        }
        C07580aX c07580aX = (C07580aX) c0oo;
        if (c07580aX != null) {
            c07580aX.A00();
        }
    }
}
