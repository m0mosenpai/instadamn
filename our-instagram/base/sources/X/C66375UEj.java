package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UEj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C66375UEj extends C2Y4 {
    public static int A05 = 1056964608;
    public static final HashMap A06;
    public Handler A00;
    public View A01;
    public final View A02;
    public final C68688VaO A03;
    public final HashMap A04;

    public static boolean A03(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility != 4 && (importantForAccessibility != 2 || accessibilityNodeInfoCompat.mInfo.getChildCount() > 0)) {
            if ((accessibilityNodeInfoCompat.mInfo.getCollectionInfo() == null && (!TextUtils.isEmpty(accessibilityNodeInfoCompat.getText()) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.mInfo.getContentDescription()) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.mInfo.getHintText()))) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.getStateDescription()) || accessibilityNodeInfoCompat.mInfo.isCheckable()) {
                return true;
            }
            AccessibilityNodeInfo.RangeInfo rangeInfo = accessibilityNodeInfoCompat.mInfo.getRangeInfo();
            if (rangeInfo != null) {
                float max = rangeInfo.getMax();
                float min = rangeInfo.getMin();
                float current = rangeInfo.getCurrent();
                if (max - min > 0.0f && current >= min && current <= max) {
                    return true;
                }
            }
            if (accessibilityNodeInfoCompat.mInfo.isCheckable()) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                        childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat2.mInfo);
                        if (accessibilityNodeInfoCompat2.mInfo.isVisibleToUser() && !A04(accessibilityNodeInfoCompat2) && A03(childAt, accessibilityNodeInfoCompat2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!accessibilityNodeInfoCompat.mInfo.isVisibleToUser()) {
            return false;
        }
        if (!accessibilityNodeInfoCompat.mInfo.isScreenReaderFocusable() && !accessibilityNodeInfoCompat.mInfo.isClickable() && !accessibilityNodeInfoCompat.mInfo.isLongClickable() && !accessibilityNodeInfoCompat.mInfo.isFocusable()) {
            List actionList = accessibilityNodeInfoCompat.getActionList();
            if (!AbstractC31175DnJ.A1U(16, actionList) && !AbstractC31175DnJ.A1U(32, actionList) && !AbstractC31175DnJ.A1U(1, actionList)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C2Y4
    public final boolean A0m(int i, int i2, Bundle bundle) {
        return false;
    }

    static {
        HashMap hashMap = new HashMap();
        A06 = hashMap;
        hashMap.put("activate", Integer.valueOf(C012804r.A08.A00()));
        hashMap.put("longpress", Integer.valueOf(C012804r.A0L.A00()));
        hashMap.put("increment", Integer.valueOf(C012804r.A0Z.A00()));
        hashMap.put("decrement", Integer.valueOf(C012804r.A0X.A00()));
        hashMap.put("expand", Integer.valueOf(C012804r.A0H.A00()));
        hashMap.put("collapse", Integer.valueOf(C012804r.A09.A00()));
    }

    public static CharSequence A00(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3;
        if (accessibilityNodeInfoCompat == null) {
            accessibilityNodeInfoCompat3 = null;
            accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
            try {
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat2.mInfo);
            } catch (NullPointerException unused) {
            }
        } else {
            accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.mInfo));
        }
        accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat2;
        if (accessibilityNodeInfoCompat3 != null) {
            CharSequence contentDescription = accessibilityNodeInfoCompat3.mInfo.getContentDescription();
            CharSequence text = accessibilityNodeInfoCompat3.getText();
            boolean A1N = AbstractC167007dF.A1N(TextUtils.isEmpty(text) ? 1 : 0);
            boolean z = view instanceof EditText;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(contentDescription) && (!z || !A1N)) {
                sb.append(contentDescription);
                return sb;
            }
            if (A1N) {
                sb.append(text);
                return sb;
            }
            if (view instanceof ViewGroup) {
                StringBuilder sb2 = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat4 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                    childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat4.mInfo);
                    if (A03(childAt, accessibilityNodeInfoCompat4) && !A04(accessibilityNodeInfoCompat4)) {
                        CharSequence A00 = A00(childAt, null);
                        if (!TextUtils.isEmpty(A00)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append((Object) A00);
                            sb3.append(", ");
                            AbstractC58318PtA.A1V(sb2, sb3);
                        }
                    }
                }
                int length = sb2.length();
                if (length > 0) {
                    sb2.delete(length - 2, length);
                }
                return sb2.toString();
            }
        }
        return null;
    }

    @Override // X.C02V
    public boolean A0V(View view, int i, Bundle bundle) {
        if (i == 524288) {
            view.setTag(R.id.accessibility_state_expanded, AbstractC166997dE.A0a());
        }
        if (i == 262144) {
            view.setTag(R.id.accessibility_state_expanded, true);
        }
        HashMap hashMap = this.A04;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("actionName", (String) hashMap.get(valueOf));
            Q21 q21 = (Q21) view.getContext();
            if (q21.A0F()) {
                int id = view.getId();
                int A00 = UIManagerHelper.A00(q21);
                int i2 = 2;
                if (id % 2 != 0) {
                    i2 = 1;
                }
                InterfaceC65589TnT A03 = UIManagerHelper.A03(q21, i2, true);
                if (A03 != null) {
                    ((UIManagerModule) A03).mEventDispatcher.APn(new C67620Usr(writableNativeMap, this, A00, id));
                }
            } else {
                ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new RuntimeException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
            Object tag = view.getTag(R.id.accessibility_role);
            ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
            if (tag != VGR.A01 || (i != C012804r.A0Z.A00() && i != C012804r.A0X.A00())) {
                return true;
            }
            if (readableMap != null && !readableMap.hasKey("text")) {
                Handler handler = this.A00;
                if (handler.hasMessages(1, view)) {
                    handler.removeMessages(1, view);
                }
                handler.sendMessageDelayed(handler.obtainMessage(1, view), 200L);
            }
        }
        return super.A0V(view, i, bundle);
    }

    @Override // X.C2Y4, X.C02V
    public final AnonymousClass051 A0Z(View view) {
        if (this.A03 != null) {
            return super.A0Z(view);
        }
        return null;
    }

    @Override // X.C2Y4
    public final int A0a(float f, float f2) {
        Layout layout;
        C68688VaO c68688VaO = this.A03;
        if (c68688VaO == null) {
            return Integer.MIN_VALUE;
        }
        List<C69196VjP> list = c68688VaO.A00;
        if (list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.A02;
        if (!(view instanceof TextView)) {
            return Integer.MIN_VALUE;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return Integer.MIN_VALUE;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f2 - textView.getTotalPaddingTop()) + textView.getScrollY())), (f - textView.getTotalPaddingLeft()) + textView.getScrollX());
        Object A0p = A0p(ClickableSpan.class, offsetForHorizontal, offsetForHorizontal);
        if (A0p == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) textView.getText();
        int spanStart = spanned.getSpanStart(A0p);
        int spanEnd = spanned.getSpanEnd(A0p);
        for (C69196VjP c69196VjP : list) {
            if (c69196VjP.A02 == spanStart && c69196VjP.A00 == spanEnd) {
                return c69196VjP.A01;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.C2Y4
    public final void A0h(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        float textSize;
        int i2;
        Rect rect;
        int width;
        int height;
        C68688VaO c68688VaO = this.A03;
        if (c68688VaO != null) {
            Iterator it = c68688VaO.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C69196VjP c69196VjP = (C69196VjP) it.next();
                if (c69196VjP.A01 == i) {
                    View view = this.A02;
                    boolean z = false;
                    if (!(view instanceof TextView)) {
                        width = view.getWidth();
                        height = view.getHeight();
                    } else {
                        TextView textView = (TextView) view;
                        Layout layout = textView.getLayout();
                        if (layout == null) {
                            width = textView.getWidth();
                            height = textView.getHeight();
                        } else {
                            double d = c69196VjP.A02;
                            double d2 = c69196VjP.A00;
                            int i3 = (int) d;
                            int lineForOffset = layout.getLineForOffset(i3);
                            if (d <= layout.getLineEnd(lineForOffset)) {
                                Rect rect2 = new Rect();
                                double primaryHorizontal = layout.getPrimaryHorizontal(i3);
                                Paint paint = new Paint();
                                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) A0p(AbsoluteSizeSpan.class, c69196VjP.A02, c69196VjP.A00);
                                if (absoluteSizeSpan != null) {
                                    textSize = absoluteSizeSpan.getSize();
                                } else {
                                    textSize = textView.getTextSize();
                                }
                                paint.setTextSize(textSize);
                                int ceil = (int) Math.ceil(paint.measureText(c69196VjP.A03));
                                if (lineForOffset != layout.getLineForOffset((int) d2)) {
                                    z = true;
                                }
                                layout.getLineBounds(lineForOffset, rect2);
                                int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
                                rect2.top += scrollY;
                                rect2.bottom += scrollY;
                                int totalPaddingLeft = (int) (rect2.left + ((primaryHorizontal + textView.getTotalPaddingLeft()) - textView.getScrollX()));
                                rect2.left = totalPaddingLeft;
                                int i4 = rect2.top;
                                if (z) {
                                    i2 = rect2.right;
                                } else {
                                    i2 = totalPaddingLeft + ceil;
                                }
                                rect = new Rect(totalPaddingLeft, i4, i2, rect2.bottom);
                                accessibilityNodeInfoCompat.setContentDescription(c69196VjP.A03);
                                accessibilityNodeInfoCompat.addAction(16);
                                accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
                                accessibilityNodeInfoCompat.setRoleDescription(view.getResources().getString(2131965227));
                                accessibilityNodeInfoCompat.setClassName(VGR.A02(VGR.A03));
                                return;
                            }
                        }
                    }
                    rect = new Rect(0, 0, width, height);
                    accessibilityNodeInfoCompat.setContentDescription(c69196VjP.A03);
                    accessibilityNodeInfoCompat.addAction(16);
                    accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
                    accessibilityNodeInfoCompat.setRoleDescription(view.getResources().getString(2131965227));
                    accessibilityNodeInfoCompat.setClassName(VGR.A02(VGR.A03));
                    return;
                }
            }
        }
        accessibilityNodeInfoCompat.setContentDescription("");
        accessibilityNodeInfoCompat.mInfo.setBoundsInParent(new Rect(0, 0, 1, 1));
    }

    @Override // X.C2Y4
    public final void A0i(List list) {
        C68688VaO c68688VaO = this.A03;
        if (c68688VaO != null) {
            for (int i = 0; i < c68688VaO.A00.size(); i++) {
                MSX.A0u(i, list);
            }
        }
    }

    public final Object A0p(Class cls, int i, int i2) {
        View view = this.A02;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) textView.getText()).getSpans(i, i2, cls);
        if (spans.length <= 0) {
            return null;
        }
        return spans[0];
    }

    public C66375UEj(View view, int i, boolean z) {
        super(view);
        this.A02 = view;
        this.A04 = new HashMap();
        this.A00 = new HandlerC65967TxK(this);
        view.setFocusable(z);
        view.setImportantForAccessibility(i);
        this.A03 = (C68688VaO) view.getTag(R.id.accessibility_links);
    }

    public static void A01(Context context, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, VGR vgr) {
        int i;
        accessibilityNodeInfoCompat.setClassName(VGR.A02(vgr));
        if (vgr.equals(VGR.A0F)) {
            i = 2131965227;
        } else if (vgr.equals(VGR.A0C)) {
            i = 2131964283;
        } else {
            if (vgr.equals(VGR.A0D)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(2131964297));
            } else if (!vgr.equals(VGR.A03)) {
                if (vgr.equals(VGR.A0a)) {
                    accessibilityNodeInfoCompat.setClickable(true);
                    accessibilityNodeInfoCompat.mInfo.setCheckable(true);
                    return;
                }
                if (vgr.equals(VGR.A0U)) {
                    i = 2131974952;
                } else {
                    if (vgr.equals(VGR.A09)) {
                        accessibilityNodeInfoCompat.mInfo.setHeading(true);
                        return;
                    }
                    if (vgr.equals(VGR.A02)) {
                        i = 2131952898;
                    } else if (vgr.equals(VGR.A05)) {
                        i = 2131956424;
                    } else if (vgr.equals(VGR.A0H)) {
                        i = 2131966322;
                    } else if (vgr.equals(VGR.A0I)) {
                        i = 2131966338;
                    } else if (vgr.equals(VGR.A0J)) {
                        i = 2131966339;
                    } else if (vgr.equals(VGR.A0M)) {
                        i = 2131970272;
                    } else if (vgr.equals(VGR.A0O)) {
                        i = 2131971444;
                    } else if (vgr.equals(VGR.A0P)) {
                        i = 2131972992;
                    } else if (vgr.equals(VGR.A0T)) {
                        i = 2131974323;
                    } else if (vgr.equals(VGR.A0W)) {
                        i = 2131972601;
                    } else if (vgr.equals(VGR.A0X)) {
                        i = 2131975132;
                    } else if (vgr.equals(VGR.A0Z)) {
                        i = 2131975611;
                    } else if (!vgr.equals(VGR.A0b)) {
                        return;
                    } else {
                        i = 2131975685;
                    }
                }
            }
            accessibilityNodeInfoCompat.setClickable(true);
            return;
        }
        accessibilityNodeInfoCompat.setRoleDescription(context.getString(i));
    }

    public static void A02(View view, int i, boolean z) {
        if (AbstractC010103p.A00(view) == null) {
            if (view.getTag(R.id.accessibility_role) != null || view.getTag(R.id.accessibility_state) != null || view.getTag(R.id.accessibility_actions) != null || view.getTag(R.id.react_test_id) != null || view.getTag(R.id.accessibility_collection_item) != null || view.getTag(R.id.accessibility_links) != null || view.getTag(R.id.role) != null) {
                AbstractC010103p.A0B(view, new C66375UEj(view, i, z));
            }
        }
    }

    @Override // X.C02V
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        super.A0S(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                        accessibilityEvent.setItemCount(asInt3 - asInt);
                        accessibilityEvent.setCurrentItemIndex(asInt2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f9, code lost:
    
        if (r1 == false) goto L89;
     */
    @Override // X.C2Y4, X.C02V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Y(android.view.View r14, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r15) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66375UEj.A0Y(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
