package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xbt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72357Xbt {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC72357Xbt[] A01;
    public static final EnumC72357Xbt A02;
    public static final EnumC72357Xbt A03;

    static {
        EnumC72357Xbt enumC72357Xbt = new EnumC72357Xbt("STORE", 0);
        A03 = enumC72357Xbt;
        EnumC72357Xbt enumC72357Xbt2 = new EnumC72357Xbt("MODAL", 1);
        A02 = enumC72357Xbt2;
        EnumC72357Xbt[] enumC72357XbtArr = {enumC72357Xbt, enumC72357Xbt2};
        A01 = enumC72357XbtArr;
        A00 = AbstractC12190kN.A00(enumC72357XbtArr);
    }

    public static EnumC72357Xbt valueOf(String str) {
        return (EnumC72357Xbt) Enum.valueOf(EnumC72357Xbt.class, str);
    }

    public static EnumC72357Xbt[] values() {
        return (EnumC72357Xbt[]) A01.clone();
    }

    public EnumC72357Xbt(String str, int i) {
    }
}
