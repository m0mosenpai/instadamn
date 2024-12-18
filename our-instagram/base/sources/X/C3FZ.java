package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3FZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C3FZ[] A01;
    public static final C3FZ A02;
    public static final C3FZ A03;
    public static final C3FZ A04;
    public static final C3FZ A05;
    public static final C3FZ A06;
    public static final C3FZ A07;
    public static final C3FZ A08;

    static {
        C3FZ c3fz = new C3FZ("DEFAULT_BEHAVIOR", 0);
        A02 = c3fz;
        C3FZ c3fz2 = new C3FZ("LIGHT", 1);
        A07 = c3fz2;
        C3FZ c3fz3 = new C3FZ("DEFERRED", 2);
        A03 = c3fz3;
        C3FZ c3fz4 = new C3FZ("FORCE_FEED_REFRESH", 3);
        A05 = c3fz4;
        C3FZ c3fz5 = new C3FZ("SUPPRESS_FEED_REFRESH", 4);
        A08 = c3fz5;
        C3FZ c3fz6 = new C3FZ("FORCE_FEED_AND_STORIES_REFRESH", 5);
        A04 = c3fz6;
        C3FZ c3fz7 = new C3FZ("FORCE_STORIES_REFRESH", 6);
        A06 = c3fz7;
        C3FZ[] c3fzArr = {c3fz, c3fz2, c3fz3, c3fz4, c3fz5, c3fz6, c3fz7};
        A01 = c3fzArr;
        A00 = AbstractC12190kN.A00(c3fzArr);
    }

    public static C3FZ valueOf(String str) {
        return (C3FZ) Enum.valueOf(C3FZ.class, str);
    }

    public static C3FZ[] values() {
        return (C3FZ[]) A01.clone();
    }

    public C3FZ(String str, int i) {
    }
}
