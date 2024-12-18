package X;

/* renamed from: X.KJy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45687KJy extends C2AH {
    public final /* synthetic */ InterfaceC50477MQf A00;
    public final /* synthetic */ L9G A01;
    public final /* synthetic */ boolean A02;

    public C45687KJy(InterfaceC50477MQf interfaceC50477MQf, L9G l9g, boolean z) {
        this.A00 = interfaceC50477MQf;
        this.A01 = l9g;
        this.A02 = z;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        this.A00.DQ6();
        this.A01.A01(this.A02, false);
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        this.A00.DQ7();
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.DS5();
        this.A01.A00();
    }
}
