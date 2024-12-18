package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC190378bv {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC190378bv[] A03;
    public static final EnumC190378bv A04;
    public static final EnumC190378bv A05;
    public static final EnumC190378bv A06;
    public static final EnumC190378bv A07;
    public static final EnumC190378bv A08;
    public static final EnumC190378bv A09;
    public final String A00;

    static {
        EnumC190378bv enumC190378bv = new EnumC190378bv("VIDEO_CALL", 0, "video_call");
        A09 = enumC190378bv;
        EnumC190378bv enumC190378bv2 = new EnumC190378bv("LIVE", 1, "live");
        A04 = enumC190378bv2;
        EnumC190378bv enumC190378bv3 = new EnumC190378bv("PRECAPTURE_PHOTO", 2, "precapture_photo");
        A07 = enumC190378bv3;
        EnumC190378bv enumC190378bv4 = new EnumC190378bv("PRECAPTURE_VIDEO", 3, "precapture_video");
        A08 = enumC190378bv4;
        EnumC190378bv enumC190378bv5 = new EnumC190378bv("POSTCAPTURE_PHOTO", 4, "postcapture_photo");
        A05 = enumC190378bv5;
        EnumC190378bv enumC190378bv6 = new EnumC190378bv("POSTCAPTURE_VIDEO", 5, "postcapture_video");
        A06 = enumC190378bv6;
        EnumC190378bv[] enumC190378bvArr = {enumC190378bv, enumC190378bv2, enumC190378bv3, enumC190378bv4, enumC190378bv5, enumC190378bv6, new EnumC190378bv("DIRECT", 6, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)};
        A03 = enumC190378bvArr;
        A02 = AbstractC12190kN.A00(enumC190378bvArr);
        EnumC190378bv[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC190378bv enumC190378bv7 : values) {
            linkedHashMap.put(enumC190378bv7.A00, enumC190378bv7);
        }
        A01 = linkedHashMap;
    }

    public static EnumC190378bv valueOf(String str) {
        return (EnumC190378bv) Enum.valueOf(EnumC190378bv.class, str);
    }

    public static EnumC190378bv[] values() {
        return (EnumC190378bv[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC190378bv(String str, int i, String str2) {
        this.A00 = str2;
    }
}
