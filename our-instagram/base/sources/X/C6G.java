package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6G {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6G[] A01;
    public static final C6G A02;
    public static final C6G A03;

    public static C6G valueOf(String str) {
        return (C6G) Enum.valueOf(C6G.class, str);
    }

    public static C6G[] values() {
        return (C6G[]) A01.clone();
    }

    static {
        C6G c6g = new C6G("TOP", 0);
        A03 = c6g;
        C6G c6g2 = new C6G("SANDWICH", 1);
        A02 = c6g2;
        C6G[] c6gArr = {c6g, c6g2, new C6G("BOTTOM", 2)};
        A01 = c6gArr;
        A00 = AbstractC12190kN.A00(c6gArr);
    }

    public C6G(String str, int i) {
    }
}
