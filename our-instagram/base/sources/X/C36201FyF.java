package X;

/* renamed from: X.FyF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36201FyF implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final String A02;

    public C36201FyF(String str, int i, int i2) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C14360o3.A0K(obj, this);
    }
}
