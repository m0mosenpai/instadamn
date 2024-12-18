package com.facebook.phonenumbers;

import X.AnonymousClass001;
import X.AnonymousClass788;
import X.AnonymousClass793;
import X.C05F;
import X.C64512THa;
import X.C78D;
import X.C78E;
import X.C78F;
import X.C78Q;
import X.THZ;
import X.THb;
import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class PhoneNumberUtil {
    public static PhoneNumberUtil A06;
    public static Pattern A07;
    public static Pattern A08;
    public static Pattern A09;
    public static Pattern A0A;
    public static Pattern A0B;
    public static Pattern A0C;
    public static Pattern A0D;
    public static Pattern A0E;
    public static Pattern A0F;
    public static Pattern A0G;
    public final C78E A00;
    public final Context A02;
    public final C78D A03;
    public static final Logger A0K = Logger.getLogger(PhoneNumberUtil.class.getName());
    public static final AnonymousClass788 A0J = new AnonymousClass788() { // from class: X.787
        @Override // X.AnonymousClass788
        public final char AX4(char c, char c2) {
            if (c < '0' || c > '9') {
                return (char) 55296;
            }
            return c;
        }
    };
    public static final AnonymousClass788 A0H = new AnonymousClass788() { // from class: X.78A
        @Override // X.AnonymousClass788
        public final char AX4(char c, char c2) {
            switch (c) {
                case 'A':
                case 'B':
                case 'C':
                    return '2';
                case 'D':
                case 'E':
                case 'F':
                    return '3';
                case 'G':
                case 'H':
                case 'I':
                    return '4';
                case 'J':
                case 'K':
                case 'L':
                    return '5';
                case 'M':
                case 'N':
                case 'O':
                    return '6';
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    return '7';
                case 'T':
                case 'U':
                case 'V':
                    return '8';
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    return '9';
                default:
                    return (char) 55296;
            }
        }
    };
    public static final AnonymousClass788 A0I = new AnonymousClass788() { // from class: X.78B
        @Override // X.AnonymousClass788
        public final char AX4(char c, char c2) {
            char AX4 = PhoneNumberUtil.A0H.AX4(c, (char) 55296);
            if (AX4 == 55296 && (AX4 = PhoneNumberUtil.A0J.AX4(c, (char) 55296)) == 55296) {
                return (char) 55296;
            }
            return AX4;
        }
    };
    public final Map A05 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final C78F A01 = new C78F(100);

    private int A00(String str) {
        C78E c78e = this.A00;
        int A00 = c78e.A00(str);
        if (A00 == -1) {
            THb A0E2 = A0E(str);
            if (A0E2 != null) {
                int i = A0E2.A00;
                if (str != null && str.length() != 0 && i >= 0 && i <= 32767) {
                    if (c78e.A00(str) == -1) {
                        synchronized (c78e) {
                            Map map = c78e.A00;
                            if (map == null) {
                                map = new HashMap();
                                c78e.A00 = map;
                            }
                            if (!map.containsKey(str)) {
                                c78e.A00.put(str, Integer.valueOf(i));
                            }
                        }
                    }
                    return A0E2.A00;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException(AnonymousClass001.A0R("Invalid region code: ", str));
        }
        return A00;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.78E, java.lang.Object] */
    public static synchronized PhoneNumberUtil A01(Context context) {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            phoneNumberUtil = A06;
            if (phoneNumberUtil == null) {
                Context applicationContext = context.getApplicationContext();
                phoneNumberUtil = new PhoneNumberUtil(applicationContext, new C78D(applicationContext), new Object());
                A06 = phoneNumberUtil;
            }
        }
        return phoneNumberUtil;
    }

    private Integer A02(THb tHb, String str) {
        if (A0L(tHb.A04, str)) {
            if (A0L(tHb.A09, str)) {
                return C05F.A0Y;
            }
            if (A0L(tHb.A0D, str)) {
                return C05F.A0N;
            }
            if (A0L(tHb.A0A, str)) {
                return C05F.A0j;
            }
            if (A0L(tHb.A0G, str)) {
                return C05F.A0u;
            }
            if (A0L(tHb.A08, str)) {
                return C05F.A15;
            }
            if (A0L(tHb.A07, str)) {
                return C05F.A1F;
            }
            if (A0L(tHb.A0E, str)) {
                return C05F.A1I;
            }
            if (A0L(tHb.A0F, str)) {
                return C05F.A02;
            }
            boolean A0L = A0L(tHb.A03, str);
            boolean z = tHb.A0q;
            if (A0L) {
                if (!z && !A0L(tHb.A05, str)) {
                    return C05F.A00;
                }
                return C05F.A0C;
            }
            if (!z && A0L(tHb.A05, str)) {
                return C05F.A01;
            }
        }
        return C05F.A03;
    }

    public static final String A04(AnonymousClass793 anonymousClass793) {
        StringBuilder sb = new StringBuilder();
        if (anonymousClass793.A0F) {
            char[] cArr = new char[anonymousClass793.A01];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(anonymousClass793.A02);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r5.matcher(r7).lookingAt() == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(com.facebook.phonenumbers.PhoneNumberUtil r9, X.AnonymousClass793 r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A06(com.facebook.phonenumbers.PhoneNumberUtil, X.793, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final int A0A(String str) {
        if (!this.A00.A03(str)) {
            Logger logger = A0K;
            Level level = Level.WARNING;
            if (str == null) {
                str = "null";
            }
            logger.log(level, AnonymousClass001.A0g("Invalid or missing region code (", str, ") provided."));
            return 0;
        }
        return A00(str);
    }

    public final THb A0D(int i) {
        Map map = this.A04;
        synchronized (map) {
            if (Arrays.binarySearch(C78Q.A01, (short) i) >= 0) {
                Integer valueOf = Integer.valueOf(i);
                if (!map.containsKey(valueOf)) {
                    A0J(this.A03, "001", i);
                }
                return (THb) map.get(valueOf);
            }
            return null;
        }
    }

    public final THb A0E(String str) {
        if (!this.A00.A03(str)) {
            return null;
        }
        Map map = this.A05;
        synchronized (map) {
            if (!map.containsKey(str)) {
                A0J(this.A03, str, 0);
            }
        }
        return (THb) map.get(str);
    }

    public final AnonymousClass793 A0F(String str, String str2) {
        AnonymousClass793 anonymousClass793 = new AnonymousClass793();
        A06(this, anonymousClass793, str, str2, false, true);
        return anonymousClass793;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r2 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A0G(X.AnonymousClass793 r7, X.AnonymousClass793 r8) {
        /*
            r6 = this;
            X.793 r4 = new X.793
            r4.<init>()
            r4.A00(r7)
            X.793 r3 = new X.793
            r3.<init>()
            r3.A00(r8)
            r5 = 0
            r4.A0E = r5
            java.lang.String r2 = ""
            r4.A06 = r2
            r4.A08 = r5
            java.lang.Integer r0 = X.C05F.A00
            r4.A03 = r0
            r4.A0D = r5
            r4.A05 = r2
            r3.A0E = r5
            r3.A06 = r2
            r3.A08 = r5
            r3.A03 = r0
            r3.A0D = r5
            r3.A05 = r2
            boolean r0 = r4.A09
            if (r0 == 0) goto L3d
            java.lang.String r0 = r4.A04
            int r0 = r0.length()
            if (r0 != 0) goto L3d
            r4.A09 = r5
            r4.A04 = r2
        L3d:
            boolean r1 = r3.A09
            if (r1 == 0) goto L4e
            java.lang.String r0 = r3.A04
            int r0 = r0.length()
            if (r0 != 0) goto L4e
            r3.A09 = r5
            r1 = 0
            r3.A04 = r2
        L4e:
            boolean r0 = r4.A09
            if (r0 == 0) goto L61
            if (r1 == 0) goto L61
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r3.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
        L5e:
            java.lang.Integer r0 = X.C05F.A01
            return r0
        L61:
            int r2 = r4.A00
            int r1 = r3.A00
            if (r2 == 0) goto L72
            if (r1 == 0) goto L72
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L80
            java.lang.Integer r0 = X.C05F.A0Y
            return r0
        L72:
            r0 = 1
            r4.A07 = r0
            r4.A00 = r1
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L82
            java.lang.Integer r0 = X.C05F.A0N
            return r0
        L80:
            if (r2 != r1) goto L5e
        L82:
            long r0 = r4.A02
            java.lang.String r2 = java.lang.String.valueOf(r0)
            long r0 = r3.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L9a
            boolean r0 = r1.endsWith(r2)
            if (r0 == 0) goto L5e
        L9a:
            java.lang.Integer r0 = X.C05F.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A0G(X.793, X.793):java.lang.Integer");
    }

    public final String A0H(AnonymousClass793 anonymousClass793) {
        int i = anonymousClass793.A00;
        ArrayList A02 = this.A00.A02(i);
        if (A02 == null) {
            A0K.log(Level.WARNING, AnonymousClass001.A05(i, "Missing/invalid country_code (", ") for number ", A04(anonymousClass793)));
            return null;
        }
        if (A02.size() == 1) {
            return (String) A02.get(0);
        }
        String A04 = A04(anonymousClass793);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            THb A0E2 = A0E(str);
            if (A0E2.A0V) {
                if (this.A01.A00(A0E2.A0J).matcher(A04).lookingAt()) {
                    return str;
                }
            } else if (A02(A0E2, A04) != C05F.A03) {
                return str;
            }
        }
        return null;
    }

    public final String A0I(AnonymousClass793 anonymousClass793, Integer num) {
        THb A0E2;
        char c;
        String str;
        if (anonymousClass793.A02 == 0 && anonymousClass793.A0E) {
            String str2 = anonymousClass793.A06;
            if (str2.length() > 0) {
                return str2;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i = anonymousClass793.A00;
        String A04 = A04(anonymousClass793);
        if (num == C05F.A00) {
            sb.append(A04);
            c = '+';
        } else {
            C78E c78e = this.A00;
            if (Arrays.binarySearch(C78Q.A01, (short) i) >= 0) {
                String A01 = c78e.A01(i);
                if ("001".equals(A01)) {
                    A0E2 = A0D(i);
                } else {
                    A0E2 = A0E(A01);
                }
                List list = A0E2.A0P;
                if (list.size() == 0 || num == C05F.A0C) {
                    list = A0E2.A0Q;
                }
                C64512THa A0C2 = A0C(A04, list);
                if (A0C2 != null) {
                    String str3 = A0C2.A01;
                    Matcher matcher = this.A01.A00(A0C2.A03).matcher(A04);
                    Integer num2 = C05F.A0C;
                    String str4 = A0C2.A02;
                    if (num == num2 && str4 != null && str4.length() > 0) {
                        Pattern pattern = A0A;
                        if (pattern == null) {
                            pattern = Pattern.compile("(\\$\\d)", 0);
                        }
                        A0A = pattern;
                        A04 = matcher.replaceAll(pattern.matcher(str3).replaceFirst(str4));
                    } else {
                        A04 = matcher.replaceAll(str3);
                    }
                }
                sb.append(A04);
                if (anonymousClass793.A09) {
                    String str5 = anonymousClass793.A04;
                    if (str5.length() > 0) {
                        if (A0E2.A0d) {
                            str = A0E2.A0N;
                        } else {
                            str = " ext. ";
                        }
                        sb.append(str);
                        sb.append(str5);
                    }
                }
                int intValue = num.intValue();
                c = '+';
                if (intValue != 0) {
                    if (intValue == 1) {
                        sb.insert(0, " ");
                    }
                }
            } else {
                sb.append(A04);
            }
            return sb.toString();
        }
        sb.insert(0, i);
        sb.insert(0, c);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
    
        com.facebook.phonenumbers.PhoneNumberUtil.A0K.log(java.util.logging.Level.SEVERE, X.AnonymousClass001.A0R("cannot load/parse metadata: ", r5), (java.lang.Throwable) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        throw new java.lang.RuntimeException(X.AnonymousClass001.A0R("cannot load/parse metadata: ", r5), r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(X.C78D r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A0J(X.78D, java.lang.String, int):void");
    }

    public final boolean A0L(THZ thz, String str) {
        C78F c78f = this.A01;
        Matcher matcher = c78f.A00(thz.A01).matcher(str);
        if (c78f.A00(thz.A02).matcher(str).matches() && matcher.matches()) {
            return true;
        }
        return false;
    }

    public PhoneNumberUtil(Context context, C78D c78d, C78E c78e) {
        this.A02 = context;
        this.A03 = c78d;
        this.A00 = c78e;
    }

    public static Integer A03(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return C05F.A00;
        }
        if (matcher.lookingAt()) {
            return C05F.A0N;
        }
        return C05F.A0C;
    }

    public static String A05(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            int digit = Character.digit(c, 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static void A07(StringBuilder sb) {
        String A05;
        String obj = sb.toString();
        Pattern pattern = A0E;
        if (pattern == null) {
            pattern = Pattern.compile("(?:.*?[A-Za-z]){3}.*", 0);
        }
        A0E = pattern;
        if (pattern.matcher(obj).matches()) {
            AnonymousClass788 anonymousClass788 = A0I;
            int length = obj.length();
            StringBuilder sb2 = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                char AX4 = anonymousClass788.AX4(Character.toUpperCase(obj.charAt(i)), (char) 55296);
                if (AX4 != 55296) {
                    sb2.append(AX4);
                }
            }
            A05 = sb2.toString();
        } else {
            A05 = A05(obj);
        }
        sb.replace(0, sb.length(), A05);
    }

    public static boolean A08(String str) {
        if (str.length() != 0) {
            Pattern pattern = A09;
            if (pattern == null) {
                pattern = Pattern.compile("\\(?\\$1\\)?", 0);
            }
            A09 = pattern;
            if (!pattern.matcher(str).matches()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A09(X.THb r10, X.AnonymousClass793 r11, java.lang.String r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A09(X.THb, X.793, java.lang.String, java.lang.StringBuilder, boolean):int");
    }

    public final int A0B(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            int i = 1;
            while (i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (Arrays.binarySearch(C78Q.A01, (short) parseInt) >= 0) {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
                i++;
                if (i > 3) {
                    break;
                }
            }
        }
        return 0;
    }

    public final C64512THa A0C(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C64512THa c64512THa = (C64512THa) it.next();
            List list2 = c64512THa.A04;
            int size = list2.size();
            if (size == 0 || this.A01.A00((String) list2.get(size - 1)).matcher(str).lookingAt()) {
                if (this.A01.A00(c64512THa.A03).matcher(str).matches()) {
                    return c64512THa;
                }
            }
        }
        return null;
    }

    public final boolean A0K(THb tHb, StringBuilder sb, StringBuilder sb2) {
        int length = sb.length();
        String str = tHb.A0K;
        if (length != 0 && str.length() != 0) {
            C78F c78f = this.A01;
            Matcher matcher = c78f.A00(str).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern A00 = c78f.A00(tHb.A04.A01);
                boolean matches = A00.matcher(sb).matches();
                int groupCount = matcher.groupCount();
                String str2 = tHb.A0L;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!matches || A00.matcher(sb3.toString()).matches()) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                } else {
                    if (matches && !A00.matcher(sb.substring(matcher.end())).matches()) {
                        return false;
                    }
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0M(AnonymousClass793 anonymousClass793) {
        Integer num;
        THb A0E2;
        String A04 = A04(anonymousClass793);
        int i = anonymousClass793.A00;
        C78E c78e = this.A00;
        if (Arrays.binarySearch(C78Q.A01, (short) i) >= 0) {
            String A01 = c78e.A01(i);
            if ("001".equals(A01)) {
                A0E2 = A0D(i);
            } else {
                A0E2 = A0E(A01);
            }
            num = A03(A04, this.A01.A00(A0E2.A04.A02));
        } else {
            num = C05F.A01;
        }
        if (num != C05F.A00) {
            return false;
        }
        return true;
    }

    public final boolean A0N(AnonymousClass793 anonymousClass793) {
        THb A0E2;
        String A0H2 = A0H(anonymousClass793);
        int i = anonymousClass793.A00;
        boolean equals = "001".equals(A0H2);
        if (equals) {
            A0E2 = A0D(i);
        } else {
            A0E2 = A0E(A0H2);
        }
        if (A0E2 == null || ((!equals && i != A00(A0H2)) || A02(A0E2, A04(anonymousClass793)) == C05F.A03)) {
            return false;
        }
        return true;
    }
}
