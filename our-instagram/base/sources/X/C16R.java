package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.16R, reason: invalid class name */
/* loaded from: classes.dex */
public enum C16R {
    A0B(MessageAvailabilityResponseId$Companion.NOT_AVAILABLE, null),
    A0D("START_OBJECT", "{"),
    A09("END_OBJECT", "}"),
    A0C("START_ARRAY", "["),
    A08("END_ARRAY", "]"),
    A0A("FIELD_NAME", null),
    A0E("VALUE_EMBEDDED_OBJECT", null),
    A0J("VALUE_STRING", null),
    A0I("VALUE_NUMBER_INT", null),
    A0H("VALUE_NUMBER_FLOAT", null),
    A0K("VALUE_TRUE", "true"),
    A0F("VALUE_FALSE", "false"),
    A0G("VALUE_NULL", "null");

    public final int A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final char[] A06;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r6 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r6 == 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    C16R(java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            r4.<init>(r7, r5)
            r3 = 0
            if (r8 == 0) goto L15
            r4.A01 = r8
            char[] r0 = r8.toCharArray()
            r4.A06 = r0
            int r1 = r0.length
            r0 = 0
        L10:
            if (r0 >= r1) goto L15
            int r0 = r0 + 1
            goto L10
        L15:
            r4.A00 = r6
            r0 = 10
            r1 = 1
            if (r6 == r0) goto L4b
            r0 = 9
            if (r6 == r0) goto L4b
            r0 = 7
            if (r6 == r0) goto L27
            r0 = 8
            if (r6 != r0) goto L4b
        L27:
            r0 = 1
        L28:
            r4.A02 = r0
            if (r6 == r1) goto L30
            r0 = 3
            r2 = 0
            if (r6 != r0) goto L31
        L30:
            r2 = 1
        L31:
            r4.A05 = r2
            r0 = 2
            if (r6 == r0) goto L3a
            r1 = 4
            r0 = 0
            if (r6 != r1) goto L3b
        L3a:
            r0 = 1
        L3b:
            r4.A04 = r0
            if (r2 != 0) goto L48
            if (r0 != 0) goto L48
            r0 = 5
            if (r6 == r0) goto L48
            r0 = -1
            if (r6 == r0) goto L48
            r3 = 1
        L48:
            r4.A03 = r3
            return
        L4b:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16R.<init>(int, int, java.lang.String, java.lang.String):void");
    }
}
