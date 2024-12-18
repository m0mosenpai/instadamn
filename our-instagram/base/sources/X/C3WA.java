package X;

import android.view.ViewStub;
import com.facebook.litho.LithoView;

/* renamed from: X.3WA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WA implements C33R {
    public ViewStub A00;
    public LithoView A01;
    public C75113Zb A02;

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        LithoView lithoView;
        boolean z;
        C14360o3.A0B(c75113Zb, 0);
        if (c75113Zb.equals(this.A02) && (lithoView = this.A01) != null) {
            int i2 = 8;
            if (i != 10) {
                if (i == 58) {
                    z = c75113Zb.A1z;
                } else {
                    return;
                }
            } else {
                z = c75113Zb.A1y;
            }
            if (!z) {
                i2 = 0;
            }
            lithoView.setVisibility(i2);
        }
    }
}
