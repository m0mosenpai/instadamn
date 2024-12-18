package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class MXS {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MXS[] A01;
    public static final MXS A02;
    public static final MXS A03;
    public static final MXS A04;

    static {
        MXS mxs = new MXS("ERROR", 0);
        A02 = mxs;
        MXS mxs2 = new MXS("LOADING", 1);
        A04 = mxs2;
        MXS mxs3 = new MXS("LOADED", 2);
        A03 = mxs3;
        MXS[] mxsArr = {mxs, mxs2, mxs3};
        A01 = mxsArr;
        A00 = AbstractC12190kN.A00(mxsArr);
    }

    public static MXS valueOf(String str) {
        return (MXS) Enum.valueOf(MXS.class, str);
    }

    public static MXS[] values() {
        return (MXS[]) A01.clone();
    }

    public MXS(String str, int i) {
    }
}
