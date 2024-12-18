package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33384EpH {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33384EpH[] A02;
    public static final EnumC33384EpH A03;
    public static final EnumC33384EpH A04;
    public static final EnumC33384EpH A05;
    public final String A00;

    static {
        EnumC33384EpH enumC33384EpH = new EnumC33384EpH("NUX", 0, "nux");
        A04 = enumC33384EpH;
        EnumC33384EpH enumC33384EpH2 = new EnumC33384EpH("PREVIEW", 1, "preview");
        A05 = enumC33384EpH2;
        EnumC33384EpH enumC33384EpH3 = new EnumC33384EpH(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE);
        A03 = enumC33384EpH3;
        EnumC33384EpH[] enumC33384EpHArr = {enumC33384EpH, enumC33384EpH2, enumC33384EpH3};
        A02 = enumC33384EpHArr;
        A01 = AbstractC12190kN.A00(enumC33384EpHArr);
    }

    public static EnumC33384EpH valueOf(String str) {
        return (EnumC33384EpH) Enum.valueOf(EnumC33384EpH.class, str);
    }

    public static EnumC33384EpH[] values() {
        return (EnumC33384EpH[]) A02.clone();
    }

    public EnumC33384EpH(String str, int i, String str2) {
        this.A00 = str2;
    }
}
