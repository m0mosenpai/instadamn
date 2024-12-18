package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179197xV {
    public final C1814082s A00 = new C1814082s();
    public final AtomicBoolean A01 = new AtomicBoolean();

    public static C180097yz A00(C179197xV c179197xV, InterfaceC179577y7 interfaceC179577y7) {
        List list = c179197xV.A00.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C180097yz c180097yz = (C180097yz) list.get(i);
            if (c180097yz.A00 == interfaceC179577y7) {
                return c180097yz;
            }
        }
        return null;
    }
}
