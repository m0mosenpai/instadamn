package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0q5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15500q5 {
    public static Collection A00(Object obj) {
        if ((obj instanceof InterfaceC15590qF) && !(obj instanceof C0YV)) {
            A07(obj, "kotlin.collections.MutableCollection");
            throw C00O.createAndThrow();
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            A08(e);
            throw e;
        }
    }

    public static Iterator A01(Object obj) {
        if ((obj instanceof InterfaceC15590qF) && !(obj instanceof C0s1)) {
            A07(obj, "kotlin.collections.MutableIterator");
            throw C00O.createAndThrow();
        }
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            A08(e);
            throw e;
        }
    }

    public static List A02(Object obj) {
        if ((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC019807s)) {
            A07(obj, "kotlin.collections.MutableList");
            throw C00O.createAndThrow();
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            A08(e);
            throw e;
        }
    }

    public static Map.Entry A03(Object obj) {
        if ((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16550s0)) {
            A07(obj, "kotlin.collections.MutableMap.MutableEntry");
            throw C00O.createAndThrow();
        }
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            A08(e);
            throw e;
        }
    }

    public static Map A04(Object obj) {
        if ((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16540rz)) {
            A07(obj, "kotlin.collections.MutableMap");
            throw C00O.createAndThrow();
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            A08(e);
            throw e;
        }
    }

    public static java.util.Set A05(Object obj) {
        if ((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC019007k)) {
            A07(obj, "kotlin.collections.MutableSet");
            throw C00O.createAndThrow();
        }
        try {
            return (java.util.Set) obj;
        } catch (ClassCastException e) {
            A08(e);
            throw e;
        }
    }

    public static void A06(Object obj, int i) {
        if (obj != null && !A0B(obj, i)) {
            A07(obj, AnonymousClass001.A0O("kotlin.jvm.functions.Function", i));
            throw C00O.createAndThrow();
        }
    }

    public static void A07(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(AnonymousClass001.A0g(name, " cannot be cast to ", str));
        A08(classCastException);
        throw classCastException;
    }

    public static void A08(Throwable th) {
        C14360o3.A0H(th, C15500q5.class.getName());
    }

    public static boolean A09(Object obj) {
        if (obj instanceof List) {
            if (!(obj instanceof InterfaceC15590qF) || (obj instanceof InterfaceC019807s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean A0A(Object obj) {
        if (obj instanceof java.util.Set) {
            if (!(obj instanceof InterfaceC15590qF) || (obj instanceof InterfaceC019007k)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean A0B(Object obj, int i) {
        int i2;
        if (obj instanceof InterfaceC09250da) {
            if (obj instanceof C0s3) {
                i2 = ((C0s3) obj).getArity();
            } else if (obj instanceof InterfaceC16820sZ) {
                i2 = 0;
            } else if (obj instanceof InterfaceC16660sJ) {
                i2 = 1;
            } else if (obj instanceof InterfaceC16620sF) {
                i2 = 2;
            } else if (obj instanceof InterfaceC16610sE) {
                i2 = 3;
            } else if (obj instanceof InterfaceC16600sD) {
                i2 = 4;
            } else if (obj instanceof InterfaceC16590sC) {
                i2 = 5;
            } else if (obj instanceof InterfaceC16570sA) {
                i2 = 6;
            } else if (obj instanceof C0s9) {
                i2 = 7;
            } else if (obj instanceof C0s8) {
                i2 = 8;
            } else if (obj instanceof C0s7) {
                i2 = 9;
            } else if (obj instanceof InterfaceC16810sY) {
                i2 = 10;
            } else if (obj instanceof InterfaceC16800sX) {
                i2 = 11;
            } else if (obj instanceof InterfaceC16780sV) {
                i2 = 13;
            } else if (obj instanceof InterfaceC16770sU) {
                i2 = 14;
            } else if (obj instanceof InterfaceC16760sT) {
                i2 = 15;
            } else if (obj instanceof InterfaceC16750sS) {
                i2 = 16;
            } else if (obj instanceof InterfaceC16740sR) {
                i2 = 17;
            } else if (obj instanceof InterfaceC16720sP) {
                i2 = 18;
            } else if (obj instanceof InterfaceC16670sK) {
                i2 = 19;
            } else if (obj instanceof InterfaceC16650sI) {
                i2 = 20;
            } else {
                boolean z = obj instanceof InterfaceC16640sH;
                i2 = -1;
                if (z) {
                    i2 = 21;
                }
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
