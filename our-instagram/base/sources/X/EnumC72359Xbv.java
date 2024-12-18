package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xbv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72359Xbv {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC72359Xbv[] A01;
    public static final EnumC72359Xbv A02;
    public static final EnumC72359Xbv A03;
    public static final EnumC72359Xbv A04;

    static {
        EnumC72359Xbv enumC72359Xbv = new EnumC72359Xbv("ANDROID", 0);
        A02 = enumC72359Xbv;
        EnumC72359Xbv enumC72359Xbv2 = new EnumC72359Xbv("IOS", 1);
        A03 = enumC72359Xbv2;
        EnumC72359Xbv enumC72359Xbv3 = new EnumC72359Xbv("WEB", 2);
        A04 = enumC72359Xbv3;
        EnumC72359Xbv[] enumC72359XbvArr = {enumC72359Xbv, enumC72359Xbv2, enumC72359Xbv3};
        A01 = enumC72359XbvArr;
        A00 = AbstractC12190kN.A00(enumC72359XbvArr);
    }

    public static EnumC72359Xbv valueOf(String str) {
        return (EnumC72359Xbv) Enum.valueOf(EnumC72359Xbv.class, str);
    }

    public static EnumC72359Xbv[] values() {
        return (EnumC72359Xbv[]) A01.clone();
    }

    public EnumC72359Xbv(String str, int i) {
    }
}
