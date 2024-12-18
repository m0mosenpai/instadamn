package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6B {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6B[] A01;
    public static final C6B A02;
    public static final C6B A03;

    static {
        C6B c6b = new C6B("DEFAULT", 0);
        A02 = c6b;
        C6B c6b2 = new C6B("LIGHT_MODE", 1);
        A03 = c6b2;
        C6B[] c6bArr = {c6b, c6b2};
        A01 = c6bArr;
        A00 = AbstractC12190kN.A00(c6bArr);
    }

    public static C6B valueOf(String str) {
        return (C6B) Enum.valueOf(C6B.class, str);
    }

    public static C6B[] values() {
        return (C6B[]) A01.clone();
    }

    public C6B(String str, int i) {
    }
}
