package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7G3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7G3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7G3[] A01;
    public static final C7G3 A02;
    public static final C7G3 A03;
    public static final C7G3 A04;

    static {
        C7G3 c7g3 = new C7G3("TYPING", 0);
        A04 = c7g3;
        C7G3 c7g32 = new C7G3("CLOSED", 1);
        A02 = c7g32;
        C7G3 c7g33 = new C7G3("EXPANDED", 2);
        A03 = c7g33;
        C7G3[] c7g3Arr = {c7g3, c7g32, c7g33};
        A01 = c7g3Arr;
        A00 = AbstractC12190kN.A00(c7g3Arr);
    }

    public static C7G3 valueOf(String str) {
        return (C7G3) Enum.valueOf(C7G3.class, str);
    }

    public static C7G3[] values() {
        return (C7G3[]) A01.clone();
    }

    public C7G3(String str, int i) {
    }
}
