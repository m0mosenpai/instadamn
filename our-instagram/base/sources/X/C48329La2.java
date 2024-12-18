package X;

/* renamed from: X.La2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48329La2 implements InterfaceC66482zP, C7VC, InterfaceC162797Qq, InterfaceC129555tK {
    public final KT1 A00;
    public final String A01;
    public final C162777Qo A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A02, MG5.A00);

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }

    @Override // X.C7VC
    public final int getType() {
        return 180;
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
        return this.A01;
    }

    public C48329La2(C162777Qo c162777Qo, KT1 kt1, String str) {
        this.A01 = str;
        this.A00 = kt1;
        this.A02 = c162777Qo;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
