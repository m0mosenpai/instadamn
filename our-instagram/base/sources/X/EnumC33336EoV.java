package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33336EoV {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33336EoV[] A01;
    public static final EnumC33336EoV A02;
    public static final EnumC33336EoV A03;
    public static final EnumC33336EoV A04;

    static {
        EnumC33336EoV enumC33336EoV = new EnumC33336EoV("PURCHASING", 0);
        A03 = enumC33336EoV;
        EnumC33336EoV enumC33336EoV2 = new EnumC33336EoV("READY_TO_PURCHASE", 1);
        A04 = enumC33336EoV2;
        EnumC33336EoV enumC33336EoV3 = new EnumC33336EoV("PURCHASE_STARTED", 2);
        A02 = enumC33336EoV3;
        EnumC33336EoV[] enumC33336EoVArr = {enumC33336EoV, enumC33336EoV2, enumC33336EoV3};
        A01 = enumC33336EoVArr;
        A00 = AbstractC12190kN.A00(enumC33336EoVArr);
    }

    public static EnumC33336EoV valueOf(String str) {
        return (EnumC33336EoV) Enum.valueOf(EnumC33336EoV.class, str);
    }

    public static EnumC33336EoV[] values() {
        return (EnumC33336EoV[]) A01.clone();
    }

    public EnumC33336EoV(String str, int i) {
    }
}
