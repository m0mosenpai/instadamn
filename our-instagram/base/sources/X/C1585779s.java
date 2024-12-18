package X;

/* renamed from: X.79s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1585779s {
    public final InterfaceC09390do A00;
    public final String A01;

    public C1585779s(String str, InterfaceC09390do interfaceC09390do) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = interfaceC09390do;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls2, cls) || !(obj instanceof C1585779s)) {
            return false;
        }
        return C14360o3.A0K(((C1585779s) obj).A01, this.A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
