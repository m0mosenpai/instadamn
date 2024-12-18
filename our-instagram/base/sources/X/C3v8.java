package X;

/* renamed from: X.3v8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3v8 {
    public static int A00;
    public static final C03720In A02 = C03720In.A00("ArtDistract");
    public static final C0IZ A01 = new C0IZ("ArtDistract");

    public static void A00(String str, Object... objArr) {
        String str2;
        String format = String.format(str, objArr);
        A02.A09(format, new Object[0], 5);
        C0IZ c0iz = A01;
        C03720In c03720In = C0IZ.A06;
        "ArtDistractVerifyErr".getClass();
        format.getClass();
        String format2 = String.format(format, new Object[0]);
        synchronized (c0iz.A01) {
            str2 = (String) c0iz.A03.put("ArtDistractVerifyErr", format2);
        }
        c0iz.A00 = null;
        if (str2 != null) {
            c03720In.A08("Error Message for category %s was overwritten.\n\t old: %s \n\t new: %s", "ArtDistractVerifyErr", str2, format);
        }
        c03720In.A09(format2, new Object[0], 5);
        C0IZ.A00(c0iz);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cf, code lost:
    
        if (r10 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        if (r0 != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[LOOP:0: B:21:0x00d8->B:25:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[EDGE_INSN: B:26:0x0058->B:63:0x0058 BREAK  A[LOOP:0: B:21:0x00d8->B:25:0x00fc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(X.C87433v9 r21, X.C87433v9 r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3v8.A01(X.3v9, X.3v9):boolean");
    }

    public static boolean A02(Class cls, Class cls2, String str, Object... objArr) {
        if (cls2.isAssignableFrom(cls)) {
            return true;
        }
        A00(AnonymousClass001.A0R(str, "Reason: Class %s cannot be cast to class %s"), new C0H0(objArr, objArr.length), cls.getName(), cls2.getName());
        return false;
    }
}
