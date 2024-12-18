package X;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.04r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C012804r {
    public static final C012804r A0A;
    public static final C012804r A0E;
    public static final C012804r A0F;
    public static final C012804r A0G;
    public static final C012804r A0J;
    public static final C012804r A0K;
    public static final C012804r A0M;
    public static final C012804r A0P;
    public static final C012804r A0Q;
    public static final C012804r A0R;
    public static final C012804r A0S;
    public static final C012804r A0U;
    public static final C012804r A0a;
    public static final C012804r A0g;
    public static final C012804r A0k;
    public static final C012804r A0l;
    public final int A00;
    public final AnonymousClass054 A01;
    public final Class A02;
    public final Object A03;
    public static final C012804r A0I = new C012804r(1, (CharSequence) null);
    public static final C012804r A06 = new C012804r(2, (CharSequence) null);
    public static final C012804r A0f = new C012804r(4, (CharSequence) null);
    public static final C012804r A07 = new C012804r(8, (CharSequence) null);
    public static final C012804r A08 = new C012804r(16, (CharSequence) null);
    public static final C012804r A0L = new C012804r(32, (CharSequence) null);
    public static final C012804r A04 = new C012804r(64, (CharSequence) null);
    public static final C012804r A05 = new C012804r(128, (CharSequence) null);
    public static final C012804r A0N = new C012804r(C16230rR.class, 256);
    public static final C012804r A0V = new C012804r(C16230rR.class, 512);
    public static final C012804r A0O = new C012804r(C16200rK.class, 1024);
    public static final C012804r A0W = new C012804r(C16200rK.class, C3OO.FLAG_MOVED);
    public static final C012804r A0Z = new C012804r(4096, (CharSequence) null);
    public static final C012804r A0X = new C012804r(8192, (CharSequence) null);
    public static final C012804r A0B = new C012804r(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, (CharSequence) null);
    public static final C012804r A0T = new C012804r(Constants.LOAD_RESULT_PGO, (CharSequence) null);
    public static final C012804r A0C = new C012804r(Constants.LOAD_RESULT_PGO_ATTEMPTED, (CharSequence) null);
    public static final C012804r A0h = new C012804r(C14700oi.class, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
    public static final C012804r A0H = new C012804r(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, (CharSequence) null);
    public static final C012804r A09 = new C012804r(Constants.LOAD_RESULT_WITH_VDEX_ODEX, (CharSequence) null);
    public static final C012804r A0D = new C012804r(1048576, (CharSequence) null);
    public static final C012804r A0i = new C012804r(C14660oe.class, 2097152);
    public static final C012804r A0j = new C012804r(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen);
    public static final C012804r A0d = new C012804r(null, null, C15940qo.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition);
    public static final C012804r A0e = new C012804r(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp);
    public static final C012804r A0b = new C012804r(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft);
    public static final C012804r A0Y = new C012804r(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown);
    public static final C012804r A0c = new C012804r(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight);

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8 = null;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9 = null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = null;
        A0S = new C012804r(null, null, null, accessibilityAction, R.id.accessibilityActionPageUp);
        if (i >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        A0P = new C012804r(null, null, null, accessibilityAction2, R.id.accessibilityActionPageDown);
        if (i >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        A0Q = new C012804r(null, null, null, accessibilityAction3, R.id.accessibilityActionPageLeft);
        if (i >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        A0R = new C012804r(null, null, null, accessibilityAction10, R.id.accessibilityActionPageRight);
        A0A = new C012804r(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick);
        A0g = new C012804r(null, null, C14720ok.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress);
        A0M = new C012804r(null, null, C15970qr.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow);
        A0l = new C012804r(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip);
        A0J = new C012804r(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip);
        if (i >= 30) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction4 = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11 = null;
        A0U = new C012804r(null, null, null, accessibilityAction4, R.id.accessibilityActionPressAndHold);
        if (i >= 30) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        A0K = new C012804r(null, null, null, accessibilityAction11, R.id.accessibilityActionImeEnter);
        if (i >= 32) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction5 = null;
        }
        A0G = new C012804r(null, null, null, accessibilityAction5, R.id.ALT);
        if (i >= 32) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction6 = null;
        }
        A0F = new C012804r(null, null, null, accessibilityAction6, R.id.CTRL);
        if (i >= 32) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        A0E = new C012804r(null, null, null, accessibilityAction9, R.id.FUNCTION);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction7 = null;
        }
        A0k = new C012804r(null, null, null, accessibilityAction7, R.id.KEYCODE_0);
        if (i2 >= 34) {
            accessibilityAction8 = C04v.A00();
        }
        A0a = new C012804r(null, null, null, accessibilityAction8, R.id.KEYCODE_3D_MODE);
    }

    public C012804r(int i, CharSequence charSequence) {
        this(null, charSequence, null, null, i);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C012804r) && this.A03.equals(((C012804r) obj).A03);
    }

    public final int A00() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.A03).getId();
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        String actionSymbolicName = AccessibilityNodeInfoCompat.getActionSymbolicName(this.A00);
        if (actionSymbolicName.equals("ACTION_UNKNOWN")) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.A03;
            if (accessibilityAction.getLabel() != null) {
                actionSymbolicName = accessibilityAction.getLabel().toString();
            }
        }
        return AnonymousClass001.A0R("AccessibilityActionCompat: ", actionSymbolicName);
    }

    public C012804r(Class cls, int i) {
        this(null, null, cls, null, i);
    }

    public C012804r(AnonymousClass054 anonymousClass054, CharSequence charSequence, Class cls, Object obj, int i) {
        this.A00 = i;
        this.A01 = anonymousClass054;
        this.A03 = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.A02 = cls;
    }
}
