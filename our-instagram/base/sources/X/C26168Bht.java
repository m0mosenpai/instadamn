package X;

/* renamed from: X.Bht, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26168Bht extends C0T6 implements InterfaceC66482zP {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26168Bht) && this.A00 == ((C26168Bht) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C26168Bht c26168Bht = (C26168Bht) obj;
        if (c26168Bht == null || c26168Bht.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public C26168Bht(int i) {
        this.A00 = i;
    }
}
