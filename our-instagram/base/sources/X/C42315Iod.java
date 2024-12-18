package X;

/* renamed from: X.Iod, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42315Iod implements InterfaceC66482zP {
    public final C45126Jxv A00;
    public final IHB A01;
    public final String A02;

    public C42315Iod(C45126Jxv c45126Jxv, IHB ihb, String str) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = c45126Jxv;
        this.A01 = ihb;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45126Jxv c45126Jxv;
        C42315Iod c42315Iod = (C42315Iod) obj;
        C45126Jxv c45126Jxv2 = this.A00;
        if (c42315Iod != null) {
            c45126Jxv = c42315Iod.A00;
        } else {
            c45126Jxv = null;
        }
        return C14360o3.A0K(c45126Jxv2, c45126Jxv);
    }
}
