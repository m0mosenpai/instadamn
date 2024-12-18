package X;

import android.graphics.Rect;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Tzy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66120Tzy {
    public int A01;
    public final InterfaceC153786vn A05;
    public final FlowingGridLayoutManager A06;
    public final List A07 = new ArrayList();
    public final Map A08 = new HashMap();
    public int A00 = -1;
    public int A02 = 3;
    public int[] A03 = new int[3];
    public int[] A04 = new int[3];

    public C66120Tzy(InterfaceC153786vn interfaceC153786vn, FlowingGridLayoutManager flowingGridLayoutManager, int i) {
        this.A06 = flowingGridLayoutManager;
        this.A05 = interfaceC153786vn;
        this.A01 = i;
    }

    public final Rect A00(int i) {
        if (i >= 0) {
            List list = this.A07;
            if (i < list.size()) {
                return (Rect) list.get(i);
            }
            return null;
        }
        return null;
    }

    public final void A01(int i) {
        int i2 = this.A00;
        if (i2 != -1) {
            if (i2 != 0) {
                this.A00 = Math.min(i2, i);
                return;
            }
            return;
        }
        throw new IllegalStateException("calculationStartPosition isn't already before granular notify!");
    }
}
