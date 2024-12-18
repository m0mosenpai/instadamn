package X;

/* renamed from: X.7Us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C163787Us implements InterfaceC83713oG {
    public final InterfaceC83703oF A00;
    public final InterfaceC2056098k A01;

    public C163787Us(InterfaceC83703oF interfaceC83703oF, InterfaceC2056098k interfaceC2056098k) {
        C14360o3.A0B(interfaceC83703oF, 1);
        C14360o3.A0B(interfaceC2056098k, 2);
        this.A00 = interfaceC83703oF;
        this.A01 = interfaceC2056098k;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadTarget");
                C163787Us c163787Us = (C163787Us) obj;
                if (!C14360o3.A0K(this.A00, c163787Us.A00) || !C14360o3.A0K(this.A01, c163787Us.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}
