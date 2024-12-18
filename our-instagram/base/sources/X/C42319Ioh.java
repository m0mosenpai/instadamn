package X;

/* renamed from: X.Ioh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42319Ioh implements InterfaceC66482zP {
    public final C51740MtP A00;
    public final IDR A01;
    public final String A02;

    public C42319Ioh(C51740MtP c51740MtP, IDR idr, String str) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = c51740MtP;
        this.A01 = idr;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51740MtP c51740MtP;
        C42319Ioh c42319Ioh = (C42319Ioh) obj;
        C51740MtP c51740MtP2 = this.A00;
        if (c42319Ioh != null) {
            c51740MtP = c42319Ioh.A00;
        } else {
            c51740MtP = null;
        }
        return C14360o3.A0K(c51740MtP2, c51740MtP);
    }
}
