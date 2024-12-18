package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6S {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6S[] A01;
    public static final C6S A02;
    public static final C6S A03;
    public static final C6S A04;

    static {
        C6S c6s = new C6S("FETCHING", 0);
        A03 = c6s;
        C6S c6s2 = new C6S("SUCCESS", 1);
        A04 = c6s2;
        C6S c6s3 = new C6S("FAIL", 2);
        A02 = c6s3;
        C6S[] c6sArr = {c6s, c6s2, c6s3};
        A01 = c6sArr;
        A00 = AbstractC12190kN.A00(c6sArr);
    }

    public static C6S valueOf(String str) {
        return (C6S) Enum.valueOf(C6S.class, str);
    }

    public static C6S[] values() {
        return (C6S[]) A01.clone();
    }

    public C6S(String str, int i) {
    }
}
