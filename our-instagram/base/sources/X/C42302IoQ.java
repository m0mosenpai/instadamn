package X;

/* renamed from: X.IoQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42302IoQ implements InterfaceC66482zP {
    public final C31200Dnj A00;
    public final String A01;

    public C42302IoQ(C31200Dnj c31200Dnj, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c31200Dnj;
        this.A01 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C31200Dnj c31200Dnj;
        C42302IoQ c42302IoQ = (C42302IoQ) obj;
        C31200Dnj c31200Dnj2 = this.A00;
        if (c42302IoQ != null) {
            c31200Dnj = c42302IoQ.A00;
        } else {
            c31200Dnj = null;
        }
        return C14360o3.A0K(c31200Dnj2, c31200Dnj);
    }
}
