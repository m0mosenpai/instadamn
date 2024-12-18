package X;

/* renamed from: X.IoR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42303IoR implements InterfaceC66482zP {
    public final C1338462s A00;
    public final String A01;

    public C42303IoR(C1338462s c1338462s, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c1338462s;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C1338462s c1338462s;
        C42303IoR c42303IoR = (C42303IoR) obj;
        C1338462s c1338462s2 = this.A00;
        if (c42303IoR != null) {
            c1338462s = c42303IoR.A00;
        } else {
            c1338462s = null;
        }
        return C14360o3.A0K(c1338462s2, c1338462s);
    }
}
