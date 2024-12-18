package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.2jT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56952jT {
    public static void A01(View view) {
        A04(view, C05F.A01);
    }

    public static void A05(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Integer num) {
        if (num != null) {
            accessibilityNodeInfoCompat.setClassName(AbstractC58462m5.A00(num));
            if (!num.equals(C05F.A01) && !num.equals(C05F.A15)) {
                if (num.equals(C05F.A04) || num.equals(C05F.A06)) {
                    accessibilityNodeInfoCompat.mInfo.setCheckable(true);
                    return;
                }
                return;
            }
            accessibilityNodeInfoCompat.setClickable(true);
        }
    }

    public static Integer A00(View view) {
        Integer num;
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        view.onInitializeAccessibilityNodeInfo(obtain);
        CharSequence className = obtain.getClassName();
        if (className == null) {
            return C05F.A00;
        }
        String charSequence = className.toString();
        Integer[] A00 = C05F.A00(33);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                if (AbstractC58462m5.A00(num).equals(charSequence)) {
                    break;
                }
                i++;
            } else {
                num = C05F.A00;
                break;
            }
        }
        Integer num2 = C05F.A15;
        if (!num.equals(num2) && !num.equals(C05F.A0u)) {
            if (!num.equals(C05F.A00) || (collectionInfo = obtain.getCollectionInfo()) == null) {
                return num;
            }
            if (collectionInfo.getRowCount() > 1 && collectionInfo.getColumnCount() > 1) {
                return C05F.A0j;
            }
            return C05F.A1F;
        }
        if (obtain.isClickable()) {
            return num2;
        }
        return C05F.A0u;
    }

    public static void A02(View view, final CharSequence charSequence) {
        if (AbstractC010103p.A00(view) == null && charSequence != null) {
            AbstractC010103p.A0B(view, new C02V() { // from class: X.5or
                @Override // X.C02V
                public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.A0Y(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.addAction(new C012804r(16, charSequence));
                }
            });
        }
    }

    public static void A03(View view, final CharSequence charSequence) {
        if (AbstractC010103p.A00(view) == null && charSequence != null) {
            AbstractC010103p.A0B(view, new C02V() { // from class: X.6wp
                @Override // X.C02V
                public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.A0Y(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setRoleDescription(charSequence);
                }
            });
        }
    }

    public static void A04(View view, Integer num) {
        boolean isLongClickable = view.isLongClickable();
        if (AbstractC010103p.A00(view) == null) {
            AbstractC010103p.A0B(view, new C56962jU(num, isLongClickable));
        }
    }
}
