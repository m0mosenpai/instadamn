package X;

/* renamed from: X.FyR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36213FyR implements InterfaceC66482zP {
    public final EnumC222416a A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC66492zQ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final boolean isContentSame(C36213FyR c36213FyR) {
        String str;
        String str2 = this.A01;
        if (c36213FyR != null) {
            str = c36213FyR.A01;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && C14360o3.A0K(this.A02, c36213FyR.A02)) {
            return true;
        }
        return false;
    }

    public C36213FyR(EnumC222416a enumC222416a, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = enumC222416a;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }
}
