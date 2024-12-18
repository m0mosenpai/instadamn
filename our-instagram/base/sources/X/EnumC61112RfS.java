package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61112RfS {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61112RfS[] A01;
    public static final EnumC61112RfS A02;
    public static final EnumC61112RfS A03;
    public static final EnumC61112RfS A04;

    static {
        EnumC61112RfS enumC61112RfS = new EnumC61112RfS("DETECTOR", 0);
        A03 = enumC61112RfS;
        EnumC61112RfS enumC61112RfS2 = new EnumC61112RfS("RECOGNIZER", 1);
        A04 = enumC61112RfS2;
        EnumC61112RfS enumC61112RfS3 = new EnumC61112RfS("CONFIGURATION", 2);
        A02 = enumC61112RfS3;
        EnumC61112RfS[] enumC61112RfSArr = {enumC61112RfS, enumC61112RfS2, enumC61112RfS3};
        A01 = enumC61112RfSArr;
        A00 = AbstractC12190kN.A00(enumC61112RfSArr);
    }

    public static EnumC61112RfS valueOf(String str) {
        return (EnumC61112RfS) Enum.valueOf(EnumC61112RfS.class, str);
    }

    public static EnumC61112RfS[] values() {
        return (EnumC61112RfS[]) A01.clone();
    }

    public EnumC61112RfS(String str, int i) {
    }
}
