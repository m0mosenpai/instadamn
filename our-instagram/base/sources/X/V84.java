package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V84 extends C3CI {
    public final C67970V4j A00;
    public final RecyclerView A01;
    public final C3A6 A02;

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        float f;
        C14360o3.A0B(c3ab, 0);
        Object CAM = this.A02.CAM(i);
        if (CAM != null) {
            XLM xlm = (XLM) CAM;
            String id = xlm.getId();
            if (id != null) {
                c3ab.FDo(id, xlm, i);
            }
            RecyclerView recyclerView = this.A01;
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe != null) {
                double d = 1.0d;
                if (recyclerView.getChildAt(i - ((LinearLayoutManager) abstractC70663Fe).A1a()).getBottom() > recyclerView.getHeight()) {
                    d = 1.0d - ((r6.getBottom() - recyclerView.getHeight()) / r6.getHeight());
                }
                C67970V4j c67970V4j = this.A00;
                if (xlm.CBa() != VEO.A0D) {
                    Map map = c67970V4j.A07;
                    Number number = (Number) map.get(id);
                    if (number != null) {
                        f = number.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    if (d > f) {
                        if (id != null) {
                            map.put(id, Float.valueOf((float) d));
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C36Z
    public final Class CAO() {
        return XLM.class;
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtH(Object obj) {
        XLM xlm = (XLM) obj;
        C14360o3.A0B(xlm, 0);
        C67970V4j c67970V4j = this.A00;
        if (xlm.CBa() != VEO.A0D) {
            String id = xlm.getId();
            if (id != null) {
                c67970V4j.A02(id);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtJ(Object obj, int i) {
        XLM xlm = (XLM) obj;
        C14360o3.A0B(xlm, 0);
        C67970V4j c67970V4j = this.A00;
        if (xlm.CBa() != VEO.A0D) {
            long currentTimeMillis = System.currentTimeMillis();
            String id = xlm.getId();
            if (id != null) {
                c67970V4j.A05.put(id, new C68728Vb7(id, currentTimeMillis));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public V84(RecyclerView recyclerView, C67970V4j c67970V4j, C3A6 c3a6) {
        this.A02 = c3a6;
        this.A00 = c67970V4j;
        this.A01 = recyclerView;
    }
}
