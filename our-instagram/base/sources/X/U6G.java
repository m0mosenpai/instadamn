package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class U6G {
    public static final U6G[] A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ U6G[] A03;
    public static final U6G A04;
    public static final U6G A05;
    public static final U6G A06;
    public final String A00;

    public static U6G valueOf(String str) {
        return (U6G) Enum.valueOf(U6G.class, str);
    }

    public static U6G[] values() {
        return (U6G[]) A03.clone();
    }

    static {
        U6G u6g = new U6G("AUTO", 0, "auto");
        A04 = u6g;
        U6G u6g2 = new U6G("ENABLED", 1, "enabled");
        A06 = u6g2;
        U6G u6g3 = new U6G("DISABLED", 2, "disabled");
        A05 = u6g3;
        U6G[] u6gArr = {u6g, u6g2, u6g3};
        A03 = u6gArr;
        C020508b A00 = AbstractC12190kN.A00(u6gArr);
        A02 = A00;
        A01 = (U6G[]) A00.toArray(new U6G[0]);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public U6G(String str, int i, String str2) {
        this.A00 = str2;
    }
}
