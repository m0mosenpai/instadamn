package X;

import java.util.Map;

/* loaded from: classes7.dex */
public final class J5M implements Runnable {
    public final /* synthetic */ C39148HLb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public J5M(C39148HLb c39148HLb, String str, Map map) {
        this.A00 = c39148HLb;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1VN c1vn = C1VN.A00;
        if (c1vn != null) {
            C39148HLb c39148HLb = this.A00;
            c1vn.A00(c39148HLb.A05, c39148HLb.A06, this.A01, this.A02);
        }
    }
}
