package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC73093Pk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC73093Pk[] A01;
    public static final EnumC73093Pk A02;
    public static final EnumC73093Pk A03;
    public static final EnumC73093Pk A04;
    public static final EnumC73093Pk A05;
    public static final EnumC73093Pk A06;
    public static final EnumC73093Pk A07;
    public static final EnumC73093Pk A08;
    public static final EnumC73093Pk A09;
    public static final EnumC73093Pk A0A;

    static {
        EnumC73093Pk enumC73093Pk = new EnumC73093Pk(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A07 = enumC73093Pk;
        EnumC73093Pk enumC73093Pk2 = new EnumC73093Pk("LOCATION", 1);
        A04 = enumC73093Pk2;
        EnumC73093Pk enumC73093Pk3 = new EnumC73093Pk("HASHTAG", 2);
        A03 = enumC73093Pk3;
        EnumC73093Pk enumC73093Pk4 = new EnumC73093Pk("CHALLENGE", 3);
        A02 = enumC73093Pk4;
        EnumC73093Pk enumC73093Pk5 = new EnumC73093Pk("STICKER", 4);
        A0A = enumC73093Pk5;
        EnumC73093Pk enumC73093Pk6 = new EnumC73093Pk("PBIA", 5);
        A08 = enumC73093Pk6;
        EnumC73093Pk enumC73093Pk7 = new EnumC73093Pk("PRODUCT", 6);
        A09 = enumC73093Pk7;
        EnumC73093Pk enumC73093Pk8 = new EnumC73093Pk("MENTIONS", 7);
        A05 = enumC73093Pk8;
        EnumC73093Pk enumC73093Pk9 = new EnumC73093Pk("MULTI_AD", 8);
        A06 = enumC73093Pk9;
        EnumC73093Pk[] enumC73093PkArr = {enumC73093Pk, enumC73093Pk2, enumC73093Pk3, enumC73093Pk4, enumC73093Pk5, enumC73093Pk6, enumC73093Pk7, enumC73093Pk8, enumC73093Pk9};
        A01 = enumC73093PkArr;
        A00 = AbstractC12190kN.A00(enumC73093PkArr);
    }

    public static EnumC73093Pk valueOf(String str) {
        return (EnumC73093Pk) Enum.valueOf(EnumC73093Pk.class, str);
    }

    public static EnumC73093Pk[] values() {
        return (EnumC73093Pk[]) A01.clone();
    }

    public EnumC73093Pk(String str, int i) {
    }
}
