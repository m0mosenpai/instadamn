package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46162Kc0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46162Kc0[] A01;
    public static final EnumC46162Kc0 A02;
    public static final EnumC46162Kc0 A03;
    public static final EnumC46162Kc0 A04;
    public static final EnumC46162Kc0 A05;

    static {
        EnumC46162Kc0 enumC46162Kc0 = new EnumC46162Kc0("SHARE", 0);
        A04 = enumC46162Kc0;
        EnumC46162Kc0 enumC46162Kc02 = new EnumC46162Kc0("TAG", 1);
        A05 = enumC46162Kc02;
        EnumC46162Kc0 enumC46162Kc03 = new EnumC46162Kc0("REACT", 2);
        A02 = enumC46162Kc03;
        EnumC46162Kc0 enumC46162Kc04 = new EnumC46162Kc0("REPLY", 3);
        A03 = enumC46162Kc04;
        EnumC46162Kc0[] enumC46162Kc0Arr = {enumC46162Kc0, enumC46162Kc02, enumC46162Kc03, enumC46162Kc04};
        A01 = enumC46162Kc0Arr;
        A00 = AbstractC12190kN.A00(enumC46162Kc0Arr);
    }

    public static EnumC46162Kc0 valueOf(String str) {
        return (EnumC46162Kc0) Enum.valueOf(EnumC46162Kc0.class, str);
    }

    public static EnumC46162Kc0[] values() {
        return (EnumC46162Kc0[]) A01.clone();
    }

    public EnumC46162Kc0(String str, int i) {
    }
}
