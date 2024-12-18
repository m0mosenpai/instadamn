package X;

/* renamed from: X.IoO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42300IoO implements InterfaceC66482zP {
    public final C51740MtP A00;
    public final String A01;

    public C42300IoO(C51740MtP c51740MtP, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c51740MtP;
        this.A01 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51740MtP c51740MtP;
        C42300IoO c42300IoO = (C42300IoO) obj;
        C51740MtP c51740MtP2 = this.A00;
        if (c42300IoO != null) {
            c51740MtP = c42300IoO.A00;
        } else {
            c51740MtP = null;
        }
        return C14360o3.A0K(c51740MtP2, c51740MtP);
    }
}
