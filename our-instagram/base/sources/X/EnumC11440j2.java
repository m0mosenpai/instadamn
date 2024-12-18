package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0j2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11440j2 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC11440j2[] A02;
    public static final EnumC11440j2 A03;
    public static final EnumC11440j2 A04;
    public static final EnumC11440j2 A05;
    public static final EnumC11440j2 A06;
    public static final EnumC11440j2 A07;
    public static final EnumC11440j2 A08;
    public static final EnumC11440j2 A09;
    public static final EnumC11440j2 A0A;
    public final long A00;

    static {
        EnumC11440j2 enumC11440j2 = new EnumC11440j2(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0L);
        A09 = enumC11440j2;
        EnumC11440j2 enumC11440j22 = new EnumC11440j2("USL_ENABLED", 1, 1L);
        A0A = enumC11440j22;
        EnumC11440j2 enumC11440j23 = new EnumC11440j2("IS_LOGGED_FROM_REACT_NATIVE", 2, 2L);
        A06 = enumC11440j23;
        EnumC11440j2 enumC11440j24 = new EnumC11440j2("IS_LOGGED_FROM_NATIVE_TEMPLATE", 3, 4L);
        A05 = enumC11440j24;
        EnumC11440j2 enumC11440j25 = new EnumC11440j2("IS_LOGGED_FROM_COMPONENT_SCRIPT", 4, 8L);
        A04 = enumC11440j25;
        EnumC11440j2 enumC11440j26 = new EnumC11440j2("IS_LOGGED_FROM_XPLAT", 5, 16L);
        A08 = enumC11440j26;
        EnumC11440j2 enumC11440j27 = new EnumC11440j2("IS_LOGGED_FROM_VIEWPOINT", 6, 32L);
        A07 = enumC11440j27;
        EnumC11440j2 enumC11440j28 = new EnumC11440j2("IS_LOGGED_FROM_BLOKS", 7, OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED);
        A03 = enumC11440j28;
        EnumC11440j2[] enumC11440j2Arr = {enumC11440j2, enumC11440j22, enumC11440j23, enumC11440j24, enumC11440j25, enumC11440j26, enumC11440j27, enumC11440j28};
        A02 = enumC11440j2Arr;
        A01 = AbstractC12190kN.A00(enumC11440j2Arr);
    }

    public static EnumC11440j2 valueOf(String str) {
        return (EnumC11440j2) Enum.valueOf(EnumC11440j2.class, str);
    }

    public static EnumC11440j2[] values() {
        return (EnumC11440j2[]) A02.clone();
    }

    public EnumC11440j2(String str, int i, long j) {
        this.A00 = j;
    }
}
