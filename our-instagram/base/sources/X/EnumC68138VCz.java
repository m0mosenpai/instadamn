package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68138VCz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68138VCz[] A01;
    public static final EnumC68138VCz A02;
    public static final EnumC68138VCz A03;
    public static final EnumC68138VCz A04;
    public static final EnumC68138VCz A05;

    static {
        EnumC68138VCz enumC68138VCz = new EnumC68138VCz(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = enumC68138VCz;
        EnumC68138VCz enumC68138VCz2 = new EnumC68138VCz("EDIT", 1);
        A03 = enumC68138VCz2;
        EnumC68138VCz enumC68138VCz3 = new EnumC68138VCz("SELECT", 2);
        A05 = enumC68138VCz3;
        EnumC68138VCz enumC68138VCz4 = new EnumC68138VCz("ALWAYS_SELECT", 3);
        A02 = enumC68138VCz4;
        EnumC68138VCz[] enumC68138VCzArr = {enumC68138VCz, enumC68138VCz2, enumC68138VCz3, enumC68138VCz4};
        A01 = enumC68138VCzArr;
        A00 = AbstractC12190kN.A00(enumC68138VCzArr);
    }

    public static EnumC68138VCz valueOf(String str) {
        return (EnumC68138VCz) Enum.valueOf(EnumC68138VCz.class, str);
    }

    public static EnumC68138VCz[] values() {
        return (EnumC68138VCz[]) A01.clone();
    }

    public EnumC68138VCz(String str, int i) {
    }
}
