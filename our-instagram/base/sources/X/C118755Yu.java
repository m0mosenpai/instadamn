package X;

import java.util.List;

/* renamed from: X.5Yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118755Yu {
    public InterfaceC1131459c A00;
    public Integer A01;
    public final /* synthetic */ C118735Ys A02;

    public C118755Yu(C118735Ys c118735Ys) {
        this.A02 = c118735Ys;
        this.A01 = C05F.A00;
    }

    public static final void A00(C6KW c6kw, C118755Yu c118755Yu) {
        boolean z;
        List list = c6kw.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (((BFo) list.get(i)).A02()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            if (c118755Yu.A01 == C05F.A01) {
                InterfaceC1131459c interfaceC1131459c = c118755Yu.A00;
                if (interfaceC1131459c != null) {
                    CBK.A00(c6kw, new DRU(c118755Yu.A02, 31), interfaceC1131459c.Chn(0L), true);
                } else {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
            }
            c118755Yu.A01 = C05F.A0C;
            return;
        }
        InterfaceC1131459c interfaceC1131459c2 = c118755Yu.A00;
        if (interfaceC1131459c2 != null) {
            CBK.A00(c6kw, new C9F3(12, c118755Yu.A02, c118755Yu), interfaceC1131459c2.Chn(0L), false);
            if (c118755Yu.A01 != C05F.A01) {
                return;
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((BFo) list.get(i2)).A01();
            }
            C25256BFu c25256BFu = c6kw.A02;
            if (c25256BFu == null) {
                return;
            }
            c25256BFu.A00 = !r4.A02;
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set");
    }

    public C118755Yu() {
    }
}
