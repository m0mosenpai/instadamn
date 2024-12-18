package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC74203Uz {
    GET_PREF_BASED_CONFIG(0, true),
    SET_PREF_BASED_CONFIG(1, false),
    GET_APPS_STATISTICS(2, true),
    GET_ANALYTICS_CONFIG(3, true),
    SET_ANALYTICS_CONFIG(4, false),
    GET_FLYTRAP_REPORT(5, true),
    GET_PREF_IDS(6, true),
    SET_PREF_IDS(7, false),
    NOT_EXIST(Integer.MAX_VALUE, false);

    public static final Map A02 = new HashMap();
    public final int A00;
    public final boolean A01;

    static {
        for (EnumC74203Uz enumC74203Uz : values()) {
            A02.put(Integer.valueOf(enumC74203Uz.A00), enumC74203Uz);
        }
    }

    EnumC74203Uz(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
