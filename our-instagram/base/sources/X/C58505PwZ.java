package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PwZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58505PwZ implements C0SW, InterfaceC05750Sb {
    public static final C58505PwZ A00 = new Object();
    public static final List A01;

    @Override // X.InterfaceC05750Sb
    public final boolean AFa(C0SJ c0sj, int i, int i2) {
        List<C58506Pwa> list = A01;
        if (!list.isEmpty()) {
            for (C58506Pwa c58506Pwa : list) {
                C46h c46h = (C46h) c58506Pwa.A00.get();
                Object BYU = c0sj.BYU(c58506Pwa.A01, 1);
                if (BYU != null) {
                    if (!BYU.equals(c46h)) {
                        return true;
                    }
                } else if (c46h instanceof C4JL) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC05750Sb
    public final void AVF(AbstractC10380h5 abstractC10380h5, int i, int i2) {
    }

    @Override // X.InterfaceC05750Sb
    public final boolean Eic(int i, int i2) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.PwZ, java.lang.Object] */
    static {
        ArrayList A17 = AbstractC25225BEi.A17(1);
        C58506Pwa c58506Pwa = C58506Pwa.A02;
        C14360o3.A07(c58506Pwa);
        c58506Pwa.A01 = 196608;
        A17.add(c58506Pwa);
        A01 = A17;
    }

    @Override // X.InterfaceC05750Sb
    public final void AVG(AbstractC10380h5 abstractC10380h5, C0SJ c0sj, int i, int i2) {
        for (C58506Pwa c58506Pwa : A01) {
            C46h A002 = c58506Pwa.A00(c0sj);
            if (A002 instanceof C4JL) {
                AbstractC10380h5.A00(abstractC10380h5, A002, c58506Pwa.A01);
            }
        }
    }

    @Override // X.C0SW
    public final Integer CAQ() {
        if (!(!A01.isEmpty())) {
            return C05F.A0C;
        }
        return C05F.A01;
    }

    @Override // X.InterfaceC05750Sb
    public final boolean Eid(C0SJ c0sj, int i, int i2) {
        return !A01.isEmpty();
    }
}
