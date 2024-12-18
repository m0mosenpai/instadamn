package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33324EoJ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33324EoJ[] A01;
    public static final EnumC33324EoJ A02;

    static {
        EnumC33324EoJ enumC33324EoJ = new EnumC33324EoJ("MEMBERS", 0);
        A02 = enumC33324EoJ;
        EnumC33324EoJ[] enumC33324EoJArr = {enumC33324EoJ, new EnumC33324EoJ("ACCOUNTS", 1)};
        A01 = enumC33324EoJArr;
        A00 = AbstractC12190kN.A00(enumC33324EoJArr);
    }

    public static EnumC33324EoJ valueOf(String str) {
        return (EnumC33324EoJ) Enum.valueOf(EnumC33324EoJ.class, str);
    }

    public static EnumC33324EoJ[] values() {
        return (EnumC33324EoJ[]) A01.clone();
    }

    public EnumC33324EoJ(String str, int i) {
    }
}
