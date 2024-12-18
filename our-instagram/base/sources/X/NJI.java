package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NJI extends AbstractC51004MgB {
    public final C54395O2b A00;

    public NJI(C54395O2b c54395O2b, long j) {
        super(j, 0);
        Object value;
        C38688GzT c38688GzT;
        List list;
        this.A00 = c54395O2b;
        C05A c05a = this.A06;
        do {
            value = c05a.getValue();
            MUG mug = (MUG) c05a.getValue();
            c38688GzT = (C38688GzT) mug.A00;
            list = (List) mug.A03;
            AbstractC167007dF.A1D(c38688GzT, 1, list);
        } while (!c05a.AIi(value, new MUG(c38688GzT, list, true)));
        PZT.A03(this, AbstractC141776au.A00(this), 9);
    }
}
