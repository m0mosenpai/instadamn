package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53180Nfc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53180Nfc[] A01;
    public static final EnumC53180Nfc A02;
    public static final EnumC53180Nfc A03;
    public static final EnumC53180Nfc A04;
    public static final EnumC53180Nfc A05;
    public static final EnumC53180Nfc A06;
    public static final EnumC53180Nfc A07;
    public static final EnumC53180Nfc A08;

    static {
        EnumC53180Nfc enumC53180Nfc = new EnumC53180Nfc("VOLUME", 0);
        A08 = enumC53180Nfc;
        EnumC53180Nfc enumC53180Nfc2 = new EnumC53180Nfc("VOICEOVER", 1);
        A07 = enumC53180Nfc2;
        EnumC53180Nfc enumC53180Nfc3 = new EnumC53180Nfc("SAVED", 2);
        A04 = enumC53180Nfc3;
        EnumC53180Nfc enumC53180Nfc4 = new EnumC53180Nfc("SFX", 3);
        A05 = enumC53180Nfc4;
        EnumC53180Nfc enumC53180Nfc5 = new EnumC53180Nfc("AUDIO_ENHANCE", 4);
        A02 = enumC53180Nfc5;
        EnumC53180Nfc enumC53180Nfc6 = new EnumC53180Nfc("TRENDING", 5);
        A06 = enumC53180Nfc6;
        EnumC53180Nfc enumC53180Nfc7 = new EnumC53180Nfc("IMPORT", 6);
        A03 = enumC53180Nfc7;
        EnumC53180Nfc[] enumC53180NfcArr = {enumC53180Nfc, enumC53180Nfc2, enumC53180Nfc3, enumC53180Nfc4, enumC53180Nfc5, enumC53180Nfc6, enumC53180Nfc7};
        A01 = enumC53180NfcArr;
        A00 = AbstractC12190kN.A00(enumC53180NfcArr);
    }

    public static EnumC53180Nfc valueOf(String str) {
        return (EnumC53180Nfc) Enum.valueOf(EnumC53180Nfc.class, str);
    }

    public static EnumC53180Nfc[] values() {
        return (EnumC53180Nfc[]) A01.clone();
    }

    public EnumC53180Nfc(String str, int i) {
    }
}
