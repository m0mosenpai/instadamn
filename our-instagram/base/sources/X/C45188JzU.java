package X;

/* renamed from: X.JzU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45188JzU extends C0T6 implements InterfaceC66482zP {
    public final int A00 = 2131956425;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45188JzU) && this.A00 == ((C45188JzU) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0O("header_key:", this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}