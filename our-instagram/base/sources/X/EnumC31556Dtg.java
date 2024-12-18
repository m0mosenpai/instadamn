package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dtg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31556Dtg {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC31556Dtg[] A03;
    public static final EnumC31556Dtg A04;
    public static final EnumC31556Dtg A05;
    public static final EnumC31556Dtg A06;
    public static final EnumC31556Dtg A07;
    public static final EnumC31556Dtg A08;
    public static final EnumC31556Dtg A09;
    public static final EnumC31556Dtg A0A;
    public static final EnumC31556Dtg A0B;
    public static final EnumC31556Dtg A0C;
    public static final EnumC31556Dtg A0D;
    public static final EnumC31556Dtg A0E;
    public static final EnumC31556Dtg A0F;
    public static final EnumC31556Dtg A0G;
    public static final EnumC31556Dtg A0H;
    public static final EnumC31556Dtg A0I;
    public static final EnumC31556Dtg A0J;
    public static final EnumC31556Dtg A0K;
    public static final EnumC31556Dtg A0L;
    public final String A00;
    public final boolean A01;

    static {
        EnumC31556Dtg enumC31556Dtg = new EnumC31556Dtg("FOLLOWERS", "followers", 0, false);
        A04 = enumC31556Dtg;
        EnumC31556Dtg enumC31556Dtg2 = new EnumC31556Dtg("FOLLOWING", "following", 1, false);
        A05 = enumC31556Dtg2;
        EnumC31556Dtg enumC31556Dtg3 = new EnumC31556Dtg("FOLLOWING_SIMPLIFIED", "following", 2, false);
        A06 = enumC31556Dtg3;
        EnumC31556Dtg enumC31556Dtg4 = new EnumC31556Dtg("MUTUAL", "mutual", 3, false);
        A0E = enumC31556Dtg4;
        EnumC31556Dtg enumC31556Dtg5 = new EnumC31556Dtg("SIMILAR", "similar", 4, false);
        A0H = enumC31556Dtg5;
        EnumC31556Dtg enumC31556Dtg6 = new EnumC31556Dtg("UNFOLLOW_CHAIN", "unfollow_chain", 5, false);
        A0K = enumC31556Dtg6;
        EnumC31556Dtg enumC31556Dtg7 = new EnumC31556Dtg("GROUPS", "groups", 6, true);
        A07 = enumC31556Dtg7;
        EnumC31556Dtg enumC31556Dtg8 = new EnumC31556Dtg("GROUP_FOLLOWERS", "group_followers", 7, true);
        A08 = enumC31556Dtg8;
        EnumC31556Dtg enumC31556Dtg9 = new EnumC31556Dtg("GROUP_FOLLOWING", "group_following", 8, true);
        A09 = enumC31556Dtg9;
        EnumC31556Dtg enumC31556Dtg10 = new EnumC31556Dtg("MISINFORMATION", "misinformation_unfollow_chain", 9, false);
        A0D = enumC31556Dtg10;
        EnumC31556Dtg enumC31556Dtg11 = new EnumC31556Dtg("GROUP_PROFILE_MEMBERS", "group_profile_members", 10, false);
        A0C = enumC31556Dtg11;
        EnumC31556Dtg enumC31556Dtg12 = new EnumC31556Dtg("GROUP_PROFILE_ADMINS", "group_profile_admins", 11, false);
        A0A = enumC31556Dtg12;
        EnumC31556Dtg enumC31556Dtg13 = new EnumC31556Dtg("GROUP_PROFILE_BLOCKED", "group_profile_blocked", 12, false);
        A0B = enumC31556Dtg13;
        EnumC31556Dtg enumC31556Dtg14 = new EnumC31556Dtg("SUBSCRIBED", "subscribed", 13, false);
        A0J = enumC31556Dtg14;
        EnumC31556Dtg enumC31556Dtg15 = new EnumC31556Dtg("SELF_FOLLOWERS", "self_followers", 14, false);
        A0F = enumC31556Dtg15;
        EnumC31556Dtg enumC31556Dtg16 = new EnumC31556Dtg("SELF_FOLLOWING", "self_following", 15, false);
        A0G = enumC31556Dtg16;
        EnumC31556Dtg enumC31556Dtg17 = new EnumC31556Dtg("SPAM_FOLLOWERS", "potential_spam_requests", 16, false);
        A0I = enumC31556Dtg17;
        EnumC31556Dtg enumC31556Dtg18 = new EnumC31556Dtg("UNKNOWN", "unknown", 17, false);
        A0L = enumC31556Dtg18;
        EnumC31556Dtg[] enumC31556DtgArr = {enumC31556Dtg, enumC31556Dtg2, enumC31556Dtg3, enumC31556Dtg4, enumC31556Dtg5, enumC31556Dtg6, enumC31556Dtg7, enumC31556Dtg8, enumC31556Dtg9, enumC31556Dtg10, enumC31556Dtg11, enumC31556Dtg12, enumC31556Dtg13, enumC31556Dtg14, enumC31556Dtg15, enumC31556Dtg16, enumC31556Dtg17, enumC31556Dtg18};
        A03 = enumC31556DtgArr;
        A02 = AbstractC12190kN.A00(enumC31556DtgArr);
    }

    public static EnumC31556Dtg valueOf(String str) {
        return (EnumC31556Dtg) Enum.valueOf(EnumC31556Dtg.class, str);
    }

    public static EnumC31556Dtg[] values() {
        return (EnumC31556Dtg[]) A03.clone();
    }

    public EnumC31556Dtg(String str, String str2, int i, boolean z) {
        this.A00 = str2;
        this.A01 = z;
    }
}
