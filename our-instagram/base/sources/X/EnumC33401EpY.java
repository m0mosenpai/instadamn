package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33401EpY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33401EpY[] A02;
    public static final EnumC33401EpY A03;
    public static final EnumC33401EpY A04;
    public static final EnumC33401EpY A05;
    public static final EnumC33401EpY A06;
    public static final EnumC33401EpY A07;
    public static final EnumC33401EpY A08;
    public static final EnumC33401EpY A09;
    public static final EnumC33401EpY A0A;
    public final String A00;

    static {
        EnumC33401EpY enumC33401EpY = new EnumC33401EpY("FOLLOW_CONTACTS", 0, "follow_contacts");
        A03 = enumC33401EpY;
        EnumC33401EpY enumC33401EpY2 = new EnumC33401EpY("INVITE_FOLLOWERS_VIA_DM", 1, "invite_followers_via_dm");
        A04 = enumC33401EpY2;
        EnumC33401EpY enumC33401EpY3 = new EnumC33401EpY("INVITE_FOLLOWERS_VIA_EMAIL", 2, "invite_followers_via_email");
        A05 = enumC33401EpY3;
        EnumC33401EpY enumC33401EpY4 = new EnumC33401EpY("INVITE_FOLLOWERS_VIA_MESSENGER", 3, "invite_followers_via_messenger");
        A06 = enumC33401EpY4;
        EnumC33401EpY enumC33401EpY5 = new EnumC33401EpY("INVITE_FOLLOWERS_VIA_SMS", 4, "invite_followers_via_sms");
        A07 = enumC33401EpY5;
        EnumC33401EpY enumC33401EpY6 = new EnumC33401EpY("INVITE_FOLLOWERS_VIA_SUMA_FOLLOWINGS", 5, "invite_followers_via_suma_followings");
        A08 = enumC33401EpY6;
        EnumC33401EpY enumC33401EpY7 = new EnumC33401EpY("INVITE_FOLLOWERS_VIA_SYSTEM_SHARE", 6, "invite_followers_via_system_share");
        A09 = enumC33401EpY7;
        EnumC33401EpY enumC33401EpY8 = new EnumC33401EpY("INVITE_FOLLOWERS_VIA_WHATSAPP", 7, "invite_followers_via_whatsapp");
        A0A = enumC33401EpY8;
        EnumC33401EpY[] enumC33401EpYArr = {enumC33401EpY, enumC33401EpY2, enumC33401EpY3, enumC33401EpY4, enumC33401EpY5, enumC33401EpY6, enumC33401EpY7, enumC33401EpY8, new EnumC33401EpY("INVITE_FOLLOWERS_VIA_STORY", 8, "invite_followers_via_story")};
        A02 = enumC33401EpYArr;
        A01 = AbstractC12190kN.A00(enumC33401EpYArr);
    }

    public static EnumC33401EpY valueOf(String str) {
        return (EnumC33401EpY) Enum.valueOf(EnumC33401EpY.class, str);
    }

    public static EnumC33401EpY[] values() {
        return (EnumC33401EpY[]) A02.clone();
    }

    public EnumC33401EpY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
