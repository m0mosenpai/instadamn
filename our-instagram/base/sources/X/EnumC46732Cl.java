package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2Cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC46732Cl {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46732Cl[] A01;
    public static final EnumC46732Cl A02;
    public static final EnumC46732Cl A03;

    static {
        EnumC46732Cl enumC46732Cl = new EnumC46732Cl(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC46732Cl;
        EnumC46732Cl enumC46732Cl2 = new EnumC46732Cl("FULL_SCREEN_PLAYER", 1);
        A02 = enumC46732Cl2;
        EnumC46732Cl[] enumC46732ClArr = {enumC46732Cl, enumC46732Cl2, new EnumC46732Cl("INLINE_PLAYER", 2)};
        A01 = enumC46732ClArr;
        A00 = AbstractC12190kN.A00(enumC46732ClArr);
    }

    public static EnumC46732Cl valueOf(String str) {
        return (EnumC46732Cl) Enum.valueOf(EnumC46732Cl.class, str);
    }

    public static EnumC46732Cl[] values() {
        return (EnumC46732Cl[]) A01.clone();
    }

    public EnumC46732Cl(String str, int i) {
    }
}
