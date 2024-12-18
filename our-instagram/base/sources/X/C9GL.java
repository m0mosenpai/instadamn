package X;

/* renamed from: X.9GL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GL extends Thread {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public C9GL(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.A00.invoke();
    }
}
