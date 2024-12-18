package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C87973w5 {
    public static C87973w5 A02 = new C87973w5();
    public final List A00 = new ArrayList();
    public final AtomicBoolean A01 = new AtomicBoolean(true);

    public final void A00(InterfaceC100294er interfaceC100294er) {
        List list = this.A00;
        synchronized (list) {
            list.add(interfaceC100294er);
        }
    }
}
