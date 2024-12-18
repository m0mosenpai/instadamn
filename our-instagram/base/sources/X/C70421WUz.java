package X;

import java.util.List;

/* renamed from: X.WUz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70421WUz implements YOm {
    public final String A00;
    public final String A01;

    @Override // X.YOm
    public final boolean Cne(WFT wft) {
        String str = this.A01;
        char c = 65535;
        switch (str.hashCode()) {
            case 3392903:
                if (str.equals("null")) {
                    c = 0;
                    break;
                }
                break;
            case 104980213:
                if (str.equals("nnull")) {
                    c = 1;
                    break;
                }
                break;
            case 1509016093:
                if (str.equals("catch_all")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "NULL".equals(wft.A02);
            case 1:
                return !"NULL".equals(wft.A02);
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // X.YOm
    public final String getName() {
        return this.A00;
    }

    public C70421WUz(String str, String str2, List list) {
        if (list != null && !list.isEmpty()) {
            throw new VI3("Mismatching number of values", str);
        }
        this.A00 = str;
        this.A01 = str2;
    }
}
