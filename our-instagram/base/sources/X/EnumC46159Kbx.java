package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46159Kbx {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46159Kbx[] A01;
    public static final EnumC46159Kbx A02;
    public static final EnumC46159Kbx A03;
    public static final EnumC46159Kbx A04;
    public static final EnumC46159Kbx A05;

    static {
        EnumC46159Kbx enumC46159Kbx = new EnumC46159Kbx("RECENT", 0);
        A03 = enumC46159Kbx;
        EnumC46159Kbx enumC46159Kbx2 = new EnumC46159Kbx("SAVED", 1);
        A04 = enumC46159Kbx2;
        EnumC46159Kbx enumC46159Kbx3 = new EnumC46159Kbx("SEARCH", 2);
        A05 = enumC46159Kbx3;
        EnumC46159Kbx enumC46159Kbx4 = new EnumC46159Kbx(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3);
        A02 = enumC46159Kbx4;
        EnumC46159Kbx[] enumC46159KbxArr = {enumC46159Kbx, enumC46159Kbx2, enumC46159Kbx3, enumC46159Kbx4};
        A01 = enumC46159KbxArr;
        A00 = AbstractC12190kN.A00(enumC46159KbxArr);
    }

    public static EnumC46159Kbx valueOf(String str) {
        return (EnumC46159Kbx) Enum.valueOf(EnumC46159Kbx.class, str);
    }

    public static EnumC46159Kbx[] values() {
        return (EnumC46159Kbx[]) A01.clone();
    }

    public EnumC46159Kbx(String str, int i) {
    }
}
