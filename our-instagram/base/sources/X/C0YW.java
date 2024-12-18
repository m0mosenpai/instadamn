package X;

import java.util.List;

/* renamed from: X.0YW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YW implements InterfaceC16500rv {
    public final int A00;
    public final List A01;
    public final InterfaceC16430ro A02;

    public C0YW(List list, InterfaceC16430ro interfaceC16430ro, boolean z) {
        C14360o3.A0B(list, 2);
        this.A02 = interfaceC16430ro;
        this.A01 = list;
        this.A00 = z ? 1 : 0;
    }

    public final String toString() {
        return AnonymousClass001.A0R(A01(false), " (Kotlin reflection is not available)");
    }

    public static final String A00(C18210v6 c18210v6) {
        C0YW c0yw;
        String valueOf;
        StringBuilder sb;
        String str;
        Integer num = c18210v6.A00;
        if (num == null) {
            return "*";
        }
        InterfaceC16500rv interfaceC16500rv = c18210v6.A01;
        if (interfaceC16500rv instanceof C0YW) {
            c0yw = (C0YW) interfaceC16500rv;
        } else {
            c0yw = null;
        }
        if (c0yw == null || (valueOf = c0yw.A01(true)) == null) {
            valueOf = String.valueOf(interfaceC16500rv);
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return valueOf;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                sb = new StringBuilder();
                str = "out ";
            } else {
                throw new B4Z();
            }
        } else {
            sb = new StringBuilder();
            str = "in ";
        }
        sb.append(str);
        sb.append(valueOf);
        return sb.toString();
    }

    private final String A01(boolean z) {
        String obj;
        String A0P;
        InterfaceC16430ro interfaceC16430ro = this.A02;
        InterfaceC16510rw interfaceC16510rw = (InterfaceC16510rw) interfaceC16430ro;
        if (interfaceC16510rw != null) {
            Class A00 = AbstractC53012bi.A00(interfaceC16510rw);
            if ((this.A00 & 4) != 0) {
                obj = "kotlin.Nothing";
            } else if (A00.isArray()) {
                if (A00.equals(boolean[].class)) {
                    obj = "kotlin.BooleanArray";
                } else if (A00.equals(char[].class)) {
                    obj = "kotlin.CharArray";
                } else if (A00.equals(byte[].class)) {
                    obj = "kotlin.ByteArray";
                } else if (A00.equals(short[].class)) {
                    obj = "kotlin.ShortArray";
                } else if (A00.equals(int[].class)) {
                    obj = "kotlin.IntArray";
                } else if (A00.equals(float[].class)) {
                    obj = "kotlin.FloatArray";
                } else if (A00.equals(long[].class)) {
                    obj = "kotlin.LongArray";
                } else if (A00.equals(double[].class)) {
                    obj = "kotlin.DoubleArray";
                } else {
                    obj = "kotlin.Array";
                }
            } else if (z && A00.isPrimitive()) {
                C14360o3.A0C(interfaceC16430ro, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                obj = AbstractC53012bi.A01(interfaceC16510rw).getName();
            } else {
                obj = A00.getName();
            }
        } else {
            obj = interfaceC16430ro.toString();
        }
        List list = this.A01;
        String str = "";
        if (list.isEmpty()) {
            A0P = "";
        } else {
            A0P = AbstractC001800i.A0P(", ", "<", ">", list, new C020207y(this));
        }
        if (CY0()) {
            str = "?";
        }
        return AnonymousClass001.A0g(obj, A0P, str);
    }

    @Override // X.InterfaceC16500rv
    public final List Ace() {
        return this.A01;
    }

    @Override // X.InterfaceC16500rv
    public final InterfaceC16430ro Anj() {
        return this.A02;
    }

    @Override // X.InterfaceC16500rv
    public final boolean CY0() {
        if ((this.A00 & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0YW) {
            C0YW c0yw = (C0YW) obj;
            if (C14360o3.A0K(this.A02, c0yw.A02) && C14360o3.A0K(this.A01, c0yw.A01) && this.A00 == c0yw.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    @Override // X.InterfaceC16340rf
    public final List getAnnotations() {
        throw C00O.createAndThrow();
    }
}
