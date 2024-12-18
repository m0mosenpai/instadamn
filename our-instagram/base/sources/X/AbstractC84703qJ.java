package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3qJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84703qJ {
    public static final String A03(C54432ex c54432ex) {
        C14360o3.A0B(c54432ex, 0);
        String obj = c54432ex.A03.toString();
        if (C14360o3.A0K(obj, EnumC54222eY.A0f.toString()) || C14360o3.A0K(obj, EnumC54222eY.A0N.toString())) {
            return "FOLLOW_REQUESTS";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A0V.toString())) {
            return "MAIN";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A0I.toString())) {
            return "DIRECT";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A0D.toString())) {
            return "BRANDED_CONTENT";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A0Q.toString())) {
            return "HOME";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A0R.toString())) {
            return "HORIZONTAL_ACCOUNT_SWITCHER";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A0b.toString())) {
            return "PROFILE";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A0o.toString())) {
            return "USERTAGS";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A0p.toString())) {
            return "VERTICAL_ACCOUNT_SWITCHER";
        }
        if (C14360o3.A0K(obj, EnumC54222eY.A09.toString())) {
            return "ACTIVITY_FEED";
        }
        return "UNKNOWN";
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, X.3qK] */
    public static final C84713qK A00(C54432ex c54432ex, java.util.Set set) {
        LinkedHashMap linkedHashMap;
        boolean z;
        ?? c0Zx = new C0Zx();
        c0Zx.A05("badge_count", Long.valueOf(c54432ex.A01 + c54432ex.A00));
        List list = c54432ex.A04;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C54432ex) obj).A01 > 0) {
                    arrayList.add(obj);
                }
            }
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            linkedHashMap = new LinkedHashMap(A0L);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC54232eZ interfaceC54232eZ = ((C54432ex) it.next()).A03;
                String upperCase = interfaceC54232eZ.BOr().toUpperCase(Locale.ROOT);
                C14360o3.A07(upperCase);
                C0Zx c0Zx2 = new C0Zx();
                c0Zx2.A05("badge_value", Long.valueOf(r7.A01));
                if (set != null) {
                    z = true;
                    if (set.contains(interfaceC54232eZ.toString())) {
                        c0Zx2.A03("is_toast_displayed", Boolean.valueOf(z));
                        linkedHashMap.put(upperCase, c0Zx2);
                    }
                }
                z = false;
                c0Zx2.A03("is_toast_displayed", Boolean.valueOf(z));
                linkedHashMap.put(upperCase, c0Zx2);
            }
        } else {
            linkedHashMap = null;
        }
        c0Zx.A08("category_values", linkedHashMap);
        return c0Zx;
    }

    public static final String A01(EnumC58122lU enumC58122lU) {
        if (enumC58122lU != null) {
            int ordinal = enumC58122lU.ordinal();
            if (ordinal != 1) {
                if (ordinal != 0) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 3) {
                                return "TOAST";
                            }
                            return "UNKNOWN";
                        }
                        return "OS_SYSTEM_CAPPED";
                    }
                    return "LIST_ITEM";
                }
                return "NUMBERED";
            }
            return "DOT_BADGE";
        }
        return "UNKNOWN";
    }

    public static final String A02(EnumC58162lY enumC58162lY) {
        if (enumC58162lY != null) {
            int ordinal = enumC58162lY.ordinal();
            if (ordinal != 1) {
                if (ordinal != 0) {
                    if (ordinal != 11) {
                        if (ordinal != 10) {
                            if (ordinal == 9) {
                                return "BOTTOM_SHEET";
                            }
                            return "UNKNOWN";
                        }
                        return "PINNED_ROWS";
                    }
                    return "APP_ICON";
                }
                return "BOTTOM_NAVIGATION_BAR";
            }
            return "TOP_NAVIGATION_BAR";
        }
        return "UNKNOWN";
    }
}
