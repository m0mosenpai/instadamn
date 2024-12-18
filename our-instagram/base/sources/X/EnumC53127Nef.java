package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nef, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53127Nef {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53127Nef[] A01;
    public static final EnumC53127Nef A02;
    public static final EnumC53127Nef A03;

    static {
        EnumC53127Nef enumC53127Nef = new EnumC53127Nef("UNINSTALL", 0);
        A03 = enumC53127Nef;
        EnumC53127Nef enumC53127Nef2 = new EnumC53127Nef("OVER_FLOW_MENU", 1);
        A02 = enumC53127Nef2;
        EnumC53127Nef[] enumC53127NefArr = {enumC53127Nef, enumC53127Nef2};
        A01 = enumC53127NefArr;
        A00 = AbstractC12190kN.A00(enumC53127NefArr);
    }

    public static EnumC53127Nef valueOf(String str) {
        return (EnumC53127Nef) Enum.valueOf(EnumC53127Nef.class, str);
    }

    public static EnumC53127Nef[] values() {
        return (EnumC53127Nef[]) A01.clone();
    }

    public EnumC53127Nef(String str, int i) {
    }
}
