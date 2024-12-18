package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BXC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BXC[] A01;
    public static final BXC A02;
    public static final BXC A03;
    public static final BXC A04;

    static {
        BXC bxc = new BXC("DEFAULT", 0);
        A02 = bxc;
        BXC bxc2 = new BXC("DISABLED", 1);
        A03 = bxc2;
        BXC bxc3 = new BXC("ENABLED", 2);
        A04 = bxc3;
        BXC[] bxcArr = {bxc, bxc2, bxc3};
        A01 = bxcArr;
        A00 = AbstractC12190kN.A00(bxcArr);
    }

    public static BXC valueOf(String str) {
        return (BXC) Enum.valueOf(BXC.class, str);
    }

    public static BXC[] values() {
        return (BXC[]) A01.clone();
    }

    public BXC(String str, int i) {
    }
}
