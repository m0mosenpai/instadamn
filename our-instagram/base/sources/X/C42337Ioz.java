package X;

/* renamed from: X.Ioz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42337Ioz implements InterfaceC66482zP {
    public final C38667Gz8 A00;
    public final String A01;

    public C42337Ioz(C69749Vuj c69749Vuj, C69749Vuj c69749Vuj2, String str) {
        C14360o3.A0B(str, 1);
        C38667Gz8 c38667Gz8 = new C38667Gz8(c69749Vuj, c69749Vuj2);
        this.A01 = str;
        this.A00 = c38667Gz8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C42337Ioz) {
            C42337Ioz c42337Ioz = (C42337Ioz) obj;
            if (C14360o3.A0K(this.A01, c42337Ioz.A01) && C14360o3.A0K(this.A00, c42337Ioz.A00)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A01, this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42337Ioz c42337Ioz = (C42337Ioz) obj;
        if (c42337Ioz != null && C14360o3.A0K(this.A00, c42337Ioz.A00)) {
            return true;
        }
        return false;
    }

    public C42337Ioz() {
        String A0n = AbstractC166997dE.A0n();
        C38667Gz8 c38667Gz8 = new C38667Gz8(null, null);
        C14360o3.A0B(A0n, 1);
        this.A01 = A0n;
        this.A00 = c38667Gz8;
    }
}
