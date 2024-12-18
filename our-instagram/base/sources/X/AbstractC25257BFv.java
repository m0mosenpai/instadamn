package X;

import java.util.List;

/* renamed from: X.BFv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25257BFv {
    public static final void A00(BFo bFo, C25261BFz c25261BFz) {
        long j;
        if (!bFo.A0C && bFo.A0B) {
            c25261BFz.A01();
        }
        if (!AbstractC25253BFp.A02(bFo)) {
            List list = bFo.A02;
            if (list == null) {
                list = C16930sl.A00;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                BG3 bg3 = (BG3) list.get(i);
                c25261BFz.A02(bg3.A02, bg3.A00);
            }
            j = bFo.A0A;
            c25261BFz.A02(j, bFo.A00);
        } else {
            j = bFo.A0A;
            if (j - c25261BFz.A00 > 40) {
                c25261BFz.A01();
            }
        }
        c25261BFz.A00 = j;
    }
}
