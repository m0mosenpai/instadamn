package X;

/* renamed from: X.JzY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45192JzY extends C0T6 implements InterfaceC66482zP {
    public final C120985dq A00;

    public C45192JzY(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 1);
        this.A00 = c120985dq;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45192JzY) && C14360o3.A0K(this.A00, ((C45192JzY) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
