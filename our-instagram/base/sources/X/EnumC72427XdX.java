package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XdX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72427XdX implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC72427XdX[] A01;
    public static final EnumC72427XdX A02;
    public final long A00;

    static {
        EnumC72427XdX A00 = A00("COMMUNITY_FOLDER", 0, 17L);
        EnumC72427XdX A002 = A00("COMMUNITY_GROUP", 1, 18L);
        EnumC72427XdX A003 = A00("COMMUNITY_GROUP_UNJOINED", 2, 19L);
        EnumC72427XdX A004 = A00("COMMUNITY_CHANNEL_CATEGORY", 3, 20L);
        EnumC72427XdX A005 = A00("COMMUNITY_PRIVATE_HIDDEN_JOINED_THREAD", 4, 21L);
        EnumC72427XdX A006 = A00("COMMUNITY_PRIVATE_HIDDEN_UNJOINED_THREAD", 5, 22L);
        EnumC72427XdX A007 = A00("COMMUNITY_BROADCAST_JOINED_THREAD", 6, 23L);
        EnumC72427XdX A008 = A00("COMMUNITY_BROADCAST_UNJOINED_THREAD", 7, 24L);
        EnumC72427XdX A009 = A00("COMMUNITY_GROUP_INVITED_UNJOINED", 8, 25L);
        EnumC72427XdX A0010 = A00("COMMUNITY_SUB_THREAD", 9, 26L);
        EnumC72427XdX A0011 = A00("DISCOVERABLE_PUBLIC_CHAT", 10, 150L);
        EnumC72427XdX A0012 = A00("DISCOVERABLE_PUBLIC_CHAT_UNJOINED", 11, 151L);
        EnumC72427XdX A0013 = A00("DISCOVERABLE_PUBLIC_BROADCAST_CHAT", 12, 152L);
        EnumC72427XdX A0014 = A00("DISCOVERABLE_PUBLIC_BROADCAST_CHAT_UNJOINED", 13, 153L);
        EnumC72427XdX A0015 = A00("DISCOVERABLE_PUBLIC_CHAT_V2", 14, 154L);
        EnumC72427XdX A0016 = A00("DISCOVERABLE_PUBLIC_CHAT_V2_UNJOINED", 15, 155L);
        EnumC72427XdX A0017 = A00("ONE_TO_ONE", 16, 1L);
        A02 = A0017;
        EnumC72427XdX A0018 = A00("GROUP", 17, 2L);
        EnumC72427XdX A0019 = A00("ROOM", 18, 3L);
        EnumC72427XdX A0020 = A00("MONTAGE", 19, 4L);
        EnumC72427XdX A0021 = A00("MARKETPLACE", 20, 5L);
        EnumC72427XdX A0022 = A00("FOLDER", 21, 6L);
        EnumC72427XdX A0023 = A00("TINCAN_ONE_TO_ONE", 22, 7L);
        EnumC72427XdX A0024 = A00("TINCAN_GROUP_DISAPPEARING", 23, 8L);
        EnumC72427XdX A0025 = A00("CARRIER_MESSAGING_ONE_TO_ONE", 24, 10L);
        EnumC72427XdX A0026 = A00("CARRIER_MESSAGING_GROUP", 25, 11L);
        EnumC72427XdX A0027 = A00("TINCAN_ONE_TO_ONE_DISAPPEARING", 26, 13L);
        EnumC72427XdX[] enumC72427XdXArr = new EnumC72427XdX[35];
        System.arraycopy(new EnumC72427XdX[]{A00("PAGE_FOLLOW_UP", 27, 14L), A00("SECURE_MESSAGE_OVER_WA_ONE_TO_ONE", 28, 15L), A00("SECURE_MESSAGE_OVER_WA_GROUP", 29, 16L), A00("PINNED", 30, 101L), A00("LWG", 31, 102L), A00("XAC_GROUP", 32, 200L), A00("AI_BOT", 33, 201L), A00("UNKNOWN", 34, -1L)}, AbstractC31175DnJ.A1b(new EnumC72427XdX[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, enumC72427XdXArr) ? 1 : 0, enumC72427XdXArr, 27, 8);
        A01 = enumC72427XdXArr;
    }

    public static EnumC72427XdX A00(String str, int i, long j) {
        return new EnumC72427XdX(str, i, j);
    }

    public static EnumC72427XdX valueOf(String str) {
        return (EnumC72427XdX) Enum.valueOf(EnumC72427XdX.class, str);
    }

    public static EnumC72427XdX[] values() {
        return (EnumC72427XdX[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    public EnumC72427XdX(String str, int i, long j) {
        this.A00 = j;
    }
}
