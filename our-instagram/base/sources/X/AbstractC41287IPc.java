package X;

import com.instagram.model.payments.CurrencyAmountInfoImpl;

/* renamed from: X.IPc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41287IPc {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d6, code lost:
    
        if (r6.equals("onsite_checkout") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00f4, code lost:
    
        r18 = com.instagram.api.schemas.CheckoutStyle.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f2, code lost:
    
        if (r7 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02c8, code lost:
    
        if (r6.equals(r1) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02cc, code lost:
    
        r18 = com.instagram.api.schemas.CheckoutStyle.A04;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.user.model.Product A01(X.C102884kP r68) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41287IPc.A01(X.4kP):com.instagram.user.model.Product");
    }

    public static final CurrencyAmountInfoImpl A00(C102884kP c102884kP) {
        if (c102884kP != null) {
            String str = "";
            String str2 = "";
            String A0E = c102884kP.A0E();
            if (A0E != null) {
                str2 = A0E;
            }
            String str3 = "";
            String A0G = c102884kP.A0G();
            if (A0G != null) {
                str3 = A0G;
            }
            String A0I = c102884kP.A0I();
            if (A0I != null) {
                str = A0I;
            }
            return new CurrencyAmountInfoImpl(AbstractC37301Gc2.A0b(c102884kP, 40), str2, str3, str);
        }
        return null;
    }
}
