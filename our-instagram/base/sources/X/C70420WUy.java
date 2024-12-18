package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.WUy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70420WUy implements YOm {
    public final String A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    @Override // X.YOm
    public final boolean Cne(WFT wft) {
        double d;
        String str = wft.A02;
        switch (str.hashCode()) {
            case -1838656495:
                if (str.equals("STRING")) {
                    return this.A00.equals(wft.toString().toLowerCase(Locale.US));
                }
                return false;
            case 72655:
                if (str.equals("INT")) {
                    if (Double.parseDouble(this.A00) == wft.A01()) {
                        return true;
                    }
                }
                return false;
            case 2044650:
                if (str.equals("BOOL")) {
                    boolean z = wft.A03;
                    return AbstractC167007dF.A1P(Boolean.parseBoolean(this.A00) ? 1 : 0, z ? 1 : 0);
                }
                return false;
            case 66988604:
                if (str.equals("FLOAT")) {
                    if (str.equals("INT")) {
                        d = wft.A01;
                    } else {
                        d = wft.A00;
                    }
                    if (Double.parseDouble(this.A00) == d) {
                        return true;
                    }
                }
                return false;
            default:
                return false;
        }
    }

    @Override // X.YOm
    public final String getName() {
        return this.A00;
    }

    public C70420WUy(String str, List list) {
        if (list != null && !list.isEmpty()) {
            throw new VI3("Mismatching number of values", str);
        }
        this.A00 = str;
    }
}
