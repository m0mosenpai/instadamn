package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.2jR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56932jR {
    public static StringBuilder A00(CharSequence... charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        for (CharSequence charSequence : charSequenceArr) {
            A09(charSequence, sb, true);
        }
        return sb;
    }

    public static void A01(View view) {
        AbstractC010103p.A0B(view, new C02V() { // from class: X.6ts
            @Override // X.C02V
            public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.A0Y(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.addAction(C012804r.A08);
            }
        });
    }

    public static void A02(View view) {
        if (view != null && AbstractC56862jK.A00(view.getContext())) {
            view.sendAccessibilityEvent(4194304);
            try {
                view.performAccessibilityAction(64, null);
            } catch (NullPointerException unused) {
            }
        }
    }

    public static void A03(View view) {
        AbstractC010103p.A0B(view, new C02V() { // from class: X.2jS
            @Override // X.C02V
            public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.A0Y(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setHeading(true);
            }
        });
    }

    public static void A05(final View view, long j) {
        if (view != null) {
            view.postDelayed(new Runnable() { // from class: X.4it
                /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
                
                    r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat(android.view.accessibility.AccessibilityNodeInfo.obtain());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
                
                    r3.onInitializeAccessibilityNodeInfo(r1.mInfo);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
                
                    if (X.AbstractC102264j1.A01(r3, r1) == false) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x006d, code lost:
                
                    if (r1.mInfo.getChildCount() <= 0) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0076, code lost:
                
                    if (r1.mInfo.isVisibleToUser() == false) goto L92;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x007c, code lost:
                
                    if (X.AbstractC102264j1.A02(r3, r1) == false) goto L79;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0093, code lost:
                
                    if (r1.mInfo.getCollectionInfo() != null) goto L93;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
                
                    if (android.text.TextUtils.isEmpty(r1.getText()) == false) goto L82;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x00a9, code lost:
                
                    if (android.text.TextUtils.isEmpty(r1.mInfo.getContentDescription()) != false) goto L94;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
                
                    if (X.AbstractC102264j1.A00(r3) != false) goto L95;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x000d, code lost:
                
                    continue;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x000d, code lost:
                
                    continue;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x0084, code lost:
                
                    if (r1.mInfo.getChildCount() <= 0) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x008a, code lost:
                
                    if (X.AbstractC102264j1.A03(r3, r1) == false) goto L96;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x000d, code lost:
                
                    continue;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r6 = this;
                        java.lang.String r0 = "ViewAccessibilityHelper.setAccessibilityFocusRunnable"
                        X.0lu r5 = X.AbstractC13090lv.A00(r0)
                        android.view.View r3 = r1     // Catch: java.lang.Throwable -> Lbc
                        java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: java.lang.Throwable -> Lbc
                        r2.<init>()     // Catch: java.lang.Throwable -> Lbc
                    Ld:
                        boolean r0 = r3 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L25
                        android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch: java.lang.Throwable -> Lbc
                        int r1 = r3.getChildCount()     // Catch: java.lang.Throwable -> Lbc
                    L17:
                        int r1 = r1 + (-1)
                        if (r1 < 0) goto L25
                        android.view.View r0 = r3.getChildAt(r1)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L17
                        r2.addFirst(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto L17
                    L25:
                        boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lbc
                        if (r0 != 0) goto Lb4
                        java.lang.Object r3 = r2.removeFirst()     // Catch: java.lang.Throwable -> Lbc
                        android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> Lbc
                        if (r3 == 0) goto Ld
                        int r1 = r3.getImportantForAccessibility()     // Catch: java.lang.Throwable -> Lbc
                        r0 = 2
                        if (r1 == r0) goto Ld
                        r4 = 4
                        if (r1 == r4) goto Ld
                        android.view.ViewParent r1 = r3.getParent()     // Catch: java.lang.Throwable -> Lbc
                    L41:
                        boolean r0 = r1 instanceof android.view.View     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L53
                        r0 = r1
                        android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> Lbc
                        int r0 = r0.getImportantForAccessibility()     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == r4) goto Ld
                        android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Throwable -> Lbc
                        goto L41
                    L53:
                        android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()     // Catch: java.lang.Throwable -> Ld java.lang.Throwable -> Lbc
                        androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat     // Catch: java.lang.Throwable -> Ld java.lang.Throwable -> Lbc
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> Ld java.lang.Throwable -> Lbc
                        android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch: java.lang.Throwable -> Ld java.lang.Throwable -> Lbc
                        r3.onInitializeAccessibilityNodeInfo(r0)     // Catch: java.lang.Throwable -> Ld java.lang.Throwable -> Lbc
                        boolean r0 = X.AbstractC102264j1.A01(r3, r1)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L70
                        android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch: java.lang.Throwable -> Lbc
                        int r0 = r0.getChildCount()     // Catch: java.lang.Throwable -> Lbc
                        if (r0 <= 0) goto L70
                        goto Ld
                    L70:
                        android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch: java.lang.Throwable -> Lb2
                        boolean r0 = r0.isVisibleToUser()     // Catch: java.lang.Throwable -> Lb2
                        if (r0 == 0) goto Ld
                        boolean r0 = X.AbstractC102264j1.A02(r3, r1)     // Catch: java.lang.Throwable -> Lb2
                        if (r0 == 0) goto L8d
                        android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch: java.lang.Throwable -> Lb2
                        int r0 = r0.getChildCount()     // Catch: java.lang.Throwable -> Lb2
                        if (r0 <= 0) goto Lb5
                        boolean r0 = X.AbstractC102264j1.A03(r3, r1)     // Catch: java.lang.Throwable -> Lb2
                        if (r0 == 0) goto Ld
                        goto Lb5
                    L8d:
                        android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch: java.lang.Throwable -> Lb2
                        android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = r0.getCollectionInfo()     // Catch: java.lang.Throwable -> Lb2
                        if (r0 != 0) goto Ld
                        java.lang.CharSequence r0 = r1.getText()     // Catch: java.lang.Throwable -> Lb2
                        boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb2
                        if (r0 == 0) goto Lab
                        android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch: java.lang.Throwable -> Lb2
                        java.lang.CharSequence r0 = r0.getContentDescription()     // Catch: java.lang.Throwable -> Lb2
                        boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb2
                        if (r0 != 0) goto Ld
                    Lab:
                        boolean r0 = X.AbstractC102264j1.A00(r3)     // Catch: java.lang.Throwable -> Lb2
                        if (r0 != 0) goto Ld
                        goto Lb5
                    Lb2:
                        r0 = move-exception
                        throw r0     // Catch: java.lang.Throwable -> Lbc
                    Lb4:
                        r3 = 0
                    Lb5:
                        X.AbstractC56932jR.A02(r3)     // Catch: java.lang.Throwable -> Lbc
                        r5.close()
                        return
                    Lbc:
                        r1 = move-exception
                        r5.close()     // Catch: java.lang.Throwable -> Lc1
                        throw r1
                    Lc1:
                        r0 = move-exception
                        X.AbstractC61625Rqp.A00(r1, r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC102214it.run():void");
                }
            }, j);
        }
    }

    public static void A06(final View view, long j) {
        if (view != null) {
            if (j < 500) {
                j = 500;
            }
            view.postDelayed(new Runnable() { // from class: X.6Yt
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC56932jR.A02(view);
                }
            }, j);
        }
    }

    public static void A08(View view, final String str) {
        AbstractC010103p.A0B(view, new C02V() { // from class: X.6rI
            @Override // X.C02V
            public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.A0Y(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(new C012804r(16, str));
            }
        });
    }

    public static void A04(View view, int i) {
        if (AbstractC56862jK.A01(view.getContext(), true)) {
            view.setImportantForAccessibility(i);
        }
    }

    public static void A07(View view, CharSequence charSequence) {
        ViewParent parent;
        if (AbstractC56862jK.A01(view.getContext(), false) && (parent = view.getParent()) != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            view.onInitializeAccessibilityEvent(obtain);
            if (charSequence != null) {
                obtain.getText().add(charSequence);
                obtain.setContentDescription(null);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    public static void A09(CharSequence charSequence, StringBuilder sb, boolean z) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (z && !TextUtils.isEmpty(sb)) {
                sb.append(',');
                sb.append(' ');
            }
            sb.append(charSequence);
        }
    }
}
