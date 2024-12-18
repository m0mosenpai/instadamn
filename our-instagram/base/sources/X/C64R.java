package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.64R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64R {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C64R[] A01;
    public static final C64R A02;
    public static final C64R A03;

    static {
        C64R c64r = new C64R("DEFAULT", 0);
        A02 = c64r;
        C64R c64r2 = new C64R("ON_MEDIA", 1);
        A03 = c64r2;
        C64R[] c64rArr = {c64r, c64r2};
        A01 = c64rArr;
        A00 = AbstractC12190kN.A00(c64rArr);
    }

    public static C64R valueOf(String str) {
        return (C64R) Enum.valueOf(C64R.class, str);
    }

    public static C64R[] values() {
        return (C64R[]) A01.clone();
    }

    public C64R(String str, int i) {
    }
}
