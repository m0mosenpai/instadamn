package X;

/* renamed from: X.Ioi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42320Ioi implements InterfaceC66482zP {
    public final C26062Bfp A00;
    public final IDS A01;
    public final String A02;

    public C42320Ioi(C26062Bfp c26062Bfp, IDS ids, String str) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = c26062Bfp;
        this.A01 = ids;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C26062Bfp c26062Bfp;
        C42320Ioi c42320Ioi = (C42320Ioi) obj;
        C26062Bfp c26062Bfp2 = this.A00;
        if (c42320Ioi != null) {
            c26062Bfp = c42320Ioi.A00;
        } else {
            c26062Bfp = null;
        }
        return C14360o3.A0K(c26062Bfp2, c26062Bfp);
    }
}
