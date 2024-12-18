package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import com.facebook.R;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.03p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC010103p {
    public static Field A00;
    public static boolean A01;
    public static WeakHashMap A02;
    public static final C03N A03;
    public static final int[] A04;
    public static final C03Z A05;

    public static void A0E(View view, C012804r c012804r, AnonymousClass054 anonymousClass054) {
        if (anonymousClass054 == null) {
            A09(view, c012804r.A00());
        } else {
            A0D(view, new C012804r(anonymousClass054, null, c012804r.A02, null, c012804r.A00));
        }
    }

    static {
        int[] iArr = new int[32];
        System.arraycopy(new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26}, 0, iArr, 0, 27);
        System.arraycopy(new int[]{R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31}, 0, iArr, 27, 5);
        A04 = iArr;
        A03 = new C03N() { // from class: X.0uY
            @Override // X.C03N
            public final C006302d DdA(C006302d c006302d) {
                return c006302d;
            }
        };
        A05 = new C03Z();
    }

    public static View.AccessibilityDelegate A00(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC009503j.A00(view);
        }
        if (A01) {
            return null;
        }
        if (A00 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                A01 = true;
                return null;
            }
        }
        Object obj = A00.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C006302d A02(View view, C006302d c006302d) {
        C03N c03n;
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC009703l.A00(view, c006302d);
        }
        C03M c03m = (C03M) view.getTag(R.id.tag_on_receive_content_listener);
        if (c03m != null && (c006302d = c03m.Dd9(view, c006302d)) == null) {
            return null;
        }
        if (view instanceof C03N) {
            c03n = (C03N) view;
        } else {
            c03n = A03;
        }
        return c03n.DdA(c006302d);
    }

    @Deprecated
    public static C04E A03(View view) {
        WeakHashMap weakHashMap = A02;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A02 = weakHashMap;
        }
        C04E c04e = (C04E) weakHashMap.get(view);
        if (c04e == null) {
            C04E c04e2 = new C04E(view);
            A02.put(view, c04e2);
            return c04e2;
        }
        return c04e;
    }

    public static void A06(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC009503j.A01(context, typedArray, attributeSet, view, iArr, i, i2);
        }
    }

    public static void A0B(View view, C02V c02v) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c02v == null && (A00(view) instanceof C02U)) {
            c02v = new C02V();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (c02v == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = c02v.A00;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void A0C(View view, C03M c03m, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC009703l.A01(view, c03m, strArr);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        boolean z2 = false;
        if (strArr != null) {
            z2 = true;
        }
        C02R.A06(z2, "When the listener is set, MIME types must also be set");
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z = true;
                    break;
                }
                i++;
            }
            C02R.A06(!z, AnonymousClass001.A0R("A MIME type set here must not start with *: ", Arrays.toString(strArr)));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, c03m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r4.getWindowVisibility() != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0F(android.view.View r4, java.lang.CharSequence r5) {
        /*
            X.0uW r0 = new X.0uW
            r0.<init>()
            r0.A02(r4, r5)
            X.03Z r3 = X.AbstractC010103p.A05
            if (r5 == 0) goto L34
            java.util.WeakHashMap r2 = r3.A00
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L1b
            int r1 = r4.getWindowVisibility()
            r0 = 1
            if (r1 == 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r4, r0)
            r4.addOnAttachStateChangeListener(r3)
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L33
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r3)
        L33:
            return
        L34:
            java.util.WeakHashMap r0 = r3.A00
            r0.remove(r4)
            r4.removeOnAttachStateChangeListener(r3)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC010103p.A0F(android.view.View, java.lang.CharSequence):void");
    }

    public static void A0G(View view, CharSequence charSequence) {
        new C17920uV().A02(view, charSequence);
    }

    public static void A0H(View view, List list) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC009503j.A02(view, list);
        }
    }

    public static void A0I(View view, boolean z) {
        new C17910uU().A02(view, Boolean.valueOf(z));
    }

    public static void A0J(View view, boolean z) {
        new C17940uX().A02(view, Boolean.valueOf(z));
    }

    public static boolean A0K(View view) {
        Boolean bool = (Boolean) new C17910uU().A00(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean A0L(View view) {
        Boolean bool = (Boolean) new C17940uX().A00(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static String[] A0M(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC009703l.A02(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static C02V A01(View view) {
        View.AccessibilityDelegate A002 = A00(view);
        if (A002 == null) {
            return null;
        }
        if (A002 instanceof C02U) {
            return ((C02U) A002).A00;
        }
        return new C02V(A002);
    }

    public static C011504d A04(View view, C011504d c011504d) {
        WindowInsets A042 = c011504d.A04();
        if (A042 != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(A042);
            if (!dispatchApplyWindowInsets.equals(A042)) {
                return C011504d.A01(view, dispatchApplyWindowInsets);
            }
        }
        return c011504d;
    }

    public static C011504d A05(View view, C011504d c011504d) {
        WindowInsets A042 = c011504d.A04();
        if (A042 != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(A042);
            if (!onApplyWindowInsets.equals(A042)) {
                return C011504d.A01(view, onApplyWindowInsets);
            }
        }
        return c011504d;
    }

    public static void A07(View view) {
        C02V A012 = A01(view);
        if (A012 == null) {
            A012 = new C02V();
        }
        A0B(view, A012);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r5.getWindowVisibility() != 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(android.view.View r5, int r6) {
        /*
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r4 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L5d
            X.0uW r0 = new X.0uW
            r0.<init>()
            java.lang.Object r0 = r0.A00(r5)
            if (r0 == 0) goto L2a
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L2a
            int r0 = r5.getWindowVisibility()
            r3 = 1
            if (r0 == 0) goto L2b
        L2a:
            r3 = 0
        L2b:
            int r1 = r5.getAccessibilityLiveRegion()
            r0 = 32
            if (r1 != 0) goto L86
            if (r3 != 0) goto L86
            if (r6 != r0) goto L5e
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r2)
            r2.setEventType(r0)
            r2.setContentChangeTypes(r6)
            r2.setSource(r5)
            r5.onPopulateAccessibilityEvent(r2)
            java.util.List r1 = r2.getText()
            X.0uW r0 = new X.0uW
            r0.<init>()
            java.lang.Object r0 = r0.A00(r5)
            r1.add(r0)
            r4.sendAccessibilityEvent(r2)
        L5d:
            return
        L5e:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L5d
            android.view.ViewParent r0 = r5.getParent()
            r0.notifySubtreeAccessibilityStateChanged(r5, r5, r6)     // Catch: java.lang.AbstractMethodError -> L6c
            goto L85
        L6c:
            r2 = move-exception
            android.view.ViewParent r0 = r5.getParent()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = " does not fully implement ViewParent"
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r1, r2)
            return
        L85:
            return
        L86:
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r3 != 0) goto L8e
            r0 = 2048(0x800, float:2.87E-42)
        L8e:
            r2.setEventType(r0)
            r2.setContentChangeTypes(r6)
            if (r3 == 0) goto Lb0
            java.util.List r1 = r2.getText()
            X.0uW r0 = new X.0uW
            r0.<init>()
            java.lang.Object r0 = r0.A00(r5)
            r1.add(r0)
            int r0 = r5.getImportantForAccessibility()
            if (r0 != 0) goto Lb0
            r0 = 1
            r5.setImportantForAccessibility(r0)
        Lb0:
            r5.sendAccessibilityEventUnchecked(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC010103p.A08(android.view.View, int):void");
    }

    public static void A09(View view, int i) {
        A0A(view, i);
        A08(view, 0);
    }

    public static void A0A(View view, int i) {
        AbstractList abstractList = (AbstractList) view.getTag(R.id.tag_accessibility_actions);
        if (abstractList == null) {
            abstractList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, abstractList);
        }
        for (int i2 = 0; i2 < abstractList.size(); i2++) {
            if (((C012804r) abstractList.get(i2)).A00() == i) {
                abstractList.remove(i2);
                return;
            }
        }
    }

    public static void A0D(View view, C012804r c012804r) {
        A07(view);
        A0A(view, c012804r.A00());
        AbstractCollection abstractCollection = (AbstractCollection) view.getTag(R.id.tag_accessibility_actions);
        if (abstractCollection == null) {
            abstractCollection = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, abstractCollection);
        }
        abstractCollection.add(c012804r);
        A08(view, 0);
    }
}
