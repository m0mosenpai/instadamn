package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VFv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68203VFv {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68203VFv[] A03;
    public static final EnumC68203VFv A04;
    public static final EnumC68203VFv A05;
    public static final EnumC68203VFv A06;
    public static final EnumC68203VFv A07;
    public final String A00;

    static {
        EnumC68203VFv enumC68203VFv = new EnumC68203VFv("IMAGE", 0, "image");
        A05 = enumC68203VFv;
        EnumC68203VFv enumC68203VFv2 = new EnumC68203VFv("VIDEO", 1, MediaStreamTrack.VIDEO_TRACK_KIND);
        A07 = enumC68203VFv2;
        EnumC68203VFv enumC68203VFv3 = new EnumC68203VFv("API_RESPONSE", 2, "api_response");
        A04 = enumC68203VFv3;
        EnumC68203VFv enumC68203VFv4 = new EnumC68203VFv("UNKNOWN_ITEM_TYPE", 3, "unknown_type");
        A06 = enumC68203VFv4;
        EnumC68203VFv[] enumC68203VFvArr = {enumC68203VFv, enumC68203VFv2, enumC68203VFv3, enumC68203VFv4};
        A03 = enumC68203VFvArr;
        A02 = AbstractC12190kN.A00(enumC68203VFvArr);
        EnumC68203VFv[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68203VFv enumC68203VFv5 : values) {
            linkedHashMap.put(enumC68203VFv5.A00, enumC68203VFv5);
        }
        A01 = linkedHashMap;
    }

    public static EnumC68203VFv valueOf(String str) {
        return (EnumC68203VFv) Enum.valueOf(EnumC68203VFv.class, str);
    }

    public static EnumC68203VFv[] values() {
        return (EnumC68203VFv[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68203VFv(String str, int i, String str2) {
        this.A00 = str2;
    }
}
