package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VFr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68199VFr {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68199VFr[] A03;
    public static final EnumC68199VFr A04;
    public static final EnumC68199VFr A05;
    public final String A00;

    static {
        EnumC68199VFr enumC68199VFr = new EnumC68199VFr("START", 0, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = enumC68199VFr;
        EnumC68199VFr enumC68199VFr2 = new EnumC68199VFr("SUBMIT", 1, "2");
        A05 = enumC68199VFr2;
        EnumC68199VFr[] enumC68199VFrArr = {enumC68199VFr, enumC68199VFr2, new EnumC68199VFr("POLICY_EDUCATION", 2, "4")};
        A03 = enumC68199VFrArr;
        A02 = AbstractC12190kN.A00(enumC68199VFrArr);
        EnumC68199VFr[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68199VFr enumC68199VFr3 : values) {
            linkedHashMap.put(enumC68199VFr3.A00, enumC68199VFr3);
        }
        A01 = linkedHashMap;
    }

    public static EnumC68199VFr valueOf(String str) {
        return (EnumC68199VFr) Enum.valueOf(EnumC68199VFr.class, str);
    }

    public static EnumC68199VFr[] values() {
        return (EnumC68199VFr[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68199VFr(String str, int i, String str2) {
        this.A00 = str2;
    }
}
