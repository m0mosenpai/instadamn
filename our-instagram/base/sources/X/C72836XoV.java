package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.XoV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72836XoV {
    public C72903Xqg A00;
    public final YMC A04;
    public final YRD A05;
    public final YM5 A06;
    public final C72843Xop A02 = new C72843Xop();
    public final C62960SZd A03 = new C62960SZd();
    public List A01 = AbstractC166987dD.A1E();

    public final void A00() {
        if (!this.A01.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            if (0 < this.A01.size()) {
                this.A01.get(0);
                throw AbstractC166987dD.A15("release");
            }
            this.A01 = A1E;
        }
    }

    public C72836XoV(YM5 ym5, C72903Xqg c72903Xqg, YMC ymc, YRD yrd) {
        this.A05 = yrd;
        this.A06 = ym5;
        this.A04 = ymc;
        this.A00 = c72903Xqg;
    }
}
