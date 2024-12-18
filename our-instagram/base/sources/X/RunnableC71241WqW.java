package X;

import android.view.View;

/* renamed from: X.WqW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71241WqW implements Runnable {
    public final /* synthetic */ UDc A00;

    public RunnableC71241WqW(UDc uDc) {
        this.A00 = uDc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UDc uDc = this.A00;
        AbstractC65702TsY.A12(uDc, uDc.getHeight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(uDc.getWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        uDc.layout(uDc.getLeft(), uDc.getTop(), uDc.getRight(), uDc.getBottom());
    }
}
