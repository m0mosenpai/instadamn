package X;

/* renamed from: X.Nss, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53919Nss {
    public static final String A00(EnumC53223NgL enumC53223NgL) {
        int ordinal = enumC53223NgL.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "Sell product";
                    }
                    throw B4Z.A00();
                }
                return "Request time";
            }
            return "WhatsApp";
        }
        return "Instagram";
    }
}
