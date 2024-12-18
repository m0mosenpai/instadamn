package X;

/* renamed from: X.2QV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2QV {
    public static final C2QW A01 = new Object();
    public final Object A00;

    public static final Object A00(Object obj) {
        if (obj instanceof C2QW) {
            return null;
        }
        return obj;
    }

    public static final Throwable A01(Object obj) {
        C89973zd c89973zd;
        if (!(obj instanceof C89973zd) || (c89973zd = (C89973zd) obj) == null) {
            return null;
        }
        return c89973zd.A00;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.A00;
        if (!(obj instanceof C2QV) || !C14360o3.A0K(obj2, ((C2QV) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj;
        Object obj2 = this.A00;
        if (obj2 instanceof C89973zd) {
            obj = obj2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Value(");
            sb.append(obj2);
            sb.append(')');
            obj = sb;
        }
        return obj.toString();
    }
}
