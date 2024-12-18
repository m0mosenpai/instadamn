package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class QAa extends QAe {
    public final SOT A00;

    public QAa(List list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            SOT sot = (SOT) ((C63366SiP) list.get(i2)).A0E;
            if (sot != null) {
                i = Math.max(i, sot.A01.length);
            }
        }
        this.A00 = new SOT(new float[i], new int[i]);
    }
}
