package X;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AZT implements C8KT {
    public final int A00;

    public AZT(int i) {
        this.A00 = i;
    }

    @Override // X.C8KT
    public final void EmU(String str, String str2, Throwable th) {
        if (this.A00 != 0) {
            AbstractC12120kG.A0I("SceneUnderstandingResourceLoader", th, AbstractC167007dF.A0n("SceneUnderstandingResourceLoader", str2));
            return;
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("SceneUnderstandingResourceLoader", str2);
        AbstractC12120kG.A0I("SceneUnderstandingResourceLoader", null, A1G);
    }
}
