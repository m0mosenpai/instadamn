package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5TU, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5TU {
    public static final AtomicBoolean A01 = new AtomicBoolean(false);
    public static final AtomicBoolean A00 = new AtomicBoolean(false);

    public static final void A00() {
        if (A01.compareAndSet(false, true)) {
            Integer num = C05F.A00;
            C24721Ip c24721Ip = new C24721Ip(1);
            C19K A02 = AnonymousClass194.A02((C12W) AnonymousClass572.A0B.getValue());
            AbstractC23641Du.A03(num, AnonymousClass191.A00, new C9DH(null, c24721Ip), A02);
            C206999Ee c206999Ee = new C206999Ee(c24721Ip, 9);
            synchronized (AbstractC75013Yr.A07) {
                AbstractC75013Yr.A03 = AbstractC001800i.A0T(c206999Ee, AbstractC75013Yr.A03);
            }
            AbstractC75013Yr.A0A(C5TV.A00);
        }
    }
}
