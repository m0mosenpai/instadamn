package X;

/* renamed from: X.LZz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48326LZz implements InterfaceC66482zP, InterfaceC162797Qq, InterfaceC129555tK {
    public final C7QY A00;
    public final InterfaceC09390do A01;
    public final C162777Qo A02;

    public C48326LZz(C162777Qo c162777Qo, C7QY c7qy) {
        C14360o3.A0B(c7qy, 1);
        this.A00 = c7qy;
        this.A02 = c162777Qo;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37059GUt(this, 25));
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A02;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getValue();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
