package X;

/* renamed from: X.0P4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0P4 implements InterfaceC08100bW {
    public InterfaceC08100bW A00;

    @Override // X.InterfaceC08100bW
    public final void EH9(String str) {
        InterfaceC08100bW interfaceC08100bW;
        synchronized (this) {
            interfaceC08100bW = this.A00;
        }
        interfaceC08100bW.EH9(str);
    }

    @Override // X.InterfaceC08100bW
    public final void EHA(String str, String str2, Throwable th) {
        InterfaceC08100bW interfaceC08100bW;
        synchronized (this) {
            interfaceC08100bW = this.A00;
        }
        interfaceC08100bW.EHA(str, str2, th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bW, java.lang.Object] */
    public C0P4() {
        ?? obj = new Object();
        synchronized (this) {
            this.A00 = obj;
        }
    }
}
