package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BPT {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BPT[] A01;
    public static final BPT A02;
    public static final BPT A03;
    public static final BPT A04;

    static {
        BPT bpt = new BPT("UNRECOGNIZED", 0);
        A04 = bpt;
        BPT bpt2 = new BPT("DEFAULT_ON", 1);
        A02 = bpt2;
        BPT bpt3 = new BPT("NORMAL", 2);
        A03 = bpt3;
        BPT[] bptArr = {bpt, bpt2, bpt3};
        A01 = bptArr;
        A00 = AbstractC12190kN.A00(bptArr);
    }

    public static BPT valueOf(String str) {
        return (BPT) Enum.valueOf(BPT.class, str);
    }

    public static BPT[] values() {
        return (BPT[]) A01.clone();
    }

    public BPT(String str, int i) {
    }
}
