package X;

/* loaded from: classes5.dex */
public abstract class CJT {
    public static final Integer A00(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1871442027) {
                if (hashCode != 3500751) {
                    if (hashCode == 492830541 && str.equals("integrity")) {
                        return C05F.A0u;
                    }
                } else if (str.equals("risk")) {
                    return C05F.A0j;
                }
            } else if (str.equals("banhammer")) {
                return C05F.A01;
            }
        }
        C0w9.A03("PromoteErrorNativeUri", "Server sending unsupported type");
        return C05F.A15;
    }
}
