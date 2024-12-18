package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes11.dex */
public final class V86 extends C3CI {
    public final C64312vq A00;
    public final RecyclerView A01;
    public final List A02;

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtJ(Object obj, int i) {
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        this.A00.Dwd(null, c38321qM, i, 0, 0);
    }

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        View A0d;
        C14360o3.A0B(c3ab, 0);
        AbstractC70663Fe abstractC70663Fe = this.A01.A0D;
        if (abstractC70663Fe != null && (A0d = abstractC70663Fe.A0d(i)) != null && VTJ.A00(A0d, 0.001d)) {
            C38321qM c38321qM = (C38321qM) this.A02.get(i);
            String id = c38321qM.getId();
            if (id != null) {
                c3ab.FDo(id, c38321qM, i);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.C36Z
    public final Class CAO() {
        return C38321qM.class;
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtH(Object obj) {
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        this.A00.Dwc(c38321qM);
    }

    public V86(RecyclerView recyclerView, C64312vq c64312vq, List list) {
        this.A02 = list;
        this.A01 = recyclerView;
        this.A00 = c64312vq;
    }
}
