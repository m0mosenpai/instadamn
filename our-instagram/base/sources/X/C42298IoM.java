package X;

/* renamed from: X.IoM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42298IoM implements InterfaceC66482zP {
    public final C38687GzS A00;
    public final String A01;

    public C42298IoM(C38687GzS c38687GzS, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c38687GzS;
        this.A01 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38687GzS c38687GzS;
        C42298IoM c42298IoM = (C42298IoM) obj;
        C38687GzS c38687GzS2 = this.A00;
        if (c42298IoM != null) {
            c38687GzS = c42298IoM.A00;
        } else {
            c38687GzS = null;
        }
        return C14360o3.A0K(c38687GzS2, c38687GzS);
    }
}
