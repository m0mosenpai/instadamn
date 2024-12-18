package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61110RfQ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61110RfQ[] A01;
    public static final EnumC61110RfQ A02;
    public static final EnumC61110RfQ A03;
    public static final EnumC61110RfQ A04;

    static {
        EnumC61110RfQ enumC61110RfQ = new EnumC61110RfQ("ID_BACK", 0);
        A02 = enumC61110RfQ;
        EnumC61110RfQ enumC61110RfQ2 = new EnumC61110RfQ("ID_FRONT", 1);
        A03 = enumC61110RfQ2;
        EnumC61110RfQ enumC61110RfQ3 = new EnumC61110RfQ("SELFIE_PHOTO", 2);
        A04 = enumC61110RfQ3;
        EnumC61110RfQ[] enumC61110RfQArr = {enumC61110RfQ, enumC61110RfQ2, enumC61110RfQ3, new EnumC61110RfQ("SELFIE_VIDEO", 3)};
        A01 = enumC61110RfQArr;
        A00 = AbstractC12190kN.A00(enumC61110RfQArr);
    }

    public static EnumC61110RfQ valueOf(String str) {
        return (EnumC61110RfQ) Enum.valueOf(EnumC61110RfQ.class, str);
    }

    public static EnumC61110RfQ[] values() {
        return (EnumC61110RfQ[]) A01.clone();
    }

    public EnumC61110RfQ(String str, int i) {
    }
}
