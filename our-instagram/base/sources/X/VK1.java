package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes11.dex */
public final class VK1 {
    public Context A00;
    public XC9 A01;
    public InterfaceC58019Po5 A02;
    public X9V A03;
    public InterfaceC58105PpU A04;
    public InterfaceC71895X9c A05;

    public final InterfaceC71998XEm A00(C70129W5q c70129W5q, C1125756l c1125756l, C69489VoC c69489VoC, XCA xca, ExecutorService executorService, boolean z) {
        boolean A1Q = c69489VoC.A0B.A1Q();
        File file = c1125756l.A04;
        if (file != null) {
            AbstractC50672MYq.A00(file.getPath(), "video/mp4", A1Q);
        }
        if (c1125756l.A01(A1Q)) {
            Context context = this.A00;
            XC9 xc9 = this.A01;
            xc9.getClass();
            return new WZZ(context, xc9, c69489VoC, xca);
        }
        Context context2 = this.A00;
        InterfaceC71895X9c interfaceC71895X9c = this.A05;
        return new C66045Tyh(context2, this.A02, c70129W5q, this.A03, this.A04, c69489VoC, xca, interfaceC71895X9c, executorService, z);
    }
}
