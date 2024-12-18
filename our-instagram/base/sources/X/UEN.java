package X;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes11.dex */
public final class UEN extends C02V {
    public final /* synthetic */ DialogC51582Yg A00;

    public UEN(DialogC51582Yg dialogC51582Yg) {
        this.A00 = dialogC51582Yg;
    }

    @Override // X.C02V
    public final boolean A0V(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            DialogC51582Yg dialogC51582Yg = this.A00;
            if (dialogC51582Yg.A0C) {
                dialogC51582Yg.A06(C05F.A0N);
                return true;
            }
        }
        return super.A0V(view, i, bundle);
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z;
        super.A0Y(view, accessibilityNodeInfoCompat);
        if (this.A00.A0C) {
            accessibilityNodeInfoCompat.addAction(1048576);
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfoCompat.mInfo.setDismissable(z);
    }
}
