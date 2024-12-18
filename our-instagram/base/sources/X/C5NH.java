package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5NH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NH {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C5NH[] A03;
    public static final C5NH A04;
    public static final C5NH A05;
    public static final C5NH A06;
    public static final C5NH A07;
    public final String A00;

    static {
        C5NH c5nh = new C5NH("EMOJIS", 0, "emojis");
        A05 = c5nh;
        C5NH c5nh2 = new C5NH("STATIC_STICKERS", 1, "static_stickers");
        A06 = c5nh2;
        C5NH c5nh3 = new C5NH("ANIMATED_STICKERS", 2, "animated_stickers");
        A04 = c5nh3;
        C5NH c5nh4 = new C5NH("TEXT", 3, "text");
        A07 = c5nh4;
        C5NH[] c5nhArr = {c5nh, c5nh2, c5nh3, c5nh4};
        A03 = c5nhArr;
        A02 = AbstractC12190kN.A00(c5nhArr);
        C5NH[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C5NH c5nh5 : values) {
            linkedHashMap.put(c5nh5.A00, c5nh5);
        }
        A01 = linkedHashMap;
    }

    public static C5NH valueOf(String str) {
        return (C5NH) Enum.valueOf(C5NH.class, str);
    }

    public static C5NH[] values() {
        return (C5NH[]) A03.clone();
    }

    public C5NH(String str, int i, String str2) {
        this.A00 = str2;
    }
}
