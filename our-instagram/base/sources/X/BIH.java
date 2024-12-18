package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BIH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BIH[] A01;
    public static final BIH A02;
    public static final BIH A03;

    static {
        BIH bih = new BIH("LABEL_BUTTON", 0);
        A02 = bih;
        BIH bih2 = new BIH("LINK_BUTTON", 1);
        A03 = bih2;
        BIH[] bihArr = {bih, bih2};
        A01 = bihArr;
        A00 = AbstractC12190kN.A00(bihArr);
    }

    public static BIH valueOf(String str) {
        return (BIH) Enum.valueOf(BIH.class, str);
    }

    public static BIH[] values() {
        return (BIH[]) A01.clone();
    }

    public BIH(String str, int i) {
    }
}
