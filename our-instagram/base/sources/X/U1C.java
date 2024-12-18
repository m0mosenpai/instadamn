package X;

import android.content.Context;
import android.graphics.PointF;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;

/* loaded from: classes11.dex */
public final class U1C extends C110814yt {
    public final /* synthetic */ FlowingGridLayoutManager A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1C(Context context, FlowingGridLayoutManager flowingGridLayoutManager) {
        super(context);
        this.A00 = flowingGridLayoutManager;
    }

    @Override // X.AbstractC110824yu
    public final PointF A00(int i) {
        FlowingGridLayoutManager flowingGridLayoutManager = this.A00;
        int A00 = FlowingGridLayoutManager.A00(flowingGridLayoutManager, i, 0);
        int i2 = flowingGridLayoutManager.A04;
        float f = 1.0f;
        if (A00 <= i2) {
            f = -1.0f;
        }
        return new PointF(0.0f, f);
    }
}
