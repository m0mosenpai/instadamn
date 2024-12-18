package X;

/* renamed from: X.8mg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC196508mg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC176157sY A01;
    public final /* synthetic */ String A02;

    public RunnableC196508mg(int i, String str, InterfaceC176157sY interfaceC176157sY) {
        this.A00 = i;
        this.A01 = interfaceC176157sY;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A00;
        if (i != 0 && i != 4) {
            C212399b8 c212399b8 = new C212399b8(this.A02);
            c212399b8.A00("fba_error_code", String.valueOf(i));
            this.A01.DE8(c212399b8);
            return;
        }
        this.A01.onSuccess();
    }
}
