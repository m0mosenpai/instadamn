package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.051, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass051 {
    public final Object A00;

    public AccessibilityNodeInfoCompat A00(int i) {
        return null;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        return null;
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }

    public AnonymousClass051(Object obj) {
        this.A00 = obj;
    }

    public AnonymousClass051() {
        this.A00 = new AccessibilityNodeProvider(this) { // from class: X.0sB
            public final AnonymousClass051 A00;

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
                this.A00.addExtraDataToAccessibilityNodeInfo(i, new AccessibilityNodeInfoCompat(accessibilityNodeInfo), str, bundle);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.A00.createAccessibilityNodeInfo(i);
                if (createAccessibilityNodeInfo == null) {
                    return null;
                }
                return createAccessibilityNodeInfo.mInfo;
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List findAccessibilityNodeInfosByText(String str, int i) {
                List findAccessibilityNodeInfosByText = this.A00.findAccessibilityNodeInfosByText(str, i);
                if (findAccessibilityNodeInfosByText == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int size = findAccessibilityNodeInfosByText.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((AccessibilityNodeInfoCompat) findAccessibilityNodeInfosByText.get(i2)).mInfo);
                }
                return arrayList;
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i) {
                AccessibilityNodeInfoCompat A00 = this.A00.A00(i);
                if (A00 == null) {
                    return null;
                }
                return A00.mInfo;
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, Bundle bundle) {
                return this.A00.performAction(i, i2, bundle);
            }

            {
                this.A00 = this;
            }
        };
    }
}
