package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46210Kcm {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46210Kcm[] A03;
    public static final EnumC46210Kcm A04;
    public static final EnumC46210Kcm A05;
    public static final EnumC46210Kcm A06;
    public static final EnumC46210Kcm A07;
    public final int A00;
    public final String A01;

    public static EnumC46210Kcm valueOf(String str) {
        return (EnumC46210Kcm) Enum.valueOf(EnumC46210Kcm.class, str);
    }

    public static EnumC46210Kcm[] values() {
        return (EnumC46210Kcm[]) A03.clone();
    }

    static {
        EnumC46210Kcm enumC46210Kcm = new EnumC46210Kcm("ALL", 0, 2131969155, "all");
        A04 = enumC46210Kcm;
        EnumC46210Kcm enumC46210Kcm2 = new EnumC46210Kcm("CLOSE_FRIENDS", 1, 2131969156, "close_friends");
        A05 = enumC46210Kcm2;
        EnumC46210Kcm enumC46210Kcm3 = new EnumC46210Kcm("MY_FOLLOWERS", 2, 2131969157, "following_author");
        A06 = enumC46210Kcm3;
        EnumC46210Kcm enumC46210Kcm4 = new EnumC46210Kcm("PEOPLE_I_FOLLOW", 3, 2131969158, "followed_by_author");
        A07 = enumC46210Kcm4;
        EnumC46210Kcm[] enumC46210KcmArr = {enumC46210Kcm, enumC46210Kcm2, enumC46210Kcm3, enumC46210Kcm4, new EnumC46210Kcm("VERIFIED_ACCOUNTS", 4, 2131969159, "verified_accounts")};
        A03 = enumC46210KcmArr;
        A02 = AbstractC12190kN.A00(enumC46210KcmArr);
    }

    public EnumC46210Kcm(String str, int i, int i2, String str2) {
        this.A00 = i2;
        this.A01 = str2;
    }
}
