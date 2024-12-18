package X;

import java.util.List;

/* renamed from: X.PJx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56827PJx implements InterfaceC37144GYf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C72973Oy A01;
    public final /* synthetic */ InterfaceC64002vL A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public C56827PJx(C72973Oy c72973Oy, InterfaceC64002vL interfaceC64002vL, String str, List list, int i) {
        this.A02 = interfaceC64002vL;
        this.A03 = str;
        this.A00 = i;
        this.A04 = list;
        this.A01 = c72973Oy;
    }

    @Override // X.InterfaceC37144GYf
    public final void CyV() {
        InterfaceC64002vL interfaceC64002vL = this.A02;
        String str = this.A03;
        int i = this.A00;
        interfaceC64002vL.De7(this.A01, null, null, str, null, this.A04, i, false);
    }
}
