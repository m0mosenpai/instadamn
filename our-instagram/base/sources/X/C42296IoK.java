package X;

/* renamed from: X.IoK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42296IoK implements InterfaceC66482zP {
    public final C51757Mtg A00;
    public final String A01;

    public C42296IoK(C51757Mtg c51757Mtg, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c51757Mtg;
        this.A01 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51757Mtg c51757Mtg;
        C42296IoK c42296IoK = (C42296IoK) obj;
        C51757Mtg c51757Mtg2 = this.A00;
        if (c42296IoK != null) {
            c51757Mtg = c42296IoK.A00;
        } else {
            c51757Mtg = null;
        }
        return C14360o3.A0K(c51757Mtg2, c51757Mtg);
    }
}
