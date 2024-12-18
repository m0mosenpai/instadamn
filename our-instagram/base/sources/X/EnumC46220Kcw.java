package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46220Kcw {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC46220Kcw[] A05;
    public static final EnumC46220Kcw A06;
    public static final EnumC46220Kcw A07;
    public static final EnumC46220Kcw A08;
    public static final EnumC46220Kcw A09;
    public static final EnumC46220Kcw A0A;
    public static final EnumC46220Kcw A0B;
    public static final EnumC46220Kcw A0C;
    public static final EnumC46220Kcw A0D;
    public static final EnumC46220Kcw A0E;
    public static final EnumC46220Kcw A0F;
    public static final EnumC46220Kcw A0G;
    public final int A00;
    public final C2EB A01;
    public final C4I3 A02;
    public final String A03;

    public static EnumC46220Kcw valueOf(String str) {
        return (EnumC46220Kcw) Enum.valueOf(EnumC46220Kcw.class, str);
    }

    public static EnumC46220Kcw[] values() {
        return (EnumC46220Kcw[]) A05.clone();
    }

    static {
        C2EB c2eb = C2EB.A04;
        C4I3 c4i3 = C4I3.A03;
        EnumC46220Kcw enumC46220Kcw = new EnumC46220Kcw(c2eb, c4i3, "ALL_REQUESTS", "all_requests", 0, 2131960079);
        A06 = enumC46220Kcw;
        C2EB c2eb2 = C2EB.A0B;
        C4I3 c4i32 = C4I3.A0M;
        EnumC46220Kcw enumC46220Kcw2 = new EnumC46220Kcw(c2eb2, c4i32, "TOP_REQUESTS", "top_requests", 1, 2131960082);
        A0G = enumC46220Kcw2;
        EnumC46220Kcw enumC46220Kcw3 = new EnumC46220Kcw(c2eb, C4I3.A0O, "SUBSCRIBER_REQUESTS", "subsribers", 2, 2131960083);
        A0F = enumC46220Kcw3;
        EnumC46220Kcw enumC46220Kcw4 = new EnumC46220Kcw(C2EB.A05, c4i3, "FILTERED_ALL_REQUESTS", "filtered_all_requests", 3, 2131964409);
        A08 = enumC46220Kcw4;
        EnumC46220Kcw enumC46220Kcw5 = new EnumC46220Kcw(C2EB.A09, c4i3, "FILTERED_TOP_REQUESTS", "filtered_top_requests", 4, 2131960097);
        A0E = enumC46220Kcw5;
        EnumC46220Kcw enumC46220Kcw6 = new EnumC46220Kcw(C2EB.A07, c4i3, "FILTERED_STORY_REPLIES", "filtered_top_requests", 5, 2131960096);
        A0C = enumC46220Kcw6;
        EnumC46220Kcw enumC46220Kcw7 = new EnumC46220Kcw(c2eb, C4I3.A08, "CREATOR_AI_REQUESTS", "creator_ai", 6, 2131960080);
        A07 = enumC46220Kcw7;
        EnumC46220Kcw enumC46220Kcw8 = new EnumC46220Kcw(C2EB.A06, c4i32, "FILTERED_ALL_REQUESTS_RELEVANT", "filtered_all_requests_relevant", 7, 2131964409);
        A09 = enumC46220Kcw8;
        EnumC46220Kcw enumC46220Kcw9 = new EnumC46220Kcw(C2EB.A08, c4i32, "FILTERED_STORY_REPLIES_RELEVANT", "filtered_story_replies_relevant", 8, 2131960096);
        A0D = enumC46220Kcw9;
        EnumC46220Kcw enumC46220Kcw10 = new EnumC46220Kcw(c2eb, c4i3, "FILTERED_SPAM_REQUESTS", "filtered_spam_requests", 9, 2131960095);
        A0A = enumC46220Kcw10;
        EnumC46220Kcw enumC46220Kcw11 = new EnumC46220Kcw(c2eb2, c4i32, "FILTERED_SPAM_REQUESTS_RELEVANT", "filtered_spam_requests_relevant", 10, 2131960095);
        A0B = enumC46220Kcw11;
        EnumC46220Kcw[] enumC46220KcwArr = {enumC46220Kcw, enumC46220Kcw2, enumC46220Kcw3, enumC46220Kcw4, enumC46220Kcw5, enumC46220Kcw6, enumC46220Kcw7, enumC46220Kcw8, enumC46220Kcw9, enumC46220Kcw10, enumC46220Kcw11};
        A05 = enumC46220KcwArr;
        A04 = AbstractC12190kN.A00(enumC46220KcwArr);
    }

    public EnumC46220Kcw(C2EB c2eb, C4I3 c4i3, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A01 = c2eb;
        this.A02 = c4i3;
        this.A03 = str2;
    }
}
