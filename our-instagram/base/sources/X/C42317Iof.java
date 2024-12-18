package X;

/* renamed from: X.Iof, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42317Iof implements InterfaceC66482zP {
    public final C38676GzH A00;
    public final IHC A01;
    public final String A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38676GzH c38676GzH;
        C42317Iof c42317Iof = (C42317Iof) obj;
        C38676GzH c38676GzH2 = this.A00;
        if (c42317Iof != null) {
            c38676GzH = c42317Iof.A00;
        } else {
            c38676GzH = null;
        }
        return C14360o3.A0K(c38676GzH2, c38676GzH);
    }

    public C42317Iof(C38676GzH c38676GzH, IHC ihc, String str) {
        this.A02 = str;
        this.A00 = c38676GzH;
        this.A01 = ihc;
    }
}
