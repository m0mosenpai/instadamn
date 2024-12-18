package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC127065ok {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC127065ok[] A03;
    public static final EnumC127065ok A04;
    public static final EnumC127065ok A05;
    public final String A00;

    static {
        EnumC127065ok enumC127065ok = new EnumC127065ok("BACKGROUND", 0, AppStateModule.APP_STATE_BACKGROUND);
        A04 = enumC127065ok;
        EnumC127065ok enumC127065ok2 = new EnumC127065ok("OTHER", 1, "other");
        A05 = enumC127065ok2;
        EnumC127065ok[] enumC127065okArr = {enumC127065ok, enumC127065ok2};
        A03 = enumC127065okArr;
        A02 = AbstractC12190kN.A00(enumC127065okArr);
        EnumC127065ok[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC127065ok enumC127065ok3 : values) {
            linkedHashMap.put(enumC127065ok3.A00, enumC127065ok3);
        }
        A01 = linkedHashMap;
    }

    public static EnumC127065ok valueOf(String str) {
        return (EnumC127065ok) Enum.valueOf(EnumC127065ok.class, str);
    }

    public static EnumC127065ok[] values() {
        return (EnumC127065ok[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC127065ok(String str, int i, String str2) {
        this.A00 = str2;
    }
}
