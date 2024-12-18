package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ji0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44309Ji0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC44309Ji0[] A01;
    public static final EnumC44309Ji0 A02;
    public static final EnumC44309Ji0 A03;
    public static final EnumC44309Ji0 A04;
    public static final EnumC44309Ji0 A05;
    public static final EnumC44309Ji0 A06;

    static {
        EnumC44309Ji0 enumC44309Ji0 = new EnumC44309Ji0("CLOUD", 0);
        A02 = enumC44309Ji0;
        EnumC44309Ji0 enumC44309Ji02 = new EnumC44309Ji0("CLOUD_WARNING", 1);
        A03 = enumC44309Ji02;
        EnumC44309Ji0 enumC44309Ji03 = new EnumC44309Ji0("CUBE", 2);
        A04 = enumC44309Ji03;
        EnumC44309Ji0 enumC44309Ji04 = new EnumC44309Ji0("GLASSES_CAPTURE", 3);
        A05 = enumC44309Ji04;
        EnumC44309Ji0 enumC44309Ji05 = new EnumC44309Ji0(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4);
        A06 = enumC44309Ji05;
        EnumC44309Ji0[] enumC44309Ji0Arr = {enumC44309Ji0, enumC44309Ji02, enumC44309Ji03, enumC44309Ji04, enumC44309Ji05};
        A01 = enumC44309Ji0Arr;
        A00 = AbstractC12190kN.A00(enumC44309Ji0Arr);
    }

    public static EnumC44309Ji0 valueOf(String str) {
        return (EnumC44309Ji0) Enum.valueOf(EnumC44309Ji0.class, str);
    }

    public static EnumC44309Ji0[] values() {
        return (EnumC44309Ji0[]) A01.clone();
    }

    public EnumC44309Ji0(String str, int i) {
    }
}
