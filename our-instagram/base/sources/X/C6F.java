package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6F {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6F[] A01;
    public static final C6F A02;
    public static final C6F A03;

    static {
        C6F c6f = new C6F("SUGGESTED_FOR", 0);
        A03 = c6f;
        C6F c6f2 = new C6F("MESSAGE_BAR", 1);
        A02 = c6f2;
        C6F[] c6fArr = {c6f, c6f2};
        A01 = c6fArr;
        A00 = AbstractC12190kN.A00(c6fArr);
    }

    public static C6F valueOf(String str) {
        return (C6F) Enum.valueOf(C6F.class, str);
    }

    public static C6F[] values() {
        return (C6F[]) A01.clone();
    }

    public C6F(String str, int i) {
    }
}
