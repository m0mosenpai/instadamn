package X;

import java.util.Map;

/* renamed from: X.IuG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42659IuG implements InterfaceC75123Zc {
    public Integer A00;
    public Integer A01;
    public int A02 = -1;
    public final Map A03;

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLI() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLj() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        return this.A02;
    }

    public C42659IuG() {
        Integer num = C05F.A00;
        this.A01 = num;
        this.A03 = AbstractC166987dD.A1I();
        this.A00 = num;
    }

    public final void A00(int i) {
        this.A02 = i;
    }
}
