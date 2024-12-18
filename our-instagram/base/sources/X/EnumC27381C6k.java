package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27381C6k {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27381C6k[] A01;
    public static final EnumC27381C6k A02;
    public static final EnumC27381C6k A03;
    public static final EnumC27381C6k A04;
    public static final EnumC27381C6k A05;

    static {
        EnumC27381C6k enumC27381C6k = new EnumC27381C6k(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC27381C6k;
        EnumC27381C6k enumC27381C6k2 = new EnumC27381C6k("SCALING_UP", 1);
        A05 = enumC27381C6k2;
        EnumC27381C6k enumC27381C6k3 = new EnumC27381C6k("SCALING_DOWN", 2);
        A04 = enumC27381C6k3;
        EnumC27381C6k enumC27381C6k4 = new EnumC27381C6k("FINISHED", 3);
        A02 = enumC27381C6k4;
        EnumC27381C6k[] enumC27381C6kArr = {enumC27381C6k, enumC27381C6k2, enumC27381C6k3, enumC27381C6k4};
        A01 = enumC27381C6kArr;
        A00 = AbstractC12190kN.A00(enumC27381C6kArr);
    }

    public static EnumC27381C6k valueOf(String str) {
        return (EnumC27381C6k) Enum.valueOf(EnumC27381C6k.class, str);
    }

    public static EnumC27381C6k[] values() {
        return (EnumC27381C6k[]) A01.clone();
    }

    public EnumC27381C6k(String str, int i) {
    }
}
