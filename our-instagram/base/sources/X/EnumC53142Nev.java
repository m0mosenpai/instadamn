package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nev, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53142Nev {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53142Nev[] A01;
    public static final EnumC53142Nev A02;
    public static final EnumC53142Nev A03;
    public static final EnumC53142Nev A04;

    static {
        EnumC53142Nev enumC53142Nev = new EnumC53142Nev(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = enumC53142Nev;
        EnumC53142Nev enumC53142Nev2 = new EnumC53142Nev("BOTTOM_SHEET", 1);
        A02 = enumC53142Nev2;
        EnumC53142Nev enumC53142Nev3 = new EnumC53142Nev("DIALOG", 2);
        A03 = enumC53142Nev3;
        EnumC53142Nev[] enumC53142NevArr = {enumC53142Nev, enumC53142Nev2, enumC53142Nev3, new EnumC53142Nev("PARTICIPANT_GRID_TEXT", 3)};
        A01 = enumC53142NevArr;
        A00 = AbstractC12190kN.A00(enumC53142NevArr);
    }

    public static EnumC53142Nev valueOf(String str) {
        return (EnumC53142Nev) Enum.valueOf(EnumC53142Nev.class, str);
    }

    public static EnumC53142Nev[] values() {
        return (EnumC53142Nev[]) A01.clone();
    }

    public EnumC53142Nev(String str, int i) {
    }
}
