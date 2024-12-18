package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Y4, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2Y4 extends C02V {
    public static final Rect A09 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final InterfaceC102244iy A0A = new InterfaceC102244iy() { // from class: X.4ix
    };
    public UEW A02;
    public final View A03;
    public final AccessibilityManager A04;
    public final Rect A06 = new Rect();
    public final Rect A05 = new Rect();
    public final Rect A07 = new Rect();
    public final int[] A08 = new int[2];
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int mHoveredVirtualViewId = Integer.MIN_VALUE;

    public static AccessibilityEvent A09(C2Y4 c2y4, int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        if (i != -1) {
            AccessibilityNodeInfoCompat A0b = c2y4.A0b(i);
            obtain.getText().add(A0b.getText());
            obtain.setContentDescription(A0b.mInfo.getContentDescription());
            obtain.setScrollable(A0b.mInfo.isScrollable());
            obtain.setPassword(A0b.mInfo.isPassword());
            obtain.setEnabled(A0b.mInfo.isEnabled());
            obtain.setChecked(A0b.mInfo.isChecked());
            c2y4.A0f(obtain, i);
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(A0b.mInfo.getClassName());
            View view = c2y4.A03;
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        c2y4.A03.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public abstract int A0a(float f, float f2);

    public final AccessibilityNodeInfoCompat A0b(int i) {
        if (i == -1) {
            View view = this.A03;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(view));
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.mInfo);
            ArrayList arrayList = new ArrayList();
            A0i(arrayList);
            if (accessibilityNodeInfoCompat.mInfo.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                accessibilityNodeInfoCompat.mInfo.addChild(view, ((Number) arrayList.get(i2)).intValue());
            }
            return accessibilityNodeInfoCompat;
        }
        return A0A(i);
    }

    public final void A0c() {
        View view;
        ViewParent parent;
        if (this.A04.isEnabled() && (parent = (view = this.A03).getParent()) != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(C3OO.FLAG_MOVED);
            view.onInitializeAccessibilityEvent(obtain);
            obtain.setContentChangeTypes(1);
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    public void A0e(int i, boolean z) {
    }

    public void A0f(AccessibilityEvent accessibilityEvent, int i) {
    }

    public void A0g(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void A0h(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i);

    public abstract void A0i(List list);

    public abstract boolean A0m(int i, int i2, Bundle bundle);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017e, code lost:
    
        r13 = r2.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a2, code lost:
    
        if (r0 >= 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017c, code lost:
    
        if (r0 < r1) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0B(int r15, android.graphics.Rect r16) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Y4.A0B(int, android.graphics.Rect):boolean");
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 != i) {
            this.mHoveredVirtualViewId = i;
            A0d(i, 128);
            A0d(i2, 256);
        }
    }

    @Override // X.C02V
    public AnonymousClass051 A0Z(View view) {
        UEW uew = this.A02;
        if (uew == null) {
            UEW uew2 = new UEW(this);
            this.A02 = uew2;
            return uew2;
        }
        return uew;
    }

    public final void A0d(int i, int i2) {
        View view;
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.A04.isEnabled() && (parent = (view = this.A03).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, A09(this, i, i2));
        }
    }

    public final void A0j(boolean z, int i, Rect rect) {
        int i2 = this.A01;
        if (i2 != Integer.MIN_VALUE) {
            A0k(i2);
        }
        if (z) {
            A0B(i, rect);
        }
    }

    public final boolean A0k(int i) {
        if (this.A01 != i) {
            return false;
        }
        this.A01 = Integer.MIN_VALUE;
        A0e(i, false);
        A0d(i, 8);
        return true;
    }

    public final boolean A0l(int i) {
        int i2;
        View view = this.A03;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.A01) != i) {
            if (i2 != Integer.MIN_VALUE) {
                A0k(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.A01 = i;
                A0e(i, true);
                A0d(i, 8);
                return true;
            }
        }
        return false;
    }

    public final boolean A0o(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.A04;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                return false;
            }
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
        int A0a = A0a(motionEvent.getX(), motionEvent.getY());
        updateHoveredVirtualView(A0a);
        if (A0a == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public C2Y4(View view) {
        this.A03 = view;
        this.A04 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private AccessibilityNodeInfoCompat A0A(int i) {
        boolean z;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
        accessibilityNodeInfoCompat.setEnabled(true);
        accessibilityNodeInfoCompat.mInfo.setFocusable(true);
        accessibilityNodeInfoCompat.setClassName("android.view.View");
        Rect rect = A09;
        accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
        accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
        View view = this.A03;
        accessibilityNodeInfoCompat.setParent(view);
        A0h(accessibilityNodeInfoCompat, i);
        if (accessibilityNodeInfoCompat.getText() == null && accessibilityNodeInfoCompat.mInfo.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.A05;
        accessibilityNodeInfoCompat.mInfo.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = accessibilityNodeInfoCompat.mInfo.getActions();
            if ((actions & 64) == 0) {
                int i2 = 128;
                if ((actions & 128) == 0) {
                    accessibilityNodeInfoCompat.mInfo.setPackageName(view.getContext().getPackageName());
                    accessibilityNodeInfoCompat.mVirtualDescendantId = i;
                    accessibilityNodeInfoCompat.mInfo.setSource(view, i);
                    int i3 = this.A00;
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
                    if (i3 == i) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        i2 = 64;
                    }
                    accessibilityNodeInfoCompat.addAction(i2);
                    if (this.A01 == i) {
                        z = true;
                        accessibilityNodeInfoCompat.addAction(2);
                    } else {
                        z = false;
                        if (accessibilityNodeInfoCompat.mInfo.isFocusable()) {
                            accessibilityNodeInfoCompat.addAction(1);
                        }
                    }
                    accessibilityNodeInfoCompat.mInfo.setFocused(z);
                    int[] iArr = this.A08;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.A06;
                    accessibilityNodeInfoCompat.mInfo.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        accessibilityNodeInfoCompat.mInfo.getBoundsInParent(rect3);
                        if (accessibilityNodeInfoCompat.mParentVirtualDescendantId != -1) {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                            for (int i4 = accessibilityNodeInfoCompat.mParentVirtualDescendantId; i4 != -1; i4 = accessibilityNodeInfoCompat2.mParentVirtualDescendantId) {
                                accessibilityNodeInfoCompat2.mParentVirtualDescendantId = -1;
                                accessibilityNodeInfoCompat2.mInfo.setParent(view, -1);
                                accessibilityNodeInfoCompat2.mInfo.setBoundsInParent(rect);
                                A0h(accessibilityNodeInfoCompat2, i4);
                                accessibilityNodeInfoCompat2.mInfo.getBoundsInParent(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.A07;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                Object parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return accessibilityNodeInfoCompat;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    @Override // X.C02V
    public void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0Y(view, accessibilityNodeInfoCompat);
        A0g(accessibilityNodeInfoCompat);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean A0n(KeyEvent keyEvent) {
        int i;
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case Process.SIGSTOP /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        i = 66;
                                        if (keyCode != 22) {
                                            i = 130;
                                        }
                                    } else {
                                        i = 17;
                                    }
                                } else {
                                    i = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && A0B(i, null)) {
                                    i2++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.A01;
                    if (i3 != Integer.MIN_VALUE) {
                        A0m(i3, 16, null);
                        return true;
                    }
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return A0B(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return A0B(1, null);
                }
            }
        }
        return false;
    }
}
