package X;

/* renamed from: X.JzT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45187JzT extends C0T6 implements InterfaceC66482zP {
    public final AbstractC160207Gg A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45187JzT) && C14360o3.A0K(this.A00, ((C45187JzT) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this.A00);
    }

    public C45187JzT(AbstractC160207Gg abstractC160207Gg) {
        this.A00 = abstractC160207Gg;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
