package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes11.dex */
public final class UEI extends C02V {
    public final int A00;
    public final Object A01;

    public UEI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Integer num;
        switch (this.A00) {
            case 0:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setRoleDescription("Button");
                return;
            case 1:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setTraversalAfter((View) this.A01);
                super.A0Y(view, accessibilityNodeInfoCompat);
                return;
            case 2:
            case 3:
            default:
                boolean A1a = AbstractC167017dG.A1a(view, accessibilityNodeInfoCompat);
                Context context = ((View) this.A01).getContext();
                if (context != null) {
                    String string = context.getString(2131963468);
                    Integer[] A00 = C05F.A00(33);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (!AbstractC58462m5.A00(num).equals(string)) {
                                i++;
                            }
                        } else {
                            num = C05F.A00;
                        }
                    }
                    AbstractC56952jT.A05(accessibilityNodeInfoCompat, num);
                }
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setHeading(A1a);
                return;
            case 4:
                boolean A1a2 = AbstractC167017dG.A1a(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                boolean z = true;
                accessibilityNodeInfoCompat.mInfo.setCheckable(A1a2);
                C36731GHa c36731GHa = (C36731GHa) this.A01;
                accessibilityNodeInfoCompat.mInfo.setChecked(c36731GHa.A0D);
                if (c36731GHa.A0E || c36731GHa.A0F) {
                    z = false;
                }
                accessibilityNodeInfoCompat.setEnabled(z);
                AbstractC56952jT.A05(accessibilityNodeInfoCompat, C05F.A04);
                return;
            case 5:
                super.A0Y(view, accessibilityNodeInfoCompat);
                C012804r c012804r = C012804r.A08;
                accessibilityNodeInfoCompat.addAction(new C012804r(16, ((EXV) this.A01).A00.getString(2131952040)));
                return;
        }
    }
}
