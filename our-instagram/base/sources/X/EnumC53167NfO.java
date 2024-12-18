package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53167NfO {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53167NfO[] A01;
    public static final EnumC53167NfO A02;
    public static final EnumC53167NfO A03;
    public static final EnumC53167NfO A04;
    public static final EnumC53167NfO A05;
    public static final EnumC53167NfO A06;
    public static final EnumC53167NfO A07;

    static {
        EnumC53167NfO enumC53167NfO = new EnumC53167NfO("AUDIO_BEAT", 0);
        A02 = enumC53167NfO;
        EnumC53167NfO enumC53167NfO2 = new EnumC53167NfO("SMART_CROP", 1);
        A05 = enumC53167NfO2;
        EnumC53167NfO enumC53167NfO3 = new EnumC53167NfO("VIDEO_HIGHLIGHT", 2);
        A07 = enumC53167NfO3;
        EnumC53167NfO enumC53167NfO4 = new EnumC53167NfO("SMART_PLACEMENT", 3);
        A06 = enumC53167NfO4;
        EnumC53167NfO enumC53167NfO5 = new EnumC53167NfO("AUTO_ENHANCE_IMAGE", 4);
        A03 = enumC53167NfO5;
        EnumC53167NfO enumC53167NfO6 = new EnumC53167NfO("JUMPCUT", 5);
        A04 = enumC53167NfO6;
        EnumC53167NfO[] enumC53167NfOArr = {enumC53167NfO, enumC53167NfO2, enumC53167NfO3, enumC53167NfO4, enumC53167NfO5, enumC53167NfO6};
        A01 = enumC53167NfOArr;
        A00 = AbstractC12190kN.A00(enumC53167NfOArr);
    }

    public static EnumC53167NfO valueOf(String str) {
        return (EnumC53167NfO) Enum.valueOf(EnumC53167NfO.class, str);
    }

    public static EnumC53167NfO[] values() {
        return (EnumC53167NfO[]) A01.clone();
    }

    public EnumC53167NfO(String str, int i) {
    }
}
