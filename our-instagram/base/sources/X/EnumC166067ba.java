package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC166067ba {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC166067ba[] A03;
    public static final EnumC166067ba A04;
    public static final EnumC166067ba A05;
    public final String A00;

    static {
        EnumC166067ba enumC166067ba = new EnumC166067ba("SUBSCRIBERS_ONLY", 0, "subscriber_comments_only");
        A05 = enumC166067ba;
        EnumC166067ba enumC166067ba2 = new EnumC166067ba("NOT_SET", 1, "no_filter");
        A04 = enumC166067ba2;
        EnumC166067ba[] enumC166067baArr = {enumC166067ba, enumC166067ba2};
        A03 = enumC166067baArr;
        A02 = AbstractC12190kN.A00(enumC166067baArr);
        EnumC166067ba[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC166067ba enumC166067ba3 : values) {
            linkedHashMap.put(enumC166067ba3.A00, enumC166067ba3);
        }
        A01 = linkedHashMap;
    }

    public static EnumC166067ba valueOf(String str) {
        return (EnumC166067ba) Enum.valueOf(EnumC166067ba.class, str);
    }

    public static EnumC166067ba[] values() {
        return (EnumC166067ba[]) A03.clone();
    }

    public EnumC166067ba(String str, int i, String str2) {
        this.A00 = str2;
    }
}
