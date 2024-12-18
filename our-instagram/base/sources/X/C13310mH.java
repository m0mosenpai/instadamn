package X;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0mH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13310mH {
    public volatile Object A00;
    public volatile CountDownLatch A02 = new CountDownLatch(1);
    public volatile ArrayList A01 = new ArrayList();

    public final void A00(InterfaceC13300mG interfaceC13300mG) {
        if (this.A02.getCount() == 0) {
            interfaceC13300mG.run(this.A00);
        } else {
            this.A01.add(interfaceC13300mG);
        }
    }
}
