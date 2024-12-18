package X;

import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.3uM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87043uM extends AnonymousClass051 {
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public final View A02;
    public final AccessibilityManager A03;

    @Override // X.AnonymousClass051
    public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        int i2;
        if (i != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.A02, i);
            if (obtain != null) {
                accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat((Object) obtain);
            } else {
                accessibilityNodeInfoCompat = null;
            }
            accessibilityNodeInfoCompat.getClass();
            A04(accessibilityNodeInfoCompat, i);
            if (this.A00 == i) {
                accessibilityNodeInfoCompat.mInfo.setAccessibilityFocused(true);
                i2 = 128;
            } else {
                accessibilityNodeInfoCompat.mInfo.setAccessibilityFocused(false);
                i2 = 64;
            }
            accessibilityNodeInfoCompat.addAction(i2);
            return accessibilityNodeInfoCompat;
        }
        View view = this.A02;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(view));
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat2.mInfo);
        A03(accessibilityNodeInfoCompat2);
        return accessibilityNodeInfoCompat2;
    }

    @Override // X.AnonymousClass051
    public final boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        if (i != -1) {
            if (i2 != 64) {
                if (i2 == 128 && this.A00 == i) {
                    this.A00 = Integer.MIN_VALUE;
                    this.A02.invalidate();
                    i4 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
                } else {
                    return false;
                }
            } else {
                AccessibilityManager accessibilityManager = this.A03;
                if ((accessibilityManager != null && (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled())) || (i3 = this.A00) == i) {
                    return false;
                }
                this.A00 = Integer.MIN_VALUE;
                View view = this.A02;
                view.invalidate();
                A02(i3, Constants.LOAD_RESULT_PGO_ATTEMPTED);
                this.A00 = i;
                view.invalidate();
                i4 = Constants.LOAD_RESULT_PGO;
            }
            A02(i, i4);
            return true;
        }
        return this.A02.performAccessibilityAction(i2, bundle);
    }

    public int A01(float f, float f2) {
        Layout layout;
        if (this instanceof C87313up) {
            layout = ((C87313up) this).A00.A00;
        } else {
            layout = ((TextView) this.A02).getLayout();
        }
        return WEL.A00(layout, (int) f, (int) f2);
    }

    public final void A02(int i, int i2) {
        View view;
        ViewParent parent;
        if (i != Integer.MIN_VALUE) {
            AccessibilityManager accessibilityManager = this.A03;
            if ((accessibilityManager != null && !accessibilityManager.isEnabled()) || (parent = (view = this.A02).getParent()) == null) {
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            if (i != -1) {
                obtain.setSource(view, i);
            } else {
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    public void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Layout layout;
        View view;
        if (this instanceof C87313up) {
            C14360o3.A0B(accessibilityNodeInfoCompat, 0);
            IgTextLayoutView igTextLayoutView = ((C87313up) this).A00;
            layout = igTextLayoutView.A00;
            view = igTextLayoutView;
        } else {
            View view2 = this.A02;
            layout = ((TextView) view2).getLayout();
            view = view2;
        }
        WEL.A01(layout, view, accessibilityNodeInfoCompat);
    }

    public void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        Layout layout;
        View view;
        if (this instanceof C87313up) {
            IgTextLayoutView igTextLayoutView = ((C87313up) this).A00;
            layout = igTextLayoutView.A00;
            view = igTextLayoutView;
        } else {
            View view2 = this.A02;
            layout = ((TextView) view2).getLayout();
            view = view2;
        }
        WEL.A02(layout, view, accessibilityNodeInfoCompat, i);
    }

    public final boolean A05(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.A03;
        if (accessibilityManager == null || (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10) {
                    int i = this.A01;
                    if (i != Integer.MIN_VALUE) {
                        this.A01 = Integer.MIN_VALUE;
                        A02(i, 256);
                    }
                    return true;
                }
            } else {
                int A01 = A01(motionEvent.getX(), motionEvent.getY());
                int i2 = this.A01;
                if (i2 != A01) {
                    this.A01 = A01;
                    A02(A01, 128);
                    A02(i2, 256);
                }
                if (A01 != Integer.MIN_VALUE) {
                    return true;
                }
            }
        }
        return false;
    }

    public AbstractC87043uM(View view) {
        this.A02 = view;
        this.A03 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }
}
