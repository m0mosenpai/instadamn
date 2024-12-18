package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class MZZ implements Runnable {
    public final /* synthetic */ C31349DqE A00;
    public final /* synthetic */ C3O0 A01;

    public MZZ(C31349DqE c31349DqE, C3O0 c3o0) {
        this.A01 = c3o0;
        this.A00 = c31349DqE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3O0 c3o0 = this.A01;
        if (!c3o0.A0C) {
            ((C55982hj) c3o0.A0N.getValue()).A03();
            return;
        }
        List list = c3o0.A0K;
        C14360o3.A07(list);
        list.add(0, this.A00);
        c3o0.A09 = null;
        c3o0.A0B = C05F.A00;
    }
}
