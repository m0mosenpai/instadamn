package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9Q3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Q3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C9Q3[] A01;
    public static final C9Q3 A02;
    public static final C9Q3 A03;

    static {
        C9Q3 c9q3 = new C9Q3("ENCRYPTED", 0);
        A02 = c9q3;
        C9Q3 c9q32 = new C9Q3("OPEN", 1);
        A03 = c9q32;
        C9Q3[] c9q3Arr = {c9q3, c9q32};
        A01 = c9q3Arr;
        A00 = AbstractC12190kN.A00(c9q3Arr);
    }

    public static C9Q3 valueOf(String str) {
        return (C9Q3) Enum.valueOf(C9Q3.class, str);
    }

    public static C9Q3[] values() {
        return (C9Q3[]) A01.clone();
    }

    public C9Q3(String str, int i) {
    }
}
