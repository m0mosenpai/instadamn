package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class U2X {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ U2X[] A02;
    public static final U2X A03;
    public long A00 = 0;

    static {
        U2X u2x = new U2X();
        A03 = u2x;
        U2X[] u2xArr = {u2x};
        A02 = u2xArr;
        A01 = AbstractC12190kN.A00(u2xArr);
    }

    public static U2X valueOf(String str) {
        return (U2X) Enum.valueOf(U2X.class, str);
    }

    public static U2X[] values() {
        return (U2X[]) A02.clone();
    }
}
