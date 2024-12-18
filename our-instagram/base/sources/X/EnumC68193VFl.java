package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VFl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68193VFl {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68193VFl[] A03;
    public static final EnumC68193VFl A04;
    public final String A00;

    static {
        EnumC68193VFl enumC68193VFl = new EnumC68193VFl("PRIMARY", 0, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = enumC68193VFl;
        EnumC68193VFl[] enumC68193VFlArr = {enumC68193VFl, new EnumC68193VFl("SUBMIT", 1, "2")};
        A03 = enumC68193VFlArr;
        A02 = AbstractC12190kN.A00(enumC68193VFlArr);
        EnumC68193VFl[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68193VFl enumC68193VFl2 : values) {
            linkedHashMap.put(enumC68193VFl2.A00, enumC68193VFl2);
        }
        A01 = linkedHashMap;
    }

    public static EnumC68193VFl valueOf(String str) {
        return (EnumC68193VFl) Enum.valueOf(EnumC68193VFl.class, str);
    }

    public static EnumC68193VFl[] values() {
        return (EnumC68193VFl[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68193VFl(String str, int i, String str2) {
        this.A00 = str2;
    }
}
