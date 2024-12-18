package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33397EpU {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33397EpU[] A02;
    public static final EnumC33397EpU A03;
    public static final EnumC33397EpU A04;
    public static final EnumC33397EpU A05;
    public static final EnumC33397EpU A06;
    public static final EnumC33397EpU A07;
    public static final EnumC33397EpU A08;
    public final String A00;

    static {
        EnumC33397EpU enumC33397EpU = new EnumC33397EpU("PROFESSIONAL_HOME", 0, "professional_home_subscriptions");
        A04 = enumC33397EpU;
        EnumC33397EpU enumC33397EpU2 = new EnumC33397EpU("PROFILE_SUBSCRIPTION", 1, "profile_subscription");
        A05 = enumC33397EpU2;
        EnumC33397EpU enumC33397EpU3 = new EnumC33397EpU("QP", 2, "profile_quick_promotion");
        A06 = enumC33397EpU3;
        EnumC33397EpU enumC33397EpU4 = new EnumC33397EpU("DM", 3, "dm_create");
        A03 = enumC33397EpU4;
        EnumC33397EpU enumC33397EpU5 = new EnumC33397EpU("STICKER", 4, "story_join_chat_sticker");
        A08 = enumC33397EpU5;
        EnumC33397EpU enumC33397EpU6 = new EnumC33397EpU("SETTINGS_RECOMMENDATION", 5, "settings_recommendation");
        A07 = enumC33397EpU6;
        EnumC33397EpU[] enumC33397EpUArr = {enumC33397EpU, enumC33397EpU2, enumC33397EpU3, enumC33397EpU4, enumC33397EpU5, enumC33397EpU6, new EnumC33397EpU("PROFILE_SUBSCRIPTION_SSC_CREATION", 6, "profile_subscription_ssc_creation")};
        A02 = enumC33397EpUArr;
        A01 = AbstractC12190kN.A00(enumC33397EpUArr);
    }

    public static EnumC33397EpU valueOf(String str) {
        return (EnumC33397EpU) Enum.valueOf(EnumC33397EpU.class, str);
    }

    public static EnumC33397EpU[] values() {
        return (EnumC33397EpU[]) A02.clone();
    }

    public EnumC33397EpU(String str, int i, String str2) {
        this.A00 = str2;
    }
}
