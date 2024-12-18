package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53110NeN {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53110NeN[] A01;
    public static final EnumC53110NeN A02;
    public static final EnumC53110NeN A03;

    static {
        EnumC53110NeN enumC53110NeN = new EnumC53110NeN("VIDEO", 0);
        A03 = enumC53110NeN;
        EnumC53110NeN enumC53110NeN2 = new EnumC53110NeN("AUDIO", 1);
        A02 = enumC53110NeN2;
        EnumC53110NeN[] enumC53110NeNArr = {enumC53110NeN, enumC53110NeN2};
        A01 = enumC53110NeNArr;
        A00 = AbstractC12190kN.A00(enumC53110NeNArr);
    }

    public static EnumC53110NeN valueOf(String str) {
        return (EnumC53110NeN) Enum.valueOf(EnumC53110NeN.class, str);
    }

    public static EnumC53110NeN[] values() {
        return (EnumC53110NeN[]) A01.clone();
    }

    public EnumC53110NeN(String str, int i) {
    }
}
