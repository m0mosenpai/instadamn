package X;

import android.os.Build;
import com.instagram.realtimeclient.RealtimeConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.15M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15M {
    public static final boolean A07;
    public static final boolean A08;
    public Class A01;
    public List A02;
    public List A05;
    public final String A06;
    public C0HC A00 = C0HC.A00;
    public int A04 = -1;
    public boolean A03 = true;

    private boolean A01(ClassLoader classLoader) {
        Class A01;
        boolean z;
        Method A04;
        boolean z2;
        Constructor A02;
        try {
            if (classLoader != null) {
                try {
                    A01 = classLoader.loadClass(this.A06);
                } catch (Throwable unused) {
                    A01 = null;
                }
            } else {
                A01 = this.A00.A01(this.A06);
            }
            this.A01 = A01;
            if (A01 != null) {
                List<C84203pC> list = this.A05;
                if (list != null) {
                    for (C84203pC c84203pC : list) {
                        C15M c15m = c84203pC.A03;
                        Class cls = c15m.A01;
                        if (cls == null) {
                            break;
                        }
                        try {
                            A02 = c15m.A00.A02(cls, c84203pC.A02);
                            c84203pC.A00 = A02;
                        } catch (Throwable unused2) {
                            z2 = c84203pC.A01;
                        }
                        if (A02 == null) {
                            z2 = c84203pC.A01;
                            if (!z2) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                List<C15N> list2 = this.A02;
                if (list2 != null) {
                    for (C15N c15n : list2) {
                        C15M c15m2 = c15n.A04;
                        Class cls2 = c15m2.A01;
                        if (cls2 != null) {
                            try {
                                A04 = c15m2.A00.A04(cls2, c15n.A01, c15n.A03);
                                c15n.A00 = A04;
                            } catch (Throwable unused3) {
                                z = c15n.A02;
                            }
                            if (A04 == null) {
                                z = c15n.A02;
                                if (!z) {
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return true;
                }
                return true;
            }
            return false;
        } catch (Throwable unused4) {
            return false;
        }
    }

    public final C15N A02(String str, Class... clsArr) {
        List list = this.A02;
        if (list == null) {
            list = new ArrayList();
            this.A02 = list;
        }
        C15N c15n = new C15N(this, str, clsArr, false);
        list.add(c15n);
        return c15n;
    }

    public final C15N A03(String str, Class... clsArr) {
        List list = this.A02;
        if (list == null) {
            list = new ArrayList();
            this.A02 = list;
        }
        C15N c15n = new C15N(this, str, clsArr, true);
        list.add(c15n);
        return c15n;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        boolean z2 = false;
        if (i <= 28) {
            z2 = true;
        }
        A07 = z2;
        if (i > 31) {
            z = false;
        }
        A08 = z;
    }

    public static C84203pC A00(C15M c15m, Class[] clsArr, boolean z) {
        List list = c15m.A05;
        if (list == null) {
            list = new ArrayList();
            c15m.A05 = list;
        }
        C84203pC c84203pC = new C84203pC(c15m, clsArr, z);
        list.add(c84203pC);
        return c84203pC;
    }

    public final String A04() {
        int i = this.A04;
        if (i == 0) {
            return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        }
        if (i == 1) {
            return "meta";
        }
        return "unknown";
    }

    public final boolean A05(ClassLoader classLoader) {
        if (A07 || C0H8.A00) {
            this.A00 = C0HC.A00;
            if (A01(classLoader)) {
                this.A04 = 0;
                this.A03 = true;
                return true;
            }
        }
        if (A08) {
            C04520Lu c04520Lu = C04520Lu.A05;
            if (c04520Lu == null) {
                c04520Lu = new C04520Lu();
                C04520Lu.A05 = c04520Lu;
            }
            this.A00 = c04520Lu;
            if (A01(classLoader)) {
                this.A04 = 1;
                this.A03 = false;
                return true;
            }
        }
        return false;
    }

    public C15M(String str) {
        this.A06 = str;
    }
}
