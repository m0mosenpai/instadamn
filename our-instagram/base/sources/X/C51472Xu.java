package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.util.List;

/* renamed from: X.2Xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51472Xu extends AbstractC51462Xt {
    public final int A00;

    @Override // X.AbstractC51462Xt
    public final AbstractC107474ss A03(List list) {
        return new C107584t3(this.A00, list);
    }

    public C51472Xu(List list) {
        super(list);
        this.A00 = 0;
    }

    public C51472Xu(AbstractC51432Xq[] abstractC51432XqArr, int i) {
        super(abstractC51432XqArr);
        this.A00 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
    }

    public C51472Xu(AbstractC51432Xq... abstractC51432XqArr) {
        super(abstractC51432XqArr);
        this.A00 = 0;
    }
}
