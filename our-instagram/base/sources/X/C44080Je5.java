package X;

/* renamed from: X.Je5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44080Je5 extends C4F4 {
    public final AbstractC46972Dl A00;
    public final C4I3 A01;
    public final C1571273r A02;
    public final EnumC153216up A03;

    public C44080Je5(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3, C1571273r c1571273r, EnumC153216up enumC153216up) {
        C14360o3.A0B(c1571273r, 1);
        this.A02 = c1571273r;
        this.A03 = enumC153216up;
        this.A00 = abstractC46972Dl;
        this.A01 = c4i3;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C44080Je5 c44080Je5 = (C44080Je5) obj;
        C14360o3.A0B(c44080Je5, 0);
        if (this.A03 == c44080Je5.A03 && this.A01 == c44080Je5.A01 && C14360o3.A0K(this.A00, c44080Je5.A00)) {
            return true;
        }
        return false;
    }
}
