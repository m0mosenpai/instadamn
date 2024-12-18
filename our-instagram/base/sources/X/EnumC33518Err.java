package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Err, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33518Err implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC33518Err[] A01;
    public static final EnumC33518Err A02;
    public static final EnumC33518Err A03;
    public static final EnumC33518Err A04;
    public static final EnumC33518Err A05;
    public static final EnumC33518Err A06;
    public static final EnumC33518Err A07;
    public static final EnumC33518Err A08;
    public static final EnumC33518Err A09;
    public static final EnumC33518Err A0A;
    public static final EnumC33518Err A0B;
    public static final EnumC33518Err A0C;
    public static final EnumC33518Err A0D;
    public static final EnumC33518Err A0E;
    public final long A00;

    static {
        EnumC33518Err A00 = A00("THEME", 0, 0L);
        A0E = A00;
        EnumC33518Err A002 = A00("VANISH_MODE", 1, 1L);
        EnumC33518Err A003 = A00("SHARE_YOUR_CHAT_ACTIVITY", 2, 2L);
        EnumC33518Err A004 = A00("MUTE_MESSAGES", 3, 3L);
        EnumC33518Err A005 = A00("MUTE_CALLS", 4, 4L);
        EnumC33518Err A006 = A00("MUTE_MENTIONS", 5, 5L);
        EnumC33518Err A007 = A00("MUTE_CHAT_ACTIVITY_NOTIFICATIONS", 6, 6L);
        EnumC33518Err A008 = A00("SEARCH_IN_CONVERSATION", 7, 7L);
        EnumC33518Err A009 = A00("SOMETHING_ISNT_WORKING", 8, 8L);
        EnumC33518Err A0010 = A00("POSTS_AND_REELS", 9, 9L);
        EnumC33518Err A0011 = A00("PHOTOS_AND_VIDEOS", 10, 10L);
        EnumC33518Err A0012 = A00("RESTRICT", 11, 11L);
        A0C = A0012;
        EnumC33518Err A0013 = A00("REPORT", 12, 12L);
        A0B = A0013;
        EnumC33518Err A0014 = A00("BLOCK", 13, 13L);
        A04 = A0014;
        EnumC33518Err A0015 = A00("REQUIRE_APPROVAL_TO_JOIN", 14, 14L);
        EnumC33518Err A0016 = A00("MEMBERS", 15, 15L);
        EnumC33518Err A0017 = A00("LEAVE_CHAT", 16, 16L);
        EnumC33518Err A0018 = A00("PROFILE", 17, 17L);
        A0A = A0018;
        EnumC33518Err A0019 = A00("ADD", 18, 18L);
        A02 = A0019;
        EnumC33518Err A0020 = A00("LEAVE", 19, 19L);
        A05 = A0020;
        EnumC33518Err A0021 = A00("SEARCH", 20, 20L);
        A0D = A0021;
        EnumC33518Err A0022 = A00("MUTE", 21, 21L);
        A06 = A0022;
        EnumC33518Err A0023 = A00("OPTIONS", 22, 22L);
        EnumC33518Err A0024 = A00("PEOPLE", 23, 23L);
        A08 = A0024;
        EnumC33518Err A0025 = A00("PRIVACY_AND_SAFETY", 24, 24L);
        A09 = A0025;
        EnumC33518Err A0026 = A00("RESHARED_MEDIA", 25, 25L);
        EnumC33518Err A0027 = A00("SHARED_MEDIA", 26, 26L);
        EnumC33518Err A0028 = A00("USE_END_TO_END_ENCRYPTION", 27, 27L);
        EnumC33518Err A0029 = A00("END_TO_END_ENCRYPTION", 28, 28L);
        EnumC33518Err A0030 = A00("MEMBERSHIP_CONTROLS", 29, 29L);
        EnumC33518Err A0031 = A00("IG_EVENTS", 30, 30L);
        EnumC33518Err A0032 = A00("BUSINESS_ACTIVITY_DATA_SHARING", 31, 31L);
        EnumC33518Err A0033 = A00("CREATE_GROUP", 32, 33L);
        EnumC33518Err A0034 = A00("AI_AUTO_REPLIES", 33, 35L);
        A03 = A0034;
        EnumC33518Err A0035 = A00("NICKNAMES", 34, 36L);
        A07 = A0035;
        EnumC33518Err[] enumC33518ErrArr = new EnumC33518Err[35];
        System.arraycopy(new EnumC33518Err[]{A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035}, AbstractC31175DnJ.A1b(new EnumC33518Err[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, enumC33518ErrArr) ? 1 : 0, enumC33518ErrArr, 27, 8);
        A01 = enumC33518ErrArr;
    }

    public static EnumC33518Err A00(String str, int i, long j) {
        return new EnumC33518Err(str, i, j);
    }

    public static EnumC33518Err valueOf(String str) {
        return (EnumC33518Err) Enum.valueOf(EnumC33518Err.class, str);
    }

    public static EnumC33518Err[] values() {
        return (EnumC33518Err[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    public EnumC33518Err(String str, int i, long j) {
        this.A00 = j;
    }
}
