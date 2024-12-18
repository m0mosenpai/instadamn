package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33402EpZ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33402EpZ[] A02;
    public static final EnumC33402EpZ A03;
    public static final EnumC33402EpZ A04;
    public static final EnumC33402EpZ A05;
    public static final EnumC33402EpZ A06;
    public static final EnumC33402EpZ A07;
    public static final EnumC33402EpZ A08;
    public static final EnumC33402EpZ A09;
    public static final EnumC33402EpZ A0A;
    public final String A00;

    static {
        EnumC33402EpZ enumC33402EpZ = new EnumC33402EpZ("UserActionFollow", 0, "create");
        A06 = enumC33402EpZ;
        EnumC33402EpZ enumC33402EpZ2 = new EnumC33402EpZ("UserActionUnfollow", 1, "destroy");
        A0A = enumC33402EpZ2;
        EnumC33402EpZ enumC33402EpZ3 = new EnumC33402EpZ("UserActionCancelRequest", 2, "destroy");
        A05 = enumC33402EpZ3;
        EnumC33402EpZ enumC33402EpZ4 = new EnumC33402EpZ("UserActionIgnore", 3, "ignore");
        A07 = enumC33402EpZ4;
        EnumC33402EpZ enumC33402EpZ5 = new EnumC33402EpZ("UserActionApprove", 4, "approve");
        A03 = enumC33402EpZ5;
        EnumC33402EpZ enumC33402EpZ6 = new EnumC33402EpZ("UserActionBlock", 5, "block");
        A04 = enumC33402EpZ6;
        EnumC33402EpZ enumC33402EpZ7 = new EnumC33402EpZ("UserActionUnblock", 6, "unblock");
        A09 = enumC33402EpZ7;
        EnumC33402EpZ enumC33402EpZ8 = new EnumC33402EpZ("UserActionRemoveFollower", 7, "remove_follower");
        A08 = enumC33402EpZ8;
        EnumC33402EpZ[] enumC33402EpZArr = {enumC33402EpZ, enumC33402EpZ2, enumC33402EpZ3, enumC33402EpZ4, enumC33402EpZ5, enumC33402EpZ6, enumC33402EpZ7, enumC33402EpZ8};
        A02 = enumC33402EpZArr;
        A01 = AbstractC12190kN.A00(enumC33402EpZArr);
    }

    public static EnumC33402EpZ valueOf(String str) {
        return (EnumC33402EpZ) Enum.valueOf(EnumC33402EpZ.class, str);
    }

    public static EnumC33402EpZ[] values() {
        return (EnumC33402EpZ[]) A02.clone();
    }

    public EnumC33402EpZ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
