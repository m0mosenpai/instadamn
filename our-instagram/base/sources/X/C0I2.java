package X;

/* renamed from: X.0I2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0I2 {
    public static C0I3 A00 = new C0I3() { // from class: X.0Lb
        public int A00 = 5;

        @Override // X.C0I3
        public final void e(String str, String str2) {
            android.util.Log.println(6, AnonymousClass001.A0g("unknown", ":", str), str2);
        }

        @Override // X.C0I3
        public final void w(String str, String str2) {
            android.util.Log.println(5, AnonymousClass001.A0g("unknown", ":", str), str2);
        }

        @Override // X.C0I3
        public final void wtf(String str, String str2) {
            android.util.Log.println(6, AnonymousClass001.A0g("unknown", ":", str), str2);
        }

        @Override // X.C0I3
        public final int getMinimumLoggingLevel() {
            return this.A00;
        }

        @Override // X.C0I3
        public final boolean isLoggable(int i) {
            if (this.A00 > i) {
                return false;
            }
            return true;
        }

        @Override // X.C0I3
        public final void setMinimumLoggingLevel(int i) {
            this.A00 = i;
        }

        private void A00(String str, String str2, int i, Throwable th) {
            String stackTraceString;
            String A0g = AnonymousClass001.A0g("unknown", ":", str);
            if (th == null) {
                stackTraceString = "";
            } else {
                stackTraceString = android.util.Log.getStackTraceString(th);
            }
            android.util.Log.println(i, A0g, AnonymousClass001.A0T(str2, stackTraceString, '\n'));
        }

        @Override // X.C0I3
        public final void log(int i, String str, String str2) {
            android.util.Log.println(i, AnonymousClass001.A0g("unknown", ":", str), str2);
        }

        @Override // X.C0I3
        public final void e(String str, String str2, Throwable th) {
            A00(str, str2, 6, th);
        }

        @Override // X.C0I3
        public final void w(String str, String str2, Throwable th) {
            A00(str, str2, 5, th);
        }

        @Override // X.C0I3
        public final void wtf(String str, String str2, Throwable th) {
            A00(str, str2, 6, th);
        }
    };

    public static void A00(Class cls, String str) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(5)) {
            c0i3.w(cls.getSimpleName(), str);
        }
    }

    public static void A01(Class cls, String str, Throwable th) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(6)) {
            c0i3.e(cls.getSimpleName(), str, th);
        }
    }

    public static void A02(Class cls, String str, Object... objArr) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(5)) {
            c0i3.w(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void A03(String str, String str2) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(6)) {
            c0i3.e(str, str2);
        }
    }

    public static void A04(String str, String str2) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(5)) {
            c0i3.w(str, str2);
        }
    }

    public static void A05(String str, String str2, Throwable th) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(6)) {
            c0i3.e(str, str2, th);
        }
    }

    public static void A06(String str, String str2, Throwable th) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(5)) {
            c0i3.w(str, str2, th);
        }
    }

    public static void A07(String str, String str2, Throwable th) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(6)) {
            c0i3.wtf(str, str2, th);
        }
    }

    public static void A08(String str, String str2, Object... objArr) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(6)) {
            c0i3.e(str, String.format(null, str2, objArr));
        }
    }

    public static void A09(String str, String str2, Object... objArr) {
        C0I3 c0i3 = A00;
        if (c0i3.isLoggable(5)) {
            c0i3.w(str, String.format(null, str2, objArr));
        }
    }
}
