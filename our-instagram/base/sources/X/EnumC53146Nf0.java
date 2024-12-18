package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nf0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53146Nf0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53146Nf0[] A01;
    public static final EnumC53146Nf0 A02;
    public static final EnumC53146Nf0 A03;
    public static final EnumC53146Nf0 A04;

    static {
        EnumC53146Nf0 enumC53146Nf0 = new EnumC53146Nf0("IDLE", 0);
        A03 = enumC53146Nf0;
        EnumC53146Nf0 enumC53146Nf02 = new EnumC53146Nf0("IN_PROGRESS", 1);
        A04 = enumC53146Nf02;
        EnumC53146Nf0 enumC53146Nf03 = new EnumC53146Nf0("FETCHED", 2);
        A02 = enumC53146Nf03;
        EnumC53146Nf0[] enumC53146Nf0Arr = {enumC53146Nf0, enumC53146Nf02, enumC53146Nf03};
        A01 = enumC53146Nf0Arr;
        A00 = AbstractC12190kN.A00(enumC53146Nf0Arr);
    }

    public static EnumC53146Nf0 valueOf(String str) {
        return (EnumC53146Nf0) Enum.valueOf(EnumC53146Nf0.class, str);
    }

    public static EnumC53146Nf0[] values() {
        return (EnumC53146Nf0[]) A01.clone();
    }

    public EnumC53146Nf0(String str, int i) {
    }
}
