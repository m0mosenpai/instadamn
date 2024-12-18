package X;

import com.google.common.base.Strings;

/* renamed from: X.18C, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C18C {
    public static String A00(String index, int size, int desc) {
        Object[] objArr;
        String str;
        if (size < 0) {
            objArr = new Object[]{index, Integer.valueOf(size)};
            str = "%s (%s) must not be negative";
        } else if (desc >= 0) {
            objArr = new Object[]{index, Integer.valueOf(size), Integer.valueOf(desc)};
            str = "%s (%s) must not be greater than size (%s)";
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0O("negative size: ", desc));
        }
        return Strings.A00(str, objArr);
    }

    public static void A03(int start, int end, int size) {
        String A00;
        if (start >= 0) {
            if (end >= start && end <= size) {
                return;
            }
            if (start <= size) {
                if (end >= 0 && end <= size) {
                    A00 = Strings.A00("end index (%s) must not be less than start index (%s)", Integer.valueOf(end), Integer.valueOf(start));
                } else {
                    A00 = A00("end index", end, size);
                }
                throw new IndexOutOfBoundsException(A00);
            }
        }
        A00 = A00("start index", start, size);
        throw new IndexOutOfBoundsException(A00);
    }

    public static void A04(int expression, int errorMessageTemplate, String p1, boolean p2) {
        if (p2) {
        } else {
            throw new IllegalArgumentException(Strings.A00(p1, Integer.valueOf(expression), Integer.valueOf(errorMessageTemplate)));
        }
    }

    public static void A05(long expression, String errorMessageTemplate, boolean p1) {
        if (p1) {
        } else {
            throw new IllegalArgumentException(Strings.A00(errorMessageTemplate, Long.valueOf(expression)));
        }
    }

    public static void A06(long expression, String errorMessageTemplate, boolean p1) {
        if (p1) {
        } else {
            throw new IllegalStateException(Strings.A00(errorMessageTemplate, Long.valueOf(expression)));
        }
    }

    public static void A07(Object reference, Object errorMessage) {
        if (reference != null) {
        } else {
            throw new NullPointerException(String.valueOf(errorMessage));
        }
    }

    public static void A08(Object reference, Object errorMessageTemplate, String p1) {
        if (reference != null) {
        } else {
            throw new NullPointerException(Strings.A00(p1, errorMessageTemplate));
        }
    }

    public static void A09(Object expression, Object errorMessageTemplate, String p1, boolean p2) {
        if (p2) {
        } else {
            throw new IllegalArgumentException(Strings.A00(p1, expression, errorMessageTemplate));
        }
    }

    public static void A0A(Object expression, String errorMessageTemplate, boolean p1) {
        if (p1) {
        } else {
            throw new IllegalArgumentException(Strings.A00(errorMessageTemplate, expression));
        }
    }

    public static void A0B(Object expression, String errorMessageTemplate, boolean p1) {
        if (p1) {
        } else {
            throw new IllegalStateException(Strings.A00(errorMessageTemplate, expression));
        }
    }

    public static void A0C(String expression, int errorMessageTemplate, boolean p1) {
        if (p1) {
        } else {
            throw new IllegalArgumentException(Strings.A00(expression, Integer.valueOf(errorMessageTemplate)));
        }
    }

    public static void A0D(String expression, int errorMessageTemplate, boolean p1) {
        if (p1) {
        } else {
            throw new IllegalStateException(Strings.A00(expression, Integer.valueOf(errorMessageTemplate)));
        }
    }

    public static void A0E(boolean expression) {
        if (expression) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A0F(boolean expression) {
        if (expression) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A0G(boolean expression, Object errorMessage) {
        if (expression) {
        } else {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    public static void A0H(boolean expression, Object errorMessage) {
        if (expression) {
        } else {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void A0I(boolean expression, String errorMessageTemplate, Object... errorMessageArgs) {
        if (expression) {
        } else {
            throw new IllegalArgumentException(Strings.A00(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void A0J(boolean expression, String errorMessageTemplate, Object... errorMessageArgs) {
        if (expression) {
        } else {
            throw new IllegalStateException(Strings.A00(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void A01(int index, int size) {
        Object[] objArr;
        String str;
        if (index >= 0) {
            if (index < size) {
                return;
            }
            if (size >= 0) {
                objArr = new Object[]{"index", Integer.valueOf(index), Integer.valueOf(size)};
                str = "%s (%s) must be less than size (%s)";
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0O("negative size: ", size));
            }
        } else {
            objArr = new Object[]{"index", Integer.valueOf(index)};
            str = "%s (%s) must not be negative";
        }
        throw new IndexOutOfBoundsException(Strings.A00(str, objArr));
    }

    public static void A02(int index, int size) {
        if (index >= 0 && index <= size) {
        } else {
            throw new IndexOutOfBoundsException(A00("index", index, size));
        }
    }
}
