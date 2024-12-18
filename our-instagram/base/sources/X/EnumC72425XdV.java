package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XdV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72425XdV implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC72425XdV[] A01;
    public final String A00;

    static {
        EnumC72425XdV A00 = A00("AI_BOT", 0);
        EnumC72425XdV A002 = A00("ARMADILLO_GROUP", 1);
        EnumC72425XdV A003 = A00("ARMADILLO_ONE_TO_ONE", 2);
        EnumC72425XdV A004 = A00("CARRIER_MESSAGING_GROUP", 3);
        EnumC72425XdV A005 = A00("CARRIER_MESSAGING_ONE_TO_ONE", 4);
        EnumC72425XdV A006 = A00("COMMUNITY_BROADCAST_JOINED_THREAD", 5);
        EnumC72425XdV A007 = A00("COMMUNITY_BROADCAST_UNJOINED_THREAD", 6);
        EnumC72425XdV A008 = A00("COMMUNITY_CHANNEL_CATEGORY", 7);
        EnumC72425XdV A009 = A00("COMMUNITY_FOLDER", 8);
        EnumC72425XdV A0010 = A00("COMMUNITY_GROUP", 9);
        EnumC72425XdV A0011 = A00("COMMUNITY_GROUP_INVITED_UNJOINED", 10);
        EnumC72425XdV A0012 = A00("COMMUNITY_GROUP_UNJOINED", 11);
        EnumC72425XdV A0013 = A00("COMMUNITY_PRIVATE_HIDDEN_JOINED_THREAD", 12);
        EnumC72425XdV A0014 = A00("COMMUNITY_PRIVATE_HIDDEN_UNJOINED_THREAD", 13);
        EnumC72425XdV A0015 = A00("COMMUNITY_SUB_THREAD", 14);
        EnumC72425XdV A0016 = A00("DISCOVERABLE_PUBLIC_BROADCAST_CHAT", 15);
        EnumC72425XdV A0017 = A00("DISCOVERABLE_PUBLIC_BROADCAST_CHAT_UNJOINED", 16);
        EnumC72425XdV A0018 = A00("DISCOVERABLE_PUBLIC_CHAT", 17);
        EnumC72425XdV A0019 = A00("DISCOVERABLE_PUBLIC_CHAT_UNJOINED", 18);
        EnumC72425XdV A0020 = A00("DISCOVERABLE_PUBLIC_CHAT_V2", 19);
        EnumC72425XdV A0021 = A00("DISCOVERABLE_PUBLIC_CHAT_V2_UNJOINED", 20);
        EnumC72425XdV A0022 = A00("FOLDER", 21);
        EnumC72425XdV A0023 = A00("GROUP", 22);
        EnumC72425XdV A0024 = A00("LWG", 23);
        EnumC72425XdV A0025 = A00("MARKETPLACE", 24);
        EnumC72425XdV A0026 = A00("MONTAGE", 25);
        EnumC72425XdV A0027 = A00("ONE_TO_ONE", 26);
        EnumC72425XdV[] enumC72425XdVArr = new EnumC72425XdV[38];
        System.arraycopy(new EnumC72425XdV[]{A00("PAGE_FOLLOW_UP", 27), A00("PINNED", 28), A00("ROOM", 29), A00("SECURE_MESSAGE_OVER_WA_GROUP", 30), A00("SECURE_MESSAGE_OVER_WA_ONE_TO_ONE", 31), A00("SELF_THREAD", 32), A00("TINCAN_GROUP_DISAPPEARING", 33), A00("TINCAN_ONE_TO_ONE", 34), A00("TINCAN_ONE_TO_ONE_DISAPPEARING", 35), A00("UNKNOWN", 36), A00("XAC_GROUP", 37)}, AbstractC31175DnJ.A1b(new EnumC72425XdV[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, enumC72425XdVArr) ? 1 : 0, enumC72425XdVArr, 27, 11);
        A01 = enumC72425XdVArr;
    }

    public static EnumC72425XdV A00(String str, int i) {
        return new EnumC72425XdV(str, i, str);
    }

    public static EnumC72425XdV valueOf(String str) {
        return (EnumC72425XdV) Enum.valueOf(EnumC72425XdV.class, str);
    }

    public static EnumC72425XdV[] values() {
        return (EnumC72425XdV[]) A01.clone();
    }

    public EnumC72425XdV(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
