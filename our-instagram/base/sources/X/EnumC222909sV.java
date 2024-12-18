package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222909sV {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222909sV[] A03;
    public static final EnumC222909sV A04;
    public static final EnumC222909sV A05;
    public static final EnumC222909sV A06;
    public static final EnumC222909sV A07;
    public final String A00;

    static {
        EnumC222909sV enumC222909sV = new EnumC222909sV("IMAGE", 0, "image");
        A05 = enumC222909sV;
        EnumC222909sV enumC222909sV2 = new EnumC222909sV("VIDEO", 1, MediaStreamTrack.VIDEO_TRACK_KIND);
        A07 = enumC222909sV2;
        EnumC222909sV enumC222909sV3 = new EnumC222909sV("GIF", 2, "gif");
        A04 = enumC222909sV3;
        EnumC222909sV enumC222909sV4 = new EnumC222909sV("UNDEFINED", 3, "undefined");
        A06 = enumC222909sV4;
        EnumC222909sV[] enumC222909sVArr = {enumC222909sV, enumC222909sV2, enumC222909sV3, enumC222909sV4};
        A03 = enumC222909sVArr;
        A02 = AbstractC12190kN.A00(enumC222909sVArr);
        EnumC222909sV[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222909sV enumC222909sV5 : values) {
            linkedHashMap.put(enumC222909sV5.A00, enumC222909sV5);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222909sV valueOf(String str) {
        return (EnumC222909sV) Enum.valueOf(EnumC222909sV.class, str);
    }

    public static EnumC222909sV[] values() {
        return (EnumC222909sV[]) A03.clone();
    }

    public EnumC222909sV(String str, int i, String str2) {
        this.A00 = str2;
    }
}
