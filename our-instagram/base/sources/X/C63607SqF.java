package X;

/* renamed from: X.SqF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63607SqF implements InterfaceC110624yZ {
    public final int A02;
    public int A01 = -1;
    public int A00 = -1;

    @Override // X.InterfaceC110624yZ
    public final /* bridge */ /* synthetic */ Object Bos() {
        return this;
    }

    @Override // X.InterfaceC110624yZ
    public final boolean CJo(C54532fA c54532fA, CharSequence charSequence, int i, int i2) {
        int i3 = this.A02;
        if (i <= i3 && i3 < i2) {
            this.A01 = i;
            this.A00 = i2;
        } else if (i2 <= i3) {
            return true;
        }
        return false;
    }

    public C63607SqF(int i) {
        this.A02 = i;
    }
}
