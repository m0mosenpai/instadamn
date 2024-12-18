package X;

/* loaded from: classes8.dex */
public final class M5E implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC16620sF A01;
    public final /* synthetic */ boolean A02;

    public M5E(String str, InterfaceC16620sF interfaceC16620sF, boolean z) {
        this.A01 = interfaceC16620sF;
        this.A02 = z;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.invoke(Boolean.valueOf(this.A02), this.A00);
    }
}
