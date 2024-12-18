package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC154216wW {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC154216wW[] A02;
    public static final EnumC154216wW A03;
    public static final EnumC154216wW A04;
    public static final EnumC154216wW A05;
    public final int A00;

    static {
        EnumC154216wW enumC154216wW = new EnumC154216wW(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A04 = enumC154216wW;
        EnumC154216wW enumC154216wW2 = new EnumC154216wW("SOME", 1, 1);
        A05 = enumC154216wW2;
        EnumC154216wW enumC154216wW3 = new EnumC154216wW("ALL", 2, 2);
        A03 = enumC154216wW3;
        EnumC154216wW[] enumC154216wWArr = {enumC154216wW, enumC154216wW2, enumC154216wW3};
        A02 = enumC154216wWArr;
        A01 = AbstractC12190kN.A00(enumC154216wWArr);
    }

    public static EnumC154216wW valueOf(String str) {
        return (EnumC154216wW) Enum.valueOf(EnumC154216wW.class, str);
    }

    public static EnumC154216wW[] values() {
        return (EnumC154216wW[]) A02.clone();
    }

    public EnumC154216wW(String str, int i, int i2) {
        this.A00 = i2;
    }
}
