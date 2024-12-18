package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222999se {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222999se[] A03;
    public static final EnumC222999se A04;
    public static final EnumC222999se A05;
    public static final EnumC222999se A06;
    public static final EnumC222999se A07;
    public static final EnumC222999se A08;
    public static final EnumC222999se A09;
    public static final EnumC222999se A0A;
    public static final EnumC222999se A0B;
    public static final EnumC222999se A0C;
    public static final EnumC222999se A0D;
    public final String A00;

    static {
        EnumC222999se enumC222999se = new EnumC222999se("DUAL_STICKER", 0, "DUAL_STICKER");
        A04 = enumC222999se;
        EnumC222999se enumC222999se2 = new EnumC222999se("FEED_TO_STORY_STICKER", 1, "FEED_TO_STORY_STICKER");
        A05 = enumC222999se2;
        EnumC222999se enumC222999se3 = new EnumC222999se("GALLERY_STICKER", 2, "GALLERY_STICKER");
        A06 = enumC222999se3;
        EnumC222999se enumC222999se4 = new EnumC222999se("QUESTION_RESPONSE_STICKER", 3, "QUESTION_RESPONSE_STICKER");
        A07 = enumC222999se4;
        EnumC222999se enumC222999se5 = new EnumC222999se("REEL_REMIX", 4, "REEL_REMIX");
        A08 = enumC222999se5;
        EnumC222999se enumC222999se6 = new EnumC222999se("REEL_TO_STORY_STICKER", 5, "REEL_TO_STORY_STICKER");
        A09 = enumC222999se6;
        EnumC222999se enumC222999se7 = new EnumC222999se("STORY_MENTION_RESHARE", 6, "STORY_MENTION_RESHARE");
        A0C = enumC222999se7;
        EnumC222999se enumC222999se8 = new EnumC222999se("STORY_EOY_SHARE", 7, "STORY_EOY_SHARE");
        A0B = enumC222999se8;
        EnumC222999se enumC222999se9 = new EnumC222999se("ROLL_CALL_STORIES", 8, "ROLL_CALL_STORIES");
        A0A = enumC222999se9;
        EnumC222999se enumC222999se10 = new EnumC222999se("UNKNOWN", 9, "UNKNOWN");
        A0D = enumC222999se10;
        EnumC222999se[] enumC222999seArr = {enumC222999se, enumC222999se2, enumC222999se3, enumC222999se4, enumC222999se5, enumC222999se6, enumC222999se7, enumC222999se8, enumC222999se9, enumC222999se10};
        A03 = enumC222999seArr;
        A02 = AbstractC12190kN.A00(enumC222999seArr);
        EnumC222999se[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222999se enumC222999se11 : values) {
            linkedHashMap.put(enumC222999se11.A00, enumC222999se11);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222999se valueOf(String str) {
        return (EnumC222999se) Enum.valueOf(EnumC222999se.class, str);
    }

    public static EnumC222999se[] values() {
        return (EnumC222999se[]) A03.clone();
    }

    public EnumC222999se(String str, int i, String str2) {
        this.A00 = str2;
    }
}
