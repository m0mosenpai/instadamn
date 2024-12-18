package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53171NfS {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53171NfS[] A01;
    public static final EnumC53171NfS A02;
    public static final EnumC53171NfS A03;
    public static final EnumC53171NfS A04;
    public static final EnumC53171NfS A05;
    public static final EnumC53171NfS A06;
    public static final EnumC53171NfS A07;

    static {
        EnumC53171NfS enumC53171NfS = new EnumC53171NfS("EVERYONE", 0);
        A03 = enumC53171NfS;
        EnumC53171NfS enumC53171NfS2 = new EnumC53171NfS("CLOSE_FRIENDS", 1);
        A02 = enumC53171NfS2;
        EnumC53171NfS enumC53171NfS3 = new EnumC53171NfS("PUBLIC_ACCOUNT_FOLLOWERS_ONLY", 2);
        A07 = enumC53171NfS3;
        EnumC53171NfS enumC53171NfS4 = new EnumC53171NfS("PRIVATE_ACCOUNT_FOLLOWERS", 3);
        A06 = enumC53171NfS4;
        EnumC53171NfS enumC53171NfS5 = new EnumC53171NfS("FAN_CLUB", 4);
        A04 = enumC53171NfS5;
        EnumC53171NfS enumC53171NfS6 = new EnumC53171NfS("OPAL", 5);
        A05 = enumC53171NfS6;
        EnumC53171NfS[] enumC53171NfSArr = {enumC53171NfS, enumC53171NfS2, enumC53171NfS3, enumC53171NfS4, enumC53171NfS5, enumC53171NfS6};
        A01 = enumC53171NfSArr;
        A00 = AbstractC12190kN.A00(enumC53171NfSArr);
    }

    public static EnumC53171NfS valueOf(String str) {
        return (EnumC53171NfS) Enum.valueOf(EnumC53171NfS.class, str);
    }

    public static EnumC53171NfS[] values() {
        return (EnumC53171NfS[]) A01.clone();
    }

    public EnumC53171NfS(String str, int i) {
    }
}
