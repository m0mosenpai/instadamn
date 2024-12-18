package X;

import com.facebook.pando.Summary;

/* renamed from: X.7nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173357nn {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Integer A00(Summary summary) {
        String str;
        String str2 = summary.source;
        switch (str2.hashCode()) {
            case 461569884:
                if (str2.equals("stale_cache")) {
                    return C05F.A0C;
                }
                return C05F.A0N;
            case 1561714200:
                str = "consistency";
                break;
            case 1782559025:
                str = "fresh_cache";
                break;
            case 1843485230:
                if (str2.equals("network")) {
                    return C05F.A00;
                }
                return C05F.A0N;
            default:
                return C05F.A0N;
        }
        if (str2.equals(str)) {
            return C05F.A01;
        }
        return C05F.A0N;
    }
}
