package X;

/* renamed from: X.Ltz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49486Ltz implements GZD {
    public final /* synthetic */ InterfaceC16660sJ A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    @Override // X.GZD
    public final void onSearchCleared(String str) {
        C14360o3.A0B(str, 0);
        this.A01.invoke(str);
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        this.A00.invoke(str);
    }

    public C49486Ltz(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A00 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
    }
}
