package X;

import java.util.UUID;

/* renamed from: X.Iv3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42708Iv3 implements JPV {
    public final C5FT A00;
    public final C38321qM A01;
    public final int A02;
    public final String A03;

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return "";
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A07;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return Integer.valueOf(this.A02);
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0Y;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        byte[] bytes = this.A03.getBytes(C15W.A05);
        C14360o3.A07(bytes);
        return AbstractC166987dD.A19(UUID.nameUUIDFromBytes(bytes));
    }

    public C42708Iv3(C5FT c5ft, C38321qM c38321qM, String str, int i) {
        this.A03 = str;
        this.A00 = c5ft;
        this.A02 = i;
        this.A01 = c38321qM;
    }
}
