package X;

/* renamed from: X.LZv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48322LZv implements InterfaceC66482zP, InterfaceC162797Qq {
    public final KT0 A00;
    public final String A01;
    public final C162777Qo A02;

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

    public C48322LZv(KT0 kt0, C162777Qo c162777Qo, String str) {
        this.A01 = str;
        this.A00 = kt0;
        this.A02 = c162777Qo;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
