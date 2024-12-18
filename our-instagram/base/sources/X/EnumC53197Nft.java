package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nft, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53197Nft {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53197Nft[] A02;
    public static final EnumC53197Nft A03;
    public static final EnumC53197Nft A04;
    public final int A00;

    static {
        EnumC53197Nft enumC53197Nft = new EnumC53197Nft("SOURCE", 0, 0);
        A03 = enumC53197Nft;
        EnumC53197Nft enumC53197Nft2 = new EnumC53197Nft("TRANSPORT", 1, 1);
        A04 = enumC53197Nft2;
        EnumC53197Nft[] enumC53197NftArr = {enumC53197Nft, enumC53197Nft2};
        A02 = enumC53197NftArr;
        A01 = AbstractC12190kN.A00(enumC53197NftArr);
    }

    public static EnumC53197Nft valueOf(String str) {
        return (EnumC53197Nft) Enum.valueOf(EnumC53197Nft.class, str);
    }

    public static EnumC53197Nft[] values() {
        return (EnumC53197Nft[]) A02.clone();
    }

    public EnumC53197Nft(String str, int i, int i2) {
        this.A00 = i2;
    }
}
