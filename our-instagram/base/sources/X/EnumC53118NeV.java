package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53118NeV {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53118NeV[] A01;
    public static final EnumC53118NeV A02;
    public static final EnumC53118NeV A03;

    static {
        EnumC53118NeV enumC53118NeV = new EnumC53118NeV("TOP", 0);
        A03 = enumC53118NeV;
        EnumC53118NeV enumC53118NeV2 = new EnumC53118NeV("RIGHT", 1);
        A02 = enumC53118NeV2;
        EnumC53118NeV[] enumC53118NeVArr = {enumC53118NeV, enumC53118NeV2};
        A01 = enumC53118NeVArr;
        A00 = AbstractC12190kN.A00(enumC53118NeVArr);
    }

    public static EnumC53118NeV valueOf(String str) {
        return (EnumC53118NeV) Enum.valueOf(EnumC53118NeV.class, str);
    }

    public static EnumC53118NeV[] values() {
        return (EnumC53118NeV[]) A01.clone();
    }

    public EnumC53118NeV(String str, int i) {
    }
}
