package X;

/* renamed from: X.JzP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45183JzP extends C0T6 implements InterfaceC66482zP {
    public final C7IM A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45183JzP) && C14360o3.A0K(this.A00, ((C45183JzP) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "suggested_replies_loading_item_key";
    }

    public C45183JzP(C7IM c7im) {
        this.A00 = c7im;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
