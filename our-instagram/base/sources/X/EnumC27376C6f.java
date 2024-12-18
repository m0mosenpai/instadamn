package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27376C6f {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27376C6f[] A01;
    public static final EnumC27376C6f A02;
    public static final EnumC27376C6f A03;
    public static final EnumC27376C6f A04;
    public static final EnumC27376C6f A05;

    static {
        EnumC27376C6f enumC27376C6f = new EnumC27376C6f(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = enumC27376C6f;
        EnumC27376C6f enumC27376C6f2 = new EnumC27376C6f("BUTTON", 1);
        A02 = enumC27376C6f2;
        EnumC27376C6f enumC27376C6f3 = new EnumC27376C6f("SINGLE", 2);
        A05 = enumC27376C6f3;
        EnumC27376C6f enumC27376C6f4 = new EnumC27376C6f("MULTI", 3);
        A03 = enumC27376C6f4;
        EnumC27376C6f[] enumC27376C6fArr = {enumC27376C6f, enumC27376C6f2, enumC27376C6f3, enumC27376C6f4};
        A01 = enumC27376C6fArr;
        A00 = AbstractC12190kN.A00(enumC27376C6fArr);
    }

    public static EnumC27376C6f valueOf(String str) {
        return (EnumC27376C6f) Enum.valueOf(EnumC27376C6f.class, str);
    }

    public static EnumC27376C6f[] values() {
        return (EnumC27376C6f[]) A01.clone();
    }

    public EnumC27376C6f(String str, int i) {
    }
}
