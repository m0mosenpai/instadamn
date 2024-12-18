package X;

/* renamed from: X.JzO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45182JzO extends C0T6 implements InterfaceC66482zP {
    public final InterfaceC16820sZ A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45182JzO) && C14360o3.A0K(this.A00, ((C45182JzO) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "ai_sticker_generate_more_button";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }

    public C45182JzO(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
