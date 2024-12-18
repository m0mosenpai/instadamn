package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KdR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46250KdR {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46250KdR[] A03;
    public static final EnumC46250KdR A04;
    public final String A00;

    public static final EnumC46250KdR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        return (EnumC46250KdR) A01.get(c16l.A1Q());
    }

    static {
        EnumC46250KdR enumC46250KdR = new EnumC46250KdR("PRIMARY", 0, "primary");
        A04 = enumC46250KdR;
        EnumC46250KdR[] enumC46250KdRArr = {enumC46250KdR, new EnumC46250KdR("SECONDARY", 1, "secondary")};
        A03 = enumC46250KdRArr;
        A02 = AbstractC12190kN.A00(enumC46250KdRArr);
        A01 = new LinkedHashMap();
        for (EnumC46250KdR enumC46250KdR2 : values()) {
            A01.put(enumC46250KdR2.A00, enumC46250KdR2);
        }
    }

    public static EnumC46250KdR valueOf(String str) {
        return (EnumC46250KdR) Enum.valueOf(EnumC46250KdR.class, str);
    }

    public static EnumC46250KdR[] values() {
        return (EnumC46250KdR[]) A03.clone();
    }

    public EnumC46250KdR(String str, int i, String str2) {
        this.A00 = str2;
    }
}
