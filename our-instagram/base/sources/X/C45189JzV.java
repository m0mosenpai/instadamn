package X;

/* renamed from: X.JzV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45189JzV extends C0T6 implements InterfaceC66482zP {
    public final C1575075i A00;

    public C45189JzV(C1575075i c1575075i) {
        C14360o3.A0B(c1575075i, 1);
        this.A00 = c1575075i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45189JzV) && C14360o3.A0K(this.A00, ((C45189JzV) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}