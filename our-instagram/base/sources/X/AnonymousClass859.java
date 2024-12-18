package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.859, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass859 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ AnonymousClass859[] A02;
    public static final AnonymousClass859 A03;
    public static final AnonymousClass859 A04;
    public static final AnonymousClass859 A05;
    public static final AnonymousClass859 A06;
    public static final AnonymousClass859 A07;
    public static final AnonymousClass859 A08;
    public final C85A A00;

    static {
        AnonymousClass859 anonymousClass859 = new AnonymousClass859(C85A.STORIES, "STORIES", 0);
        A08 = anonymousClass859;
        AnonymousClass859 anonymousClass8592 = new AnonymousClass859(C85A.DIRECT, "DIRECT_THREAD", 1);
        A04 = anonymousClass8592;
        AnonymousClass859 anonymousClass8593 = new AnonymousClass859(C85A.LIVE, "LIVE", 2);
        A05 = anonymousClass8593;
        AnonymousClass859 anonymousClass8594 = new AnonymousClass859(C85A.REELS, "REELS", 3);
        A06 = anonymousClass8594;
        AnonymousClass859 anonymousClass8595 = new AnonymousClass859(C85A.REELS_POSTCAPTURE, "REELS_POSTCAPTURE", 4);
        A07 = anonymousClass8595;
        AnonymousClass859 anonymousClass8596 = new AnonymousClass859(C85A.DIRECT_RTC, "DIRECT_RTC", 5);
        A03 = anonymousClass8596;
        AnonymousClass859[] anonymousClass859Arr = {anonymousClass859, anonymousClass8592, anonymousClass8593, anonymousClass8594, anonymousClass8595, anonymousClass8596, new AnonymousClass859(C85A.DIRECT_POSTCAPTURE, "DIRECT_POSTCAPTURE", 6)};
        A02 = anonymousClass859Arr;
        A01 = AbstractC12190kN.A00(anonymousClass859Arr);
    }

    public static AnonymousClass859 valueOf(String str) {
        return (AnonymousClass859) Enum.valueOf(AnonymousClass859.class, str);
    }

    public static AnonymousClass859[] values() {
        return (AnonymousClass859[]) A02.clone();
    }

    public AnonymousClass859(C85A c85a, String str, int i) {
        this.A00 = c85a;
    }
}
