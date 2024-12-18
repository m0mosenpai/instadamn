package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2F7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2F7[] A01;
    public static final C2F7 A02;
    public static final C2F7 A03;

    static {
        C2F7 c2f7 = new C2F7("APP", 0);
        A02 = c2f7;
        C2F7 c2f72 = new C2F7("FOA", 1);
        A03 = c2f72;
        C2F7[] c2f7Arr = {c2f7, c2f72};
        A01 = c2f7Arr;
        A00 = AbstractC12190kN.A00(c2f7Arr);
    }

    public static C2F7 valueOf(String str) {
        return (C2F7) Enum.valueOf(C2F7.class, str);
    }

    public static C2F7[] values() {
        return (C2F7[]) A01.clone();
    }

    public C2F7(String str, int i) {
    }
}
