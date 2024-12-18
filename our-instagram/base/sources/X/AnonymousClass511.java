package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.511, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass511 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ AnonymousClass511[] A02;
    public static final AnonymousClass511 A03;
    public static final AnonymousClass511 A04;
    public static final AnonymousClass511 A05;
    public static final AnonymousClass511 A06;
    public static final AnonymousClass511 A07;
    public static final AnonymousClass511 A08;
    public static final AnonymousClass511 A09;
    public final String A00;

    static {
        AnonymousClass511 anonymousClass511 = new AnonymousClass511("STORY", 0, "story");
        A08 = anonymousClass511;
        AnonymousClass511 anonymousClass5112 = new AnonymousClass511("MAIN_FEED", 1, "main_feed");
        A06 = anonymousClass5112;
        AnonymousClass511 anonymousClass5113 = new AnonymousClass511("EXPLORE", 2, "explore");
        A04 = anonymousClass5113;
        AnonymousClass511 anonymousClass5114 = new AnonymousClass511("PROFILE", 3, "profile");
        A07 = anonymousClass5114;
        AnonymousClass511 anonymousClass5115 = new AnonymousClass511("DIRECT_XMA_CLIPS", 4, "direct_xma_clips");
        A03 = anonymousClass5115;
        AnonymousClass511 anonymousClass5116 = new AnonymousClass511("FEED_PARSING_TEST", 5, "feed_parsing_test");
        A05 = anonymousClass5116;
        AnonymousClass511 anonymousClass5117 = new AnonymousClass511("UNKNOWN", 6, "unknown");
        A09 = anonymousClass5117;
        AnonymousClass511[] anonymousClass511Arr = {anonymousClass511, anonymousClass5112, anonymousClass5113, anonymousClass5114, anonymousClass5115, anonymousClass5116, anonymousClass5117};
        A02 = anonymousClass511Arr;
        A01 = AbstractC12190kN.A00(anonymousClass511Arr);
    }

    public static AnonymousClass511 valueOf(String str) {
        return (AnonymousClass511) Enum.valueOf(AnonymousClass511.class, str);
    }

    public static AnonymousClass511[] values() {
        return (AnonymousClass511[]) A02.clone();
    }

    public AnonymousClass511(String str, int i, String str2) {
        this.A00 = str2;
    }
}
