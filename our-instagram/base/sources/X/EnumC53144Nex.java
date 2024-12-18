package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nex, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53144Nex {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53144Nex[] A01;
    public static final EnumC53144Nex A02;
    public static final EnumC53144Nex A03;
    public static final EnumC53144Nex A04;

    static {
        EnumC53144Nex enumC53144Nex = new EnumC53144Nex("REQUEST_PENDING", 0);
        A04 = enumC53144Nex;
        EnumC53144Nex enumC53144Nex2 = new EnumC53144Nex("ENABLED", 1);
        A03 = enumC53144Nex2;
        EnumC53144Nex enumC53144Nex3 = new EnumC53144Nex("DISABLED", 2);
        A02 = enumC53144Nex3;
        EnumC53144Nex[] enumC53144NexArr = {enumC53144Nex, enumC53144Nex2, enumC53144Nex3};
        A01 = enumC53144NexArr;
        A00 = AbstractC12190kN.A00(enumC53144NexArr);
    }

    public static EnumC53144Nex valueOf(String str) {
        return (EnumC53144Nex) Enum.valueOf(EnumC53144Nex.class, str);
    }

    public static EnumC53144Nex[] values() {
        return (EnumC53144Nex[]) A01.clone();
    }

    public EnumC53144Nex(String str, int i) {
    }
}
