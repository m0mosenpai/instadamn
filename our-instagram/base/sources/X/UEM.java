package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes11.dex */
public final class UEM extends C02V {
    @Override // X.C02V
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        boolean A08;
        View childAt;
        ReadableMap readableMap;
        super.A0S(view, accessibilityEvent);
        boolean z = view instanceof UCw;
        if (!z && !(view instanceof UC8)) {
            ReactSoftExceptionLogger.logSoftException("ReactScrollViewAccessibilityDelegate", new RuntimeException(AnonymousClass001.A0R("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: ", AbstractC31173DnH.A0q(view))));
            return;
        }
        ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_collection);
        if (readableMap2 == null) {
            return;
        }
        accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
        if (!(view instanceof ViewGroup)) {
            return;
        }
        View childAt2 = ((ViewGroup) view).getChildAt(0);
        if (!(childAt2 instanceof ViewGroup)) {
            return;
        }
        Integer num = null;
        Integer num2 = null;
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) childAt2;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            View childAt3 = viewGroup.getChildAt(i);
            if (z) {
                A08 = ((UCw) view).A04(childAt3);
            } else if (!(view instanceof UC8)) {
                return;
            } else {
                A08 = ((UC8) view).A08(childAt3);
            }
            ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(R.id.accessibility_collection_item);
            if (!(childAt3 instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) childAt3;
            if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(R.id.accessibility_collection_item)) != null) {
                readableMap3 = readableMap;
            }
            if (A08 && readableMap3 != null) {
                if (num == null) {
                    num = Integer.valueOf(readableMap3.getInt("itemIndex"));
                }
                num2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
            }
            if (num != null && num2 != null) {
                accessibilityEvent.setFromIndex(num.intValue());
                accessibilityEvent.setToIndex(num2.intValue());
            }
            i++;
        }
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z;
        super.A0Y(view, accessibilityNodeInfoCompat);
        boolean z2 = view instanceof UCw;
        if (!z2 && !(view instanceof UC8)) {
            ReactSoftExceptionLogger.logSoftException("ReactScrollViewAccessibilityDelegate", new RuntimeException(AnonymousClass001.A0R("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: ", AbstractC31173DnH.A0q(view))));
            return;
        }
        VGR A00 = VGR.A00(view);
        if (A00 != null) {
            C66375UEj.A01(view.getContext(), accessibilityNodeInfoCompat, A00);
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_collection);
        if (readableMap != null) {
            accessibilityNodeInfoCompat.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (z2) {
            z = ((UCw) view).A0E;
        } else if (!(view instanceof UC8)) {
            return;
        } else {
            z = ((UC8) view).A0C;
        }
        accessibilityNodeInfoCompat.mInfo.setScrollable(z);
    }
}
