package X;

/* renamed from: X.8zH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203568zH {
    public static final int A00(C85B c85b) {
        int ordinal = c85b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 6) {
                    return 5;
                }
                if (ordinal != 9) {
                    if (ordinal != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported EffectSource:");
                        sb.append(c85b);
                        C0w9.A03("EffectSelectionSourceExt", sb.toString());
                    }
                    return 3;
                }
                return 6;
            }
            return 2;
        }
        return 1;
    }
}
