package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Wqv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71266Wqv implements Runnable {
    public final /* synthetic */ W24 A00;

    public RunnableC71266Wqv(W24 w24) {
        this.A00 = w24;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W24 w24 = W24.A02;
        HashMap A1G = AbstractC166987dD.A1G();
        C66040Tyc c66040Tyc = C66040Tyc.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        c66040Tyc.A00.drainTo(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            C69640Vsh c69640Vsh = (C69640Vsh) it.next();
            String str = c69640Vsh.A00;
            if ("DEVICE_ID".equals(str)) {
                str = "";
            }
            String A0o = AbstractC58318PtA.A0o(Locale.ROOT, "%s_%s", Arrays.copyOf(new Object[]{str, c69640Vsh.A01}, 2));
            List A18 = MSW.A18(A0o, A1G);
            if (A18 == null) {
                A18 = AbstractC166987dD.A1E();
                A1G.put(A0o, A18);
            }
            A18.add(c69640Vsh.toString());
        }
        Iterator A14 = AbstractC166997dE.A14(A1G);
        if (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            A1K.getKey();
            A1K.getValue();
            C14360o3.A0F("folder");
            throw C00O.createAndThrow();
        }
    }
}
