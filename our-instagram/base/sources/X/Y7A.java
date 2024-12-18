package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Y7A {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public Map A05;
    public Map A06;
    public Map A07;

    public static InterfaceC02590Ai A00(Y7A y7a, C18920wW c18920wW, String str) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
        return A00;
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a) {
        interfaceC02590Ai.AAP("component", y7a.A00);
    }

    public static void A05(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a, String str) {
        interfaceC02590Ai.AAP("waterfall_id", str);
        if (y7a.A0A() != null) {
            interfaceC02590Ai.A9M("default_values", y7a.A0A());
        }
    }

    public static void A06(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a, String str) {
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        interfaceC02590Ai.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
    }

    public final Map A09() {
        Map map = this.A05;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public final Map A0A() {
        Map map = this.A06;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public final Map A0B() {
        Map map = this.A07;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public Y7A(String str, String str2, String str3, String str4, String str5, Map map, Map map2, Map map3) {
        this.A04 = str;
        this.A01 = str2;
        this.A06 = map;
        this.A07 = map2;
        this.A05 = map3;
        this.A00 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a) {
        if (y7a.A0B() != null) {
            interfaceC02590Ai.A9M("selected_values", y7a.A0B());
        }
    }

    public static void A03(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a) {
        if (y7a.A0A() != null) {
            interfaceC02590Ai.A9M("default_values", y7a.A0A());
        }
    }

    public static void A04(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a) {
        if (y7a.A09() != null) {
            interfaceC02590Ai.A9M("available_options", y7a.A09());
        }
    }

    public static void A07(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("error_message", y7a.A03);
        interfaceC02590Ai.AAP("component", y7a.A00);
        String str3 = y7a.A02;
        if (str3 != null) {
            interfaceC02590Ai.AAP("error_identifier", str3);
        }
    }

    public static void A08(InterfaceC02590Ai interfaceC02590Ai, Y7A y7a, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("component", y7a.A00);
    }
}
