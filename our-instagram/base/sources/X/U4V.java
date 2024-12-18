package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U4V extends C02V {
    public static final Map A05;
    public static final Map A06;
    public static final Map A07;
    public static final Map A08;
    public int A00;
    public final C102884kP A01;
    public final C6FG A02;
    public final C102884kP A03;
    public final Map A04;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("button", "android.widget.Button");
        hashMap.put("checkbox", "android.widget.CompoundButton");
        hashMap.put("checked_text_view", "android.widget.CheckedTextView");
        hashMap.put("drop_down_list", "android.widget.Spinner");
        hashMap.put("edit_text", "android.widget.EditText");
        hashMap.put("grid", "android.widget.GridView");
        hashMap.put("image", "android.widget.ImageView");
        hashMap.put("list", "android.widget.AbsListView");
        hashMap.put("pager", "androidx.viewpager.widget.ViewPager");
        hashMap.put("radio_button", "android.widget.RadioButton");
        hashMap.put("seek_control", "android.widget.SeekBar");
        hashMap.put("switch", "android.widget.Switch");
        hashMap.put("tab_bar", "android.widget.TabWidget");
        hashMap.put("toggle_button", "android.widget.ToggleButton");
        hashMap.put("view_group", "android.view.ViewGroup");
        hashMap.put("web_view", "android.webkit.WebView");
        hashMap.put("progress_bar", "android.widget.ProgressBar");
        hashMap.put("action_bar_tab", "android.app.ActionBar$Tab");
        hashMap.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        hashMap.put("sliding_drawer", "android.widget.SlidingDrawer");
        hashMap.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        hashMap.put("toast", "android.widget.Toast$TN");
        hashMap.put("alert_dialog", "android.app.AlertDialog");
        hashMap.put("date_picker_dialog", "android.app.DatePickerDialog");
        hashMap.put("time_picker_dialog", "android.app.TimePickerDialog");
        hashMap.put("date_picker", "android.widget.DatePicker");
        hashMap.put("time_picker", "android.widget.TimePicker");
        hashMap.put("number_picker", "android.widget.NumberPicker");
        hashMap.put("scroll_view", "android.widget.ScrollView");
        hashMap.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        hashMap.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        hashMap.put(NetInfoModule.CONNECTION_TYPE_NONE, "");
        A08 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("click", A00(C012804r.A08));
        hashMap2.put("long_click", A00(C012804r.A0L));
        hashMap2.put("scroll_forward", A00(C012804r.A0Z));
        hashMap2.put("scroll_backward", A00(C012804r.A0X));
        hashMap2.put("expand", A00(C012804r.A0H));
        hashMap2.put("collapse", A00(C012804r.A09));
        hashMap2.put("dismiss", A00(C012804r.A0D));
        hashMap2.put("scroll_up", A00(C012804r.A0e));
        hashMap2.put("scroll_left", A00(C012804r.A0b));
        hashMap2.put("scroll_down", A00(C012804r.A0Y));
        hashMap2.put("scroll_right", A00(C012804r.A0c));
        hashMap2.put("custom", -1);
        A05 = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("percent", 2);
        hashMap3.put("float", 1);
        hashMap3.put("int", 0);
        A07 = Collections.unmodifiableMap(hashMap3);
        HashMap A12 = AbstractC31174DnI.A12(NetInfoModule.CONNECTION_TYPE_NONE, 0);
        A12.put("single", 1);
        A12.put("multiple", 2);
        A06 = Collections.unmodifiableMap(A12);
    }

    @Override // X.C02V
    public final boolean A0V(View view, int i, Bundle bundle) {
        InterfaceC103384lE interfaceC103384lE;
        StringBuilder sb;
        String str;
        VJJ vjj = (VJJ) AbstractC166997dE.A0m(this.A04, i);
        if (vjj != null && (interfaceC103384lE = vjj.A01) != null) {
            C102884kP c102884kP = this.A03;
            C6FX c6fx = new C6FX();
            c6fx.A03(c102884kP, 0);
            Object A00 = C131845xK.A00(C6FQ.A01(this.A02, interfaceC103384lE, c102884kP.A0A), c6fx.A00(), interfaceC103384lE);
            if (!(A00 instanceof Number) && !(A00 instanceof Boolean)) {
                if (A00 != null) {
                    sb = new StringBuilder();
                    str = "Got a non-boolean result while evaluating action ";
                } else {
                    sb = new StringBuilder();
                    str = "Got a null result while evaluating action ";
                }
                AbstractC25241Le.A02("bk.components.AndroidNativeAccessibilityExtension", AbstractC58320PtC.A12(str, sb, i));
                return false;
            }
            return C6DZ.A01(A00);
        }
        return super.A0V(view, i, bundle);
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Number number;
        Number number2;
        super.A0Y(view, accessibilityNodeInfoCompat);
        C102884kP c102884kP = this.A01;
        boolean A0S = c102884kP.A0S(41, false);
        boolean A0S2 = c102884kP.A0S(49, false);
        boolean A0S3 = c102884kP.A0S(51, false);
        boolean A0S4 = c102884kP.A0S(36, false);
        String A0L = c102884kP.A0L(50);
        String A0L2 = c102884kP.A0L(45);
        String A0L3 = c102884kP.A0L(46);
        String A0L4 = c102884kP.A0L(58);
        String A0L5 = c102884kP.A0L(57);
        C102884kP A082 = c102884kP.A08(52);
        C102884kP A083 = c102884kP.A08(53);
        C102884kP A084 = c102884kP.A08(54);
        if (A082 != null) {
            String A0L6 = A082.A0L(40);
            float A02 = A082.A02(38, -1.0f);
            float A022 = A082.A02(36, -1.0f);
            float A023 = A082.A02(35, -1.0f);
            if (A02 >= 0.0f && A023 >= 0.0f && A022 >= 0.0f && (number2 = (Number) A07.get(A0L6)) != null) {
                accessibilityNodeInfoCompat.mInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(number2.intValue(), A02, A022, A023));
            }
        }
        if (A083 != null) {
            int A03 = A083.A03(35, -1);
            int A032 = A083.A03(38, -1);
            boolean A0S5 = A083.A0S(36, false);
            String str = NetInfoModule.CONNECTION_TYPE_NONE;
            String A0L7 = A083.A0L(40);
            if (A0L7 != null) {
                str = A0L7;
            }
            if (A03 >= -1 && A032 >= -1 && (number = (Number) A06.get(str)) != null) {
                accessibilityNodeInfoCompat.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(A032, A03, A0S5, number.intValue()));
            }
        }
        if (A084 != null) {
            int A033 = A084.A03(35, -1);
            int A034 = A084.A03(38, -1);
            int A035 = A084.A03(36, -1);
            int A036 = A084.A03(40, -1);
            if (A033 >= 0 && A034 >= 0 && A035 >= 0 && A036 >= 0) {
                accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(A034, A036, A033, A035, A0S, A0S2));
            }
        }
        Iterator A16 = AbstractC166997dE.A16(this.A04);
        while (A16.hasNext()) {
            VJJ vjj = (VJJ) A16.next();
            int i = vjj.A00;
            Map map = A05;
            if (map.containsKey("click") && i == AbstractC65702TsY.A0E("click", map)) {
                accessibilityNodeInfoCompat.setClickable(true);
            } else if (map.containsKey("long_click") && i == AbstractC65702TsY.A0E("long_click", map)) {
                accessibilityNodeInfoCompat.mInfo.setLongClickable(true);
            }
            String str2 = vjj.A02;
            if (str2 != null) {
                accessibilityNodeInfoCompat.addAction(new C012804r(i, str2));
            } else {
                accessibilityNodeInfoCompat.addAction(i);
            }
        }
        if (A0S3) {
            accessibilityNodeInfoCompat.mInfo.setCheckable(true);
            accessibilityNodeInfoCompat.mInfo.setChecked(A0S4);
        }
        if (A0L != null) {
            accessibilityNodeInfoCompat.mInfo.setTooltipText(A0L);
        }
        if (A0L2 != null && !A0L2.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            Map map2 = A08;
            if (map2.containsKey(A0L2)) {
                accessibilityNodeInfoCompat.setClassName((CharSequence) map2.get(A0L2));
            }
        }
        if (A0L3 != null) {
            accessibilityNodeInfoCompat.setRoleDescription(A0L3);
        }
        if (A0L4 != null) {
            accessibilityNodeInfoCompat.setStateDescription(A0L4);
        }
        if (A0L5 != null && !A0L5.isEmpty()) {
            accessibilityNodeInfoCompat.mInfo.setContentInvalid(true);
            accessibilityNodeInfoCompat.mInfo.setError(A0L5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.VJJ] */
    public U4V(C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2) {
        this.A00 = 1056964608;
        this.A01 = c102884kP;
        this.A03 = c102884kP2;
        this.A02 = c6fg;
        HashMap hashMap = new HashMap();
        List<C102884kP> A0N = c102884kP.A0N(55);
        if (A0N != null && !A0N.isEmpty()) {
            for (C102884kP c102884kP3 : A0N) {
                String A0L = c102884kP3.A0L(35);
                String A0L2 = c102884kP3.A0L(36);
                InterfaceC103384lE A0B = c102884kP3.A0B(38);
                if (A0L != null) {
                    Map map = A05;
                    if (map.containsKey(A0L)) {
                        int intValue = ((Number) map.get(A0L)).intValue();
                        if (map.containsKey("custom") && intValue == ((Number) map.get("custom")).intValue()) {
                            intValue = this.A00;
                            this.A00 = intValue + 1;
                        }
                        Integer valueOf = Integer.valueOf(intValue);
                        ?? obj = new Object();
                        obj.A02 = A0L2;
                        obj.A00 = intValue;
                        obj.A01 = A0B;
                        hashMap.put(valueOf, obj);
                    }
                }
            }
        }
        this.A04 = hashMap;
    }

    public static Integer A00(C012804r c012804r) {
        AbstractC05810Sj.A00(c012804r);
        return Integer.valueOf(c012804r.A00());
    }
}
