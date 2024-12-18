package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EqE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33442EqE {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33442EqE[] A03;
    public static final EnumC33442EqE A04;
    public static final EnumC33442EqE A05;
    public static final EnumC33442EqE A06;
    public static final EnumC33442EqE A07;
    public static final EnumC33442EqE A08;
    public final String A00;

    static {
        EnumC33442EqE enumC33442EqE = new EnumC33442EqE("STORIES_NETEGO", 0, "stories_netego");
        A04 = enumC33442EqE;
        EnumC33442EqE enumC33442EqE2 = new EnumC33442EqE("TRENDING_PROMPTS_SURFACE", 1, "trending_prompts_surface");
        A08 = enumC33442EqE2;
        EnumC33442EqE enumC33442EqE3 = new EnumC33442EqE("STORY_CREATION_FLOW_SHUFFLE_SUGGESTIONS", 2, "story_creation_flow_shuffle_suggestions");
        A05 = enumC33442EqE3;
        EnumC33442EqE enumC33442EqE4 = new EnumC33442EqE("TRENDING_PROMPTS_NOTIFICATION_SOURCING", 3, "trending_prompts_notification_sourcing");
        A07 = enumC33442EqE4;
        EnumC33442EqE enumC33442EqE5 = new EnumC33442EqE("TRENDING_PROMPTS_ADD_YOURS_IN_CHAT_SOURCING", 4, "trending_prompts_add_yours_in_chat_sourcing");
        A06 = enumC33442EqE5;
        EnumC33442EqE[] enumC33442EqEArr = {enumC33442EqE, enumC33442EqE2, enumC33442EqE3, enumC33442EqE4, enumC33442EqE5};
        A03 = enumC33442EqEArr;
        A02 = AbstractC12190kN.A00(enumC33442EqEArr);
        EnumC33442EqE[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33442EqE enumC33442EqE6 : values) {
            A18.put(enumC33442EqE6.A00, enumC33442EqE6);
        }
        A01 = A18;
    }

    public static EnumC33442EqE valueOf(String str) {
        return (EnumC33442EqE) Enum.valueOf(EnumC33442EqE.class, str);
    }

    public static EnumC33442EqE[] values() {
        return (EnumC33442EqE[]) A03.clone();
    }

    public EnumC33442EqE(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
