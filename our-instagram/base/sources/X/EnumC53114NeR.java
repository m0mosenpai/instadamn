package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53114NeR {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53114NeR[] A01;
    public static final EnumC53114NeR A02;
    public static final EnumC53114NeR A03;

    static {
        EnumC53114NeR enumC53114NeR = new EnumC53114NeR("LIST", 0);
        A03 = enumC53114NeR;
        EnumC53114NeR enumC53114NeR2 = new EnumC53114NeR("GRID", 1);
        A02 = enumC53114NeR2;
        EnumC53114NeR[] enumC53114NeRArr = {enumC53114NeR, enumC53114NeR2};
        A01 = enumC53114NeRArr;
        A00 = AbstractC12190kN.A00(enumC53114NeRArr);
    }

    public static EnumC53114NeR valueOf(String str) {
        return (EnumC53114NeR) Enum.valueOf(EnumC53114NeR.class, str);
    }

    public static EnumC53114NeR[] values() {
        return (EnumC53114NeR[]) A01.clone();
    }

    public EnumC53114NeR(String str, int i) {
    }
}
