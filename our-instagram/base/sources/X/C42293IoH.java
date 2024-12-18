package X;

/* renamed from: X.IoH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42293IoH implements InterfaceC66482zP {
    public final C41730Ie1 A00;
    public final boolean A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String A05 = this.A00.A05();
        C14360o3.A07(A05);
        return A05;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42293IoH c42293IoH = (C42293IoH) obj;
        C14360o3.A0B(c42293IoH, 0);
        return C14360o3.A0K(this.A00, c42293IoH.A00);
    }

    public C42293IoH(C41730Ie1 c41730Ie1, boolean z) {
        this.A00 = c41730Ie1;
        this.A01 = z;
    }
}
