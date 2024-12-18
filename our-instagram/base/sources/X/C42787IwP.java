package X;

import android.graphics.RectF;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.IwP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42787IwP implements InterfaceC140686Xw {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ ReelDashboardFragment A01;

    public C42787IwP(RectF rectF, ReelDashboardFragment reelDashboardFragment) {
        this.A01 = reelDashboardFragment;
        this.A00 = rectF;
    }

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
        ReelDashboardFragment.A04(this.A00, this.A01, f);
    }

    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        ReelDashboardFragment reelDashboardFragment = this.A01;
        if (!reelDashboardFragment.isResumed()) {
            onCancel();
        } else {
            reelDashboardFragment.A0F = true;
            ReelDashboardFragment.A0B(reelDashboardFragment);
        }
    }

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
        ReelDashboardFragment.A04(this.A00, this.A01, 0.0f);
    }
}
