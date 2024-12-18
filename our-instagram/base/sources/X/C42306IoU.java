package X;

/* renamed from: X.IoU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42306IoU implements InterfaceC66482zP {
    public final C26062Bfp A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C26062Bfp c26062Bfp;
        C42306IoU c42306IoU = (C42306IoU) obj;
        C26062Bfp c26062Bfp2 = this.A00;
        if (c42306IoU != null) {
            c26062Bfp = c42306IoU.A00;
        } else {
            c26062Bfp = null;
        }
        return C14360o3.A0K(c26062Bfp2, c26062Bfp);
    }

    public C42306IoU(C26062Bfp c26062Bfp, String str) {
        this.A01 = str;
        this.A00 = c26062Bfp;
    }
}
