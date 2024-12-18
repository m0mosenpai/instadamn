package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Ni8 {
    public static final /* synthetic */ Ni8[] A01;
    public static final Ni8 A02;
    public static final Ni8 A03;
    public final String A00;

    static {
        Ni8 A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A03 = A00;
        Ni8 A002 = A00("ELIGIBLE", 1);
        A02 = A002;
        Ni8 A003 = A00("ERROR_LINK_ACCOUNT_ALREADY_LINKED_TO_OTHERS", 2);
        Ni8 A004 = A00("ERROR_LINK_ACCOUNT_LIMIT_EXCEEDED", 3);
        Ni8 A005 = A00("ERROR_LINK_AC_CHAINING_VIA_IGPC", 4);
        Ni8 A006 = A00("ERROR_LINK_AGE_CONFLICT_ACCOUNT", 5);
        Ni8 A007 = A00("ERROR_LINK_ALREADY_LINKED_TO_INITIATOR", 6);
        Ni8 A008 = A00("ERROR_LINK_BACKWARD_INCOMPATIBLE", 7);
        Ni8 A009 = A00("ERROR_LINK_CDS_BACKWARD_INCOMPATIBLE", 8);
        Ni8 A0010 = A00("ERROR_LINK_COMBINE_ACS", 9);
        Ni8 A0011 = A00("ERROR_LINK_DEACTIVATED_FB_ACCOUNT", 10);
        Ni8 A0012 = A00("ERROR_LINK_DEACTIVATED_FRL_ACCOUNT", 11);
        Ni8 A0013 = A00("ERROR_LINK_DISABLED_FB_ACCOUNT", 12);
        Ni8 A0014 = A00("ERROR_LINK_DISABLED_IG_ACCOUNT", 13);
        Ni8 A0015 = A00("ERROR_LINK_FB_ACCOUNT_ALREADY_LINKED_TO_OTHERS", 14);
        Ni8 A0016 = A00("ERROR_LINK_FRL_TARGET_ACCOUNT", 15);
        Ni8 A0017 = A00("ERROR_LINK_IG_ACCOUNT_ALREADY_LINKED_TO_OTHERS", 16);
        Ni8 A0018 = A00("ERROR_LINK_IG_AGE_CONFLICT_ACCOUNT", 17);
        Ni8 A0019 = A00("ERROR_LINK_MAX_ACCOUNT_LIMIT", 18);
        Ni8 A0020 = A00("ERROR_LINK_MESSENGER_ONLY_ACCOUNT", 19);
        Ni8 A0021 = A00("ERROR_LINK_MIXED_TEST_NON_TEST", 20);
        Ni8 A0022 = A00("ERROR_LINK_MSPLIT_ACCOUNT", 21);
        Ni8 A0023 = A00("ERROR_LINK_MULTIPLE_FB_ACCOUNTS", 22);
        Ni8 A0024 = A00("ERROR_LINK_MULTIPLE_FRL_ACCOUNTS", 23);
        Ni8 A0025 = A00("ERROR_LINK_MULTIPLE_IG_ACCOUNTS", 24);
        Ni8 A0026 = A00("ERROR_LINK_MULTIPLE_PARENTS_IG_ACCOUNT", 25);
        Ni8 A0027 = A00("ERROR_LINK_MULTIPLE_TARGETS_IN_SAME_ACCOUNT", 26);
        Ni8[] ni8Arr = new Ni8[42];
        System.arraycopy(new Ni8[]{A00("ERROR_LINK_MULTIPLE_WA_ACCOUNTS", 27), A00("ERROR_LINK_PRESIMILE_MIGRATED_ACCOUNTS", 28), A00("ERROR_LINK_RESTRICTED_FB_ACCOUNT", 29), A00("ERROR_LINK_RESTRICTED_FRL_ACCOUNT", 30), A00("ERROR_LINK_RESTRICTED_IG_ACCOUNT", 31), A00("ERROR_LINK_SAME_ACCOUNT", 32), A00("ERROR_LINK_STEAL_FROM_MANI_ACS", 33), A00("ERROR_LINK_UNCONFIRMED_FB_ACCOUNT", 34), A00("ERROR_LINK_UNCONFIRMED_FRL_ACCOUNT", 35), A00("ERROR_LINK_UNCONFIRMED_IG_ACCOUNT", 36), A00("ERROR_LINK_UNSTATED_AGE_IG_ACCOUNT", 37), A00("ERROR_LINK_UNSUPPORTED_FXCAL_TYPE", 38), A00("ERROR_LINK_WAFFLE_AGE_RESTRICTION", 39), A00("ERROR_LINK_WA_ACCOUNT_TO_EU_TARGET_ACCOUNT", 40), A00("ERROR_UNCONFIRMED", 41)}, AbstractC31175DnJ.A1b(new Ni8[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, ni8Arr) ? 1 : 0, ni8Arr, 27, 15);
        A01 = ni8Arr;
    }

    public static Ni8 A00(String str, int i) {
        return new Ni8(str, i, str);
    }

    public static Ni8 valueOf(String str) {
        return (Ni8) Enum.valueOf(Ni8.class, str);
    }

    public static Ni8[] values() {
        return (Ni8[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public Ni8(String str, int i, String str2) {
        this.A00 = str2;
    }
}
