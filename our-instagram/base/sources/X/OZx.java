package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class OZx {
    public static final OZx A00 = new Object();

    public static final C09530e4 A00(C54600OAb c54600OAb) {
        String str;
        C14360o3.A0B(c54600OAb, 0);
        C3JY c3jy = c54600OAb.A00;
        InterfaceC40801un interfaceC40801un = c54600OAb.A01;
        if (c3jy != null && interfaceC40801un != null) {
            IOException iOException = c54600OAb.A02;
            if (iOException == null) {
                return AbstractC166987dD.A1L(c3jy, interfaceC40801un);
            }
            throw iOException;
        }
        Locale locale = Locale.US;
        IOException iOException2 = c54600OAb.A02;
        if (iOException2 == null || (str = iOException2.getMessage()) == null) {
            str = "null";
        }
        String format = String.format(locale, "httpResponse=%s parsedResponse=%s errorMsg=%s", Arrays.copyOf(new Object[]{c3jy, interfaceC40801un, str}, 3));
        C14360o3.A07(format);
        throw MSW.A0y(format);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0244, code lost:
    
        if (X.C18U.A06(r11, r1, 36322937854438147L) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0231, code lost:
    
        if (X.C18U.A06(r11, r1, 36322937854634758L) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024f, code lost:
    
        if (X.C18U.A06(r11, r1, 36322937854569221L) == false) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.InterfaceC40821up r27, X.InterfaceC11380iw r28, X.InterfaceC40181tm r29, X.InterfaceC40171tl r30, X.OXD r31, java.lang.String r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZx.A01(X.1up, X.0iw, X.1tm, X.1tl, X.OXD, java.lang.String, boolean):void");
    }
}
