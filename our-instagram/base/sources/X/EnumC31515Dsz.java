package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dsz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31515Dsz {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC31515Dsz[] A03;
    public static final EnumC31515Dsz A04;
    public static final EnumC31515Dsz A05;
    public static final EnumC31515Dsz A06;
    public static final EnumC31515Dsz A07;
    public final String A00;

    static {
        EnumC31515Dsz enumC31515Dsz = new EnumC31515Dsz("PROMOTIONAL", 0, "promotional");
        A05 = enumC31515Dsz;
        EnumC31515Dsz enumC31515Dsz2 = new EnumC31515Dsz("WELCOME", 1, "welcome");
        A06 = enumC31515Dsz2;
        EnumC31515Dsz enumC31515Dsz3 = new EnumC31515Dsz("WELCOME_FEEDBACK_STORY", 2, "welcome_feedback_story");
        A07 = enumC31515Dsz3;
        EnumC31515Dsz enumC31515Dsz4 = new EnumC31515Dsz("FEEDBACK_STICKER_STORY_FROM_NOTIF", 3, "feedback_sticker_story_from_notif");
        A04 = enumC31515Dsz4;
        EnumC31515Dsz[] enumC31515DszArr = {enumC31515Dsz, enumC31515Dsz2, enumC31515Dsz3, enumC31515Dsz4};
        A03 = enumC31515DszArr;
        A02 = AbstractC12190kN.A00(enumC31515DszArr);
        EnumC31515Dsz[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC31515Dsz enumC31515Dsz5 : values) {
            A18.put(enumC31515Dsz5.A00, enumC31515Dsz5);
        }
        A01 = A18;
    }

    public static EnumC31515Dsz valueOf(String str) {
        return (EnumC31515Dsz) Enum.valueOf(EnumC31515Dsz.class, str);
    }

    public static EnumC31515Dsz[] values() {
        return (EnumC31515Dsz[]) A03.clone();
    }

    public EnumC31515Dsz(String str, int i, String str2) {
        this.A00 = str2;
    }
}
