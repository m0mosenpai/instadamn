package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68146VDo {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68146VDo[] A03;
    public static final EnumC68146VDo A04;
    public static final EnumC68146VDo A05;
    public static final EnumC68146VDo A06;
    public static final EnumC68146VDo A07;
    public final String A00;

    static {
        EnumC68146VDo enumC68146VDo = new EnumC68146VDo("UNKNOWN", 0, "UNKNOWN");
        A07 = enumC68146VDo;
        EnumC68146VDo enumC68146VDo2 = new EnumC68146VDo("FEED", 1, "FEED");
        A04 = enumC68146VDo2;
        EnumC68146VDo enumC68146VDo3 = new EnumC68146VDo("STORY", 2, "STORY");
        A06 = enumC68146VDo3;
        EnumC68146VDo enumC68146VDo4 = new EnumC68146VDo("NO_LOCATION", 3, "NO_LOCATION");
        A05 = enumC68146VDo4;
        EnumC68146VDo[] enumC68146VDoArr = {enumC68146VDo, enumC68146VDo2, enumC68146VDo3, enumC68146VDo4, new EnumC68146VDo("SAVED_LOCATION", 4, "SAVED_LOCATION")};
        A03 = enumC68146VDoArr;
        A02 = AbstractC12190kN.A00(enumC68146VDoArr);
        EnumC68146VDo[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68146VDo enumC68146VDo5 : values) {
            linkedHashMap.put(enumC68146VDo5.A00, enumC68146VDo5);
        }
        A01 = linkedHashMap;
    }

    public static EnumC68146VDo valueOf(String str) {
        return (EnumC68146VDo) Enum.valueOf(EnumC68146VDo.class, str);
    }

    public static EnumC68146VDo[] values() {
        return (EnumC68146VDo[]) A03.clone();
    }

    public EnumC68146VDo(String str, int i, String str2) {
        this.A00 = str2;
    }
}
