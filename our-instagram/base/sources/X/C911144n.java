package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.44n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C911144n implements Serializable {
    public final C910844k A00;

    public static final IllegalArgumentException A00(C64918TZt c64918TZt, String str) {
        String str2 = c64918TZt.A02;
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", str2, str2.substring(c64918TZt.A00), str));
    }

    public C911144n(C910844k c910844k) {
        this.A00 = c910844k;
    }

    public final AbstractC910944l A01(C64918TZt c64918TZt) {
        String str;
        C911244o c911244o;
        AbstractC910944l[] abstractC910944lArr;
        if (c64918TZt.hasMoreTokens()) {
            String nextToken = c64918TZt.nextToken();
            try {
                C910844k c910844k = this.A00;
                Class A0D = c910844k.A0D(nextToken);
                if (c64918TZt.hasMoreTokens()) {
                    String nextToken2 = c64918TZt.nextToken();
                    if ("<".equals(nextToken2)) {
                        ArrayList arrayList = new ArrayList();
                        while (c64918TZt.hasMoreTokens()) {
                            arrayList.add(A01(c64918TZt));
                            if (!c64918TZt.hasMoreTokens()) {
                                break;
                            }
                            String nextToken3 = c64918TZt.nextToken();
                            if (">".equals(nextToken3)) {
                                if (arrayList.isEmpty()) {
                                    abstractC910944lArr = C911244o.A05;
                                } else {
                                    abstractC910944lArr = (AbstractC910944l[]) arrayList.toArray(C911244o.A05);
                                }
                                c911244o = C911244o.A02(A0D, abstractC910944lArr);
                                return c910844k.A06(null, c911244o, A0D);
                            }
                            if (!InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1.equals(nextToken3)) {
                                str = AnonymousClass001.A0g("Unexpected token '", nextToken3, "', expected ',' or '>')");
                                break;
                            }
                        }
                    } else {
                        c64918TZt.A01 = nextToken2;
                    }
                }
                c911244o = C911244o.A04;
                return c910844k.A06(null, c911244o, A0D);
            } catch (Exception e) {
                C914045z.A0F(e);
                throw A00(c64918TZt, AnonymousClass001.A0u("Cannot locate class '", nextToken, "', problem: ", e.getMessage()));
            }
        }
        str = "Unexpected end-of-string";
        throw A00(c64918TZt, str);
    }
}
