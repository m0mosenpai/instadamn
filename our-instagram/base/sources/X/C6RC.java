package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6RC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RC {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C6RC[] A02;
    public static final C6RC A03;
    public static final C6RC A04;
    public static final C6RC A05;
    public static final C6RC A06;
    public static final C6RC A07;
    public static final C6RC A08;
    public final String A00;

    static {
        C6RC c6rc = new C6RC("SPARKLE", 0, "sparkle");
        A08 = c6rc;
        C6RC c6rc2 = new C6RC("NEON", 1, "neon");
        A05 = c6rc2;
        C6RC c6rc3 = new C6RC("SHIMMER", 2, "shimmer");
        A07 = c6rc3;
        C6RC c6rc4 = new C6RC("PIXEL", 3, "pixel");
        A06 = c6rc4;
        C6RC c6rc5 = new C6RC("GLITCH", 4, "glitch");
        A03 = c6rc5;
        C6RC c6rc6 = new C6RC("HAUNTED", 5, "haunted");
        A04 = c6rc6;
        C6RC[] c6rcArr = {c6rc, c6rc2, c6rc3, c6rc4, c6rc5, c6rc6};
        A02 = c6rcArr;
        A01 = AbstractC12190kN.A00(c6rcArr);
    }

    public static C6RC valueOf(String str) {
        return (C6RC) Enum.valueOf(C6RC.class, str);
    }

    public static C6RC[] values() {
        return (C6RC[]) A02.clone();
    }

    public C6RC(String str, int i, String str2) {
        this.A00 = str2;
    }
}
