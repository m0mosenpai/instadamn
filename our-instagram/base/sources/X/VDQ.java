package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDQ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDQ[] A02;
    public static final VDQ A03;
    public static final VDQ A04;
    public final int A00;

    public static VDQ valueOf(String str) {
        return (VDQ) Enum.valueOf(VDQ.class, str);
    }

    public static VDQ[] values() {
        return (VDQ[]) A02.clone();
    }

    static {
        VDQ vdq = new VDQ("COMMENT", 0, 2131973266);
        A03 = vdq;
        VDQ vdq2 = new VDQ("REPLY", 1, 2131973268);
        A04 = vdq2;
        VDQ[] vdqArr = {vdq, vdq2};
        A02 = vdqArr;
        A01 = AbstractC12190kN.A00(vdqArr);
    }

    public VDQ(String str, int i, int i2) {
        this.A00 = i2;
    }
}
