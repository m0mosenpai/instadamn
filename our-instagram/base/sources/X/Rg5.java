package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Rg5 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ Rg5[] A02;
    public static final Rg5 A03;
    public static final Rg5 A04;
    public final String A00;

    static {
        Rg5 rg5 = new Rg5("MatchKey", 0, "match_key");
        A04 = rg5;
        Rg5 rg52 = new Rg5("EncryptedReport", 1, "encrypted_report");
        A03 = rg52;
        Rg5[] rg5Arr = {rg5, rg52};
        A02 = rg5Arr;
        A01 = AbstractC12190kN.A00(rg5Arr);
    }

    public static Rg5 valueOf(String str) {
        return (Rg5) Enum.valueOf(Rg5.class, str);
    }

    public static Rg5[] values() {
        return (Rg5[]) A02.clone();
    }

    public Rg5(String str, int i, String str2) {
        this.A00 = str2;
    }
}
