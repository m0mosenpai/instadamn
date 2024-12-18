package X;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.ROp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60730ROp extends VK4 {
    public final int A00;
    public final Object A01;

    @Override // X.VK4
    public final void A01(View view, float f) {
    }

    public C60730ROp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.VK4
    public final void A02(View view, int i) {
        switch (this.A00) {
            case 2:
                if (i != 5) {
                    return;
                }
                C58766Q7v c58766Q7v = (C58766Q7v) this.A01;
                FragmentActivity activity = c58766Q7v.getActivity();
                if (activity != null) {
                    activity.setResult(0, C58766Q7v.A00(null, c58766Q7v, null, C05F.A0C, null, null, null, null, null));
                }
                FragmentActivity activity2 = c58766Q7v.getActivity();
                if (activity2 == null) {
                    return;
                }
                activity2.finish();
                return;
            case 3:
                if (i != 5) {
                    return;
                }
                Dialog dialog = (Dialog) this.A01;
                dialog.cancel();
                return;
            default:
                if (i != 5 || (dialog = ((C0SG) this.A01).A01) == null) {
                    return;
                }
                dialog.cancel();
                return;
        }
    }
}
