package X;

import java.io.File;
import java.util.List;

/* renamed from: X.Utp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67634Utp extends AbstractC55776Opl {
    public final XES A00;
    public final C1125956n A01;
    public final /* synthetic */ C70168WEk A02;

    public C67634Utp(XES xes, C1125956n c1125956n, C70168WEk c70168WEk) {
        this.A02 = c70168WEk;
        this.A01 = c1125956n;
        this.A00 = xes;
    }

    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        this.A00.DEg(c70129W5q, obj);
    }

    @Override // X.XES
    public final void D6f(List list) {
        File file = ((C55176Odf) AbstractC166987dD.A16(list)).A0N;
        C70168WEk c70168WEk = this.A02;
        c70168WEk.A0E.put(this.A01, file);
    }
}
