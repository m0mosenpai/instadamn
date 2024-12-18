package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68150VDu {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68150VDu[] A03;
    public static final EnumC68150VDu A04;
    public static final EnumC68150VDu A05;
    public static final EnumC68150VDu A06;
    public static final EnumC68150VDu A07;
    public static final EnumC68150VDu A08;
    public final String A00;

    public static EnumC68150VDu valueOf(String str) {
        return (EnumC68150VDu) Enum.valueOf(EnumC68150VDu.class, str);
    }

    public static EnumC68150VDu[] values() {
        return (EnumC68150VDu[]) A03.clone();
    }

    static {
        EnumC68150VDu enumC68150VDu = new EnumC68150VDu("LEGACY", 0, "");
        A06 = enumC68150VDu;
        EnumC68150VDu enumC68150VDu2 = new EnumC68150VDu("JOIN_CHAT_STICKER", 1, "join_chat_sticker");
        A05 = enumC68150VDu2;
        EnumC68150VDu enumC68150VDu3 = new EnumC68150VDu("MESSAGE_STICKER", 2, "message_sticker");
        A07 = enumC68150VDu3;
        EnumC68150VDu enumC68150VDu4 = new EnumC68150VDu("CLIPS_JOIN_CHAT_STICKER", 3, "clips_join_chat_sticker");
        A04 = enumC68150VDu4;
        EnumC68150VDu enumC68150VDu5 = new EnumC68150VDu("UNKNOWN", 4, "unknown");
        A08 = enumC68150VDu5;
        EnumC68150VDu[] enumC68150VDuArr = {enumC68150VDu, enumC68150VDu2, enumC68150VDu3, enumC68150VDu4, enumC68150VDu5};
        A03 = enumC68150VDuArr;
        A02 = AbstractC12190kN.A00(enumC68150VDuArr);
        EnumC68150VDu[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68150VDu enumC68150VDu6 : values) {
            linkedHashMap.put(enumC68150VDu6.A00, enumC68150VDu6);
        }
        A01 = linkedHashMap;
    }

    public EnumC68150VDu(String str, int i, String str2) {
        this.A00 = str2;
    }
}
