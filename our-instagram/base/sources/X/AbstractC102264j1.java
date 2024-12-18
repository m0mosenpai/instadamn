package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* renamed from: X.4j1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102264j1 {
    public static boolean A00(View view) {
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
            View view2 = (View) parentForAccessibility;
            view2.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.mInfo);
            if (A01(view2, accessibilityNodeInfoCompat) && accessibilityNodeInfoCompat.mInfo.getChildCount() > 0) {
                return false;
            }
            if (!A02(view2, accessibilityNodeInfoCompat)) {
                if (A00(view2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean A02(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        View view2;
        Integer A00;
        if (!accessibilityNodeInfoCompat.mInfo.isVisibleToUser()) {
            return false;
        }
        if (!accessibilityNodeInfoCompat.mInfo.isClickable() && !accessibilityNodeInfoCompat.mInfo.isLongClickable() && !accessibilityNodeInfoCompat.mInfo.isFocusable()) {
            List actionList = accessibilityNodeInfoCompat.getActionList();
            actionList.getClass();
            if (!actionList.contains(16) && !actionList.contains(32) && !actionList.contains(1)) {
                View view3 = (View) view.getParentForAccessibility();
                if (view3 == null) {
                    return false;
                }
                if (!accessibilityNodeInfoCompat.mInfo.isScrollable()) {
                    List actionList2 = accessibilityNodeInfoCompat.getActionList();
                    actionList2.getClass();
                    if (!actionList2.contains(4096) && !actionList2.contains(8192) && (((view2 = (View) view3.getParentForAccessibility()) == null || AbstractC56952jT.A00(view2) != C05F.A1I) && (A00 = AbstractC56952jT.A00(view3)) != C05F.A1F && A00 != C05F.A0j && A00 != C05F.A0O && A00 != C05F.A0P)) {
                        return false;
                    }
                }
                return A03(view, accessibilityNodeInfoCompat);
            }
        }
        return true;
    }

    public static boolean A03(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z = false;
        C13080lu A00 = AbstractC13090lv.A00("AccessibilityEvaluationUtil.isSpeakingNode");
        try {
            int importantForAccessibility = view.getImportantForAccessibility();
            if (importantForAccessibility == 4 || ((importantForAccessibility == 2 && accessibilityNodeInfoCompat.mInfo.getChildCount() <= 0) || (!accessibilityNodeInfoCompat.mInfo.isCheckable() && (accessibilityNodeInfoCompat.mInfo.getCollectionInfo() != null || (TextUtils.isEmpty(accessibilityNodeInfoCompat.getText()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.mInfo.getContentDescription())))))) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                            childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat2.mInfo);
                            if (accessibilityNodeInfoCompat2.mInfo.isVisibleToUser() && !A02(childAt, accessibilityNodeInfoCompat2) && A03(childAt, accessibilityNodeInfoCompat2)) {
                            }
                        }
                    }
                }
                A00.close();
                return z;
            }
            z = true;
            A00.close();
            return z;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static boolean A01(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Window window = null;
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                window = ((Activity) context).getWindow();
            }
        }
        if (window == null) {
            return false;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.x;
        int i2 = attributes.y;
        Rect rect = new Rect(i, i2, i + ((ViewGroup.LayoutParams) attributes).width, ((ViewGroup.LayoutParams) attributes).height + i2);
        Rect rect2 = new Rect();
        accessibilityNodeInfoCompat.mInfo.getBoundsInScreen(rect2);
        return rect.equals(rect2);
    }
}
