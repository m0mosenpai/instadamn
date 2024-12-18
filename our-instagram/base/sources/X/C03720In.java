package X;

import java.io.PrintStream;

/* renamed from: X.0In, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03720In {
    public static boolean A02;
    public C0IZ A00;
    public final String A01;

    public static void A01(int i, String str, String str2, Throwable th, int i2) {
        String str3;
        String message;
        if (th != null && (i2 & 2) == 2) {
            C03740Ip c03740Ip = C10910i3.A02;
            String A0u = AnonymousClass001.A0u("Err ", th.getClass().getName(), ": ", th.getMessage());
            th = null;
            if (A0u != null) {
                str2 = AnonymousClass001.A0R(str2, A0u);
            }
        }
        if (!A02) {
            if (i != 3 && i != 4) {
                try {
                    if (i != 5) {
                        if (th != null) {
                            android.util.Log.e(str, str2, th);
                            return;
                        } else {
                            android.util.Log.e(str, str2);
                            return;
                        }
                    }
                    if (th != null) {
                        android.util.Log.w(str, str2, th);
                        return;
                    } else {
                        android.util.Log.w(str, str2);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (RuntimeException.class.equals(e.getClass()) && (message = e.getMessage()) != null && message.equals("Stub!")) {
                        if (!A02) {
                            try {
                                Class.forName("org.junit.Test");
                                A02 = true;
                            } catch (ClassNotFoundException e2) {
                                throw new RuntimeException("We ain't running in no unit test bailing for safety", e2);
                            }
                        }
                        PrintStream printStream = System.err;
                        printStream.println(AnonymousClass001.A11("Warn", ": ", "MinLog-UT", ": ", "Detected we are running in a unit test"));
                        e.printStackTrace(printStream);
                    } else {
                        throw e;
                    }
                }
            } else {
                return;
            }
        }
        PrintStream printStream2 = System.err;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    str3 = "Error";
                } else {
                    str3 = "Warn";
                }
            } else {
                str3 = "Info";
            }
        } else {
            str3 = "Debug";
        }
        printStream2.println(AnonymousClass001.A11(str3, ": ", str, ": ", str2));
        if (th != null) {
            th.printStackTrace(printStream2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c2, code lost:
    
        if (r16 == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(java.lang.String r13, java.lang.String r14, java.lang.Throwable r15, java.lang.Object[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03720In.A02(java.lang.String, java.lang.String, java.lang.Throwable, java.lang.Object[], int, int):void");
    }

    public final void A03(String str, Throwable th) {
        A0A(th, str, new Object[0]);
    }

    public final void A04(String str, Throwable th) {
        A0C(th, str, new Object[0]);
    }

    public final void A05(String str, Throwable th) {
        A0D(th, str, new Object[0]);
    }

    public final void A07(String str, Object... objArr) {
        A06(str, null, objArr, 6, 0);
    }

    public final void A08(String str, Object... objArr) {
        A0C(null, str, objArr);
    }

    public final void A09(String str, Object[] objArr, int i) {
        A06(str, null, objArr, i, 0);
    }

    public final void A0A(Throwable th, String str, Object... objArr) {
        A06(str, th, objArr, 3, 2);
    }

    public final void A0B(Throwable th, String str, Object... objArr) {
        String str2 = this.A01;
        A02(str2, str, null, objArr, 5, 0);
        int i = 1;
        String str3 = "Error: ";
        while (true) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            do {
                sb.append('\t');
                i2++;
            } while (i2 < i);
            String obj = sb.toString();
            String message = th.getMessage();
            String simpleName = th.getClass().getSimpleName();
            if (message == null || message.length() == 0) {
                message = "None Found";
            }
            A02(str2, "%s%s %s=%s", null, new Object[]{obj, str3, simpleName, message}, 5, 0);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                A02(str2, "%s\t at %s", null, new Object[]{obj, stackTraceElement.toString()}, 5, 0);
            }
            th = th.getCause();
            if (th != null) {
                i = 2;
                str3 = "Cause: ";
            } else {
                return;
            }
        }
    }

    public final void A0C(Throwable th, String str, Object... objArr) {
        A06(str, th, objArr, 5, 0);
    }

    public final void A0D(Throwable th, String str, Object... objArr) {
        A06(str, th, objArr, 5, 2);
    }

    public static C03720In A00(String str) {
        return new C03720In(str);
    }

    public final void A06(String str, Throwable th, Object[] objArr, int i, int i2) {
        A02(this.A01, str, th, objArr, i, i2);
    }

    public C03720In(String str) {
        this.A00 = null;
        this.A01 = str == null ? "FBMinLog" : str;
    }

    public C03720In() {
        this(null);
    }
}
