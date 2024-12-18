package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Y4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Y4 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C8Y4[] A02;
    public static final C8Y4 A03;
    public static final C8Y4 A04;
    public static final C8Y4 A05;
    public final String A00;

    static {
        C8Y4 c8y4 = new C8Y4("STORY", 0, "story");
        A05 = c8y4;
        C8Y4 c8y42 = new C8Y4("FEED", 1, "feed");
        A03 = c8y42;
        C8Y4 c8y43 = new C8Y4("REEL", 2, "reel");
        A04 = c8y43;
        C8Y4[] c8y4Arr = {c8y4, c8y42, c8y43};
        A02 = c8y4Arr;
        A01 = AbstractC12190kN.A00(c8y4Arr);
    }

    public static C8Y4 valueOf(String str) {
        return (C8Y4) Enum.valueOf(C8Y4.class, str);
    }

    public static C8Y4[] values() {
        return (C8Y4[]) A02.clone();
    }

    public C8Y4(String str, int i, String str2) {
        this.A00 = str2;
    }
}
