package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class MZE {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MZE[] A01;
    public static final MZE A02;
    public static final MZE A03;
    public static final MZE A04;

    static {
        MZE mze = new MZE("Loading", 0);
        A03 = mze;
        MZE mze2 = new MZE("Success", 1);
        A04 = mze2;
        MZE mze3 = new MZE("Error", 2);
        A02 = mze3;
        MZE[] mzeArr = {mze, mze2, mze3};
        A01 = mzeArr;
        A00 = AbstractC12190kN.A00(mzeArr);
    }

    public static MZE valueOf(String str) {
        return (MZE) Enum.valueOf(MZE.class, str);
    }

    public static MZE[] values() {
        return (MZE[]) A01.clone();
    }

    public MZE(String str, int i) {
    }
}
