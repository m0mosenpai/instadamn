package androidx.core.view.accessibility;

import X.AbstractC013004t;
import X.AbstractC013104u;
import X.AnonymousClass001;
import X.C012804r;
import X.C04v;
import X.C3OO;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {
    public final AccessibilityNodeInfo mInfo;
    public int mParentVirtualDescendantId = -1;
    public int mVirtualDescendantId = -1;

    public static String getActionSymbolicName(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case C3OO.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET /* 16384 */:
                return "ACTION_COPY";
            case Constants.LOAD_RESULT_PGO /* 32768 */:
                return "ACTION_PASTE";
            case Constants.LOAD_RESULT_PGO_ATTEMPTED /* 65536 */:
                return "ACTION_CUT";
            case Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP /* 131072 */:
                return "ACTION_SET_SELECTION";
            case Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED /* 262144 */:
                return "ACTION_EXPAND";
            case Constants.LOAD_RESULT_WITH_VDEX_ODEX /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.KEYCODE_3D_MODE:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L29
            r2 = 0
            if (r5 == 0) goto L14
            boolean r0 = r5 instanceof androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            if (r0 == 0) goto L14
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r5
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.mInfo
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.mInfo
            if (r1 != 0) goto L15
            if (r0 == 0) goto L1c
        L14:
            return r2
        L15:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1c
            return r2
        L1c:
            int r1 = r4.mVirtualDescendantId
            int r0 = r5.mVirtualDescendantId
            if (r1 != r0) goto L14
            int r1 = r4.mParentVirtualDescendantId
            int r0 = r5.mParentVirtualDescendantId
            if (r1 == r0) goto L29
            return r2
        L29:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.AccessibilityNodeInfoCompat.equals(java.lang.Object):boolean");
    }

    public void setParent(View view) {
        this.mParentVirtualDescendantId = -1;
        this.mInfo.setParent(view);
    }

    private List extrasIntList(String str) {
        ArrayList<Integer> integerArrayList = this.mInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.mInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public void addAction(C012804r c012804r) {
        this.mInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) c012804r.A03);
    }

    public List getActionList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.mInfo.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C012804r(null, null, null, actionList.get(i), 0));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public CharSequence getStateDescription() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i >= 30) {
            return AbstractC013004t.A00(accessibilityNodeInfo);
        }
        return accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public CharSequence getText() {
        if (!extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List extrasIntList = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List extrasIntList2 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List extrasIntList3 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List extrasIntList4 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.mInfo.getText(), 0, this.mInfo.getText().length()));
            for (int i = 0; i < extrasIntList.size(); i++) {
                final int intValue = ((Number) extrasIntList4.get(i)).intValue();
                final int i2 = this.mInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY");
                spannableString.setSpan(new ClickableSpan(this, intValue, i2) { // from class: X.04i
                    public final int A00;
                    public final int A01;
                    public final AccessibilityNodeInfoCompat A02;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = this.A02;
                        accessibilityNodeInfoCompat.mInfo.performAction(this.A00, bundle);
                    }

                    {
                        this.A01 = intValue;
                        this.A02 = this;
                        this.A00 = i2;
                    }
                }, ((Number) extrasIntList.get(i)).intValue(), ((Number) extrasIntList2.get(i)).intValue(), ((Number) extrasIntList3.get(i)).intValue());
            }
            return spannableString;
        }
        return this.mInfo.getText();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean removeAction(C012804r c012804r) {
        return this.mInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c012804r.A03);
    }

    public void setClassName(CharSequence charSequence) {
        this.mInfo.setClassName(charSequence);
    }

    public void setClickable(boolean z) {
        this.mInfo.setClickable(z);
    }

    public void setContentDescription(CharSequence charSequence) {
        this.mInfo.setContentDescription(charSequence);
    }

    public void setEnabled(boolean z) {
        this.mInfo.setEnabled(z);
    }

    public void setRoleDescription(CharSequence charSequence) {
        this.mInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void setStateDescription(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i >= 30) {
            AbstractC013004t.A01(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String toString() {
        String string;
        CharSequence charSequence;
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.mInfo.getBoundsInParent(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        this.mInfo.getBoundsInScreen(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i >= 34) {
            C04v.A02(rect, accessibilityNodeInfo);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; boundsInWindow: ");
        sb4.append(rect);
        sb.append(sb4.toString());
        sb.append("; packageName: ");
        sb.append(this.mInfo.getPackageName());
        sb.append("; className: ");
        sb.append(this.mInfo.getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(this.mInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(this.mInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(this.mInfo.getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(this.mInfo.getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(this.mInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.mInfo;
        if (i >= 33) {
            string = AbstractC013104u.A00(accessibilityNodeInfo2);
        } else {
            string = accessibilityNodeInfo2.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(this.mInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(this.mInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(this.mInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(this.mInfo.isFocused());
        sb.append("; selected: ");
        sb.append(this.mInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(this.mInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.mInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(this.mInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(this.mInfo.isEnabled());
        sb.append("; password: ");
        sb.append(this.mInfo.isPassword());
        sb.append(AnonymousClass001.A1D("; scrollable: ", this.mInfo.isScrollable()));
        sb.append("; containerTitle: ");
        AccessibilityNodeInfo accessibilityNodeInfo3 = this.mInfo;
        if (i >= 34) {
            charSequence = C04v.A01(accessibilityNodeInfo3);
        } else {
            charSequence = accessibilityNodeInfo3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence);
        sb.append("; granularScrollingSupported: ");
        Bundle extras = this.mInfo.getExtras();
        boolean z3 = false;
        if (extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 67108864) == 67108864) {
            z3 = true;
        }
        sb.append(z3);
        sb.append("; importantForAccessibility: ");
        sb.append(this.mInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(this.mInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i >= 33) {
            z = AbstractC013104u.A01(this.mInfo);
        } else {
            Bundle extras2 = this.mInfo.getExtras();
            z = false;
            if (extras2 != null && (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) == 8388608) {
                z = true;
            }
        }
        sb.append(z);
        sb.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            z2 = C04v.A03(this.mInfo);
        } else {
            Bundle extras3 = this.mInfo.getExtras();
            z2 = false;
            if (extras3 != null && (extras3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 64) == 64) {
                z2 = true;
            }
        }
        sb.append(z2);
        sb.append("; [");
        List actionList = getActionList();
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            C012804r c012804r = (C012804r) actionList.get(i2);
            String actionSymbolicName = getActionSymbolicName(c012804r.A00());
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) c012804r.A03).getLabel() != null) {
                actionSymbolicName = ((AccessibilityNodeInfo.AccessibilityAction) c012804r.A03).getLabel().toString();
            }
            sb.append(actionSymbolicName);
            if (i2 != actionList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public AccessibilityNodeInfoCompat(Object obj) {
        this.mInfo = (AccessibilityNodeInfo) obj;
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.mInfo = accessibilityNodeInfo;
    }

    public void addAction(int i) {
        this.mInfo.addAction(i);
    }
}
