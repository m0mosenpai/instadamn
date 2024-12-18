package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: X.LsK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49386LsK implements C38N, C53Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ELG A01;

    @Override // X.C38N
    public final void DJj(View view, C38321qM c38321qM, int i) {
        List list;
        C14360o3.A0B(c38321qM, 0);
        ELG elg = this.A01;
        C47608L0t c47608L0t = (C47608L0t) ((C44499Jm5) elg.A0E.getValue()).A00.A02();
        if (c47608L0t != null && (list = c47608L0t.A01) != null) {
            int i2 = this.A00;
            C47758L7e c47758L7e = (C47758L7e) list.get(i2);
            if (c47758L7e != null) {
                YE3 ye3 = elg.A03;
                if (i >= 9) {
                    if (ye3 != null) {
                        ye3.A06("pro_inspiration_grid", "see_more", c47758L7e.A00().toString(), null);
                        ELG.A00(c47758L7e.A00(), elg, c38321qM, c47758L7e.A01, i2);
                        return;
                    }
                    C14360o3.A0F("logger");
                    throw C00O.createAndThrow();
                }
                if (ye3 != null) {
                    ye3.A07("pro_inspiration_grid", "grid_tile", c47758L7e.A00().toString(), String.valueOf(i), c38321qM.A38());
                    ELG.A00(c47758L7e.A00(), elg, c38321qM, c47758L7e.A01, i2);
                    return;
                }
                C14360o3.A0F("logger");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.C38N
    public final boolean DJk(MotionEvent motionEvent, View view, InterfaceC38411qV interfaceC38411qV, int i) {
        return false;
    }

    @Override // X.C53Q
    public final void DRt(C38321qM c38321qM, int i, int i2) {
    }

    @Override // X.C53Q
    public final void DRv(C38321qM c38321qM, int i, int i2) {
    }

    @Override // X.C53Q
    public final /* synthetic */ void Elp(View view, int i) {
    }

    public C49386LsK(ELG elg, int i) {
        this.A01 = elg;
        this.A00 = i;
    }
}
