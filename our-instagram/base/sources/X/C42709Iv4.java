package X;

import java.util.UUID;

/* renamed from: X.Iv4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42709Iv4 implements JPV {
    public final long A00;
    public final C5FS A01;
    public final C38321qM A02;
    public final int A03;
    public final String A04;

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
        return C1XV.A08;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return Integer.valueOf(this.A03);
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0Y;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        byte[] bytes = this.A04.getBytes(C15W.A05);
        C14360o3.A07(bytes);
        return AbstractC166987dD.A19(UUID.nameUUIDFromBytes(bytes));
    }

    public C42709Iv4(C5FS c5fs, C38321qM c38321qM, String str, int i, long j) {
        this.A04 = str;
        this.A01 = c5fs;
        this.A02 = c38321qM;
        this.A03 = i;
        this.A00 = j;
    }
}
