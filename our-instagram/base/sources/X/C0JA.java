package X;

import android.app.ActivityThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.0JA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JA {
    public static volatile C0JA A02;
    public final C0J9 A00;
    public final String A01;

    public static boolean A02() {
        int myUid = Process.myUid() % 100000;
        if (99000 <= myUid) {
            if (myUid <= 99999) {
                return true;
            }
        } else if (90000 <= myUid) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A01;
        String str2 = ((C0JA) obj).A01;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static C0JA A00() {
        C0JA c0ja;
        C0JA c0ja2 = A02;
        if (c0ja2 != null) {
            return c0ja2;
        }
        synchronized (C0JA.class) {
            c0ja = A02;
            if (c0ja == null) {
                ActivityThread A00 = C0Cu.A00();
                if (A00 != null) {
                    c0ja = A01(A00.getProcessName());
                    A02 = c0ja;
                    if (TextUtils.isEmpty(c0ja.A01)) {
                        Pair A002 = C0JC.A00("/proc/self/cmdline");
                        if (TextUtils.isEmpty((CharSequence) A002.first)) {
                            c0ja = A02;
                        } else {
                            c0ja = A01((String) A002.first);
                            A02 = c0ja;
                        }
                    }
                } else {
                    c0ja = new C0JA(null, null);
                }
            }
        }
        return c0ja;
    }

    public static C0JA A01(String str) {
        String str2;
        C0J9 c0j9;
        if (str == null) {
            return new C0JA(null, null);
        }
        String[] split = str.split(":");
        if (split.length > 1) {
            str2 = split[1];
            if (str2 == null) {
                throw new IllegalArgumentException("Invalid name");
            }
        } else {
            str2 = "";
        }
        if ("".equals(str2)) {
            c0j9 = C0J9.A01;
        } else {
            c0j9 = new C0J9(str2);
        }
        return new C0JA(c0j9, str);
    }

    public final String A03() {
        if (this.A01 == null) {
            return "<unknown>";
        }
        if (A04()) {
            return "<default>";
        }
        C0J9 c0j9 = this.A00;
        if (c0j9 != null) {
            return c0j9.A00;
        }
        return null;
    }

    public final boolean A04() {
        return C0J9.A01.equals(this.A00);
    }

    public final int hashCode() {
        String str = this.A01;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str = this.A01;
        if (str == null) {
            return "<unknown>";
        }
        return str;
    }

    public C0JA(C0J9 c0j9, String str) {
        this.A01 = str;
        this.A00 = c0j9;
    }

    public C0JA() {
        this(null, null);
    }
}
