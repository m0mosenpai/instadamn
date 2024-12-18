package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xdd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72433Xdd implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC72433Xdd[] A01;
    public static final EnumC72433Xdd A02;
    public static final EnumC72433Xdd A03;
    public static final EnumC72433Xdd A04;
    public static final EnumC72433Xdd A05;
    public static final EnumC72433Xdd A06;
    public static final EnumC72433Xdd A07;
    public final long A00;

    static {
        EnumC72433Xdd A00 = A00("COMMUNITY_FOLDER", 0, 17L);
        EnumC72433Xdd A002 = A00("COMMUNITY_GROUP", 1, 18L);
        EnumC72433Xdd A003 = A00("COMMUNITY_GROUP_UNJOINED", 2, 19L);
        EnumC72433Xdd A004 = A00("COMMUNITY_CHANNEL_CATEGORY", 3, 20L);
        EnumC72433Xdd A005 = A00("COMMUNITY_PRIVATE_HIDDEN_JOINED_THREAD", 4, 21L);
        EnumC72433Xdd A006 = A00("COMMUNITY_PRIVATE_HIDDEN_UNJOINED_THREAD", 5, 22L);
        EnumC72433Xdd A007 = A00("COMMUNITY_BROADCAST_JOINED_THREAD", 6, 23L);
        EnumC72433Xdd A008 = A00("COMMUNITY_BROADCAST_UNJOINED_THREAD", 7, 24L);
        EnumC72433Xdd A009 = A00("COMMUNITY_GROUP_INVITED_UNJOINED", 8, 25L);
        EnumC72433Xdd A0010 = A00("COMMUNITY_SUB_THREAD", 9, 26L);
        EnumC72433Xdd A0011 = A00("DISCOVERABLE_PUBLIC_CHAT", 10, 150L);
        EnumC72433Xdd A0012 = A00("DISCOVERABLE_PUBLIC_CHAT_UNJOINED", 11, 151L);
        EnumC72433Xdd A0013 = A00("DISCOVERABLE_PUBLIC_BROADCAST_CHAT", 12, 152L);
        EnumC72433Xdd A0014 = A00("DISCOVERABLE_PUBLIC_BROADCAST_CHAT_UNJOINED", 13, 153L);
        EnumC72433Xdd A0015 = A00("DISCOVERABLE_PUBLIC_CHAT_V2", 14, 154L);
        EnumC72433Xdd A0016 = A00("DISCOVERABLE_PUBLIC_CHAT_V2_UNJOINED", 15, 155L);
        EnumC72433Xdd A0017 = A00("ONE_TO_ONE", 16, 1L);
        A06 = A0017;
        EnumC72433Xdd A0018 = A00("GROUP", 17, 2L);
        A05 = A0018;
        EnumC72433Xdd A0019 = A00("ROOM", 18, 3L);
        EnumC72433Xdd A0020 = A00("MONTAGE", 19, 4L);
        EnumC72433Xdd A0021 = A00("MARKETPLACE", 20, 5L);
        EnumC72433Xdd A0022 = A00("FOLDER", 21, 6L);
        EnumC72433Xdd A0023 = A00("TINCAN_ONE_TO_ONE", 22, 7L);
        EnumC72433Xdd A0024 = A00("TINCAN_GROUP_DISAPPEARING", 23, 8L);
        EnumC72433Xdd A0025 = A00("CARRIER_MESSAGING_ONE_TO_ONE", 24, 10L);
        EnumC72433Xdd A0026 = A00("CARRIER_MESSAGING_GROUP", 25, 11L);
        EnumC72433Xdd A0027 = A00("TINCAN_ONE_TO_ONE_DISAPPEARING", 26, 13L);
        EnumC72433Xdd A0028 = A00("PAGE_FOLLOW_UP", 27, 14L);
        EnumC72433Xdd A0029 = A00("SECURE_MESSAGE_OVER_WA_ONE_TO_ONE", 28, 15L);
        EnumC72433Xdd A0030 = A00("SECURE_MESSAGE_OVER_WA_GROUP", 29, 16L);
        EnumC72433Xdd A0031 = A00("PINNED", 30, 101L);
        EnumC72433Xdd A0032 = A00("LWG", 31, 102L);
        EnumC72433Xdd A0033 = A00("XAC_GROUP", 32, 200L);
        EnumC72433Xdd A0034 = A00("AI_BOT", 33, 201L);
        A02 = A0034;
        EnumC72433Xdd A0035 = A00("UNKNOWN", 34, 0L);
        A07 = A0035;
        EnumC72433Xdd A0036 = A00("SELF_THREAD", 35, 12L);
        EnumC72433Xdd A0037 = A00("ARMADILLO_ONE_TO_ONE", 36, -1L);
        A04 = A0037;
        EnumC72433Xdd A0038 = A00("ARMADILLO_GROUP", 37, -2L);
        A03 = A0038;
        EnumC72433Xdd[] enumC72433XddArr = new EnumC72433Xdd[38];
        System.arraycopy(new EnumC72433Xdd[]{A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038}, AbstractC31175DnJ.A1b(new EnumC72433Xdd[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, enumC72433XddArr) ? 1 : 0, enumC72433XddArr, 27, 11);
        A01 = enumC72433XddArr;
    }

    public static EnumC72433Xdd A00(String str, int i, long j) {
        return new EnumC72433Xdd(str, i, j);
    }

    public static EnumC72433Xdd valueOf(String str) {
        return (EnumC72433Xdd) Enum.valueOf(EnumC72433Xdd.class, str);
    }

    public static EnumC72433Xdd[] values() {
        return (EnumC72433Xdd[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    public EnumC72433Xdd(String str, int i, long j) {
        this.A00 = j;
    }
}
