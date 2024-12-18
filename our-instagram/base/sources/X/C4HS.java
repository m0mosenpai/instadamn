package X;

/* renamed from: X.4HS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4HS implements C1EC {
    public final Object A00;
    public final ThreadLocal A01;
    public final InterfaceC212412b A02;

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.C12V, X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        if (!C14360o3.A0K(this.A02, interfaceC212412b)) {
            return null;
        }
        return this;
    }

    @Override // X.C12V
    public final InterfaceC212412b getKey() {
        return this.A02;
    }

    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        C12W c12w;
        if (C14360o3.A0K(this.A02, interfaceC212412b)) {
            c12w = AnonymousClass191.A00;
        } else {
            c12w = this;
        }
        return c12w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThreadLocal(value=");
        sb.append(this.A00);
        sb.append(", threadLocal = ");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C4HS(Object obj, final ThreadLocal threadLocal) {
        this.A00 = obj;
        this.A01 = threadLocal;
        this.A02 = new InterfaceC212412b(threadLocal) { // from class: X.4HT
            public final ThreadLocal A00;

            public final boolean equals(Object obj2) {
                return this == obj2 || ((obj2 instanceof C4HT) && C14360o3.A0K(this.A00, ((C4HT) obj2).A00));
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ThreadLocalKey(threadLocal=");
                sb.append(this.A00);
                sb.append(')');
                return sb.toString();
            }

            {
                this.A00 = threadLocal;
            }
        };
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        return AnonymousClass190.A02(this, c12w);
    }
}
