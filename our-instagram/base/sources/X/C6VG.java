package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6VG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6VG extends C6VH {
    public final AtomicInteger A00 = new AtomicInteger();
    public volatile C3LV A01;

    public C3LV A01() {
        return ((C3LW) ((C6VF) this).A01).A00;
    }

    public InterfaceC58742mX A02() {
        return ((C6VF) this).A03;
    }

    public C6VK A04() {
        C6VF c6vf = (C6VF) this;
        C6VK c6vk = c6vf.A02;
        if (c6vk == null) {
            C6VK c6vk2 = new C6VK(c6vf.A00, c6vf.A04);
            c6vf.A02 = c6vk2;
            return c6vk2;
        }
        return c6vk;
    }

    public String A05() {
        return ((C6VF) this).A04;
    }

    public C6VO A03() {
        C6VN c6vn;
        synchronized (C6VN.class) {
            if (C6VN.A01 == null) {
                C6VN.A01 = new C6VN();
            }
            c6vn = C6VN.A01;
        }
        return c6vn;
    }
}
