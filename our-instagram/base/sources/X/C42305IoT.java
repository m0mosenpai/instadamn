package X;

/* renamed from: X.IoT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42305IoT implements InterfaceC66482zP {
    public final C38636Gyd A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38636Gyd c38636Gyd;
        C42305IoT c42305IoT = (C42305IoT) obj;
        C38636Gyd c38636Gyd2 = this.A00;
        if (c42305IoT != null) {
            c38636Gyd = c42305IoT.A00;
        } else {
            c38636Gyd = null;
        }
        return C14360o3.A0K(c38636Gyd2, c38636Gyd);
    }

    public C42305IoT(C38636Gyd c38636Gyd, String str) {
        this.A01 = str;
        this.A00 = c38636Gyd;
    }
}
