package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Sfi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63230Sfi {
    public static final Integer A01(String str) {
        C14360o3.A0B(str, 0);
        String A1A = AbstractC25228BEl.A1A(str);
        StringBuilder A1C = AbstractC166987dD.A1C();
        int length = A1A.length();
        for (int i = 0; i < length; i++) {
            char charAt = A1A.charAt(i);
            if (!Character.isDigit(charAt)) {
                break;
            }
            A1C.append(charAt);
        }
        try {
            return AbstractC58319PtB.A0m(AbstractC166987dD.A19(A1C));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r1 <= 12) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        return r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001f, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = 1
            X.C14360o3.A0B(r6, r4)
            int r0 = r5.hashCode()
            r3 = 0
            switch(r0) {
                case -1604886767: goto L26;
                case -1502393158: goto L13;
                case -882707060: goto L10;
                case 659680675: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r6
        Ld:
            java.lang.String r0 = "cc-exp-month"
            goto L28
        L10:
            java.lang.String r0 = "ml-cc-exp-year"
            goto L15
        L13:
            java.lang.String r0 = "cc-exp-year"
        L15:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lc
            java.lang.Integer r2 = A01(r6)
            if (r2 == 0) goto L3e
        L21:
            java.lang.String r6 = r2.toString()
            return r6
        L26:
            java.lang.String r0 = "ml-cc-exp-month"
        L28:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lc
            java.lang.Integer r2 = A01(r6)
            if (r2 == 0) goto L3e
            int r1 = r2.intValue()
            if (r1 < r4) goto L3e
            r0 = 12
            if (r1 <= r0) goto L21
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63230Sfi.A02(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final C09530e4 A03(String str) {
        C09530e4 c09530e4 = null;
        if (str == null) {
            return null;
        }
        try {
            Date parse = new SimpleDateFormat("MM/yyyy", C1Q2.A02()).parse(AbstractC58322PtE.A0r(str));
            if (parse != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(parse);
                c09530e4 = AbstractC166987dD.A1L(Integer.valueOf(calendar.get(2) + 1), A00(Integer.valueOf(calendar.get(1))));
                return c09530e4;
            }
        } catch (ParseException unused) {
        }
        return c09530e4;
    }

    public static final Integer A00(Integer num) {
        if (num != null && num.intValue() < 1000) {
            String obj = num.toString();
            int length = obj.length();
            if (!AbstractC167007dF.A1N(length) && length <= 2) {
                if (length == 1) {
                    obj = AnonymousClass001.A0D(obj, '0');
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy", C1Q2.A02());
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy", C1Q2.A02());
                try {
                    Date parse = simpleDateFormat.parse(obj);
                    if (parse != null) {
                        String format = simpleDateFormat2.format(parse);
                        C14360o3.A07(format);
                        return AbstractC58319PtB.A0m(format);
                    }
                } catch (ParseException unused) {
                }
            }
            return null;
        }
        return num;
    }
}
