package X;

/* renamed from: X.75O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75O implements InterfaceC58362lv {
    public int A00 = -1;
    public final C2GT A01;
    public final InterfaceC58362lv A02;

    @Override // X.InterfaceC58362lv
    public final void onChanged(Object obj) {
        int i = this.A00;
        int i2 = this.A01.A01;
        if (i != i2) {
            this.A00 = i2;
            this.A02.onChanged(obj);
        }
    }

    public C75O(C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        this.A01 = c2gt;
        this.A02 = interfaceC58362lv;
    }
}
