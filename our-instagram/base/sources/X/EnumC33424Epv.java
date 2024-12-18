package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33424Epv {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC33424Epv[] A05;
    public static final EnumC33424Epv A06;
    public static final EnumC33424Epv A07;
    public static final EnumC33424Epv A08;
    public static final EnumC33424Epv A09;
    public static final EnumC33424Epv A0A;
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public static EnumC33424Epv valueOf(String str) {
        return (EnumC33424Epv) Enum.valueOf(EnumC33424Epv.class, str);
    }

    public static EnumC33424Epv[] values() {
        return (EnumC33424Epv[]) A05.clone();
    }

    static {
        EnumC33424Epv enumC33424Epv = new EnumC33424Epv(2131959458, "CHANNEL_DIRECTORY_FOR_YOU", "for_you", "DIRECT_IBC_INBOX_DISCOVERY", 0, 17);
        A06 = enumC33424Epv;
        EnumC33424Epv enumC33424Epv2 = new EnumC33424Epv(2131959458, "CHANNEL_DIRECTORY_NETEGO_FOR_YOU_TAB", "feed_netego", "DIRECT_IBC_NETEGO_FEED_SUGGESTIONS", 1, 18);
        A08 = enumC33424Epv2;
        EnumC33424Epv enumC33424Epv3 = new EnumC33424Epv(null, "CHANNEL_DIRECTORY_INVITATIONS_TAB", "invites", "DIRECT_IBC_INBOX_INVITATIONS", 2, 21);
        A07 = enumC33424Epv3;
        EnumC33424Epv enumC33424Epv4 = new EnumC33424Epv(2131959461, "CHANNEL_DIRECTORY_TAB_MOST_POPULAR", "most_popular", "DIRECT_IBC_INBOX_DIRECTORY_TAB_MOST_POPULAR_CHANNELS", 3, 22);
        A0A = enumC33424Epv4;
        EnumC33424Epv enumC33424Epv5 = new EnumC33424Epv(2131959460, "CHANNEL_DIRECTORY_TAB_MOST_ACTIVE", "most_active", "DIRECT_IBC_INBOX_DIRECTORY_TAB_MOST_ACTIVE_CHANNELS", 4, 23);
        A09 = enumC33424Epv5;
        EnumC33424Epv[] enumC33424EpvArr = {enumC33424Epv, enumC33424Epv2, enumC33424Epv3, enumC33424Epv4, enumC33424Epv5};
        A05 = enumC33424EpvArr;
        A04 = AbstractC12190kN.A00(enumC33424EpvArr);
    }

    public EnumC33424Epv(Integer num, String str, String str2, String str3, int i, int i2) {
        this.A00 = i2;
        this.A01 = num;
        this.A03 = str2;
        this.A02 = str3;
    }
}
