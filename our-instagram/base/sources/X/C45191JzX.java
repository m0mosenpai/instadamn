package X;

/* renamed from: X.JzX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45191JzX extends C0T6 implements InterfaceC66482zP {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45191JzX) && this.A00 == ((C45191JzX) obj).A00);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45191JzX c45191JzX = (C45191JzX) obj;
        if (c45191JzX == null || this.A00 != c45191JzX.A00) {
            return false;
        }
        return true;
    }

    public C45191JzX(boolean z) {
        this.A00 = z;
    }
}
