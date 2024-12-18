package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6C {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6C[] A01;
    public static final C6C A02;
    public static final C6C A03;

    static {
        C6C c6c = new C6C("MEMU_SHUTTER_BUTTON_ENABLED", 0);
        A03 = c6c;
        C6C c6c2 = new C6C("MEMU_SHUTTER_BUTTON_DISABLED", 1);
        A02 = c6c2;
        C6C[] c6cArr = {c6c, c6c2};
        A01 = c6cArr;
        A00 = AbstractC12190kN.A00(c6cArr);
    }

    public static C6C valueOf(String str) {
        return (C6C) Enum.valueOf(C6C.class, str);
    }

    public static C6C[] values() {
        return (C6C[]) A01.clone();
    }

    public C6C(String str, int i) {
    }
}
