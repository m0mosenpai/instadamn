package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7YT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YT {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C7YT[] A03;
    public static final C7YT A04;
    public static final C7YT A05;
    public final Integer A00;
    public final Integer A01;

    static {
        Integer num = C05F.A00;
        C7YT c7yt = new C7YT(num, null, "SWIPE_UP_IN_THREAD_VIEW", 0);
        A04 = c7yt;
        C7YT c7yt2 = new C7YT(C05F.A01, num, "TAP_ON_CTA", 1);
        A05 = c7yt2;
        C7YT[] c7ytArr = {c7yt, c7yt2};
        A03 = c7ytArr;
        A02 = AbstractC12190kN.A00(c7ytArr);
    }

    public static C7YT valueOf(String str) {
        return (C7YT) Enum.valueOf(C7YT.class, str);
    }

    public static C7YT[] values() {
        return (C7YT[]) A03.clone();
    }

    public C7YT(Integer num, Integer num2, String str, int i) {
        this.A00 = num;
        this.A01 = num2;
    }
}
