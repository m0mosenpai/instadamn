package X;

/* renamed from: X.E8z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32101E8z extends C0T6 implements InterfaceC66482zP {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32101E8z) && this.A00 == ((C32101E8z) obj).A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32101E8z c32101E8z = (C32101E8z) obj;
        if (c32101E8z == null || c32101E8z.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public C32101E8z(boolean z) {
        this.A00 = z;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "DEFAULT_INTEREST_ADD_KEY";
    }

    public C32101E8z() {
        this(true);
    }
}
