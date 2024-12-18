package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Reg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61067Reg {
    public static final EnumC61067Reg A01 = new EnumC61067Reg(Rie.IDV_DOCUMENT_TYPE, "IDV_DOCUMENT_TYPE", 0);
    public static final EnumC61067Reg A02;
    public static final EnumC61067Reg A03;
    public static final EnumC61067Reg A04;
    public static final EnumC61067Reg A05;
    public static final EnumC61067Reg A06;
    public Rie A00;

    static {
        new EnumC61067Reg(Rie.IDV_GROUP_ONE, "IDV_GROUP_ONE", 1);
        A02 = new EnumC61067Reg(Rie.IDV_GROUP_TWO, "IDV_GROUP_TWO", 2);
        A04 = new EnumC61067Reg(Rie.IDV_ID_SMART_CAPTURE, "IDV_ID_SMART_CAPTURE", 3);
        A03 = new EnumC61067Reg(Rie.IDV_ID_CONFIRMATION, "IDV_ID_CONFIRMATION", 4);
        A06 = new EnumC61067Reg(Rie.IDV_SELFIE_SMART_CAPTURE, "IDV_SELFIE_SMART_CAPTURE", 5);
        A05 = new EnumC61067Reg(Rie.IDV_SELFIE_CONFIRMATION, "IDV_SELFIE_CONFIRMATION", 6);
    }

    public EnumC61067Reg(Rie rie, String str, int i) {
        this.A00 = rie;
    }
}
