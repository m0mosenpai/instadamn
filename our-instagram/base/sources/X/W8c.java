package X;

import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public abstract class W8c {
    public static final Pattern A00 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A01 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.text.SpannableStringBuilder r7, X.W2R r8, java.util.List r9, java.util.List r10) {
        /*
            int r6 = r8.A00
            int r5 = r7.length()
            java.lang.String r1 = r8.A01
            int r0 = r1.hashCode()
            r4 = 2
            r3 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L30;
                case 98: goto L39;
                case 99: goto L2d;
                case 105: goto L23;
                case 117: goto L13;
                case 118: goto L20;
                case 3314158: goto L1d;
                default: goto L12;
            }
        L12:
            return
        L13:
            java.lang.String r0 = "u"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            r0 = 4
            goto L42
        L1d:
            java.lang.String r0 = "lang"
            goto L32
        L20:
            java.lang.String r0 = "v"
            goto L32
        L23:
            java.lang.String r0 = "i"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            r0 = 3
            goto L42
        L2d:
            java.lang.String r0 = "c"
            goto L32
        L30:
            java.lang.String r0 = ""
        L32:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4f
            return
        L39:
            java.lang.String r0 = "b"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            r0 = 1
        L42:
            r1 = 33
            switch(r0) {
                case 1: goto L73;
                case 2: goto L4f;
                case 3: goto L6d;
                default: goto L47;
            }
        L47:
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L4c:
            r7.setSpan(r0, r6, r5, r1)
        L4f:
            r10.clear()
            int r0 = r9.size()
            if (r3 >= r0) goto L79
            r9.get(r3)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String[] r0 = r8.A02
            java.util.Collections.addAll(r1, r0)
            java.lang.String r1 = "getSpecificityScore"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L6d:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            goto L4c
        L73:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            goto L4c
        L79:
            java.util.Collections.sort(r10)
            int r0 = r10.size()
            if (r3 >= r0) goto L12
            r10.get(r3)
            java.lang.String r1 = "style"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W8c.A01(android.text.SpannableStringBuilder, X.W2R, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1364013995:
                str2 = "center";
                break;
            case -1074341483:
                str2 = "middle";
                break;
            case 100571:
                if (str.equals("end")) {
                    return 2;
                }
                AbstractC46512Bo.A04("WebvttCueParser", AnonymousClass001.A0R("Invalid anchor value: ", str));
                return Integer.MIN_VALUE;
            case 109757538:
                if (str.equals("start")) {
                    return 0;
                }
                AbstractC46512Bo.A04("WebvttCueParser", AnonymousClass001.A0R("Invalid anchor value: ", str));
                return Integer.MIN_VALUE;
            default:
                AbstractC46512Bo.A04("WebvttCueParser", AnonymousClass001.A0R("Invalid anchor value: ", str));
                return Integer.MIN_VALUE;
        }
        if (str.equals(str2)) {
            return 1;
        }
        AbstractC46512Bo.A04("WebvttCueParser", AnonymousClass001.A0R("Invalid anchor value: ", str));
        return Integer.MIN_VALUE;
    }
}
