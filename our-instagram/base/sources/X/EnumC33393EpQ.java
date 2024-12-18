package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33393EpQ {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33393EpQ[] A03;
    public static final EnumC33393EpQ A04;
    public static final EnumC33393EpQ A05;
    public static final EnumC33393EpQ A06;
    public final String A00;

    static {
        EnumC33393EpQ enumC33393EpQ = new EnumC33393EpQ("ANYTIME_MENTION", 0, "anytime_mention");
        A04 = enumC33393EpQ;
        EnumC33393EpQ enumC33393EpQ2 = new EnumC33393EpQ("STORY_REQUEST_MENTION", 1, "story_request_mention");
        A06 = enumC33393EpQ2;
        EnumC33393EpQ enumC33393EpQ3 = new EnumC33393EpQ("INVISIBLE_MENTION_USER_SELECTION_BUTTON", 2, "invisible_mention_user_selection_button");
        A05 = enumC33393EpQ3;
        EnumC33393EpQ[] enumC33393EpQArr = {enumC33393EpQ, enumC33393EpQ2, enumC33393EpQ3};
        A03 = enumC33393EpQArr;
        A02 = AbstractC12190kN.A00(enumC33393EpQArr);
        EnumC33393EpQ[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33393EpQ enumC33393EpQ4 : values) {
            A18.put(enumC33393EpQ4.A00, enumC33393EpQ4);
        }
        A01 = A18;
    }

    public static EnumC33393EpQ valueOf(String str) {
        return (EnumC33393EpQ) Enum.valueOf(EnumC33393EpQ.class, str);
    }

    public static EnumC33393EpQ[] values() {
        return (EnumC33393EpQ[]) A03.clone();
    }

    public EnumC33393EpQ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
